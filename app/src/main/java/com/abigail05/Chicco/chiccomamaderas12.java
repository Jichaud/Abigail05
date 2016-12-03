package com.abigail05.Chicco;

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

public class chiccomamaderas12 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas12;
    Button btnconsulta;
    TextView txtchiccomamaderas12;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c130da95e53441caa3e7456ef0685890";
    ImageView chiccomamaderas12;
    String urlchiccomamaderas12 = "https://lh3.googleusercontent.com/DpJcEh2ghd4w9eWsLsbdb0xFCyNXMN3Rgb2wj8QmRoOz_lF9ez6Hb1aAm8VMSxEz9EJ9RejDse4gedDiD7672X6sjWXVUHYAqNXTFyCRyXp7eC2cBvBq8wUBAvBODKqD79TQI46dg3bAEaxJY4IMf8E1_6NhbzQr7_5BNY51E9CtLL9QCwQPTR1uBwBAdki4DKWDGGbx2X3FRZd0fNWgX2FaVvI4JKiGVZxN_Ey32f4AAPgSEalHtdQSxT5_AiO_Dq2vyQpK2xMvOjElkKXlwaT47HwJHGeLt_C7GAsddoeioHNWtwQD2js4zN1k1xI2QMsnnbtOC8qinPhTlVDgUuIPvcjr1Xz791ZxcRbhAjb0vDhMRTYyx9mxtoxTMCkTA-i5MyJEvvPdga5pzHK8y01ssG9VAi44qknvZ1FhGXYq_ERFeyuMeSTSMlpWJTqprEczNFgr3KND9ZBZAZrtv_ntSfwjp1Ae7itOmvPT_6PT1cYlDeGpDnGoXceaALfYci3UrTWtHapmYy8CTMgHoPi7EOQOpwJU5_ATiCurK8on5ksbQ9Y6XnkRcOl7b0K17dYmAii_Rh3QuMptAqvnMiRLpAyRgkR0kwGdobnOvtjdU9wWMg=w424-h423-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas12);

        chiccomamaderas12 = (ImageView)findViewById(R.id.chiccomamaderas12);
        Picasso.with(this).load(urlchiccomamaderas12).into(chiccomamaderas12);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas12.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas12.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas12 = (TextView)findViewById(R.id.txtchiccomamaderas12);
        final String stconsulta = txtchiccomamaderas12.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas12.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas12 = (Button)findViewById(R.id.btncomprachiccomamaderas12);
        btncomprachiccomamaderas12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas12 = new Intent(chiccomamaderas12.this,webview.class);
                btncomprachiccomamaderas12.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas12);
            }
        });

    }
}
