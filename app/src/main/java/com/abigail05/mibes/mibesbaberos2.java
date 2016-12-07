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

public class mibesbaberos2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesbaberos2;
    Button btnconsulta;
    TextView txtmibesbaberos2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6d4d19f6c47717a60bdf691a4fba0b0d";
    ImageView mibesbaberos2;
    String urlmibesbaberos2 = "https://lh3.googleusercontent.com/hD1tchqxhH7UumndUspTp_ZZPCOM1dBiHEAZ4RqXV8uP3ZhnuNlOVDZnZe-HB_b9XcKCTMQkAWEaEREJbqZPC0_xKSv_gnK21r8M4hqlDlFGrByr2IqVou1vNQ3TzN4MfIreuG8Y9RR_gdBewqOVJTkRh888dAA7oT6bl03viH5ptu3z8mo-_Y6_OdYNrmEaW_1YqHzi2Yo497cZcYcBbpCj0tiw2RZE7KAdvvUP4XlTbLk78l7SwD3gFzPRVFR1UUZHZE3g0RSW_NUzydWIxj3ifF30rGlIPbcwZzF7zo8PtcKmq3nb8zdFWpUBl-8Cdpkd5cTJx-8k_zuD9i8PrIKsQ5QYzjLOiuEd4E11SpQRL2us6h2ibVh1etxmCSBJ5olvV4amQhmrhNAMmIMymmn9kR0H4z9ujt1LFqxjSNTSgNnP4ercqmpuMeIOsuOGbsNx58pZt7qsPnvlIMGWE0I9sQFW4vSV5fpaZmH4zSPmURWzQAZOp098LQlrG8Xg0y5evKSrpsyry-mXXcUvasJokbKEC2Y-xu3IScfqRN8-lT7baxmCHosQGY8N5h4-OVshaQTDEYOmDHpJZI38c_z-C5iibvXZ4RuF5OXwDxN5x42ICiSaXcI1HrzRB3uWVgKihGJofKpInp8UlFPpeJlk_otHjvrxbiuTacImfWM=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos2);

        mibesbaberos2 = (ImageView)findViewById(R.id.mibesbaberos2);
        Picasso.with(this).load(urlmibesbaberos2).into(mibesbaberos2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesbaberos2 = (TextView)findViewById(R.id.txtmibesbaberos2);
        final String stconsulta = txtmibesbaberos2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesbaberos2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesbaberos2 = (Button)findViewById(R.id.btncompramibesbaberos2);
        btncompramibesbaberos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesbaberos2 = new Intent(mibesbaberos2.this,webview.class);
                btncompramibesbaberos2.putExtra("string", urlcombo);
                startActivity(btncompramibesbaberos2);
            }
        });

    }
}
