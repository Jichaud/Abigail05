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

public class mibes1 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompramibes1;
    Button btnconsulta;
    TextView txtmibes1desc;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ea77810ea709eee5b1de76df0a4ca5cf";
    ImageView mibes1;
    String urlmibes1 = "https://lh3.googleusercontent.com/-DSKLh-hHAGnzlAkWyO5lEf2DRTUw-YhhGU9IymbIourye2rYqTQfpfnhJeoqSehWFFBthXgOgk=w432-h360-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibes1);

        mibes1 = (ImageView)findViewById(R.id.mibes1);
        Picasso.with(this).load(urlmibes1).into(mibes1);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibes1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibes1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibes1desc = (TextView)findViewById(R.id.txtmibes1desc);
        final String stconsulta = txtmibes1desc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibes1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibes1 = (Button)findViewById(R.id.btncompramibes1);
        btncompramibes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibes1 = new Intent(mibes1.this,webview.class);
                btncompramibes1.putExtra("string", urlcombo);
                startActivity(btncompramibes1);
            }
        });


    }
}
