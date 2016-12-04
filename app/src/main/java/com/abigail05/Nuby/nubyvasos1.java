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

public class nubyvasos1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyvasos1;
    Button btnconsulta;
    TextView txtnubyvasos1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ec722d139958051577c494bfc704b05d";
    ImageView nubyvasos1;
    String urlnubyvasos1 = "https://lh3.googleusercontent.com/Jd5hI2dkfzrO4zzZbPiwo4FaiP2VetWLdTt4lzA33qzdN3-1hHS7lPYjAgYx9smFh5kCf6vkcayF5hbNLo7z_JtMY8Zobd8ynwM_Yz78NhyGwNoQvd-ald3FXmi7-HhXCUFBZLfIOk5XtnVXMuQj6cI5eUGbU8vEF0hRgo5EuDR90qayJlyZq_hh7J4Pkr7JQ--JDUWCr0U5bk_p_2F3iqfenQtljEbCDw41enIHOIBBYg8VDy0zXu1f43o4rTMZiLv6QsBs4aydzYeC7OJzEodZXYxcEAyfmIwa5mPt6ivLluoSvapHoGg6sAKCDh2Z67hFYQcA5fXhLHsbSDx-N-FrjU2e1YwXq87v04d_232GPwhPwLoisSK78UQ_yi_WqHDNC3hCWJt9LWqtCuT5IRPHjLPdPWWsB278lcRGZ1tvzEvCB8dUDuquS3hfOW7Cvt_xmUM4VU4xRjGz5GstPQ5ne2QSOnke1kVqGJ0bx_vZprgen63zZBkq2zVzZ-dlLBuSyzKy1h74KmaQ8VlTnpB5OyYsztdnOh0OJfJgKXM_Y1tO5MrlTuiOLXAymnDm2dfjWP8MQ9KgxCGuzMRX6A04EEpbJUb0b_Qg242GnHMnBXOvvA=s450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyvasos1);

        nubyvasos1 = (ImageView)findViewById(R.id.nubyvasos1);
        Picasso.with(this).load(urlnubyvasos1).into(nubyvasos1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyvasos1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyvasos1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyvasos1 = (TextView)findViewById(R.id.txtnubyvasos1);
        final String stconsulta = txtnubyvasos1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyvasos1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyvasos1 = (Button)findViewById(R.id.btncompranubyvasos1);
        btncompranubyvasos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos1 = new Intent(nubyvasos1.this,webview.class);
                btncompranubyvasos1.putExtra("string", urlcombo);
                startActivity(btncompranubyvasos1);
            }
        });

    }
}
