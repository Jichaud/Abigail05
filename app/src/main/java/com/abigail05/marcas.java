package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.Avent.aventprodlist;
import com.abigail05.mibes.mibesprodlist;
import com.abigail05.pilim.pilimprodlist;
import com.squareup.picasso.Picasso;

public class marcas extends AppCompatActivity {

    Button home;
    ImageView pilim;
    String url="https://lh3.googleusercontent.com/OghH4Ygumk2ZNblQu5izXAY4KhqnZs3hUp1pC-cAIQNCS1hxM3liMMW-kfwRUDWT3E2GOjgzmGETd3Gc2TLk2HK7Hqe1gYU4njwHebwcoW-D0MHN2ZBsmQbW-2roMs9IU2-fH0v7oon8ytB6IeZYqTXFLhbpLjHfkDlXMCSfTD5C0fuxzdnr1fFk_jXW3F3WK3FdNC1U0XMGz9yglXX5h1Od8ZNBQ407BB6RaUjUcMKBEfVMiz7nKW8oZVRaKBb-BsfCvffY381WBScpm4fwSQTEu7HAlnne-hZhWsoQ_GavtxqSZ5iZ6GA_vesujk3iZhha5S2D37aFP04NaTZYPZ4W-2QqruPxxGfqT9j7uaYkgmsJkzjeoCJfiFAYPZItKoTCQbfqCE6TRy2XUTFuMjxYjtJeIbyevaq467LNizvwl4SQdfMNmUYYzXu1p9_bxW_rSwy-Y3UgREMFLNu8CrO9vTnpuS71hFyFVRA5K2O4-1Os6eVAJv4tq9b7pbMAqXLgwa558Sxji_WsKc5wrX9TbJrHhoCv5OUUoWrjqXCG_H6xE4tKL0cfn_c7KBJ1XU7-JmKelcuJHZo4rtM4rPkphQBshikd0MtpdaZM7qjfpe0ptQ=w260-h214-no";
    Button btnpilim;
    ImageView mibes;
    String urlmibes = "https://lh3.googleusercontent.com/EAOTJqJ5_wPIgUG4aI3A4qjrWZCk7m5LSTAZPI4-TLjPGMjS8Mmv1wQPM-vGqNAGMQJdGxidkisRGofMxC7_gbAKuA-jQfbzLN4X3mPHE2LzCIxZogQwfF7pZj3Hpog1fYd35Pe7RpAYsFf9YaVx5BnNP9czShHwn-YWE_CSjwimnwh-eDfS2uRM72Wy3_cX7G5FGLJpbhhZ4JmZtMaC5b67lYPVOaSUE1JPdSSyUs3Np2wt5VbePPjYKq1qAi96wP140jATvwckKXK0KGojGJxer629J92yvRZXeRobk3YfuoVo2I0Z3j9ybqCaP6WZUw6uSg4pnjf8HKrH0YAJ4smXm8VWnq-ImfL4_Bwv0SsopzFrX9VGK15O6-_jwZae5DiS5GrUlTbGJAyab3xvbEVejM-9SRIvSrp6qx5TEVuUnCmKHnxUcl6fU1By41KaaFGZFgoxhL2XwvcUsovr6qSVZb0eDvUc2r4_t01k6Fo1kb6wWl9HmOcP4b9CZsL5W-Pn1d_POVBV6e62blxYoOEc8MkJYGxX0fV6OL816gFRq3n9hFpZMFPZGDjzuwAWDsUF7FdEgBFy9UDJnERIMzH-nVn5Li7LFcBp5cNzPuzn364SiQ=w166-h92-no";
    Button btnmibes;
    ImageView avent;
    String urlavent = "https://lh3.googleusercontent.com/btFr5nISg2mbHvi_ZjI1aFsKg9NyeLQLCwbGCcaXyWA1dTsBv9CQT9NjLrbibBxE69_9Dv8HfWaYaIaRmgMEXPQCu-Q6RBUKmGVXKP02fr-KUWDDdO_YV1G2N4QbJcteaqn1V24jZW00mbXDnKvxRWse_N-p9mqRSyXffOPv9850UvciaEKuShtoAaiAr8DGO_uvTFq-v91g4AgQ6T8UjvKS4dmwEVAr1zwWI3Ti7cgxwUvTM8_cTkk5XRcp9wmtrAj4Dv-_-voq8tEUI4Kv25GtaR0efVumc93xISfRcgeSROQ5ST7cKVlSK-xCOOEQ_o9p303LfLttFbsHuWw3XlvazdRCvSLrvg5__-J-U2JARy6lvob2OunHpogOmlbrG1jLjhYJ-bZA3YOJAIwILqpDm777HBfLvWvQ9aSZXv_gUktsqJtH6jIq1c-clfi97jTz0xUug4G_w8sArEFTicm5zmyZpKi_6wg05IHM5CZiSfjMvZ55rl5Sn1VYhpDqVQAcqYH02j-8Vrlgyft6JhueWki_Vw2oVSFl2mTfoNFDEGI--4ttvpdLmKRdW8mivu4tV2S1QhP23j0axWqJ94PuR5Eg7T56h4B1wkIEH_dFfuGuFQ=w151-h70-no";
    Button btnavent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas);

        pilim = (ImageView) findViewById(R.id.pilim);
        Picasso.with(this).load(url).into(pilim);

        btnpilim = (Button)findViewById(R.id.btnpilim);
        btnpilim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnpilim = new Intent(marcas.this,pilimprodlist.class);
                startActivity(btnpilim);
            }
        });

        mibes = (ImageView)findViewById(R.id.mibes);
        Picasso.with(this).load(urlmibes).into(mibes);

        btnmibes = (Button)findViewById(R.id.btnmibes);
        btnmibes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibes = new Intent(marcas.this,mibesprodlist.class);
                startActivity(btnmibes);
            }
        });

        avent = (ImageView)findViewById(R.id.avent);
        Picasso.with(this).load(urlavent).into(avent);

        btnavent = (Button)findViewById(R.id.btnavent);
        btnavent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnavent = new Intent(marcas.this,aventprodlist.class);
                startActivity(btnavent);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(marcas.this,MainActivity.class);
                startActivity(home);
            }
        });
    }
}
