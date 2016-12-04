package com.abigail05.NowyBaby;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

public class nowymobiliario2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    TextView txtnowymobiliario2;
    ImageView nowymobiliario2;
    String urlnowymobiliario2 = "https://lh3.googleusercontent.com/0I-TJ1svaGbuzFJMumMBr2zDWGWPp_t5rkq3yyr_C_1oH_PZLZiCMjH2rgX2GC5BPTcqt3643UVUfYsoCGuhClYYMRsAQUbmxdi6v67YuAit26SSvRBPyAJ8xjMERLr5AQEL-PB_6wSjPXRKOn8pvX1nNlmzIhvHEicxJI5dPclthDOFBtiwr5Mf49Fq_S57XljtxVL2eeS7rQ1Q5LOgVHu3faHz2Ul8V6CadjywRo0Vw_kIumaY08S4EQyJWy3vOuYsdVo9Gj9DEPIsunWYNlYTeozr8NW3gpqGEDTkXYk_FY9txloWI_iyTt7EbYc4KbDq70vLWzhcAItEu1jMR0N4SOA2w_8jakWIMsioGRx6cZOT_tGJJXyMRZrhcstJaPa2ZtjIHjsd1u9Qc-3lUfzyOuOXt1FfseZEuOKAcUnt4gQmFBbmyz-D5xjvMpH6a1eXXIAuqm8zHuwDpLQF9fLXq59hXSkZHqNi-_CW-PuBn19uWRQHDHmyOX7wpX6vqc3wNylToWDn6y6FpxDvFanToHS9Rc5il0OQD9s0T9HtKHlTpN73T09cc5meglTCyOqbR4Q7dT40P45LWjnq5lnND-IMX-OXFGIU0mK-OFUbiV0g6Q=w342-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowymobiliario2);

        nowymobiliario2 = (ImageView)findViewById(R.id.nowymobiliario2);
        Picasso.with(this).load(urlnowymobiliario2).into(nowymobiliario2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowymobiliario2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowymobiliario2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowymobiliario2 = (TextView)findViewById(R.id.txtnowymobiliario2);
        final String stconsulta = txtnowymobiliario2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowymobiliario2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });

    }
}
