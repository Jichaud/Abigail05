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

public class gamiseconj4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamiseconj4;
    Button btnconsulta;
    TextView txtgamiseconj4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=797b1cf70c01286b19d8ed2e72f3f685";
    ImageView gamiseconj4;
    String urlgamiseconj4 = "https://lh3.googleusercontent.com/wc68e3441u_ZgqBCcUYkf95wlPqDmaBz8UKgN6iQnRSshZE2_opy9COmLDTMQUGxEnsitkR4KVhP5WBsKblKyvxxuPiybVsq1fOrNa_1Lr8O6EwsDshA67PCQUNDkypMsbvqYS3-4adztTodW8Zm9E45fPdTttDQgFhVnbZVVo0Un80CO_sdQ_qX7HzXFEHX0Y8cBEbFRun-GHGvndKhf7x_nw4smC0aKDo2yIVzOHMat7rTx4GYnxBS2bKVV_p6OCCOVKH9Sk7al3UeEA4PfbgeDhsTCnbYOc1KLDuJ0Jll9SH1QdncOwls7FspXyOOynx6gicB84pTWUn7avohifRmV5rhL6JWg1fmdjXvA1GbmZ_2PDMV5RD_H44RM-BOY3TMtzqQ9Sm9irMuU45mAqeOCU7srF2xKcVLfC5zxGxrziaOlHX89o6YXEuDrvRRBKiP9FMcYzKy9CpfrK5ufyIPrb0Ycb-p_0x3dlYFjAehussqkiRB69DI4Zxs4VKLRayquBSkL_bOe7HYGZCzytI7SoH12WA_cDdk4s9gPbMV8zWl8MGwKPOjqBlSnaMl63vDA99acA1JWNgxyhPsehF_0DrXKzTuBeXJRhNRGUR76ByTlfDJTnH6UScGCOOGYavA7lJq--XYAZf00rY5WEWU726GEmiLEbi7ErW1wC0=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamiseconj4);

        gamiseconj4 = (ImageView)findViewById(R.id.gamiseconj4);
        Picasso.with(this).load(urlgamiseconj4).into(gamiseconj4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamiseconj4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamiseconj4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamiseconj4 = (TextView)findViewById(R.id.txtgamiseconj4);
        final String stconsulta = txtgamiseconj4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamiseconj4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamiseconj4 = (Button)findViewById(R.id.btncompragamiseconj4);
        btncompragamiseconj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamiseconj4 = new Intent(gamiseconj4.this,webview.class);
                btncompragamiseconj4.putExtra("string", urlcombo);
                startActivity(btncompragamiseconj4);
            }
        });

    }
}
