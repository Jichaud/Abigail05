package com.abigail05.Ergolastic;

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

public class ergolastic2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraergolasticfaja2;
    Button btnconsulta;
    TextView txtergolasticfaja2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e8e4e9607751c3bce51677f6d7d0b7e9";
    ImageView ergolasticfaja2;
    String urlergolasticfaja2 = "https://lh3.googleusercontent.com/NMHJEbbjvQv7Tr8Ne_D-bbG_-a4PhU3v70Dp4QhLedd5CYqFHUXLgsCW9x23aw-zJBEIGv6dxx2JVmq6DtiXRQAOw7oTQjrrFADyW8ait39qH3CAi-CHGSt8-Ki0m8jcKm03JNEBjX_6om7KitySH682xnxZmqLGiObNp20S6oiQEd53nHzkXVYJ9xgUqcEp8iVNsGVv3Y-O8jnWzXdZvS_Po8LLS7URx2Y0xukUdBU2CTAI-KgJYHGkMlLHHaiNzAZmlpOP_fTNukFusrOSzOi14RDLZ2U3I6U1RmE2jFUsz0rS5gMGJxEsFk3oXxNP-XLq1LC4biUn-HWW_vOjtzKh-JMcCj2ZIz7bIjZt5VRryRlRJ4N06JMDDfSxXjFL-ovQGegIjWfBaEIgaVzD-CtqqUTZXlDu4se1REdBq4BM3OH5H47ScNPI3Cthckk24QJa8LsrCbpQUKx9tJngr5wdvaZuU4ZKTSab0nUoIoBYqVev8obpX7OLxouXonRbh56N958O42fSJTo8AzE_Vyk_SflZ3zz_l9usjYunfbeAzBYCuZlr2Bq36uPSv-p3tdyAeXhmzTbuRi54F6Yn8v6wf824rP18ZGiwgm2cdG99qc2dHg=s600-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ergolastic2);

        ergolasticfaja2 = (ImageView)findViewById(R.id.ergolasticfaja2);
        Picasso.with(this).load(urlergolasticfaja2).into(ergolasticfaja2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(ergolastic2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ergolastic2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtergolasticfaja2 = (TextView)findViewById(R.id.txtergolasticfaja2);
        final String stconsulta = txtergolasticfaja2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(ergolastic2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraergolasticfaja2 = (Button)findViewById(R.id.btncompraergolasticfaja2);
        btncompraergolasticfaja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraergolasticfaja2 = new Intent(ergolastic2.this,webview.class);
                btncompraergolasticfaja2.putExtra("string", urlcombo);
                startActivity(btncompraergolasticfaja2);
            }
        });

    }
}
