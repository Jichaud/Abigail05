package com.abigail05.Chicco;

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

public class chiccoultra2 extends AppCompatActivity {

    Button home;
    Button btnconsulta;
    Button marca;
    Button btncomprachiccoultra2;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtchiccoultra2desc;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=985d6f4af3f8f49a10beb4d8aeecaae5";
    ImageView chiccoultra2;
    String urlchiccoultra2 = "https://lh3.googleusercontent.com/orQ3WoU8N4EWplAhpCwhMbhERe05DVaxvzoavvp2eTXh_r21CHyT5oJhuiTFX7FSnQ3H_hWIG-ZD6ZU3dkxbjzdrYaYGuBetqjpTAh-0ly0ByHG7EolpQMbKhFK7n5pAlEJcQ5AkmnqktvtLPs0glshO-qBrMFf-rzRMEPz3OQDPl_39iX1TtfANQbYUmU6crW0fBEyseWDS8OzPOUYr4ytxbag3WIMggJOyaZIqKCwOMMapcXrtchnG6nGjzqU1rB2zOaZMenni_ynHTkqpHfQDaJMNGnQuM3idNcONrHW80Rp8MA8AzljQ-EYhHa7vm-i4WGLv37eF3ZFxMM_paLuJN3l_mKt0DcZr42d7gtys4W6FAZ_lbr_qnCqhnWHYEQevUcBIH2sGpt6wF1ugzQ4zlkphTRxu_ivR88Y3Hx7klr4bP-_z9QZaQWGhDwJLZnejKAbotjq54MnLIzF3fawL7Q9ZCMJir2sPpmQmeIFtaqraliwiPxQK0tmgq3HYNpDTwS5J-ViDcCKv37Cja3SNVd-8eNEXnd6StO6kiCzGO4OKKsmfR27wBon1vb-JkyPccIvuPhtANh3aQIb1a1fTLyJhsaH2FLc13LBpNSbBGj1s7kgj27TJn18ULJXCoS6ry4Aq_cX-eQS_sFH_4ksjvuc8OCUvZXiO3xNoO2I=s725-no";
    ImageView chiccoultra3;
    String urlchiccoultra3 = "https://lh3.googleusercontent.com/3bICK-mAPPbZanuRabUbQkH2X82avPByXyDFpljEP4DAsi2QDWZgGIz06mJDkY-biGUrBIq1Aj1S62DQyGAeRGcrHAYC78THKZRAJNGkml7bpIAPSg91qNnWC0M2EVMu5bVrVOGkHuWM_-9pZt592CyTcODGNwLMER4KmpRNQGOpxFt3NSw1t1yja9MISzRWOCJD3guhihIM2F-hAt9_VvCrQH930KiS-4kQkGyoD8dJ6Wt6AP7kgV69G6ULJTwj10sIdFzv0ofjjxVTC54a-RcVx2-tpt078c-Wt5BZ1w46Efy-tR4jtqouN4aXUan2CjThyiBRySqiDJWNsx0KJbBh3fGVicMdf2IHklFrGuy36cD7nl7a-FfFYxjjEew5TEKtDwI9OpSGNNPFrrJXkg2ZCoDaCY8cbXK4ynI8pcOGrC2uW7jDQau_Agx62kvyuBcxXxXucDzNZBbgG4ggNs-YsaSLuGdh7H6b3EygElQ-UmFtlBBS1o3uoF3WY-yq76AM-au2tyNSHfxq9GcTZ2FSRyLWobD_aOG9h0WeyKFo8IYFKSq175L6-wPCp_2JgPsz4tRllVft8Yyw05JU8NY74Ytc2MaxSEaam9_18zp1P_3OeQ0darMDLOPrzyrXuWIAlGjetRrDHStnHBcLsAo7LhcwLs2cCLYAUbXvy8g=s725-no";
    ImageView chiccoultra4;
    String urlchiccoultra4 = "https://lh3.googleusercontent.com/53cZcH2B1x1B-KgwWluJfleGryzND2KtyN_6hfB3AWkfoeRBL4Q-mWjt1GFM03tV01QLZO-GpODc5B4Y-qfgKnSAhATNwdukotaMdLWwcGVynKZp7NCMYTSEg-yB5CtJwD28ZThlFamKwKkId57SqjmBDmTvgoN3gcNr6Yhe9O2SblKbTs6N6VMXpNmI_GRpfYrr2bvofriBihdBPxoEdQ0fWGrQOITBIH7H5IW0tDWlyom3cXKb1Wcxz6uMztEYiYnd8VH_kl1zMZQMBkcAjGNg0Bz3RSPbVs-zZdnBWclDB2vmV9fefeZbbgLOPFX2_WxShzqCq9MhxjR8kMdWDg1S-KjhZ4QC_O6fKiXOmiKIVpn3-vGfuQk2lIMNIIUth0eUQ_5dmQbqBVLx9cgmTeQL2a6FJxpjPyxn2tXnh2bnVE-poUcyK5cHWnwEjHO8qrf6A3vU_5YxojBsfRw0H5c8iyrK6CJN4ZZ2hDri64osUBEqIKOlYeQawZtQ1m5NtVSGqXKkFbZp6Nw8IT8Dt5eNjw_TjNNaT3ueiDeMMM2gkjqIshOeWS8K80pc9TRTCKZd0D5g9cugYzE0bXz6Tk6UzHs685SvbrSrcqESBOoHZFeOzCy45Y_0bOzKcC3asddCaXg7Zhw4aA2nTXIfDpy2lB6UDQQvAcicY1brwSk=s725-no";
    ImageView chiccoultra5;
    String urlchiccoultra5 = "https://lh3.googleusercontent.com/uKml7y5IVRffvTuNUE5tQnnfytS29KKTJkLzSw3G5EIC_MuGBMV0C8_tN0KjG4RyT0Exr1e40XNdspjOV5RtAkE8YLbQ3CO8_83-WNWIbCjbOUgMcNP_FnSF07lXd7HswWSpLB4rTj3ZTpbuC_6lzeBMvsmXWzM4DjPxWvIV-VLc0RfP0ibqLMRyItlkoYLSY73WI6hUgNNXWLiBBQvpHpoKs-kl0QSYPVZX0AKQaW1_y9M9WWk1n0jl4BiRkqnWO1VxzyYNZq1tPqxKS8nqT-FGQtKv6u_PR6TgN1lqC1kkjH6mJcPQ66XeOEhy17z1tP7xtNiHjQisBI5Jopy2NHsFoQOiweu_DAyRKSilj_EfTextDI4YC5RHSSGAgrLcG9zU3McIYcH3UZwJ1yVHkXJ_ZZDMk6obk-waYDVa3sb4cCorOJA5HEecWuMF4OO0_vTA8GvuI5F2cmuN9JI-nbEKjOhNIqPydG1fppu1J8guQqPqN52ATGKQz1YG3Y9Pztp5LXXFC_cW4MB9chi0ekNdkHYF08DKJKWfj0VyxEiyGi_TyMVyT7S4wQpbubR3vgF3SZ--nTfRjwuvjv3j7nmMc_k0lufRnTPIS8tK_74fhUq5_U6l4eLuYLiK34aLDMzTFXzVoVms8R1qNq7twAT6ff8ns7GAwywAU_GmmVU=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoultra2);

        chiccoultra2 = (ImageView)findViewById(R.id.chiccoultra2);
        Picasso.with(this).load(urlchiccoultra2).into(chiccoultra2);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra2.setVisibility(View.VISIBLE);
                chiccoultra3.setVisibility(View.GONE);
                chiccoultra4.setVisibility(View.GONE);
                chiccoultra5.setVisibility(View.GONE);
            }
        });

        chiccoultra3 = (ImageView)findViewById(R.id.chiccoultra3);
        Picasso.with(this).load(urlchiccoultra3).into(chiccoultra3);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra2.setVisibility(View.INVISIBLE);
                chiccoultra3.setVisibility(View.VISIBLE);
                chiccoultra4.setVisibility(View.GONE);
                chiccoultra5.setVisibility(View.GONE);
            }
        });

        chiccoultra4 = (ImageView)findViewById(R.id.chiccoultra4);
        Picasso.with(this).load(urlchiccoultra4).into(chiccoultra4);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra2.setVisibility(View.INVISIBLE);
                chiccoultra3.setVisibility(View.GONE);
                chiccoultra4.setVisibility(View.VISIBLE);
                chiccoultra5.setVisibility(View.GONE);
            }
        });

        chiccoultra5 = (ImageView)findViewById(R.id.chiccoultra5);
        Picasso.with(this).load(urlchiccoultra5).into(chiccoultra5);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra2.setVisibility(View.INVISIBLE);
                chiccoultra3.setVisibility(View.GONE);
                chiccoultra4.setVisibility(View.GONE);
                chiccoultra5.setVisibility(View.VISIBLE);
            }
        });


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoultra2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoultra2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccoultra2desc = (TextView)findViewById(R.id.txtchiccoultra2desc);
        final String stconsulta = txtchiccoultra2desc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoultra2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccoultra2 = (Button)findViewById(R.id.btncomprachiccoultra2);
        btncomprachiccoultra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccoultra2 = new Intent(chiccoultra2.this,webview.class);
                btncomprachiccoultra2.putExtra("string", urlcombo);
                startActivity(btncomprachiccoultra2);
            }
        });

    }
}
