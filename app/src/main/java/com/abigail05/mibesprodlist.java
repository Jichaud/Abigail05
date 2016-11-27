package com.abigail05;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class mibesprodlist extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btnmibes1;
    Button btnmibes2;
    ImageView mibes1;
    String urlmibes1 = "https://lh3.googleusercontent.com/-DSKLh-hHAGnzlAkWyO5lEf2DRTUw-YhhGU9IymbIourye2rYqTQfpfnhJeoqSehWFFBthXgOgk=w432-h360-no";
    TextView preciomibes1;
    ImageView mibes2;
    String urlmibes2 = "https://lh3.googleusercontent.com/-Ft0ZsLR3kXYSyQtohhmK_37d4ThvoR-ZClrw5pTMiDF8NQRhfJpc2WVg3rnP50b5kmhmZY2djYPFcDyrrUU8k72hL4l8bfpoto77wTYAVtO1L4JDx9AGX-NLtthFtmu2EQHGHutyLMRKHxGNU63tSNkoo8GY-pBbl8mCZKqZoYqK4h93Qju5KifANxR3_uryYr_guRQD2vSchIdjgdAMz9npo07Xp9Mm6-4Q9kEuTkV7YNe0vOcf7W0SDrFNEckLITKw3XDVvOaKj8x7rWyJnaQRdfRP2UOGK2BPPXgY-ap67kTD5JlGnzCcs7Fa8gdnaFy8AOALEwDBRV7BNia52Az0X-eSuzaDrX0-KsLh3zEDh6C4kn_qhHA2MZiqd1aseLjc_H-Nr0flbg2pmC9zBS6Uib2qJ0qrvvsZ9GfNaviADw5v79vDHEIZvD8Ty4UhgJ-8Ae5Wxx_Mq837pV248B73T-jjZkbvCT_co-3jKa4FacDvkZOGWY4LGpGbvmWjbmrLLV3v-m_WvZ3HarcBh2S957wQRGOtTHqZMoO8_-mb44EC4NHrXQvrjOjnFZmxxBNqW4oh_FhLMIQq_fme0p9EHo0Gvya2JYRy8kSoSi9R9HPIg=w440-h409-no";
    TextView preciomibes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesprodlist);

        new preciomibesAsync().execute();

        preciomibes1 = (TextView) findViewById(R.id.preciomibes1);
        preciomibes2 = (TextView)findViewById(R.id.preciomibes2);

        mibes1 = (ImageView) findViewById(R.id.mibes1);
        Picasso.with(this).load(urlmibes1).into(mibes1);

        mibes2 = (ImageView)findViewById(R.id.mibes2);
        Picasso.with(this).load(urlmibes2).into(mibes2);

        btnmibes1 = (Button)findViewById(R.id.btnmibes1);
        btnmibes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibes1 = new Intent(mibesprodlist.this, mibes1.class);
                startActivity(btnmibes1);
            }
        });

        btnmibes2 = (Button)findViewById(R.id.btnmibes2);
        btnmibes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibes2 = new Intent(mibesprodlist.this, mibes2.class);
                startActivity(btnmibes2);
            }
        });

        producto = (Button) findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciomibesAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ea77810ea709eee5b1de76df0a4ca5cf";
        String preciomibes1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d1bce4a217de52b4d27b15d06a925199";
        String preciomibes2st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciomibes1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciomibes2st = metapropoerty2.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciomibes1.setText(preciomibes1st);
            preciomibes2.setText(preciomibes2st);
        }

    }
}