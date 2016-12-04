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

public class nowybaneras extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnowybaneras1;
    Button btnnowybaneras2;
    Button btnnowybaneras3;
    TextView precionowybaneras1;
    TextView precionowybaneras2;
    TextView precionowybaneras3;
    ImageView nowybaneras1;
    String urlnowybaneras1 = "https://lh3.googleusercontent.com/JK1OUnwKY8p_TtNf_fIJqE6I9742gYSUm0cFXXLeo9hpcKPVT8x8fq5-3XYP8TcNYd9BwQ02vYjQyxnpvn8lhvRoblMiG465iQZABkvH4HYz9X3213myqUjiKQc9IbvrRAKAOXQ2SGMOP-O-DVmuQYhYlFLlM6EK7u-unCrZfb-lc5OuCHmesYvIGO3OpkAZwza4DCSoF0FlHQsOAasSlrg5xd1Qj2WMK----h5rxUwX_EKu-B6xnECPd97MDkbnXEDlLA1eQpBewhCbGGQoGMOnlShjxAOEIsqQKmkK--E1vrNYD_xG9YbCvUlZId6_uURbGJSLX3H6K10lSnIsAQlDsihdU6fDyYejaEYygTzdMIpMQy4Q0l3m32ZnMT4Jc62BNd3WAxPlUESbfcr9IcDRE97IVWqoPiSi1z8aAA0qEFP-SIf1AFCb_t4tCpYFbfPE1DJTPJ4i7FQ1LmKG06otws93S4xj8Ho7Aa-TnWqaukPFsE77r9Vnb3hWOiJM3fztB_hL0pqJOzVRzziEHarTOduqg5dvP2XIri9FqLpTGWGLwFcXK1b02mUC5BQGQWoBUP4PApkCTsN6k-0RMu2USwyi0D34yAUlFAmz6EwSx4Mr3w=w500-h317-no";
    ImageView nowybaneras2;
    String urlnowybaneras2 = "https://lh3.googleusercontent.com/pJdVsjE6cmzYGJsqrMSAZSyMvhP3w3JFNHU1ncImxfP9nZM_PKDqjrgl8-U9K_5pdJ9U3AvYsGyqXIpsjdGx3jG3eJXi0B1WuKV7VA2aIU4sN9rWjo9KFVFwB1xLdVuR9ma07KFehvl45C6PptNMQzze5Ku1QF9wKwAIVvoOOZPTNteZpKKs3omiDc984fjFEQD7TTzN7GazNOj2PBl81qGu-4_96rxdbTW6lrxE3B5g_tV5-2YP7zAR2IT_HGTDh1B-4CtAm9OIHSpsErsqxevAa_6twQbyU3tq22RgZiAbakeEgHo7t57QoRj7kwySTJgxrBVKdaqXhKUgoJhpCDBAC8salgioaVedkGAGbUf9D05Q44_yqmeWN50N2lNBxI2JWT5YAiiatu8IKOO1pjK70BkVfX18UlgLyX01ZRysn3Y-zJHqlecA-hLzlrjtFwxaAnew9hBInFSzwd5DUz-NJ1GCr9T_VV--BnERXdETwuplTKFwq5Xc402Bs-nQsORDsVChD7axV-UUT560v_EuOwoZEAUAyQVo5HvQsInKAxIFl8jST2Cm9ovL8aUh0rPsmBgCVdRuh-fgT3RjjwVdAtL4SETG6vcqpvzeriixolKSzQ=w448-h451-no";
    ImageView nowybaneras3;
    String urlnowybaneras3 = "https://lh3.googleusercontent.com/bHWgzniaT8s8XupoPvHk8QFtiTQ259l6cVx08NkW25i-yXvYgk45jPl90a003_sCw9wvZZiMA0XhmUgasC2AmJzrukU0XzgWoXaBfmspQbjPQ2h70FYV8mvyqWEU58iLyKfp0nnHCiVZoSiLmo72o5EBAuphQiZ09hj10LX97t8_u_5PC2EYDjGvoeTYRIUc6qlIjtbcZnd3CawAMB6GeAg3xoTcRP16KSqm8FeE8K065-WDkGFBUM6yg5eQh2U-JLN8IbXTv85WOYMj0IvyobFPhjfbFUc2hm665it-FlhnwLRmrU80tUdTV5ttAERUp9hr3JHwnSEEMTZ20K8ynrIgHZ8ClLn4E7E6jL2MqrLsQsjBt3ot5C1ZnUtYAg_m_tcFS_aOSDsY243EgpZ1lb7WwYnE5GLeP_PX8WJ3mFLVFqe9jMvjXUwF1OXEJQi82MZVagsfP_djzOkIyDT4yjSk1gmj01XGm8UEBEdwwFg5FtjgqJSKWcG2F4nc-7WWe_fXch5_7rR4QVkVHipzEig617M89pMoB3_rmohK98rTdcLnkoR4XQYMb2ZvBBaMJ5f1dHIHsoq2sS7W6IIRehgpgvzLE_EkqW3ayeuuqZQsXzTMmw=w448-h449-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowybaneras);

        new precionowybanerasAsync().execute();

        precionowybaneras1 = (TextView)findViewById(R.id.precionowybaneras1);
        precionowybaneras2 = (TextView)findViewById(R.id.precionowybaneras2);
        precionowybaneras3 = (TextView)findViewById(R.id.precionowybaneras3);

        nowybaneras1 = (ImageView)findViewById(R.id.nowybaneras1);
        Picasso.with(this).load(urlnowybaneras1).into(nowybaneras1);

        nowybaneras2 = (ImageView)findViewById(R.id.nowybaneras2);
        Picasso.with(this).load(urlnowybaneras2).into(nowybaneras2);

        nowybaneras3 = (ImageView)findViewById(R.id.nowybaneras3);
        Picasso.with(this).load(urlnowybaneras3).into(nowybaneras3);

        btnnowybaneras1 = (Button)findViewById(R.id.btnnowybaneras1);
        btnnowybaneras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowybaneras1 = new Intent(nowybaneras.this, nowybaneras1.class);
                startActivity(btnnowybaneras1);
            }
        });

        btnnowybaneras2 = (Button)findViewById(R.id.btnnowybaneras2);
        btnnowybaneras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowybaneras2 = new Intent(nowybaneras.this, nowybaneras2.class);
                startActivity(btnnowybaneras2);
            }
        });

        btnnowybaneras3 = (Button)findViewById(R.id.btnnowybaneras3);
        btnnowybaneras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowybaneras3 = new Intent(nowybaneras.this, nowybaneras3.class);
                startActivity(btnnowybaneras3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowybaneras.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowybaneras.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionowybanerasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7b791d8fac0c633de85609148bba67ea";
        String precionowybaneras1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=03e87afecf22127a2c2dba59b84a23e7";
        String precionowybaneras2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cc5a82ce1a8fb3e36fa89cb3a5f1e190";
        String precionowybaneras3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionowybaneras1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionowybaneras2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionowybaneras3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionowybaneras1.setText(precionowybaneras1st);
            precionowybaneras2.setText(precionowybaneras2st);
            precionowybaneras3.setText(precionowybaneras3st);
        }

    }
}
