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

public class babyinvarios11 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios11;
    Button btnconsulta;
    TextView txtbabyinvarios11;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3fa687634ea3160f9f8da226b8f86f1f#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios11;
    String urlbabyinvarios11 = "https://lh3.googleusercontent.com/tb7Wf-G7S7P6cccWJ_yytR76mJcEprkz0L8lEeAqwmzJyPFD_RyWl0NBoQ6FORd-lRCS4MZXLWM2PczVG9ZFNf52yazzGrI1ZfEaDOrxBKTyJE-GB2dRckSnooCjPJpEFUqcqXL5i3x1gObrXYb1CboVjG9BeAn6-ENHTMC86VSx-X-Hugzz4kU9CcTRWPV2K_n-DqMhF0tK-NzO28zStxss5xdpGyEUnRr9nTYVX_Qadw4UkqpdiPzuzry4mNGSg3s0RzcSCgs4mXtiw1AT37wKrlenpee1GPTLlCEzEPZBAS5Lx3wOLEaBCBPLcRHqiINqXKirPZY6vMSmiZo2LI1A4qJ0_T1zfyAqWy4Sp2WThYKvLzk_WzQ62IdLCWKOH9JSUjsVDhz_5vbQ-5vENo52qOzxO75J3qiIRwSBQKZU8LZ0sGs9V7DeWmK7UcApIp5iB7Zk3wnVAvnW9faLgiInn_JO6r1Z4-8oFsYFykQU-Q7Xj5oH-iYPNyL1m-NYOgiYi3CVZcYI5hriGnuda5kpDZZg2kTrCxr2ZkHcg8U__593EBBxhiEApAGHbgoHCs1zzFnQHkJptFI5tIcyG-g8lArmWII8pNKAyPZ6O1SLoabLP3L7qRijXJ6ClYgkdmj6JxqInUlqmw57A0eqkOaPSaFhtrzW6PsKKOowjdo=w328-h332-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios11);

        babyinvarios11 = (ImageView)findViewById(R.id.babyinvarios11);
        Picasso.with(this).load(urlbabyinvarios11).into(babyinvarios11);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios11.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios11.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios11 = (TextView)findViewById(R.id.txtbabyinvarios11);
        final String stconsulta = txtbabyinvarios11.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios11.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios11 = (Button)findViewById(R.id.btncomprababyinvarios11);
        btncomprababyinvarios11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios11 = new Intent(babyinvarios11.this,webview.class);
                btncomprababyinvarios11.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios11);
            }
        });

    }
}
