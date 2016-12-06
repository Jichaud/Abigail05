package com.abigail05.Gamise;

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

public class gamisebodyml4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodyml4;
    Button btnconsulta;
    TextView txtgamisebodyml4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=955c8bd0e3d2bd0084ef7f13af328558";
    ImageView gamisebodyml4;
    String urlgamisebodyml4 = "https://lh3.googleusercontent.com/IKJRAv0aO0-jK3hymJmNK6-s4wAR2_k5Dar-wyDy9_PfT1TtX5dVoULiA7AnUBBCDSh1tGUQwo7UP1CwiU5JkdERpb7XB2s9LVmmJWb1bfC6X5GiiqJwr6IqW4nDKrmf23JtlUqCC3yDJEW99_X7B8yF8F54r-moCqiJ5BNn3DXx07qvDyev8vihVUSBL3kJSP54plEFAmjdHN1KHORn0OAkw3X6LdTJ2pYr7lTM96Omyenyo2iPXRBhi6n6vzobxnQNq0yYiGG-Visoun2S_5LSzxcSLK-IXOtAmR0-9Oz1NDuCXUsfksXLS5OL3MQ8hEZqtZ5QQcRRZaZuesdUpfT86l87lu2pIpRCvyKoZXumbodJAckM3zfPg3wNBGoAeL9VkAhtL6Vcp5kxFZdJyjqJfecJIrqkVCMe9LMbtzTmEeYqhEzHmquc18FLUgo54r8IANlAJIpH0jVNaL1sPfSpecA5BRzy510KQfdYlHCnNhG5QWcMy3C3MsC8RjsULGgjohzNbvn9fBedyA4_2_KyO3wpQAPf1b46pCiromdBQg8be44Zn8mZ8H4sS6jQtzuiglWgm9butqg78FXmIXJuOK5N0xmlOJHjA59lG5qxiIRLqKu5cntNd3uT-Pl0fRrOv4z143keaJho2CkKvDXptgAWhBKniP9k2pMeAoY=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodyml4);

        gamisebodyml4 = (ImageView)findViewById(R.id.gamisebodyml4);
        Picasso.with(this).load(urlgamisebodyml4).into(gamisebodyml4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodyml4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodyml4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodyml4 = (TextView)findViewById(R.id.txtgamisebodyml4);
        final String stconsulta = txtgamisebodyml4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodyml4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodyml4 = (Button)findViewById(R.id.btncompragamisebodyml4);
        btncompragamisebodyml4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodyml4 = new Intent(gamisebodyml4.this,webview.class);
                btncompragamisebodyml4.putExtra("string", urlcombo);
                startActivity(btncompragamisebodyml4);
            }
        });

    }
}
