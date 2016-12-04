package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.Avent.aventprodlist;
import com.abigail05.BabyInnovation.babyinprodlist;
import com.abigail05.Chicco.chiccoprodlist;
import com.abigail05.Ergolastic.ergolasticprodlist;
import com.abigail05.NUK.nukprodlist;
import com.abigail05.NowyBaby.nowyprodlist;
import com.abigail05.Nuby.nubyprodlist;
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
    ImageView nuk;
    String urlnuk = "https://lh3.googleusercontent.com/nbnKiiXh2WghhoXBi-NZd-Idf-eACByvc0yP9uRq5aF3AcB_xR_T8C1OsiiN_5quer5mInLM8HFjc-N8ORrxgzXNh9CX3rOGEXqTE9PEZsniEYDI-vL8_7Y8rMxFI5A2sDnvt9NUF47k4P8eQAj6zkK9hvautHL_zSqj21BhHc6igo56ljnPqHTqnke4d74dwp6CwlMR53LXM5LVlT0y2iFum42cYH-ccX6tmpqmNi0CT3k1b07bihWVUpzk5etb_YYYejsz2vd0krP0AZMcUHmxJbgIC60fiCJ2pWL8jPzKX2ngw_dWLoApRrYQa3sWyYAaSo2abIyPXVgHWed9zd2StvxYABG21YE7LSCE1e01XcYZ_m4o5e99Hw8oMnwuSLRbVPzi_O9YRq8K6Z0Vkv3X7Q-pDAQbmZVL9ce8UiRl0YL8DLPEdBF5DgF18NVuKM7ZgAl74hMDb_DtmqA1asLPVTb9fwBB-r1bn5i1OSpuiE1RyEHkj_IV-XZ-Efdmu8pavA5OVnMJ9lpIzqwntJz_jbPZ5z8nXOP8haYKZ3-KrDhNoHsmpneqItA-Metqjq3yk3hoUkeC54JXlmoY5GmD-JzDZVs3g0aXQ14Kfmci3XbDAA=w162-h65-no";
    Button btnnuk;
    ImageView chicco;
    String urlchicco = "https://lh3.googleusercontent.com/QIBYdw9Mg0GH3CX7jEicc5sueJroH-MS5bpq1BpSn8kNbC6BlJ816Di2urfb5bBO0lrCc4oYWBxIar3M2C0h-AhHE7YoK7pBKs6wCVd0Vlj-LhUnRYBXt24tTiG3Yapqm3HYwrIAKpRH-V6Itg_g1EYIPCK07imXObb52zxnPtd8bh6tNIU2WIny7QfG8NI5hyIM2wu4uP65LoKNZzpnGK5URw866R5SggKQChsgtsUhvdyheuCFJRu68xQtMW_i2nobfhfcM3BYsnP1rNGcNYpF2OgZ463PcYgDLUV51o5e5JkDHrkXLIYZqcS7AXSm-I6aBWm0uyILkNia8eZYzZrE3_uvukFgbQ4yXt0dfCq4C2ej8D4v3obH7M72nYFapYgsMi2jJMoP09VP9NAi0k-AWdZv6yOl0tGd075oskqJ9NDY8tRDuvp-hH_EeHZVV7zmJOC3iC0JLZ8EY3jxxgpkRR-ePVfEPvzCi9Vyww90dZ8lYslThNBfGY3gSwq0v4iFlMOafIHq0umGzDZcN-I5tQ38jHpI_9s4G5piSwtAFFY8QVYq7H19TkvhEZNZA1tSY23xF-i1Ao1-4o0HCzXc3PLsZVygKcGJlOBYsY1uDgXPCw=w97-h56-no";
    Button btnchicco;
    ImageView nuby;
    String urlnuby = "https://lh3.googleusercontent.com/QOHiRFZLbTALtkd1JJwhBHi7fsam_2rTxyB4qZaSXyzBHb3binGC3e0yf1x5QSUhc84jgdp-ZlbNYZkvtlm4fuAzsjHYHVdk0CYaqV9HdY4KX4_EeJQOwB8UFPYTyffww7GdHObB3vn0TQKqUAdJ-aNsCI8CT5kMKygJR4CPm7KNF28dYJMrT8Wy_O_jMesVarwWIRecIuqhorZAm4FqfPUR1W8kNzBoaiRn_eiStcAwVa1tpg7W5z_g84oz4pm2DHaRMp4ZqXIY_NN6UXw6CGSAYPjxRJIzrq7GCpLJRNC0ewCtrbUlrF8Ba8ujssp8_HDWu5SF5t6YNhT50HCQM1uiH6W569oPsqDllhNItqO1YUfDmNkmDUAs0SiOlw7ZQS03AQf0FBA0rVAnIPzoNGJE_2yQHdjR4LXM14Rs6Y5x4B80MVI3r2CWiiNntZHVWSbA8v0q1xpCfYGZK65gXKtCOQ42uGHSbqxKjRyeJlFuCek1i5KQZV5nKSLQ_5GsYdA8-6YQ1E63-Z5gKG0pnbHnhjx6RcmKfAS4JceZyQYCilkax10YSQFQu1q49z-PJLdWvjPPjNlGL_-WCL5CMP8a81OuLI8i0Rg7BV1T5kD4QLV84w=w250-h95-no";
    Button btnnuby;
    ImageView ergolastic;
    String urlergolastic = "https://lh3.googleusercontent.com/6E_-FzgUCyuJfPknzJysMlyyrfwuK6f7x_3MBLX_2XjOodB2le_NGktz_pyh5xSoF3cv2hYtFRXZOahhgaCbBN6sI7V3XS2ZU5gvyfgb4Aq65ObVQA1woW-HMMNZz_RRmhaBbeKDs1thSmcji4vI1obxif00oW_bW6vD3fWqdVBnQ834DjHWvkCXs73Y9L5AIlVgiT_6csdcb6kff0fSOVZdW0I_pw9DuR20fG9XY_-nW5FgIXU1jm5_tyH6WE3XrIbzLMr8FgEzcN0MqTqyPsPZvQuohGLM6F29R5yQCyP0D1Lhn9N0yghQEb7Eaa2W-ALJo9KU7WBPcA9qJrSJdvDZQNgWRvgisHvXKISZXGenXAvRVSlABZKDxnxKHvxT4wan3Amcnm3rEEpGx6gYpNKd34Nr3D8Xm9gfc2snN1kY67qm9GVsddtZVeESqHnUMlvEHsAjXMFY0AeiTAlFUksb-19qQI5YK8G6FMV4rWvxWYDL6REwcLwUCWQO27_j31naA0zDiKr152pd_-wlyCV-Xk6R2KU-tVYx79gCurFi9XPtbghMouNeuJFPFIjLeYy_2wfT08p7C9zTZfVWwkePJK-zjSiVxCi37598K2wcgtazgw=w284-h124-no";
    Button btnergolastic;
    ImageView babyin;
    String urlbabyin = "https://lh3.googleusercontent.com/v5FvILTc7OzOXOzy8X8AXO6Of8rmufZqzIbMQ48ULRUA9F46Mxjob19Qc96JFK0YXcb3Cn7BqA-aCA74GySwBXr-yG6kIGRLm6iPE0z6qgk-HvJFUJyYjRUaH0lgIaE8Lhh1Y3_nuBOE9Q_jVzCk5XkgdB3n8Tg60lItth6FDvZKkchkuyvjyDgHA0A8b827AtHqUorI0w_ZsBV8OrsPgHAh2irwQmeiloI8nnZrD57kNBTpCGeUerzKJYklbrlCe1VS8p3o6cfE2GxTYv376_q7QLpG9ywS7ap1oWmSsUApOrRcL_fDnIGK6yROH-L4P-WfckEs-_hZiiT-TqC3JleiIktIivxzQ4hmT56EOyTJ60DIXclz_Ho3_VdYU78jiSJ09ELGH2AFeYOMQ4sh1Bg2HCgKcehZPBwmWheYSKoVgz0b24_Y2CARAgX-t34a9zwuHkH5W7FI5P83YmulfCzRrd_EaWP6Y_07NyDem6vrkcfUyPb-tIlYcDs-T-DGcTlf-R0R7kQkkxMyFuwfg4DlN-q5PDwPClGojZm7Ml3B7EmhIUpn2mZHrK2YFhJc_g75FKReZ-NvqjqexlhAHLG5zVwyR1lYyxcpJnKCdHXGhkE_HQ=w201-h82-no";
    Button btnbabyin;
    ImageView nowy;
    String urlnowy = "https://lh3.googleusercontent.com/H5UbXXqR7MbtP7Iga5EDFVW7SSxSpoKc6oJFiX9oSVg5dC4FA3QlJzr2qqWKLDZB0zWMr0Hhwx7PZw5Y9ClqMAeXNCF_SpDDwLC3ttswIuqImhaZFwlDIjqvf3a7gbnpetiUbDUon9RExTO1xGasEbfozKnf-9oDB185O96vsg1RuBrVJGmcxmATpAi5E75n8j7V0aeZlP7BoH2v_Cc90mpTPlRYxspzncpSDnlM855AEOqr1sNBo-fjgMxsmds7pDugtkiGC1qeRcoVLlq7mSPMEW_zIock2p5pUfHaoDEPsczWOEyvPF0QfB0EkW_Jkl4jwX4cdhUchmO3D5QVovJf0wlx3fDvUr3W2SKzQPvDdWl-0d8t8MnaBWPc5NyhywvFHjaW36y7BL5UTn5HhtMLXZD2Cx1Uy-rAnKjLwSe3NBLRXXlxdXbpMK7LhUIGj3ZutaesEy0ppaiW2UR1mf5XEVc_EiJx-afVmtE_uUYCu_X70B5UwKCgwlR7-SMhPyP64NaWHZ1df11u5CYPl9IvvddkjAeaPjmXcfOQmVmGi7sZogHNXAoGTFAaH4hiK0lNQG34LfD1e_cyyvsiCWWks1-dYCtWmCxqd7HMWfWyuZgMzA=w167-h41-no";
    Button btnnowy;

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

        nuk = (ImageView)findViewById(R.id.nuk);
        Picasso.with(this).load(urlnuk).into(nuk);

        btnnuk = (Button)findViewById(R.id.btnnuk);
        btnnuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnuk = new Intent(marcas.this,nukprodlist.class);
                startActivity(btnnuk);
            }
        });

        chicco = (ImageView)findViewById(R.id.chicco);
        Picasso.with(this).load(urlchicco).into(chicco);

        btnchicco = (Button)findViewById(R.id.btnchicco);
        btnchicco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchicco = new Intent(marcas.this,chiccoprodlist.class);
                startActivity(btnchicco);
            }
        });

        nuby = (ImageView)findViewById(R.id.nuby);
        Picasso.with(this).load(urlnuby).into(nuby);

        btnnuby = (Button)findViewById(R.id.btnnuby);
        btnnuby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnuby = new Intent(marcas.this,nubyprodlist.class);
                startActivity(btnnuby);
            }
        });

        ergolastic = (ImageView)findViewById(R.id.ergolastic);
        Picasso.with(this).load(urlergolastic).into(ergolastic);

        btnergolastic = (Button)findViewById(R.id.btnergolastic);
        btnergolastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnergolastic = new Intent(marcas.this,ergolasticprodlist.class);
                startActivity(btnergolastic);
            }
        });

        babyin = (ImageView)findViewById(R.id.babyin);
        Picasso.with(this).load(urlbabyin).into(babyin);

        btnbabyin = (Button)findViewById(R.id.btnbabyin);
        btnbabyin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyin = new Intent(marcas.this,babyinprodlist.class);
                startActivity(btnbabyin);
            }
        });

        nowy = (ImageView)findViewById(R.id.nowy);
        Picasso.with(this).load(urlnowy).into(nowy);

        btnnowy = (Button)findViewById(R.id.btnnowy);
        btnnowy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowy = new Intent(marcas.this,nowyprodlist.class);
                startActivity(btnnowy);
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
