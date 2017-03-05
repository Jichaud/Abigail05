package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Abigail.abiprodlist;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button abiprodlist;
    Button marcas;
    TextView nosotros;
    TextView contacto;
    ImageView abigail05;
    String urllogo = "https://lh3.googleusercontent.com/BN2PVNdf8OxzxlPAi5a-iF4gAOKOaxXwUb9V4QnxWU6SwX1Gn9twRMG8RxFjYaqnhOK1bapd7k_WWwGEcZXcy8TJRXwVmNiO3N8CGFoxn7ZTnTxEIpu6BzFXTgn1iyFqZsxVPAfDf6segNIAZ1_Y2mNy8KiNX1Vu8ZPyox_PN_1Kz1mfREjd9oH8MtE2WE0OoqD1fXT7WdcFdS3pD_Wt11g2P9EXZtx0sAWwm3p5H2etv2zmilkFgpSbbqiGSkIYwqBNCUpKkR0DC3OCujOwmZhJTEf--XbwMhoK2Yzyegbc6SVSL0aZV_vAcPJxgY6OobaIm8peOMc6ysEkSiXqdZdWS-80r3rMC_ZWnKm3Vp8xRwlY1Baug3Lfj5bfCwO04izQ9e9jyDljkD4KBg3qk5wo2dcvBLK1B2Sfzm5159mc1Npx5IEH80dTngiaW0WDOOau1rjnbDPo8MOnZ63G7BxOdq-5fzeCztJ2a7V2YNM4JTNNZi_7pa5uM5x1x5IFGtgVYr8ouhkYevv867bvKxkWSRdk-3_qSvWmtlXfWaueTpSGxhREkOPmC-bWsD1NDK7XBp-vyJpzKgSyPTOBCbxLw_NbzMWUBeFLpYhAsLDTcfJJrA=w332-h128-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abiprodlist = (Button) findViewById(R.id.abiprodlist);
        abiprodlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abiprodlist = new Intent(MainActivity.this,abiprodlist.class);
                startActivity(abiprodlist);
            }
        });

        marcas = (Button) findViewById(R.id.marcas);
        marcas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marcas = new Intent(MainActivity.this, marcas.class);
                startActivity(marcas);
            }
        });

        nosotros = (TextView)findViewById(R.id.nosotros);
        nosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nosotros = new Intent(MainActivity.this, com.abigail05.nosotros.class);
                startActivity(nosotros);
            }
        });

        contacto = (TextView)findViewById(R.id.contacto);
        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contacto = new Intent(MainActivity.this, com.abigail05.contacto.class);
                startActivity(contacto);
            }
        });

        abigail05 = (ImageView)findViewById(R.id.abigail05);
        Picasso.with(this).load(urllogo).into(abigail05);

    }

}