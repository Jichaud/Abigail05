package com.abigail05.Chicco;

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

public class chiccosilla3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccosilla3;
    Button btnconsulta;
    TextView txtchiccosilla3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=80ca084e8fbdf7083ba40220f912223f";
    ImageView chiccosilla3;
    String urlchiccosilla3 = "https://lh3.googleusercontent.com/vhKS5eaFlpmgkqAH5FKnFPk9QBk3pWvApTgVPZMNBuxAdu3CvSX2_-i7nPhUT9fJ2pbGIhxlkLQNubV1PIIfucvwB48JOvwcvJWcYTuo91BytC-cEYlio0hV6kJIR21Yf9Q8MJYerXSmqG6Wz-KIe4fj-tbpDNSRm4k0UCXLVFkpdW_dSesfg0x9D0vHyWCfGH7lTDpcKmhfwqBJIMF-HTvLAqUDWAk1vHS59ADU_Yw0Q08921SoP7M-gXqUwKMvFyYWajGErhJQySEPxWvVBbLpWKCnktqRNt9u8tMyabhfEIntMYjQojNxUX3Phk3w3NFukrte0DPOXj5eANE4qWlrZmV4bCU263fnPliBxFMHzNgda-o7NagSB1zhbNBMvX8XUxLxLDDj0jp1uALuk4rz44WCAZgTJvBbNW2LI8iD_ybmtiMueOqBdfwf56HuqjBvDqHJCyrz6eGaduFDyp60FcqWhkSkaX-q2UIDKQWz7y_D2hrxrMcgI7p_oXHyjbYwCQg9wCWlLysESTmRu604vEw_jLugfIj9ZbIUKfy4I1nY2l_dHeZU61b_uifXiOZfewnntL0yKITCRe6mU01dmNZSaLZzxTMpYSRdUEXyTUWaUw=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccosilla3);

        chiccosilla3 = (ImageView)findViewById(R.id.chiccosilla3);
        Picasso.with(this).load(urlchiccosilla3).into(chiccosilla3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccosilla3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccosilla3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccosilla3 = (TextView)findViewById(R.id.txtchiccosilla3);
        final String stconsulta = txtchiccosilla3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccosilla3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccosilla3 = (Button)findViewById(R.id.btncomprachiccosilla3);
        btncomprachiccosilla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccosilla3 = new Intent(chiccosilla3.this,webview.class);
                btncomprachiccosilla3.putExtra("string", urlcombo);
                startActivity(btncomprachiccosilla3);
            }
        });

    }
}
