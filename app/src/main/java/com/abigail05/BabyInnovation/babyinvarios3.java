package com.abigail05.BabyInnovation;

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

public class babyinvarios3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios3;
    Button btnconsulta;
    TextView txtbabyinvarios3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e110c5ef4782bd1e35deae91197fbef1";
    ImageView babyinvarios3;
    String urlbabyinvarios3 = "https://lh3.googleusercontent.com/0HYmWPGbEQQgdFuQlSZbLoYS97bD8NExw7v67Oe9GEQWRUKOsRbXYimTEdlw2fQ3eW1uE-_BItc1bOdABlTv-MW-qSOpLAKa-yo9mp5HAV1CD7MJ3eXSK0WyYH2WPaOtyxFPaQX4gbD8zbckSRmSgXU3TzVK41lAPnWyig7c1quqpSh0H0zsJ_645rS2q2y-wyfi8HjdP_DOcibOj_eQjdafJbSGKFKRX08b7J3O79XGq4k7lfpLcJMEJyVjoW0q_bYKGnwlYXb3bi8LE3WHIdIqUtmNGVee5vuiMewv4ilLAqIAkZuisD5LlxPavQa9jhFlxjVMep1n1x-so17nPo-6E1QSK0HPG1FmEE7U5EwzZdQpbQW4CIJMA6w9lKJR3x05mW2T7A_6h8ItTE957kUHjpFoqQWZNa3nNXM4WkUlLGNrXZ_fJ2dYKeyM1ZoPNY8kTpcckKUvwJxnoTkEr2QWDk-16A87iok4msbtWA-apP_F0t5f9OGwteBY1kcLXOufMjbUnVBBPLzpAsZZxwVDUkV38wf5ZyErmBdJTjjTxKbrbrAbUFiTJ7quh2Zq1L2F4_O61SdGdc-xDnYRcPTw-KdJo0VGXOamAjuFw3kZS25gzg=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios3);

        babyinvarios3 = (ImageView)findViewById(R.id.babyinvarios3);
        Picasso.with(this).load(urlbabyinvarios3).into(babyinvarios3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios3 = (TextView)findViewById(R.id.txtbabyinvarios3);
        final String stconsulta = txtbabyinvarios3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios3 = (Button)findViewById(R.id.btncomprababyinvarios3);
        btncomprababyinvarios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios3 = new Intent(babyinvarios3.this,webview.class);
                btncomprababyinvarios3.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios3);
            }
        });

    }
}
