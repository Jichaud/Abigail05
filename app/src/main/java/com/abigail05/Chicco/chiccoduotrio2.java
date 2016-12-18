package com.abigail05.Chicco;

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

public class chiccoduotrio2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccoduotrio2;
    Button btnconsulta;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView chiccoduotrio2txtdesc;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e29dbdebd15b27b8fc030402d90939b3";
    String urlchiccoduotrio2img = "https://lh3.googleusercontent.com/aLCa2bwglHwByQrvQ4HkbTT5UtRQvmGgeZnqorMR49fnXTxVY4-gpkA7Oiqqxh8WLOOuox8yz37qwM-9eNh045pNK_tFrE5ap_nOMC1doqLg1cP96PVdNJ1XS9vh85bPSFGFg80yrqO4Dbp0pSQ4EGtDDWHn5vMQiLBgzzMSM0vOXLKUtydgLw9dBxkUOaf8Nw9mMIVbhGf0c7NXxdq-gb18kNns58aZ-meRZpXsAQ2Oc_-pDH13zdjUGcMWfNgL9EvFJ2uKWrWCRI4RUskIOQEjnnx3gT89uKt3Oy-ueajIenQtcmbLaSEedmz1WhSi-QYYC_C2h-Jpu_672efftaRouM3VfdO7YiUIQyh_30LXufMquQpPKgykbnyjUt755YSHUQZuZ-MTDF22Qdkpm3RAorb6U2tc6CaBQqHs5uG2EKn3fumJYRPKf3EPKXM8IXK6m0cmCvr9kVjf9a1Z2W2DZFYGcrUYnTw-RFbPankNeCAdjmiIKEIqjtPiVYJURKjxPgvOfG_d0FSGcZlBk-EMYnc4_iCaUDIgLEl_svrJ4rC5_RDIFx_khBxoHv5YznZ5DOKSnS9FdKqsXj62Z-WPc-l2CzY6BFEbMoAfVsRx5KU4Ufkoip15atnKLt5HYWBVezDaD1RN3iQ6rLRKMGlGeFMZuzgSpwSxF03xeUo=w725-h726-no";
    String urlchiccoduotrio1img = "https://lh3.googleusercontent.com/IVAYosLP2P2LKc2_5DKGkem1B_toiMyPx6b--kutPzm--hfxXXEgAr8Fj25e54y4S5foBHRiICZVybVrx2aRgir1oovZQp1eb1RFkp6hslPKYn6QkYU-8aqj44yEB2PAKVwiESyw0YwoQGRIk9CzyMO9c9eawxU9Q38UlY1LyrDLJAJTMu5F5gloe4aOIWdDmL62NzqkoUd01_pzzGplvOV-Ertj35i6Eh2mqA9sCPFHYbw27890zO3EfA0ovGsmr-gFW-yC6fSHQMAd-FrcEX724dq4fx-Z2UMM8j81EAWB9rG6tLSWJACXu0L990Hpjsyaba050ybZK72p8rykzlPkL-lzSqMUcwgWZKRnf3elJZrNPcaBhAJmcIRYfG4-grGRZAwiS-8d4r5JAEy2HFoTVkwdBnoUvqN2aLeN2mhFGaYHskPlXn_76411-6D_Umc54RnXuigJaTe9OPF46hWPEsI2HA8xnHXSqdtDc6RFBRHM9bkGMv6GNMwrXonJI2Wp88hO5_5cuUbsFN5K0N37BhhYbYklEZF_i5sg3XJbCPBAmuDhke3n60JjqU6oUepLTfckMooYNsmtKjdAuLEZ4Fc96LoPWmYQwqEfxnQjvs3u_m-rYd367rFb-vo4pkCNQmQ2vu9AXuQ8N3-hyoKZfSp7jCHO1jOarZ-fqxU=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoduotrio2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoduotrio2.this,marcas.class);
                startActivity(marca);
            }
        });

        chiccoduotrio2txtdesc = (TextView)findViewById(R.id.chiccoduotrio2txtdesc);
        final String stconsulta = chiccoduotrio2txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoduotrio2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoduotrio2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncomprachiccoduotrio2 = (Button)findViewById(R.id.btncomprachiccoduotrio2);
        btncomprachiccoduotrio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprachiccoduotrio2 = new Intent(chiccoduotrio2.this, webview.class);
                comprachiccoduotrio2.putExtra("string", urlcombo);
                startActivity(comprachiccoduotrio2);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        imgmodelo1 = (ImageView)findViewById(R.id.chiccoduotrio1img);
        Picasso.with(this).load(urlchiccoduotrio1img).into(imgmodelo1);
        imgmodelo2 = (ImageView)findViewById(R.id.chiccoduotrio2img);
        Picasso.with(this).load(urlchiccoduotrio2img).into(imgmodelo2);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.VISIBLE);
                imgmodelo2.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.VISIBLE);
            }
        });

    }
}
