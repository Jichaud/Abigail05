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

public class chiccojuguetes5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes5;
    Button btnconsulta;
    TextView txtchiccojuguetes5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5662bd5f5b710f518e70e179a6038272#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes5;
    String urlchiccojuguetes5 = "https://lh3.googleusercontent.com/KUh2JFW5c6IUhbBgeDmglGTjXgr28yfFr3SVCBJGlpfNyPZTdtkVXN0vME57c_97S7StpFvXpbqVJnW67JnJfREjeVMrL_biHtPvJRWu0Qxil2tNeWy77qGzgcuUxpNoSLFJjoxSu09R3Lh4JU7j4df9RBBLJAXB2VIL7d9-PlBW_KBvEdcgeyPoMjXZ6I43YAKlHYjj3DIfoFKZFU5jc-eQvm70rc5V-eEIM-dM1g48OM8TEnwrj_sPj1-On2XsjignSpUFUP-OcaSe4xTXb5HtDAQN4A1TXp5SshwwgoZBJvQWTct6tHtxgU_7HwVWzYS930MRhWAm1XeD3ESgtaC8mb9oB0nEsBjLCEp7YPtbRgk0KQlrykeaKhPPJVq_OkJusOwyTnon_AaWtVCuPP6FmGE0EwICCnxxD4dhGjsNx-sZ4TOASslwhf7SCyVMDB3RVMQiC0bI_Etz9vIQw5FE4h4DvFSV727S9gPqVJkwxIggeOUlIU1iBD8-st-JDoQ7skb78r_1BNc8deWWkH33z9gUE4OBiDF3aNruRimQK0yGacbPTQwyk0yx-RDTFck_a-mWND2v1VHcGsxMH1UGqDymisYFyYNG_gn9OKfCbqFtopnXTCy77mLIc3OrCm_9UuvakBJbbYSm0uZr8JA8b5DPVd4wdSqz1cblLec=s400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes5);

        chiccojuguetes5 = (ImageView)findViewById(R.id.chiccojuguetes5);
        Picasso.with(this).load(urlchiccojuguetes5).into(chiccojuguetes5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes5 = (TextView)findViewById(R.id.txtchiccojuguetes5);
        final String stconsulta = txtchiccojuguetes5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes5 = (Button)findViewById(R.id.btncomprachiccojuguetes5);
        btncomprachiccojuguetes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes5 = new Intent(chiccojuguetes5.this,webview.class);
                btncomprachiccojuguetes5.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes5);
            }
        });

    }
}
