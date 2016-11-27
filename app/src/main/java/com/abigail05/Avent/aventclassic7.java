package com.abigail05.Avent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class aventclassic7 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraaventclassic7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=505a17be43b51768a520b322981df9f4";
    ImageView aventclassic7;
    String urlaventclassic7 = "https://lh3.googleusercontent.com/5K7j0yaCZsx-UFPkU098eAdvtCyDj0dCjVHdirrKDATeNJMwOWYqSQ0djpShzhHV2Eyjb-kMAaf8Fbf3LkNfdgzosh2FTrGjFYxVV6YXNEHzE-CgERWKLNWMd_ArERYPdMljSh6iQMUAjJd3z9lUkTU4P6-kfUMAU6Colhu_Znl0T9efw-K7HQlNaL-qrJkfUoJobCmjg5U59zznkn_qDHrjd2NgTdWwdrs6NhL713X5Oo3-CSvfr9QlAngToYDseWfw-xi36yRhlZuxT8NXixs3_1XV2Vf7l-7xDAiC8qtlO18bCvQJLWxjvq-ni-hyyPmce3FwXGL-DXhQIFqfK-17qu259IhUaRSbnH_gy-yE47s4GU3u3Q43B7piPufzABAd-JiVJJIIxqqv4qHhGPdFZNbuTVZXoipHtBap3zLmXQJ6YYy7esyqxIElBaUpq0FMgMVXaoLx-e_6iPXUn-Bm3C8MfyfdGtDX-zE1lr41ZWZDJ8QIJFcZwLRSeCf4WDoAFPuMI5axrtR_xVJBM6hIZ8HmatBZhHMDFZUOH-p-b_-tTkCQbfmun7kFeXbe561lAc6y8zVtqIzVf0Y9xphyOcAnjgVkOqPt6bb78G81u3UAjQ=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic7);

        aventclassic7 = (ImageView)findViewById(R.id.aventclassic7);
        Picasso.with(this).load(urlaventclassic7).into(aventclassic7);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic7.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic7 = (Button)findViewById(R.id.btncompraaventclassic7);
        btncompraaventclassic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic7 = new Intent(aventclassic7.this,webview.class);
                btncompraaventclassic7.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic7);
            }
        });

    }
}
