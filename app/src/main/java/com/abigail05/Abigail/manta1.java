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

public class manta1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramanta1;
    Button btnconsulta;
    TextView txtmanta1desc1;
    TextView preciomanta1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=750e9448329a28a65bd8de3a8072f927#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView manta1;
    String urlmanta1 = "https://lh3.googleusercontent.com/HGBjWaMd9TBcdu5myuzQr-RPnJEsdyyQNVDyKpGmefJdE2vHPMGjpZDDJXrwKQf4TObk6VMQ-V77RuqwQw27Hto9gZrJRfDWHuTIsogD2GbFZ2FAeepcCqcJVNT6muLWiuP68yxOFP6g0Fc1UDVKfYEb_0IGCwwbooJH3iFhu2yhKcnmfdYb4O1_k7wWK6lnqx-UVhU2fAZskNDrJ-1IjGpdDhRRaBwNZ4P4kYFSFLmCW6P6lUPnI0ZZMUDvwC3gjD6hsXlC6ul8hxbfMbXVPQURAA5fvZ4TT9uE1yb66DWCrZIRmq5-E27uXuGXQ3zjrHDwcmSpuIxPo1pV4uBgShsrVR-H-IGqWY2RRqb0HqH2iuUkm5WpmW7GPnO8QmXpf72cDchNd8dwdJzXJdQIdYx6ezAlG5BddbwFSv15u5CEDTpQHLG2_zcFCfPAHC70dNJxib7OPXo6-pLBx5tyX6lo4j0du-iLcuMAePotVizbxnWDhHG4Fhf0Ap2m2yi0gNPz62e_jiDN3bw5-Lche0gRRLkL_cYyOl_I8-49237v0ZtSDimzenhieoxY9cS8Hs3G7nUecMMGh9WQQRbrbbIkr8c5FN2-Rff3LCkglOvgnc5y6w=w480-h276-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manta1);

        new manta1.preciomanta1Async().execute();

        preciomanta1 = (TextView)findViewById(R.id.preciomanta1);

        manta1 = (ImageView)findViewById(R.id.manta1);
        Picasso.with(this).load(urlmanta1).into(manta1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(manta1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(manta1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompramanta1 = (Button)findViewById(R.id.btncompramanta1);
        btncompramanta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramanta1 = new Intent(manta1.this,webview.class);
                btncompramanta1.putExtra("string", urlcombo);
                startActivity(btncompramanta1);
            }
        });

        txtmanta1desc1 = (TextView)findViewById(R.id.txtmanta1desc1);
        final String stconsulta = txtmanta1desc1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(manta1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });

    }

    public class preciomanta1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=750e9448329a28a65bd8de3a8072f927#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciomanta1st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciomanta1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciomanta1.setText(preciomanta1st);
        }

    }

}
