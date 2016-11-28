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

public class aventaccesorios2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios2;
    Button btnconsulta;
    TextView txtaventaccesorios2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e3cd9b82cdc5b8fc798411c4b5ea7902";
    ImageView aventaccesorios2;
    String urlaventaccesorios2 = "https://lh3.googleusercontent.com/5okm8Yz4EiP6h9Ytcry_zDALhrPMAseBHtB6puPjVbzub6m-h2wuCDiHuNzjLsQEQWxIwm6xvctJ2HTrjutD-xUcQpckSRYFjAF9xngeDGcmozp0KWXQP79Lq9vYYwpWYwJ93cLNH33IuuZ4C7Xu9MZ54VvhHaRh6FA_YasP8MXiZe8U-FnIs8m-O74H65MaoGMChUmPOYm9VrE6NjVmwbKQ-trEvHb4aA6o84cs_hLdShcOW7kDnbDVYQekjbcW3kOH5rbDHKaIWMSs_DbwxzhluBNfOMiRdCYQ4G5MXOk_mtot81TNar05IWz3OVsHu6-U55rO8u2v9M4Hykt0LHOF-g_U2D7WoxtJZATO03siyGJsn5m5Nks4eqpRNM3L7USR-YYmlbIlkgbKa66LUHcSq1q0MVFFKc8-b1tnvkModgY68bKYA2CYuzvukK42kq1LXceiptZa_sU0Ih-KNjzWZJtCJWeOmUqF_iAgGeQGE2scARsQSGiLD9zI2Nxr1QNyruYNPtV-TK9I_xTW4fmPkNhA8FR-dYb2UG9V4DREnroCAOjK7e_FkklW4R3pN-ZjdDF9LT91XKMFNDv11-gmRDrnaS_0ig6YQsN0ff933aGRYw=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios2);

        aventaccesorios2 = (ImageView)findViewById(R.id.aventaccesorios2);
        Picasso.with(this).load(urlaventaccesorios2).into(aventaccesorios2);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios2 = (TextView)findViewById(R.id.txtaventaccesorios2);
        final String stconsulta = txtaventaccesorios2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios2 = (Button)findViewById(R.id.btncompraaventaccesorios2);
        btncompraaventaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios2 = new Intent(aventaccesorios2.this,webview.class);
                btncompraaventaccesorios2.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios2);
            }
        });

    }
}
