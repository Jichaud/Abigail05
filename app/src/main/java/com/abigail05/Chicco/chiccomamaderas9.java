package com.abigail05.Chicco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventaccesorios9;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class chiccomamaderas9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas9;
    Button btnconsulta;
    TextView txtchiccomamaderas9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0bd393d865ec9e08e6e570c802cc93e6";
    ImageView chiccomamaderas9;
    String urlchiccomamaderas9 = "https://lh3.googleusercontent.com/iBy4SrbGH7eCWH5Bp0WEPIPj4aila-R6SokZI6QuLYNKm0ctz3TxdIBV74ejpyvJWZTh74tRYFqITxcpd_Ti8MNX-Ip7Rx10nqAQUsW3PhtRqIAuiDNllLGrc-iusK2z6A4KjU9Uh-BPFKQ8k_LnnVyPi6jACd8RfhuRZF5CRbIfyO9HrioTxMCPF8LhPf2vFRRWT9AOe0Rw9OBLbPoc6_3effwpTdv-69qqlXDzghu7w5y_3DMcgQbjRIYi0sB5N5ZECmapgOrNeaB2LiIxAURH5YS_y1Um3FZbhuY-eFX8FYq3sN3WWT059jgf6TVZEsF14syB_HAWWsYkwaYfnJicWE2oJhluITFBcAoFF1aFr8n26SGDeIpfaXl8NRCdZVr60OwKvB3d_kwaTjnWs9lSDmQXv3vpdcB1e6W4JhdKb22rZ0pw0M3qgCPSTu-uHFtnfnJRQmhsPT92UZisu-TX9po1oomSCzRRYJHJgzwA-dQM-gWKCRTA0N19VzRuO16c7h3gMvgYfRPNL0SEzmXvGOlSs5lF7qBqXJOJkzqAGFU-plb5_yIo0iYohTFeegoqa09w6FiPjAlmCQgW7Emt9nwyyNRtD28yq2OKl1uiMOlMXQ=s426-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas9);

        chiccomamaderas9 = (ImageView)findViewById(R.id.chiccomamaderas9);
        Picasso.with(this).load(urlchiccomamaderas9).into(chiccomamaderas9);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas9 = (TextView)findViewById(R.id.txtchiccomamaderas9);
        final String stconsulta = txtchiccomamaderas9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas9 = (Button)findViewById(R.id.btncomprachiccomamaderas9);
        btncomprachiccomamaderas9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas9 = new Intent(chiccomamaderas9.this,webview.class);
                btncomprachiccomamaderas9.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas9);
            }
        });

    }
}
