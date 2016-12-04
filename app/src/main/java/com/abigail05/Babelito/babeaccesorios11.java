package com.abigail05.Babelito;

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

public class babeaccesorios11 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios11;
    Button btnconsulta;
    TextView txtbabeaccesorios11;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b6f2559e744b229ffad469e9b24915a1";
    ImageView babeaccesorios11;
    String urlbabeaccesorios11 = "https://lh3.googleusercontent.com/tPD5mTrcfAKlFNjn8S-0KS3NDIkqUTWnEYcrNTkGKWk44NiXGZlAfuz_eM-zkHfZ-m-aA_4XDNSSKTuU0Y0W69dIYN4af9e-Lcw37r9S8OHG3RInld9bqPFeIGf-5h36DLSO7_5PQyIlSsoiCrkqnZVJ012IbglGDUaXI1RHDmaOMnR7gML7J50JJMzWTsWsgfAIohn2gCB6-BMYRALbzEKSNVBVoypvKX1O0pNIUbZC7JmAyekYRTuTT3pnwrPPeQHLrivGaLU_YD-vIdh62Eq5ZeKlJiDqX5o9mEYdvt3Rho83g7Gn072qEALyG8p_ke76wTeH4P8O-lu3LNoDLWFuVRAUPawPH7HNhKo8RSkuzcXDKOwfDk-hk76S_LY1XlEBHuSUCwOCGlIzSQo3rlIkd9Mw52nh3-9-Um4SqhF3QuKQMwnzN1ypSOJwL3lbwrMK0da4v6A1PGv2wzJrAxVPmKs0qLLNZiVW0u2XYmvOCxySPg8GhCkMd2B4iqopzOgV_-V60EN6zdQfPOPktI_oXcz8kdwzD5hSu_qP7-Ab66mGAtI-vPXja71EG-t8KkXqpJ5rrIIo1o8YB5FB48yJgumDUQGTatoE5by0R9HHV0v5kQ=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios11);

        babeaccesorios11 = (ImageView)findViewById(R.id.babeaccesorios11);
        Picasso.with(this).load(urlbabeaccesorios11).into(babeaccesorios11);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios11.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios11.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios11 = (TextView)findViewById(R.id.txtbabeaccesorios11);
        final String stconsulta = txtbabeaccesorios11.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios11.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios11 = (Button)findViewById(R.id.btncomprababeaccesorios11);
        btncomprababeaccesorios11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios11 = new Intent(babeaccesorios11.this,webview.class);
                btncomprababeaccesorios11.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios11);
            }
        });

    }
}
