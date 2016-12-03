package com.abigail05.Chicco;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class chiccohigiene8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene8;
    Button btnconsulta;
    TextView txtchiccohigiene8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b1ec3ee72a45f428369e699405ea2283";
    ImageView chiccohigiene8;
    String urlchiccohigiene8 = "https://lh3.googleusercontent.com/6Pnp70_uMO8-tqcbQignSh_Y_GLu8ODWXHXGziuxutvywdpHYvKoLY7vJPfFIUbePnSw2AeFjWQpxuzm8MIDJ7BgDWNAJmT7Hlui1b0KMCsAkiD3ZpiE1M2vePxoZN6bUkob4auduR7dhLFmuqrBt8CKdiQrRk7zblqbvVp09-M0kZAB3dIHhZilR1vHyWg3kOgl0aQ1nEkdExSvLQHNjGMFTzXavXRg7hKHPKp9Fg6Et7qeJs5vjtwTRC8nUcYdYhzJefvXjP_OVsl3VV9W2BWkBRRHp8F4a1jvEVCx1g5GsGJM1aztC7ao9pISXQhZ0JgwMgJF8MVKvz8B_GbtsgmR4gGBE2CYJr-exVZZnuuSnKw-bdBXdk16Gpwxld9qFCxqEemaEGEi37MoF4MR3ccTEOwKa9IHYtkbMygrRN91Gs9xMoWvLkDzkCa7SB9H1bhkUFMTLhEcuyPQ3eVxLsNP2HOMMtl1umM1uZmGTCc-Kxl_r_z5nBzYEKHhH8nwA8xQUCEXYOta27fWT5RQfLkBWSK68fAYzUEDoePCI8w0CZUZvE2EjRvmbC9l2rbzQoQ3YeBLWgyW0SWheQ-hOH4TFBG1NzJss6XeIGWzSu4EdnHkEA=s400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene8);

        chiccohigiene8 = (ImageView)findViewById(R.id.chiccohigiene8);
        Picasso.with(this).load(urlchiccohigiene8).into(chiccohigiene8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene8 = (TextView)findViewById(R.id.txtchiccohigiene8);
        final String stconsulta = txtchiccohigiene8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene8 = (Button)findViewById(R.id.btncomprachiccohigiene8);
        btncomprachiccohigiene8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene8 = new Intent(chiccohigiene8.this,webview.class);
                btncomprachiccohigiene8.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene8);
            }
        });

    }
}
