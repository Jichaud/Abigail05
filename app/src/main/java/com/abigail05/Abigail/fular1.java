package com.abigail05.Abigail;

import android.content.Intent;
import android.os.AsyncTask;
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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class fular1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprafular1;
    Button btnconsulta;
    TextView preciofular1;
    TextView txtfular1desc1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b5d2c2a07a9405ae51081cf8f364dbbf";
    ImageView fular1;
    String urlfular1 = "https://lh3.googleusercontent.com/4uATwRsq1K6FkkyjXkabmJKX9e2aQ2rYVNSQ2jiRILpd1YvCbVBWNqnl1D3I7pBcTp7t4wwAFBZTdzns-dSxsx4CMrZ99jA-Ep_VwJr4MgfkSvDAO1KCQaQHzCSvUdfIsk6lu4EY2E5hSK3Llb3KruviuFeQPJAXuTtDm4MKWp-rFd3xVHvuZM8_7Jce4To3438o7qsqmCS5XUsOKGw4nYA1A8qtr3VpUJRbq9Tsau9CMZRE_eFtkoAtGR_lxI0ApA-s4800K4Rjh6IAEA0uoXtNopcNO2YOn2OiG-x4H7c8SyvXBE_SL6mYiekdaFgixSTzuGUdYcdEcSZQawf0HylRUQFEeSASkqYgrOCDeGJNMW2qZIIvgJhGaXm9cW-4WXP4GJAziKbfyAWQZKSpostRs4yNj-HL2Hhsx4TczGXAfX95130oTk5iuEcbAp_2h1Nl1UDu67d-xwtMVsYI_8Vrjc4D0bKeynBLkIrt2D8XN3dCJUuKbAmZQICj9t8_drDKiaooa4aK_2rbaN8yH1SgJbtuuIQTNgk70W9t6ACd-0qzYusUOv_kmyP-xqq87SsR2KkHo2z_zU6E3Kx1wQnLDJnKeUDyhTRndBaI6vJz3UdbMg=w480-h312-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fular1);

        new preciofular1Async().execute();

        preciofular1 = (TextView)findViewById(R.id.preciofular1);

        fular1 = (ImageView)findViewById(R.id.fular1);
        Picasso.with(this).load(urlfular1).into(fular1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(fular1.this,marcas.class);
                startActivity(marca);
            }
        });

        txtfular1desc1 = (TextView)findViewById(R.id.txtfular1desc1);
        final String stconsulta = txtfular1desc1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(fular1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
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

    public class preciofular1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b5d2c2a07a9405ae51081cf8f364dbbf";
        String preciofular1st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciofular1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciofular1.setText(preciofular1st);
        }

    }

}