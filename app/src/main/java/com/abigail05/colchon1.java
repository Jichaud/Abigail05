package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class colchon1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcolchon1;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    ImageView imgmodelo3;
    ImageView imgmodelo4;
    ImageView imgmodelo5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d71eaa2befd5ed119ea3bf37a813bdad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colchon1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(colchon1.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcolchon1 = (Button)findViewById(R.id.btncolchon1);
        comprarcolchon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcolchon1 = new Intent(colchon1.this, webview.class);
                comprarcolchon1.putExtra("string", urlcombo);
                startActivity(comprarcolchon1);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo5 = (TextView)findViewById(R.id.modelo5);
        imgmodelo1 = (ImageView)findViewById(R.id.colchon1);
        imgmodelo2 = (ImageView)findViewById(R.id.colchon2);
        imgmodelo3 = (ImageView)findViewById(R.id.colchon3);
        imgmodelo4 = (ImageView)findViewById(R.id.colchon4);
        imgmodelo5 = (ImageView)findViewById(R.id.colchon5);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.VISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.VISIBLE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
            }
        });

        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.VISIBLE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
            }
        });

        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.VISIBLE);
                imgmodelo5.setVisibility(View.GONE);
            }
        });

        txtmodelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.VISIBLE);
            }
        });

    }
}
