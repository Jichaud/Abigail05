package com.abigail05.BabyInnovation;

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

public class babyinvarios12 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios12;
    Button btnconsulta;
    TextView txtbabyinvarios12;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=169e5a774711788657e4668c86924bea#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios12;
    String urlbabyinvarios12 = "https://lh3.googleusercontent.com/5t3OKtiilkz4pm5QVSbLm6oYLJJSgPWPI3vpBIByIFDf3SSaeydaY11GtGONMFC_nVQcDu_-ialnfjY3tS-MGfAFVbhxnOsQRf1PkYOqPcG1X0cODtlmkHrEzsXKKh9xfobvzcnQbSCaEwcECZQ17Sil0EmpeKK6o2afuVn6TQDHOhUWKWvqn6a-EwaA6RjUx_5SWI59aRkGBOvRuruSDgIT00rxvm26De20zGNGWwbud60xUHrZqVJ8FMWp1B9q9zPXITNS8J2RyJwG3hBkGlIe4jSvh2sD9wIVUuUUdWPSJzaTlUO4yESpeepcyL0LchoBX6GrLFiF7_C-aE0T__fXgPU4cRt8_xCg11hWF8Qo37EwiZihcCAO5PxcymnCA-WqP1XaPJg4Yh70_W-L4FpagR9G8lq6zlC2cnXP07p2m38KYnm2zlUtWL7mq8hSpPv6qfo5bWbHa6PCGqbbJC01xw-E79Emx5kk0x8nWtSorF6K_sxNRIP1BRj6ZEIoRjhsx5cjqMZVKepVdIHDhP8oUmXSjhp1ETjoj1JZjJC56ejVPbPfe5uBjdz3iYhGTrvJUWhfCXdESoQx500t4l094ZvQ7-WPzlWh4SqabTC_iURDTrO-yAMoCIa99nTzMBRYiPynCblf0m1AGSuhTyj8o1WNVQJNQPpNuQTwCb8=w328-h332-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios12);

        babyinvarios12 = (ImageView)findViewById(R.id.babyinvarios12);
        Picasso.with(this).load(urlbabyinvarios12).into(babyinvarios12);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios12.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios12.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios12 = (TextView)findViewById(R.id.txtbabyinvarios12);
        final String stconsulta = txtbabyinvarios12.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios12.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios12 = (Button)findViewById(R.id.btncomprababyinvarios12);
        btncomprababyinvarios12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios12 = new Intent(babyinvarios12.this,webview.class);
                btncomprababyinvarios12.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios12);
            }
        });

    }
}
