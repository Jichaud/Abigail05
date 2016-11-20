package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abriprodlist extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btnlista1;
    Button btnlista2;
    Button btnlista3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abriprodlist);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        home = (Button)findViewById(R.id.btnhome);
        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(abriprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        btnlista1 = (Button)findViewById(R.id.btnlista1);
        btnlista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista1 = new Intent(abriprodlist.this, almohadones.class);
                startActivity(btnlista1);
            }
        });

        btnlista2 = (Button)findViewById(R.id.btnlista2);
        btnlista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista2 = new Intent(abriprodlist.this, niditos.class);
                startActivity(btnlista2);
            }
        });

    }
}
