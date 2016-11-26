package com.abigail05;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    ImageView mibes1;
    String urlmibes1 = "https://lh3.googleusercontent.com/-DSKLh-hHAGnzlAkWyO5lEf2DRTUw-YhhGU9IymbIourye2rYqTQfpfnhJeoqSehWFFBthXgOgk=w432-h360-no";
    TextView preciomibes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesprodlist);

        new preciomibesAsync().execute();

        preciomibes1 = (TextView) findViewById(R.id.preciomibes1);

        mibes1 = (ImageView) findViewById(R.id.mibes1);
        Picasso.with(this).load(urlmibes1).into(mibes1);

        btnmibes1 = (Button)findViewById(R.id.btnmibes1);
        btnmibes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibes1 = new Intent(mibesprodlist.this, mibes1.class);
                startActivity(btnmibes1);
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

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciomibes1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciomibes1.setText(preciomibes1st);
        }

    }
}