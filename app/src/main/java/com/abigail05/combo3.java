package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class combo3 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcombo3;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    TextView txtmodelo6;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    ImageView imgmodelo3;
    ImageView imgmodelo4;
    ImageView imgmodelo5;
    ImageView imgmodelo6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ba4b284e837aef9bb6c4cc1dee59c775";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo3);

        comprarcombo3 = (Button)findViewById(R.id.btncompracombo3);
        home = (Button)findViewById(R.id.btnhome);
        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo3.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo3 = new Intent(combo3.this, webview.class);
                comprarcombo3.putExtra("string", urlcombo);
                startActivity(comprarcombo3);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo5 = (TextView)findViewById(R.id.modelo5);
        txtmodelo6 = (TextView)findViewById(R.id.modelo6);
        imgmodelo1 = (ImageView)findViewById(R.id.combomodelo1);
        imgmodelo2 = (ImageView)findViewById(R.id.combomodelo2);
        imgmodelo3 = (ImageView)findViewById(R.id.combomodelo3);
        imgmodelo4 = (ImageView)findViewById(R.id.combomodelo4);
        imgmodelo5 = (ImageView)findViewById(R.id.combomodelo5);
        imgmodelo6 = (ImageView)findViewById(R.id.combomodelo6);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.VISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
                imgmodelo6.setVisibility(View.GONE);
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
                imgmodelo6.setVisibility(View.GONE);
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
                imgmodelo6.setVisibility(View.GONE);
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
                imgmodelo6.setVisibility(View.GONE);
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
                imgmodelo6.setVisibility(View.GONE);
            }
        });

        txtmodelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
                imgmodelo6.setVisibility(View.VISIBLE);
            }
        });

    }
}
