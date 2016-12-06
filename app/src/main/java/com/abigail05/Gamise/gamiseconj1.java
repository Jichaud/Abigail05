package com.abigail05.Gamise;

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

public class gamiseconj1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamiseconj1;
    Button btnconsulta;
    TextView txtgamiseconj1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=83ffe8f8916624649c969b3c16dbff9f";
    ImageView gamiseconj1;
    String urlgamiseconj1 = "https://lh3.googleusercontent.com/qdOMskkkQYlIBXzDPuyq7cSdEbXC_9aLLO_HSpfHP6n6USRM05TkO2xGyp0WcLJk44n066CL8fCmAKA0yM7yStaf6ztGNY0rhhg8EaN8chCWhQg6Ou5kah6PM0W9y4CLQanMSNr0p_2nrTYb3sspU0Rp7db1qQfXNdfnqS0uJlzFeEc5V5f0QR2-XqjwG-03HWMg3WwCS6vb08NPGYiv3R1Pc2RUNVL9AsTvWOyNw2-qsvVbrCWcCK-nOi8lMVEtaXmWVdzSbZWPdwYvem4zPRBogFUFBpilgYdaDpXtvalsfZA0PxQmaQtJJbpFCaZwifMpxSj1j0jJUDah9N7igPvYDMSbf6GnmVAJs_Z35-E5pUgjrnQv0DELiXcAsUUQb3OZrDzPT56bU3R7kL5dKghRnU7x77d2mxUDZhLvuzTPIA0aLCkx1pxh67qzOp2P07IP0Csa55FjixiDmXANVuT3Sh10Jye5NqeOwKPtjUlgLbthqR4z9A17S97-OBvDjpmBkF-2Uxyh4oPs39mfJjldrGH1VWKabDcCGM79V2V4bvI0VLcYDM89ZKa6Z2Ox4htJdQBXPUm544uv4M_ZWloMoehywMkOnmxgQ5T-dUzuN-p_jODQthCiLrhlLxKKXpe4mP-kzTIqyjy_xRLXsc85fnCIBajq34tFKD_Vwa0=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamiseconj1);

        gamiseconj1 = (ImageView)findViewById(R.id.gamiseconj1);
        Picasso.with(this).load(urlgamiseconj1).into(gamiseconj1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamiseconj1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamiseconj1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamiseconj1 = (TextView)findViewById(R.id.txtgamiseconj1);
        final String stconsulta = txtgamiseconj1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamiseconj1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamiseconj1 = (Button)findViewById(R.id.btncompragamiseconj1);
        btncompragamiseconj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamiseconj1 = new Intent(gamiseconj1.this,webview.class);
                btncompragamiseconj1.putExtra("string", urlcombo);
                startActivity(btncompragamiseconj1);
            }
        });

    }
}
