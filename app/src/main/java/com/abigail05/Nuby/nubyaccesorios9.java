package com.abigail05.Nuby;

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

public class nubyaccesorios9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios9;
    Button btnconsulta;
    TextView txtnubyaccesorios9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6d38d6c1a0dca109b5a1eb07aeaa640c";
    ImageView nubyaccesorios9;
    String urlnubyaccesorios9 = "https://lh3.googleusercontent.com/7EUwTPe55dOVZL-fQP3xFHk8py_5qy0LHusVVtnLG69teMkBCZ-68ZQEiAdBQ9r6EiIYK-qRuMxoOaA17Z0HB5-oB0zGzRsyQMhhQdI2Wi3ypT4CeLcYJhxl2DUL9HNj5DBNApKSgCVEHrp8w_-MeusqRblJObD-eBfEjJkFXbeP9_bPzgtm0Tx5a4djVOVDh4tO_1s9y2cw9c3XNqBVpmiwKIpxAYF3GSJOGdUz9Q4884B3Mfoe2qdwIv1SYFheGsoFtsQF2erWfcDs-uUuLk60BDQs8lB7SzPUx5IuPP2ERWq0GRhjEdgFPS0PLa1Enu6dzUQNzhsxHvOyEdOSEu1zm8hGbVbFTj1Ad3pDDbhb8Vk-9gKGWoanQ9qQvVJpgFzpHeuYWzaU4EeVN8RJdHReCZ0cK7eA8uEcf43_0GcTWqw4M3oPuTpUog8_sz94vBSr4FMhRjbnTEGI9R6nb8JWD43_WY38u149cExGykWOyLgxgu1P6rEvXAnE252heAS7WgMH2uhtWDmyGW6DDtcFHHpTasxT7dOOmY7R3VX0oMrxTJDUpmBf-IAxNp6tLehlxjzZPdaOYK4IICkqT2vs4rmmsOaP2EpguVnBZouDn4xErA=s500-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios9);

        nubyaccesorios9 = (ImageView)findViewById(R.id.nubyaccesorios9);
        Picasso.with(this).load(urlnubyaccesorios9).into(nubyaccesorios9);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios9 = (TextView)findViewById(R.id.txtnubyaccesorios9);
        final String stconsulta = txtnubyaccesorios9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios9 = (Button)findViewById(R.id.btncompranubyaccesorios9);
        btncompranubyaccesorios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios9 = new Intent(nubyaccesorios9.this,webview.class);
                btncompranubyaccesorios9.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios9);
            }
        });

    }
}
