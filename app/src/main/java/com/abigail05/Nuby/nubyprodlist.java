package com.abigail05.Nuby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.Chicco.chiccohigiene;
import com.abigail05.Chicco.chiccomamaderas;
import com.abigail05.Chicco.chiccoprodlist;
import com.abigail05.Chicco.chiccosilla;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

public class nubyprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnubyvasos;
    ImageView nubyvasos;
    String urlnubyvasos = "https://lh3.googleusercontent.com/Jd5hI2dkfzrO4zzZbPiwo4FaiP2VetWLdTt4lzA33qzdN3-1hHS7lPYjAgYx9smFh5kCf6vkcayF5hbNLo7z_JtMY8Zobd8ynwM_Yz78NhyGwNoQvd-ald3FXmi7-HhXCUFBZLfIOk5XtnVXMuQj6cI5eUGbU8vEF0hRgo5EuDR90qayJlyZq_hh7J4Pkr7JQ--JDUWCr0U5bk_p_2F3iqfenQtljEbCDw41enIHOIBBYg8VDy0zXu1f43o4rTMZiLv6QsBs4aydzYeC7OJzEodZXYxcEAyfmIwa5mPt6ivLluoSvapHoGg6sAKCDh2Z67hFYQcA5fXhLHsbSDx-N-FrjU2e1YwXq87v04d_232GPwhPwLoisSK78UQ_yi_WqHDNC3hCWJt9LWqtCuT5IRPHjLPdPWWsB278lcRGZ1tvzEvCB8dUDuquS3hfOW7Cvt_xmUM4VU4xRjGz5GstPQ5ne2QSOnke1kVqGJ0bx_vZprgen63zZBkq2zVzZ-dlLBuSyzKy1h74KmaQ8VlTnpB5OyYsztdnOh0OJfJgKXM_Y1tO5MrlTuiOLXAymnDm2dfjWP8MQ9KgxCGuzMRX6A04EEpbJUb0b_Qg242GnHMnBXOvvA=s450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyprodlist);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        nubyvasos = (ImageView)findViewById(R.id.nubyvasos);
        Picasso.with(this).load(urlnubyvasos).into(nubyvasos);

        btnnubyvasos = (Button)findViewById(R.id.btnnubyvasos);
        btnnubyvasos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyvasos = new Intent(nubyprodlist.this, nubyvasos.class);
                startActivity(btnnubyvasos);
            }
        });

    }
}
