package com.abigail05.Avent;

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

public class aventnatural7 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventnatural7;
    Button btnconsulta;
    TextView txtaventnatural7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=06af2f3209771555f8e9bc45dcbe717a";
    ImageView aventnatural7;
    String urlaventnatural7 = "https://lh3.googleusercontent.com/LGvIw_IBSEDQZSQAQA_aalliZf01fDBgtvUh9_HBooF8hTkbIzg3nrjWclV_tn4DNlI9iTTY7bdwbk_pYYB92dJd16DvVlefjYjgRKhIY1DcrrtKpmb9mMMCxEXFkrNkQWFrs8JF_gyx-nfEHDHlglasolGGicLCbvewb7IcN0xhwzYRtrSiZJKhgqSBhLZ0zFRmJAH8NW5PGJkeNw4gz2F7R5Px4M40D8Xj8cdNzfZYkwOo-YiKVSPtz6AYzqo6crHQxfUVcTQ1H67KhSestub8IkSgNreqvMyHwJW3Llz-US7eq-Wj2Fp7-6eVdK9G2PnJ3aXeogmlAoGGPF_EzIQtNu3A5LdMDmZyI1ULb1VODd_nTbTPO5lIDV4EbSyJGrCqcGdQzJYVFAxcbttO-hl7A0SjeAB8xL0dmM1AyKBiGZdUniro2u3u4fAdHomXx4K6swgx-fpjJ8DRAkb8ZRINOzHckMPKPs9NofRJGh-DhjbgIrns9vpYX2uHuftnCqXj8IMyQJ1T5kjmy7XdDWZUP6Fry4dXiQj0EBUmOEy8kjVYJdxBZzR_LQnjf4QkyD4-qqoOwd1iArEHF3TNp3iJVUvtu0HuAr0KXlkvzQc5MtbEpA=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural7);

        aventnatural7 = (ImageView)findViewById(R.id.aventnatural7);
        Picasso.with(this).load(urlaventnatural7).into(aventnatural7);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventnatural7 = (TextView)findViewById(R.id.txtaventnatural7);
        final String stconsulta = txtaventnatural7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventnatural7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventnatural7 = (Button)findViewById(R.id.btncompraaventnatural7);
        btncompraaventnatural7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural7 = new Intent(aventnatural7.this,webview.class);
                btncompraaventnatural7.putExtra("string", urlcombo);
                startActivity(btncompraaventnatural7);
            }
        });

    }
}
