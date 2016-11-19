package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class combo3 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcombo3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ba4b284e837aef9bb6c4cc1dee59c775";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo3);

        comprarcombo3 = (Button)findViewById(R.id.btncompracombo3);
        home = (Button)findViewById(R.id.btnhome);
        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo3.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo3 = new Intent(combo3.this, webview.class);
                comprarcombo3.putExtra("string", urlcombo);
                startActivity(comprarcombo3);
            }
        });

    }
}
