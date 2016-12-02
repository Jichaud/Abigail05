package com.abigail05.NUK;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nukhigiene extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnukhigiene1;
    Button btnnukhigiene2;
    Button btnnukhigiene3;
    Button btnnukhigiene4;
    Button btnnukhigiene5;
    TextView precionukhigiene1;
    TextView precionukhigiene2;
    TextView precionukhigiene3;
    TextView precionukhigiene4;
    TextView precionukhigiene5;
    ImageView nukhigiene1;
    String urlnukhigiene1 = "https://lh3.googleusercontent.com/iHGOWl_Ch-7XO5gIDnh3urbKpjgpEhblaO5hELZ-hAU5uuSCtz0lRlVwVizDeV4TOYmd1wnLxVxuyNxnKMwrRZtTXgxVTf0F9hQM9Un-GNsTtfqAqo5bdfukkY056aYevJnzeCOIZ4mB9MNSDV8NUTR_HLvTV52SfYUhPusNTZtKqNRsNWt578psygXPiRrbUORB_EIL8dWJEPJ7zZ6ZzEJU6zVrx09vx6O9iBAFn8J3qxrvRUXajTZm2QlsEb-N3-WjBbrd3mr5I36ilNVHrrWf0qQ1iqc7bUY4te7WKStXN7Hn38iEe-DUGuC1JJm-6TnjQ8Qnt-uXiqLuyQpmw9retbURAovNsKmyokclhB7FPgvY6k_RgY_6Eg2OvxcUXmyXWLsNLE3cPsT7IYMUMIhlzy3z_PZ08sip6aGdz5ENa-CwCmQazKzHEiikx6GNkgoc0ZWdJ3K5yzP1dKRlv5sKk74OMMRLYSKKFLgbV-be0NvTKhqh5RRfNLyOV7Q1Tr9yiyRazAUguON6eEjhZy73bP76jepK8RhZjHlp7oo2jSWeS6kk6uKoaewc4f_O_DCln4H4mWTlki2rMd704Tb8i7O6LD3HqPMsnoa6w8OQJvmH4Q=w480-h253-no";
    ImageView nukhigiene2;
    String urlnukhigiene2 = "https://lh3.googleusercontent.com/BE24K6OroGkF3KlvT5tOMjEnycpSlDGzjGd9mhmNIikDUfgB_gpCyabHtmLnCQbCS_cdBYEVeP0fMhF3r2dfxSJsiOUiAWMWsuM2KdOO1FBEpKKFxGPpGM8xDxc69H_fTtE3buL9Xk2W18V3k1pHX85UNwcb9VHXoNRfGuybwhhbRsAfx-Lfe_tLApxtCUnz3FZh56k1vj8Gm21Yn67d-lxQFwpO9zlR24Pp3hEtERzFsGlL7dY1yFnAoha0qMR6kaZHHiX_4OBh6A0LNJHLeZWRn40njwn-zoybpc2FHA1LXr_zbAE4wRFV9W8TOfRTaSqNxZxyfkT0Wkc500VlllOpbx3VQ6XMgcudmkFlTNeMvx30_yRB8nHKSOU3Z6mr4NO7NeOI52iNBjBIvQOQbJ2EfNJ2WQ21A76rEDE4O5hICfMYAmfDhEWUUx0sSKCev4cZ3rFSoBjPKzPT9wNcFQBgtGZo8ZE_Rf89ZDG1S9ngQHr3kC2djGNAl-N24lzAIoYz1WkFpXBlO4X31N8rDBwR318wcDn_HmGvb68HO0x1GM9kLqpO8C2CXSVpHN_TqguR2rTLjHtyo_1CnxlKRPtCRdffbFdXSf9WhGIHjStl_Lj7Hg=w484-h365-no";
    ImageView nukhigiene3;
    String urlnukhigiene3 = "https://lh3.googleusercontent.com/Ep62l4aumCAKKhuuDnvkFdMCMsgim7oIGluBF-_PwU12g6PkLEjtaHulxtL_TOghD1z4aoasD4AUPN6m5GEvQXVwFtY2J4UveC3AZUtdQPwKvURnSpywXvRJ8I6JX-pBlxtFk8GYg4fCRPkavPXXBC0fSaI0jhMDKehfB2aUzf44EMIATy_5pAbDn-1ULIX43UJOqZm5y0xAP_HYfFBulZojUR736hx9n_5TSNBnT1SCx6WlENbndeTxnJCZmPZMeVxeJoDOQPT2a4D0ZV7ru6DPXxh5n2cG2kGFqYaKW2Imx6Zj4X1XmCvK-N-U30VUjtUQTfFn7rcl38CWn6n6g3QIdPGhiyQlKkiYi-cYG-OA7UX0KooXN2faNa7SHUfOA9un3eIl5NNWTzWR2OV4pvYaIujuy3_2kMAmu_nMVNQWCQW_NSYnY86iF05DKpdeDhJLY-v_RMHt1hkaS0_y6hWHBDxzS3yo3gCRCEO_BkOL_foWpkkMYRcl2K66EE6ZAXl1ccD5MkP6XMCqYFWyQ1KClwlON5kElJ6s9dFTwfCsDko88ZGp5UuszokgfPAHPYYgQbnbTt1S9e7ePHIAfOieuZu85tjcsU1U_hPGmjuGDEBCcQ=w405-h328-no";
    ImageView nukhigiene4;
    String urlnukhigiene4 = "https://lh3.googleusercontent.com/9feBtcvPrrNxPxPZdptH5IiM_L_P1sBdExaWkAT-tDEK1X_SSH0s4CYz9ypUj5vX7sM6f3j_lemkzfLAgSWNSTMd0akdHCwgMSPm4hHspVxAu7_WXMApOzg93G5K0bq_hbLD-iTtto6uxc3nwgAzqFFvPiUeITeDAJaKP3tKuYWIYPAcbwJunBfQT6wizZD5RzPPFfTyW9ecO7Qh0nen1FOIrya1z43RUfmyliLa_mAVzaygZHSzxOtkzCYY1d5UER6dcAdyVLv8gnHbwoIJYpeooeYQ1b_R-GGzP9ua489TjO9yTjaF2p3V0udGTxf8usjzm9AmRdV5-dtp37sKcafctNCo6Dwtks_bsWuEvaTPUrM6iBHdJEqcMqWgNwQzCY2XjWIgRif_oALTxTOT05HxZQ08wcc1tHx7PgHWpZyzdyNmXieT-pS0lv-Udi0NOAgTcCqfLRMszniGs6lQEJRRgIHIEjrvjoRpvMCcDbENg5ipWEdaAD2OpnqgUqZl1NGdjmHqrStoQzl2FGyePpoo8fGUw5rZQroq09dSOQl3G1Zld0VkWCAAAnfZGwG2enk-7wtwiR2MFq837nvKHrocBM5AL2Oq1ryF5FX8s_NVnNkrkw=w173-h350-no";
    ImageView nukhigiene5;
    String urlnukhigiene5 = "https://lh3.googleusercontent.com/-0BwNx23C9EmskQGdKJeGCvXuJY2Bon2yLeY-4EM9rR-RW3Fdme7X7f27YbMQp4Hl460KuXt6PJao3TjDrXHRqequtl6SkFXJuslKXnM9fkLkSQa90M-GxdTNcj2sfK1k-HAjytS3vcrMs8ggldqo0d56MVMBXf00SS518HoOq8EP665PR7RmGoNVOZ9IJP2KthLX0YfTFyjRShWZItm1vSsHsbntGE_CclHUeSyEHp76KE2PDOWLzbXbGQsdEaf2mTu_J65zUFAxgO7xDQAixGAlfFWOeH7bXLj2Mak9LTWiIsXNCe5SopBPeVhOdRRH5m3sMhrrLbMUyPWcayhbeLhIxme7dPLVHPDEpC13c49vS3PHG7nyidy00ftRe07LIfbAas-joyl60BsFbtvCCLZqn2s8bYkxmmp4ow0qSGG-5JCh9y3DKyLRHxpSdYo4v8CCqb7xo1VqOK0XnjiLrzmV3hqY15AmBqi8ECO-TyMXyW0LD8wO1S8HkjXKKVhpHwv_1cqKiYkN7qS_kCHhsayVzGTt7yVfBF_1Z1Rto7zT4h-IhyBIqqaSRmq1PzSxS8zqSY86JlI1N9LJj5aSkTg9XitZtasytcmOsWBrQlv-9R2Dw=w378-h296-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukhigiene);

        new nukhigiene.precionukhigieneAsync().execute();

        precionukhigiene1 = (TextView)findViewById(R.id.precionukhigiene1);
        precionukhigiene2 = (TextView)findViewById(R.id.precionukhigiene2);
        precionukhigiene3 = (TextView)findViewById(R.id.precionukhigiene3);
        precionukhigiene4 = (TextView)findViewById(R.id.precionukhigiene4);
        precionukhigiene5 = (TextView)findViewById(R.id.precionukhigiene5);

        nukhigiene1 = (ImageView)findViewById(R.id.nukhigiene1);
        Picasso.with(this).load(urlnukhigiene1).into(nukhigiene1);

        nukhigiene2 = (ImageView)findViewById(R.id.nukhigiene2);
        Picasso.with(this).load(urlnukhigiene2).into(nukhigiene2);

        nukhigiene3 = (ImageView)findViewById(R.id.nukhigiene3);
        Picasso.with(this).load(urlnukhigiene3).into(nukhigiene3);

        nukhigiene4 = (ImageView)findViewById(R.id.nukhigiene4);
        Picasso.with(this).load(urlnukhigiene4).into(nukhigiene4);

        nukhigiene5 = (ImageView)findViewById(R.id.nukhigiene5);
        Picasso.with(this).load(urlnukhigiene5).into(nukhigiene5);

        btnnukhigiene1 = (Button)findViewById(R.id.btnnukhigiene1);
        btnnukhigiene1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukhigiene1 = new Intent(nukhigiene.this, nukhigiene1.class);
                startActivity(btnnukhigiene1);
            }
        });

/*        btnnukhigiene2 = (Button)findViewById(R.id.btnnukhigiene2);
        btnnukhigiene2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukhigiene2 = new Intent(nukhigiene.this, nukhigiene2.class);
                startActivity(btnnukhigiene2);
            }
        });

        btnnukhigiene3 = (Button)findViewById(R.id.btnnukhigiene3);
        btnnukhigiene3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukhigiene3 = new Intent(nukhigiene.this, nukhigiene3.class);
                startActivity(btnnukhigiene3);
            }
        });

        btnnukhigiene4 = (Button)findViewById(R.id.btnnukhigiene4);
        btnnukhigiene4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukhigiene4 = new Intent(nukhigiene.this, nukhigiene4.class);
                startActivity(btnnukhigiene4);
            }
        });

        btnnukhigiene5 = (Button)findViewById(R.id.btnnukhigiene5);
        btnnukhigiene5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukhigiene5 = new Intent(nukhigiene.this, nukhigiene5.class);
                startActivity(btnnukhigiene5);
            }
        });
*/
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukhigiene.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukhigiene.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionukhigieneAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=24ef076d3c107753c44caee4cc129072";
        String precionukhigiene1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5f36a5c06a5c87a837214459cb0bb4f4";
        String precionukhigiene2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9e7bbada21f19d65a52ff3812aeeb8ba";
        String precionukhigiene3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4b67b2551fb8e04722def139209c014c";
        String precionukhigiene4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6bbd8a62a0bd2dcb3b1472d0acc243c3";
        String precionukhigiene5st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionukhigiene1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionukhigiene2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionukhigiene3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precionukhigiene4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precionukhigiene5st = metapropoerty5.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionukhigiene1.setText(precionukhigiene1st);
            precionukhigiene2.setText(precionukhigiene2st);
            precionukhigiene3.setText(precionukhigiene3st);
            precionukhigiene4.setText(precionukhigiene4st);
            precionukhigiene5.setText(precionukhigiene5st);
        }

    }
}
