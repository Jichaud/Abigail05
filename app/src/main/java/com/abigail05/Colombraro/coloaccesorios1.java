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

public class coloaccesorios1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompracoloaccesorios1;
    Button btnconsulta;
    TextView txtcoloaccesorios1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4f41d2747fe1f5d8ced5b687fb545274";
    ImageView coloaccesorios1;
    String urlcoloaccesorios1 = "https://lh3.googleusercontent.com/WmZ3pawYDeJwO-SaIc3oERrtb1mXn4ysXUyAA2oXxjGqr6ikg2dq_Q6Bh3A-4zbNa2q5vTwGrz-SjtCmGousbVM0BozBHpp5g2ZXye3jrx6D9S77j7T44lCdC90w5Gk66iWz6ztigIrNuJ75LIpUTkRv2PtYh0va3i8KbDYOzsWi3BHE35TkApJev7HkJYuECWEmk-4NB0oj7uxeR5aATIJwBLkasbD3jKmaL-n7S81D3tPVdNt9HqXbu5AX1r95g-1ecz9UABahbRP0PU2gZJg5fBnnUxI_Q03cIL10rz4fXbLbtk6GUAWz1fci5MkuRtxIiQElC4nzsifz-BviaGSaAAXh9ZP3jm3jnptFNvmnJSM0izoOStWRbOSeqUHr-BMMxIhLEzpUR6ntdEt114rY1SD0yehSzkUyMNxSswzmzaXcNu2poy9HFfs43FZzswuC9mITaL48HqISjUJ3tCUTc5K8iDgMWuUY5VCOOM6mnPlssp3jmiJNtu6o6bATcV4mrfj1XcEXUh_68PoTM7lZhGSMNOKiQb_KU3oDMhUv5kbaxxC7vp9GmyADOI3Pd1WWUjj4gGcc6Feq4TQtw2Cv0G4cv0J8IpXKv9W0KniGbT7NUg=s450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloaccesorios1);

        coloaccesorios1 = (ImageView)findViewById(R.id.coloaccesorios1);
        Picasso.with(this).load(urlcoloaccesorios1).into(coloaccesorios1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(coloaccesorios1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(coloaccesorios1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtcoloaccesorios1 = (TextView)findViewById(R.id.txtcoloaccesorios1);
        final String stconsulta = txtcoloaccesorios1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(coloaccesorios1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompracoloaccesorios1 = (Button)findViewById(R.id.btncompracoloaccesorios1);
        btncompracoloaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompracoloaccesorios1 = new Intent(coloaccesorios1.this,webview.class);
                btncompracoloaccesorios1.putExtra("string", urlcombo);
                startActivity(btncompracoloaccesorios1);
            }
        });

    }
}
