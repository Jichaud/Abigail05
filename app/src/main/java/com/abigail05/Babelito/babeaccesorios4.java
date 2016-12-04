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

public class babeaccesorios4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios4;
    Button btnconsulta;
    TextView txtbabeaccesorios4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d556e76110204c98b7424bc5aeb74133";
    ImageView babeaccesorios4;
    String urlbabeaccesorios4 = "https://lh3.googleusercontent.com/1f20AcztR9tzpgNlyw8zuqQPpSc0iHGMpQlA85Fpl8knP3helHUjyKCLtcf8tV6c8TzeaA8YldddkgVQr1GJIsECwxI8beSeN0Y6QD2ChweWxISDVsWlPqZboqS8yCusydjHJZK4Iax2lLUtJh6D385QzkYcsH3jM6tj8gK3DfW1oz_tIah3Uvuqdr5Yylk-bXANCajuG91TthrOQ7werkunpNwXGACyc8gC0JFLDc467739xq8ICi5KYWMistlKjSMzTEVKKRxhK5sH9NNNIYgZJtkPNG-0Q2yDA3kWqgD7n0Zqg0hJ6_d_-pFeNzVsd3aWEr93BAEqFYj761dGS6ghv-eeBaHqzwO1isBkD8j3HdWlOc5oCAWa0siH34U_1slEI4t8Im67H-LeYe65YpvKFr647jFJIixlo9adFiWSLH80KyixDFXhYO-cifpwVE0ex3ZRHjzYKHYixp3tFcR94Ql4QAdkVgrPNYhr1d8NwcOk94yAwbYYGMdDCQh5hCmw8iiXdo7R7bl8BB8hB9rYS4aZvztB0JI28Y_BtR4z-nPVeMy8d4t82wqtjcCu-f2WGYpmV_BVER1ge2wbMri-7VrWIi589cPgvbcyoKHf45UTIw=s364-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios4);

        babeaccesorios4 = (ImageView)findViewById(R.id.babeaccesorios4);
        Picasso.with(this).load(urlbabeaccesorios4).into(babeaccesorios4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios4 = (TextView)findViewById(R.id.txtbabeaccesorios4);
        final String stconsulta = txtbabeaccesorios4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios4 = (Button)findViewById(R.id.btncomprababeaccesorios4);
        btncomprababeaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios4 = new Intent(babeaccesorios4.this,webview.class);
                btncomprababeaccesorios4.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios4);
            }
        });

    }
}
