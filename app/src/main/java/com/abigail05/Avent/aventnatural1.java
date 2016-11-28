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

public class aventnatural1 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventnatural1;
    Button btnconsulta;
    TextView txtaventnatural1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3ed0ce591b116179260b0e605239b7b8";
    ImageView aventnatural1;
    String urlaventnatural1 = "https://lh3.googleusercontent.com/UK_SeyKcbYbe9uNwZ3_LWVYT7wXIWoPyCKzBUoneWmGSsIRDkyjiBi66-NjfgDNKYocUBziQdT9D7ROyA6AgAqRzCRUOXTgTbbVJd-GM49oGrbo5xMQIbKqwve_95Joxvf6SaKWFQ5zvcHDgqao9m0WEwdabvBRUBQ2guynMpJLSzEd2HO34Ef_Ou2YN6XughB5FxOb7wpbPaWg108eAgZunY6QRO_ayTODpX0B6GnqpL29XM8j8UhoBbd7AnZVVM_9EkYSGNO88pO5DzlPto25hmNSntkFd2JyemB236yy7W3xpsFgbqwykTkEFPJ8FyKlyANVPKbJeK8qY4Oa5FZm8751b2z1RRrYvZNsm9113bTar0rDpWNtKgG_ZQWxW6YXGURE_m-faao-ixfCaRwJWQZu-Md6FPdxU1QeAYqd2yHx-lffsNP1hJMc2PsMb-ne4_Tsaqk3UaCXbiRj-jEaLyuxc-McOSK3VIepBliuse4VnRUa2zSGNd6PBmjF1g8WGfcJUAG4X_RhTYyvWZKVlTbnawrG9U4c8FNQM_u1SEFKlNeYCV8RAZzBtCXT3KhZLeCSI3fl9XhR5_iMfJoJKoDopRGKbSN07g40EnUAfJDDeRQ=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural1);

        aventnatural1 = (ImageView)findViewById(R.id.aventnatural1);
        Picasso.with(this).load(urlaventnatural1).into(aventnatural1);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventnatural1 = (TextView)findViewById(R.id.txtaventnatural1);
        final String stconsulta = txtaventnatural1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventnatural1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventnatural1 = (Button)findViewById(R.id.btncompraaventnatural1);
        btncompraaventnatural1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural1 = new Intent(aventnatural1.this,webview.class);
                btncompraaventnatural1.putExtra("string", urlcombo);
                startActivity(btncompraaventnatural1);
            }
        });


    }
}
