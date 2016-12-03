package com.abigail05.Chicco;

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

public class chiccomamaderas5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas5;
    Button btnconsulta;
    TextView txtchiccomamaderas5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a05008652603ccfad9666eb8dcd0a133";
    ImageView chiccomamaderas5;
    String urlchiccomamaderas5 = "https://lh3.googleusercontent.com/dCk-OJAS4G-3p_o3hJ35pTUHpC4wwnwmusJKqh5YiGc9_58mk5aqBNC3nPSTYUMM2LoZ-TZV3kPWUq6Utk8wU6uMKkDOA2nVvD2Dy-zOpXO302LzOHIu5qwBNYi-Jf_hhoGcUPtvMn6wdegJDtBwK8F8n7eumx59gkfHxGnlzoXJhuYvDDbeNn01XtHJEyYQbTHOecd5n6UMWUgNh_f07uDnwBok2sRGsV2CaUyJWZjs2NjnfMYcy01dB64BMCGsRWfgXssTjG_YItoOcfX2XV7tLHC0eAPUOedcReT3NS_6YGZ-j1dMROSD-K8uJRdrpON7ZLNgTIjEc_HSR2H2NCZBjAImWAighBPR9_Oixc1CcQIMMpYh7g75LdcMShUOkFa5K-Z_90Nm85BV7YuxFDxpBA9uTp0Oa_z6tXKbty9eQwjGcPcz8wshKYeX4UZWHVUeUyT6vJv0c0WR_LMiSXOiOSZwBOvMm1XGSB_acjWZmovygDfdwDjkSblCp2h-_sZN8RshZm6x8sToz3gZ2aGOTbiPfwGgyvmZeyPAQnNRt3jYWPralQ09JuegwiVag1OlBLcbjkAO8CmBon3TjGbbzRhc0SQqPgT7nZv0ULtRo5fEfA=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas5);

        chiccomamaderas5 = (ImageView)findViewById(R.id.chiccomamaderas5);
        Picasso.with(this).load(urlchiccomamaderas5).into(chiccomamaderas5);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas5 = (TextView)findViewById(R.id.txtchiccomamaderas5);
        final String stconsulta = txtchiccomamaderas5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas5 = (Button)findViewById(R.id.btncomprachiccomamaderas5);
        btncomprachiccomamaderas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas5 = new Intent(chiccomamaderas5.this,webview.class);
                btncomprachiccomamaderas5.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas5);
            }
        });

    }
}
