package com.abigail05.NUK;

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

public class nukaccesoriosm2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesoriosm2;
    Button btnconsulta;
    TextView txtnukaccesoriosm2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=58b947e1008ca38b929f5b34be1d6cb0";
    ImageView nukaccesoriosm2;
    String urlnukaccesoriosm2 = "https://lh3.googleusercontent.com/xzh_fayV7nTgzxt8jtCS8Ktlz2ukVBdmV2gHAMLaS5BDyuD7TpWh8YaWrPwnCZtsJCCr1e_XtYGxmE-HA8tLllZY5eRsZIP2btSfwDWoOmto_a906O5RRrXxooJGPBFGmb2LlYvfVpOIePjGdE23UKsOP5gXsuP2b71idntAiRIKeoICOwAXwPC9TC_ieXUEXTIPpAtR7DDTd29gvNAtY_7RRmlvrq7i8ThLHE9ZN94o0VQQf_lhesAc_triKWdsnO8DSBkWGzP1v3w8jotj8xcB4UdNlnF_4N9Lln2kJhoeI6cFyCQVP2MH0vB3mj0xYC5vhm6cu3BcyWKdwE1AARIdY5SxselQR6swDtK1667H-jlnfDCHU9WRPLY29NK7NXABeHwzU59JgfBKn07xv-3WxnAlsiAGs9RxqE5ba_yqCgY1WRpiHoLap3jecLpYVn_z_3wlJ4gEuXiCijEypFoP-SxbnJby7zW4i2599SRNUgXlp6F9L9bWA79sG1o8Dxqic6gFf6MvFnUFgtSf7acTVrYob6FwzJnzjDejkGTaD465YPUtY_3SMUqwtFJtGdyPvjNbmqXj0ff3swzJJ3_jip9OXvOvLHPBphyY0xrp3d3OKA=w420-h286-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesoriosm2);

        nukaccesoriosm2 = (ImageView)findViewById(R.id.nukaccesoriosm2);
        Picasso.with(this).load(urlnukaccesoriosm2).into(nukaccesoriosm2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesoriosm2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesoriosm2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesoriosm2 = (TextView)findViewById(R.id.txtnukaccesoriosm2);
        final String stconsulta = txtnukaccesoriosm2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesoriosm2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesoriosm2 = (Button)findViewById(R.id.btncompranukaccesoriosm2);
        btncompranukaccesoriosm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesoriosm2 = new Intent(nukaccesoriosm2.this,webview.class);
                btncompranukaccesoriosm2.putExtra("string", urlcombo);
                startActivity(btncompranukaccesoriosm2);
            }
        });

    }
}
