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

public class chiccohigiene7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene7;
    Button btnconsulta;
    TextView txtchiccohigiene7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9590c74d2e4b915b1613bfd36facc1d8";
    ImageView chiccohigiene7;
    String urlchiccohigiene7 = "https://lh3.googleusercontent.com/r_ytu9i1UX3GcUl7fjI1OPrqWUjxN8ib98unlS97t755k54tjicrAcsELj2XDE_OAECno3vW359HDznuZ2PL-MyyHdaj3FjdGhWPZo9o_W1nhXyXEvTWvVDOzuSp6UuOMM5out6dEp0S1KGssLzFTL0k4Whe0zXD6FdMG6bf002gK1xWItxnzPykcByNqIulRgQ5KMi9qjc-W2PUj7aIZ1KxGFBiectY-ifDSnw6PLWzwndreJsOEyw6mBUq6Zqykw-I9ZMZz64_22EQHM2jnuAU6Wl8lT1BebbCfuzV-N4pb_q0nz0-_1OyMSE5g35JYHMkbXG8TuUNVpMCfH-MFaWyYcV56endn9BGPazzBybExlMh0pUC-IG2L-eGr2Qoebi65Z7bqqlPPnPO48owS98lUtokhRAuR5EObRtFvjqxUjcvKhCcKdccTFc5CaJ7BXZNsr4tiQmv6vne1IGIG5rYTkbzq6x7N0uJjb8N-dMWqXz0Y1G9hvtSux8yRddCpKiXpFk_fB-m2W7CmHrg2x6wWKq8MVSXkd0j8OddK1mHcUOXbaXbLlks6j9bD0nUhfelwFUVktv_BlOLC7dkMMfJYmygWDYGKILxIDFuE8qU_NvDRg=w398-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene7);

        chiccohigiene7 = (ImageView)findViewById(R.id.chiccohigiene7);
        Picasso.with(this).load(urlchiccohigiene7).into(chiccohigiene7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene7 = (TextView)findViewById(R.id.txtchiccohigiene7);
        final String stconsulta = txtchiccohigiene7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene7 = (Button)findViewById(R.id.btncomprachiccohigiene7);
        btncomprachiccohigiene7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene7 = new Intent(chiccohigiene7.this,webview.class);
                btncomprachiccohigiene7.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene7);
            }
        });

    }
}
