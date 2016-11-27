package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class fular1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncomprafular1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=38c34156d3473e689589c845b1047cc8#b";
    ImageView fular1;
    String urlfular1 = "https://lh3.googleusercontent.com/4uATwRsq1K6FkkyjXkabmJKX9e2aQ2rYVNSQ2jiRILpd1YvCbVBWNqnl1D3I7pBcTp7t4wwAFBZTdzns-dSxsx4CMrZ99jA-Ep_VwJr4MgfkSvDAO1KCQaQHzCSvUdfIsk6lu4EY2E5hSK3Llb3KruviuFeQPJAXuTtDm4MKWp-rFd3xVHvuZM8_7Jce4To3438o7qsqmCS5XUsOKGw4nYA1A8qtr3VpUJRbq9Tsau9CMZRE_eFtkoAtGR_lxI0ApA-s4800K4Rjh6IAEA0uoXtNopcNO2YOn2OiG-x4H7c8SyvXBE_SL6mYiekdaFgixSTzuGUdYcdEcSZQawf0HylRUQFEeSASkqYgrOCDeGJNMW2qZIIvgJhGaXm9cW-4WXP4GJAziKbfyAWQZKSpostRs4yNj-HL2Hhsx4TczGXAfX95130oTk5iuEcbAp_2h1Nl1UDu67d-xwtMVsYI_8Vrjc4D0bKeynBLkIrt2D8XN3dCJUuKbAmZQICj9t8_drDKiaooa4aK_2rbaN8yH1SgJbtuuIQTNgk70W9t6ACd-0qzYusUOv_kmyP-xqq87SsR2KkHo2z_zU6E3Kx1wQnLDJnKeUDyhTRndBaI6vJz3UdbMg=w480-h312-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fular1);

        fular1 = (ImageView)findViewById(R.id.fular1);
        Picasso.with(this).load(urlfular1).into(fular1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(fular1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(fular1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncomprafular1 = (Button)findViewById(R.id.btncomprafular1);
        btncomprafular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprafular1 = new Intent(fular1.this,webview.class);
                btncomprafular1.putExtra("string", urlcombo);
                startActivity(btncomprafular1);
            }
        });

    }
}