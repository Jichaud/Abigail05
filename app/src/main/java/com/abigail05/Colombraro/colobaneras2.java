package com.abigail05.Colombraro;

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

public class colobaneras2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompracolobaneras2;
    Button btnconsulta;
    TextView txtcolobaneras2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=314e9954b530ef651e63cf0fb9f13daa";
    ImageView colobaneras2;
    String urlcolobaneras2 = "https://lh3.googleusercontent.com/_-53jBaxz4xYnLIFNg9uPu-y_xhqGeWywWUJqPH81LEwMovhEG_rUAwEsUqsngQH1rn-Ix7WD8v4QgXedyzSxytSEWVtR_KeDc8bjmllmW4s5OjgiMNbqXGfPl3anZdk772hnBiTZRWdhYVSP5XAh4Km6mi4zWRRiN3utk2QMxwQF8vg1eVqlyUHBimdwHX8YPXoJDI69q-57vUoN9oooytb3wsfkqmnzztpVuR8_VdUUJSMZEBP_AsF-YWH2zRyv2cRrkPp9NgaRLvrFXlXck4irs3pV5P75HeCH1697-RUqLb4lDm-meVZ9s_IkxBUoNo5edZ7awrIPHwkBa97dB0JwUu-jnxBIeSMPo4SYjicQwjIZIlLH9QjEkN6NMmIJRT-7l5Nxw2smybaFkxkytSOWuaclBg0Ka4oBLWeFWKfYfflG02ojkK5QxnceYBk-qCLbdHU4W-aGqZTzVKCQdJVfh2neDMVJktIajAyJtK_mhUBJ0pcpUl36KcuyITbx1g1A08X9xhn_kj3nA4EUczwtIUPjnRUkioshAfNlG-GuXERyZn5Bxo1L5eWEZW-BbTeddq67K7JDhPhr0EKRuikXxK57Lwkz3zCp0KFDTLFUKQuFw=w512-h509-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colobaneras2);

        colobaneras2 = (ImageView)findViewById(R.id.colobaneras2);
        Picasso.with(this).load(urlcolobaneras2).into(colobaneras2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(colobaneras2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(colobaneras2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtcolobaneras2 = (TextView)findViewById(R.id.txtcolobaneras2);
        final String stconsulta = txtcolobaneras2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(colobaneras2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompracolobaneras2 = (Button)findViewById(R.id.btncompracolobaneras2);
        btncompracolobaneras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompracolobaneras2 = new Intent(colobaneras2.this,webview.class);
                btncompracolobaneras2.putExtra("string", urlcombo);
                startActivity(btncompracolobaneras2);
            }
        });

    }
}
