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

public class chiccoduotrio1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button comprarchiccoduotrio1;
    String urlchiccoduotrio = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=27d8e203c90fcd24ffdf3cb4852b5cde";
    ImageView chiccoduotrio1imgrojo;
    ImageView chiccoduotrio1imgnaranja;
    ImageView chiccoduotrio1imglila;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView chiccoduotrio1txtdesc;
    String urlchiccoduotrio1imgrojo = "https://lh3.googleusercontent.com/5TH1LyOdBkBVjlHhpCAggeT-mCeZw4j2MDbB0sYhwC5K1n-FSjdoG5S4bRPA61pT583WfaKZoqIW7vVWaFILYY16vpj9Wyv4oNGKPFC1Mdg0tdDtjYtkHlDibBE-myUsTrbHI8uT6N77i7KLyJziOuICjXhPP65LkqMptB8sq2FHBvGjwwFW8FbV25az1et7zcUADnxUAk82u0Hmov_XkWFTsNtnHf68AVPrfGaICJrueaCI-sVLka1yNmTnWzb1X_XHABPcEnrbH1gMka67ZilpI2Gau3LxC1PB_3FMtNnSqKqeWmPDvk6lsyWfxC-tbEfJ_zyTeXG8bfx8yJbcV-KqsuCMoram5fN_Gyv4RSkRQFrqOPixZ7olw-dZej79W1Tc-gZ4jPhvvr4V_CZZ0O10JXKiA5LTBzUNK7Ou-HVQq_kuEs2653xIlhp4qF7ErqTubHjh_WuotFFrGPZnioea_VhcJYDEV6RLGjW6El57Q49SHtJhAwNNwkCrHucFQ2ndObTT6T5DXRNXoOniT4337MDNUAhgAsqrOiwwYFTFiP7vpSyBAUGeCU5U1a77ORx5tYq-sJfHuUSiAq9Eajt60JG2dJEHjyeZoxP3jj6Y82gUdO2i7qj74tpQ15qF-jVPlt8nZoM9QkCzj6sRMN6ot6auBjobwLrZx3SuFC0=s725-no";
    String urlchiccoduotrio1imgnaranja = "https://lh3.googleusercontent.com/1ZgZXZRJWC6hNSwHYkUqp_lmKjqVg61C0mfFYxxvqe0j5NBPkPQLeM7faYhMGPCq9e0wTJBh9hDEGm9OItQNsrnypND4l-ZCZNowGSXtubCOzNDMxlCCo2Y59gAXBmGEQNsEPWurrau4s9axH4NpkNvEugeBawS-2R9lmFyJZ9Vi-9DWC-KP2UcaW_LcdM1IVLkpAYoDSITGtnpsxjm--KiyYCmDLHTBc42mrIfrd8kocH99jp_qZagJIVCwtat-OYAiLE14po4kW7ypZkYWnqydOeiU7fGrl-Rz5P6-o6s6lCDrSrz0mGQuYIAt0SN9AkMyZ5NK9GZgr-DdRDvyg-I0DeoONl1goYmiAcqJEisllmJcLjEk9k2o1cyMvR-nIpzQjsSTX1HxzFx6pZXPsRNhT_Pt-dEo-v_9tS-3rHI30DzOL8K1JObdb6bRtJj_WHBsgZUYZlktvKTZwXkQYpzFSy0jC4g33ywqLoqtmEqzR1XeVEA5KATnCs6YG8g9zo0cMv1AxldoQUs7CiK3B8GzpGd26XS1zEiFCH-J-PV-HD7ZrDYxqJQIxfMS9v8zM6H1U3DdhChLzZa6Mbdnjyk_HzyVLO-XyTNt3yuWZdCWNOPGTw1u3OOAOMwNI7Etovrx92CZjkDFhxVkaRvK921qk7EihFIVC5fD5-QHemc=s725-no";
    String urlchiccoduotrio2imglila = "https://lh3.googleusercontent.com/ILqpGuULutvZ0Xj8vs5kY_TqY4YMf47PukKwSkdWqUcycUCBVQHOxCRgQY4kUK0sJehOPEIkAO3Q0voaytRgY09fkLhxFB5F5pBW8tQvit_sYRPJ3aWID0g4jIii7Agj7lHJbJUTce5cMRWcgwk853Avi7yqB55OZa7yedwEqnCupeQPOFoaIVXQURvaosWmH0ZGeF-Bq87DHlzP7rLCm_EXj_l4pshoDEc4hKfT8VbcKnYtx8OoyZaL7xVtD9Z9U2haO0NXGHpbNcghi6DWXgXNYhT-Vzjse_K_pjVpHuD3RzFyg4kpgEK52ZEU-5jpBer2x2K92WozQQHERTN4GetYK6vM2398NjQJ76donghnSGM5EQXA9lxFIu3LRbsH5memTREwTFXziyFWWcO-S3kIVHno-enJ2Q3GnypLh3yUO-l2zxWdWbCiG8H7IwLbiOyM1OjcX6nt6cFvuqKrXiiryu1I7dHTOWpjEH8g0ameqIJuc6X_QMV6cMZ7-qGKfnTNs0mZBDxhKMtRrhiIajfiRTrl7JOrz0smE-vbpb9OsAR5w5DiNmUNlwXWMdoFupQUz5aC4Gfaja5DKbjF5ccCf4lQcvckh5YCypHnCsSrDPwRnE-PsenR-UlGMKBCwdoHDUneeeEFhL0EaI6KNLHudqMp1_dY16LgmC9ootQ=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoduotrio1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoduotrio1.this,marcas.class);
                startActivity(marca);
            }
        });

        chiccoduotrio1txtdesc = (TextView)findViewById(R.id.chiccoduotrio1txtdesc);
        final String stconsulta = chiccoduotrio1txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoduotrio1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoduotrio1.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarchiccoduotrio1 = (Button)findViewById(R.id.btncomprachiccoduotrio1);
        comprarchiccoduotrio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccoduotrio1 = new Intent(chiccoduotrio1.this, webview.class);
                comprarchiccoduotrio1.putExtra("string", urlchiccoduotrio);
                startActivity(comprarchiccoduotrio1);
            }
        });

        chiccoduotrio1imgrojo = (ImageView)findViewById(R.id.chiccoduotrio1imgrojo);
        Picasso.with(this).load(urlchiccoduotrio1imgrojo).into(chiccoduotrio1imgrojo);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoduotrio1imgrojo.setVisibility(View.VISIBLE);
                chiccoduotrio1imgnaranja.setVisibility(View.GONE);
                chiccoduotrio1imglila.setVisibility(View.INVISIBLE);
            }
        });

        chiccoduotrio1imgnaranja = (ImageView)findViewById(R.id.chiccoduotrio1imgnaranja);
        Picasso.with(this).load(urlchiccoduotrio1imgnaranja).into(chiccoduotrio1imgnaranja);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoduotrio1imgnaranja.setVisibility(View.VISIBLE);
                chiccoduotrio1imgrojo.setVisibility(View.INVISIBLE);
                chiccoduotrio1imglila.setVisibility(View.INVISIBLE);
            }
        });

        chiccoduotrio1imglila = (ImageView)findViewById(R.id.chiccoduotrio1imglila);
        Picasso.with(this).load(urlchiccoduotrio2imglila).into(chiccoduotrio1imglila);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoduotrio1imglila.setVisibility(View.VISIBLE);
                chiccoduotrio1imgnaranja.setVisibility(View.INVISIBLE);
                chiccoduotrio1imgrojo.setVisibility(View.INVISIBLE);
            }
        });

    }
}
