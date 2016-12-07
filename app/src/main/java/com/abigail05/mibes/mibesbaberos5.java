package com.abigail05.mibes;

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

public class mibesbaberos5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesbaberos5;
    Button btnconsulta;
    TextView txtmibesbaberos5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d01f19c9c7def51e293d26a2451c2224";
    ImageView mibesbaberos5;
    String urlmibesbaberos5 = "https://lh3.googleusercontent.com/Tgagf5A0tfqroeTNXoB-pYPiXOZWKWgocRW4fKyzj466ZcDPxTKVAFcx19h70NPiE3z8kvVXmMYiyUVOsA4FiAfMIfKg0LUSsXTWm9oG9B-IZ0sxDi9EhrDv0Bl7F-p2bh9j8nS9LuEgpOz1ea_SA_qvEgxj56t6ng8_JlpX6_M03KKbdYI-OGxRdXzfrRfT934wa68xgnFDE2FpZbuYOTli9ukhNc3YBATYFORbdlbT_dqrhD_UxNt9TJ7CBfarvoiLE0Qdpzq8uH8PFCzcVg-R36gjfTO5NH8O0x5MRX91Oe0Mh-hdgK9G8_yP9eu4hgmBoTElaMXz53pQ6RJ3WaP4rLjX7hVBIupumTfv8wz8SvKpJIZ5B1WiURVv0dFOYCucGA3Ccvt1lr9dT7BNLYCjua5Z9bInMHH7LW4i8k9RjnwOKSOi1jRKKO5avdKdiS69srwwfc3NwwdAAXW7D48XC6RjVk9yg8spGyutO-dfO9aAqKOTr2B2FT9iY0ydLZtwIR2C19N-hfcZYCm2DkXZnbSPKJKzt1am3tz_lNQ6yeRC5cANNcC9gDk3o-g8BC4ILMn0EwVNZm_pVQnxrVMztLmUFWcNEwMXmFNmdghUeLruauao9i3WORj8ai4Vay7x0vOQwtJLSNZB8V60u17xhgg9A8f0z-su_AuJkTU=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos5);

        mibesbaberos5 = (ImageView)findViewById(R.id.mibesbaberos5);
        Picasso.with(this).load(urlmibesbaberos5).into(mibesbaberos5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesbaberos5 = (TextView)findViewById(R.id.txtmibesbaberos5);
        final String stconsulta = txtmibesbaberos5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesbaberos5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesbaberos5 = (Button)findViewById(R.id.btncompramibesbaberos5);
        btncompramibesbaberos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesbaberos5 = new Intent(mibesbaberos5.this,webview.class);
                btncompramibesbaberos5.putExtra("string", urlcombo);
                startActivity(btncompramibesbaberos5);
            }
        });

    }
}
