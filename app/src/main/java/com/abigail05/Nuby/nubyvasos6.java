package com.abigail05.Nuby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nubyvasos6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyvasos6;
    Button btnconsulta;
    TextView txtnubyvasos6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e6e76c24030302a858daeb22a8a0c14a";
    ImageView nubyvasos6;
    String urlnubyvasos6 = "https://lh3.googleusercontent.com/Q2PV5OhinETR8rPoI2Iwwku6nJgI_FGXSpfC5SDKA0Ph9G4_YcSU28IA2G3ln4crSm2Z1NRYjnuKVCp3RvC14b8hNtJFO2wuhZf0lnvi5RWxi2HuiLwjzH3uIVc9u-rQNcTfFy0J0ieG88s-_O5cNqgzRori80Wody95Fyy2gXmjfx7WSPvTIYjd41-_0TddMDEJ1czDMt2F0Ob8blTYWwNfJdRv9-3zIl-sjddUMrQ3T2N97kaILEJgbQP4EYFDH3HggycYrG0ObBw9hwFSo65Z0KUlMfD3wdaxoeP3QFUOe4UbwItKlH-cSiHIN2cSU6gCvKa6fVZakMpYNywrHLs_v-6HbeVrD9Rd_sJke5wkfwZYkiUkm762X2ice4_XmWWaXX5ybyS6iz7mS_xangbR_-RE8DQLBO9TXTxK-_OBhNZ1X5ODeoNvF-ItTPft28vLYpmcD4mqTwZBLtlf9G7z3HlZzPbBBg_IGeBDSJMDfLQNjjRQHIDhtVab2_vB-a-Ak7KIeobUfR1neJsyC9ic85i4ryuNrVBSgyuPz40Nl68obhh2a5NlGH8woiRHgaY4b_-lXz_5qNBGDRNMf9QjTviGvw6uHsPMZk2jv355i8vtyA=w355-h576-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyvasos6);

        nubyvasos6 = (ImageView)findViewById(R.id.nubyvasos6);
        Picasso.with(this).load(urlnubyvasos6).into(nubyvasos6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyvasos6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyvasos6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyvasos6 = (TextView)findViewById(R.id.txtnubyvasos6);
        final String stconsulta = txtnubyvasos6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyvasos6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyvasos6 = (Button)findViewById(R.id.btncompranubyvasos6);
        btncompranubyvasos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos6 = new Intent(nubyvasos6.this,webview.class);
                btncompranubyvasos6.putExtra("string", urlcombo);
                startActivity(btncompranubyvasos6);
            }
        });

    }
}
