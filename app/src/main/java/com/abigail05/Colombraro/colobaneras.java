package com.abigail05.Colombraro;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class colobaneras extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncolobaneras1;
    Button btncolobaneras2;
    Button btncolobaneras3;
    TextView preciocolobaneras1;
    TextView preciocolobaneras2;
    TextView preciocolobaneras3;
    ImageView colobaneras1;
    String urlcolobaneras1 = "https://lh3.googleusercontent.com/yWbWb-yqflBZNgw349ix-dsPLQB0Z4eCm1NqcwG2uRTVvc-ID3S6LwBGwggitwkCtFbI1Qt59KZ58wB1ATjEQzocAC5gAf6FzeFNMrHPAAgJ9QMbUi78N68LoqqLgYSyQdpM1Kt2Z6YOnV8AGj70-GMDwbHEzrAcwPeAAlMHT5eTd5TFYq4M7oyqE_JK4tQMEXEFWx7MWlrNtm0AKD-WM3bxiyuM86urMi09mjrhtfONFL6j1XwuKaK3GRqJ89kFnlUVlsttwt0RmwmWYVRG9kD9HbaDFwyNGjBMChvr8Ygwo8Y9USiaYkamlWb_OTQmRqEMgMJsk9Xns8Ule6-Q4q4VzoC9_TCf1STyM7AZMVC_dSm3MR3GUe1S--2NCO3uD0E62QkvXAHKl-i-mu-0Me-jCUhcYkv8zBuKs3Z32slwpy_-7kl3_SwS_fChPcoe1NKbYPMEtP0L_XjBqauimo9YwS1EnUQ3gcd_JHuWOHumcKUzTb4Gb_dMg_wZP1zD9kX2i0UIBFubcSaK4g6uM3YEx2tkByxjFpSbGtzdOfJaaYIPwkOqXp5zClkED6v4S_1F2Mv6YFwOPkcez11r18WbaK-0Q1Q33gdZ4nDopTN8kqOzgg=s512-no";
    ImageView colobaneras2;
    String urlcolobaneras2 = "https://lh3.googleusercontent.com/_-53jBaxz4xYnLIFNg9uPu-y_xhqGeWywWUJqPH81LEwMovhEG_rUAwEsUqsngQH1rn-Ix7WD8v4QgXedyzSxytSEWVtR_KeDc8bjmllmW4s5OjgiMNbqXGfPl3anZdk772hnBiTZRWdhYVSP5XAh4Km6mi4zWRRiN3utk2QMxwQF8vg1eVqlyUHBimdwHX8YPXoJDI69q-57vUoN9oooytb3wsfkqmnzztpVuR8_VdUUJSMZEBP_AsF-YWH2zRyv2cRrkPp9NgaRLvrFXlXck4irs3pV5P75HeCH1697-RUqLb4lDm-meVZ9s_IkxBUoNo5edZ7awrIPHwkBa97dB0JwUu-jnxBIeSMPo4SYjicQwjIZIlLH9QjEkN6NMmIJRT-7l5Nxw2smybaFkxkytSOWuaclBg0Ka4oBLWeFWKfYfflG02ojkK5QxnceYBk-qCLbdHU4W-aGqZTzVKCQdJVfh2neDMVJktIajAyJtK_mhUBJ0pcpUl36KcuyITbx1g1A08X9xhn_kj3nA4EUczwtIUPjnRUkioshAfNlG-GuXERyZn5Bxo1L5eWEZW-BbTeddq67K7JDhPhr0EKRuikXxK57Lwkz3zCp0KFDTLFUKQuFw=w512-h509-no";
    ImageView colobaneras3;
    String urlcolobaneras3 = "https://lh3.googleusercontent.com/UjjVdFtVYpQ6ymc6pZ3xJLtRMW_64ah0AXq5fIoDZZsP1BVuZZwc9eExzSEvBvwXJBX9l_2SC5inhVwM5FYMoml0SPjCxaZx9rTArqMn3naNn4sltv_1S2lNrD_12QGCwCNRD3ra0CYvGiMZcLQ1WPKxdgNeQV1dPs1PeRk8dgjuUFXGC1KN8ZY3q0TfhhQ3LtK2Z-C-5S0EQLL7gRLEsCsxXzEp6rkt8X8uGvIWTRpHWGIOfbe2TjjpgZv8Gi3pPBKZJackGhAd84__nl2GQE_uUx15c9MkcippG3DytxQakV57gfuOQwqInfJVEWxYnZxeyptgVkhTdylOlBLdemWHYyPBwymNAheS6NuQAFE86A-UAnFUJCuvJDpJk3KvFyl1dDN-qToblLgzvysHurnRAaD6Zy3xOsDjMRwYxv3YAihIZLe6LOq83tsg4P7uOc6zKwacrYgOMaD2I3mnzHklAjMB50DWo3R2qGCinf3szDB6YoWdqEQ59d2ZqAQo0OzDIoYxByKER7Ay2X_dc0eW9Mtjsrvyutt-uu_bK9ESZDGeFu9NHj_9V9xQxHyETsd3lOdFxGWKm3xTVUbnOR4SdWyD_0OHN60a0saIJEjhHSgleg=w512-h508-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colobaneras);

        new preciocolobanerasAsync().execute();

        preciocolobaneras1 = (TextView)findViewById(R.id.preciocolobaneras1);
        preciocolobaneras2 = (TextView)findViewById(R.id.preciocolobaneras2);
        preciocolobaneras3 = (TextView)findViewById(R.id.preciocolobaneras3);

        colobaneras1 = (ImageView)findViewById(R.id.colobaneras1);
        Picasso.with(this).load(urlcolobaneras1).into(colobaneras1);

        colobaneras2 = (ImageView)findViewById(R.id.colobaneras2);
        Picasso.with(this).load(urlcolobaneras2).into(colobaneras2);

        colobaneras3 = (ImageView)findViewById(R.id.colobaneras3);
        Picasso.with(this).load(urlcolobaneras3).into(colobaneras3);

        btncolobaneras1 = (Button)findViewById(R.id.btncolobaneras1);
        btncolobaneras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncolobaneras1 = new Intent(colobaneras.this, colobaneras1.class);
                startActivity(btncolobaneras1);
            }
        });

        btncolobaneras2 = (Button)findViewById(R.id.btncolobaneras2);
        btncolobaneras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncolobaneras2 = new Intent(colobaneras.this, colobaneras2.class);
                startActivity(btncolobaneras2);
            }
        });

        btncolobaneras3 = (Button)findViewById(R.id.btncolobaneras3);
        btncolobaneras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncolobaneras3 = new Intent(colobaneras.this, colobaneras3.class);
                startActivity(btncolobaneras3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(colobaneras.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(colobaneras.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciocolobanerasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4f1a744d7e138efb28ca87e20df675d8";
        String preciocolobaneras1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=314e9954b530ef651e63cf0fb9f13daa";
        String preciocolobaneras2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=635031a46b3ab007375bef8acf4769f6";
        String preciocolobaneras3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciocolobaneras1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciocolobaneras2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciocolobaneras3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciocolobaneras1.setText(preciocolobaneras1st);
            preciocolobaneras2.setText(preciocolobaneras2st);
            preciocolobaneras3.setText(preciocolobaneras3st);
        }

    }
}
