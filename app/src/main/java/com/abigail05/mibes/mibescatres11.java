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

public class mibescatres11 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres11;
    Button btnconsulta;
    TextView txtmibescatres11;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1c01411ac287902bf2c1885590ef4625#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres11;
    String urlmibescatres11 = "https://lh3.googleusercontent.com/T0MycqnE848JoFTQHErJFPfusQNkyoHNr-lQSCmLbkSVNtr5rPVmCs0Y4g6PqGdESOsDqNCcEcKwhxTx3rFyh6fMX0mcGJVJTSLPpJu-8EWng347ww-nstiv_EqcCahNN1717GmBC0BB96wWa3r0e9REBhcwi2rXHXcAVZZdNfSZ8y00cx13-cPxfwRKbJ7YTcAy5ASzRZzeJk6znTOPB_nIo6cyQ5xca_ScNSRaWvrEC0m2hoKGIukZYf3OX1JZ9BZKzbVPi3ioBqR7MMcnTGP__3bcNET1OCQ-Q3dCyKhsMY3KqvPtMV68aOCmYTIAvjsgHE8ztWJ1jD2PsKAEODzMZcxQfhUqmER3BWrJQidkrGGpJjhwO3a8BdrMA7mBFjXATRkZCB1YB_ezghVDpg0TYRJ3hORglcgvUP-1CCwiIsmr-2pdu4SoDUFqcqelolpHjg3F-ZQDBk0mQp5meHZdUkcO7nElNK17OukV33Zg1ltJHCfnlpX1blEp1O1bbxMSrR4S2NPoPJkLVlA0xhmXPkbD2tufeHULBlABNRMvUYEUYikCUB6zpoZMpH17x6yBqrSGisFcIMFY-0rqqPitvnIgzk3_g_8cKSZz-_gsUu0bqb4u8Lzapj3fwgkt6IRRhetOkzXpRx5SQNtUbzrV_9Df5bzPhNtw5SFmsv0=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres11);

        mibescatres11 = (ImageView)findViewById(R.id.mibescatres11);
        Picasso.with(this).load(urlmibescatres11).into(mibescatres11);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres11.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres11.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres11 = (TextView)findViewById(R.id.txtmibescatres11);
        final String stconsulta = txtmibescatres11.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres11.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres11 = (Button)findViewById(R.id.btncompramibescatres11);
        btncompramibescatres11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres11 = new Intent(mibescatres11.this,webview.class);
                btncompramibescatres11.putExtra("string", urlcombo);
                startActivity(btncompramibescatres11);
            }
        });

    }
}
