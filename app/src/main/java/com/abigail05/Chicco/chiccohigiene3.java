package com.abigail05.Chicco;

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

public class chiccohigiene3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene3;
    Button btnconsulta;
    TextView txtchiccohigiene3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dcb12f38229572425a063c4f924d0305";
    ImageView chiccohigiene3;
    String urlchiccohigiene3 = "https://lh3.googleusercontent.com/ww279fIwFzvC_4vneh7x9bfeJTsiYBFyCXEbrQK9MKroFWOmjOgASGUaAaQmMaFU1qYC93dhqTDd6Zp8Sf-LcK-bK3xw6wAsN7Jmf8pXsNxpZ9u5Y6DMpXIg_QPOnPDzx2SOxAutX6yANp6KEiPjcad5lMJZqxvFBAi4ApRJaob36hTdQ9xmGu4zCR6A1H-b9EsmhwuSB4DnZCeAOoUKlyrCZWmP2YQD4mjT6e3SugiZSZQwbyp0vo95dgJ6KRlEnCX1UvY-i9Yt8lew98cYD938CdvO1hM5QJNLnwTAPS6RH6bBVZgtNn97Mun7GHRZGrsxhJwu-3bHMWhrL9Gsx_p0-2gjRa3UJEIfAbiqrSbXQnWbl_HIfqCuXvk6U_xaC30kT5yQdShj_r5CugXSjTNQUhiu6Ib6Vm0fxySH-8SfNQ2tPLY9E-ExFT56X5zprLBXVs4P_vWWUIF5ReLgyIJgsdNiTvdnqjhhmfYYNzO0dfpFXxgy32lCCQeExKKrn_sIFut29ZPgN416koQd32hlUjC7LQtw-D7uwvnW5xc5v0oOLlaPXH6mg6cvvk6Rh6EvDIr3DSn2Z_iwHSQajgDm_vX7odsDTyo9EiC7_JZ0jTE4ow=w398-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene3);

        chiccohigiene3 = (ImageView)findViewById(R.id.chiccohigiene3);
        Picasso.with(this).load(urlchiccohigiene3).into(chiccohigiene3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene3 = (TextView)findViewById(R.id.txtchiccohigiene3);
        final String stconsulta = txtchiccohigiene3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene3 = (Button)findViewById(R.id.btncomprachiccohigiene3);
        btncomprachiccohigiene3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene3 = new Intent(chiccohigiene3.this,webview.class);
                btncomprachiccohigiene3.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene3);
            }
        });

    }
}
