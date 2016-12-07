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

public class mibesbaberos7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesbaberos7;
    Button btnconsulta;
    TextView txtmibesbaberos7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9010fbebc9faff5ca33fbbf3c9793b1f";
    ImageView mibesbaberos7;
    String urlmibesbaberos7 = "https://lh3.googleusercontent.com/m_7yfGVILFRm0UGf1gTripvb9W4bALRfDypJASHRa-t9DSlisykP7VZkXhznjmYKbd2OoMVKW09o2auPz8WNdMYTExplqiQpZBMFdBYGmNXn49G4MKPEsQuQ91GjAg2UWVG9myxiKqinxOpcnJYK3egelMm8A-GzHjY7BivwQ5GW3AgekzlhT_jucwJe7FYZULvVh-bD9Kafswm3MUeoR44RQHyvSPuS29ifwcYotLKWEl91bk2lXLXc9uhZ1HZTOOqBk35LIrxyBSFzCnJ0S50diGAIgzy80qHV2k1DjyQAwnAB45QdmqR9VZ1dbVDGIQq3nAawSou5vaVV2o32_7hDhvaregUdW3_P1K6k5AVnFXuKDoYm7EFInT2PIMPtcSe6q3a4bdSuJ00FB5nPhJq-d5PabFSi0OALYV9F90jhRDYZiIbPdUQMqW3yy5PGa0Xp1FI9DvsHCGuAc51995_u-w1Z6WnqtshrolfWJjLzXemxeJI75UnEFDJzWFkBgWCOKFPViNXAycZG4gYjjlLC3BZyncDGhdlTTB91BaQDd_SbqUgjT6UWozuSbAY84W9U0-VZS5NRYkfZvlrvL9uoQCzjRrw6PsVfE-8p7Oz3K3JA8qrr4XewUn_xUyoEypLqRIKn_TTN9nT-3fhmqXeyq3VAN1IsOM5-BcVdST4=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos7);

        mibesbaberos7 = (ImageView)findViewById(R.id.mibesbaberos7);
        Picasso.with(this).load(urlmibesbaberos7).into(mibesbaberos7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesbaberos7 = (TextView)findViewById(R.id.txtmibesbaberos7);
        final String stconsulta = txtmibesbaberos7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesbaberos7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesbaberos7 = (Button)findViewById(R.id.btncompramibesbaberos7);
        btncompramibesbaberos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesbaberos7 = new Intent(mibesbaberos7.this,webview.class);
                btncompramibesbaberos7.putExtra("string", urlcombo);
                startActivity(btncompramibesbaberos7);
            }
        });

    }
}
