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

public class chiccohigiene4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene4;
    Button btnconsulta;
    TextView txtchiccohigiene4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f7e5018b467f5c3f192c5a97162ec6f7";
    ImageView chiccohigiene4;
    String urlchiccohigiene4 = "https://lh3.googleusercontent.com/4EY9mUy_Wgtn2d4Tekj7b5wH65ptqMdMZ-s0qeVMt3RpPkNDJ6JabrpTBQ2vXtAbVPe3bETNHIGzT2VwMtaJI9q4TsNZ_Yv1zgbiQSu29OexarRJ4tam7wcs7pZFhVVdEqVOk8vTKXvefnCWmAE_CL7KG6m2Kvx0r5S1ARwCRYIs-CzKr4_JvIPSUnOSi6LaDXZKToOr3WiJBKkYlN4Ti1Smf89EPTXj6qIlIABG6kDR3H30q0Q5DdTFddUYNFdZMaFQEW5dFE6EYYmJs26-wOrtsr6Y9W5nOe___Qyro5qMuuQh0mLs-iwJ7DzYXj34W1wmgJRFoZTz_86o8JW-HQ6TiPZXxeaxTGTuL0ceBNpHRPCKNZaOHoMO8F04Ts075e2OkXJP1YKKl6CB4C2oiO06MgyL2BHMInpsdv3KQMtxxsY5mCdWySBVE0iS75wdujXS9aQhNT4JrrMFRh6UygmFQDHBXj_5xgg1YXhpTFI8pTWq5vhVfbrjgNrKCJE0HfTMPnRrXKdF6NqtieLH33kx7bU65idMT_u7RsdSyRrPy5k8rSbphxFQulDz5cBdnGNkSinPWbRgi-PCilyAKow8H48ISC1X_HPdv-EBPody4rpvKw=s400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene4);

        chiccohigiene4 = (ImageView)findViewById(R.id.chiccohigiene4);
        Picasso.with(this).load(urlchiccohigiene4).into(chiccohigiene4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene4 = (TextView)findViewById(R.id.txtchiccohigiene4);
        final String stconsulta = txtchiccohigiene4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene4 = (Button)findViewById(R.id.btncomprachiccohigiene4);
        btncomprachiccohigiene4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene4 = new Intent(chiccohigiene4.this,webview.class);
                btncomprachiccohigiene4.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene4);
            }
        });

    }
}
