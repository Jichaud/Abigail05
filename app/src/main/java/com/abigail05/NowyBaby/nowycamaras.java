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

public class nowycamaras extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnowycamaras1;
    TextView precionowycamaras1;
    ImageView nowycamaras1;
    String urlnowycamaras1 = "https://lh3.googleusercontent.com/-XY36FcuiXKv-qLPgCQaCEp_hlgppZql9r5B_HN5ucvOEzOXw6JQMamIW0PAMGwq4lgkILB_wKCDWGRmgfeQR_3t4ljVPObu5FyPjdRpIMEguNBMoMeOwdENZcNy4BQXK4YcJ-sdqbhoSE-dy1do_1sOwL62NAooIloCj-Axq3IRqCIny5SU6SW4C1hzG0u5tuQ3qtd8mPA1mhpoQI__8aQPXURJWWz6u1japoZR1Vk11r_QM2UPhRLF4GS4DAQ2ZL5wZDtexyUqSPCwebYCXy5Yakmd9unbO-AW2e-VwPDrgxO_rBVVXUlh0vGaFilqR6Ub_1_xX7hlWtqfOkQCV5SHyxBpBuYYN2hl71DFmrI2_njQ8h-XJPA10PMWOtq-2FmmPh0q5umQJKrC70pkNIAz_-PL_kqZ320Gj9T0sEG6BcfrsiBg8SPdbGVMJ4Md22IJbBIoSAxlSkLgt5HejLhAgCLH9soFZwMFzOgJIFgRwB2fHSF7KSx0Uu_OI4YERiw3BhF6aoEnDeRYYRBnzggP79Tp2GvpCQiuZK--JP66d1BX08JCJlMC0fAqnUU2QY0wevcl5wM8ECwklYz53chyTJS--1c6h-lcT79y3u0ALtb6Vw=s590-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowycamaras);

        new precionowycamarasAsync().execute();

        precionowycamaras1 = (TextView)findViewById(R.id.precionowycamaras1);

        nowycamaras1 = (ImageView)findViewById(R.id.nowycamaras1);
        Picasso.with(this).load(urlnowycamaras1).into(nowycamaras1);

        btnnowycamaras1 = (Button)findViewById(R.id.btnnowycamaras1);
        btnnowycamaras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowycamaras1 = new Intent(nowycamaras.this, nowycamaras1.class);
                startActivity(btnnowycamaras1);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowycamaras.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowycamaras.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionowycamarasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=abb4419289ab9df1ee35a6012e2f3ab8";
        String precionowycamaras1st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionowycamaras1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionowycamaras1.setText(precionowycamaras1st);
        }

    }
}
