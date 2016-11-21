package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class combo1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcombo1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e68ff9a9f087a16157f80793fc0ca56f";
    ImageView rojo;
    ImageView naranja;
    ImageView lila;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo1.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo1 = (Button)findViewById(R.id.btncompracombo1);
        comprarcombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo1 = new Intent(combo1.this, webview.class);
                comprarcombo1.putExtra("string", urlcombo);
                startActivity(comprarcombo1);
            }
        });

        rojo = (ImageView)findViewById(R.id.combo1img);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rojo.setVisibility(View.VISIBLE);
                naranja.setVisibility(View.GONE);
                lila.setVisibility(View.INVISIBLE);
            }
        });

        naranja = (ImageView)findViewById(R.id.combo1imgnaranja);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                naranja.setVisibility(View.VISIBLE);
                rojo.setVisibility(View.INVISIBLE);
                lila.setVisibility(View.INVISIBLE);
            }
        });

        lila = (ImageView)findViewById(R.id.combo1imglila);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lila.setVisibility(View.VISIBLE);
                naranja.setVisibility(View.INVISIBLE);
                rojo.setVisibility(View.INVISIBLE);
            }
        });

    }

}