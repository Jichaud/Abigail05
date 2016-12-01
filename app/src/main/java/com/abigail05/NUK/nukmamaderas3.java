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

public class nukmamaderas3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas3;
    Button btnconsulta;
    TextView txtnukmamaderas3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=587a4120b1d859a29333f5aad08cefc8";
    ImageView nukmamaderas3;
    String urlnukmamaderas3 = "https://lh3.googleusercontent.com/1XUWcKG3abYaWxwuGfqqMtrIKwEby-fgrlptueXhCsHIJiLq2Q4rbQD15QgBRM7VCDPEeXDk3M25QG6lMMCw6zAcus5igyhG1XWgvF5yXbd1Yck1_iEGw5awQC0bdNyJ09NWYo9MbUZzp6eTKRleEasU9vVyemAKAYwAMUPQ5CwymFZaiTUjbDmseC7ubhqibEYnsayuugt3i3JIcUDH3G2mAkcHE0Bv-wTMevVwlIFVkgNDoiS2knEEmUC9qc59K0qFBox_3YQDdnUTNUGZThxZ8hMPkFJVFPpfsXDjHycCcwLEBFyIb-FdINWplCDzop7fK3vKPmget6BDM1erzeG8F1XYKVj1Uo5tbn-lAnB6_NRasyfnjk1ohod3UbJqPHIrn1L4wuDyZSRncg_3MJCsCB0qJl_aJcQBuhG-a9stfnPKlnj64pff6UwlQgS4bINUg47c7xlFZwjz8qoPzEfaOuLn0c8mDZx3eTxnyZ5uGe2oBrcxdh1jef9ewQmy8d8-SDpwCmLy6vfoTuEkZ1VII2x9m3UNGgtfjxIRL1ybq7Dm9WEgU3jVTzgxT3nhem_EBDAhCEHUz47Y2jVPsD5ToTvUHhSi-WfSUWxAJD4fQeDVxQ=w259-h365-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas3);

        nukmamaderas3 = (ImageView)findViewById(R.id.nukmamaderas3);
        Picasso.with(this).load(urlnukmamaderas3).into(nukmamaderas3);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas3 = (TextView)findViewById(R.id.txtnukmamaderas3);
        final String stconsulta = txtnukmamaderas3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas3 = (Button)findViewById(R.id.btncompranukmamaderas3);
        btncompranukmamaderas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas3 = new Intent(nukmamaderas3.this,webview.class);
                btncompranukmamaderas3.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas3);
            }
        });

    }
}
