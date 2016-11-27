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

public class aventclassic3 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraaventclassic3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d6758fccc414910ed57c957c2f992112";
    ImageView aventclassic3;
    String urlaventclassic3 = "https://lh3.googleusercontent.com/8RGm5hU94eojhXPpx-u5KfrCjsODV3oao6pRgJlkj_YmXhG2ZFku40gi-ILrah2GnoDcysHyojUHiwyieLE9DiLFuUcna4sr9WLu0YApDdQSujzHNT0qaEypL7O74c-bQFe7jcuUNqEfZ4hBw-UiD-Q1T5p7sTiHWIAqR1XoUiA1DAolvuixeizSlJrOEX2rgLPBWLOudrJxsWh5p7XNpX94f7eGdGeR4SV823bz6UFBl9pvXwH8-Cfizh2fQBNxfF43XDQ06ltKSRHttHFmfVNmB3V4FDVlQdOlwl4VxmLdNXmUq09aBLaCIEZd72X8ywE9pzHgdFt5GuH_8heq7hbyvB4fTVuihiZTcF0OOz2NFXeDv50mOko80qAiup1lMoOYTqMYWneZK-ve2sEM1PY83Qp5iWrz1jMKBH5Fg42uQaKLWQu9au4P01EWPJ6TIqekPNoWeQ0LObeJzUr7C5LgGbZjRs_i-8jUk7kaTRaLAKYuegrSj0hlUKsZbOcHfck2wn5nlPqorYGvqJU5Eru_uwfmwkrQImBC9BALlE1u0L5mH6sZN9cbGWlYmW75SS_XFibLEr00z6EXIFsQQoH7RE7iEx-6oJllOg8hYeLgWWpvLg=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic3);

        aventclassic3 = (ImageView)findViewById(R.id.aventclassic3);
        Picasso.with(this).load(urlaventclassic3).into(aventclassic3);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic3.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic3 = (Button)findViewById(R.id.btncompraaventclassic3);
        btncompraaventclassic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic3 = new Intent(aventclassic3.this,webview.class);
                btncompraaventclassic3.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic3);
            }
        });

    }
}