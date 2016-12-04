package com.abigail05.Colombraro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

public class colombraroprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncolobaneras;
    ImageView colobaneras;
    String urlcolobaneras = "https://lh3.googleusercontent.com/yWbWb-yqflBZNgw349ix-dsPLQB0Z4eCm1NqcwG2uRTVvc-ID3S6LwBGwggitwkCtFbI1Qt59KZ58wB1ATjEQzocAC5gAf6FzeFNMrHPAAgJ9QMbUi78N68LoqqLgYSyQdpM1Kt2Z6YOnV8AGj70-GMDwbHEzrAcwPeAAlMHT5eTd5TFYq4M7oyqE_JK4tQMEXEFWx7MWlrNtm0AKD-WM3bxiyuM86urMi09mjrhtfONFL6j1XwuKaK3GRqJ89kFnlUVlsttwt0RmwmWYVRG9kD9HbaDFwyNGjBMChvr8Ygwo8Y9USiaYkamlWb_OTQmRqEMgMJsk9Xns8Ule6-Q4q4VzoC9_TCf1STyM7AZMVC_dSm3MR3GUe1S--2NCO3uD0E62QkvXAHKl-i-mu-0Me-jCUhcYkv8zBuKs3Z32slwpy_-7kl3_SwS_fChPcoe1NKbYPMEtP0L_XjBqauimo9YwS1EnUQ3gcd_JHuWOHumcKUzTb4Gb_dMg_wZP1zD9kX2i0UIBFubcSaK4g6uM3YEx2tkByxjFpSbGtzdOfJaaYIPwkOqXp5zClkED6v4S_1F2Mv6YFwOPkcez11r18WbaK-0Q1Q33gdZ4nDopTN8kqOzgg=s512-no";
    Button btncoloaccesorios;
    ImageView coloaccesorios;
    String urlcoloaccesorios = "https://lh3.googleusercontent.com/cUvi_L0iqFd-vBbMOwYoOCII7PaKO6viWL_SOAticACXtD3GtBOrfQkIFQeKxixZkLJcgKyohQs-1IbOZ60yvGHKwNMECH_ypZlRAutvtrzcE-f749aykGSf7XDRSLxsv_8pei4J1elAO_SbFYedGOyZrxr2mkbAp6HUOji0uGmB3aK_QBng6BS3VCUPEitkxwayZ5DOyJv2mgPvP2aCIwc243qdUdMU1FKvlQap3Bbb-dRdIylw8G2HMc42YZwioSGi7Qgz261qsR-rS-_664wy_LOjyWX6ljUhIKWuIkelI3PukF_HFZbyLUkKqB4EiLwfdu5r5Trf-WxHIh-7PYR8zaDxlABnFz1JAil_iF7xQNtKewmqKspX_vnvjPzccudtH4ON7DcCHclSsw84LfjhuxPPUmL4vUFpXhlZjRP6hSymQrGzoWDHZxSczRVFXtV8rgOszrS7MfLzdyvbR0ObmR_gumm8z6FsqlHyqh101gfpbABydqH1KvhqgtZipv3zGEJIePfUhwzd_L6scQsjOcIR0txuydpHApC7Woc2KHxNNp0gMerDlLP3DdkWzsBEVkSe50I6oF1vm6o3YYBiWBpsQepXEhfaWuF5hT9gmzdBYg=s450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colombraroprodlist);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(colombraroprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(colombraroprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        colobaneras = (ImageView)findViewById(R.id.colobaneras);
        Picasso.with(this).load(urlcolobaneras).into(colobaneras);

        btncolobaneras = (Button)findViewById(R.id.btncolobaneras);
        btncolobaneras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncolobaneras = new Intent(colombraroprodlist.this, colobaneras.class);
                startActivity(btncolobaneras);
            }
        });

        coloaccesorios = (ImageView)findViewById(R.id.coloaccesorios);
        Picasso.with(this).load(urlcoloaccesorios).into(coloaccesorios);

        btncoloaccesorios = (Button)findViewById(R.id.btncoloaccesorios);
        btncoloaccesorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncoloaccesorios = new Intent(colombraroprodlist.this, coloaccesorios.class);
                startActivity(btncoloaccesorios);
            }
        });

    }
}
