package com.abigail05.NUK;

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

public class nukmamaderas2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas2;
    Button btnconsulta;
    TextView txtnukmamaderas2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d94b250da87c34c453c936d39f1615b7";
    ImageView nukmamaderas2;
    String urlnukmamaderas2 = "https://lh3.googleusercontent.com/CGV2SlxRpZ323xvBXGv2Mq1zajV7M2HbP15veI3UzoeWo5wxxvnyLQE4UcxhV1ENixiJRMqp6amBNKL7i4a2yELS04HRwrbOijbgODGSNYTyCgInyVW7N7JUWpYU6aASKJUIv6sSg5fFPle0eSib2fgFfgRoa8mkMxUL1Pvn0wQUdOGuggHxsz43mnfHjm7zgGqGddHUgZWiDQkeSwmfRYdMUB5WJurw0XVC4N5m4TSS5G-Tv-x9F2Ib-A7H7pNk5c3OUF6-auN7kOkrJW0ezg2KF5XEn86cHheHuW1kjNoUyzTJRgWTE2WkHcDtjnl6prccCwPE4JXL2dXPi4Az9kAE1gKUqcoDwwKDHZTguwZArP9U709BS7rYne_34tgQBxiIrKhBuhW3TO-Iq8gwVM_dKyXW4X6Bo3Gv2BSl6Mt5lpuVlXK_IGX_2tv0AgJkUUyIHH0qFkEBnIEwLWUJzVbhCvEycDfcCsynNy6nzqg3k-u0kL_GiSvpEfTAY6SkcOseHfZU1DowZmKNw0xX7Zr1HHaizFchbLXAI14W2Zh6mUa9BYtki2-cxF13HNkDnHFlcr0Y40WvHxXxxt8tUMPXC4Qw6CBFFMzbLGu_fdqdzwwQAA=w191-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas2);

        nukmamaderas2 = (ImageView)findViewById(R.id.nukmamaderas2);
        Picasso.with(this).load(urlnukmamaderas2).into(nukmamaderas2);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas2 = (TextView)findViewById(R.id.txtnukmamaderas2);
        final String stconsulta = txtnukmamaderas2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas2 = (Button)findViewById(R.id.btncompranukmamaderas2);
        btncompranukmamaderas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas2 = new Intent(nukmamaderas2.this,webview.class);
                btncompranukmamaderas2.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas2);
            }
        });

    }
}
