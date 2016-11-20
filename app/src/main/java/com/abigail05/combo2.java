package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class combo2 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcombo2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf7f1d016665bcbe9255dc04fdb2265f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        home = (Button)findViewById(R.id.btnhome);
        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo2.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo2 = (Button)findViewById(R.id.btncompracombo2);

        comprarcombo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo2 = new Intent(combo2.this, webview.class);
                comprarcombo2.putExtra("string", urlcombo);
                startActivity(comprarcombo2);
            }
        });

    }
}
