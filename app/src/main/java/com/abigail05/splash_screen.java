package com.abigail05;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class splash_screen extends Activity {

    ImageView abi;
    String urlimgAbi = "https://lh3.googleusercontent.com/BN2PVNdf8OxzxlPAi5a-iF4gAOKOaxXwUb9V4QnxWU6SwX1Gn9twRMG8RxFjYaqnhOK1bapd7k_WWwGEcZXcy8TJRXwVmNiO3N8CGFoxn7ZTnTxEIpu6BzFXTgn1iyFqZsxVPAfDf6segNIAZ1_Y2mNy8KiNX1Vu8ZPyox_PN_1Kz1mfREjd9oH8MtE2WE0OoqD1fXT7WdcFdS3pD_Wt11g2P9EXZtx0sAWwm3p5H2etv2zmilkFgpSbbqiGSkIYwqBNCUpKkR0DC3OCujOwmZhJTEf--XbwMhoK2Yzyegbc6SVSL0aZV_vAcPJxgY6OobaIm8peOMc6ysEkSiXqdZdWS-80r3rMC_ZWnKm3Vp8xRwlY1Baug3Lfj5bfCwO04izQ9e9jyDljkD4KBg3qk5wo2dcvBLK1B2Sfzm5159mc1Npx5IEH80dTngiaW0WDOOau1rjnbDPo8MOnZ63G7BxOdq-5fzeCztJ2a7V2YNM4JTNNZi_7pa5uM5x1x5IFGtgVYr8ouhkYevv867bvKxkWSRdk-3_qSvWmtlXfWaueTpSGxhREkOPmC-bWsD1NDK7XBp-vyJpzKgSyPTOBCbxLw_NbzMWUBeFLpYhAsLDTcfJJrA=w332-h128-no";
    TextView fuente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        abi = (ImageView)findViewById(R.id.abigail05);
        Picasso.with(this).load(urlimgAbi).into(abi);
        fuente = (TextView)findViewById(R.id.fuente);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/cougur.ttf");
        fuente.setTypeface(typeface);

        new Handler ().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(intent);
            }
        },4000);
    }
}
