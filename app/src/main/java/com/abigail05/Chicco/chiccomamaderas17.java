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

public class chiccomamaderas17 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas17;
    Button btnconsulta;
    TextView txtchiccomamaderas17;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d05b32fd707e18e374fe785c7c7b126e";
    ImageView chiccomamaderas17;
    String urlchiccomamaderas17 = "https://lh3.googleusercontent.com/P4UngwI4DYYkemlUxbCMTZGj7nmX67i-DjC3vcz9RBUcqZl47q8tTQjKPQNdURbF7m_IrBihymDPkDNi85NDzIkgDkTJAp4HNvN217KI5O9bdZfQ1tk88rzqprqFnbQBovU1VaNfnNqJe_SOTFG5bSKu4u4tHP6SgOanNeJlfYaEhTmzAjHPOgCa6Ee7yQAkV_jb_kOhw3dWL7sPWIr-gRR2kDUIjBv4cKxe3YSyyyKsrkn8v7BzDobYggWFqlQhrDCg5PW711FlDB3U9fWVwAoMGhjAIM-_m3wap3oRZpMi1Q5W3D9NZZzRcKxa0IlISg-WmsBlV56QvK-pgp0UsK8PDLfW6wUzoXOXlZiNStWSSkbm9J72DVxZfagwrNhZQqqBNjajz7euBzTjp4sEeg7qPIAWmAJodof8MXXC0vRnR4zosvy4CZV8AbAMcnd34t4BnBVej0DdtbmHpgq8LoDN7rOcMWpOCYPZvUUrrv9QAgpVt8EjDh9ejrOnvWo6PzObVhre7IkGtNSio9cgILXik4NFjzIhQC8vKE3wHxRq5Msqi7xaSeUhOfEllcWipOG0JSFKHRPX-uOsdTcmy5GTDnXB8BCV2kPtNuNB_1J0usKq1A=w428-h456-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas17);

        chiccomamaderas17 = (ImageView)findViewById(R.id.chiccomamaderas17);
        Picasso.with(this).load(urlchiccomamaderas17).into(chiccomamaderas17);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas17.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas17.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas17 = (TextView)findViewById(R.id.txtchiccomamaderas17);
        final String stconsulta = txtchiccomamaderas17.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas17.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas17 = (Button)findViewById(R.id.btncomprachiccomamaderas17);
        btncomprachiccomamaderas17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas17 = new Intent(chiccomamaderas17.this,webview.class);
                btncomprachiccomamaderas17.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas17);
            }
        });

    }
}
