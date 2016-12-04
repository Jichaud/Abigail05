package com.abigail05.Colombraro;

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

public class coloaccesorios2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompracoloaccesorios2;
    Button btnconsulta;
    TextView txtcoloaccesorios2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=aa1e55cb92e2deace448b2b5efa2ad2a";
    ImageView coloaccesorios2;
    String urlcoloaccesorios2 = "https://lh3.googleusercontent.com/cUvi_L0iqFd-vBbMOwYoOCII7PaKO6viWL_SOAticACXtD3GtBOrfQkIFQeKxixZkLJcgKyohQs-1IbOZ60yvGHKwNMECH_ypZlRAutvtrzcE-f749aykGSf7XDRSLxsv_8pei4J1elAO_SbFYedGOyZrxr2mkbAp6HUOji0uGmB3aK_QBng6BS3VCUPEitkxwayZ5DOyJv2mgPvP2aCIwc243qdUdMU1FKvlQap3Bbb-dRdIylw8G2HMc42YZwioSGi7Qgz261qsR-rS-_664wy_LOjyWX6ljUhIKWuIkelI3PukF_HFZbyLUkKqB4EiLwfdu5r5Trf-WxHIh-7PYR8zaDxlABnFz1JAil_iF7xQNtKewmqKspX_vnvjPzccudtH4ON7DcCHclSsw84LfjhuxPPUmL4vUFpXhlZjRP6hSymQrGzoWDHZxSczRVFXtV8rgOszrS7MfLzdyvbR0ObmR_gumm8z6FsqlHyqh101gfpbABydqH1KvhqgtZipv3zGEJIePfUhwzd_L6scQsjOcIR0txuydpHApC7Woc2KHxNNp0gMerDlLP3DdkWzsBEVkSe50I6oF1vm6o3YYBiWBpsQepXEhfaWuF5hT9gmzdBYg=s450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloaccesorios2);

        coloaccesorios2 = (ImageView)findViewById(R.id.coloaccesorios2);
        Picasso.with(this).load(urlcoloaccesorios2).into(coloaccesorios2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(coloaccesorios2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(coloaccesorios2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtcoloaccesorios2 = (TextView)findViewById(R.id.txtcoloaccesorios2);
        final String stconsulta = txtcoloaccesorios2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(coloaccesorios2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompracoloaccesorios2 = (Button)findViewById(R.id.btncompracoloaccesorios2);
        btncompracoloaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompracoloaccesorios2 = new Intent(coloaccesorios2.this,webview.class);
                btncompracoloaccesorios2.putExtra("string", urlcombo);
                startActivity(btncompracoloaccesorios2);
            }
        });

    }
}
