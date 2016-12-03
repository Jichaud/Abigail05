package com.abigail05.NUK;

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
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class nukchupetes3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukchupetes3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7b14fef3b1db3423237daa8f2316ef79";
    ImageView nukchupetes3;
    ImageView nukchupetes33;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtnukchupetes3;
    String urlnukchupetes3 = "https://lh3.googleusercontent.com/yO3ooeIqIES1TIh6WRLftDjtQHDMBi58cBuIpQrMQhN4i8PHjbZTRbJlx_Sh7PB7ypTQsa80Yn18oJ1_r-sxIXdTsHavrG9dzBOMa1cEqTqrwWITGV8Lc94tWgUgN0r-bw_4qwzu7ztucgWsV6blUfBZLJVMb2pi_e6Eg8QURn9TL647RWzLSVnh6vQ0QLVNotFMLkBCdAYaB2P4DhxLtLO95FsNlZZPFW0AN657-P6yGh6kwOABwbTNAgBWdryg1yj7M3gXQU0NCGbPQbREKG1JhrXAXT5u9FtDx4ZKIIqiN65arVW9kPefc-KoPFVZHfd3n-qnjTe4Tqe-rd4lZHAu0eaDAjL-upuxx8aJpxeXThO3AVLTiehdYGMDu3x6OJC7Ey0pOxqQfgT6lDoZnys5aAuvhJ37eGu2rZoiHrblS5AIOJVFLZ8U7nCAmDyN76uRakE9oBoO5i3OMKVDaSsBH2VU87ZI5EdIzsrAdJdae3CUJL5S7xyVQXKbzTOE4l_r6s7kCwFp9SXPZzEBhs5JGxxUSMvkSCVLo9Y775pPLxpChc2QJc5osyQRxgx9-qVak8uAb7Gn6DC3zqKBIsjtJ6WRfBNNGuBHcEOqeDo3cfSyMA=w417-h340-no";
    String urlnukchupetes33 = "https://lh3.googleusercontent.com/PM3xCmVNhyP4PXL18djHp-CX4WIhEJo69zUFc0LEtFzJqtw1Wd2wKIpenZD0eXZlIka3Cocpz6D6wXtyGdypTxNMDGt_BCa9DmrTg78VkH0btYinBjxddx2FLG4peb0iesFSRI-ay0vTF4JGY777OpUqi0ec5gcm4bo9Xsc8iXXXVZATWY5Hr5a4z_-G_Kd7CdQqPWarQuuaxSisJgamYZRc7UML1_CdR-oEHPBMhYERVgvFMH_5FxiAJkHqu3ZdHouwg1PSX1nDBErVlww5xknCL_9_TYnzK9czBHfDArotzaixZMHmA-JjuKZPygFlBKOg_mUQdOzsZm0BzmND-PuQHpBRO-6c66apJp-2mfr0O1PW7Wy8vRA-D4jzlKQPYeYRqn1w3PFQx3FY2-cOGyz40_INl80jFDcJVP3Hkv-mZMHb4Sr3j4dp_W5W8n8EvOLWdZYqxHvLHIPni8HasxfGtit68tZwZ2zgAzadT-JOkTwZzrG4Y15SNc3z5w1svqbn7s11IG2NLZwPOcJ9gB2vR0VrzR_YjmQQSsJCP7fpp5zASzfMNzI-hipnYdxB-Rtk0Y5um6MLhle0nT9Ak1X4269oW1qAZ8lZd6anSi0uYuBj9w=w409-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukchupetes3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukchupetes3.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukchupetes3 = (TextView)findViewById(R.id.txtnukchupetes3);
        final String stconsulta = txtnukchupetes3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukchupetes3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukchupetes3.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukchupetes3 = (Button)findViewById(R.id.btncompranukchupetes3);
        btncompranukchupetes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukchupetes3 = new Intent(nukchupetes3.this, webview.class);
                btncompranukchupetes3.putExtra("string", urlcombo);
                startActivity(btncompranukchupetes3);
            }
        });

        nukchupetes3 = (ImageView)findViewById(R.id.nukchupetes3);
        Picasso.with(this).load(urlnukchupetes3).into(nukchupetes3);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes3.setVisibility(View.VISIBLE);
                nukchupetes33.setVisibility(View.GONE);
            }
        });

        nukchupetes33 = (ImageView)findViewById(R.id.nukchupetes33);
        Picasso.with(this).load(urlnukchupetes33).into(nukchupetes33);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes33.setVisibility(View.VISIBLE);
                nukchupetes3.setVisibility(View.INVISIBLE);
            }
        });

    }
}
