package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class almohadones extends AppCompatActivity {

    Button vercombo1;
    Button vercombo2;
    Button vercombo3;
    Button vercombo4;
    Button home;
    Button producto;
    Button marca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almohadones);

        producto = (Button) findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);

        vercombo1 = (Button) findViewById(R.id.btncombo1);
        vercombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo1 = new Intent(almohadones.this, combo1.class);
                startActivity(vercombo1);
            }
        });

        vercombo2 = (Button) findViewById(R.id.btncombo2);
        vercombo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo2 = new Intent(almohadones.this, combo2.class);
                startActivity(vercombo2);
            }
        });

        vercombo3 = (Button) findViewById(R.id.btncombo3);
        vercombo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo3 = new Intent(almohadones.this, combo3.class);
                startActivity(vercombo3);
            }
        });

        vercombo4 = (Button) findViewById(R.id.btncombo4);
        vercombo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo4 = new Intent(almohadones.this, combo4.class);
                startActivity(vercombo4);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(almohadones.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

}