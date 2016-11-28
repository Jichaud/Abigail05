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

public class aventaccesorios7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios7;
    Button btnconsulta;
    TextView txtaventaccesorios7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e277bc500b7afff68b2eb8830e2aea0";
    ImageView aventaccesorios7;
    String urlaventaccesorios7 = "https://lh3.googleusercontent.com/yFr9hfLhd_9_ZvHMm0j70uxzvXH2BZlcpvtgFgle1w-noUXdqs_CBJmP3N4N4M_bWA9HneZPMY1KFv0LzSCQOCH5kejleDgzctVX5PPjhYtDpYU0SaH4Rqqp94I-U1evipeISpv_a8ADu6POadQO6O5p3I1DsfaaVTkw6P3K-8w-Q0O4QmdlVE_sYQLnaU6BXGRG75TJ5OPe1VroXHZYk43y3b9mgqbGk3FwKVhH5YTmAkjmHsOx7wEWKy_1UnWc_IpJWq3KnnkQ6nzniZ4ZJpEPcVeJ0NPC-Ap6H7Fi54mQtexSvh-AwGzO22QDjV6itl-5BrIyDcr2D6OM-ARuUwQSdaig1-VQgEhEcZVB_nQZNqfzyg457vncIPqE0q-Sr4griFQm64O1Pg4gD6detLVtrQypy6lNww2NpZusQlUOtHQg1mFhrFoTNYaSUGJK7DBS7ACsfQu9q_uP7eUzY5MXFh-htmXIjYFL18rI1FopnK5heCt-DRsr_YBSNwp9zvoyLImxnjtQFlZLfVTN7k47E50xtTsC7CpJSmvhaTRxa4XbuFxe_H5fhgHPo_VT3dUXR00f9_DxrfrXfzSO6jrrbFRdm7-LP-hMYIDtTe1esPJm2g=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios7);

        aventaccesorios7 = (ImageView)findViewById(R.id.aventaccesorios7);
        Picasso.with(this).load(urlaventaccesorios7).into(aventaccesorios7);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios7 = (TextView)findViewById(R.id.txtaventaccesorios7);
        final String stconsulta = txtaventaccesorios7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios7 = (Button)findViewById(R.id.btncompraaventaccesorios7);
        btncompraaventaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios7 = new Intent(aventaccesorios7.this,webview.class);
                btncompraaventaccesorios7.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios7);
            }
        });

    }
}
