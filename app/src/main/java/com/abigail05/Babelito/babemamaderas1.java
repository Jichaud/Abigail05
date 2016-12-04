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

public class babemamaderas1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas1;
    Button btnconsulta;
    TextView txtbabemamaderas1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6adc9de4f85b7e8975244e9ff40c11a9";
    ImageView babemamaderas1;
    String urlbabemamaderas1 = "https://lh3.googleusercontent.com/NEHIsZfkuthOLccApRfs_Kg3EWXK2J3rOeseQ9-4WFDaPuOaA7XxjQPgvVKxpWMBiNeQONpi6jBq3GtzGNltifBmPQquUlppvyvBki-33_p3sK9l9w9Vkq5frpOS6i6iS5L2PyTsGgOqwhc7JPMK_oA-d0wMYpXzLKb20lOKfdabb10hcKTKPp8AhWR3doiPgBDPbqlD6eobY3nIb74c0MYX7Ft7uLYNtJtfS0DY9tFa2dgaBEPsSjiozUlsOQ18MoD0A57r_YlFaA17TiVvlmJqh8S7s6cp4GHoHWxeGMLB-JA6VG782oLGDmX4mxqbK75F4jOk4inZRf3DbLLFg0u3lCjjlRq4KUJlBbBgQsaUFE9kiliFPt2UcwAPIaarhHHysx3hXd7Bd1qdAa-iaKC5gffGfvDoZ7rOqJL0mVQxhe99id2w9bDMBnJ8Obe4dm2W4kyoeSdYiXI4WD5aBqbwmYk_HPUC70dbZbfeyq9g7vT19qYKbYd2hriOEomxDEshbpMVE49fEssNN-IVFveqKeh9vKOef4nt4xGzNYnaDbeKo79GrAbBdQd32lLCnVmm3LrVse60PMink80iAi6NOgK5cKu08eoFXctpR5b23WknUA=s368-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas1);

        babemamaderas1 = (ImageView)findViewById(R.id.babemamaderas1);
        Picasso.with(this).load(urlbabemamaderas1).into(babemamaderas1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabemamaderas1 = (TextView)findViewById(R.id.txtbabemamaderas1);
        final String stconsulta = txtbabemamaderas1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babemamaderas1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababemamaderas1 = (Button)findViewById(R.id.btncomprababemamaderas1);
        btncomprababemamaderas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas1 = new Intent(babemamaderas1.this,webview.class);
                btncomprababemamaderas1.putExtra("string", urlcombo);
                startActivity(btncomprababemamaderas1);
            }
        });

    }
}
