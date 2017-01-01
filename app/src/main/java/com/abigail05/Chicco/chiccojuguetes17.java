package com.abigail05.Chicco;

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

public class chiccojuguetes17 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes17;
    Button btnconsulta;
    TextView txtchiccojuguetes17;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=578dbe27de8f2013e5661716101d1829#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes17;
    String urlchiccojuguetes17 = "https://lh3.googleusercontent.com/Sl1QFPFIptTwlYrOghtfP0j7tXavsIsmBTrs4oc0gTUOrCdZ8xWvGaTGfwSMWCf04PwwMn3uT_F9JEDM0EAc-9zorJ5cj49Ck7clb5Z2z2NHKr6McjcvSVlJs_1JkDtNtpBomAUuw-oGwojc-QQZoc91H7i40p-An_A8TR69M8MjsX6JK_zj5kZnixy5ciX1D69MI3_7Qkt2VV7OX6BZKUvwvfiOe9eLjE-hVKx_6I7duk2jYccr0g8mCPLLRg4wC8ro8bm2sYgtXEoyDRSDr3mthvpAD0PZR2R0o-uC0YADL_rCWduzkkcpsPvCUMXvFqJG2i1k_GKcj3eAcM1jzUrNwmt1FKuYwoQFbzNrGlqnb3YqQIQ3iAQUVdMkpOSIwdDPTNzaw7gutnxGdv1OJvehoN8NaHmgh8gosjpGY8y24UFg0-spe16me-5K8qCytg-ZBgKA6ggoJmr8svzv11UfsIsBxPVxVdF8izP_J7ZPojaWqy-k2rC_mwxJhkCqxkOUV_tXzIYY2Mx0rsCbVY4Hz5acRWS6S5UYjDRbY7TgQjcCWzwVbbtNZbp3RqD08wqzgMQw7yxcRP2qZnEdoAOAAZFlxLTcKfwxgrDB98aKRkeU6rTzI_NSi7ExtMVnkp4oXwXBEIB9fXHEPy7YYYkhadOM4Z7ghUQYdBuZ_t8=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes17);

        chiccojuguetes17 = (ImageView)findViewById(R.id.chiccojuguetes17);
        Picasso.with(this).load(urlchiccojuguetes17).into(chiccojuguetes17);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes17.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes17.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes17 = (TextView)findViewById(R.id.txtchiccojuguetes17);
        final String stconsulta = txtchiccojuguetes17.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes17.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes17 = (Button)findViewById(R.id.btncomprachiccojuguetes17);
        btncomprachiccojuguetes17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes17 = new Intent(chiccojuguetes17.this,webview.class);
                btncomprachiccojuguetes17.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes17);
            }
        });

    }
}
