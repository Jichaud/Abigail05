package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class acerca extends AppCompatActivity {

    Button home;
    Button marca;
    ImageView mlcertificado;
    String urlmlcertificado = "https://lh3.googleusercontent.com/5nqyaLlzI23iA2EjQ3YtzOxDn01uMVr1siSi2c9CG9Ke_53T1DlzlBb6ZZGTHp-bxnExSS8rlSjLSE2wYZl8imsEhYWBPoLuMTnVJG2PtYL1lF2BVBzhKBAYUx0YBTAgnnjHWdPiMjPHA3Xz5OUHpOcLuELHU5h90HrwF3usfzL4_Wp11JjpVYSNZLtCSpni_0F5r7ZYIZZoaE4akzhV38XxS7NZDR4jh8thBZ9-_L5_wO_85KOeIJHF7u314O2FdD1FGwYxOnyAkmJmXSLZIq98ZbMbA7TCqBayaLZfNSGuXsqMnlszMhTiXyVWmsXwG11_jWAXlIbSv4C8hqFlhGEviX7QRGek20h-hxYxbrK0fJvKq0yHRlQfBgkIAuUdtoPGEMzcx3208PcR16oRXqde19qqlvC08o6u6RouxCRzcsRUcM5AAZZERGfj4dYxnjUH5FLLJhtIDnxXgS0Ul1jfwImCGrUcdzOaG89PficxJtGb7J9KqRnFCRygyj2u9RVDNF98e-eLUKyxzH4yFyu-VO8AewvAKkiNzP0tZGto6xu6nAOGUJ0m105-YMnmuCN7V-r6MKs4H8ooweLD4OqKAl-XDY9-WMnvjXhOCBXJTvw80SeW28EGjYZ6eAYYXyd3_I6-bb4ScmvU0jgPM1u_p7s5L1iC9_XWFXqZf38=w573-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);

        mlcertificado = (ImageView)findViewById(R.id.mlcertificado);
        Picasso.with(this).load(urlmlcertificado).into(mlcertificado);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(acerca.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(acerca.this, MainActivity.class);
                startActivity(home);
            }
        });

    }
}
