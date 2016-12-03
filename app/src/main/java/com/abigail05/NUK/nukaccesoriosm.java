package com.abigail05.NUK;

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

public class nukaccesoriosm extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnukaccesoriosm1;
    Button btnnukaccesoriosm2;
    Button btnnukaccesoriosm3;
    Button btnnukaccesoriosm4;
    TextView precionukaccesoriosm1;
    TextView precionukaccesoriosm2;
    TextView precionukaccesoriosm3;
    TextView precionukaccesoriosm4;
    ImageView nukaccesoriosm1;
    String urlnukaccesoriosm1 = "https://lh3.googleusercontent.com/wOF3VCqvDgKGL7230MKgLFd_WTatC0HYldbkJD7dtoNlES4DSGpuCysMwWLHJ32GvEJi18yPOUH56nMDTFfYfqlyi_WoI7OjEf8Oe6cwDEfnPCPLIR_sEbUOqUZcIZGqVPCfGMUZmmwynFLSMgVFBRe4GjCBnsMbdCspeR7b14d8rzYS7m_weiFNGyW_d3RU0EzUTBE_OOoCLsx6vwkOM2me0aAg0L-pXL2rxsn7wOMBimj2Ov4lmHAJoZ5mJ07xnz48h7XiSuAVFRNrb0vVpqobKfeadTJRn6uKumEujNtF0ubJ_i4TJ11MmUSOsrijUTD60o1BQU7ItDOKm2srN6ZP0x1LRV2eca4Jm3pn7Ynd47UUZfG34ihraTQDmsFVQpjlEDPvc0QxjPRHYXxfPvxyigNhVwlBCFK4Y_cdsdJPleGfrbQkCNden-pRsOd1EFQg_oGZLqhe8-l_6EBkff0_lRlAE5vikzBfTwl0CJYhqT7zxvyjkfNHe8i0vQfdKdbNGrSBRvNMJtKUiilRGnX4wQ1Gsb5XZX39jZ93uN0WoKNa8Ow2z_aMl3EAxeN0gbq0POIMVisdMcWLkKaVX92WJ1XByxJChI-2oNfqXheGZSd_TQ=w302-h320-no";
    ImageView nukaccesoriosm2;
    String urlnukaccesoriosm2 = "https://lh3.googleusercontent.com/xzh_fayV7nTgzxt8jtCS8Ktlz2ukVBdmV2gHAMLaS5BDyuD7TpWh8YaWrPwnCZtsJCCr1e_XtYGxmE-HA8tLllZY5eRsZIP2btSfwDWoOmto_a906O5RRrXxooJGPBFGmb2LlYvfVpOIePjGdE23UKsOP5gXsuP2b71idntAiRIKeoICOwAXwPC9TC_ieXUEXTIPpAtR7DDTd29gvNAtY_7RRmlvrq7i8ThLHE9ZN94o0VQQf_lhesAc_triKWdsnO8DSBkWGzP1v3w8jotj8xcB4UdNlnF_4N9Lln2kJhoeI6cFyCQVP2MH0vB3mj0xYC5vhm6cu3BcyWKdwE1AARIdY5SxselQR6swDtK1667H-jlnfDCHU9WRPLY29NK7NXABeHwzU59JgfBKn07xv-3WxnAlsiAGs9RxqE5ba_yqCgY1WRpiHoLap3jecLpYVn_z_3wlJ4gEuXiCijEypFoP-SxbnJby7zW4i2599SRNUgXlp6F9L9bWA79sG1o8Dxqic6gFf6MvFnUFgtSf7acTVrYob6FwzJnzjDejkGTaD465YPUtY_3SMUqwtFJtGdyPvjNbmqXj0ff3swzJJ3_jip9OXvOvLHPBphyY0xrp3d3OKA=w420-h286-no";
    ImageView nukaccesoriosm3;
    String urlnukaccesoriosm3 = "https://lh3.googleusercontent.com/Rm3G0XctpbdImj8tN6T_pOFAYY-nlq1nS2pVnJkkJMKXt3AJeO5G4ouEYQdbJ0RSnJ_1DI8Ro38RyzCgOEsYLV5z0kjIVi02uTjAO6XWf6OeLK7pBJppFfMbatQsh-yi1OVQ7qnybM-WEKOII0pzVlgxuf4w6BQyieGFPI2Q-NNOp58W6AeVk5p8D-6rxsicrw65lwGNrzqaN79wNC24LgM60XZ0mkc-q7RZwczdtn-YX7d1kapD0Oyyn22UbpQ0OzAeZlTFVJQ-yH5jtlNazR7j8ArlkW3uZbTtGgZBdhNslA1qmgsofu3saDLcgSGOnVusU8Pkx8n5EwFbQ17oiSyo8Ka7Rj6C8Yrxf9ChftpHPXs2gG-fSFLGozPav2IIkebxqopvEuGUXV3xcAdyGa58QyiwgsYFjdtThmF8FPn68jvOyndun9tmfr1J-LJ8wW7JLmb2Yye7UyNYYHcUrdCgRFrZqxTyd1qOq9eNu3wjp2O9HpNRrIuj-wEB-R94yiRhU4cgO5sdqdf70-XCMqTO1ZuC_GfqH63JA7Cp3Tc9K3uYBiHUtQ9rcS-jasBQ7656TEp_7UXtuoRm10rBp4AKV0a7sV577M1yk57BTNhSdrAUUQ=w274-h340-no";
    ImageView nukaccesoriosm4;
    String urlnukaccesoriosm4 = "https://lh3.googleusercontent.com/pwDV5B7ycHiSFkGgQfRKgUqPnyz86shQfgW7K5no1BeepQYYNiLs5ItZgBvQmGoOcwUr1KoZdM3RrohHESrXq_47pwoyOJ9cs80HjB5QWNIzKF0gM1Wx_ohY-sf0zZWvlAGv4UPcdoO2f2UpVt4NpIMgwgGjIBFmgeL-vAg7dE2RItZTjE45n_3AP5JmMm3XCLKxeeAQAA3df5VlyzMM2Fx0utVEUejKfUIhiDWaDQPjUtqyzyjr5EGWKU3vN04US0xTYoF96MfFSfsUEgjTTRR_7z9yC1mrVHzN41vvqMSoRTl-GP4MnGkusLPx6vKKabvmslKyPNZ2le4dqNsn9rv7-m8zI9FJR8FydxueGFPAtaxMK5Fz7dvizyE9OCdEOAvZy4vJ3x1lfh8DH_d91oaOpTpmvyT2VeluVPlTOsUCGYvCBoVpShjhPvCvFm64PK64adLNwsbMJij4isde6I4rjPj7jgULgdhJsk8UJARdecMSzSBq1oOyc8NLAQZ_YihqZ-SRfIF4Cb_5rbx1t80Som1DOHox4g5nxNH3s7QnoBefq7pyDnkgA9xpfi-R7tWvsgKAXiIUoNhsgkfq0koClh2KsQi-MyAUPeQNrDchecORhg=w236-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesoriosm);

        new nukaccesoriosm.precionukaccesoriosmAsync().execute();

        precionukaccesoriosm1 = (TextView)findViewById(R.id.precionukaccesoriosm1);
        precionukaccesoriosm2 = (TextView)findViewById(R.id.precionukaccesoriosm2);
        precionukaccesoriosm3 = (TextView)findViewById(R.id.precionukaccesoriosm3);
        precionukaccesoriosm4 = (TextView)findViewById(R.id.precionukaccesoriosm4);

        nukaccesoriosm1 = (ImageView)findViewById(R.id.nukaccesoriosm1);
        Picasso.with(this).load(urlnukaccesoriosm1).into(nukaccesoriosm1);

        nukaccesoriosm2 = (ImageView)findViewById(R.id.nukaccesoriosm2);
        Picasso.with(this).load(urlnukaccesoriosm2).into(nukaccesoriosm2);

        nukaccesoriosm3 = (ImageView)findViewById(R.id.nukaccesoriosm3);
        Picasso.with(this).load(urlnukaccesoriosm3).into(nukaccesoriosm3);

        nukaccesoriosm4 = (ImageView)findViewById(R.id.nukaccesoriosm4);
        Picasso.with(this).load(urlnukaccesoriosm4).into(nukaccesoriosm4);

        btnnukaccesoriosm1 = (Button)findViewById(R.id.btnnukaccesoriosm1);
        btnnukaccesoriosm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesoriosm1 = new Intent(nukaccesoriosm.this, nukaccesoriosm1.class);
                startActivity(btnnukaccesoriosm1);
            }
        });

        btnnukaccesoriosm2 = (Button)findViewById(R.id.btnnukaccesoriosm2);
        btnnukaccesoriosm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesoriosm2 = new Intent(nukaccesoriosm.this, nukaccesoriosm2.class);
                startActivity(btnnukaccesoriosm2);
            }
        });

        btnnukaccesoriosm3 = (Button)findViewById(R.id.btnnukaccesoriosm3);
        btnnukaccesoriosm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesoriosm3 = new Intent(nukaccesoriosm.this, nukaccesoriosm3.class);
                startActivity(btnnukaccesoriosm3);
            }
        });

        btnnukaccesoriosm4 = (Button)findViewById(R.id.btnnukaccesoriosm4);
        btnnukaccesoriosm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesoriosm4 = new Intent(nukaccesoriosm.this, nukaccesoriosm4.class);
                startActivity(btnnukaccesoriosm4);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesoriosm.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesoriosm.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionukaccesoriosmAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cfe13bb92cca9cb7db35f928eec0ff09";
        String precionukaccesoriosm1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=58b947e1008ca38b929f5b34be1d6cb0";
        String precionukaccesoriosm2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6fc54a705cd7da049b54b7170a6c47f7";
        String precionukaccesoriosm3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=51fc53b57171bc141562d81c9e204952";
        String precionukaccesoriosm4st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionukaccesoriosm1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionukaccesoriosm2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionukaccesoriosm3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precionukaccesoriosm4st = metapropoerty4.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionukaccesoriosm1.setText(precionukaccesoriosm1st);
            precionukaccesoriosm2.setText(precionukaccesoriosm2st);
            precionukaccesoriosm3.setText(precionukaccesoriosm3st);
            precionukaccesoriosm4.setText(precionukaccesoriosm4st);
        }

    }
}
