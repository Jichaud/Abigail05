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

public class chiccojuguetes7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes7;
    Button btnconsulta;
    TextView txtchiccojuguetes7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c57a7c1548976f9364e2cc9df3791935#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes7;
    String urlchiccojuguetes7 = "https://lh3.googleusercontent.com/XIPlAE3UrhH13lQA0hiHNwFQzB_82L8Dekf2HtKx5hzXkUAk0QHuhKqfuB3w79ZRJU9s4SJ-L14_RmkmmEP8LvjAfK1p9CEC22kYsW1mVnlnbp6hT7S02HT0EAi1vymT3vMx9W67YQ6tybcQwTWzjt_hQL_9aGwmRrnDhfZCOagt796W1y-fxd2kdWrx9Si_rDCIqKPqn_r8fZLk6Jul57QX8LIHS1-EtnJKezoCiK-fuiZgTx-314a9foHqNtrJaomw9KGh_KQY3Y1v9nVOIjiVELo4gQxQdVDM2DXvW_WAtviLXXFjB4FLzjvf5386HUfTr65Wbg-VRsKuRyAGnsmTb0FdEFaKwzeq6nHHQjk7Kpf7o49m5WN_EjBvxPKvRH84RRr8yue5m36dh8yAIs-gIstk9OOiXTt2ZTVVcA8IldqmuxcnmBwEwcfEZob87coC3ySjF1La4WhvsSkMqCw8jNgm2PVyJnKReiXIAxiS6BGqyZS11FmxoWKnmuAnSYWQeihGWXLhqd71t0rbEVTjqzvzmHkj5o6Pwbshq_1qhAnb0RAvByvSOHnnyFdF1PFW-s_wlLgYVLC00HA28b00BBJ4IFXkMcnExsp_4HG6c1-fGCL1DDrcSc8R_wq0ytdnwg1SVfSwTGW7_Ks66uFwynxiSStYAyunEJEHwd8=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes7);

        chiccojuguetes7 = (ImageView)findViewById(R.id.chiccojuguetes7);
        Picasso.with(this).load(urlchiccojuguetes7).into(chiccojuguetes7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes7 = (TextView)findViewById(R.id.txtchiccojuguetes7);
        final String stconsulta = txtchiccojuguetes7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes7 = (Button)findViewById(R.id.btncomprachiccojuguetes7);
        btncomprachiccojuguetes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes7 = new Intent(chiccojuguetes7.this,webview.class);
                btncomprachiccojuguetes7.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes7);
            }
        });

    }
}
