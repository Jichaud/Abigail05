package com.abigail05.Chicco;

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

public class chiccosilla extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnchiccosilla1;
    Button btnchiccosilla2;
    Button btnchiccosilla3;
    TextView preciochiccosilla1;
    TextView preciochiccosilla2;
    TextView preciochiccosilla3;
    ImageView chiccosilla1;
    String urlchiccosilla1 = "https://lh3.googleusercontent.com/mLJVb0kVJpgpxIS-kq9IdtGETI3BJ5DPlgMAqh34kfGWBhpKb44mF3NL6cl1OC1rubxmQdW-f-N2TYkRMO68ZaGYQhug-JDp_2N2m1kCSJ8w_ndoHs1qRoMYINvSXRq5oS48OSj4GvEH73ueltpp6njF1X-4HC7ql48hlOLaJ41kLZttaBnAOW8A6PrtQuK8C21O5All48_P27eaflXgkNBJaN5XZgefwcp5hEWjdY2UMYfLXJzxB6SzT_bYO0CwK6vg-ebu0Q3NzpYVcPLVpC_NOElJFY3MEmtwOOJKGcPOA0aWNJwXBH820fJnsHG1aFU2l5q45MonmkDQruziX5nwb6d8pcmKRt2-OYGC79scnSYoO3kVOwgmDyycGa3fmY4vR5z5AtCb7SrToOLuugImZJSHJrTvnEXbiNCGrVjyqPyhFqbZ1oyFb0KP-Oi2sBP9OLrGobfIm9e1td25MXw4x3144IdlaTCrpxStvQUlOc-Iq49U7PkAHj0Ws0roaV1Qu4E7JwESt0vBnmcFw8tqMPueMOQsc3kvovS5lTdXRcsuspDAVRHYyjxS8ZysSphZaZ334tlEKchn9E9UFhiJTndbhN2_CDMWlch2E76L74ctgg=s725-no";
    ImageView chiccosilla2;
    String urlchiccosilla2 = "https://lh3.googleusercontent.com/2QZ44SS2xHspmqhNfGY7q56SVoLk0hK4zWeKsEb-txlVnRp_og3obE_yxoOMFf0PQDtCm70yENhg53jSeU9dndl59Ss8HaXuFXU8zN3F6OiSOLx6S8_UY_TDu0DNJ5TIMEt6Jg0vlElTaTIGcrNEmQFNhWmwYoMVxTzgrGXi2VhKJ1RqyiUNJTZGeaiW2zwpfoQ8CnG3-EjOEwSBbHI7GBKFS62AEVchIrB157sZMWSB8T_Y8AXWTP5hBC2yYgL1enAiLtvpvvep8OuD7iKqNBO9wuZ81BIoUo7QZSqAqJyI2U0GTGtQGslwJIEkv1GunBDWQkr5ODys907RwrJcT1c2Kw9bF3m0RXO2pmgcezJ8T4SiiJtnpfL7cWHJsQdV6wz0cBuTv5xRT2aDNWizOusF66cqu1ga7BCF-ehTq660bXaJlLl4kQYXlFvgtXmCaILr0T98YjS7O4-pkYhaJiN9wOsfRxNZTFVSL6JKcBJPDZk3sNUKvPFkKWWwN9dbv5gYci-1I2somkTgRf09H-xR5uNmbc-PXsITZ8Xwu9ZtnsirybcAk-ORQsBQWahVpVdUpLRAuQiZXmpr_B_aaJvKe7j_4hBKnSTL6sX57_1pVTsssw=s725-no";
    ImageView chiccosilla3;
    String urlchiccosilla3 = "https://lh3.googleusercontent.com/vhKS5eaFlpmgkqAH5FKnFPk9QBk3pWvApTgVPZMNBuxAdu3CvSX2_-i7nPhUT9fJ2pbGIhxlkLQNubV1PIIfucvwB48JOvwcvJWcYTuo91BytC-cEYlio0hV6kJIR21Yf9Q8MJYerXSmqG6Wz-KIe4fj-tbpDNSRm4k0UCXLVFkpdW_dSesfg0x9D0vHyWCfGH7lTDpcKmhfwqBJIMF-HTvLAqUDWAk1vHS59ADU_Yw0Q08921SoP7M-gXqUwKMvFyYWajGErhJQySEPxWvVBbLpWKCnktqRNt9u8tMyabhfEIntMYjQojNxUX3Phk3w3NFukrte0DPOXj5eANE4qWlrZmV4bCU263fnPliBxFMHzNgda-o7NagSB1zhbNBMvX8XUxLxLDDj0jp1uALuk4rz44WCAZgTJvBbNW2LI8iD_ybmtiMueOqBdfwf56HuqjBvDqHJCyrz6eGaduFDyp60FcqWhkSkaX-q2UIDKQWz7y_D2hrxrMcgI7p_oXHyjbYwCQg9wCWlLysESTmRu604vEw_jLugfIj9ZbIUKfy4I1nY2l_dHeZU61b_uifXiOZfewnntL0yKITCRe6mU01dmNZSaLZzxTMpYSRdUEXyTUWaUw=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccosilla);

        new preciochiccosillaAsync().execute();

        preciochiccosilla1 = (TextView)findViewById(R.id.preciochiccosilla1);
        preciochiccosilla2 = (TextView)findViewById(R.id.preciochiccosilla2);
        preciochiccosilla3 = (TextView)findViewById(R.id.preciochiccosilla3);

        chiccosilla1 = (ImageView)findViewById(R.id.chiccosilla1);
        Picasso.with(this).load(urlchiccosilla1).into(chiccosilla1);

        chiccosilla2 = (ImageView)findViewById(R.id.chiccosilla2);
        Picasso.with(this).load(urlchiccosilla2).into(chiccosilla2);

        chiccosilla3 = (ImageView)findViewById(R.id.chiccosilla3);
        Picasso.with(this).load(urlchiccosilla3).into(chiccosilla3);

        btnchiccosilla1 = (Button)findViewById(R.id.btnchiccosilla1);
        btnchiccosilla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccosilla1 = new Intent(chiccosilla.this, chiccosilla1.class);
                startActivity(btnchiccosilla1);
            }
        });

        btnchiccosilla2 = (Button)findViewById(R.id.btnchiccosilla2);
        btnchiccosilla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccosilla2 = new Intent(chiccosilla.this, chiccosilla2.class);
                startActivity(btnchiccosilla2);
            }
        });

        btnchiccosilla3 = (Button)findViewById(R.id.btnchiccosilla3);
        btnchiccosilla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccosilla3 = new Intent(chiccosilla.this, chiccosilla3.class);
                startActivity(btnchiccosilla3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccosilla.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccosilla.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccosillaAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dc8e0e7f706a32b1ec845fae43f4d75e";
        String preciochiccosilla1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=665704c02c1c8de8f4bc63449bc514eb";
        String preciochiccosilla2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=80ca084e8fbdf7083ba40220f912223f";
        String preciochiccosilla3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccosilla1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccosilla2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccosilla3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccosilla1.setText(preciochiccosilla1st);
            preciochiccosilla2.setText(preciochiccosilla2st);
            preciochiccosilla3.setText(preciochiccosilla3st);
        }

    }
}
