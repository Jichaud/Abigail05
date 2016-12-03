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

public class chiccomamaderas7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas7;
    Button btnconsulta;
    TextView txtchiccomamaderas7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3f176ccb8cc4972cd9de23dd503fbf01";
    ImageView chiccomamaderas7;
    String urlchiccomamaderas7 = "https://lh3.googleusercontent.com/zRjrakoAfbDwZC3loPAq_RLl2EkF9WF-JEQhZhv1lLUVsquPKZUtcpCEpPS0-NGQ9zzoysm4Lgw3M21hYaNB9oeOjvKy6UG1PyTsByirh-LKEZS4fyhoDOWG1EOwiJg8tP3jEIrmvjpK4jautA-tIAxN_GH9Ra-GRTUzN_0OESxWXAkSybM26Ipqw-7SgNcb2My4ViN33CrVxUcuWgpmSeyTNU7G8s9JZUyuUKaM498hEU5G_8v7zwdQe-bpJ0mxpWhsJ7zi5TOfcsXIyBewXkJQg3Puy2BfafYskVTDZ8VPaTl-G3CSopmelpSoAf8uzrLqZ3reyiS8pYuxQKasY98_77bz89si-dLMlXlkf4AYapG1yJCa1kOKYrSrdHJkDp5cuWTRmSP3usFuVViMTf-AvZ2tUdziiJ9OyB5nKYHjqWhCIyA0jyASAfHC2IaRCGZA7r69ykcMIxEUkSmCepYkKWsiuuyQvDvRk07tEy6LwXfjp_4S1cyNGWVQCutrWNJDMasJGC4jQ5Cuvd5PiMnJSwz23IFbAr6nL5vbQFWU7MazDK8Dct5cVAnBp1kvUaVDltpRsV-q5jZ0_Udus1lE08un4Lb9krCD5IEwFCvlb7JEAA=w250-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas7);

        chiccomamaderas7 = (ImageView)findViewById(R.id.chiccomamaderas7);
        Picasso.with(this).load(urlchiccomamaderas7).into(chiccomamaderas7);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas7 = (TextView)findViewById(R.id.txtchiccomamaderas7);
        final String stconsulta = txtchiccomamaderas7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas7 = (Button)findViewById(R.id.btncomprachiccomamaderas7);
        btncomprachiccomamaderas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas7 = new Intent(chiccomamaderas7.this,webview.class);
                btncomprachiccomamaderas7.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas7);
            }
        });

    }
}
