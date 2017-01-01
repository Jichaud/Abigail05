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

public class chiccojuguetes18 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes18;
    Button btnconsulta;
    TextView txtchiccojuguetes18;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=fc5fa688bdcf73e8eca1d2c50c36220e#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes18;
    String urlchiccojuguetes18 = "https://lh3.googleusercontent.com/jlsYcHjgQGp73YEFTExve3ZWnkZWQLVrxd4X3HGpIO_l1QPhr_NPdEb3rJ_AHuG9JllM_5MgmTiF1ldglDxhy7gPduzIP_8b7X03feqganvzJMzxy8HUFJtfP11o6eH2mJ0mwRqwhOzcHw4qgD71f8fM1aP8SCbmihhaChbql179wtW2SL5zr54ecf9F1R3mnWJwLhvFr5lR3mYO5N2Ot5LFSZZSubld7D8TXfOI8vnTpoFylDxLSxR7Nhj2BXr27wfuz9RCB5yho2dyA1gGWOV_Abn5sufVV8vKoaBoQoYYWbB61Cr_tCBYKcH_mIWIq4b7vtnjqJ3OjSLz_Bgw-A9UhWZQH3UuN-UuZhz1EU6p82ryqH-RStN1Bx4mf0VN51tCPwPh3OsBbElN3lHcg9tu8-cMCQy9hI-YXe2Y6R-fZJyeDgfCL1K61Ev13VVl9LgLGDbsBpE5qr84MY3bt5q9JJuUMdpYftdlA6_rJuL7AS7TNPcE8BvDPtdCfmqXYSWkBZqL0jags3OYSswAf3OHhKIWueLryZRPTasG4FKbQ3oq22saexqoC2OMfyrySU2wCUCfbjHSrh3BVv-MqPPsOSYE-4OcE2SvZT1aRWpdPo2W02AAz3e-hhLsCQiQQafIpdvmCF7PO82f-u4ji6vwSUmJWkPwJ5EIOds6mf8=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes18);

        chiccojuguetes18 = (ImageView)findViewById(R.id.chiccojuguetes18);
        Picasso.with(this).load(urlchiccojuguetes18).into(chiccojuguetes18);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes18.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes18.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes18 = (TextView)findViewById(R.id.txtchiccojuguetes18);
        final String stconsulta = txtchiccojuguetes18.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes18.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes18 = (Button)findViewById(R.id.btncomprachiccojuguetes18);
        btncomprachiccojuguetes18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes18 = new Intent(chiccojuguetes18.this,webview.class);
                btncomprachiccojuguetes18.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes18);
            }
        });

    }
}
