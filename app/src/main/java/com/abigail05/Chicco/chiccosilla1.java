package com.abigail05.Chicco;

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

public class chiccosilla1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccosilla1;
    Button btnconsulta;
    TextView txtchiccosilla1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dc8e0e7f706a32b1ec845fae43f4d75e";
    ImageView chiccosilla1;
    String urlchiccosilla1 = "https://lh3.googleusercontent.com/mLJVb0kVJpgpxIS-kq9IdtGETI3BJ5DPlgMAqh34kfGWBhpKb44mF3NL6cl1OC1rubxmQdW-f-N2TYkRMO68ZaGYQhug-JDp_2N2m1kCSJ8w_ndoHs1qRoMYINvSXRq5oS48OSj4GvEH73ueltpp6njF1X-4HC7ql48hlOLaJ41kLZttaBnAOW8A6PrtQuK8C21O5All48_P27eaflXgkNBJaN5XZgefwcp5hEWjdY2UMYfLXJzxB6SzT_bYO0CwK6vg-ebu0Q3NzpYVcPLVpC_NOElJFY3MEmtwOOJKGcPOA0aWNJwXBH820fJnsHG1aFU2l5q45MonmkDQruziX5nwb6d8pcmKRt2-OYGC79scnSYoO3kVOwgmDyycGa3fmY4vR5z5AtCb7SrToOLuugImZJSHJrTvnEXbiNCGrVjyqPyhFqbZ1oyFb0KP-Oi2sBP9OLrGobfIm9e1td25MXw4x3144IdlaTCrpxStvQUlOc-Iq49U7PkAHj0Ws0roaV1Qu4E7JwESt0vBnmcFw8tqMPueMOQsc3kvovS5lTdXRcsuspDAVRHYyjxS8ZysSphZaZ334tlEKchn9E9UFhiJTndbhN2_CDMWlch2E76L74ctgg=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccosilla1);

        chiccosilla1 = (ImageView)findViewById(R.id.chiccosilla1);
        Picasso.with(this).load(urlchiccosilla1).into(chiccosilla1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccosilla1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccosilla1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccosilla1 = (TextView)findViewById(R.id.txtchiccosilla1);
        final String stconsulta = txtchiccosilla1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccosilla1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccosilla1 = (Button)findViewById(R.id.btncomprachiccosilla1);
        btncomprachiccosilla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccosilla1 = new Intent(chiccosilla1.this,webview.class);
                btncomprachiccosilla1.putExtra("string", urlcombo);
                startActivity(btncomprachiccosilla1);
            }
        });

    }
}
