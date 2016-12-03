package com.abigail05.NUK;

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

public class nukaccesoriosm3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesoriosm3;
    Button btnconsulta;
    TextView txtnukaccesoriosm3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6fc54a705cd7da049b54b7170a6c47f7";
    ImageView nukaccesoriosm3;
    String urlnukaccesoriosm3 = "https://lh3.googleusercontent.com/Rm3G0XctpbdImj8tN6T_pOFAYY-nlq1nS2pVnJkkJMKXt3AJeO5G4ouEYQdbJ0RSnJ_1DI8Ro38RyzCgOEsYLV5z0kjIVi02uTjAO6XWf6OeLK7pBJppFfMbatQsh-yi1OVQ7qnybM-WEKOII0pzVlgxuf4w6BQyieGFPI2Q-NNOp58W6AeVk5p8D-6rxsicrw65lwGNrzqaN79wNC24LgM60XZ0mkc-q7RZwczdtn-YX7d1kapD0Oyyn22UbpQ0OzAeZlTFVJQ-yH5jtlNazR7j8ArlkW3uZbTtGgZBdhNslA1qmgsofu3saDLcgSGOnVusU8Pkx8n5EwFbQ17oiSyo8Ka7Rj6C8Yrxf9ChftpHPXs2gG-fSFLGozPav2IIkebxqopvEuGUXV3xcAdyGa58QyiwgsYFjdtThmF8FPn68jvOyndun9tmfr1J-LJ8wW7JLmb2Yye7UyNYYHcUrdCgRFrZqxTyd1qOq9eNu3wjp2O9HpNRrIuj-wEB-R94yiRhU4cgO5sdqdf70-XCMqTO1ZuC_GfqH63JA7Cp3Tc9K3uYBiHUtQ9rcS-jasBQ7656TEp_7UXtuoRm10rBp4AKV0a7sV577M1yk57BTNhSdrAUUQ=w274-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesoriosm3);

        nukaccesoriosm3 = (ImageView)findViewById(R.id.nukaccesoriosm3);
        Picasso.with(this).load(urlnukaccesoriosm3).into(nukaccesoriosm3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesoriosm3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesoriosm3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesoriosm3 = (TextView)findViewById(R.id.txtnukaccesoriosm3);
        final String stconsulta = txtnukaccesoriosm3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesoriosm3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesoriosm3 = (Button)findViewById(R.id.btncompranukaccesoriosm3);
        btncompranukaccesoriosm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesoriosm3 = new Intent(nukaccesoriosm3.this,webview.class);
                btncompranukaccesoriosm3.putExtra("string", urlcombo);
                startActivity(btncompranukaccesoriosm3);
            }
        });

    }
}
