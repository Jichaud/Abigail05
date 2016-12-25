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

public class chiccoultra1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button comprarchiccoultra1;
    String urlchiccoultra = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b3dd1cba02a91c7df8020c934fc6969f";
    ImageView chiccoultra1imgrojo;
    ImageView chiccoultra1imgnaranja;
    ImageView chiccoultra1imglila;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView chiccoultra1txtdesc;
    String urlchiccoultra1imgrojo = "https://lh3.googleusercontent.com/1JPNzcdcWhNlRquVDIkIDTQrpFjO2y9SCfuuhF33UeBwVnPm-m9E3opwwMw_OToWHIyvtELD5K2Xphdx1_nJg0W_mkxsg361Yqb_p7977SLW3TXG_vRhZpSoCp1tEDQfVdDKYF1gVlLRAq_Ncv5eHI2xL5g8RMnuycXi42voFR-cKaNnu1rKm7DitMuV638bpWcarICmHKcDLPO3dMWJTVC4sidj8JijCvlxJtx3MuwBUvqy6F4RwqtIXYl7s_utIdCfNj1gkLiidMjiTrB9i9VqRdCukfllWJo-5I8xtxe4OwhId3D4boc2_QdXUGSTePyZEW3dP5NmQd6jWE4BbZNBMElUytqWMjRlvO1zhRW-TLUxYrjcp77AKl2osZI7ULBQiWWfuDfWD4EjOiB2WuGKhqOnjEAuv9_hYyrkWJRf6gHopIr9JQBpzc8qKlOubV3XF_CutPjo2rI3X51RUeIAi-fFVwMiNGqLol6PvWI51hXM6bDvDSfNqjxB7ACwqd7SFNP4fDb0D4bZl1kyLaOX4u__ZM6OoCfp-xBwftj-HY_BJXJ4ewfbExzhFxFQut2hyb_FsUmhqx7Nnuv_fXM0YIQtcrWkuIaJURQeIkcF6dtqLc1CtogCSplGQO5AmtSo-3cgHLhZ2iXVoeNFEsWDecJ3p3mk_myXs_-JNVg=s725-no";
    String urlchiccoultra1imgnaranja = "https://lh3.googleusercontent.com/iTTxg2vOjZ4FwipC3kbPlz1ulibGQkDjUT626plPvLb-6lWRLsparSvcMe1DS8NiaVlQO55hQfhCmbGCld7gxvXcyMXsU683tyiTfjvIHWhSBH79JYLmXFYXDWQgVskJt42z-BLxQaxKkdsQwWeO6bVFIbnCnYi9v_9LU7CpuZ9CYYQByy1EfF-Ul5bIEbHWRMrmBo0rJsgVALyClydx_9yNhXxCIdMxnMj_eavBG9-pg4zgtFBirdhA2vAerAjuQtT_2Gf48B-7ZjmDYBQj12VjtrlvYMBFjZXfpNjlhYAK13BIaL3klj0DdMZU7TdpTDTn_9jKiwZDZmp1Oexn-3KXJ1swSsShUMPC_S_-1zNoJO6z6srY_wmhoGaAqRHXvrbzKganQiATaaXo8MoaGk4chWZRG0uxPRTRNmsimumilXcVkmGEWTCkUVPN3ThxR92-UmzzQcrVceGCJRTXzTtLtWVe2hK9g4GkUnEwA_OUu0jZ6r6fR54upES5_E6p-Btorr5a0fqZfy0hiNhC_g4OfKP1Eczi7YMRfAWF4J8KxDwy7MILG7gX7D6joyHrMLdXXLWW4RhurYpQ1oUnELevrQd7nbl_01lyQ0Gfs6K_-rmADZqqOFr_xU5FGExgGd74G-Z3CNX3wxLsQFwAwEKd6JltBZ14zzKHAtVplBw=s725-no";
    String urlchiccoultra2imglila = "https://lh3.googleusercontent.com/KvDJL1AQ7vnjDswVO_BVnvRwaEMK039J6HyzcLqhsdBoaw1QsQLgaI8MQblJYOCkvCtwAO2Sob4JNANJT-GcuAx_LrGvjUBdl6igMSQCMKH8j-Bo_UxAl9ifU5PqBYsgq1PPz_D_CI_AHKu_APKE-MJnK1DEu9yJ2OZWUKLlBFCdOu3FmdKnYtUMDI8Jw8XLM_ydHZYnEAJihJ8vULn_nrM-E7fO1kcWs7UhvlG4is5kyNRJ21wddnZMHIFMF-DfoPQ44rsxFIBTNn6-py2diFiqh3k-uaES6Z1PqhjviK_uzpV7F-QDT7idw0IecXNYCGYYdA_HcQ0QNxKqpZI44z13ccOQgUmQYOraLu7heOHgBfpNssyiDP0KqdMybSdI-y47rZo56AKkjeC_N6ryzLc19UGVOh7CZM_WIVMUdPX7d50afsnru_IViKpW4ZY52hXYIgB8B_3ulm7kGafsvB7UbmdRCZ7VrqtHD0vy3oGYsD76C_ixgAbkuKt0cokN1pFIydXsJYrR3vKr85XnQXfGgrnn31mkuIjw27DhjuSHopT7YqzwotbV2vbnytsoTjAvTmlnOMkiMaotTitQBQVxEOCZYjoBGPPIdCs5gEMcA5V5QLZfLjhYDvL6hcWEhu8Lsg5pps-8ktKOQinh5OoY3RaCZ9TweQakOGUfD3M=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoultra1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoultra1.this,marcas.class);
                startActivity(marca);
            }
        });

        chiccoultra1txtdesc = (TextView)findViewById(R.id.chiccoultra1txtdesc);
        final String stconsulta = chiccoultra1txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoultra1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoultra1.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarchiccoultra1 = (Button)findViewById(R.id.btncomprachiccoultra1);
        comprarchiccoultra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccoultra1 = new Intent(chiccoultra1.this, webview.class);
                comprarchiccoultra1.putExtra("string", urlchiccoultra);
                startActivity(comprarchiccoultra1);
            }
        });

        chiccoultra1imgrojo = (ImageView)findViewById(R.id.chiccoultra1imgrojo);
        Picasso.with(this).load(urlchiccoultra1imgrojo).into(chiccoultra1imgrojo);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra1imgrojo.setVisibility(View.VISIBLE);
                chiccoultra1imgnaranja.setVisibility(View.GONE);
                chiccoultra1imglila.setVisibility(View.INVISIBLE);
            }
        });

        chiccoultra1imgnaranja = (ImageView)findViewById(R.id.chiccoultra1imgnaranja);
        Picasso.with(this).load(urlchiccoultra1imgnaranja).into(chiccoultra1imgnaranja);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra1imgnaranja.setVisibility(View.VISIBLE);
                chiccoultra1imgrojo.setVisibility(View.INVISIBLE);
                chiccoultra1imglila.setVisibility(View.INVISIBLE);
            }
        });

        chiccoultra1imglila = (ImageView)findViewById(R.id.chiccoultra1imglila);
        Picasso.with(this).load(urlchiccoultra2imglila).into(chiccoultra1imglila);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra1imglila.setVisibility(View.VISIBLE);
                chiccoultra1imgnaranja.setVisibility(View.INVISIBLE);
                chiccoultra1imgrojo.setVisibility(View.INVISIBLE);
            }
        });

    }
}
