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

public class nukmamaderas7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas7;
    Button btnconsulta;
    TextView txtnukmamaderas7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2a687d2d2446ca0d7d4d595d37fcdc72";
    ImageView nukmamaderas7;
    String urlnukmamaderas7 = "https://lh3.googleusercontent.com/0SmycNcFXtCh9ZpxGiPFLD5RB9yfWK6YUeJG8qzYuS7wrh_uNiYHMlLppR2WoZ3n5TFAlBiS5vmeoP5nMFQUmZSKFPgerKmni9zJxAnEUpiJJhs-YcaQoZX-OI-W4N84s62HdD3yiMSizaN20Nmf3BS42QMT2kdQOibYi9d05wOeU-7B69iK762PncHyTXF4YN-0Luy80XBLDQj_r7jek2sPhXbtbhl3BL9XzIcoV46Fx1A7rF4RhK-3r0XIeRkglhNVAozBguRY6eqLAu-AgnJPiIDVuSF1OZ_jhjijLWr-x-T875pqtJyLLmPG7-llZX349xlpaZCneb0yRcsHVBEUFcu2B3vfkGDiq0jyqFT84i1J14fmVvMJRNWuZ01XMyoPMqmWPjU6JSD_ih4DW_wRO3VcSQTfONByPqEUdVU7zJe_6qASrHmc90NLCHgk-vN964Ph6865rXZZ2PJqvvnTKvLIjkN9e8DQjLXsIbAmPymYZeSYEHfg4KlyVZ15tEWFvr57BMiP8ML0JaFijJ_2Ks4ntFGRlJ91GgIbsJXPp87F3PRESJEZTNODNLLx7r4teyWr0pdcECraznuv0tS_WCFFPozfS9E8eYK3c4dgooCIYA=w316-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas7);

        nukmamaderas7 = (ImageView)findViewById(R.id.nukmamaderas7);
        Picasso.with(this).load(urlnukmamaderas7).into(nukmamaderas7);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas7 = (TextView)findViewById(R.id.txtnukmamaderas7);
        final String stconsulta = txtnukmamaderas7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas7 = (Button)findViewById(R.id.btncompranukmamaderas7);
        btncompranukmamaderas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas7 = new Intent(nukmamaderas7.this,webview.class);
                btncompranukmamaderas7.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas7);
            }
        });

    }
}
