package com.abigail05.NowyBaby;

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

public class nowycoches2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowycoches2;
    Button btnconsulta;
    TextView txtnowycoches2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=76e958522cc74cc2e870e4c322b187da";
    ImageView nowycoches2;
    String urlnowycoches2 = "https://lh3.googleusercontent.com/8qrwjgN13sLvWouJRwDoYgWIWxWFM9lHhJIKde7_X6RIOFGFOPZURKE3ShuJMmKOC1MFyKGF_zxrtGh6Wmz1Kuz3vYJzYTqH7vH7qzKN--V1KSfFhYJigy11kd6XoXxgl3EDuKroOuHQ8qxGVoqX0aA9dTF2LjYQvoI8hs6iIemxXudPZc5TgJB16j8rHJ2taX2wwZSo5tgNZGlbUeX4yy922Zz8fr_xFmNeyFGkFwdq_BNooqN-FfSCzbVhx6L2A_0hv_TupAQY1or8LaO9JImj_r6qTG6lnaqU0zY3DINDNmGF2qCPBCnkLaET8dVR09xAvB1E2Z8tcEzoTey_8Ap8jKR0cS7FspTUyJFf79Y3Db5F1FBfmNeVHhwc7gITgeGWjh38zIO_J1yApio-C5SDQZcxFVS7oigonX3KPNbYfGHVeSjkO7TVWN2V4oAE2cv8uSduXxzwI8XJTEtTlo52NKHcrYZIUoGmjFOHZeJFJNSA-2xdtFg-EH7_KPsfo7teqM8rzixUQ10_rVCoYcwCP_yU261GsPbtgF7ZbHoxj0uQQ6EtCIwelDPY4mkPgIwOwbmHAVDdoLqpxDgJS0iR0U_ykYTqdY0L6ICCaaXayCrnDA=w468-h625-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowycoches2);

        nowycoches2 = (ImageView)findViewById(R.id.nowycoches2);
        Picasso.with(this).load(urlnowycoches2).into(nowycoches2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowycoches2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowycoches2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowycoches2 = (TextView)findViewById(R.id.txtnowycoches2);
        final String stconsulta = txtnowycoches2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowycoches2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowycoches2 = (Button)findViewById(R.id.btncompranowycoches2);
        btncompranowycoches2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowycoches2 = new Intent(nowycoches2.this,webview.class);
                btncompranowycoches2.putExtra("string", urlcombo);
                startActivity(btncompranowycoches2);
            }
        });

    }
}
