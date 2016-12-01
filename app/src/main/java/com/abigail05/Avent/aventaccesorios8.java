package com.abigail05.Avent;

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

public class aventaccesorios8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios8;
    Button btnconsulta;
    TextView txtaventaccesorios8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=59901973afcbea0ffc2cbd0bf547bbf9";
    ImageView aventaccesorios8;
    String urlaventaccesorios8 = "https://lh3.googleusercontent.com/yFr9hfLhd_9_ZvHMm0j70uxzvXH2BZlcpvtgFgle1w-noUXdqs_CBJmP3N4N4M_bWA9HneZPMY1KFv0LzSCQOCH5kejleDgzctVX5PPjhYtDpYU0SaH4Rqqp94I-U1evipeISpv_a8ADu6POadQO6O5p3I1DsfaaVTkw6P3K-8w-Q0O4QmdlVE_sYQLnaU6BXGRG75TJ5OPe1VroXHZYk43y3b9mgqbGk3FwKVhH5YTmAkjmHsOx7wEWKy_1UnWc_IpJWq3KnnkQ6nzniZ4ZJpEPcVeJ0NPC-Ap6H7Fi54mQtexSvh-AwGzO22QDjV6itl-5BrIyDcr2D6OM-ARuUwQSdaig1-VQgEhEcZVB_nQZNqfzyg457vncIPqE0q-Sr4griFQm64O1Pg4gD6detLVtrQypy6lNww2NpZusQlUOtHQg1mFhrFoTNYaSUGJK7DBS7ACsfQu9q_uP7eUzY5MXFh-htmXIjYFL18rI1FopnK5heCt-DRsr_YBSNwp9zvoyLImxnjtQFlZLfVTN7k47E50xtTsC7CpJSmvhaTRxa4XbuFxe_H5fhgHPo_VT3dUXR00f9_DxrfrXfzSO6jrrbFRdm7-LP-hMYIDtTe1esPJm2g=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios8);

        aventaccesorios8 = (ImageView)findViewById(R.id.aventaccesorios8);
        Picasso.with(this).load(urlaventaccesorios8).into(aventaccesorios8);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios8 = (TextView)findViewById(R.id.txtaventaccesorios8);
        final String stconsulta = txtaventaccesorios8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios8 = (Button)findViewById(R.id.btncompraaventaccesorios8);
        btncompraaventaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios8 = new Intent(aventaccesorios8.this,webview.class);
                btncompraaventaccesorios8.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios8);
            }
        });

    }
}
