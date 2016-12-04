package com.abigail05.NowyBaby;

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

public class nowybutacas2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowybutacas2;
    Button btnconsulta;
    TextView txtnowybutacas2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=72a4c974323665e43c3e40732720a1f0";
    ImageView nowybutacas2;
    String urlnowybutacas2 = "https://lh3.googleusercontent.com/-4gDyrEveohYhBjzIfQ2juoysa1oIVqMbf0MAbo8-fl0ZJuKLol5su9dUgsCHkk291UmLru1JqQJf6uX5DmrD9T1XI7ZYGE0fIo0hMUFw_uABXQfyDcXqAoA8JXXyRy0DxvypWkyaAKC2C-lVLFTdDDIgGJZhIG3t0LzqycXbojNvC6_RRqMYzXVRJhCx4aom7f_ShiH18LAuwPGonISd64_mITudx9ljSFCgcizl32oka-tfbcz3_0PfCFyo8F9G4t3k-R5Epv_owcj5WbubK-faLf8hF4iOSMCweidZ3Az6I1zmFhknkPWQswCNAXXWtZ3k6yyrrEEB2CKub34IUbDnVhVV5vovMUoN-IfyCSPpJc40Nv9VZ6TkduxWX-EGDoDu6YsttbyXxGYqjtaOAoE9FBq6IgqLaASdkyZVj8ty9Xx1vOualYYlD34HJOCF4JQFSGkVE6aB27fg1_7DFNoVpqVUh07c48xn8iyHpZ_MVj0B6MFRQoqZG_I7TXVQqh_kIKG5ojaGQIKoFSQtT147IS7ZTbmJ-YLnDlo4P7OnrT_KhySUD1c78WWOZEqEpq3culyHzOHi2G9nXnZJpzHD5kdflZPoIEXPslGz64OoeaACA=w352-h480-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowybutacas2);

        nowybutacas2 = (ImageView)findViewById(R.id.nowybutacas2);
        Picasso.with(this).load(urlnowybutacas2).into(nowybutacas2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowybutacas2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowybutacas2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowybutacas2 = (TextView)findViewById(R.id.txtnowybutacas2);
        final String stconsulta = txtnowybutacas2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowybutacas2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowybutacas2 = (Button)findViewById(R.id.btncompranowybutacas2);
        btncompranowybutacas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowybutacas2 = new Intent(nowybutacas2.this,webview.class);
                btncompranowybutacas2.putExtra("string", urlcombo);
                startActivity(btncompranowybutacas2);
            }
        });

    }
}
