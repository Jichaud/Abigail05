package com.abigail05.Avent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class aventchupete9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete9;
    Button btnconsulta;
    TextView txtaventchupete9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d2cc25012bc80232e01d3693ec066b86";
    ImageView aventchupete9;
    String urlaventchupete9 = "https://lh3.googleusercontent.com/e1uiwWvmMo1RVzFy_iMrdAo1Gfnbaxrq_R5wSM5f6Jbxf0wSxXJ6_JIo_eCcgeWGr1tI06LdDr4zueaXw391Isg4c9jYWxljxLMgaKVsqBLuj2dajHUf8cw48We-hRcrg9qe0bXEDKQlMr70tLCB3s3J8rhRYs6TbGoQRbZK0MusNDJWnBuVwu1KvhGTLCg2oFltu4MhxapNSl_CEUvV2X8tl4wywgBvat9Qynr-8bGHPTNK4WxzRRSfXV338XbrganMpnW6980YYzxQsh0PJTv89OuYvGvQicbBmuGtQAWSkBX0wAXiMxQcyAgbUOPTEP2z5DP0MHzc-nCx0zx4oP4haJ19QcVb5sleL7gXwa4DuMzoBzHU3BE0HFIJTS4EsUE13U5Yn4fB72Ua8ioSU1RvVl0twH4o96zoifskqAxlVUyQOOx8jsG2cWFhn_Uc7QpfMTgu5Lt1Wr-yvzK-1sPk7KOm0iCh4jgSGv6CCqI17HP-zpNaOJTxylO_6DAFZ0729vcB8IS0x4LXbhAa-3FG5A-fCnFVXGFLlSGlhwmk3U1hras5Dz4vLZiZF250soBOp7EVnqN_629mu_j1Bcwk8_OrV403ekzfmZ5fG_cWULyk8A=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete9);

        aventchupete9 = (ImageView)findViewById(R.id.aventchupete9);
        Picasso.with(this).load(urlaventchupete9).into(aventchupete9);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete9 = (TextView)findViewById(R.id.txtaventchupete9);
        final String stconsulta = txtaventchupete9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete9 = (Button)findViewById(R.id.btncompraaventchupete9);
        btncompraaventchupete9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete9 = new Intent(aventchupete9.this,webview.class);
                btncompraaventchupete9.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete9);
            }
        });

    }
}
