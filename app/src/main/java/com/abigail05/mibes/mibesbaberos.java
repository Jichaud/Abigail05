package com.abigail05.mibes;

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

public class mibesbaberos extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnmibesbaberos1;
    Button btnmibesbaberos2;
    Button btnmibesbaberos3;
    Button btnmibesbaberos4;
    Button btnmibesbaberos5;
    Button btnmibesbaberos6;
    Button btnmibesbaberos7;
    Button btnmibesbaberos8;
    TextView preciomibesbaberos1;
    TextView preciomibesbaberos2;
    TextView preciomibesbaberos3;
    TextView preciomibesbaberos4;
    TextView preciomibesbaberos5;
    TextView preciomibesbaberos6;
    TextView preciomibesbaberos7;
    TextView preciomibesbaberos8;
    ImageView mibesbaberos1;
    String urlmibesbaberos1 = "https://lh3.googleusercontent.com/kfPmY0FEq9VJ7zHuq730SrBCxbNGaV03Ie-0bcVSfEOY5mYSQumfBZ22cJXAkgt47AcY3S4OyCmuWTKNRn5EObRRs4VxWspEZdLoJTKC3eyLxaMI04MeAOFrumbqqocDIIMdhmzE2BjSs2E1Wg5q4UEGBhsUcqfvSdYRk7e0TGuq5TAf3wEaLk7ZA10wc3V8iNtZbUjEmMPDTn9coD-GM0UAtTY6G_OE9IZdfJVJ-ir1_TfE4eTKoPx9BHwlId21krAjCLErJh1cXVB1BcG1ZoLzCq2B3kDQDzbogaM0_uS31Cj9EwIOLxtu3xm0qZ9-jzi0TEDr_sCmJZueaTVPpPGA1-S8TKsdYejlqAS0bfgE_HqSQsZj7UNXjEQRUsQcvjkKJYRKX1VUOFgCv2V_oyVmBFbjeVgtZz7AmysCMkuAme23xq0kfTGdxIvllHz33iylN4lrYVVy0ZBnHQ5pRSfsr95G7bv8RIncVeIkyMJRvu1RDRDInHn1FLT0KJmle_YDQM2w1HyogFJUWJjspy48J0C7sKkoWLzAl98KOa8OQru_UU3RZdCTZ1u7KJj5aEBk-0oOh54rpTiUBBpBIkvQ-s7rcHCFLadHtjOPay3kqHZo0_eSiHFJnpslOvMERLc4CJEf0k-EI06NURGifFJ1ukVOzSboqI5yPQMGZmA=s725-no";
    ImageView mibesbaberos2;
    String urlmibesbaberos2 = "https://lh3.googleusercontent.com/hD1tchqxhH7UumndUspTp_ZZPCOM1dBiHEAZ4RqXV8uP3ZhnuNlOVDZnZe-HB_b9XcKCTMQkAWEaEREJbqZPC0_xKSv_gnK21r8M4hqlDlFGrByr2IqVou1vNQ3TzN4MfIreuG8Y9RR_gdBewqOVJTkRh888dAA7oT6bl03viH5ptu3z8mo-_Y6_OdYNrmEaW_1YqHzi2Yo497cZcYcBbpCj0tiw2RZE7KAdvvUP4XlTbLk78l7SwD3gFzPRVFR1UUZHZE3g0RSW_NUzydWIxj3ifF30rGlIPbcwZzF7zo8PtcKmq3nb8zdFWpUBl-8Cdpkd5cTJx-8k_zuD9i8PrIKsQ5QYzjLOiuEd4E11SpQRL2us6h2ibVh1etxmCSBJ5olvV4amQhmrhNAMmIMymmn9kR0H4z9ujt1LFqxjSNTSgNnP4ercqmpuMeIOsuOGbsNx58pZt7qsPnvlIMGWE0I9sQFW4vSV5fpaZmH4zSPmURWzQAZOp098LQlrG8Xg0y5evKSrpsyry-mXXcUvasJokbKEC2Y-xu3IScfqRN8-lT7baxmCHosQGY8N5h4-OVshaQTDEYOmDHpJZI38c_z-C5iibvXZ4RuF5OXwDxN5x42ICiSaXcI1HrzRB3uWVgKihGJofKpInp8UlFPpeJlk_otHjvrxbiuTacImfWM=s725-no";
    ImageView mibesbaberos3;
    String urlmibesbaberos3 = "https://lh3.googleusercontent.com/h6_5IIP6xPuflC_A_rQYeLTUckHYbUSZb_81xbqsGD4qIX-YzsyqxgpgDrGl7N1Vx2tb8NZQwgjYPG--UTs8gXiiC-7_OYlyalyXhYhlyoTZnz1OlbRMN4tFHvALOquu-ZaxLzmS8pnt6NoijnZGamm6Gqln5iyVNneG-NIF8WRpg9nHzfPr1pA9_zqM1gT88v5FkO7TtipV05H4B7Y3bwjGC9l0klFVhkX1Lx56G0A6YXXD9Uqq-kj-S6Kh_4rLiGz3U3Nr-6ytpuMGKg8zOGNC0I6z7EIzfYpUtR45AU6pRaR_psXS4QQ1Q3b1IUw1sMbjYGf1_3QmMHUOyBI9IQnnHVgJR2Fdmld5tVGBlGAgKYq1W5Ndxb7W13wB9TN05cu8uCUhX0vnZ7RlBowtyNlZMZIbzrZXmfSvZv4G38oVedwYICvLSzWqJAsdARR-EQs1TzDNCu2kcicVwMg46LwkKy0GqfEQpHmJueMQmQOQJrHLOVSrHDj4ta3jJQOEQrUmWcppjPU9SuJz7rO1--J8ia2n56U1kLkrrI6743oLfMP6KemBsZB4V-2BNGPfoKVrLBEr0uIBM5Lyxi0ROXbMyodqUhv28bN4fAXS-fR2ZY4ZBv8_fZ8BCJXgAvrQ30ci3QR3qUEe-3stYmem54nHWYDeHSLVdFIc1AT39zk=s725-no";
    ImageView mibesbaberos4;
    String urlmibesbaberos4 = "https://lh3.googleusercontent.com/9kyRDDtjIqA9gwDXIZGiNzrPiM7ubRMRqlhl5zZwhZluFZgMhfXc85-X6iUAVY6dPKLlWvvDmL6NsOlOoreO2lx2H4-E8tyZHQX9POYo1qxx3J47bkQjbLIlfGGSSlpsSEZAcd0x5s6bUnnPynDLe6aJNll7WZlxufDsCyBJ3m8u9419292lT5AtES-6J-AZ7EJ0ub70kOPvj9LgNFBQEO1zUyViz6ZpBsj1RpS3HqHbMfW2bbWuyGUB8IoYwgIVjS4_OhivI2bA6cuD_JeFOMHUoYpk_F7ygtZ-CxzsejUY-TjydbYkJ-tIT_LzLk1Qf27J3mP8XnvvBhlXCGcm_Gl3diYxkjapPsEBvCHQsma2KrjBPrNIHhgI00q7hhshbeu8oE5vooQNHwN6u1cgB4I-gyMTQgumpRxoNXxgqRxxCeEjObSo5x5ihcZy1Lcq8gtRdp7EkQV1xX0HOHBy9-UBVQm1jK0npK9o1cM8VUvE0gQMzvH7cS10lQo96NFD94P3WkkhEOqvhFwz_Uv2Z1szWMnSrDuwJH539NqMomehffEWKXO2VcQb7PmBJpKpeJ7D5C9Try--HgtZWwrQ01SFkRRb5jBkMG2nF6OZKmKhVDqTXnTXjykuq6MGy34Pma313-TadMsNa3xj9NuOMWCTyb0Q4drhiETYPunduIE=s725-no";
    ImageView mibesbaberos5;
    String urlmibesbaberos5 = "https://lh3.googleusercontent.com/Tgagf5A0tfqroeTNXoB-pYPiXOZWKWgocRW4fKyzj466ZcDPxTKVAFcx19h70NPiE3z8kvVXmMYiyUVOsA4FiAfMIfKg0LUSsXTWm9oG9B-IZ0sxDi9EhrDv0Bl7F-p2bh9j8nS9LuEgpOz1ea_SA_qvEgxj56t6ng8_JlpX6_M03KKbdYI-OGxRdXzfrRfT934wa68xgnFDE2FpZbuYOTli9ukhNc3YBATYFORbdlbT_dqrhD_UxNt9TJ7CBfarvoiLE0Qdpzq8uH8PFCzcVg-R36gjfTO5NH8O0x5MRX91Oe0Mh-hdgK9G8_yP9eu4hgmBoTElaMXz53pQ6RJ3WaP4rLjX7hVBIupumTfv8wz8SvKpJIZ5B1WiURVv0dFOYCucGA3Ccvt1lr9dT7BNLYCjua5Z9bInMHH7LW4i8k9RjnwOKSOi1jRKKO5avdKdiS69srwwfc3NwwdAAXW7D48XC6RjVk9yg8spGyutO-dfO9aAqKOTr2B2FT9iY0ydLZtwIR2C19N-hfcZYCm2DkXZnbSPKJKzt1am3tz_lNQ6yeRC5cANNcC9gDk3o-g8BC4ILMn0EwVNZm_pVQnxrVMztLmUFWcNEwMXmFNmdghUeLruauao9i3WORj8ai4Vay7x0vOQwtJLSNZB8V60u17xhgg9A8f0z-su_AuJkTU=s725-no";
    ImageView mibesbaberos6;
    String urlmibesbaberos6 = "https://lh3.googleusercontent.com/MsdAR4Ie_YoYJLsW-q011DpS-x9ikyJPACjmiw70cZD2h486V_yEnBkwBD4nahj8XRICqj8dlXvSSo4yunRqAs6UKv6uFoFs8_myBjQfVSPs64AzXdNBoLOnWK3PoJnnwD2v0Tgb4Uire5qnyr0nA8jhYCh6qdqVonqtJ5Ju9ECk0-vJV5eTKYqrFQelDFuPYy1Wz-HSp5qSyeOAy8_vMbmUs-33DytdoQn7mybUmzjyBD98lJEHLf3M2KCi48qVV-kifT39IwgaeXJdqgS93xmTIqhW3IC0T0U5qWAWFEBVY7OA5vPK0RifMlrMz54HzkDCbcFysBmxDOdjjm1MfJE9g7DVtNd7O4Deo-1lVoxVv_yETAOb4e2nPUjMse_Hf4ysRQJtVvMiWAVvaa-xjOH5I-oB4xF4mMKeQgul-wzqAqOR5lEZGL2VhPNqN7Ts9eRcd6R6Zt4UxUhsD54-it0pwIrx3sG4LC55ENr8wbotUbb38_mVhNNZbGt2LL_Vm93z6mod9VZv6ZCkfyJmCydbd3FAfkq2qF4pQgpP8OnluxjG8OyMCU3QtRGYoIrY2aZVenLd3-CHsmAbpyevBo8pWXVzHRVzP6-vfA0CJa8ReNVMklRfawSTLoi4x9DJkU3dr8WX2YqhhGtAFfqKgj0XFyeWn8S8t6sdtJ_Aqzc=s725-no";
    ImageView mibesbaberos7;
    String urlmibesbaberos7 = "https://lh3.googleusercontent.com/m_7yfGVILFRm0UGf1gTripvb9W4bALRfDypJASHRa-t9DSlisykP7VZkXhznjmYKbd2OoMVKW09o2auPz8WNdMYTExplqiQpZBMFdBYGmNXn49G4MKPEsQuQ91GjAg2UWVG9myxiKqinxOpcnJYK3egelMm8A-GzHjY7BivwQ5GW3AgekzlhT_jucwJe7FYZULvVh-bD9Kafswm3MUeoR44RQHyvSPuS29ifwcYotLKWEl91bk2lXLXc9uhZ1HZTOOqBk35LIrxyBSFzCnJ0S50diGAIgzy80qHV2k1DjyQAwnAB45QdmqR9VZ1dbVDGIQq3nAawSou5vaVV2o32_7hDhvaregUdW3_P1K6k5AVnFXuKDoYm7EFInT2PIMPtcSe6q3a4bdSuJ00FB5nPhJq-d5PabFSi0OALYV9F90jhRDYZiIbPdUQMqW3yy5PGa0Xp1FI9DvsHCGuAc51995_u-w1Z6WnqtshrolfWJjLzXemxeJI75UnEFDJzWFkBgWCOKFPViNXAycZG4gYjjlLC3BZyncDGhdlTTB91BaQDd_SbqUgjT6UWozuSbAY84W9U0-VZS5NRYkfZvlrvL9uoQCzjRrw6PsVfE-8p7Oz3K3JA8qrr4XewUn_xUyoEypLqRIKn_TTN9nT-3fhmqXeyq3VAN1IsOM5-BcVdST4=s725-no";
    ImageView mibesbaberos8;
    String urlmibesbaberos8 = "https://lh3.googleusercontent.com/LfFlaKLlilBMrhR6g8mX5Oeq39c2asmuocglINf-nD2clxV1cV0Iqf06G_i0uHeRQaRQsiSIsJB1Uiwvq77UlayP6Hu0ikfqipvRgWFy9BYuBDXMG4qduGCeDt9ZMyTTi4NLBohx5wCOZl6BPTMwibK1mqBk9rOfkcOYpRlhvV56wdKlaCRUgP7NgSEtCzppNhp_684dB8srcgz4CpGQU3NTpmP9xTaRx6PtQXElYK6O3Fs1GxeCtX447IvD-SJ_310YV0fLDALtLxomv7n5Xlh7FRbPIrdzahMicSULTvb-HjQjw5FUJNoDwcWY3-H70qcIQ1Zb4S1ED4qfzD6hmiXAwGcCadqbfLfEJho4VIlvXvi7zJMkTlydCrK9kD_nJRrX7d9j1EkcebN-Zf1H96W_AW0nMWlE6F9dSHq9gN0RcBqpd4XKhWehzXtcBiOq9GdgYwAIVrymGm3Bkisww-zbWD1o-HURlPVL3j0krN50GHMJ5AP4kTaGFMPK9Ohk6AymbMfAMJqWjDyA2aGqt6olSOhvlslbqUa3Dxlz0E6N-2GUDZye28m4KRWkpjVwNo8DubtokfhyLaV7mRlZ7u264Gp4jG_D5RS4MYTGsh3pXdp-g-5lOvwezZzvv6Vl__mJxGXEkJyRUXN-e87UkUY9dJLiHY4cdymKr1Jl2tY=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos);

        new preciomibesbaberosAsync().execute();

        preciomibesbaberos1 = (TextView)findViewById(R.id.preciomibesbaberos1);
        preciomibesbaberos2 = (TextView)findViewById(R.id.preciomibesbaberos2);
        preciomibesbaberos3 = (TextView)findViewById(R.id.preciomibesbaberos3);
        preciomibesbaberos4 = (TextView)findViewById(R.id.preciomibesbaberos4);
        preciomibesbaberos5 = (TextView)findViewById(R.id.preciomibesbaberos5);
        preciomibesbaberos6 = (TextView)findViewById(R.id.preciomibesbaberos6);
        preciomibesbaberos7 = (TextView)findViewById(R.id.preciomibesbaberos7);
        preciomibesbaberos8 = (TextView)findViewById(R.id.preciomibesbaberos8);

        mibesbaberos1 = (ImageView)findViewById(R.id.mibesbaberos1);
        Picasso.with(this).load(urlmibesbaberos1).into(mibesbaberos1);

        mibesbaberos2 = (ImageView)findViewById(R.id.mibesbaberos2);
        Picasso.with(this).load(urlmibesbaberos2).into(mibesbaberos2);

        mibesbaberos3 = (ImageView)findViewById(R.id.mibesbaberos3);
        Picasso.with(this).load(urlmibesbaberos3).into(mibesbaberos3);

        mibesbaberos4 = (ImageView)findViewById(R.id.mibesbaberos4);
        Picasso.with(this).load(urlmibesbaberos4).into(mibesbaberos4);

        mibesbaberos5 = (ImageView)findViewById(R.id.mibesbaberos5);
        Picasso.with(this).load(urlmibesbaberos5).into(mibesbaberos5);

        mibesbaberos6 = (ImageView)findViewById(R.id.mibesbaberos6);
        Picasso.with(this).load(urlmibesbaberos6).into(mibesbaberos6);

        mibesbaberos7 = (ImageView)findViewById(R.id.mibesbaberos7);
        Picasso.with(this).load(urlmibesbaberos7).into(mibesbaberos7);

        mibesbaberos8 = (ImageView)findViewById(R.id.mibesbaberos8);
        Picasso.with(this).load(urlmibesbaberos8).into(mibesbaberos8);

        btnmibesbaberos1 = (Button)findViewById(R.id.btnmibesbaberos1);
        btnmibesbaberos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos1 = new Intent(mibesbaberos.this, mibesbaberos1.class);
                startActivity(btnmibesbaberos1);
            }
        });

        btnmibesbaberos2 = (Button)findViewById(R.id.btnmibesbaberos2);
        btnmibesbaberos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos2 = new Intent(mibesbaberos.this, mibesbaberos2.class);
                startActivity(btnmibesbaberos2);
            }
        });

        btnmibesbaberos3 = (Button)findViewById(R.id.btnmibesbaberos3);
        btnmibesbaberos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos3 = new Intent(mibesbaberos.this, mibesbaberos3.class);
                startActivity(btnmibesbaberos3);
            }
        });

        btnmibesbaberos4 = (Button)findViewById(R.id.btnmibesbaberos4);
        btnmibesbaberos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos4 = new Intent(mibesbaberos.this, mibesbaberos4.class);
                startActivity(btnmibesbaberos4);
            }
        });

        btnmibesbaberos5 = (Button)findViewById(R.id.btnmibesbaberos5);
        btnmibesbaberos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos5 = new Intent(mibesbaberos.this, mibesbaberos5.class);
                startActivity(btnmibesbaberos5);
            }
        });

        btnmibesbaberos6 = (Button)findViewById(R.id.btnmibesbaberos6);
        btnmibesbaberos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos6 = new Intent(mibesbaberos.this, mibesbaberos6.class);
                startActivity(btnmibesbaberos6);
            }
        });

        btnmibesbaberos7 = (Button)findViewById(R.id.btnmibesbaberos7);
        btnmibesbaberos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos7 = new Intent(mibesbaberos.this, mibesbaberos7.class);
                startActivity(btnmibesbaberos7);
            }
        });

        btnmibesbaberos8 = (Button)findViewById(R.id.btnmibesbaberos8);
        btnmibesbaberos8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos8 = new Intent(mibesbaberos.this, mibesbaberos8.class);
                startActivity(btnmibesbaberos8);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciomibesbaberosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7becf1e511394c9b471fada688beb1cd";
        String preciomibesbaberos1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6d4d19f6c47717a60bdf691a4fba0b0d";
        String preciomibesbaberos2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=71299c43163c1e4be83911eb36f6a021";
        String preciomibesbaberos3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=bd85f9e62b945d577739453f2a101a33";
        String preciomibesbaberos4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d01f19c9c7def51e293d26a2451c2224";
        String preciomibesbaberos5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0f0d37f4f5d2b6376728c16a1623c722";
        String preciomibesbaberos6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9010fbebc9faff5ca33fbbf3c9793b1f";
        String preciomibesbaberos7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dfb82caa53e2fd722b77ef84075acb4f";
        String preciomibesbaberos8st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciomibesbaberos1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciomibesbaberos2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciomibesbaberos3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciomibesbaberos4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciomibesbaberos5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciomibesbaberos6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciomibesbaberos7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciomibesbaberos8st = metapropoerty8.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciomibesbaberos1.setText(preciomibesbaberos1st);
            preciomibesbaberos2.setText(preciomibesbaberos2st);
            preciomibesbaberos3.setText(preciomibesbaberos3st);
            preciomibesbaberos4.setText(preciomibesbaberos4st);
            preciomibesbaberos5.setText(preciomibesbaberos5st);
            preciomibesbaberos6.setText(preciomibesbaberos6st);
            preciomibesbaberos7.setText(preciomibesbaberos7st);
            preciomibesbaberos8.setText(preciomibesbaberos8st);
        }

    }
}
