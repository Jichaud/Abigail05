package com.abigail05.Avent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class aventnatural3 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventnatural3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=90e5de4dcbdade80a077de3c078dcd09";
    ImageView aventnatural3;
    String urlaventnatural3 = "https://lh3.googleusercontent.com/FN_grY82MXxXoauLmYOVuKWI1iTeSbsYWmQCKdghPrwCoJUhyUgREUkzzm68DJnu6bwJRzGtPth7cdtYHq8e9fbl8n0LUKJRk9IbNZZyviaRkpUIfXMaivA-GWppZaDsqHhSjud3t1PF76UGrzyJl_l1CokfzafCvGoT2HfKqiESRpcYWoFQtSOnMhn0NN-QXNqDWAzd1yRlukl2leC0Pi0ZxIgsc8CP_JO-s7-n0xbAQtgkcJ3eNRtYNQY_DaSqpxgNzZZyE8PaGDmffQgCgsncxNi1LD_FXvRp4ke4ipbZYPg91Um-EAaEi9_cqIVSFky-RmRGLr-CgwdRSPb0XOcct_2_B5lkfFifW3W8TfuIER6nLXKdCS2PgSfNu2YYDxbs6cVJVJYE1TFzijG4y-D6Y-cQHJJeQH8zaTv3xfV3xPcvcbyTj18XBbIi6IAftRuFfpksDwChoL4phdUkK3dhQ1JW-iJ7GSrCCYKzqEgMPM38ev1gZIZPNwKLieFqp6EXVcnGfP-_UPUL0muyr8hOONCzyfDn1GEpT3HschgddmSsTrHddA79cGaBrq8IZpvRtqSP94KQk-jXRh1ysHRKi3UfGZL-PwyHf1n2FMIoe7DKJg=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural3);

        aventnatural3 = (ImageView)findViewById(R.id.aventnatural3);
        Picasso.with(this).load(urlaventnatural3).into(aventnatural3);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural3.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventnatural3 = (Button)findViewById(R.id.btncompraaventnatural3);
        btncompraaventnatural3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural3 = new Intent(aventnatural3.this,webview.class);
                btncompraaventnatural3.putExtra("string", urlcombo);
                startActivity(btncompraaventnatural3);
            }
        });

    }
}
