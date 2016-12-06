package com.abigail05.Gamise;

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

public class gamiseconj extends AppCompatActivity {

    Button home;
    Button marca;
    Button btngamiseconj1;
    Button btngamiseconj2;
    Button btngamiseconj3;
    Button btngamiseconj4;
    Button btngamiseconj5;
    TextView preciogamiseconj1;
    TextView preciogamiseconj2;
    TextView preciogamiseconj3;
    TextView preciogamiseconj4;
    TextView preciogamiseconj5;
    ImageView gamiseconj1;
    String urlgamiseconj1 = "https://lh3.googleusercontent.com/qdOMskkkQYlIBXzDPuyq7cSdEbXC_9aLLO_HSpfHP6n6USRM05TkO2xGyp0WcLJk44n066CL8fCmAKA0yM7yStaf6ztGNY0rhhg8EaN8chCWhQg6Ou5kah6PM0W9y4CLQanMSNr0p_2nrTYb3sspU0Rp7db1qQfXNdfnqS0uJlzFeEc5V5f0QR2-XqjwG-03HWMg3WwCS6vb08NPGYiv3R1Pc2RUNVL9AsTvWOyNw2-qsvVbrCWcCK-nOi8lMVEtaXmWVdzSbZWPdwYvem4zPRBogFUFBpilgYdaDpXtvalsfZA0PxQmaQtJJbpFCaZwifMpxSj1j0jJUDah9N7igPvYDMSbf6GnmVAJs_Z35-E5pUgjrnQv0DELiXcAsUUQb3OZrDzPT56bU3R7kL5dKghRnU7x77d2mxUDZhLvuzTPIA0aLCkx1pxh67qzOp2P07IP0Csa55FjixiDmXANVuT3Sh10Jye5NqeOwKPtjUlgLbthqR4z9A17S97-OBvDjpmBkF-2Uxyh4oPs39mfJjldrGH1VWKabDcCGM79V2V4bvI0VLcYDM89ZKa6Z2Ox4htJdQBXPUm544uv4M_ZWloMoehywMkOnmxgQ5T-dUzuN-p_jODQthCiLrhlLxKKXpe4mP-kzTIqyjy_xRLXsc85fnCIBajq34tFKD_Vwa0=w400-h386-no";
    ImageView gamiseconj2;
    String urlgamiseconj2 = "https://lh3.googleusercontent.com/l4-7WxZqOR2_uxOsCkFej_NRgBudV9GNMhMZT3mY7vTnIYM_ShtpSKQIrUVzKntDA6S_6AV7LwfFLC4_8HGxKsJwOjHJezdmFO_vq52pzI4duGrpEz9mVBUoiRHWZbnt9y1Uh48Ip62oBdHLiFNmFYcqnVhBS3xQ-3bKimo8JGanDVEZlOTJzKya1bYKD_PzqeL0uO4GEs9nCKuyvdf6s5rZsZtd6_U8WCYbQne0fiWwQOHVVCmII25vr9kaMrxGDZVmn9vt0yEIm8O3xuKtu2sucJu-VZZ4ZnsGxWik_9MARKTdiI-kbUzGFMzn22QAZbM9k2Azw44Ac249zSQY3hYfF2InvR54bCBrMp07dphipGKvq79HzPVb2tcwNRlEjG0ANECydwVjjbRcUTsPu93kb4R2ENKEgL1z8hocBgn2dD-Hqk9TsbmHiv-eAm-MRxWmel6df_vzvutcjd-0_MeV_B0W0zbkQTyb9_NLNL_Skd1aIpg-8lVZuyYm8w3vdEK932xbVmd_VSvEapya0sTv8TnqHQcscO8NQ24laCn5wZxM8foqDDLXAwCOIcAhhEOKQ5PLUtEB_TiIopdLTZ1AfwKQa_SIgRor78zFoJKGivKpGb1dJXawsZpinV_GX-wREu9Wt4yBh4PIVrP2SO0xCwE2C1KftIyz5F4Tdfo=w400-h386-no";
    ImageView gamiseconj3;
    String urlgamiseconj3 = "https://lh3.googleusercontent.com/8j36niTLz1SuwtxGrmdU9ONXFWUOzW4mvGUWSVIeFQrdR5NVWoJCRlzaI6m8qiWQfZrxIpzXWFM9eesOmb1pOlLf0vCTeFdlo9FtDcufsNa3zO9W72faCKcbdl3kumefiA7l1ijVIzuZgPf5tqBYsVWcDzmNWC1XuUfwU-q7CNBDKGy5iu31EfBwQ-z0V5pFCSeitnLiYy7gedUswLwpCudQPeLghuRlxa6eTQoNTk_UC-B0xVL1sNO6u9Sc8LenR8lw5VPeThNxJlp6uqAtMMvONKtOveHluwq1JyQxf7Ttrn_TKEfxrnng797q9mI7wEbPHGg1u-43Sor45ZeskOBVBApngIAKjC4DQvBamKIvUwkUHgQfIaLQvxG0D3TwM67JBwIhjGmRBvdCRmStrIZfU6j4bLiK17bUPUqZiTmV0NaZqpzQlPfJEbKb7ckoE-shsIcYbVPVjVrL8fLBZl3WRQScfWtTIeWmuTzLgItO7lDOW-wzuTJR-K3kj1KDONAcI30AzZUkO9zhyxQQcHz7MijTYRQvh4ssY4b2bPokFWoQ4qnmGVHLoNsOJWwarf-dG2q8xg9nf-MnfLXtQ72oTtG1gvxaz1B9Ulz53EHeXxk9RY9SHWap2UAWAww0COYrl2ZjvgEzNhvo9DkNj5NCWSADlBUF7W6yDqdJzOE=w400-h386-no";
    ImageView gamiseconj4;
    String urlgamiseconj4 = "https://lh3.googleusercontent.com/wc68e3441u_ZgqBCcUYkf95wlPqDmaBz8UKgN6iQnRSshZE2_opy9COmLDTMQUGxEnsitkR4KVhP5WBsKblKyvxxuPiybVsq1fOrNa_1Lr8O6EwsDshA67PCQUNDkypMsbvqYS3-4adztTodW8Zm9E45fPdTttDQgFhVnbZVVo0Un80CO_sdQ_qX7HzXFEHX0Y8cBEbFRun-GHGvndKhf7x_nw4smC0aKDo2yIVzOHMat7rTx4GYnxBS2bKVV_p6OCCOVKH9Sk7al3UeEA4PfbgeDhsTCnbYOc1KLDuJ0Jll9SH1QdncOwls7FspXyOOynx6gicB84pTWUn7avohifRmV5rhL6JWg1fmdjXvA1GbmZ_2PDMV5RD_H44RM-BOY3TMtzqQ9Sm9irMuU45mAqeOCU7srF2xKcVLfC5zxGxrziaOlHX89o6YXEuDrvRRBKiP9FMcYzKy9CpfrK5ufyIPrb0Ycb-p_0x3dlYFjAehussqkiRB69DI4Zxs4VKLRayquBSkL_bOe7HYGZCzytI7SoH12WA_cDdk4s9gPbMV8zWl8MGwKPOjqBlSnaMl63vDA99acA1JWNgxyhPsehF_0DrXKzTuBeXJRhNRGUR76ByTlfDJTnH6UScGCOOGYavA7lJq--XYAZf00rY5WEWU726GEmiLEbi7ErW1wC0=w400-h386-no";
    ImageView gamiseconj5;
    String urlgamiseconj5 = "https://lh3.googleusercontent.com/EXo1Qivb3OAH1FAgKkdE5VIIFG4UZ0sqK5GE1m4qqn6QWN0a9MRFUK5EXxH6Dbez118VKWYcY2UaSrNwyMe-eQ_iusOnrf0NYiVpP4xeS599Ahw5rqbdiZFzHDLm3rU_V4U50t-fEYNidnnOq6WWSH6rfDlKTC-o6H_eTvpz00ynl_fSovb1BVgzXCrKvSFKTV1NvuyHCejH3ygcLzso670sgiZrmnGaMP5DqSoYrzNL4OGbNohD-nBPa_Reogikb067l9KFwEr2cRUatxsgdc_Bf_13azpPNoaORqGWIfv2uBJ3wSUGLQ62gZEmOGS0BDfCc2BA4DpNxEl68oYFPm-mMykiQ4DGR8in3QXWjC2YhWiTqKmIAePZaTg8Zsfiy6edyYb0jLGp80A3mmvFIqYopFyXIz6bKbMhQpVLB7g81hW0iCPWVTVzJ1J_8MJ8cS2kUBkakJ7r_Pm-BszrF_TOadUr0X5D5uyx9at8L9PNgQZ-Wip4uI0tUEJq7NK1SrbjohKwu3fLEv7-UOlvDEgdEQpaE8fZP_GXwz-vFliWr9sOwMPzjPmHXFhD7UxBS60Pyk9_dH8u_-ybq8NJR26Q85M6wJs_XhPs3vksH67GFEF2v5acsNcNzBpRqO8mmjhHp3A_ALOWCQ6qWEUvEukfkKS9G6mimbWMB2fg-Gg=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamiseconj);

        new preciogamiseconjAsync().execute();

        preciogamiseconj1 = (TextView)findViewById(R.id.preciogamiseconj1);
        preciogamiseconj2 = (TextView)findViewById(R.id.preciogamiseconj2);
        preciogamiseconj3 = (TextView)findViewById(R.id.preciogamiseconj3);
        preciogamiseconj4 = (TextView)findViewById(R.id.preciogamiseconj4);
        preciogamiseconj5 = (TextView)findViewById(R.id.preciogamiseconj5);

        gamiseconj1 = (ImageView)findViewById(R.id.gamiseconj1);
        Picasso.with(this).load(urlgamiseconj1).into(gamiseconj1);

        gamiseconj2 = (ImageView)findViewById(R.id.gamiseconj2);
        Picasso.with(this).load(urlgamiseconj2).into(gamiseconj2);

        gamiseconj3 = (ImageView)findViewById(R.id.gamiseconj3);
        Picasso.with(this).load(urlgamiseconj3).into(gamiseconj3);

        gamiseconj4 = (ImageView)findViewById(R.id.gamiseconj4);
        Picasso.with(this).load(urlgamiseconj4).into(gamiseconj4);

        gamiseconj5 = (ImageView)findViewById(R.id.gamiseconj5);
        Picasso.with(this).load(urlgamiseconj5).into(gamiseconj5);

        btngamiseconj1 = (Button)findViewById(R.id.btngamiseconj1);
        btngamiseconj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamiseconj1 = new Intent(gamiseconj.this, gamiseconj1.class);
                startActivity(btngamiseconj1);
            }
        });

        btngamiseconj2 = (Button)findViewById(R.id.btngamiseconj2);
        btngamiseconj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamiseconj2 = new Intent(gamiseconj.this, gamiseconj2.class);
                startActivity(btngamiseconj2);
            }
        });

        btngamiseconj3 = (Button)findViewById(R.id.btngamiseconj3);
        btngamiseconj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamiseconj3 = new Intent(gamiseconj.this, gamiseconj3.class);
                startActivity(btngamiseconj3);
            }
        });

        btngamiseconj4 = (Button)findViewById(R.id.btngamiseconj4);
        btngamiseconj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamiseconj4 = new Intent(gamiseconj.this, gamiseconj4.class);
                startActivity(btngamiseconj4);
            }
        });

        btngamiseconj5 = (Button)findViewById(R.id.btngamiseconj5);
        btngamiseconj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamiseconj5 = new Intent(gamiseconj.this, gamiseconj5.class);
                startActivity(btngamiseconj5);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamiseconj.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamiseconj.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciogamiseconjAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=83ffe8f8916624649c969b3c16dbff9f";
        String preciogamiseconj1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1f2aa2402485291f92142eb05b5703db";
        String preciogamiseconj2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4630b370798efb9b4d7fbbd6ce7dc8f6";
        String preciogamiseconj3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=797b1cf70c01286b19d8ed2e72f3f685";
        String preciogamiseconj4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=60b74977b5d86e678b4e3a75ef5f6ed7";
        String preciogamiseconj5st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciogamiseconj1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciogamiseconj2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciogamiseconj3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciogamiseconj4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciogamiseconj5st = metapropoerty5.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciogamiseconj1.setText(preciogamiseconj1st);
            preciogamiseconj2.setText(preciogamiseconj2st);
            preciogamiseconj3.setText(preciogamiseconj3st);
            preciogamiseconj4.setText(preciogamiseconj4st);
            preciogamiseconj5.setText(preciogamiseconj5st);
        }

    }
}
