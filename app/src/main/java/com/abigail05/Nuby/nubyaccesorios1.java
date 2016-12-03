package com.abigail05.Nuby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Chicco.chiccohigiene1;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class nubyaccesorios1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios1;
    Button btnconsulta;
    TextView txtnubyaccesorios1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ac05296357c9d76bf6b0cc6dd0ec063e";
    ImageView nubyaccesorios1;
    String urlnubyaccesorios1 = "https://lh3.googleusercontent.com/8QerJG3e2L19I7uct47MRFzFmH36FtJH77N1SGvtcOCU89coZal47-3I5nDBjI3vboQu8617K5Ow7LohoZnQ2J9xuTq74z3FRRKqTAffzVzCAFDLsiXovOfwXDpk1L80JgZernMzyz1KsK9tHrfnMv1IQ8SjFGkOFljNVhDG17zd3Ep1eBw9iRPltyJrDc5mihwJVbcYBaGa1mVIh2yW5eYJCbNVwfwNYvQnCa_1zYA7zEe7PAK--zOTiKuyz2SDDON0ICBoXda8W_LyvZQYSFHgBI06Et2O1XhvoreNZC53uGXML_dSyb-wrSJ6tkp2esr_7v7IvSurLxYJRif22MumXcAiZfGR0ZPYHdsND-Hp1dYZg4Wj7W2GtXEqPRe_w3f8tjdpzVU_z0uaB0FP6eHXJ7jsY2nqydIDw5jAFjeKVJW1K6YsqV9Mtmzi1II-_QFGsXM_D_rFPrr3g7F3XE9p8WDBxfP9yZtJ3_SYJx1ZOMNi1vdobkBY5C53YSjivov1hrirjWrUQDW7b42lbgtDIT0HBycbCppyq2ZpaREoxJyrOHpgem-Zjrmvd8EBgK5BticwwJK-hqQtc3c2LPWRgjy7Y5OoItrwv27R9mXCbkr9YA=w500-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios1);

        nubyaccesorios1 = (ImageView)findViewById(R.id.nubyaccesorios1);
        Picasso.with(this).load(urlnubyaccesorios1).into(nubyaccesorios1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios1 = (TextView)findViewById(R.id.txtnubyaccesorios1);
        final String stconsulta = txtnubyaccesorios1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios1 = (Button)findViewById(R.id.btncompranubyaccesorios1);
        btncompranubyaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios1 = new Intent(nubyaccesorios1.this,webview.class);
                btncompranubyaccesorios1.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios1);
            }
        });

    }
}
