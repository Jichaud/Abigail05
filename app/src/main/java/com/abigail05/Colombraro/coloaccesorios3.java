package com.abigail05.Colombraro;

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

public class coloaccesorios3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompracoloaccesorios3;
    Button btnconsulta;
    TextView txtcoloaccesorios3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d5eca7fdfc136d41ac2a9d3abf6c37ea";
    ImageView coloaccesorios3;
    String urlcoloaccesorios3 = "https://lh3.googleusercontent.com/ITzRTTAuVtCYvBJ5qCeWQuQ9CJYFxdMBr65Yn-F-AX8sYe3dLXK6rzmPfy6mTjGEsLznYcbSpwIdgdh363SNhTgnFzat0gmkwHnoWLCI3fyg6AyvRq5eD5yhj8nHvOGMx37p9UlJRkyzuG8ZwyCHOHYujHPiSmMiNkm83FxF2aHlDqHps49sTQIcopmiCrY8bdnRepOEE1kRWyOE6o4aDqTx0l_tpI3LZME2beRINAxxnd2Q0gQlUqgT9h3l2eT0JiCwyQpe6UGuQWWf7xo5nli0U_Rtcn3EfCAJceIyU3ENPwEclKUfPgzXzVkkJxNDNO0h19fUBK26odbbMMrCyJM7c8MhIamn4ULIi4zHdvlOQiFjBiU1Cjye-nsXvppynlDd2_U5emL5eVZ0qmQTQr9H3-TG9Rmugxcmnsva2XiPHW6prlxRs5BrsnDtM0Z0UaxA8_ULvIDejU-9tia2FG5WvWruy8Wt_kRMm2kcubPhJXhwn4nvPRTby-EgilfO-XCNGs3TbZZp-eDjrI1PY15Ys5fFZmb8WX0NWXdUT1pOv0gf_f5UlYgL24E9bMMpvelrypW9eKDDEe5C0O2cjYeEXE8Bs7K2o9dkcRUjnqK-hN_9Sg=s450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloaccesorios3);

        coloaccesorios3 = (ImageView)findViewById(R.id.coloaccesorios3);
        Picasso.with(this).load(urlcoloaccesorios3).into(coloaccesorios3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(coloaccesorios3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(coloaccesorios3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtcoloaccesorios3 = (TextView)findViewById(R.id.txtcoloaccesorios3);
        final String stconsulta = txtcoloaccesorios3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(coloaccesorios3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompracoloaccesorios3 = (Button)findViewById(R.id.btncompracoloaccesorios3);
        btncompracoloaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompracoloaccesorios3 = new Intent(coloaccesorios3.this,webview.class);
                btncompracoloaccesorios3.putExtra("string", urlcombo);
                startActivity(btncompracoloaccesorios3);
            }
        });

    }
}
