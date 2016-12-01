package com.abigail05.Avent;

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

public class aventchupete8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete8;
    Button btnconsulta;
    TextView txtaventchupete8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d9c71982576a16266a05e48abdb20e3c";
    ImageView aventchupete8;
    String urlaventchupete8 = "https://lh3.googleusercontent.com/aSKiLk08N6OLkpkBXqO2tTm6zEWUO9XsiNscFfDlsYN-JLQeBac5Pmc5cl9Pg6XL71_dmQ3s8dDm5pQgUfx1wITG_TcejdWzwiW7dteXlQIaHsZbz8aDvxeYxBZbkXwg52gM4mcf270uiElB4gMg48m1mqhFOXUrh2eus7BM9Bg-jInXajhB7E67ExrIBnJzv5aWLTN8-S5jyKRWzdieO78E9EB_qjLMVX2rTaRG6hnPAPli_odd63yFrYgbJsKBWnM6gm6UheXqyZN8_D0SWMq1Z5kJalB3yBqPB7LokNNT_gA7r2wUTw3_Rmi7JakEWVwf1lLEjg_qzU-6KONxK1SgdZqiIWgGYMvHWdaz2lBldgS3pf11qan-uWEUUyFVjPGvUkhtqEUc0z0ckCM7tMSR0Ckjhgfj9aZVST0j1XVk4Cv-kANNH8B5gL_UXuAHuWsqGzPUssEHtxPx779ULgIkQ19dk4AqdUvwWD8qlrNDvi2banJG7gmd4Tr7ILEymyoKrH0vdP16oOnqRPcjxRc16FbqN1r_CgYLipRdijJGSRnag9zc6o09G-65dDRd_2sJmFOhAtXuQ22aTJwOyoXSva7w_CWIrd7GY_4GUB58jbz1mA=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete8);

        aventchupete8 = (ImageView)findViewById(R.id.aventchupete8);
        Picasso.with(this).load(urlaventchupete8).into(aventchupete8);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete8 = (TextView)findViewById(R.id.txtaventchupete8);
        final String stconsulta = txtaventchupete8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete8 = (Button)findViewById(R.id.btncompraaventchupete8);
        btncompraaventchupete8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete8 = new Intent(aventchupete8.this,webview.class);
                btncompraaventchupete8.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete8);
            }
        });

    }
}
