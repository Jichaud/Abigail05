package com.abigail05.Chicco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventaccesorios4;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class chiccomamaderas4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas4;
    Button btnconsulta;
    TextView txtchiccomamaderas4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5d1ef7650e22b6e463cdfb812acf7de0";
    ImageView chiccomamaderas4;
    String urlchiccomamaderas4 = "https://lh3.googleusercontent.com/_0gT5luWvXdQM-COtLygs2s-HPvnO-e-ZqRmE3lGs3ra1u8DD9_51b_y8Gui80z72dQUmkmxWAEe6a4GlZWhnLC2rJqZvwzgy7S57gRMvEAiH5RebjXy1RIyfizZKrn3EuehF_s2vZuYscF0hJ3OEL7SnvmA4TwwIfNA-ncgGyKXvsp8aalqS-DW4Wj3jyM71K1Q2iodfwSyc72K40p4CyzGMh265Cj-9uj7qbSKDT1atU4nNZvLFpUoTbKEZFq-7QdACqdZqXIxC-9Lqm9d77246YnVpbNy0yVDkS1g8P0t3C-csaOtd_esWh3Wd9ExT_FNPlhnvt5XiE8ZjvOHEhwiHJOrT3udGfBKMGNT5FwrE9MKZY6N_9gn_UnD79M3hGgcnnq5zSSJoDxlzN_oOnYqGjzIboBss7dfZOXy3Szj3qwuoGhjzVWUeonL5OKDcHi-V7Ydmr6irqpeiK_oq92mjrPiMnb5DK4E00KlHJow7kZGIn_-mM16bmFN_YKE5SYUUZhDJXcRkhQfUfomRWRMDvEFJTyTv_FJYdNqRFYlZfRDgL1dSaUyXUghGDl8pD71Haypm-Vsw3o1-0wZaIn3hriuQ3ckGLCA8h77nVPilO70pQ=w400-h399-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas4);

        chiccomamaderas4 = (ImageView)findViewById(R.id.chiccomamaderas4);
        Picasso.with(this).load(urlchiccomamaderas4).into(chiccomamaderas4);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas4 = (TextView)findViewById(R.id.txtchiccomamaderas4);
        final String stconsulta = txtchiccomamaderas4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas4 = (Button)findViewById(R.id.btncomprachiccomamaderas4);
        btncomprachiccomamaderas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas4 = new Intent(chiccomamaderas4.this,webview.class);
                btncomprachiccomamaderas4.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas4);
            }
        });

    }
}
