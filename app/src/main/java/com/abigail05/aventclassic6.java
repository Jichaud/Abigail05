package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class aventclassic6 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraaventclassic6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8fabc4314513bf5c22fbd2d9fb9e4622";
    ImageView aventclassic6;
    String urlaventclassic6 = "https://lh3.googleusercontent.com/yw0kbPY13-L_nKmLZl5ipyFkbyZx0qEccaiu4O5sCCLXZUYlv3r0XiiIMuyyNouOSZprd1Epuz3M0RvOoQg9_o0WdBmUaJdmzNNSHu0Zr_vwAIE2Gs_iTlFrSBC7oZ6VS9b7azae0JnFi-zRJuvFDSEMgEA5WOc99ZEzLwkZm1VST-OL8g7lcGTgj162l1IK0Hb3lJwJXSu1809yWr8mVznZluD1Rd61dTp0t7J8z6MeyCdJu9Gel4VjnT9UzjKxTmHK0Zub3j5xefTs78G9nu2We95E3GUg1wfKyeEtCBkjOYCPAYRANK0_2eW7twFmGHbf-DYCWkWeTCZ5-kA8bZypCY3bekTaDUVryXA3JjnnjtRcojN5NFhoQskd3YcT4J9xLGrwnx2_H0_V3dMus-JNuiBHogms3ZseNeocdQ9cphO-i3Co98xHP4FEHCURdpkQavpPWMDlcbV-emYnA7UksXWA1afduucXr2dGud-UFgZFdO5PkPlR4UfPL_wZpIid9irPIg2HnhtmwBdOwXi5prfrZn7oFdxM_AoHYjM6Un52J35RtXiETdTHUGnbLH00s9OlwnYOFVtGwQsteTxLtZLlefkSO9eBTGYlmvGfx1wxDw=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic6);

        aventclassic6 = (ImageView)findViewById(R.id.aventclassic6);
        Picasso.with(this).load(urlaventclassic6).into(aventclassic6);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic6.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic6 = (Button)findViewById(R.id.btncompraaventclassic6);
        btncompraaventclassic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic6 = new Intent(aventclassic6.this,webview.class);
                btncompraaventclassic6.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic6);
            }
        });

    }
}
