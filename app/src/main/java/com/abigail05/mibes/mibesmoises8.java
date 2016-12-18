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

public class mibesmoises8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises8;
    Button btnconsulta;
    TextView txtmibesmoises8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0bb30c4b501cb71bafc8cadc221ba1bf";
    ImageView mibesmoises8;
    String urlmibesmoises8 = "https://lh3.googleusercontent.com/nVw-b6BOpLEHqWIZoMb44wescLsx8-BmgUOMwJ3szCZG-AY_zfnkL1NCQBW1GDDp5kBvmtIfMOxaIGpV3LjRcDOFVEUr05VXCiA_m7Zf1D7736I4-FbWuM2o3G-JWEtqBI9oiXHvSfIfpj-YX6hK7OpXq181_JQv5FD56LdVivFXq3UxXCLAEj12Wd8Pl32yZv_I__-8nOuCVV2Y0_23wIYYdiW9_zX5uZK5EFaf2COtJmUJJxR25lsfoEh3dD4979j9NuLN35X7r80dmvXLxt65MPhnDkuKYHUra9MQkaSihm0Pb_bLhA4E288MO40kNKIw6sWdOsvoukzR3YsoSyTBgz8xIgFLbyumFSus-B3jQqIPjTzgN-p5sxmXAsV85P14OGm90chggi-dJcWLdi2cikDYPuswQ3d8w2yKyspqQxi3koyz8smWbbXrUqBF9g-Jpv_YweKuwIPVNHyB425MQJVHzyCc3EjwBZqxBYyPfvoWzvuYqSORZDmGfiMNCKyxiXKDJovawdFt69fcnIm9jk0DKg5r2kBZfa2_QEiIix5HGOmjC0VlkO8gB3coB7bvAX7oKZgWhWWntBK9jkitJasn0BpwCz08cUkMkbh7ux1Q5TYv6FWRu2kkGDj5r9gw0J3jN7oWpQFAhKY_lhCdwatogf4BHBSCaFvGfdQ=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises8);

        mibesmoises8 = (ImageView)findViewById(R.id.mibesmoises8);
        Picasso.with(this).load(urlmibesmoises8).into(mibesmoises8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises8 = (TextView)findViewById(R.id.txtmibesmoises8);
        final String stconsulta = txtmibesmoises8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises8 = (Button)findViewById(R.id.btncompramibesmoises8);
        btncompramibesmoises8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises8 = new Intent(mibesmoises8.this,webview.class);
                btncompramibesmoises8.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises8);
            }
        });

    }
}
