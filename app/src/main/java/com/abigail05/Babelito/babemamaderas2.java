package com.abigail05.Babelito;

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

public class babemamaderas2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas2;
    Button btnconsulta;
    TextView txtbabemamaderas2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4380e9cd58a3fe799defcbd04da266a9";
    ImageView babemamaderas2;
    String urlbabemamaderas2 = "https://lh3.googleusercontent.com/YxNZKP95BD94G8ZfA5w_EspVfVbyVjcrQWppi9NQ16g_xDOB5_I4GNxI123Kxnt9BDYmEZu_PTgBShZKgGmefdgCxhVFlfkO-yH6kaRoY8TeubqWhZytj_ZmgIiWXwL45ye3r5lb41F-Tf2ohGCccCVPV2VUgOL7Z1OKpZ2fmBR5EWTWPS_v5t6ZCTo7_VB9qmzZpZve28DokcHT3QzWpZa_jN1ZjfZWndeO-8fbwA2XSXpATlaOlzskDWe3He57DvdGquXQP3m5MvT4_14wf38RXkDt6lY-9UfbbQYz1MvejYd-JONDqL_lpvy4SHOiNfc6taTvm2fduEuoeRorVwGUlieuZnqZbZKWqPZNKwz17TAUaqqAaS7qqE6w02bzm3o1Hbwppi3Eqmj97w9WSPddevDBGi2LDjbdNZCjk69EvKx9GhC-8RhHKlYm5QvNg2q6-7HGoL70AGIvkvO4-526xCVcK_ziCHmFj4kLOE3-IC8yF3aQcZXQ6qLnpojEm1HZMmu3nDbMXrJ83YqMYC-IFM7o7UPCi3XeXpDyYHY2w-IxYmU1_8aF-qsAKpIhawL3nOVaHwPK-eRvRNkLeLpMiQoG5gVqMRsOl_JB08v--KjyPQ=s368-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas2);

        babemamaderas2 = (ImageView)findViewById(R.id.babemamaderas2);
        Picasso.with(this).load(urlbabemamaderas2).into(babemamaderas2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabemamaderas2 = (TextView)findViewById(R.id.txtbabemamaderas2);
        final String stconsulta = txtbabemamaderas2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babemamaderas2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababemamaderas2 = (Button)findViewById(R.id.btncomprababemamaderas2);
        btncomprababemamaderas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas2 = new Intent(babemamaderas2.this,webview.class);
                btncomprababemamaderas2.putExtra("string", urlcombo);
                startActivity(btncomprababemamaderas2);
            }
        });

    }
}
