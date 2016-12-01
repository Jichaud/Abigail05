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

public class nukchupetes7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukchupetes7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c69698ba1a364bfd436df74b2165788d";
    ImageView nukchupetes7;
    ImageView nukchupetes77;
    ImageView nukchupetes8;
    ImageView nukchupetes88;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtnukchupetes7;
    String urlnukchupetes7 = "https://lh3.googleusercontent.com/fYP1hK-8ZjYwdY-TbQ-KxhB0opNXid15KCUasjFqqnBIk_zGMFX4hRQcWvZ9WZTgN0mNx9Em7VZsgktcXNVmOiOQnYNT99npimj6pt-oBtiSHG3VE55W4v1x4wENlH5gx0tI2EuDf3lKCZ0ieFd_Fl6rSqEkRgzTzXVt_XCf_Cik7Ug1uYL85AzeyUedh8jRO5qSv4wVMOb5204OiHQeI3ftpK23C_ZPzY_W0gMZ0d5YPxM1TKaGCtnp3W1Y0VRw9Tu6tGdcr2yBmFbdPXWsUMNi22uF6_yZbJHwUFQwtnNMnhngr4f-NGW5dzwHi7MLsbUFDLq-S394Stm_msBSI6tJjx05KFg5b5cMcOlK4IJk0P2OFiuapqSeu_3xRWFICVZj9PfQw3u4lOMlnKeKzcLJg-R0oSdkTh0FNbu8kMXpGgGPnto2rkUMeQj3e4DDgaienyrzo67UHFMfYIz89EBweyv25XCOFBBKBgxDt6kr_OC_dE1diowZegvDqoOlmeXG8dICnLXVSNXlL57QAA1XBpsmNdhOf0tY8xF3aCKN1a30WHXU_p2t8ILdLQSB9GQtxiGHIwIVNBBcFkkHCZLkvCm-Jss27jiCZ-O3JDtNaN26Nw=w374-h292-no";
    String urlnukchupetes77 = "https://lh3.googleusercontent.com/mw6y8qh2PlolqnTe0KVpVDFHIcPsgnqTzNypjWcXElaJXNdzIWFm6Qorie4P1HBXcfqv2d6XVcy8hsim7buPcw8FL178HAmjzdqsLDtuANdhatjbc5wh074NZacVbnr9EPB4idEsR5NZqoTQVZjSS6GOGfwoSnG-zLZyJcXdoinB3kKmhnkGTt_W-8Ns2OdOSlm418zr_GED3gGSs7wTrbrf9vzL7iUn238W9W7mzWbGla0Q7N6jrPJnAHZekNeG_9peSvfZQsHBUspDXjDvQwobH9adPghdMH1BUUwNlAfrQHSi5cXEYS4zb-6n2cOAfBL81Z9BSOu1G5Gn99k-PLaq5FVn03dPqNR1NUh0Z1_PlukkaWIsGmcPSX3suGsqE1_1ZipoDa0k_jw0ElzHrZ92cmPyglvhf_zvnS6-v0C9IFkA3BOovPpeD0jrb4XkWarrieKK4IFhKhhvNzigcQux-OVXWm9I7J3aVmWy7ObnwnTm9LO8bYzkYQyVpgZeIptbcuUrIiNeWhXyKWC45OOpgi4BaRKQYq0_EY97pm3rafavygFxqno0YZRIrXzrQNHBjX8RLP7K37FuRgz0Pa_ocyrenrc7eVTu9e0GjiLmeMuU0A=w374-h292-no";
    String urlnukchupetes8 = "https://lh3.googleusercontent.com/wRqheEJV2um99yrMJIjiSJDkta3taTtcHteqpvznYQYmQ0zOuvqzqgINUSEZ9FDR6wvyUiOOtgGGwPOpQf7uGfIM5X0IMb42tAvpiDsZ7Hj6STxurgbnDB42QmY0QqRRQ8Tnsd6p7a85rV35q9RK0dOmNyoR1oRzCd2dFOV3_8GvLDTxBwjzA3gJ4kdDqjFenx52X7x8pa34I38ZRjClV0I0LzAr3Pcnasl_2hiThteVg05IFFiZeI20xkL-5IhHhYU8FmDPVgM69jFDXN-aKXE4zNQ3EvRnzaBp6LQTswiu8iexlcb0dgd0HdFZSHABS-pRjBN_O-QXDILYlMieg2Xz31TSYR5CXSSW3W7m2odn7RcRzBjH5eQ0O9qrqoD569ZTklhBnhQDrstSD4Hf-WBBf6MzfEJVt2D4xuzc3WTgqgWQMJ61J9T4s6EsdeiYhO0s46SmeztyFLsVg8o59BngMvx2HvDtEVfbx2_hrsBwQ-pDSf2SyY-Qrd18alrjJmq8ZPVYbim5Cs99jFHNkf2S4-BKEk9jk0Wto6Kk0kZhHVcHDcqax9ESWK3rNC-WS4pix96fv4LmUxmGInUMXX9RsBGsiFEwPd53y63Atl9LoyfBVg=w374-h292-no";
    String urlnukchupetes88 = "https://lh3.googleusercontent.com/Eo1K-kzSHpVC_SKXUooEHj-x_-N3LECJE9fx7rNK2zmhnJuKjPjCNibXLiUF8G58lkT331nMOjMoIAhsXYITBT_SZMqCrSNmWUPDEp1BZiKOA9IXuf7qJ2ODg14YG3IzUvdNe_rCHHd_3lreqxCUG-7J5Xy4X699yJFxoXC6kJyF1FWhVV-hc1NLH9rS-8mNN-vJO_F82OLBhJv6yJzvVh5f6PboJBP6UpJnJVeVpomu6WcjC57ndYlohcAAV76L0nnVNJz7xqb6R9PM-31-p0OFf3_yp7Or1imYe6a4oCg4g-U3v1bSTyFyi-Rt9bDd2NRNC3AzeYLN9QZP9_-Uv0n9d-5pJHvnLcuNc3JNdONQDf3HmpMhDjRfPtaXt3DoqoD7a2QBp4V83I1ukR-2D1SCwShL6zP6I2OmSsBsiCB2xBJM_Bfnrx_mvODzeb_z2RCeoOXdKiftrM2t7Xdcw3GyBCd03Z6uSWqO9TKj-hgxAmQAJZ85SpCDbySFkAXkrZto71frpi8hyGBVIShcPyc6QforestPjo46Xyc3s3B0MzcPi9h6xXtO8ErPSks751e20dnV4D8HDoD5bA401lNkRazTGp5MdGvKD-6tFIOT_cC1UA=w374-h292-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukchupetes7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukchupetes7.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukchupetes7 = (TextView)findViewById(R.id.txtnukchupetes7);
        final String stconsulta = txtnukchupetes7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukchupetes7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukchupetes7.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukchupetes7 = (Button)findViewById(R.id.btncompranukchupetes7);
        btncompranukchupetes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukchupetes7 = new Intent(nukchupetes7.this, webview.class);
                btncompranukchupetes7.putExtra("string", urlcombo);
                startActivity(btncompranukchupetes7);
            }
        });

        nukchupetes7 = (ImageView)findViewById(R.id.nukchupetes7);
        Picasso.with(this).load(urlnukchupetes7).into(nukchupetes7);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes7.setVisibility(View.VISIBLE);
                nukchupetes77.setVisibility(View.GONE);
                nukchupetes8.setVisibility(View.GONE);
                nukchupetes88.setVisibility(View.GONE);
            }
        });

        nukchupetes77 = (ImageView)findViewById(R.id.nukchupetes77);
        Picasso.with(this).load(urlnukchupetes77).into(nukchupetes77);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes77.setVisibility(View.VISIBLE);
                nukchupetes7.setVisibility(View.INVISIBLE);
                nukchupetes8.setVisibility(View.GONE);
                nukchupetes88.setVisibility(View.GONE);
            }
        });

        nukchupetes8 = (ImageView)findViewById(R.id.nukchupetes8);
        Picasso.with(this).load(urlnukchupetes8).into(nukchupetes8);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes77.setVisibility(View.GONE);
                nukchupetes7.setVisibility(View.INVISIBLE);
                nukchupetes8.setVisibility(View.VISIBLE);
                nukchupetes88.setVisibility(View.GONE);
            }
        });

        nukchupetes88 = (ImageView)findViewById(R.id.nukchupetes88);
        Picasso.with(this).load(urlnukchupetes88).into(nukchupetes88);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes77.setVisibility(View.GONE);
                nukchupetes7.setVisibility(View.INVISIBLE);
                nukchupetes8.setVisibility(View.GONE);
                nukchupetes88.setVisibility(View.VISIBLE);
            }
        });

    }
}
