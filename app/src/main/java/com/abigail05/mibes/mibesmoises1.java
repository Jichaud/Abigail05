package com.abigail05.mibes;

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

public class mibesmoises1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises1;
    Button btnconsulta;
    TextView txtmibesmoises1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=198089087116bc0c18d3c3ef5b574ec2";
    ImageView mibesmoises1;
    String urlmibesmoises1 = "https://lh3.googleusercontent.com/qWj54wp2luJNnfGVnbN3Ea_F6of1OIRO5s1CxTMcLChcQiZI3i4g5BBq8yb-M9xn2XBA5UwHdE0mS1tfbaSzXdPLDKT7EX3gtCr8cocZ5cb5mR12CaDzRCrmirVOSyvTotgc51hPTmxk0Jraf-jWUHrINqdAjQueTpPEGXFBHN6yS7hdpmdc5NEa8PlRq85WsF8Dh3nqabggBvNhl96OKfjA2VoCiUk3TXatMaGwSvquF2ogd0o5ecHsXE65o7PDAvsUUThFOaA6qURhXXg9HXjB05zj5kKRQVEcOSycpkkcA8Zw9MOtp_35WY5x-njKPBCCpUlylYNsyKy9IBYLJw216_WPCTa03c65zziJAXCx5fQ84Dqsk4RsRKkp5Iai3XNxQGkNVJleCuZFUrCnq37DB2fQEfJqwD1Y90Ij6i34bgZz6XQBfADP8jlfMci25pdTH0UgbkAmSrbHf6jKMMum9xjHuHqBbw_TdydiBYtFhJZXEGUz75dD4Y9a-ATv6GlskVz088ZC_nIoGN4Ik1qnl11129NRd69J4ObRPHDW9woBrTx9eUcnpS8sB876DWZK6bUeAHIW-92GnS6tvjOoH5i_tW840_STnNvgvs67s3TXbZBfoNnSTKlbd2DWCtY6qZT1JxT9Cl9Z8mWmoS9VdOVXpso2yC1J_iBjmwM=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises1);

        mibesmoises1 = (ImageView)findViewById(R.id.mibesmoises1);
        Picasso.with(this).load(urlmibesmoises1).into(mibesmoises1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises1 = (TextView)findViewById(R.id.txtmibesmoises1);
        final String stconsulta = txtmibesmoises1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises1 = (Button)findViewById(R.id.btncompramibesmoises1);
        btncompramibesmoises1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises1 = new Intent(mibesmoises1.this,webview.class);
                btncompramibesmoises1.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises1);
            }
        });

    }
}
