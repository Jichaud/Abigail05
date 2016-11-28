package com.abigail05.Avent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class aventnatural6 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventnatural6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4dcc086fb27308e70ba2736cd27a078d";
    ImageView aventnatural6;
    String urlaventnatural6 = "https://lh3.googleusercontent.com/TlVaaw3zsVBCndHgziTpFWkJeLy4ju0LJ-bYcrFe9L5e34l7A3coTKSOkNTTfIQI2bqA-a6Idyg7693QyEW5uztFBrQYaeIYc4W7I4e6mXkBWoitmoHDwnAuGJKuEkzvJOtvE10anfVQSWgGAD-MH2hKqjPEIM1a8I23-9M5uY27b6G1vKNahKtc8fh0oDI69PrVukLg2g6QK3gHbR49uvVGiW77BDL3pJ8Sr69-vK_76uJccFEi0G8PwWpEw4VQy1HlkIOp2hxkfyyaSsUsb6gOUVwO5qxxAIIa7BoSBE51dvx1JM4X_guhnvVeJNeI2BeSEEJM3H1Ex4fb-LENTAEUSfsvMnmA5RSVei0Cazbdrva827Mc9zfgT94x1qz9Sp0EE1cV8HG2M_hKzEhxTwjS7ewDnFPyVNcY6q3NJX9G-Amel4sj07xyZ_9uXk7-Za04QY97WxJoJ7xAcnJYyzNhNmUgz-wUnjwuKn5IjyZFyCMrVjLdNP4eL4mTXPqxjDtQbRbMSDn4-eZAt0K8eMlg2aB0qekX-d5xGy2ryUcW-QxyJTZyvovYrbrbGIkVAnK8XeUi03AmFNyb5g-ALwNwRUu0MDltpcL4fm7ApVe7ji-sbQ=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural6);

        aventnatural6 = (ImageView)findViewById(R.id.aventnatural6);
        Picasso.with(this).load(urlaventnatural6).into(aventnatural6);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural6.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventnatural6 = (Button)findViewById(R.id.btncompraaventnatural6);
        btncompraaventnatural6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural6 = new Intent(aventnatural6.this,webview.class);
                btncompraaventnatural6.putExtra("string", urlcombo);
                startActivity(btncompraaventnatural6);
            }
        });

    }
}
