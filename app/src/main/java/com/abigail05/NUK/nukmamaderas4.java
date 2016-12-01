package com.abigail05.NUK;

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

public class nukmamaderas4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas4;
    Button btnconsulta;
    TextView txtnukmamaderas4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=659b488096093474268ad392d5a97fff";
    ImageView nukmamaderas4;
    String urlnukmamaderas4 = "https://lh3.googleusercontent.com/cfQWuaJQbBK5oJVL6P3ImpFy2GysNbwTIWjI6MgB7Rr9vAPPZ4otGKL_kuKhE5VlpAqX6SH4L-utOEGLH8ba8jdLNTRaNBze6_Uq18dOogHMpeFkVU-WLbCfDvSJVUM1gijsWrAJiFxLBNz2Epri8vn198cCQFQtEvD2AjtbkPOyMp6SsY6M80x_N6BRaRhzhhOYFNJlfk5y0ni0BszxfILWM51cTRaPCbIN4l9Efxb4KQo154d5Wko3opsGDBUKn2wzdY4qlqQmCKM6e9GJRb5dxzaF9w5Qfxw-trVxzImcmRWR8YIfOQO2isa3auk8onTE6QKt7zx_Bi2MXObPNuwYLmSxYaFqQ-2xKCpXvnaa0atrUlwonnqQTGBjCW2yzItwOC5zzSfuhPuKhhH3O9kKCg_EIEizLVjXIslSz6uQMzIPs3YBGp8SmvQ6b1JztyKNfElzDRkwAPs4Jp6eNVdhZd4feT0nZYt2ZJnRFKdM0Zo_WXlOC9sto8v68HGh-9cCrFnTe5WVnAbzAnphcx9AMoZRuu0e8Rz3ZWs_-Zzme3NUTu-yotEuo_E_Q_H87ZifohnrUA3PfswIs82GTl5jbLZFwUW36Cp_N9oXN12CgOIgow=w259-h365-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas4);

        nukmamaderas4 = (ImageView)findViewById(R.id.nukmamaderas4);
        Picasso.with(this).load(urlnukmamaderas4).into(nukmamaderas4);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas4 = (TextView)findViewById(R.id.txtnukmamaderas4);
        final String stconsulta = txtnukmamaderas4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas4 = (Button)findViewById(R.id.btncompranukmamaderas4);
        btncompranukmamaderas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas4 = new Intent(nukmamaderas4.this,webview.class);
                btncompranukmamaderas4.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas4);
            }
        });

    }
}
