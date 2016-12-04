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

public class coloaccesorios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncoloaccesorios1;
    Button btncoloaccesorios2;
    Button btncoloaccesorios3;
    TextView preciocoloaccesorios1;
    TextView preciocoloaccesorios2;
    TextView preciocoloaccesorios3;
    ImageView coloaccesorios1;
    String urlcoloaccesorios1 = "https://lh3.googleusercontent.com/WmZ3pawYDeJwO-SaIc3oERrtb1mXn4ysXUyAA2oXxjGqr6ikg2dq_Q6Bh3A-4zbNa2q5vTwGrz-SjtCmGousbVM0BozBHpp5g2ZXye3jrx6D9S77j7T44lCdC90w5Gk66iWz6ztigIrNuJ75LIpUTkRv2PtYh0va3i8KbDYOzsWi3BHE35TkApJev7HkJYuECWEmk-4NB0oj7uxeR5aATIJwBLkasbD3jKmaL-n7S81D3tPVdNt9HqXbu5AX1r95g-1ecz9UABahbRP0PU2gZJg5fBnnUxI_Q03cIL10rz4fXbLbtk6GUAWz1fci5MkuRtxIiQElC4nzsifz-BviaGSaAAXh9ZP3jm3jnptFNvmnJSM0izoOStWRbOSeqUHr-BMMxIhLEzpUR6ntdEt114rY1SD0yehSzkUyMNxSswzmzaXcNu2poy9HFfs43FZzswuC9mITaL48HqISjUJ3tCUTc5K8iDgMWuUY5VCOOM6mnPlssp3jmiJNtu6o6bATcV4mrfj1XcEXUh_68PoTM7lZhGSMNOKiQb_KU3oDMhUv5kbaxxC7vp9GmyADOI3Pd1WWUjj4gGcc6Feq4TQtw2Cv0G4cv0J8IpXKv9W0KniGbT7NUg=s450-no";
    ImageView coloaccesorios2;
    String urlcoloaccesorios2 = "https://lh3.googleusercontent.com/cUvi_L0iqFd-vBbMOwYoOCII7PaKO6viWL_SOAticACXtD3GtBOrfQkIFQeKxixZkLJcgKyohQs-1IbOZ60yvGHKwNMECH_ypZlRAutvtrzcE-f749aykGSf7XDRSLxsv_8pei4J1elAO_SbFYedGOyZrxr2mkbAp6HUOji0uGmB3aK_QBng6BS3VCUPEitkxwayZ5DOyJv2mgPvP2aCIwc243qdUdMU1FKvlQap3Bbb-dRdIylw8G2HMc42YZwioSGi7Qgz261qsR-rS-_664wy_LOjyWX6ljUhIKWuIkelI3PukF_HFZbyLUkKqB4EiLwfdu5r5Trf-WxHIh-7PYR8zaDxlABnFz1JAil_iF7xQNtKewmqKspX_vnvjPzccudtH4ON7DcCHclSsw84LfjhuxPPUmL4vUFpXhlZjRP6hSymQrGzoWDHZxSczRVFXtV8rgOszrS7MfLzdyvbR0ObmR_gumm8z6FsqlHyqh101gfpbABydqH1KvhqgtZipv3zGEJIePfUhwzd_L6scQsjOcIR0txuydpHApC7Woc2KHxNNp0gMerDlLP3DdkWzsBEVkSe50I6oF1vm6o3YYBiWBpsQepXEhfaWuF5hT9gmzdBYg=s450-no";
    ImageView coloaccesorios3;
    String urlcoloaccesorios3 = "https://lh3.googleusercontent.com/ITzRTTAuVtCYvBJ5qCeWQuQ9CJYFxdMBr65Yn-F-AX8sYe3dLXK6rzmPfy6mTjGEsLznYcbSpwIdgdh363SNhTgnFzat0gmkwHnoWLCI3fyg6AyvRq5eD5yhj8nHvOGMx37p9UlJRkyzuG8ZwyCHOHYujHPiSmMiNkm83FxF2aHlDqHps49sTQIcopmiCrY8bdnRepOEE1kRWyOE6o4aDqTx0l_tpI3LZME2beRINAxxnd2Q0gQlUqgT9h3l2eT0JiCwyQpe6UGuQWWf7xo5nli0U_Rtcn3EfCAJceIyU3ENPwEclKUfPgzXzVkkJxNDNO0h19fUBK26odbbMMrCyJM7c8MhIamn4ULIi4zHdvlOQiFjBiU1Cjye-nsXvppynlDd2_U5emL5eVZ0qmQTQr9H3-TG9Rmugxcmnsva2XiPHW6prlxRs5BrsnDtM0Z0UaxA8_ULvIDejU-9tia2FG5WvWruy8Wt_kRMm2kcubPhJXhwn4nvPRTby-EgilfO-XCNGs3TbZZp-eDjrI1PY15Ys5fFZmb8WX0NWXdUT1pOv0gf_f5UlYgL24E9bMMpvelrypW9eKDDEe5C0O2cjYeEXE8Bs7K2o9dkcRUjnqK-hN_9Sg=s450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloaccesorios);

        new preciocoloaccesoriosAsync().execute();

        preciocoloaccesorios1 = (TextView)findViewById(R.id.preciocoloaccesorios1);
        preciocoloaccesorios2 = (TextView)findViewById(R.id.preciocoloaccesorios2);
        preciocoloaccesorios3 = (TextView)findViewById(R.id.preciocoloaccesorios3);

        coloaccesorios1 = (ImageView)findViewById(R.id.coloaccesorios1);
        Picasso.with(this).load(urlcoloaccesorios1).into(coloaccesorios1);

        coloaccesorios2 = (ImageView)findViewById(R.id.coloaccesorios2);
        Picasso.with(this).load(urlcoloaccesorios2).into(coloaccesorios2);

        coloaccesorios3 = (ImageView)findViewById(R.id.coloaccesorios3);
        Picasso.with(this).load(urlcoloaccesorios3).into(coloaccesorios3);

        btncoloaccesorios1 = (Button)findViewById(R.id.btncoloaccesorios1);
        btncoloaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncoloaccesorios1 = new Intent(coloaccesorios.this, coloaccesorios1.class);
                startActivity(btncoloaccesorios1);
            }
        });

        btncoloaccesorios2 = (Button)findViewById(R.id.btncoloaccesorios2);
        btncoloaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncoloaccesorios2 = new Intent(coloaccesorios.this, coloaccesorios2.class);
                startActivity(btncoloaccesorios2);
            }
        });

        btncoloaccesorios3 = (Button)findViewById(R.id.btncoloaccesorios3);
        btncoloaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncoloaccesorios3 = new Intent(coloaccesorios.this, coloaccesorios3.class);
                startActivity(btncoloaccesorios3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(coloaccesorios.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(coloaccesorios.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciocoloaccesoriosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4f41d2747fe1f5d8ced5b687fb545274";
        String preciocoloaccesorios1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=aa1e55cb92e2deace448b2b5efa2ad2a";
        String preciocoloaccesorios2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d5eca7fdfc136d41ac2a9d3abf6c37ea";
        String preciocoloaccesorios3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciocoloaccesorios1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciocoloaccesorios2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciocoloaccesorios3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciocoloaccesorios1.setText(preciocoloaccesorios1st);
            preciocoloaccesorios2.setText(preciocoloaccesorios2st);
            preciocoloaccesorios3.setText(preciocoloaccesorios3st);
        }

    }
}
