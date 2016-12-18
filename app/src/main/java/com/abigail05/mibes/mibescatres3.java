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

public class mibescatres3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres3;
    Button btnconsulta;
    TextView txtmibescatres3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f44f4aca1f401fff47913ce71efff5a0#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres3;
    String urlmibescatres3 = "https://lh3.googleusercontent.com/sgN-o-6uxrXYSFQblxsb_DtbZOjqZ10E30bLK3IJqhUgJieIVosAJ2evlNUOKQWfsya2nEBkPIgJJuTDc8RBU4Oq3xAo2btk49p4MXMh_EdJX5CF_Bp-2CL3teC6FsvgLPxjA5CxUtiAejJwv1ICwOFlZbYKJiM6T0w8INf-ldYirObslO4uAEnLTkb0mFzFnLB6hIXcz4ftUFA3aLXc7D0gcwGzjKSuZ2pANSCfwumV_nk1fOShdnls_5sgFhUlCn9HhLje2dxxk0drkDOb-FsW-P8Z2T3hk_m3e8rePJ8lYEkkzlTHIydZoltgmjzM9BVi37Vu7ge23z2eSLYe9rwx_deTu0TUf-1CuCyG_RVVjs76Sur-xMU3Vbwwj1VZD1MdQoOUjuBoWC0KdUbj4ICyLDtqm_jXzQNu0Hz6RhicgyiUaRnwT0D--rcopzng0YJCQ5AJVP5EmP_RkK1GCJz0ymjXEniI9MQVpMOFIcN8GclxeqhGYTn5cfnei0430Dk_22pbRLsmmZUehpTGhfvCnZPQu9oAHb-2OloYH3TUHGpTRVfbZa9hFU41HuNYjYpwlDL3o7AV7nm-MYCw3qLBw1NpftaxWFiMCZvJkBcbtNi0B5NEqknMq_EIVdKr5uo7hfFi0PYjvbs1JY8wVLNuHmpwN_LO-CTqLO2WiDw=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres3);

        mibescatres3 = (ImageView)findViewById(R.id.mibescatres3);
        Picasso.with(this).load(urlmibescatres3).into(mibescatres3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres3 = (TextView)findViewById(R.id.txtmibescatres3);
        final String stconsulta = txtmibescatres3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres3 = (Button)findViewById(R.id.btncompramibescatres3);
        btncompramibescatres3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres3 = new Intent(mibescatres3.this,webview.class);
                btncompramibescatres3.putExtra("string", urlcombo);
                startActivity(btncompramibescatres3);
            }
        });

    }
}
