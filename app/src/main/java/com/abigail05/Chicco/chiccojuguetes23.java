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

public class chiccojuguetes23 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes23;
    Button btnconsulta;
    TextView txtchiccojuguetes23;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e0376bb6ddc16b878a78cd6d57e417f6#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes23;
    String urlchiccojuguetes23 = "https://lh3.googleusercontent.com/Iu4JV4G0KaUEt_OrS6iRUCsPOl0iOtfrw_tjg5nbfsD98FtjggmK3oc-k4uy1y6JegJHdJUe6kEKiBWIH0HyJ0wczy9HOKSothUx-tPA2unWvEU2t4hBfvpW-Ngu1iEri5rIRf2wDJf1KEx_qHf5rjoem9sCEZghsOK8oqpkX-7GXySv1W9ce5f5amxMr4wtid1A6aG9lWo9_ZUxwdLsYo3e7j_eEIIWQtvKK7aoFrR7PHdxxWM6moFQDq7QXXSo-291yeOVVmi1jEtu071hGvBjK0MlVN93awKNCAr7uCAXHoop38ofxiL_6tNpt5vGJhPkvyT_oMgy3YDs0JQv02gCmRO23cpuDZe8wOlSTixT23-uJJGdlQ3IStmTOLKY6JKBcnJPFVlOdNNwz6nuvxEnd3S_9YI8oVkFU9uZJgTT4Lm0mLfNbYCuQTaaNpSeC03T78otc2nrQtFX30pQzwL4dDmiX2_qejcQzGkKmM-BkQZ8E61QZeuXbVVz6C1jVH1I-xoNlqPET15hyGC0LVEhi-5ddFyOwYewoouZB3chADzKSOjQlw4HWKFxTOyjBYDnw5FFvnbovUThzzTeY8pYlB2Wvp7O-fapRtfpl5CWz0rdTk7SkkZIhT7somdUmq0CIudE4Hetqw06nzrO9SortSRUuTZH0n7IOs20NCA=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes23);

        chiccojuguetes23 = (ImageView)findViewById(R.id.chiccojuguetes23);
        Picasso.with(this).load(urlchiccojuguetes23).into(chiccojuguetes23);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes23.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes23.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes23 = (TextView)findViewById(R.id.txtchiccojuguetes23);
        final String stconsulta = txtchiccojuguetes23.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes23.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes23 = (Button)findViewById(R.id.btncomprachiccojuguetes23);
        btncomprachiccojuguetes23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes23 = new Intent(chiccojuguetes23.this,webview.class);
                btncomprachiccojuguetes23.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes23);
            }
        });

    }
}
