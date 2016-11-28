package com.abigail05.Avent;

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

public class aventclassic5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventclassic5;
    Button btnconsulta;
    TextView txtaventclassic5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c5aa1627adc10907066315ac053e3ddc";
    ImageView aventclassic5;
    String urlaventclassic5 = "https://lh3.googleusercontent.com/BEEkwBYGeX9-oiutgWc9xK6RlybMweeXE6jjaNRbd-eAIO7U2eTK1_Y5QeoQGxCv5e2JzGZm5JBAxvm19d1pi96VwBuVn_TpG1XvKT4s-0TyUiGrRaOzaUFMBa2vUNV7exTZOsjY3NMJdJZKvpsPvMgwf9kmGozY1qc6135En0oKf9q7feBTnurBKg1bhFBd0K4_bciLs6YHOaJqCe43Exf2lxBnttkGaWajaJFlwBPrqBr7hHutRShNVmH7WcKiOnWGsfZwi-c8OqQU0DZmxD66qD0CksIaOTCybclP6VT8_l8emy_rgl3FEsQ0mjyjer1CEvw76IDGmGmHypV3QeMqFvTm-pWES3fpL6_cKa-JmqUom30H1W_2lhC_CARqUP_RtlbcLYzKuP_gqATjgPQCLzR-M27OG9GHIihJdrIEXDloX0g83zNL826NMvUqglOxTZUOkZHJZyQBTKsvxHhfZXsihY4kV_jUY-4-_TwOhsaK47vtIQ0_OlFbwq-I8FAzftxftllUzy7xgAKlzmDbgooJYxcO7zCtrMQqkL6JJwCi7RApx50fZxWFjNVocs7En0rVarzOktj5OqZCQW_RcNRW340XpzD8vJipzDM-Oo5rBA=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic5);

        aventclassic5 = (ImageView)findViewById(R.id.aventclassic5);
        Picasso.with(this).load(urlaventclassic5).into(aventclassic5);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventclassic5 = (TextView)findViewById(R.id.txtaventclassic5);
        final String stconsulta = txtaventclassic5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventclassic5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventclassic5 = (Button)findViewById(R.id.btncompraaventclassic5);
        btncompraaventclassic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic5 = new Intent(aventclassic5.this,webview.class);
                btncompraaventclassic5.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic5);
            }
        });

    }
}
