package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class combo1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcombo1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e68ff9a9f087a16157f80793fc0ca56f";
    ImageView rojo;
    ImageView naranja;
    ImageView lila;
    ImageButton btnrojo;
    ImageButton btnnaranja;
    ImageButton btnlila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo1);

        btnrojo = (ImageButton)findViewById(R.id.colorrojo);
        btnnaranja = (ImageButton)findViewById(R.id.colornaranja);
        btnlila = (ImageButton)findViewById(R.id.colorlila);
        comprarcombo1 = (Button)findViewById(R.id.btncompracombo1);
        home = (Button)findViewById(R.id.btnhome);
        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo1.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo1 = new Intent(combo1.this, webview.class);
                comprarcombo1.putExtra("string", urlcombo);
                startActivity(comprarcombo1);
            }
        });


        rojo = (ImageView)findViewById(R.id.combo1img);

        btnrojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rojo.setVisibility(View.VISIBLE);
                naranja.setVisibility(View.GONE);
                lila.setVisibility(View.INVISIBLE);
            }
        });

        naranja = (ImageView)findViewById(R.id.combo1imgnaranja);

        btnnaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                naranja.setVisibility(View.VISIBLE);
                rojo.setVisibility(View.INVISIBLE);
                lila.setVisibility(View.INVISIBLE);
            }
        });

        lila = (ImageView)findViewById(R.id.combo1imglila);

        btnlila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lila.setVisibility(View.VISIBLE);
                naranja.setVisibility(View.INVISIBLE);
                rojo.setVisibility(View.INVISIBLE);
            }
        });

    }

}
