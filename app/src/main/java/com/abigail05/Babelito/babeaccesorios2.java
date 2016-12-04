package com.abigail05.Babelito;

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

public class babeaccesorios2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios2;
    Button btnconsulta;
    TextView txtbabeaccesorios2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=786af8f59094171e8d52126369df8079";
    ImageView babeaccesorios2;
    String urlbabeaccesorios2 = "https://lh3.googleusercontent.com/ww0v8XAWCcL9BC4cZmljMJcBmbx2ZhI3eIOUIy6V81YctmOYJfGunZBl4DxegrfOo1mqRwpG6KVbkavznxI-rL_W6Qp6-30zGT-hYmmTH9qbxAOlRoYrX5ct7lGiMEORmo_JiYIziQ46OLyS9ukY63qmbBdRNaeH4UuCsG7Y7ZkXBB2jDCZtAvl6iGDheY4FD2YIQVuA2Y_OOSTTZZtYnJ4SyBJAmjCY_IW1yS1fet_cVnYiSbOip-jUs-1e4sSWBEz8C-XugIwhDwhgNGkqmFkNspTC0HNTHv4NUZnH8t2jCppSMhRZHdX2Rx1_GIenqi3OO68cqW_pn5klpui1y9h67jqin65V37aa9w44q8RxGfgiwPTgosS3UnVv2koAlxOC3dMomiohHwp116s1BOH0FmEZT0ouLCaYSiWmVNUT5bNbEgNd6dYdc3V06wUfmbCq9FRpip9uBaw7WWwkryAMBl6yNYB43YlQ_BXU1yrXv-misbUj9th5x6k8YpDC7Y_h2Wt4YPKIHjwvDu5Wu6ncO6jRL5haptrprVTgobAb6hJMA91uY3t3l9qW7mhY4TQ1OAg8zR2CRg9pG7zpIdF903MuTg5AGodiW6Ci_h8dZ2U0Ow=w360-h356-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios2);

        babeaccesorios2 = (ImageView)findViewById(R.id.babeaccesorios2);
        Picasso.with(this).load(urlbabeaccesorios2).into(babeaccesorios2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios2 = (TextView)findViewById(R.id.txtbabeaccesorios2);
        final String stconsulta = txtbabeaccesorios2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios2 = (Button)findViewById(R.id.btncomprababeaccesorios2);
        btncomprababeaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios2 = new Intent(babeaccesorios2.this,webview.class);
                btncomprababeaccesorios2.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios2);
            }
        });

    }
}
