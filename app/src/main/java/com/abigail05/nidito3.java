package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class nidito3 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompranidito3;
    TextView txtmodelo1;
    TextView txtmodelo2;
    ImageView imgmodelo3;
    ImageView imgmodelo4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=00adb14c0a2fb5329a19dd28a3d78a6b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nidito3);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nidito3.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranidito3 = (Button)findViewById(R.id.btncompranidito3);
        btncompranidito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compranidito3 = new Intent(nidito3.this, webview.class);
                compranidito3.putExtra("string", urlcombo);
                startActivity(compranidito3);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        imgmodelo3 = (ImageView)findViewById(R.id.nidito3img);
        imgmodelo4 = (ImageView)findViewById(R.id.nidito4img);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo3.setVisibility(View.VISIBLE);
                imgmodelo4.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo3.setVisibility(View.INVISIBLE);
                imgmodelo4.setVisibility(View.VISIBLE);
            }
        });

    }
}
