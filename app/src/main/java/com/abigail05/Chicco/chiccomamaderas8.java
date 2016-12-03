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

public class chiccomamaderas8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas8;
    Button btnconsulta;
    TextView txtchiccomamaderas8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b2ba59fda2d26dc6d00f7c0bfa80885b";
    ImageView chiccomamaderas8;
    String urlchiccomamaderas8 = "https://lh3.googleusercontent.com/QOdSefwLHK9uHTHQlFy4P7hFFhLEMa2Lbz2cd1nai25a0iPYtXCwG_KqnB5QunCmlyrjBqG4JcBu9VHsh5qP0jMkdXPiu095dsijZwr4S5K32HvwDNYa0nT5XLftmHDIhmtAu46A6hKtYy9_-rdnZs3CFD-epeDCvd5eaWi3bZWiV6WIYkmrBBaffRluebrpwXom0yEWp8edXDnH1_-6Gc-JB6ZIHm50VisMn2lAocneIfL-pe59JoSDdMXyb1Z2XFdqTzs9tDoS3z2qRN6p3E1omNktasx5HI2TkGZeTitWORInY4qOSQ_YLXLSe8yu8Fh8rRmbNZUfF_zaIJhcHAY2jOyPehrkZpqI-m40f119llBMxUkiLQ-S6gp4kT-97JHYPh3OUkZx77cQXpH34KbqDnWh4GhYgh_KOAhMNqQO5VPqQo-wYSDq3blus4XSh6lY2h_bmYAPSEEsz1MJSgvWvD1fREWPa92c4y5f_ildYrVKbgVLw5Gz8iZbqXfJXtN_tEHowC1BSEwd2JyrTeZ-CtfAUKAjGHyPeMMGryT23Bz1RQxJeSe7tOYW_ze6Oafrouf5UPYZ0E4qNbULKjGGXUVoHdRnj8LMEIW7TJrM0Z86Ow=w260-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas8);

        chiccomamaderas8 = (ImageView)findViewById(R.id.chiccomamaderas8);
        Picasso.with(this).load(urlchiccomamaderas8).into(chiccomamaderas8);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas8 = (TextView)findViewById(R.id.txtchiccomamaderas8);
        final String stconsulta = txtchiccomamaderas8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas8 = (Button)findViewById(R.id.btncomprachiccomamaderas8);
        btncomprachiccomamaderas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas8 = new Intent(chiccomamaderas8.this,webview.class);
                btncomprachiccomamaderas8.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas8);
            }
        });

    }
}
