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

public class niditos extends AppCompatActivity {

    Button btnnidito1;
    Button btnnidito2;
    Button btnnidito3;
    Button home;
    Button producto;
    Button marca;
    TextView precionidito1;
    TextView precionidito2;
    TextView precionidito3;
    ImageView nidito1img;
    String urlnidito1img = "https://lh3.googleusercontent.com/azLfqv-uz03eh61Zt1qjmkLdDzV96CydQ_hXOQrLQ5IiJoFOzG8UD8Mg2Pnfwxel2z7D0N9yrKK1oQAdd0u2JYzSKKPacISWwkwRrxD2kwy3C1KDIxkpCGs-hOw7TZl8OZIjm15o29w1nvCFaO9vJYjZrA7yP3SPp3e76Ga-N4redX3d0anSAlO9wUHfpoxswgvDnIgtlKHRiYBCCp8aBs6QHHyiWbNRLiz2cMEbJWqH8rgGBgu-AnFOJCXqX1K4z1TtHD7rC2tP7qLUmC3Vfh6K83dLZjt3ShbkOutMZD7IanCLMAQJn4xUDRQS6pLWZHgF8YaKulJ8GX7rmLr35mnSAxwsAHQROpQb_jubf-gjBt7j2VSMsWCjWC3TpK76Eh_kcu7gWnfaQvct1dlXZsNYzMhBxqfj-9Cz8iKTfQ60O4GfHgMBcmn2A-MWG5_rTkdDTJD2u5J1C1VtpTyeWLJTIquag-r21oTA1LKzBlX-XoVJnP-S8dpgAN2Xra8HayK5MZEBlNtBKNOVFD0slKXtea_-HT4PJy4oW713_KtINRMFqZ4buBb5r4oNq-h7YxG2ZXz_PsVFcF-7-oz5aoiGPEQZuYsG9V3E9-nkoNfeJ1CWkw=w471-h404-no";
    ImageView nidito2img;
    String urlnidito2img = "https://lh3.googleusercontent.com/6Z1v57Y3l8TLV6_V-7-76fNXf_WV-iOW4n-vG-N_-OVmggx4uDqhjWfELqit0Ss6etZc58wQcwaZWzU1BiWRfsr0nMz6CZbS97tiPoWwJ-9ags3R-KKUlbTI_owGutNpi13Edn6p1GUkxUg6BCnUukO5XuHiKqZff-IRF-VUHokkXwaWcwUD3QOY2hjvyAdam6yZ573hh0-kJ9e3JzVP1S9Oc5UNBgFFVH9UHwtXFlR_-mbVsGb-rMMcdu9dp_FH44bCV7hVm4q5UNuMa2_WYvoj7a3eN3xHdQi6ZBjkPhGlciaBIAXNzdCeI5ms4fz-T_tJQ2OVyknhxmCkz6bLGoIoL-pw_HMcSFbk7Q-51LIIL58k-A5NeQPwknB18jeRpEtl9aYy-4Uew-uZvSkIjfO_AJyMOtKwGlyKAtf5LzZtECgISy8zqK8LKhFPhuf9CaeTzDncS1UFhekaUgoHYrIDBfj08xhg0Q9WJuK7yDNbGg3-qmXLxA04EXvaVbQe8rQ8W9mWLQc-VdPQMBPJRR5uRnsO82y_9B_mt4SN0YOhNXOm7tvnSn52rFoBo3edEC9GUVlZWWsv_b9IYNjhDCpI-u0xf83sSDClY8f1WiLWtCurSQ=w322-h296-no";
    ImageView nidito3img;
    String urlnidito3img = "https://lh3.googleusercontent.com/SCVHgQ2GE5eELeBMQ86Fm-3GYIeVfHo4gZcnwNykzDGnADuUHSTUMoz1BeEe9TqpFSLuRqUBoWIpBm2EZUFX7a16IYWj5b4IMyhWb5u8_mrQ50H_fCQv2m3hJekra--TZGj3CU73hFNw6ZICAdj7V_maSbm7TS6T6ask5d0_Phizhtvyu6gWRkavpahQfsti0eWmnEeHtSq-aUm1RF7M8i_5gKvoPKkiK6Dvl85VrCwL3bUQ2OoorJ7XR_rRmSwij5fAjopvBK7jiZLLMju5FvcvrkKVjC4acZlWoMLJip_1l0trJoBgNcHfgNWwlOWIIrAOE5DC5RPPTt1cBJ5oaQqCULFk_Lz8vgRp4E21ijz7WcWp0qkHffSaATUOiTR4CLJGSIMJSl7T0R2G4BAn7FBdM6RiSR4ykJ7qjUPJUfYznv6RKbQbBonFVlNZsd2_xtdukIqyEHT_sAQdx_kij6LcSmD9JLT_pXB5ly_f_mHV-ItJMMIsr_sRieX-5pwgk94y6vgr3Gsd4NrSxL85gpO7-fjvmUarT1iLTICTN4hcjjoxhWVGcXjwcdpwunZe4t8YzCH0i6VETFu8msOYLSb5AcEWf81imyMeCUPzUe_LH0sgnQ=s541-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niditos);

        new precionidito1Async().execute();

        precionidito1 = (TextView)findViewById(R.id.precionidito1);
        precionidito2 = (TextView)findViewById(R.id.precionidito2);
        precionidito3 = (TextView)findViewById(R.id.precionidito3);

        nidito1img = (ImageView)findViewById(R.id.nidito1img);
        Picasso.with(this).load(urlnidito1img).into(nidito1img);

        nidito2img = (ImageView)findViewById(R.id.nidito2img);
        Picasso.with(this).load(urlnidito2img).into(nidito2img);

        nidito3img = (ImageView)findViewById(R.id.nidito3img);
        Picasso.with(this).load(urlnidito3img).into(nidito3img);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(niditos.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(niditos.this, MainActivity.class);
                startActivity(home);
            }
        });

        btnnidito1 = (Button)findViewById(R.id.btnnidito1);
        btnnidito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnidito1 = new Intent(niditos.this,nidito1.class);
                startActivity(btnnidito1);
            }
        });

        btnnidito2 = (Button)findViewById(R.id.btnnidito2);
        btnnidito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnidito2 = new Intent(niditos.this,nidito2.class);
                startActivity(btnnidito2);
            }
        });

        btnnidito3 = (Button)findViewById(R.id.btnnidito3);
        btnnidito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnidito3 = new Intent(niditos.this,nidito3.class);
                startActivity(btnnidito3);
            }
        });

    }

    public class precionidito1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=eb68d4b4bf34329b8db92491a6cfed65";
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1270985443f9cb4b4f4a0b42782c6bb3";
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=00adb14c0a2fb5329a19dd28a3d78a6b";
        String precionidito1st;
        String precionidito2st;
        String precionidito3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionidito1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionidito2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionidito3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionidito1.setText(precionidito1st);
            precionidito2.setText(precionidito2st);
            precionidito3.setText(precionidito3st);
        }

    }

}