package com.abigail05.Gamise;

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

public class gamisebodymc7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodymc7;
    Button btnconsulta;
    TextView txtgamisebodymc7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5d31999ac270c7a861e43e2db2498875";
    ImageView gamisebodymc7;
    String urlgamisebodymc7 = "https://lh3.googleusercontent.com/A_bkLDR48SoawavyDx_FCmO-DQmIqDKJZU8q7gTK6pXf3xIrezQ3bNS_tYiwFUTc44rhMzqQvFfQEGagP1pCEAfvi6RnFBTObb6MnMBTDYvZNpXdsDyuFWpEnMWnVatbVf_NM29SFC2ynFu5fu8uH8DRufoog5PazmrEDxDqEb4HcL9Zpr7N2Qni_mlMkTZUD5BwUBXEMs_ujaA3NB7pqCy2cO_x3Q_QDKd2lg6x8XQ7sqmR4FZthSGLN9tIEFvdCgv8178FjwmgqHanWs_1l9RfaJCW3LZvVOqkEj71SW1623uKeeoSOuyM282_rZ9S_X6bpg_wV4sjthn_QMcc3bcRSxbS8vfV-XbGBQwBitKsE6wb3byfzVBVctQnOWEZmPZTNCmxX1F8u7eryitYey-wX0EaCPi4reLzRXAaYoyNB99c9fdiW11pD3oRv_9IHs7Bq3ACq_AzFsqQKI1rx9OICWpSzUb6bwAwpwZcesHR9AQVLbYGBcAuv42Kp1G4xld84NVN-mM1P-BzJZlsvZVkNy9VO9wKg1QbNJzEs4wXrQqJ5Mkpde7uow9NuCmOBoW1lc583dMEGPg0JXvA1LHLza05-Cv3NIcPQCMX-1Nx6ZYb1GjCL3L_S4Hhl0ldjCHqpdvsiNluncuqrjCq5h3FBTi_MOpVTtjp8_QAcO4=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodymc7);

        gamisebodymc7 = (ImageView)findViewById(R.id.gamisebodymc7);
        Picasso.with(this).load(urlgamisebodymc7).into(gamisebodymc7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodymc7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodymc7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodymc7 = (TextView)findViewById(R.id.txtgamisebodymc7);
        final String stconsulta = txtgamisebodymc7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodymc7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodymc7 = (Button)findViewById(R.id.btncompragamisebodymc7);
        btncompragamisebodymc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodymc7 = new Intent(gamisebodymc7.this,webview.class);
                btncompragamisebodymc7.putExtra("string", urlcombo);
                startActivity(btncompragamisebodymc7);
            }
        });

    }
}
