package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class combo4 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcombo4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=14b2978d8fe35ce2ea4157a8652e48e8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo4);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo4.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo4 = (Button)findViewById(R.id.btncompracombo4);
        comprarcombo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo4 = new Intent(combo4.this, webview.class);
                comprarcombo4.putExtra("string", urlcombo);
                startActivity(comprarcombo4);
            }
        });

    }
}
