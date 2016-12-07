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

public class mibesbaberos1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesbaberos1;
    Button btnconsulta;
    TextView txtmibesbaberos1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7becf1e511394c9b471fada688beb1cd";
    ImageView mibesbaberos1;
    String urlmibesbaberos1 = "https://lh3.googleusercontent.com/kfPmY0FEq9VJ7zHuq730SrBCxbNGaV03Ie-0bcVSfEOY5mYSQumfBZ22cJXAkgt47AcY3S4OyCmuWTKNRn5EObRRs4VxWspEZdLoJTKC3eyLxaMI04MeAOFrumbqqocDIIMdhmzE2BjSs2E1Wg5q4UEGBhsUcqfvSdYRk7e0TGuq5TAf3wEaLk7ZA10wc3V8iNtZbUjEmMPDTn9coD-GM0UAtTY6G_OE9IZdfJVJ-ir1_TfE4eTKoPx9BHwlId21krAjCLErJh1cXVB1BcG1ZoLzCq2B3kDQDzbogaM0_uS31Cj9EwIOLxtu3xm0qZ9-jzi0TEDr_sCmJZueaTVPpPGA1-S8TKsdYejlqAS0bfgE_HqSQsZj7UNXjEQRUsQcvjkKJYRKX1VUOFgCv2V_oyVmBFbjeVgtZz7AmysCMkuAme23xq0kfTGdxIvllHz33iylN4lrYVVy0ZBnHQ5pRSfsr95G7bv8RIncVeIkyMJRvu1RDRDInHn1FLT0KJmle_YDQM2w1HyogFJUWJjspy48J0C7sKkoWLzAl98KOa8OQru_UU3RZdCTZ1u7KJj5aEBk-0oOh54rpTiUBBpBIkvQ-s7rcHCFLadHtjOPay3kqHZo0_eSiHFJnpslOvMERLc4CJEf0k-EI06NURGifFJ1ukVOzSboqI5yPQMGZmA=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos1);

        mibesbaberos1 = (ImageView)findViewById(R.id.mibesbaberos1);
        Picasso.with(this).load(urlmibesbaberos1).into(mibesbaberos1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesbaberos1 = (TextView)findViewById(R.id.txtmibesbaberos1);
        final String stconsulta = txtmibesbaberos1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesbaberos1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesbaberos1 = (Button)findViewById(R.id.btncompramibesbaberos1);
        btncompramibesbaberos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesbaberos1 = new Intent(mibesbaberos1.this,webview.class);
                btncompramibesbaberos1.putExtra("string", urlcombo);
                startActivity(btncompramibesbaberos1);
            }
        });

    }
}
