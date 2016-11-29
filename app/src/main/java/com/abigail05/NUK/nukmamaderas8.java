package com.abigail05.NUK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventclassic8;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class nukmamaderas8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas8;
    Button btnconsulta;
    TextView txtnukmamaderas8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e7f63c0e88c8e498dce9329e18a404ea";
    ImageView nukmamaderas8;
    String urlnukmamaderas8 = "https://lh3.googleusercontent.com/oZx_vYIh1jbYxk0_UCXSLaxg0W8hMKHNV1mTh3vCaGBL1Lc4qXX-tJnZftV3_Qv_1IZGjlKIVeAuGJMVTXsOoasoN4LFtX3CWk7Xf3H6TchxWu-CaWLmcpjAVkjJoM94bZwFocTrQETRX2p_3cU8aXhNkjr96Z5ChGZDMVtaQs-ueusD75O9HqspkEt9F5lbMglpP7UwxPfhqxclrXR1DZYjCL-axBWeD0e0TUNHzeeTiUK4g4pdx0j8faJVBmFzxecOpIrO_Vk9AH7UuZCGoYp_DWuc4qgNtkTJ7bFr442a5Lo-jLNPsmkLHU4pKN-ifqRD-5k_AFJ1rRW2UxOgl6Z40nBlfweegq-7_pr1PPQGUfNI9Ly-TkbUusEJgDMLHH-tm_GeMfX2kmnHyi5BgnsAqS7FkgeJqi_uT4Q0jn5DsYspeJpMm17apaG8cKgCAIfvZBnsWhzaKupZMQxWgh3DFlqTWI8VECDzYnvf2Oigz8ByIxVcVDDm0CFaaLspaA347BSXkwwRDpinhNkK8_pO-Lpbb5gqI24mPOVRkoxP4ATz_lYz9e2ggeXayQeug8u4ruTTT565lqqe204GhXrmtBrx6q4JF7FQj6PfBPTztKXA3A=w198-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas8);

        nukmamaderas8 = (ImageView)findViewById(R.id.nukmamaderas8);
        Picasso.with(this).load(urlnukmamaderas8).into(nukmamaderas8);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas8 = (TextView)findViewById(R.id.txtnukmamaderas8);
        final String stconsulta = txtnukmamaderas8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas8 = (Button)findViewById(R.id.btncompranukmamaderas8);
        btncompranukmamaderas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas8 = new Intent(nukmamaderas8.this,webview.class);
                btncompranukmamaderas8.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas8);
            }
        });

    }
}
