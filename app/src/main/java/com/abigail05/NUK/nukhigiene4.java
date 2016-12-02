package com.abigail05.NUK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nukhigiene4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukhigiene4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4b67b2551fb8e04722def139209c014c";
    ImageView nukhigiene4;
    ImageView nukhigiene41;
    ImageView nukhigiene42;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtnukhigiene4;
    String urlnukhigiene4 = "https://lh3.googleusercontent.com/9feBtcvPrrNxPxPZdptH5IiM_L_P1sBdExaWkAT-tDEK1X_SSH0s4CYz9ypUj5vX7sM6f3j_lemkzfLAgSWNSTMd0akdHCwgMSPm4hHspVxAu7_WXMApOzg93G5K0bq_hbLD-iTtto6uxc3nwgAzqFFvPiUeITeDAJaKP3tKuYWIYPAcbwJunBfQT6wizZD5RzPPFfTyW9ecO7Qh0nen1FOIrya1z43RUfmyliLa_mAVzaygZHSzxOtkzCYY1d5UER6dcAdyVLv8gnHbwoIJYpeooeYQ1b_R-GGzP9ua489TjO9yTjaF2p3V0udGTxf8usjzm9AmRdV5-dtp37sKcafctNCo6Dwtks_bsWuEvaTPUrM6iBHdJEqcMqWgNwQzCY2XjWIgRif_oALTxTOT05HxZQ08wcc1tHx7PgHWpZyzdyNmXieT-pS0lv-Udi0NOAgTcCqfLRMszniGs6lQEJRRgIHIEjrvjoRpvMCcDbENg5ipWEdaAD2OpnqgUqZl1NGdjmHqrStoQzl2FGyePpoo8fGUw5rZQroq09dSOQl3G1Zld0VkWCAAAnfZGwG2enk-7wtwiR2MFq837nvKHrocBM5AL2Oq1ryF5FX8s_NVnNkrkw=w173-h350-no";
    String urlnukhigiene41 = "https://lh3.googleusercontent.com/KoyAxXJvhCgXqgoKYrdPizyTmDCM993pK0qsruVxg0zpk8sIyjQVh5sMiKXUNABWyVz1iXYyq_xE3rl8-KpXt-p6gHK8nngEp4TjIV1mqX14yKkvM6cVzNytkO0jdZiOX1fqLqJkabQT7u6sbNwVYRs10VvzUY9EYZORxEVYQ_HexryRFXCJYI5sbTlMpZlDFpB8pNubsTMNWdl3hKchfRRSh48eSec11QK8nl2iEC4mfWt8lHO2XA0BHYUrF9FeRs4xIFTInGnxYzI3eSHzoHcYQ0T34xqdcx8iIaVrsjPsoyc3SMHILv4VLKexpy80nZgwrzECJFBOy9UxdXvKfXwUELT6RTIKRSJLafOctfx8QmYeQLezljaFp6FKImPtIYUwrudyorYt8myxzIyoGk7lWwdAKGeIRjaPtB-EPEcBWMHDMgY1nXUkGumH05Zs_VeGHWh7FHHEgdC5p1pPDuZv1wCs2cEH-SHTrPdQ650ZyefKZk-3H2IJynMxnw9NKZ1UyeAHHBaW_iBmNxzMqqEmTvwlWcp2QEiVXHJYPHy7faP1bhHazkgRqCMjxsVf90KuzKumRMP_gEub97OOS4UYGlHpljkvkZvRBREcYRaqtsx5Fg=w173-h350-no";
    String urlnukhigiene42 = "https://lh3.googleusercontent.com/4MNzgUJ7JELe8WwYkj9liuWNFVWGXPNlEzcYphhl6SK7Oj3Gxfa2cOg9g9apP4So04ZrYsjlDWdpzJEbyH03TFJAv0Cg7yEzY8fLt0r2aDdhza-D4lupKL34g-LQUQA3Ow_kt994DGtUGebgIv-5ursbN2GblxGEf30NqcCWOKXCzEFfhhsUotU9eQ5aMeM6UUAFnJMcPxz2fgHEMA3hb75_te4RHtUqJMJYsudVpbv8T9yXWtw1EpbH_lzR0QxExXVCicXABkuS8H9n0Sxzsr6PQJ90WaYu0jELt-4gRXdXj4ZlrVaGYrFmWgdongKMaEcPyLHaL7pwy7HxrsCwX_TkDTYJ44OvqRUAkD6e9Bq4CA-WldQGeG6yGrsin0U9m_YzAjARxh4G779F7d76ba5RuX22iC_M5c_kOr2s8eGRbkWaRPRISYyLpGRamX3LVxpuHIXk3_O7oQbUiymAFH6DjP2t0zVJIZDGgCbKG2irn5iPIZdGWuxHNIKfHii0ZYbKUQERkpdfyq7tkx0p4eyFNKy4KFU6_dYuhaIXsRh6N7YWVV0OTvKDDtVJGAaL__mNWlHxdplvL0cAnUepkY4bdA-6ofDTZ9nnu7On8w9fUSKXpg=w173-h350-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukhigiene4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukhigiene4.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukhigiene4 = (TextView)findViewById(R.id.txtnukhigiene4);
        final String stconsulta = txtnukhigiene4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukhigiene4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukhigiene4.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukhigiene4 = (Button)findViewById(R.id.btncompranukhigiene4);
        btncompranukhigiene4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukhigiene4 = new Intent(nukhigiene4.this, webview.class);
                btncompranukhigiene4.putExtra("string", urlcombo);
                startActivity(btncompranukhigiene4);
            }
        });

        nukhigiene4 = (ImageView)findViewById(R.id.nukhigiene4);
        Picasso.with(this).load(urlnukhigiene4).into(nukhigiene4);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene4.setVisibility(View.VISIBLE);
                nukhigiene41.setVisibility(View.GONE);
                nukhigiene42.setVisibility(View.GONE);
            }
        });

        nukhigiene41 = (ImageView)findViewById(R.id.nukhigiene41);
        Picasso.with(this).load(urlnukhigiene41).into(nukhigiene41);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene41.setVisibility(View.VISIBLE);
                nukhigiene4.setVisibility(View.INVISIBLE);
                nukhigiene42.setVisibility(View.GONE);
            }
        });

        nukhigiene42 = (ImageView)findViewById(R.id.nukhigiene42);
        Picasso.with(this).load(urlnukhigiene42).into(nukhigiene42);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene42.setVisibility(View.VISIBLE);
                nukhigiene4.setVisibility(View.INVISIBLE);
                nukhigiene41.setVisibility(View.GONE);
            }
        });

    }
}
