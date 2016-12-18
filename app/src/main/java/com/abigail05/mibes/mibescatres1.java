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

public class mibescatres1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres1;
    Button btnconsulta;
    TextView txtmibescatres1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=49a6235e3e8b7e572318b4ba0c3b42de#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres1;
    String urlmibescatres1 = "https://lh3.googleusercontent.com/ljxJfbT4alx4SHDV0hUe6u_chA3oukUkM31C_5nt0PifnKLn3DfAltRcDbOrvxWOQfcV-zf1Ul-1-zCyZWi8Aq-gQnktksKiY8GsrWM2aNIH6kxubd_WZpJcb6msd-2B2DmGEW6H0LYtWNq7Xq5la9lI1HSkAUiFKkbwvIaBRQ1LQzz0PS2vCWpMu5QJtfv-cUUJacPNpgjY-A3eWstbEhZuxfEswj8vw36jiAfMHOJ8PjzYZR_rcG00gIRX_oAZyg5GdiZTUmOfItHmh2NG89_DXwWIoGIKAW0XKso_jlj0mbn6DPQ9oUlwXLQrz1qXimyXD_7SGaFL4YERpUtZ5t-COsPZ7kpk5BPrItDicZxj1alBCpEqqGiHBEA-8SjjAnwkbcUyx0OS4oLD68VSDGRQ5u48DNO4R4mQ0FiSVKT8RFKwheB0jspyqzZnLqtHlXAEtRgY2qCeOz9k3xm4U1il-9TceTACJNd7rr8iniZ19yty_qaaCJC_PQFv8Dbln9DwlL_YpXr9ZjyOaeDCy8GApvoxbdh9dn_qokoknh320089TIySSNmsDcQNvsaOQmDN4mojjA6ax8FJS91kW-OEB4l8Hwl6ImuyhPoMefwk4tipz0Cag00b-1mi-W6UTA_2ek5AuHjJbEnRD5hMMnKuq3TWHP3neV70Do0nPsU=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres1);

        mibescatres1 = (ImageView)findViewById(R.id.mibescatres1);
        Picasso.with(this).load(urlmibescatres1).into(mibescatres1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres1 = (TextView)findViewById(R.id.txtmibescatres1);
        final String stconsulta = txtmibescatres1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres1 = (Button)findViewById(R.id.btncompramibescatres1);
        btncompramibescatres1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres1 = new Intent(mibescatres1.this,webview.class);
                btncompramibescatres1.putExtra("string", urlcombo);
                startActivity(btncompramibescatres1);
            }
        });

    }
}
