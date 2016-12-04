package com.abigail05.Colombraro;

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

public class colobaneras1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompracolobaneras1;
    Button btnconsulta;
    TextView txtcolobaneras1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4f1a744d7e138efb28ca87e20df675d8";
    ImageView colobaneras1;
    String urlcolobaneras1 = "https://lh3.googleusercontent.com/yWbWb-yqflBZNgw349ix-dsPLQB0Z4eCm1NqcwG2uRTVvc-ID3S6LwBGwggitwkCtFbI1Qt59KZ58wB1ATjEQzocAC5gAf6FzeFNMrHPAAgJ9QMbUi78N68LoqqLgYSyQdpM1Kt2Z6YOnV8AGj70-GMDwbHEzrAcwPeAAlMHT5eTd5TFYq4M7oyqE_JK4tQMEXEFWx7MWlrNtm0AKD-WM3bxiyuM86urMi09mjrhtfONFL6j1XwuKaK3GRqJ89kFnlUVlsttwt0RmwmWYVRG9kD9HbaDFwyNGjBMChvr8Ygwo8Y9USiaYkamlWb_OTQmRqEMgMJsk9Xns8Ule6-Q4q4VzoC9_TCf1STyM7AZMVC_dSm3MR3GUe1S--2NCO3uD0E62QkvXAHKl-i-mu-0Me-jCUhcYkv8zBuKs3Z32slwpy_-7kl3_SwS_fChPcoe1NKbYPMEtP0L_XjBqauimo9YwS1EnUQ3gcd_JHuWOHumcKUzTb4Gb_dMg_wZP1zD9kX2i0UIBFubcSaK4g6uM3YEx2tkByxjFpSbGtzdOfJaaYIPwkOqXp5zClkED6v4S_1F2Mv6YFwOPkcez11r18WbaK-0Q1Q33gdZ4nDopTN8kqOzgg=s512-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colobaneras1);

        colobaneras1 = (ImageView)findViewById(R.id.colobaneras1);
        Picasso.with(this).load(urlcolobaneras1).into(colobaneras1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(colobaneras1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(colobaneras1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtcolobaneras1 = (TextView)findViewById(R.id.txtcolobaneras1);
        final String stconsulta = txtcolobaneras1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(colobaneras1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompracolobaneras1 = (Button)findViewById(R.id.btncompracolobaneras1);
        btncompracolobaneras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompracolobaneras1 = new Intent(colobaneras1.this,webview.class);
                btncompracolobaneras1.putExtra("string", urlcombo);
                startActivity(btncompracolobaneras1);
            }
        });

    }
}
