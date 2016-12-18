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

public class mibesmoises9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises9;
    Button btnconsulta;
    TextView txtmibesmoises9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e6608849579113223cbdbabe3f68ab76";
    ImageView mibesmoises9;
    String urlmibesmoises9 = "https://lh3.googleusercontent.com/HlHCAiZhfBLqpsqSLqDQVIA0tonreBeDgYbLsN-k13fYmhEscxH5PWvaE5yOW5hdRReLFwMp0zeCsaSPJGQNCwXLL_qzEA0d8fiAt2kKZXm0Q9Td6MMxoEL7-stb9CKacpwguEHKyB67S0_t-l8We9GU1reIsc72_oABLy-vMRU2gHxlWmQ3o9LHqSGsHbDzKcz71XwK8rXHdz56UAJKv2zPAP7qEkrKmN54DHIc8Ic4qbebTiW347uG6KqkiagfPppkGbbFaBdAF7R_oBk-iqImaFb_-WuPfwMJq2_AUXy8XuSKB4q6vpRilAmuGn5rrKf_2ijR85nwST5RJbEAybPUNZ1bnRCTvor0gcpzksVR7l0wMNhNktdEfKWeRyH3E8xO5fc7-JItvWVIBhZpYaFKPX_3C1WR3kHFPiNUyrB_MHqsYf7vT0BlqvOsNW0yZpGC_ymaos8PbZc7JaIXvqhBJJsss2-Ic7qmydZU4pATZxgORTT8YqNGkbTcPmUjMuOMRKj0NuG_geTFwxxHHl9JhnkO7W8-_LgQcEijil5EGgqs4JnrvOblVLat5hQJUbIjoHTAPRCH_YSEhDceIFvxcAiDvdfIwIpocubK5qy1mB1EPlBjqw85nTNUFdUJMOOm9NBGBrf0lZk2qRg8t4bA6bCRcXNB1ohGraKQUiY=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises9);

        mibesmoises9 = (ImageView)findViewById(R.id.mibesmoises9);
        Picasso.with(this).load(urlmibesmoises9).into(mibesmoises9);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises9 = (TextView)findViewById(R.id.txtmibesmoises9);
        final String stconsulta = txtmibesmoises9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises9 = (Button)findViewById(R.id.btncompramibesmoises9);
        btncompramibesmoises9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises9 = new Intent(mibesmoises9.this,webview.class);
                btncompramibesmoises9.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises9);
            }
        });

    }
}
