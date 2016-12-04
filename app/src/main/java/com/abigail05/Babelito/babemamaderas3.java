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

public class babemamaderas3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas3;
    Button btnconsulta;
    TextView txtbabemamaderas3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5421fd8159329ac3865b9dfa3c6dfa7f";
    ImageView babemamaderas3;
    String urlbabemamaderas3 = "https://lh3.googleusercontent.com/n52_7Cc1iaxXn3HUvrIhhAaJgQbm5sDKrv_AoLe2Ka7utTU5iYKy9eTJMhDulF31z4rHnX8RyC5lM40uM9OgGCun4tF5MjVipUTOU5Y48UBShDBEjZCIi28pony_N4e1mUtQP8-e2U_V8PVsFZSjahZg1fuTos4nrzHZJpHyXqGrPpdk_ae7WjHuENfxnd-bqtawnZ78WBq4zDAvIHvIkg8XHU11kff_nEiqDBnshY3TrfNvnrk8-D5FiP3-4UshTijZoaiN2E90lROqPDxkHcUeVrsedsZq0MmkT5MLM2HjQem0f80mNHkisEgEk6Cqx6MLiCtTst9BSIbzC9uq0NvWmW6XIxXh_Fpi_dHpI7XibK0D3IX-C2hHe42Yhf3J-_qiayR7bkIGdOWuML1ZiUXvQ79rB-RUox1dXMr1rSQ5bIfpRvK7dRNgNvD61qAchBIqtmZmQYfq7MWrxt8VQItg2QEKZYOSteQDbVS-DurmNK2UlzqRm-Bx_LcoZ0ypcdCNNFeMcVvW-h2dNLT6fyYkKc0GUT1DHJYHcVdyRe8iC9aHaxUBmmx4BrDcx1xgiXrqDFfVJnLUTX3hs3bDFMfWsAwagKYEr5ygU4TTHSZiyjPmow=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas3);

        babemamaderas3 = (ImageView)findViewById(R.id.babemamaderas3);
        Picasso.with(this).load(urlbabemamaderas3).into(babemamaderas3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabemamaderas3 = (TextView)findViewById(R.id.txtbabemamaderas3);
        final String stconsulta = txtbabemamaderas3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babemamaderas3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababemamaderas3 = (Button)findViewById(R.id.btncomprababemamaderas3);
        btncomprababemamaderas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas3 = new Intent(babemamaderas3.this,webview.class);
                btncomprababemamaderas3.putExtra("string", urlcombo);
                startActivity(btncomprababemamaderas3);
            }
        });

    }
}
