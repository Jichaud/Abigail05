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

public class aventchupete10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete10;
    Button btnconsulta;
    TextView txtaventchupete10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf482d550c63d982dc7a663836d9eda8";
    ImageView aventchupete10;
    String urlaventchupete10 = "https://lh3.googleusercontent.com/vEWFPgVE-5gNbzMFWDih4WrRAbHOnkUDeJGlBAYfIgrZX9SyR6Qq5kGq8kw-1KCFihwL9rvFh6hgvW1QBi1xqu0d7eFxpvGPFwmstHnN49L7EwmG60f6jF3XRFGSGIwXt3hR2vOqbppQ5YONxfkvKVAqg3DquvL1EZxiqg2d0306Ef-CvxHcCvmrkHq9dBtFKmUjJ-hjzA_bJlEG6o8A6wR6MQcidspYl4UEI2pKiGRqjTuN-NNV3zGDDdRxk1mUxgKCaPVnlErYn08Eg5nvtuJWh9UfGIJwVtDS66_oDIeSDpdUSmoUR9HssLXVVIPKfb5XtdMs6579vcRNcFDGjDU5lw2Ibf6vaXUtSWYk3ah6OOeuYTAZ1wdQY6mbMc8p0k5ZLyyXys35nmL0-6tUeD5o0MbEx7tBvOw8ez8w317fONkOwxTJU_TlhkybSCwbIR7JIYW-JGYXhzGgrqqKrexsx31w_3Yjc9bBu7YwKq9sVmzoHoWr3e8YJXPoXCBQSBSmBfuhHNrA1cdpyHdmpllbEkPaukyXccaZEty77RrEt3BM2DQ4Y9Ljf-9r2eWpegAUhbipOpwI_mJrpUtrzuW59-KL4Zd8DSrw-reRcLMAugkbrA=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete10);

        aventchupete10 = (ImageView)findViewById(R.id.aventchupete10);
        Picasso.with(this).load(urlaventchupete10).into(aventchupete10);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete10 = (TextView)findViewById(R.id.txtaventchupete10);
        final String stconsulta = txtaventchupete10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete10 = (Button)findViewById(R.id.btncompraaventchupete10);
        btncompraaventchupete10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete10 = new Intent(aventchupete10.this,webview.class);
                btncompraaventchupete10.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete10);
            }
        });

    }
}
