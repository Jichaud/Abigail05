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

public class aventaccesorios5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios5;
    Button btnconsulta;
    TextView txtaventaccesorios5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=76ea6ef94846d4202c32f828078016f5";
    ImageView aventaccesorios5;
    String urlaventaccesorios5 = "https://lh3.googleusercontent.com/7X5YeKSk8FK12hnqRGHaSxaLbDuZA1YKH-pVZqdeowPfbQemEPpZZJaenUtf-Tf7PZcucMPKfuYU1JnAS3n_QpvXyvZVkv6f0narp0UJo-Unxczdt5kENHz8v_A5ceaZbSc_Sh4Pzng0OBxjNCMH5xGqWcfo0YAB1rdGSiyL6zpSCL9wbANdenCsbBh7OQCCaUSqhYouwm_b44oNqZenoVF5NGv5pb63-eiaZ-dVf0K9zEAf7fVBEcLHrNiwcffllCQw-qynY9cuE4KiO3eN7gRWDXukxUiZ46PjIJbu9iW0GuCExP2jFhz6G3vltfgTQyrC3XCh0qKUNnv1cd89-HwWWe0cYvz7y6LAGdAL5S9WYJubrS3HPmIleNIS0dL8kNpOokkdUqO3_iYCStytP5-kL0EY6MP1aVe8QUYunUrhd9jNXp45EOhnNJp-i9J6CIBSF3wybYLkiImz1nWNMMnT0JrrdDRMrk1NQNRRh9FU1wtzcIKvYAGBccVsWK4L9HwkDC5m-iMs7JqjJouwkozYTq1GgxQNGHedqWkAc5UCX5MES9FBKIt4HOJSevt9PQrD5jLVPJwFUXTj4VfvySgC1zXI5YDfZ1VYF1H572EMHV4XEw=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios5);

        aventaccesorios5 = (ImageView)findViewById(R.id.aventaccesorios5);
        Picasso.with(this).load(urlaventaccesorios5).into(aventaccesorios5);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios5 = (TextView)findViewById(R.id.txtaventaccesorios5);
        final String stconsulta = txtaventaccesorios5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios5 = (Button)findViewById(R.id.btncompraaventaccesorios5);
        btncompraaventaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios5 = new Intent(aventaccesorios5.this,webview.class);
                btncompraaventaccesorios5.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios5);
            }
        });

    }
}
