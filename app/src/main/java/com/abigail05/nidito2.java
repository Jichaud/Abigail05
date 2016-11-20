package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class nidito2 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompranidito2;
    TextView txtmodelo1;
    TextView txtmodelo2;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1270985443f9cb4b4f4a0b42782c6bb3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nidito2);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nidito2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranidito2 = (Button)findViewById(R.id.btncompranidito2);
        btncompranidito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compranidito2 = new Intent(nidito2.this, webview.class);
                compranidito2.putExtra("string", urlcombo);
                startActivity(compranidito2);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        imgmodelo1 = (ImageView)findViewById(R.id.nidito1img);
        imgmodelo2 = (ImageView)findViewById(R.id.nidito2img);

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
