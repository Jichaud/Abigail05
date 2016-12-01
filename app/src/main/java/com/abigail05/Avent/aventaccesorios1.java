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

public class aventaccesorios1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios1;
    Button btnconsulta;
    TextView txtaventaccesorios1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5e0624fe163726e090e34eb10898ed58";
    ImageView aventaccesorios1;
    String urlaventaccesorios1 = "https://lh3.googleusercontent.com/FxcdaUSuqoz2lXdLmlx8Tp1IQBYH5rdeTC6oJTxBFl11Wn7SndKvdYDBRMtJ2Jfyqvt5B9mP58oChRAfUFY8b00DOUjZRMfyuIt__YjjWj8tSRZq3sxEgmnMZLnrraC4qE2PNDL7ELn5mIdY-ptA2bVUwS2WEt0mgCws0XIwqtvGssdfRl65MBzkI_9Z0Z166A1WZhoBMqiRkJV1eP11LRNrE9zVlo-kJO9pHDwgTN0xoGGJJcLY89yaA7bTsBl5f_ePh2VUZAo0oHHXYpYgVJ3edgiyvHqLYwogKYPpYDadQQXlbovPAFV5qM7sFwBDNalel-28nH2xigbfvXU285M0eabgay0qivzWI0Yv8Q2EKEEM9DaMf-wT6jPKm0i-uqfJVMLb8P7R9dvHbIIGxVC3MBpwC7ARhfpUO2SNdpcMPl6vx_fBxMcfBCSVyRL1ZlTGQOq0V38U_WKZx8d1uZbwuUT4lTgsC8bIx31TXUWn1x9-fLHgNF7EHdJteDdcCsxUZkNz3J1IyJb4cCCBCiqm6bm76PaSqLU8vdC0hvqvx1g4IDHSPk42Z4p2_d7EKYKbO1QGSpJw_SFYz6_y5hGQKoAnKwc8DDFCS0LDMaFiqDcACg=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios1);

        aventaccesorios1 = (ImageView)findViewById(R.id.aventaccesorios1);
        Picasso.with(this).load(urlaventaccesorios1).into(aventaccesorios1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios1 = (TextView)findViewById(R.id.txtaventaccesorios1);
        final String stconsulta = txtaventaccesorios1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios1 = (Button)findViewById(R.id.btncompraaventaccesorios1);
        btncompraaventaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios1 = new Intent(aventaccesorios1.this,webview.class);
                btncompraaventaccesorios1.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios1);
            }
        });

    }
}
