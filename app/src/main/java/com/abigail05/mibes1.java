package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class mibes1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompramibes1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ea77810ea709eee5b1de76df0a4ca5cf";
    ImageView mibes1;
    String urlmibes1 = "https://lh3.googleusercontent.com/-DSKLh-hHAGnzlAkWyO5lEf2DRTUw-YhhGU9IymbIourye2rYqTQfpfnhJeoqSehWFFBthXgOgk=w432-h360-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibes1);

        mibes1 = (ImageView)findViewById(R.id.mibes1);
        Picasso.with(this).load(urlmibes1).into(mibes1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibes1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibes1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompramibes1 = (Button)findViewById(R.id.btncompramibes1);
        btncompramibes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibes1 = new Intent(mibes1.this,webview.class);
                btncompramibes1.putExtra("string", urlcombo);
                startActivity(btncompramibes1);
            }
        });


    }
}
