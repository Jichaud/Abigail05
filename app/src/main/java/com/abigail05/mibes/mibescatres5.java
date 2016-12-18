package com.abigail05.mibes;

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

public class mibescatres5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres5;
    Button btnconsulta;
    TextView txtmibescatres5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7acf3d00edfefecfe3aa9e2806b67b24#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres5;
    String urlmibescatres5 = "https://lh3.googleusercontent.com/OQtXOvUYyX85CwVfV4mkSiFqjTHJwEKjjuQEtaLl7ZKKuu6-6447QsuDZLFkqImzI2ISuA4kwaVuXKWb1THYYWyoKQQYxtncU8OUCucrRafEHe5ZnFbgyH5AR3j9jFaNMA0aI73sEEmOIY6WEr_g5JDVbzQd4XHbFIaXy4oCCaAQhBSroB8w364NxoSsnDOLDmEt0o8d_Yq7OyeXAkwoNLBejcLkNRgI7vs-F226v8UB0jW-JqEabysG9g_mO4FsKMsWKE34Qun1nhyUbJifSZq7pChD_A0ZfA6X1eX_wmGx99ga6yBgL-64b8NXNaQMp3YDArAN4UWTdsePpUaoPnN1rA_x8yz0Qlncdadj2BdE7zFKvlVuq0Xi350IoVfuGEeyo07EozGTU6u0Rejx1x3SZ8cJQSMzuI5vm58T5ZWftQDvUJFXrE5V6hiPLJ8julQ1YmIbHCvGK3Ffu3y2oBw7BT7XbHiYlsuE4kHtG-iJvxR76ea79_gM9_-GIppUvBeUthxgoCkdYqZZRtLeSoBiJjmciqT9QvEO3E_AVVl1jqeSgEzNBR0Q91_QWzo1y3MeuMEHxfKayQ1ZuLT02LbXTaqWw5sODanbynlLikVZ09zEFLoWMsurtaJRk5a-_fsS0b78y7QHDcW7unm2YsZ4atSYOA_S-h2GlVAq4k4=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres5);

        mibescatres5 = (ImageView)findViewById(R.id.mibescatres5);
        Picasso.with(this).load(urlmibescatres5).into(mibescatres5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres5 = (TextView)findViewById(R.id.txtmibescatres5);
        final String stconsulta = txtmibescatres5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres5 = (Button)findViewById(R.id.btncompramibescatres5);
        btncompramibescatres5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres5 = new Intent(mibescatres5.this,webview.class);
                btncompramibescatres5.putExtra("string", urlcombo);
                startActivity(btncompramibescatres5);
            }
        });

    }
}
