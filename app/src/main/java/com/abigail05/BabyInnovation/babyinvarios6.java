package com.abigail05.BabyInnovation;

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

public class babyinvarios6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios6;
    Button btnconsulta;
    TextView txtbabyinvarios6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e1189278f6a84da84dbf3d4ccdeb353";
    ImageView babyinvarios6;
    String urlbabyinvarios6 = "https://lh3.googleusercontent.com/ANel_Nm0SR9N3plRxpcVFBpFNjkv_Hd6LLavwWVptuFaDznBkkSVsniL5nSy8oO5F3Vfk8s_zWk1bXSuHaoM7rRPOFj4q6UqA0oXADqvwv6TC9W3gwQdDSeYA8oDR6DYYbRqvmXQxt_X4m2gyTkLlFEGjM3iRRT7YbUHHJ1NYKhkkb1G9TMynpfgFbC7I30ivHBdYpDCBeKxxSFmj1OiqDsDOvx6Qligt9matZ6ZLjHu225yt2uyx1y8STbSid_b1JwXwx1ps3af1W0He4jfuQ7bnJROuaq5ZivYsZBGNl6EFyS7wPLbPUkF_u2YCg4C7PEXRgM7RkuCWNMYgzakVHX2GTKlypjWVFi5Ys_SJrOkLOBnnLyc-kUaJHv84RjsEhX7_sicUyO_bvYL_1RFlacvFndUbpP6RPJwWON7nyZSKm-PiLUbnZIsy-8STALOqAkWaWFrFoosJt1QF3cqS_HluEjfI_btS85FnYidjr04rMNTKoTyZ-cwwM1b46XQp8ATpFBGjTq_SdOF6qXxfinKudW8XBX08iDAj8wWzIqCING3lc_M68TFBCjJfgEi4w9yX7ytZ7SxDFNKcpH47TXhqOB97-ift7E-i3QXq__MS4z1iw=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios6);

        babyinvarios6 = (ImageView)findViewById(R.id.babyinvarios6);
        Picasso.with(this).load(urlbabyinvarios6).into(babyinvarios6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios6 = (TextView)findViewById(R.id.txtbabyinvarios6);
        final String stconsulta = txtbabyinvarios6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios6 = (Button)findViewById(R.id.btncomprababyinvarios6);
        btncomprababyinvarios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios6 = new Intent(babyinvarios6.this,webview.class);
                btncomprababyinvarios6.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios6);
            }
        });

    }
}
