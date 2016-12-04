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

public class nowybutacas3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowybutacas3;
    Button btnconsulta;
    TextView txtnowybutacas3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=114c273ed9baa0361ef157c6f9e5ba4a";
    ImageView nowybutacas3;
    String urlnowybutacas3 = "https://lh3.googleusercontent.com/3ZhLpV80kSwHfpyNkzDf4kKwWhtGdrfSG0-XW0n_mjSKwf1Ymtw3RdfxUzpeyUe4IgE6_UY5ycHk3RTtnU7CWKQrMiqRdG6JRwYAAaBaBV_tPWkBzXhhLTlUdCWj4gX2CxdvE4n1gxDNyCmv_NEYpZbwkNTEW-mumQ4VbuXaEwiVoptmIUGIIky6dWSVGJA6fsH8Nt-1zM73UAJ1yIdkOtMS691PTxVT5RSdtzAj-liBm5uCSNJrb-k22iWAmXsu4P--byhDYR2aFGgT2OndU_aZQHcMN14K90wPUUNSFa-RV8h-nYuHpS4IDtx4WTzF5WyitMJD4lMtMPmhqjrOOl0Kz44q-njs32Ri-jE4G5DtLtHYEBlBY-LmuZDH7qu6VEntKEUycOTcTZFjLREhG6v28AP58DliKehHJFhPcL-iapPhPuli0Py0PUINFbM_hugtBJg8_Ly1AHFbHyIDh3Wrae997JG-mLdVvmAsabvvDzmun-iv0XM_CmPiO44f6MSUejReTVF9-N5b5MNPkDMbNUa1S7yd64U_LdAm03ldB24xKsfdKW1yUAOhuEURXVuLFJq12hir2VB5sGc0k_3DJtYQSiVkYFWaaGEzBUy1_MokkQ=w500-h372-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowybutacas3);

        nowybutacas3 = (ImageView)findViewById(R.id.nowybutacas3);
        Picasso.with(this).load(urlnowybutacas3).into(nowybutacas3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowybutacas3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowybutacas3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowybutacas3 = (TextView)findViewById(R.id.txtnowybutacas3);
        final String stconsulta = txtnowybutacas3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowybutacas3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowybutacas3 = (Button)findViewById(R.id.btncompranowybutacas3);
        btncompranowybutacas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowybutacas3 = new Intent(nowybutacas3.this,webview.class);
                btncompranowybutacas3.putExtra("string", urlcombo);
                startActivity(btncompranowybutacas3);
            }
        });

    }
}
