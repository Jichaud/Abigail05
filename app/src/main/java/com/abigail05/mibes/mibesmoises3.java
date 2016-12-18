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

public class mibesmoises3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises3;
    Button btnconsulta;
    TextView txtmibesmoises3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e13fde36b9d069a3a384fce225dbdae7";
    ImageView mibesmoises3;
    String urlmibesmoises3 = "https://lh3.googleusercontent.com/aq21D-UFzk1z1PGqC-TiL7RZ4tepTi3caP3D_5O9NqKNhNEyIR2l-WAxoudXaL41nPSFL-w6SAAs3JY5XUv9o1LmnV7S1EiReMnG1XuW6Ov5IJP1Dciqxur67YH0IGnsLHzNBPHlZA_pK-9IotpMdKaccnGvA6BOJF-F8UAS6Etn29Bd25dTkHu_gHoV5zJNdNuEL230OA8wY9EXwwWHCjhCGoER3d94hJ8ySI5QEunCsoUI1Mx8VGPjPxc8FKbi-g3Ka9vpIjwPrfgBK24U20nvM9CNPGthYdh4N1ty5Y1TQAFpgyJhGYnr7bfHyfF8GtCezJ1JNN0braWLEw-6fCrgF4MwBFTmeZLlpChyGmoSdQTRutXp3Pn1SP3yHrMssGXt5mmRL-6L5_Zn8A_qnRHF_4HOm1dwpy-n8xIUmuMVaO6tQ5nA_XCCRA3jt7zJOgeS8TZDG4wklMc3VKJR29GdyLSHprHBZQtvjKjA2dmKJpKOyMXgjkPcEKAbbqxlb8uyvUHkWMYnKRkuZfx9M9x29O_A2DqB-f8NXRFH8BNax6ZjI4bbkYyJGF_5yLMMSsHrcpQNyp4SzXvTFowsIG-4UWXwHLOVF2vJoprCYfgKitFZvOPiGq_4q0j6ifp6rqr315TigQCtBf-enkFCaR2bmkwI3Q9YbsceCZk_9so=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises3);

        mibesmoises3 = (ImageView)findViewById(R.id.mibesmoises3);
        Picasso.with(this).load(urlmibesmoises3).into(mibesmoises3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises3 = (TextView)findViewById(R.id.txtmibesmoises3);
        final String stconsulta = txtmibesmoises3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises3 = (Button)findViewById(R.id.btncompramibesmoises3);
        btncompramibesmoises3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises3 = new Intent(mibesmoises3.this,webview.class);
                btncompramibesmoises3.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises3);
            }
        });

    }
}
