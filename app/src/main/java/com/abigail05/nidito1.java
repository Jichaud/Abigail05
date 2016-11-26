package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class nidito1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompranidito1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=eb68d4b4bf34329b8db92491a6cfed65";
    ImageView nidito1img;
    String urlnidito1img = "https://lh3.googleusercontent.com/azLfqv-uz03eh61Zt1qjmkLdDzV96CydQ_hXOQrLQ5IiJoFOzG8UD8Mg2Pnfwxel2z7D0N9yrKK1oQAdd0u2JYzSKKPacISWwkwRrxD2kwy3C1KDIxkpCGs-hOw7TZl8OZIjm15o29w1nvCFaO9vJYjZrA7yP3SPp3e76Ga-N4redX3d0anSAlO9wUHfpoxswgvDnIgtlKHRiYBCCp8aBs6QHHyiWbNRLiz2cMEbJWqH8rgGBgu-AnFOJCXqX1K4z1TtHD7rC2tP7qLUmC3Vfh6K83dLZjt3ShbkOutMZD7IanCLMAQJn4xUDRQS6pLWZHgF8YaKulJ8GX7rmLr35mnSAxwsAHQROpQb_jubf-gjBt7j2VSMsWCjWC3TpK76Eh_kcu7gWnfaQvct1dlXZsNYzMhBxqfj-9Cz8iKTfQ60O4GfHgMBcmn2A-MWG5_rTkdDTJD2u5J1C1VtpTyeWLJTIquag-r21oTA1LKzBlX-XoVJnP-S8dpgAN2Xra8HayK5MZEBlNtBKNOVFD0slKXtea_-HT4PJy4oW713_KtINRMFqZ4buBb5r4oNq-h7YxG2ZXz_PsVFcF-7-oz5aoiGPEQZuYsG9V3E9-nkoNfeJ1CWkw=w471-h404-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nidito1);

        nidito1img = (ImageView)findViewById(R.id.nidito1img);
        Picasso.with(this).load(urlnidito1img).into(nidito1img);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nidito1.this,marcas.class);
                startActivity(marca);
            }
        });

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
