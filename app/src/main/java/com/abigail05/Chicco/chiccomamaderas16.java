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

public class chiccomamaderas16 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas16;
    Button btnconsulta;
    TextView txtchiccomamaderas16;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=343fa9458fa3bcd510b11288fa7129c8";
    ImageView chiccomamaderas16;
    String urlchiccomamaderas16 = "https://lh3.googleusercontent.com/30adcIKHwy_2RH4VM-QI4GKc7vFacccqVsquKM-sUPGnL26LFnQ1HcFwRnIU2RPBubgT4NiElP7EcGDf0bPL2XWKiu6QkfLDMlJfytzyLQ-2ww6ZbmCop_K2xt7tvsU4LczdKe6YSZO8r0EFl5Po2fdOLRmhNt8YyIik-_n6PFa_VE5fSJXEAtwyzDEZTl3jeBIP9VWDMeG0yPv4bWbhxkV6dNp-7NSWqgBjMlzZzWMoO8SDNTjUJRPJ22JGleRGxd68wyCzlFmdoqwTw6wvOmfk6erPW3cq5ec24qXl6lo526fbynoKAHxNdkU2CEx_R8Po39XDDve1iScrOeElhaT3VpvKwOwA9R4H1kTiUgIqnvQQs2U23qAW3EowDjmgjlQDpLcbqGRh31V-6GoZUKFRPeh3uMoGeMFFd-i66EgAFHAbSjuambiATn0vjG4B3qSoAmH00DM3AHlykpBjhJloIiriOkDuhgK15VppE_MJ_jWnYOyiY7IBwM2U8vJ5f67UP3frRHQeJcneugchyjo05kxh-ezPQ9f-luraXoXHZVWVPl3560kwgsMOLzvlp6lmzvvFKu85-8r2mPgNmJdvSFmkAwEunKZv-Q8a9WhtckO0yw=w428-h460-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas16);

        chiccomamaderas16 = (ImageView)findViewById(R.id.chiccomamaderas16);
        Picasso.with(this).load(urlchiccomamaderas16).into(chiccomamaderas16);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas16.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas16.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas16 = (TextView)findViewById(R.id.txtchiccomamaderas16);
        final String stconsulta = txtchiccomamaderas16.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas16.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas16 = (Button)findViewById(R.id.btncomprachiccomamaderas16);
        btncomprachiccomamaderas16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas16 = new Intent(chiccomamaderas16.this,webview.class);
                btncomprachiccomamaderas16.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas16);
            }
        });

    }
}
