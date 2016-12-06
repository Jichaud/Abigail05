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

public class gamiseconj2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamiseconj2;
    Button btnconsulta;
    TextView txtgamiseconj2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1f2aa2402485291f92142eb05b5703db";
    ImageView gamiseconj2;
    String urlgamiseconj2 = "https://lh3.googleusercontent.com/l4-7WxZqOR2_uxOsCkFej_NRgBudV9GNMhMZT3mY7vTnIYM_ShtpSKQIrUVzKntDA6S_6AV7LwfFLC4_8HGxKsJwOjHJezdmFO_vq52pzI4duGrpEz9mVBUoiRHWZbnt9y1Uh48Ip62oBdHLiFNmFYcqnVhBS3xQ-3bKimo8JGanDVEZlOTJzKya1bYKD_PzqeL0uO4GEs9nCKuyvdf6s5rZsZtd6_U8WCYbQne0fiWwQOHVVCmII25vr9kaMrxGDZVmn9vt0yEIm8O3xuKtu2sucJu-VZZ4ZnsGxWik_9MARKTdiI-kbUzGFMzn22QAZbM9k2Azw44Ac249zSQY3hYfF2InvR54bCBrMp07dphipGKvq79HzPVb2tcwNRlEjG0ANECydwVjjbRcUTsPu93kb4R2ENKEgL1z8hocBgn2dD-Hqk9TsbmHiv-eAm-MRxWmel6df_vzvutcjd-0_MeV_B0W0zbkQTyb9_NLNL_Skd1aIpg-8lVZuyYm8w3vdEK932xbVmd_VSvEapya0sTv8TnqHQcscO8NQ24laCn5wZxM8foqDDLXAwCOIcAhhEOKQ5PLUtEB_TiIopdLTZ1AfwKQa_SIgRor78zFoJKGivKpGb1dJXawsZpinV_GX-wREu9Wt4yBh4PIVrP2SO0xCwE2C1KftIyz5F4Tdfo=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamiseconj2);

        gamiseconj2 = (ImageView)findViewById(R.id.gamiseconj2);
        Picasso.with(this).load(urlgamiseconj2).into(gamiseconj2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamiseconj2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamiseconj2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamiseconj2 = (TextView)findViewById(R.id.txtgamiseconj2);
        final String stconsulta = txtgamiseconj2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamiseconj2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamiseconj2 = (Button)findViewById(R.id.btncompragamiseconj2);
        btncompragamiseconj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamiseconj2 = new Intent(gamiseconj2.this,webview.class);
                btncompragamiseconj2.putExtra("string", urlcombo);
                startActivity(btncompragamiseconj2);
            }
        });

    }
}
