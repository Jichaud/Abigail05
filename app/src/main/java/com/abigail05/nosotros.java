package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class nosotros extends AppCompatActivity {

    Button btnlista1;
    Button btnlista2;
    Button btnlista3;
    Button home;
    Button marca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nosotros);

        btnlista1 = (Button)findViewById(R.id.btnlista1);
        btnlista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista1 = new Intent(nosotros.this,nuestrolocal.class);
                startActivity(btnlista1);
            }
        });

        btnlista2 = (Button)findViewById(R.id.btnlista2);
        btnlista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista2 = new Intent(nosotros.this,acerca.class);
                startActivity(btnlista2);
            }
        });

        btnlista3 = (Button)findViewById(R.id.btnlista3);
        btnlista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista3 = new Intent(nosotros.this,nosotrosweb.class);
                startActivity(btnlista3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nosotros.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nosotros.this, MainActivity.class);
                startActivity(home);
            }
        });

    }
}
