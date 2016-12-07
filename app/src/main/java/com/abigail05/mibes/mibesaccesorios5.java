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

public class mibesaccesorios5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesaccesorios5;
    Button btnconsulta;
    TextView txtmibesaccesorios5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d4f6aea9441e7a91370be20b4f984106";
    ImageView mibesaccesorios5;
    String urlmibesaccesorios5 = "https://lh3.googleusercontent.com/d8_jCOJf7o4vQ8Oacq-DufpGKwT7J0os09z83YUEYC1MiJEGdHEJWimTFHqglMto0b6QtyhW-3AWdZRjPkuITxxxBgFS2JPUJ4AjNC00q0k7uzJ8i6PYZTEpkEmQQOWAHA-xR2JlaUXodnQinICgf2vd6vEcvmJDXt4XiOc3AIxc0qPZbgh_L0umJAqDAB0lidkXf19UjaKMiiK62FI9YSQ370Sjm6ptLOJOCMKdgFq04wngEbqpitWFWox24nqyAsXgXrkGamS_Usxp-jtQTws5WUB76WzLk_S2BQtK2IdLEaFUx0-LVrgySbv5LHwXZ9pkoIVgtmj2sJ-qOIx7ZpGEBR36N_gtkDDcRX69YfAzwjRZwC3i2d06qaRBH6FR5jgRDt18iyVJuZ7CGFPhs-fDfVv3XPbS2aHOV5fq3EOuen0YB3pH3CzqSrv-gho3CP_OUR2jk1E44469RWxD1l3I4iKSOA-cJDbVb21pVXGmvh9CzfCfQMMebllhNP1pcsuftZ6F-900FfDBfBqZYrHoFM3zIS7McnCijSasa10T9FW2B-jkEv4bwAg2j3n3imEiRiRZGpTAGMGHZBv-0qEeilLa8vwLgDzQUx7H7sPfvJUyKpUB4tVCLYB4YwVVUtEwPawNk3UNWpQkT0zSoBcX_WQdkfYI3NPu84Iod7E=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesaccesorios5);

        mibesaccesorios5 = (ImageView)findViewById(R.id.mibesaccesorios5);
        Picasso.with(this).load(urlmibesaccesorios5).into(mibesaccesorios5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesaccesorios5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesaccesorios5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesaccesorios5 = (TextView)findViewById(R.id.txtmibesaccesorios5);
        final String stconsulta = txtmibesaccesorios5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesaccesorios5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesaccesorios5 = (Button)findViewById(R.id.btncompramibesaccesorios5);
        btncompramibesaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesaccesorios5 = new Intent(mibesaccesorios5.this,webview.class);
                btncompramibesaccesorios5.putExtra("string", urlcombo);
                startActivity(btncompramibesaccesorios5);
            }
        });

    }
}
