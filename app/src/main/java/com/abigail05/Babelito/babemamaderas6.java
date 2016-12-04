package com.abigail05.Babelito;

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

public class babemamaderas6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas6;
    Button btnconsulta;
    TextView txtbabemamaderas6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f05fded301cc515a526bd5317195ece9";
    ImageView babemamaderas6;
    String urlbabemamaderas6 = "https://lh3.googleusercontent.com/Wghbiu9VTb3ntiGBEnrP7xgobINxKm5-ShDRP_9ZRcfO-RLJb8LArsFAG83pBnCZZKPHTeoh0Q4zi5new2GoFNfO3Fl3qf0oV-0fY232CTGplydcpIpY269g51j_I6mx5LT0Tf3_S0artGoTeZbCzvJLH8l2lTHhQwvAZY20THKypKyFrQ6tR3pvm3R8xT5AYgMiQq72qZpQ2HwdLSoT5bYZmkfhZQxt0oKs8JeDOG2fW0vEbEmxoneqaXgxoQjlp9DnwuV534-BmjcdB9-GXO3CNXgTOh3r7Xq_YgBmne1mXP54ZbsPfgRf2KYmzxXiREWTQjy1yB7-_rnHfC8XOjAG45KSTKnWCNp2u8e8cKcfU49v55laADEnSH3SK7Dkwu7pCYXj4iBB9veqvCSa5sX7EkgayKjTNB91mU9X6-XEbu6gNRAI_binEOWv41Tc8d5Z1kMLxwxin44Id5EdEBYXKj0c-mzMdp8p8VPMXoJXJNm8p6si4sSddD2G_nUDUsQ2BCpwWuox5pGR9DlIr7i-WLpYrXj_prqrL1CCQDl16_7NdA1AlqGqEj-ltQ-6tEU-lU8UlSBjv1CueA4Q4BqTWDQNPs6PVV0f2RWOOPE_m4qFMg=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas6);

        babemamaderas6 = (ImageView)findViewById(R.id.babemamaderas6);
        Picasso.with(this).load(urlbabemamaderas6).into(babemamaderas6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabemamaderas6 = (TextView)findViewById(R.id.txtbabemamaderas6);
        final String stconsulta = txtbabemamaderas6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babemamaderas6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababemamaderas6 = (Button)findViewById(R.id.btncomprababemamaderas6);
        btncomprababemamaderas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas6 = new Intent(babemamaderas6.this,webview.class);
                btncomprababemamaderas6.putExtra("string", urlcombo);
                startActivity(btncomprababemamaderas6);
            }
        });

    }
}
