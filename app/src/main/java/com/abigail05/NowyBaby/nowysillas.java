package com.abigail05.NowyBaby;

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

public class nowysillas extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnowysillas1;
    Button btnnowysillas2;
    TextView precionowysillas1;
    TextView precionowysillas2;
    ImageView nowysillas1;
    String urlnowysillas1 = "https://lh3.googleusercontent.com/12Lei0EJBMdRKpms5AS_bYpCfXPHBgD4GSEjby8_tp4d9W-e97plNoQ61DWaNO9UoWNdns2tKruIEqR1WtZTNRdnuSzo-IY5ZfU5zfaMZwxEVof10IzfY1u4bWAQYajFhx-s5IbFy1FZpnRu6AHReM5DMYHa9C7C_1PDIyy0u3Q9vM6ru_fPD4uc70kTGVn4XijFZIaNP4G7YDUmvyj7yUCl8M45Ovlww376-4igvYbfG2XMwWZhVNZBLSsSYRbS8iVEkMSeuCid_ubceEY0OzRn7VOOACVpR2myfEjXJg6KmcasiF8eMgaC_SRzYY1rw1uNPEZGBUX8neMutf-ySG8G8U4XqvLcwlBvNWteuX5Pae3f9v9zlvBbS1Lm1Iclx068pmppx6mZ_OQuiL6VmsxEUZZ1GYaGclbY-ONoAIzLO3DhgGL0a7022uccmRJP5WlXenLcAigSXZ3QWCpX9svFSQ2bvtGzNTk46Nd91u3ZrXmtOOsALyqH6F0eIiuldj6w1EeLXnjAYdZySm8GCo_1WmMiT_tMP2TP2S3CKN02P6d8m0SyaLPpGEIXSPoa-2OgaHCAZsczGd2dXudW-QtdSS-Qk8pIbVwelv_gP9NPu_8iPw=w492-h696-no";
    ImageView nowysillas2;
    String urlnowysillas2 = "https://lh3.googleusercontent.com/bj7qTdBZ1Isa5GWyhdpOWcJqJDyr1OmJg5CAWCf8mDgK29Cc1NKqtOMTGewWd2_FsU0XpVNJXNEXCO3DlxsPZPK8IaqjFt62wgY4MqehTXM5PsKq77lSJQNrWXDJPJ0niVz_beNqfhsDDFIQIYnuGAs2Sia_Dv-S2RroyR_evEniZhk9-HWZYHsd_MoMDTOK5YcwQe0Su_Tg0Ek2H6BKH4dFh20YRWLn0U3lOxo7XSSIjSJPW2Acds7VpZMWhts7QJWJSif5S7EPK29cYvzQNn_BH_zq2JFrxrqur1u0kgG873tzSOxKo9f7Qq4ssHob3mTGAtxGaKFKT5fUVzCKGI7U_oSlDwWeU3O0KtdTo6HcCGS0oBd7tcNpU9QloW5rd7OUlT5rNpfbw2IxFMwOuy59PCG-js7uQo5l_jcM3JcAaiVewvyIpelx0nTqEmB2m9hdWU095s4csm8KXToAvUfL_Ks6n_YcJwLRM__jqRIAZAgzZnOXpGL76mgkTINnz3mH8Gdv_B07uFbfpZpL0JqvfbOqWr5yn_rOIm3y2h3SHZeNP7IYF_UpRnoCtWeqBAqNNTfgZsRnBGDwsoQRVVr0yzLKjndPUM95ZWH4yB55iSVlXA=w632-h464-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowysillas);

        new nowysillas.precionowysillasAsync().execute();

        precionowysillas1 = (TextView)findViewById(R.id.precionowysillas1);
        precionowysillas2 = (TextView)findViewById(R.id.precionowysillas2);

        nowysillas1 = (ImageView)findViewById(R.id.nowysillas1);
        Picasso.with(this).load(urlnowysillas1).into(nowysillas1);

        nowysillas2 = (ImageView)findViewById(R.id.nowysillas2);
        Picasso.with(this).load(urlnowysillas2).into(nowysillas2);

        btnnowysillas1 = (Button)findViewById(R.id.btnnowysillas1);
        btnnowysillas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowysillas1 = new Intent(nowysillas.this, nowysillas1.class);
                startActivity(btnnowysillas1);
            }
        });

        btnnowysillas2 = (Button)findViewById(R.id.btnnowysillas2);
        btnnowysillas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowysillas2 = new Intent(nowysillas.this, nowysillas2.class);
                startActivity(btnnowysillas2);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowysillas.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowysillas.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionowysillasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0d48c40333e7ef6f5484a60f68772d31";
        String precionowysillas1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=13ff20de31d785ccf894ff800b24d887";
        String precionowysillas2st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionowysillas1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionowysillas2st = metapropoerty2.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionowysillas1.setText(precionowysillas1st);
            precionowysillas2.setText(precionowysillas2st);
        }

    }
}
