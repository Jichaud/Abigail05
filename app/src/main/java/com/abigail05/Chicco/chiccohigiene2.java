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

public class chiccohigiene2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene2;
    Button btnconsulta;
    TextView txtchiccohigiene2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=184d681d0f64a195f3978547abbe52b1";
    ImageView chiccohigiene2;
    String urlchiccohigiene2 = "https://lh3.googleusercontent.com/ojpzZPwu77C7_k4MhzUevHzwPoaYChgrhDjjznOlnZ2lUB8JBOuY7CAVbIh0SjZayhqFZpPXUIcj9H1Ekh-6T7brByIH_alWQ1tuMgnvO8kXg373tFku7tRNuj2AccYgAqg_tNpBEyHXMI7Q2IDbTOxSTWniLnpOdQVpJh3uZlN1jXZ9vF_j9enWdpDj_qwcAhOCzBvqQjlD-xzthc1K3xqOFq7dApqqDJ5EAjW_BzvHZpZWGX-C9Ia7ekVBJEWTQ0Bn1P9CAKnC-JmUstiHyBEHTN9MSrqo1WwkknTmRbnSYZZ_Y7MdXuQDULzYT5AWifAjyHZwSFBnmA0-neKVM-umCMO3Wy4eCH6j2dLg9vKi4M9FKWVIQtssNDVguXcys4DFQiONny20Yf-DoQmc8VlqL4DJf6B1k8qpS-pEnZFiL0NtVGUv10ezKBzDWVt4_JEBvZ0QJRx55tmNVk5yRZxxNeXPEPXYhbsRbaXiVvLwtBieu6tSDQLx3YjA0_kTcG6fTNDgl1sNMafSoIeJ-TamPBzAfFr9wyEZqXrpiDbZfVpqNaF4JjkvcJSBNQVKIowfFUmE4j0qEMl1wL1I3mAhFv4-p1SdBxc__E_O5Pg3X4CjMA=w451-h450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene2);

        chiccohigiene2 = (ImageView)findViewById(R.id.chiccohigiene2);
        Picasso.with(this).load(urlchiccohigiene2).into(chiccohigiene2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene2 = (TextView)findViewById(R.id.txtchiccohigiene2);
        final String stconsulta = txtchiccohigiene2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene2 = (Button)findViewById(R.id.btncomprachiccohigiene2);
        btncomprachiccohigiene2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene2 = new Intent(chiccohigiene2.this,webview.class);
                btncomprachiccohigiene2.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene2);
            }
        });

    }
}
