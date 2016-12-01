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

public class aventaccesorios10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios10;
    Button btnconsulta;
    TextView txtaventaccesorios10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=527a0440ef4446bea89d5c8aca10cfe0";
    ImageView aventaccesorios10;
    String urlaventaccesorios10 = "https://lh3.googleusercontent.com/kBzPZF7XnKOWkGbmXeP4YxTIMIkobcWCZe_-9DriyQGwoPGQKafuErB2QYdM46K8ZQBChgTa50GpLveaa1OBdYcC3MA29AnfwqSAF7Hch6Bps_MjzqFgS4TaZlYQgKqAqcxVxWTsCvWsGyEmlcD8YuZMj9Zq2ti04Sl0GXe0bTGeIeKZqfetHhF6Xf6IjuqOdvMvf9MaeVW3MBjKOc6o6HYbJyz7GUwwwYeOWGBB2Y7tMoug5aqPvLR1oxNk9pMzJTC1I5ixgxflEB9SIQ7UEumNyNKKRBLte9eIpvv31p45LjVcA4ea9Oe-wiYB7Qfmz5GjlTiKlVecug3UmyJjOibbfHDDL97NvtdH9x9weH8thIK7fHFlsIOBSAhyE1pQvNC2Z4W1xHbRuEFUPYDRhtQ7aNTyvYJ36YwLbQy4WNgItVHB4jRX9_dF586_sPou5ajg2BzcJXNZdjD-5zTzLIjGZrPbUL6c8eh021scweAnxxiWbKGQQ4vPCfd2lO6JJf2-OzD9K99v296YknMiWhxlH-y9sQuLS4S1hrzSNGrKraA1uCjmXz4qoFRH9v3114pV9QVGRM7NAj7o_n0OpB7uUkclmUSc6_o_sSBBNTR46oSR8Q=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios10);

        aventaccesorios10 = (ImageView)findViewById(R.id.aventaccesorios10);
        Picasso.with(this).load(urlaventaccesorios10).into(aventaccesorios10);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios10 = (TextView)findViewById(R.id.txtaventaccesorios10);
        final String stconsulta = txtaventaccesorios10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios10 = (Button)findViewById(R.id.btncompraaventaccesorios10);
        btncompraaventaccesorios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios10 = new Intent(aventaccesorios10.this,webview.class);
                btncompraaventaccesorios10.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios10);
            }
        });

    }
}
