package com.abigail05.NowyBaby;

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

public class nowybaneras1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowybaneras1;
    Button btnconsulta;
    TextView txtnowybaneras1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7b791d8fac0c633de85609148bba67ea";
    ImageView nowybaneras1;
    String urlnowybaneras1 = "https://lh3.googleusercontent.com/JK1OUnwKY8p_TtNf_fIJqE6I9742gYSUm0cFXXLeo9hpcKPVT8x8fq5-3XYP8TcNYd9BwQ02vYjQyxnpvn8lhvRoblMiG465iQZABkvH4HYz9X3213myqUjiKQc9IbvrRAKAOXQ2SGMOP-O-DVmuQYhYlFLlM6EK7u-unCrZfb-lc5OuCHmesYvIGO3OpkAZwza4DCSoF0FlHQsOAasSlrg5xd1Qj2WMK----h5rxUwX_EKu-B6xnECPd97MDkbnXEDlLA1eQpBewhCbGGQoGMOnlShjxAOEIsqQKmkK--E1vrNYD_xG9YbCvUlZId6_uURbGJSLX3H6K10lSnIsAQlDsihdU6fDyYejaEYygTzdMIpMQy4Q0l3m32ZnMT4Jc62BNd3WAxPlUESbfcr9IcDRE97IVWqoPiSi1z8aAA0qEFP-SIf1AFCb_t4tCpYFbfPE1DJTPJ4i7FQ1LmKG06otws93S4xj8Ho7Aa-TnWqaukPFsE77r9Vnb3hWOiJM3fztB_hL0pqJOzVRzziEHarTOduqg5dvP2XIri9FqLpTGWGLwFcXK1b02mUC5BQGQWoBUP4PApkCTsN6k-0RMu2USwyi0D34yAUlFAmz6EwSx4Mr3w=w500-h317-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowybaneras1);

        nowybaneras1 = (ImageView)findViewById(R.id.nowybaneras1);
        Picasso.with(this).load(urlnowybaneras1).into(nowybaneras1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowybaneras1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowybaneras1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowybaneras1 = (TextView)findViewById(R.id.txtnowybaneras1);
        final String stconsulta = txtnowybaneras1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowybaneras1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowybaneras1 = (Button)findViewById(R.id.btncompranowybaneras1);
        btncompranowybaneras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowybaneras1 = new Intent(nowybaneras1.this,webview.class);
                btncompranowybaneras1.putExtra("string", urlcombo);
                startActivity(btncompranowybaneras1);
            }
        });

    }
}
