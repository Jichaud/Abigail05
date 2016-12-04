package com.abigail05.Ergolastic;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.Nuby.nubyaccesorios;
import com.abigail05.Nuby.nubyprodlist;
import com.abigail05.Nuby.nubyvasos;
import com.abigail05.Nuby.nubyvasos1;
import com.abigail05.Nuby.nubyvasos2;
import com.abigail05.Nuby.nubyvasos3;
import com.abigail05.Nuby.nubyvasos4;
import com.abigail05.Nuby.nubyvasos5;
import com.abigail05.Nuby.nubyvasos6;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ergolasticprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnergolastic1;
    Button btnergolastic2;
    TextView precioergolastic1;
    TextView precioergolastic2;
    ImageView ergolastic1;
    String urlergolastic1 = "https://lh3.googleusercontent.com/uhMxEPhdEeqoS9wy1_QUyFUoXHTIVWVhtThVN7h-1UpRIu9VeXs8zdSWiFmi1IOcaIgF1D4KvaOjHE78muPfNMVfLF6Lojqfenf5J8Z1PTjtGtqvpaT0Tsx5F8bebFMrql833cGBBm355MnCd-bldd1fPMLoJomtCpi0oa8xB-3SeQonpb1kGqjbyWQ3LsdMyKOLrfGFTKGIzNy1DRqs5KYMHD1YY_LGhAi2aomlL_RHY75clO1pGJ_O2glrb672ne4G2aujeV2eOGvBoEUWCCW3iWpEpsGZwz-XcY36VO0qCbfjCEHwKrLv8EV8we7vl_9mcw0L5j5anncvhSellVnSa9xQsAv0FE_1QMU9K5ntqSXi_lu93mjsr_uY9ZF_S_gu-9cVWAB4O530jB1MIx2LZRr0C6JYKdzQwqVvX6c2TVQ-BpfpHAusMFpajLSHXfrdn0MCq0Lb261Qsr1RwHwOYmb-OzBwhzbOsN3NzjpgA-NfOgJtanqqgbk4VFg9TV-dFMbcAGF8Q7FQeDn5cK5V_R4WnEGM2y6kjjEPna4gBgnS-_H9uF0x5dzGkkXW3SbWMsO1VPK2jyColA1nBxMVxs4yk0OR0F_2gTaNSmNrpv3cww=s600-no";
    ImageView ergolastic2;
    String urlergolastic2 = "https://lh3.googleusercontent.com/NMHJEbbjvQv7Tr8Ne_D-bbG_-a4PhU3v70Dp4QhLedd5CYqFHUXLgsCW9x23aw-zJBEIGv6dxx2JVmq6DtiXRQAOw7oTQjrrFADyW8ait39qH3CAi-CHGSt8-Ki0m8jcKm03JNEBjX_6om7KitySH682xnxZmqLGiObNp20S6oiQEd53nHzkXVYJ9xgUqcEp8iVNsGVv3Y-O8jnWzXdZvS_Po8LLS7URx2Y0xukUdBU2CTAI-KgJYHGkMlLHHaiNzAZmlpOP_fTNukFusrOSzOi14RDLZ2U3I6U1RmE2jFUsz0rS5gMGJxEsFk3oXxNP-XLq1LC4biUn-HWW_vOjtzKh-JMcCj2ZIz7bIjZt5VRryRlRJ4N06JMDDfSxXjFL-ovQGegIjWfBaEIgaVzD-CtqqUTZXlDu4se1REdBq4BM3OH5H47ScNPI3Cthckk24QJa8LsrCbpQUKx9tJngr5wdvaZuU4ZKTSab0nUoIoBYqVev8obpX7OLxouXonRbh56N958O42fSJTo8AzE_Vyk_SflZ3zz_l9usjYunfbeAzBYCuZlr2Bq36uPSv-p3tdyAeXhmzTbuRi54F6Yn8v6wf824rP18ZGiwgm2cdG99qc2dHg=s600-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ergolasticprodlist);

        new precioergolasticAsync().execute();

        precioergolastic1 = (TextView)findViewById(R.id.precioergolasticpre);
        precioergolastic2 = (TextView)findViewById(R.id.precioergolasticpos);

        ergolastic1 = (ImageView)findViewById(R.id.ergolasticpre);
        Picasso.with(this).load(urlergolastic1).into(ergolastic1);

        ergolastic2 = (ImageView)findViewById(R.id.ergolasticpos);
        Picasso.with(this).load(urlergolastic2).into(ergolastic2);

        btnergolastic1 = (Button)findViewById(R.id.btnergolasticpre);
        btnergolastic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnergolastic1 = new Intent(ergolasticprodlist.this, ergolastic1.class);
                startActivity(btnergolastic1);
            }
        });

        btnergolastic2 = (Button)findViewById(R.id.btnergolasticpos);
        btnergolastic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnergolastic2 = new Intent(ergolasticprodlist.this, ergolastic2.class);
                startActivity(btnergolastic2);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(ergolasticprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ergolasticprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precioergolasticAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5344d8c6ae47cf3b7a2339a4eda5f629";
        String precioergolastic1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e8e4e9607751c3bce51677f6d7d0b7e9";
        String precioergolastic2st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precioergolastic1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precioergolastic2st = metapropoerty2.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precioergolastic1.setText(precioergolastic1st);
            precioergolastic2.setText(precioergolastic2st);
        }

    }
}
