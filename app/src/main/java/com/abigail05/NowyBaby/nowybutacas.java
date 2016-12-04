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

public class nowybutacas extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnowybutacas1;
    Button btnnowybutacas2;
    Button btnnowybutacas3;
    TextView precionowybutacas1;
    TextView precionowybutacas2;
    TextView precionowybutacas3;
    ImageView nowybutacas1;
    String urlnowybutacas1 = "https://lh3.googleusercontent.com/91MnOYXFgx10py1JD1z2iCtIa8URs5xVlnT37tsmEGUFEEaOU7fz856-yYcNAAir42xob9OcyY46IGH7C4HhA0k9Z9Qqtooezd_NqqJquJ3Bq7B8gjm6EpDUkIP-MCrXiX3XMiEvPsAVZZZRsPyai_xOqwrk2G0jstjNiqeUWNcFJvTESiWz46P-cmtQhRQwdd8p2XAemW4O9yDRbjPagCIfhj_5k-yJJisawNvf6cg-DXY4EmSH3rb1sbhYc8M5iR9FrrPFpg-R6TNv-uzmyjIz95gUoM5qzDIakDg8hhox06ZpCLEVt5fMQvTtvRXWjiz3BPuweEkV3zd-T0Igh7L5gyCpW4uR2VWrQuvkn5hdvKAv_vOeyYr0heMoc5RqzeydAEDt8S-UGfrttLb2h-KrtcA7tWLvQHs26SwtLOSZW2BWaJjzXH2zC9kinXFRKJPgh0AF5dwVdkVWmpHKD7IRUzRdS8mH0eeSX3j4IvBeoUH2xcAxhhi0wTNm04cLxQIHOdLWQFASmlwvc_lEfdFsEqC2w3rXnf1Bdk1tHAGMxTie2mM75X5CF9QjosqRWQErAvsrbEUAmfBrVqwAdiGySMQHYPybZjGm2DxIFGSUDdEKhw=w360-h480-no";
    ImageView nowybutacas2;
    String urlnowybutacas2 = "https://lh3.googleusercontent.com/-4gDyrEveohYhBjzIfQ2juoysa1oIVqMbf0MAbo8-fl0ZJuKLol5su9dUgsCHkk291UmLru1JqQJf6uX5DmrD9T1XI7ZYGE0fIo0hMUFw_uABXQfyDcXqAoA8JXXyRy0DxvypWkyaAKC2C-lVLFTdDDIgGJZhIG3t0LzqycXbojNvC6_RRqMYzXVRJhCx4aom7f_ShiH18LAuwPGonISd64_mITudx9ljSFCgcizl32oka-tfbcz3_0PfCFyo8F9G4t3k-R5Epv_owcj5WbubK-faLf8hF4iOSMCweidZ3Az6I1zmFhknkPWQswCNAXXWtZ3k6yyrrEEB2CKub34IUbDnVhVV5vovMUoN-IfyCSPpJc40Nv9VZ6TkduxWX-EGDoDu6YsttbyXxGYqjtaOAoE9FBq6IgqLaASdkyZVj8ty9Xx1vOualYYlD34HJOCF4JQFSGkVE6aB27fg1_7DFNoVpqVUh07c48xn8iyHpZ_MVj0B6MFRQoqZG_I7TXVQqh_kIKG5ojaGQIKoFSQtT147IS7ZTbmJ-YLnDlo4P7OnrT_KhySUD1c78WWOZEqEpq3culyHzOHi2G9nXnZJpzHD5kdflZPoIEXPslGz64OoeaACA=w352-h480-no";
    ImageView nowybutacas3;
    String urlnowybutacas3 = "https://lh3.googleusercontent.com/3ZhLpV80kSwHfpyNkzDf4kKwWhtGdrfSG0-XW0n_mjSKwf1Ymtw3RdfxUzpeyUe4IgE6_UY5ycHk3RTtnU7CWKQrMiqRdG6JRwYAAaBaBV_tPWkBzXhhLTlUdCWj4gX2CxdvE4n1gxDNyCmv_NEYpZbwkNTEW-mumQ4VbuXaEwiVoptmIUGIIky6dWSVGJA6fsH8Nt-1zM73UAJ1yIdkOtMS691PTxVT5RSdtzAj-liBm5uCSNJrb-k22iWAmXsu4P--byhDYR2aFGgT2OndU_aZQHcMN14K90wPUUNSFa-RV8h-nYuHpS4IDtx4WTzF5WyitMJD4lMtMPmhqjrOOl0Kz44q-njs32Ri-jE4G5DtLtHYEBlBY-LmuZDH7qu6VEntKEUycOTcTZFjLREhG6v28AP58DliKehHJFhPcL-iapPhPuli0Py0PUINFbM_hugtBJg8_Ly1AHFbHyIDh3Wrae997JG-mLdVvmAsabvvDzmun-iv0XM_CmPiO44f6MSUejReTVF9-N5b5MNPkDMbNUa1S7yd64U_LdAm03ldB24xKsfdKW1yUAOhuEURXVuLFJq12hir2VB5sGc0k_3DJtYQSiVkYFWaaGEzBUy1_MokkQ=w500-h372-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowybutacas);

        new precionowybutacasAsync().execute();

        precionowybutacas1 = (TextView)findViewById(R.id.precionowybutacas1);
        precionowybutacas2 = (TextView)findViewById(R.id.precionowybutacas2);
        precionowybutacas3 = (TextView)findViewById(R.id.precionowybutacas3);

        nowybutacas1 = (ImageView)findViewById(R.id.nowybutacas1);
        Picasso.with(this).load(urlnowybutacas1).into(nowybutacas1);

        nowybutacas2 = (ImageView)findViewById(R.id.nowybutacas2);
        Picasso.with(this).load(urlnowybutacas2).into(nowybutacas2);

        nowybutacas3 = (ImageView)findViewById(R.id.nowybutacas3);
        Picasso.with(this).load(urlnowybutacas3).into(nowybutacas3);

        btnnowybutacas1 = (Button)findViewById(R.id.btnnowybutacas1);
        btnnowybutacas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowybutacas1 = new Intent(nowybutacas.this, nowybutacas1.class);
                startActivity(btnnowybutacas1);
            }
        });

        btnnowybutacas2 = (Button)findViewById(R.id.btnnowybutacas2);
        btnnowybutacas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowybutacas2 = new Intent(nowybutacas.this, nowybutacas2.class);
                startActivity(btnnowybutacas2);
            }
        });

        btnnowybutacas3 = (Button)findViewById(R.id.btnnowybutacas3);
        btnnowybutacas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowybutacas3 = new Intent(nowybutacas.this, nowybutacas3.class);
                startActivity(btnnowybutacas3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowybutacas.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowybutacas.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionowybutacasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1716998a91c758c3b10d0a927d7be3ee";
        String precionowybutacas1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=72a4c974323665e43c3e40732720a1f0";
        String precionowybutacas2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=114c273ed9baa0361ef157c6f9e5ba4a";
        String precionowybutacas3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionowybutacas1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionowybutacas2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionowybutacas3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionowybutacas1.setText(precionowybutacas1st);
            precionowybutacas2.setText(precionowybutacas2st);
            precionowybutacas3.setText(precionowybutacas3st);
        }

    }
}
