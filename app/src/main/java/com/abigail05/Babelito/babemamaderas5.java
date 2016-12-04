package com.abigail05.Babelito;

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

public class babemamaderas5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas5;
    Button btnconsulta;
    TextView txtbabemamaderas5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=17918e2f4330c8b230ad5f81d86decb9";
    ImageView babemamaderas5;
    String urlbabemamaderas5 = "https://lh3.googleusercontent.com/SVKixR-1F0-OpvjfboAxesDLXG3fcR9WlrWh06e7QjJCKkNgI1PDoNEuR1DHou1cSBJY7LxXYoc1RHYIjCxv6WKU_HHysnO3VPObO7djBxxe1HY-I_Nq1vCC-Q1yak4aXVgSIzw_JaaIUUKiX44Re1QVlMet5gorwCVWKuV3EGMouF3oPspzcrojP0DOswHkNbMa6Oi81Lsogu5QP4UboTCKtSk0VcHBkoHkrqmXO1Zt8Rrvq0kU4q52d89fbKAOE-IY7Q8FDkkfVhfBmjFyAgM3jUVo9KMPoc5c1hjboznHCZShYI0DbutHa1LizkGRjSOKcCyR3J-_gNt0pxg-oyCibowADAJIkr6aLN1svix62XsbNrCX5C5ETHO6Bq02OOx59o3kRpC-my1zWZwDuKWTjbi8z8FwsYLHTA1eD4CZI5NOw84bEVLz_jugz5sdAGUy0wSMwJ7NSpbiGGHUDogvAqxJfbaqDE_Honf6Op__Ij1hqdBeess6J7NsdV_iRB147nl7-vS_Ubc3hjE2yX1s9AeicL9PTKCi8QDVfgUviTA_tVRc8FFT3K_ismQa1D_YgGUTVitOCMbCmsO6jUfymig_c8bxHQ-GxdEjNYN4ujSlLg=w232-h300-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas5);

        babemamaderas5 = (ImageView)findViewById(R.id.babemamaderas5);
        Picasso.with(this).load(urlbabemamaderas5).into(babemamaderas5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabemamaderas5 = (TextView)findViewById(R.id.txtbabemamaderas5);
        final String stconsulta = txtbabemamaderas5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babemamaderas5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababemamaderas5 = (Button)findViewById(R.id.btncomprababemamaderas5);
        btncomprababemamaderas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas5 = new Intent(babemamaderas5.this,webview.class);
                btncomprababemamaderas5.putExtra("string", urlcombo);
                startActivity(btncomprababemamaderas5);
            }
        });

    }
}
