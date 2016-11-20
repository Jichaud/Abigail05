package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class niditos extends AppCompatActivity {

    Button btnnidito1;
    Button btnnidito2;
    Button btnnidito3;
    Button home;
    Button producto;
    Button marca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niditos);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(niditos.this, MainActivity.class);
                startActivity(home);
            }
        });

        btnnidito1 = (Button)findViewById(R.id.btnnidito1);
        btnnidito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnidito1 = new Intent(niditos.this,nidito1.class);
                startActivity(btnnidito1);
            }
        });

        btnnidito2 = (Button)findViewById(R.id.btnnidito2);
        btnnidito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnidito2 = new Intent(niditos.this,nidito2.class);
                startActivity(btnnidito2);
            }
        });

        btnnidito3 = (Button)findViewById(R.id.btnnidito3);
        btnnidito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnidito3 = new Intent(niditos.this,nidito3.class);
                startActivity(btnnidito3);
            }
        });

    }
}
