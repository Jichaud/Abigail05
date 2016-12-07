package com.abigail05.mibes;

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

public class mibesbaberos3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesbaberos3;
    Button btnconsulta;
    TextView txtmibesbaberos3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=71299c43163c1e4be83911eb36f6a021";
    ImageView mibesbaberos3;
    String urlmibesbaberos3 = "https://lh3.googleusercontent.com/h6_5IIP6xPuflC_A_rQYeLTUckHYbUSZb_81xbqsGD4qIX-YzsyqxgpgDrGl7N1Vx2tb8NZQwgjYPG--UTs8gXiiC-7_OYlyalyXhYhlyoTZnz1OlbRMN4tFHvALOquu-ZaxLzmS8pnt6NoijnZGamm6Gqln5iyVNneG-NIF8WRpg9nHzfPr1pA9_zqM1gT88v5FkO7TtipV05H4B7Y3bwjGC9l0klFVhkX1Lx56G0A6YXXD9Uqq-kj-S6Kh_4rLiGz3U3Nr-6ytpuMGKg8zOGNC0I6z7EIzfYpUtR45AU6pRaR_psXS4QQ1Q3b1IUw1sMbjYGf1_3QmMHUOyBI9IQnnHVgJR2Fdmld5tVGBlGAgKYq1W5Ndxb7W13wB9TN05cu8uCUhX0vnZ7RlBowtyNlZMZIbzrZXmfSvZv4G38oVedwYICvLSzWqJAsdARR-EQs1TzDNCu2kcicVwMg46LwkKy0GqfEQpHmJueMQmQOQJrHLOVSrHDj4ta3jJQOEQrUmWcppjPU9SuJz7rO1--J8ia2n56U1kLkrrI6743oLfMP6KemBsZB4V-2BNGPfoKVrLBEr0uIBM5Lyxi0ROXbMyodqUhv28bN4fAXS-fR2ZY4ZBv8_fZ8BCJXgAvrQ30ci3QR3qUEe-3stYmem54nHWYDeHSLVdFIc1AT39zk=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos3);

        mibesbaberos3 = (ImageView)findViewById(R.id.mibesbaberos3);
        Picasso.with(this).load(urlmibesbaberos3).into(mibesbaberos3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesbaberos3 = (TextView)findViewById(R.id.txtmibesbaberos3);
        final String stconsulta = txtmibesbaberos3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesbaberos3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesbaberos3 = (Button)findViewById(R.id.btncompramibesbaberos3);
        btncompramibesbaberos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesbaberos3 = new Intent(mibesbaberos3.this,webview.class);
                btncompramibesbaberos3.putExtra("string", urlcombo);
                startActivity(btncompramibesbaberos3);
            }
        });

    }
}
