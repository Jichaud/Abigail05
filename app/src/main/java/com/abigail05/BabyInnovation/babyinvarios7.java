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

public class babyinvarios7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios7;
    Button btnconsulta;
    TextView txtbabyinvarios7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=50080f1de4b9da07946b4def126c79c4";
    ImageView babyinvarios7;
    String urlbabyinvarios7 = "https://lh3.googleusercontent.com/4NTrFP0YoYIEB9PNjyMz8jWpE6LiNLyBMobqFKPQk6cfCt3vBC9f2w8zKegL1XplcQZmnxE1_Etw-cmLRbuRz8jkMnZ1JTgP5Q9CELYnW9XvCoAFw-FH77RnbEh9nyU5y7W_xCMz3iee7q2ZvaP8bwgzjPSEhFc3Ei6XeT3UUAfmgYTq_zkrqltxzXXBb4xVCuXGnkZEzZ0GT08QB7z-l1FdlOEfASDdGAj8sSWGYH5DGiN3awXgNxrMxv6wNzR8dck4KNT4kYVN38MqvuiPtzgWhCDyIKUfqiHeX_HAQpfdSq2YeO-smNYK0gwuZLrg28uKvBaNXcjGJJbVTCoNLR4OORh0uBOOWuxCfPCygPvZFXizmP2Z6aSHeZ3-acZzLuMtNLAoopjlQ2-HB81UoBvewXRHfoUbXMAWrCtzEHtcPMFRt6E8FnC7ktUkt1-uq0ABO8sVhMfhh4n_1LiZb2Xum9bCf8XCoMdqJ-tW-0RFKIBsDPl6IY_qyk1Ehs18B27iBi7QILA2dtS7a7WJCrbbB8_FhpCr-ZBzxDjOPitb2slukaxGlgkWLiWCbhZr4Tpgoxo5NJiuT7s-W8m1ft59B50aioKd2UipcgU3eojYkXwVHw=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios7);

        babyinvarios7 = (ImageView)findViewById(R.id.babyinvarios7);
        Picasso.with(this).load(urlbabyinvarios7).into(babyinvarios7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios7 = (TextView)findViewById(R.id.txtbabyinvarios7);
        final String stconsulta = txtbabyinvarios7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios7 = (Button)findViewById(R.id.btncomprababyinvarios7);
        btncomprababyinvarios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios7 = new Intent(babyinvarios7.this,webview.class);
                btncomprababyinvarios7.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios7);
            }
        });

    }
}
