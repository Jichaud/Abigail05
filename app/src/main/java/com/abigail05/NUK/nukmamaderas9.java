package com.abigail05.NUK;

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

public class nukmamaderas9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas9;
    Button btnconsulta;
    TextView txtnukmamaderas9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6d71f64395f19cd6350dd9eed386b5ed";
    ImageView nukmamaderas9;
    String urlnukmamaderas9 = "https://lh3.googleusercontent.com/GhJCIep2YMn3eNO6oGgM8BMZwjVOjcTjyMVS-xU6bgS4CQISZjAviOAyUF9PLtLfEY0Q1g29ODsIYK9jQN219UghfoolL5GlOyijmnZUut6h2BydX1rFe0ovtVYDc-NSiHMvS91sGulm5TJbiA9ehm37i7-2olw5zBnxxnj-k23hxyosmf54mvTqNMyGXzOp1mQ0CJBDXdfOhrIaDwTM4nLq8uev139wMSGOnQZqdaKcSYeE4deslrFqvSgJd52RhTw1uQV_TKLrXTmZZ4-jTMAS6xxRayd5kw3HFKLuNQuLkAYAUXEjnDoq9uMIzxooUbDXkj_E7OmNigUww7wF1cmD-URaMsghxaArnIOi_WacbJ269Xt4J3n-cO6nQcpj_Ev5MJQzC0H5sBxHk7mvdi3UKTYowJC7Id0LTNc8uoX84V0SFF2VOQsvRe45Uuix6uAwkO4d9lPWGEVEnzvtgTcqpafZfqzc3rYelsjdTEuzqiE2b-a8HvY6W2InXtmkDLIgF3ymPBl3wyeCFdN_guX5Kac6JZOhGZGrr2eygYPwAyaiOyVtumabYtr4DKvcYPiEyj8pkjyvm0Pdk31G8N2qblg-0Z75c9fhM1w0O8KzkeZ07w=w191-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas9);

        nukmamaderas9 = (ImageView)findViewById(R.id.nukmamaderas9);
        Picasso.with(this).load(urlnukmamaderas9).into(nukmamaderas9);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas9 = (TextView)findViewById(R.id.txtnukmamaderas9);
        final String stconsulta = txtnukmamaderas9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas9 = (Button)findViewById(R.id.btncompranukmamaderas9);
        btncompranukmamaderas9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas9 = new Intent(nukmamaderas9.this,webview.class);
                btncompranukmamaderas9.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas9);
            }
        });

    }
}
