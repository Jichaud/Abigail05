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

public class nowymobiliario extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnowymobiliario1;
    Button btnnowymobiliario2;
    TextView precionowymobiliario1;
    TextView precionowymobiliario2;
    ImageView nowymobiliario1;
    String urlnowymobiliario1 = "https://lh3.googleusercontent.com/vcS6J_yWwPa51HJ8KyxSJ4F4xcrigVpY704Jm2Z2Ckzc-Gc7cc0bHE5DY6lzmuK5hNq7zEyuJNVEvRET1fjLjWw-c3FuHZLDS9zs42BCsdk1E949oraz_TbPMG7bST-WFnQ_MMpbGK5mvTYvPKjf5ah8L2iTAkj6LbVfbVHGPX7JlGx6g73dLMJOHbJnzzfyLA9STzXpH2JrDN5pCrE_I6WFWaQeabjYDYY6_3EYmMzQD7Y53HPhtyhdw7Gb7Sd9Quctf1kp07H_7wXFoq-FayKjo-dJZU_Wg5mzXEVCuRYgSijcRPpj0mDwsdDjXGaaYE_wROAEbwwq9Mf6DSPGZvMk055isbyICsFQS1PRo7z7LLeWxZmgaoofEZJ6Mdri6VtmiYqtJ-WaHpieJzYcT5XKqCTb1tA2RuU0RKkpI_1MQezxYFUsU6tFBuB2siHia47LFEZ97pbaJJ85DIsP70YdnwEowotIA8c_1rmw6soyUFDTMfMUdfxTLe5765IiqXMsfBSFNy1n7Fu4QvZH88m0heg1sXqrC8cpPR7ZCJqQR7caJxtOKr9RIInfZDurAMEOkflpOUHOYBHcYWztSNoHSIctEh4BMIpN5qIs1aYwcpBh2g=w342-h725-no";
    ImageView nowymobiliario2;
    String urlnowymobiliario2 = "https://lh3.googleusercontent.com/0I-TJ1svaGbuzFJMumMBr2zDWGWPp_t5rkq3yyr_C_1oH_PZLZiCMjH2rgX2GC5BPTcqt3643UVUfYsoCGuhClYYMRsAQUbmxdi6v67YuAit26SSvRBPyAJ8xjMERLr5AQEL-PB_6wSjPXRKOn8pvX1nNlmzIhvHEicxJI5dPclthDOFBtiwr5Mf49Fq_S57XljtxVL2eeS7rQ1Q5LOgVHu3faHz2Ul8V6CadjywRo0Vw_kIumaY08S4EQyJWy3vOuYsdVo9Gj9DEPIsunWYNlYTeozr8NW3gpqGEDTkXYk_FY9txloWI_iyTt7EbYc4KbDq70vLWzhcAItEu1jMR0N4SOA2w_8jakWIMsioGRx6cZOT_tGJJXyMRZrhcstJaPa2ZtjIHjsd1u9Qc-3lUfzyOuOXt1FfseZEuOKAcUnt4gQmFBbmyz-D5xjvMpH6a1eXXIAuqm8zHuwDpLQF9fLXq59hXSkZHqNi-_CW-PuBn19uWRQHDHmyOX7wpX6vqc3wNylToWDn6y6FpxDvFanToHS9Rc5il0OQD9s0T9HtKHlTpN73T09cc5meglTCyOqbR4Q7dT40P45LWjnq5lnND-IMX-OXFGIU0mK-OFUbiV0g6Q=w342-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowymobiliario);

        new precionowymobiliarioAsync().execute();

        precionowymobiliario1 = (TextView)findViewById(R.id.precionowymobiliario1);
        precionowymobiliario2 = (TextView)findViewById(R.id.precionowymobiliario2);

        nowymobiliario1 = (ImageView)findViewById(R.id.nowymobiliario1);
        Picasso.with(this).load(urlnowymobiliario1).into(nowymobiliario1);

        nowymobiliario2 = (ImageView)findViewById(R.id.nowymobiliario2);
        Picasso.with(this).load(urlnowymobiliario2).into(nowymobiliario2);

        btnnowymobiliario1 = (Button)findViewById(R.id.btnnowymobiliario1);
        btnnowymobiliario1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowymobiliario1 = new Intent(nowymobiliario.this, nowymobiliario1.class);
                startActivity(btnnowymobiliario1);
            }
        });

        btnnowymobiliario2 = (Button)findViewById(R.id.btnnowymobiliario2);
        btnnowymobiliario2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowymobiliario2 = new Intent(nowymobiliario.this, nowymobiliario2.class);
                startActivity(btnnowymobiliario2);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowymobiliario.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowymobiliario.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionowymobiliarioAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3fad8cc6d03112eea304f40df50f8007";
        String precionowymobiliario1st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionowymobiliario1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionowymobiliario1.setText(precionowymobiliario1st);
        }

    }
}
