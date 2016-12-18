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

public class mibescatres10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres10;
    Button btnconsulta;
    TextView txtmibescatres10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9acc8ac0a53aec1f0f0f2b853a40b5ab#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres10;
    String urlmibescatres10 = "https://lh3.googleusercontent.com/_ppj3EKjESH40zzOBWkGQJNDwxvb2zXjZDR__cQo15dfqKzBfPFOg5larGdMbtDQgMo85t5EZYehJrcmDZR_AgXWjYM_I98GIr5FuGMQgg_6Qm9ciNKsGuZGtfvfWMEv-xlaPgwAeFItNgcDwao9TMb84Jna2FJxQD5BE_WLCSomlxTM-2MEgOnOIUAhtZYlUQRud2sCXcAMmKhshzQuoar2TNpzIUG9RdzcdZpTHayZSiUvb4uMfc7G657Aj5V8dJ96jRPHW1U3CMqKHl16LLqsw9NEpOmnMij6wJqouT0fgF_GmGa7qsQtoq-Sjw6B2h0lAT9OVeLdZ9RhS1sxhZCx3tmlcT_GHn1JtjzAnm6ZSpUaxxvSOZX7VE3tcfVLOjoOvtTLGzyBriZXtNs-m5bnABX3LekMQRr8peo1YrlR5-GDQ9-hXRZ7dfQvzIuOZ7bFbtzeI4Mo7p8HmwFCXuY_q8oMs0uoiCnT4tybLozPDOHm3N2ZL2-Ied1fyLT-wEd0mb66wS8bwgsSPSJuS7tYRR0YwL5tX4kqcdn7ehhf26xCHL933jc5HdpbJDtKKdpfqRDbFFEnmp5ENrkLackTRhaT0KuQLS92Uwtmkri5owU48L4FdprnJLwL_fMqoqmUwiycdgs2l7NF_rREaqtb-Ks8QDwqdF66zH6I5sw=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres10);

        mibescatres10 = (ImageView)findViewById(R.id.mibescatres10);
        Picasso.with(this).load(urlmibescatres10).into(mibescatres10);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres10 = (TextView)findViewById(R.id.txtmibescatres10);
        final String stconsulta = txtmibescatres10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres10 = (Button)findViewById(R.id.btncompramibescatres10);
        btncompramibescatres10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres10 = new Intent(mibescatres10.this,webview.class);
                btncompramibescatres10.putExtra("string", urlcombo);
                startActivity(btncompramibescatres10);
            }
        });

    }
}
