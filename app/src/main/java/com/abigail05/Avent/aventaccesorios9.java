package com.abigail05.Avent;

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

public class aventaccesorios9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios9;
    Button btnconsulta;
    TextView txtaventaccesorios9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8d87a1cb8979ca6e93f15ba0c5091ecd";
    ImageView aventaccesorios9;
    String urlaventaccesorios9 = "https://lh3.googleusercontent.com/-m41GF3BN_RwYQUI76p6MTbUdl0Q29mVJysi7k3GSDnhXXhEKS9cRMmPqlQ5BD4o2Sdc1jhAbNeJ0DiFRnjsUNRQfYzgOnXVpwyW__bD558QC9oBCmzvfAFUoj_L2EKLH8nuazg78ySNH9sOF4bGhD6Gnf6b05Kyubb3jspINOfGvcsqRqAJi5fNfSdmwCaHEV_TDH1BkNdtj7Vh_MM4eP4POa5SGFsko1TKxculmKQB3sZZwNwmBtuZ4PS6-RmcsdWWadQ2wmG0_ap5drtgRtbKwkNhUgAuc3xu5ZqxeQTgNA9YyY6Moh_iwODUE8hbp2NBQg2Kp5-V3B7Yb85IoIbDtu8-9O3-MXPRBEztgSdhoiLAxuXcPDTeeniHuQCsAGOXRuxe6FBnoCgX6Kov31Iyen4Ume3qFLEdr30WZILQw5BlcVv6zIlsdi7uqAsZ1dpQsVrpqCq348LAA0pkigIOOBJuK1YDF8Ed4ysjHOeQw5VlucOQmWBgWT7MpDFX3WgqMOHqqo8DtSVqLe7-zojqgnrwyzOLwjEbguoeLZbOQK4ZXrxRwFA7N-nwHgLs0TiZQKrNQtdMAQ9dozWjsN65HKVLJjgn2ICbLeHtnboHQGI0uA=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios9);

        aventaccesorios9 = (ImageView)findViewById(R.id.aventaccesorios9);
        Picasso.with(this).load(urlaventaccesorios9).into(aventaccesorios9);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios9 = (TextView)findViewById(R.id.txtaventaccesorios9);
        final String stconsulta = txtaventaccesorios9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios9 = (Button)findViewById(R.id.btncompraaventaccesorios9);
        btncompraaventaccesorios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios9 = new Intent(aventaccesorios9.this,webview.class);
                btncompraaventaccesorios9.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios9);
            }
        });

    }
}
