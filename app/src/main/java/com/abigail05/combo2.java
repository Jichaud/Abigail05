package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class combo2 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcombo2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf7f1d016665bcbe9255dc04fdb2265f";
    ImageView combo2img;
    String urlcombo2img = "https://lh3.googleusercontent.com/D_GoJNNtYDbBuxU1MqKfOuKqgyLM926OPcW5vX546gtR6VfEAHpwhTgSn9e_7h1mOpiOkf_vOVQWcBtkp2tgbfOLU7vnQgexbx1UX-ABlnEaGcwBC6rVdK4BFtCMnEBfahQvrwMQoCyTT-MLV0iK3QK3BljBqzEw7arV0nKvSnnJH9uVORSg-Bj-q56LNRwPqF9gJ75rZy-NA774pCr_Zoefwwg8GIAxPzpD-RcnIlEEp6UhYjwBmVVm8XN3UNZr47w8yDF4X640TpMwKB7hyLaKY2f54wpULBTYohHYC9XxbTgXjdggz6kFqWvRsqzVxnL9GKaHEJJjldXa9sewthMryYKHzg5g1KYVC5CLYeY5pzfa-ncmBl9_rKMM30o_jXONtPxuRBTZIuui8-cgKEGJRzuso971GPRsM3aaIV3Mg6dgMMytnliT3MiLSwPjZkHkgWoE5BepInEcNPKikkf9j90RJs-VqQUmVDnI_xT2hjSEOav6NDsImHRoPtef3l7N88PId1i-h6u7PCnOwDuuWNi173svPILdtw1SQbC7S4NWnvPBeFTCDto3yEe6fBXn_2-BWaE_jB4JomhrQfcqtDodgn8HJmumZYlupfKsPgtl6Q=w570-h535-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo2);

        combo2img = (ImageView)findViewById(R.id.combo2img);
        Picasso.with(this).load(urlcombo2img).into(combo2img);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(combo2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo2.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo2 = (Button)findViewById(R.id.btncompracombo2);
        comprarcombo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo2 = new Intent(combo2.this, webview.class);
                comprarcombo2.putExtra("string", urlcombo);
                startActivity(comprarcombo2);
            }
        });

    }
}
