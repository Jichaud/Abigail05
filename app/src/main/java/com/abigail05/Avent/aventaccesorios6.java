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

public class aventaccesorios6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios6;
    Button btnconsulta;
    TextView txtaventaccesorios6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c7f3c017947efcd1569ab4b5984046f8";
    ImageView aventaccesorios6;
    String urlaventaccesorios6 = "https://lh3.googleusercontent.com/-6KyloQNPj3aCDANthx4NKivmMue0A6p76Md3KMXnkKCgpDEdbQOOqk-8neZj-60Lczrw1FiXL6dNCE6AuP3h-hFgZM4L_rvyGQfI6ormf8d9cQApWBHG_FvxT_ZoEe7PDz73yogUhpHBYK0dwJAv_pgcmfnz-UZT6FGlQKXRVOwoP7N5aGnjE-W6p3PzeqlRenE0-id03_X_1xfCfIhRtupwneCB-ASqMOk0wznzwQzn38dn2-5bScqDC2rXsljoG5K3zAYJ_jE72TAcKkBo3631OxCx_eBhLmeaTNcJa1MIuUpimTVvgJjia2E-l2pKT9JDZXenUJPCdjJaiqirUYR3UcnSeotZrI9PP-TIVe3E023vGEWkG49T0sdTDNPsDzK2cf3q3ED45a_8O-zpb0q88bu2h7bEgCJWVY2gVSdHdMNOI8Fqn3b0EMTApTRnRw0QNbmZRDFBFT1jPXQ-lF1EzltGkyo6xpPLkMhirpwkC5Zp0IcSkcJaErGXrMA4lxJoAOsrLyx7OCLHxcogb1KWHxW_8MNJ4yb6pIpEg9GvlB2rkJhtnwMFe_xPDXUEBmY6fjnaQ4UbzG7XkpC7sldUUWWy_Y68jtEQVhvb9t3BKKK1Q=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios6);

        aventaccesorios6 = (ImageView)findViewById(R.id.aventaccesorios6);
        Picasso.with(this).load(urlaventaccesorios6).into(aventaccesorios6);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios6 = (TextView)findViewById(R.id.txtaventaccesorios6);
        final String stconsulta = txtaventaccesorios6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios6 = (Button)findViewById(R.id.btncompraaventaccesorios6);
        btncompraaventaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios6 = new Intent(aventaccesorios6.this,webview.class);
                btncompraaventaccesorios6.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios6);
            }
        });

    }
}
