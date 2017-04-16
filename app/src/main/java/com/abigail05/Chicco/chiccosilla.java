package com.abigail05.Chicco;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class chiccosilla extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccosilla1;
    Button btnconsultaa1;
    TextView txtchiccosilla1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dc8e0e7f706a32b1ec845fae43f4d75e";
    ImageView chiccosilla1a1;
    Button btncomprachiccosilla2;
    Button btnconsultaa2;
    TextView txtchiccosilla2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=665704c02c1c8de8f4bc63449bc514eb";
    ImageView chiccosilla2a2;
    Button btncomprachiccosilla3;
    Button btnconsultaa3;
    TextView txtchiccosilla3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=80ca084e8fbdf7083ba40220f912223f";
    ImageView chiccosilla3a3;
    Switch switch1;
    Switch switch2;
    Switch switch3;
    LinearLayout lineara1;
    LinearLayout lineara2;
    LinearLayout lineara3;
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

        /* chicco silla 1 */

        chiccosilla1a1 = (ImageView)findViewById(R.id.chiccosilla1a1);
        Picasso.with(this).load(urlchiccosilla1).into(chiccosilla1a1);

        txtchiccosilla1a1 = (TextView)findViewById(R.id.txtchiccosilla1a1);
        final String stconsultaa1 = txtchiccosilla1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(chiccosilla.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });


        btncomprachiccosilla1 = (Button)findViewById(R.id.btncomprachiccosilla1);
        btncomprachiccosilla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccosilla1 = new Intent(chiccosilla.this,webview.class);
                btncomprachiccosilla1.putExtra("string", urlcomboa1);
                startActivity(btncomprachiccosilla1);
            }
        });

        lineara1 = (LinearLayout)findViewById(R.id.lineara1);

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()) {
                    lineara1.setVisibility(View.VISIBLE);
                } else {
                    lineara1.setVisibility(View.GONE);
                }

            }
        });

        /* chicco silla 2 */

        chiccosilla2a2 = (ImageView)findViewById(R.id.chiccosilla2a2);
        Picasso.with(this).load(urlchiccosilla2).into(chiccosilla2a2);

        txtchiccosilla2a2 = (TextView)findViewById(R.id.txtchiccosilla2a2);
        final String stconsultaa2 = txtchiccosilla2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(chiccosilla.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncomprachiccosilla2 = (Button)findViewById(R.id.btncomprachiccosilla2);
        btncomprachiccosilla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccosilla2 = new Intent(chiccosilla.this,webview.class);
                btncomprachiccosilla2.putExtra("string", urlcomboa2);
                startActivity(btncomprachiccosilla2);
            }
        });

        lineara2 = (LinearLayout)findViewById(R.id.lineara2);

        switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setChecked(false);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch2.isChecked()) {
                    lineara2.setVisibility(View.VISIBLE);
                } else {
                    lineara2.setVisibility(View.GONE);
                }

            }
        });

        /* chicco silla 3 */

        chiccosilla3a3 = (ImageView)findViewById(R.id.chiccosilla3a3);
        Picasso.with(this).load(urlchiccosilla3).into(chiccosilla3a3);

        txtchiccosilla3a3 = (TextView)findViewById(R.id.txtchiccosilla3a3);
        final String stconsultaa3 = txtchiccosilla3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(chiccosilla.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncomprachiccosilla3 = (Button)findViewById(R.id.btncomprachiccosilla3);
        btncomprachiccosilla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccosilla3 = new Intent(chiccosilla.this,webview.class);
                btncomprachiccosilla3.putExtra("string", urlcomboa3);
                startActivity(btncomprachiccosilla3);
            }
        });

        lineara3 = (LinearLayout)findViewById(R.id.lineara3);

        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setChecked(false);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch3.isChecked()) {
                    lineara3.setVisibility(View.VISIBLE);
                } else {
                    lineara3.setVisibility(View.GONE);
                }

            }
        });


        preciochiccosilla1 = (TextView)findViewById(R.id.preciochiccosilla1);
        preciochiccosilla2 = (TextView)findViewById(R.id.preciochiccosilla2);
        preciochiccosilla3 = (TextView)findViewById(R.id.preciochiccosilla3);

        chiccosilla1 = (ImageView)findViewById(R.id.chiccosilla1);
        Picasso.with(this).load(urlchiccosilla1).into(chiccosilla1);

        chiccosilla2 = (ImageView)findViewById(R.id.chiccosilla2);
        Picasso.with(this).load(urlchiccosilla2).into(chiccosilla2);

        chiccosilla3 = (ImageView)findViewById(R.id.chiccosilla3);
        Picasso.with(this).load(urlchiccosilla3).into(chiccosilla3);

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
