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

public class babyinvarios4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios4;
    Button btnconsulta;
    TextView txtbabyinvarios4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=07e04dc39d89342dc070888d16c93084";
    ImageView babyinvarios4;
    String urlbabyinvarios4 = "https://lh3.googleusercontent.com/K-l6ft7PnTSenjdZM-iQwatmRRGIg-gp_elW3ZXU4rGCKvtT-OY8jd-aK8WpLgRMmX-pUX1-EZOtTvcnEJkm50MsAazdhSZ0hCKSBohsCvWXS_akv0aOT9u1c1q98SOuPd3g4uC9seN8_3oZHNrl_GOh5ZIg3FwFXK0jflK78sapcT2qWRYjfaE2xqqk6zmvNuzDHJ1bcDrmCBDr66wYShu6rqWEt1VlczlqQZJe9Ffd4Xftrlfh2CF_5A4q07ag3Y4AVybXbSiic8lBBi0T-QyUgKztLMdBo05pb5Oris7shAMKCKF9v8dqtAmXPLqRI2UnwZAUNlOyqxgFCtlfxW0QyzFgWp67Bfq4jnmgkxeSwg_iYM6_DAgRR9RYEQV0IzkvS4tqf8CCvRdTUTM9Slc3k2UhmlRAC9nh9hjVK0GxYSNk5qoHNY7DGzySHq9mapTS1m12MicNbTGgBQYcrCreCv4yirKMAVEJzXs1RsOfIXIPd6jHMDg_9I3xcJ4MmUG0n9X1ybJ2VaU0EGOJR9EYUcuytsNqDKg6LTcGN1FaAC_FR2c1FJKH6QqBYmSe1TU93nn2XvLhiZBKKt8UfT1iT5Sh-gx3GL2k7h69dyFt8riu6Q=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios4);

        babyinvarios4 = (ImageView)findViewById(R.id.babyinvarios4);
        Picasso.with(this).load(urlbabyinvarios4).into(babyinvarios4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios4 = (TextView)findViewById(R.id.txtbabyinvarios4);
        final String stconsulta = txtbabyinvarios4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios4 = (Button)findViewById(R.id.btncomprababyinvarios4);
        btncomprababyinvarios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios4 = new Intent(babyinvarios4.this,webview.class);
                btncomprababyinvarios4.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios4);
            }
        });

    }
}
