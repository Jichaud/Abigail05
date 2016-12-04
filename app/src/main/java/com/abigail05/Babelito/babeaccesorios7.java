package com.abigail05.Babelito;

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

public class babeaccesorios7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios7;
    Button btnconsulta;
    TextView txtbabeaccesorios7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0e8d69de8e3b6dee2c8c3727c50d83b8";
    ImageView babeaccesorios7;
    String urlbabeaccesorios7 = "https://lh3.googleusercontent.com/aZtCTM7vVhCE3F3C75dwU73FOEPGADD8upBqrvz3gWNz4uzj7cOSCjjWh9cVZGAF5VvbDhFu0qITWn-r_9OaQea3180QcAZ5VMaX0dJMma25SOqb97DGyNGvQ6c2ecE75d9w4TtixAFLZernaczk0ZrBYGKFrC-v8fcmWxginurE-jfaG8QxZFrz3tftt41ymZ4XTvU1o6tK2EPbL6vx0oPhUj0ONoWyG_x4V39iaW8NDzBn89RIEb70nFH9mtqSquDFFQtHvg04RyUimFeFd2TZif0tlQJjHBPwoN02n597wewaAVj7Q1c4VvmYJZoDgm9QcxY2s8Yx-tsIQrS2qciSpbwWMxzTJ4fgtCy1TaQEMnM1LGYDPw8K3XVk2GQ1D4wIOLNlhTblibh1s_irWwKaAbAu_4VaP0xE0aAvdeZu8IpurlbZwXdk2SjSlKQMpzYp7nxLIe4GFkpaOkjURy9pvYFSwv0WC2adhcvBFD9dQqPOBhEgGuoyXkhp7-E35xXdStBplF6LintLlac4OSHTRlJuDe1OeaIynB4YbJU6b3Arxf_QTxBx9V2F1AOwekwnPPqtlj2erAanljL_OTnJ5CQ8pNrWkAOQQig0iCTZ17OwTQ=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios7);

        babeaccesorios7 = (ImageView)findViewById(R.id.babeaccesorios7);
        Picasso.with(this).load(urlbabeaccesorios7).into(babeaccesorios7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios7 = (TextView)findViewById(R.id.txtbabeaccesorios7);
        final String stconsulta = txtbabeaccesorios7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios7 = (Button)findViewById(R.id.btncomprababeaccesorios7);
        btncomprababeaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios7 = new Intent(babeaccesorios7.this,webview.class);
                btncomprababeaccesorios7.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios7);
            }
        });

    }
}
