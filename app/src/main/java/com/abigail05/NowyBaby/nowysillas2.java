package com.abigail05.NowyBaby;

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

public class nowysillas2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowysillas2;
    Button btnconsulta;
    TextView txtnowysillas2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=13ff20de31d785ccf894ff800b24d887";
    ImageView nowysillas2;
    String urlnowysillas2 = "https://lh3.googleusercontent.com/bj7qTdBZ1Isa5GWyhdpOWcJqJDyr1OmJg5CAWCf8mDgK29Cc1NKqtOMTGewWd2_FsU0XpVNJXNEXCO3DlxsPZPK8IaqjFt62wgY4MqehTXM5PsKq77lSJQNrWXDJPJ0niVz_beNqfhsDDFIQIYnuGAs2Sia_Dv-S2RroyR_evEniZhk9-HWZYHsd_MoMDTOK5YcwQe0Su_Tg0Ek2H6BKH4dFh20YRWLn0U3lOxo7XSSIjSJPW2Acds7VpZMWhts7QJWJSif5S7EPK29cYvzQNn_BH_zq2JFrxrqur1u0kgG873tzSOxKo9f7Qq4ssHob3mTGAtxGaKFKT5fUVzCKGI7U_oSlDwWeU3O0KtdTo6HcCGS0oBd7tcNpU9QloW5rd7OUlT5rNpfbw2IxFMwOuy59PCG-js7uQo5l_jcM3JcAaiVewvyIpelx0nTqEmB2m9hdWU095s4csm8KXToAvUfL_Ks6n_YcJwLRM__jqRIAZAgzZnOXpGL76mgkTINnz3mH8Gdv_B07uFbfpZpL0JqvfbOqWr5yn_rOIm3y2h3SHZeNP7IYF_UpRnoCtWeqBAqNNTfgZsRnBGDwsoQRVVr0yzLKjndPUM95ZWH4yB55iSVlXA=w632-h464-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowysillas2);

        nowysillas2 = (ImageView)findViewById(R.id.nowysillas2);
        Picasso.with(this).load(urlnowysillas2).into(nowysillas2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowysillas2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowysillas2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowysillas2 = (TextView)findViewById(R.id.txtnowysillas2);
        final String stconsulta = txtnowysillas2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowysillas2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowysillas2 = (Button)findViewById(R.id.btncompranowysillas2);
        btncompranowysillas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowysillas2 = new Intent(nowysillas2.this,webview.class);
                btncompranowysillas2.putExtra("string", urlcombo);
                startActivity(btncompranowysillas2);
            }
        });

    }
}
