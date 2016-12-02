package com.abigail05.NUK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nukaccesoriosm4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesoriosm4;
    Button btnconsulta;
    TextView txtnukaccesoriosm4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=51fc53b57171bc141562d81c9e204952";
    ImageView nukaccesoriosm4;
    String urlnukaccesoriosm4 = "https://lh3.googleusercontent.com/pwDV5B7ycHiSFkGgQfRKgUqPnyz86shQfgW7K5no1BeepQYYNiLs5ItZgBvQmGoOcwUr1KoZdM3RrohHESrXq_47pwoyOJ9cs80HjB5QWNIzKF0gM1Wx_ohY-sf0zZWvlAGv4UPcdoO2f2UpVt4NpIMgwgGjIBFmgeL-vAg7dE2RItZTjE45n_3AP5JmMm3XCLKxeeAQAA3df5VlyzMM2Fx0utVEUejKfUIhiDWaDQPjUtqyzyjr5EGWKU3vN04US0xTYoF96MfFSfsUEgjTTRR_7z9yC1mrVHzN41vvqMSoRTl-GP4MnGkusLPx6vKKabvmslKyPNZ2le4dqNsn9rv7-m8zI9FJR8FydxueGFPAtaxMK5Fz7dvizyE9OCdEOAvZy4vJ3x1lfh8DH_d91oaOpTpmvyT2VeluVPlTOsUCGYvCBoVpShjhPvCvFm64PK64adLNwsbMJij4isde6I4rjPj7jgULgdhJsk8UJARdecMSzSBq1oOyc8NLAQZ_YihqZ-SRfIF4Cb_5rbx1t80Som1DOHox4g5nxNH3s7QnoBefq7pyDnkgA9xpfi-R7tWvsgKAXiIUoNhsgkfq0koClh2KsQi-MyAUPeQNrDchecORhg=w236-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesoriosm4);

        nukaccesoriosm4 = (ImageView)findViewById(R.id.nukaccesoriosm4);
        Picasso.with(this).load(urlnukaccesoriosm4).into(nukaccesoriosm4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesoriosm4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesoriosm4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesoriosm4 = (TextView)findViewById(R.id.txtnukaccesoriosm4);
        final String stconsulta = txtnukaccesoriosm4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesoriosm4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesoriosm4 = (Button)findViewById(R.id.btncompranukaccesoriosm4);
        btncompranukaccesoriosm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesoriosm4 = new Intent(nukaccesoriosm4.this,webview.class);
                btncompranukaccesoriosm4.putExtra("string", urlcombo);
                startActivity(btncompranukaccesoriosm4);
            }
        });

    }
}
