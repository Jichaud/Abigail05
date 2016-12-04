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

public class nowybaneras3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowybaneras3;
    Button btnconsulta;
    TextView txtnowybaneras3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cc5a82ce1a8fb3e36fa89cb3a5f1e190";
    ImageView nowybaneras3;
    String urlnowybaneras3 = "https://lh3.googleusercontent.com/bHWgzniaT8s8XupoPvHk8QFtiTQ259l6cVx08NkW25i-yXvYgk45jPl90a003_sCw9wvZZiMA0XhmUgasC2AmJzrukU0XzgWoXaBfmspQbjPQ2h70FYV8mvyqWEU58iLyKfp0nnHCiVZoSiLmo72o5EBAuphQiZ09hj10LX97t8_u_5PC2EYDjGvoeTYRIUc6qlIjtbcZnd3CawAMB6GeAg3xoTcRP16KSqm8FeE8K065-WDkGFBUM6yg5eQh2U-JLN8IbXTv85WOYMj0IvyobFPhjfbFUc2hm665it-FlhnwLRmrU80tUdTV5ttAERUp9hr3JHwnSEEMTZ20K8ynrIgHZ8ClLn4E7E6jL2MqrLsQsjBt3ot5C1ZnUtYAg_m_tcFS_aOSDsY243EgpZ1lb7WwYnE5GLeP_PX8WJ3mFLVFqe9jMvjXUwF1OXEJQi82MZVagsfP_djzOkIyDT4yjSk1gmj01XGm8UEBEdwwFg5FtjgqJSKWcG2F4nc-7WWe_fXch5_7rR4QVkVHipzEig617M89pMoB3_rmohK98rTdcLnkoR4XQYMb2ZvBBaMJ5f1dHIHsoq2sS7W6IIRehgpgvzLE_EkqW3ayeuuqZQsXzTMmw=w448-h449-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowybaneras3);

        nowybaneras3 = (ImageView)findViewById(R.id.nowybaneras3);
        Picasso.with(this).load(urlnowybaneras3).into(nowybaneras3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowybaneras3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowybaneras3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowybaneras3 = (TextView)findViewById(R.id.txtnowybaneras3);
        final String stconsulta = txtnowybaneras3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowybaneras3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowybaneras3 = (Button)findViewById(R.id.btncompranowybaneras3);
        btncompranowybaneras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowybaneras3 = new Intent(nowybaneras3.this,webview.class);
                btncompranowybaneras3.putExtra("string", urlcombo);
                startActivity(btncompranowybaneras3);
            }
        });

    }
}
