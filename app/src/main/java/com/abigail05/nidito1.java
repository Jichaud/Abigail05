package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class nidito1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompranidito1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=eb68d4b4bf34329b8db92491a6cfed65";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nidito1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nidito1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranidito1 = (Button)findViewById(R.id.btncompranidito1);
        btncompranidito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compranidito1 = new Intent(nidito1.this, webview.class);
                compranidito1.putExtra("string", urlcombo);
                startActivity(compranidito1);
            }
        });

    }
}
