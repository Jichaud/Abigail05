package com.abigail05.Nuby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nubyaccesorios6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios6;
    Button btnconsulta;
    TextView txtnubyaccesorios6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=edb0a769253636167e9708b8bf234043";
    ImageView nubyaccesorios6;
    String urlnubyaccesorios6 = "https://lh3.googleusercontent.com/O_bpoc7qXRQX0v5TQqzlLYw3U-50YcZzfdgq5PM1oYhWxH0cN-ZgiXxR8A02bGC7YD3onTsfKe2mGNED_lc6cfO7frt395knmecEEd9Jon61p8VevwW2ocXTUudIlerzrghCd5-1QDwBvQQqmCI2KcJg-2FywGjZtG21aOzU-zR9CDll3T1Ktc-y0RZEDXHae2v1PxOWW7TMhedZD2R_KsIVp5b2Lb4_LKcEMaQEUtOHloUyO4fobfbdnd7TDfCiYPt1MQiqrlwNtObSI2VxjTfzABnB2G_6wqZbvDqLyL0R1M1CN6KT1IpHRrvLhbpVyB04xTQ4LkFWjUwDEBGnc_UH3XnR-6bhyzOR-htzfm053Yl2wgnCVtPdVWL3mMK3TgbsMjYPfBjD7VGlaYGwFjlC15siZOSZki5LmEYIaCA3m9NTXXonFVD6c5cvEHx0bUeX3oSWKK05M2-yjfOVIuckaOhe-MlzRXorrNtq1ESpzYcr1fs-b0FcqpSfrPMS6y_GfvwitAifEuNVp5O5zqpGUzYQ_OzoUE1pOynuncFioyAlktGPJjtT-FYBxUoPrNbvw2I1-eRypeauCgpXMOZTpWqZmYEGlxW9bnYWgR5qnGXc0w=w500-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios6);

        nubyaccesorios6 = (ImageView)findViewById(R.id.nubyaccesorios6);
        Picasso.with(this).load(urlnubyaccesorios6).into(nubyaccesorios6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios6 = (TextView)findViewById(R.id.txtnubyaccesorios6);
        final String stconsulta = txtnubyaccesorios6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios6 = (Button)findViewById(R.id.btncompranubyaccesorios6);
        btncompranubyaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios6 = new Intent(nubyaccesorios6.this,webview.class);
                btncompranubyaccesorios6.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios6);
            }
        });

    }
}
