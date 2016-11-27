package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class almohada1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraalmohada1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=38c34156d3473e689589c845b1047cc8#b";
    ImageView almohada1;
    String urlalmohada1 = "https://lh3.googleusercontent.com/-hc1nxRgBR8uYR_iWxiaA8HNood97t7sMYf5YmieBMaWDrDI-MU_i943PKWKiWMME0B8V2oj5KRLZUx-aTtDSmYHnR27yqydrXoqeRsVneEm4FT3hkksAvgs9qYVuyfRXfUWBEHQFObEgqD8iIb0S-epETYUahQvjwgYhHJiOMaAM7dt8vDiyHpPGY45W9PJ9zHk7yDSE-ikX-UsTr3WdGzoObUZKbptMZBv1CAAWpev5vyBziPwS3uYfhbl9I9nZXom4qP6w4nFvLsng3yh-E03yziRMw8Oc_sUZfFll1LB6y-rgubJEVd6BagUcDEiYiv-YBrLlnb_n-VsbG3NCZK0IaG80b-8Luv5GnPDMQmZwsnqYFtItVX14AgJhiOb7wK29wM2v_sDA3JvnQ5mGeZ__Vz4k4OfC5EZ2yDOLJJXx4QKg8YuOhy_xqDlJBiTt1LPf0vcXGiqAgVhLmImWzepYTKqCh5uLjRLikUpnfXEMtobJQMjrzicXAoXNE8EL7FOyv6h3gRUwF2T_tC_U9urpQ0AGTzVAUI2wnk0oQkAMvvcHsCd2hTAX4GfK4_3N4_bJ3q-qcR1NpftayetuUmlKH_2XO1vveMKAfdyQWu_RTjLlA=w480-h312-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almohada1);

        almohada1 = (ImageView)findViewById(R.id.almohada1);
        Picasso.with(this).load(urlalmohada1).into(almohada1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(almohada1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(almohada1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraalmohada1 = (Button)findViewById(R.id.btncompraalmohada1);
        btncompraalmohada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraalmohada1 = new Intent(almohada1.this,webview.class);
                btncompraalmohada1.putExtra("string", urlcombo);
                startActivity(btncompraalmohada1);
            }
        });

    }
}
