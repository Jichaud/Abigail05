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

public class nukaccesorios2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesorios2;
    Button btnconsulta;
    TextView txtnukaccesorios2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5364330b949bab4cbc1cd21e556a1326";
    ImageView nukaccesorios2;
    String urlnukaccesorios2 = "https://lh3.googleusercontent.com/19zp7AAgWbNSkvuE7Mho72RhyXUOFGXE5Lit5D8iWtRZJPghcaI0ScIp2ZIobEr7sUhANyt66Y3d7fIECBrnRdebrYve2ze4GxZvWzL1vfbKLP5OCdeoBIO2L9NtSGnqWJeP64WAWtYNrgmHld_dZ4EijZ4cFmi9caEh8cEEinLPEDTKkcSzAGqdFu06Bqd20vgm9veEiMP3upVOGQgYBPjlJ_xNcENMeUqX_y_RiOF3KM2Q6N2JkQbmNldXGywwNgVhpHVOUXzceCmvJdpge-ALzwvOoaew0H4oQcq6o61GmHSlcpwOspBb5kCYr2sreHhJ62SkR3oHeJxkLsZUy0njQJouq-J8e9gG9pMR65YBCkEpSMQV_Zp_nUyVl-ihvvOkbz-pR2G1aahOInM7roekWhJY2SXUOVmJTjjDusxbY9NW3-U7YJO0yCE8IF7L35RKw8l02oQ8EVxSebiqLjoW1bEInJfEZDImcTIjxI6I2ttl4tek9udU1aulY62XK_2caOH3SNxLcO61XGqORWeYpJWyAYfi6neZdkN553WcPW4QzqdOC2HgXtxtF8P5B1e_QP2mhQ_bnnfSqtElsNZCeYaaHcl7K3OvbDpEyhf9Qm8log=w312-h300-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios2);

        nukaccesorios2 = (ImageView)findViewById(R.id.nukaccesorios2);
        Picasso.with(this).load(urlnukaccesorios2).into(nukaccesorios2);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesorios2 = (TextView)findViewById(R.id.txtnukaccesorios2);
        final String stconsulta = txtnukaccesorios2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesorios2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesorios2 = (Button)findViewById(R.id.btncompranukaccesorios2);
        btncompranukaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesorios2 = new Intent(nukaccesorios2.this,webview.class);
                btncompranukaccesorios2.putExtra("string", urlcombo);
                startActivity(btncompranukaccesorios2);
            }
        });

    }
}
