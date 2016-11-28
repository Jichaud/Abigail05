package com.abigail05.Avent;

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

public class aventchupete5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete5;
    Button btnconsulta;
    TextView txtaventchupete5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=58ad042793df5294ad796161b21c0b72";
    ImageView aventchupete5;
    String urlaventchupete5 = "https://lh3.googleusercontent.com/pkvf8oiasvSa8EiJ2FCP9xcC3t7ZaHfFKHQO5b1yi_Ea8rCqIdrbkNH2tS6d4Obv_6GOMeUhc-gjRFbVsG9y2vZupRSlUgFN36cV9-haNz186h6Ksah3XCtY1f229D5e4GSz1vSYKO3CQ-6hUKgDH5hGVmIwW8nVK2iYz8QNhJlro8C13T6O8tOooTYoFE5tn96NkPXNugcGMxgXfcvbmbUKSkcSgzx-CH02-0ztZFr0zoOaGN8CnqWUnGOJVgJDlneevvCWNgN_74Lt3jcaOEgahlPPVcirpEsGzXOuphf3gXNU856J7i0lEoPWLVVSAM3nCB_crUgG8gG0bV-jlL_Q27K7DBZuIsRyqfn_CbJq0aPqs5JCfFqyGi_BEeUE4s08MP7XoZHx_eA83IZSDxVby5zMh4DMTmeB-LWfjPCnuiUb3pfVDsm63h5rvmxXwIbDhyBl8BvGD5WT68JKZlCviDCREAdAhwOPDYw5ruw_8N-kh_BrjHIm65sCrX3bcDeBDqoxZtL17Rjvg4ZeDvZ46jI5M8b7x6No3Wzl2b46YoBbVZd0vX5a9PWPIvYULXtDZaHa_GpOzdXJl2NgnGrpqMXupJCP5PoAtjsUjZWl41QZjw=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete5);

        aventchupete5 = (ImageView)findViewById(R.id.aventchupete5);
        Picasso.with(this).load(urlaventchupete5).into(aventchupete5);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete5 = (TextView)findViewById(R.id.txtaventchupete5);
        final String stconsulta = txtaventchupete5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete5 = (Button)findViewById(R.id.btncompraaventchupete5);
        btncompraaventchupete5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete5 = new Intent(aventchupete5.this,webview.class);
                btncompraaventchupete5.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete5);
            }
        });

    }
}
