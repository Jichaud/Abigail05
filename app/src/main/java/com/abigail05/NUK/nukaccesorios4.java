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

public class nukaccesorios4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukaccesorios4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=74db134b97c9c78812d13e457ad8dec4";
    ImageView nukaccesorios4;
    TextView txtnukaccesorios4;
    String urlnukaccesorios4 = "https://lh3.googleusercontent.com/scVEA7Nn0abXSQi9FUDk46S_7ULAFeOw8vrzqwep4RIw0WH9sZz-4S3tETyYx3PQ6EWv_uW5Bf4gTYuT5gz1xCb8nZSe-9lCpi96_TIQzJU7AwDR69kIjKqojuIY6jkXeN2mfN8vLONtcZHPmvVKs6A7QnyTls4Js8jN_Pe0Gw60dsadF2BJljH7ZzVXsohtry_k4Yeaofqu0tGJdS6qZvD4Dj_OJ1D4c7WvHbZXCM63RCl1UWEYmi70S0g9gdRWObsEC-QHqikGqvyB1phxW9W3AmxVEzTkEUr1uXfzfcka8Ngf2V8kTVEhCW4UTqE7DV8V3HzJbxcXYDhzyaquGyeJd8EHw_3GZsHzJNoeXeSTm91ao-Oe6OjrdWvqyMuhT-Cu8qwxVBn2MCfY5EbbGCC1JD5dg5sMYs5bHZwErfKseCaaCzC7sjWeX7M5gEsGeCIJvHKpAzm_UKEGd_pLmQzRFC-1KGn6XhMsbKzpm_RknOWUJaUSWiPziWB5HCJHlml2QJdQKEgUQoXDqAxPW9QFLouhf1PP04UY-H5J1LECVDgqGHJ_I8eSapUe52dfvYEAtgQgvyuhNuhShrtMl57MISnhGgdK_bS_8m4owRuSlUEICw=s340-no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios4.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukaccesorios4 = (TextView)findViewById(R.id.txtnukaccesorios4);
        final String stconsulta = txtnukaccesorios4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesorios4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios4.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukaccesorios4 = (Button)findViewById(R.id.btncompranukaccesorios4);
        btncompranukaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukaccesorios4 = new Intent(nukaccesorios4.this, webview.class);
                btncompranukaccesorios4.putExtra("string", urlcombo);
                startActivity(btncompranukaccesorios4);
            }
        });

        nukaccesorios4 = (ImageView)findViewById(R.id.nukaccesorios4);
        Picasso.with(this).load(urlnukaccesorios4).into(nukaccesorios4);

    }
}
