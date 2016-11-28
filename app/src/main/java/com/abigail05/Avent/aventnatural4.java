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

public class aventnatural4 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventnatural4;
    Button btnconsulta;
    TextView txtaventnatural4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=942bf90fd3bf459942267ba05ddf857e";
    ImageView aventnatural4;
    String urlaventnatural4 = "https://lh3.googleusercontent.com/Thw-UWL6Xl1nICW9aQE4w2SFLWJWNqKrdcfEWrqZkYLy2wf0uNjCJ-_esc5yLaq8n_AEs9kvb8mkX5hHdmQC89j3KR99TEYlcwG1U8x_znjLXGOLPmCcB9TeIBBO2LM1JvmjJ0nTovcq8ImRg9-UT-jYCDKBf0zcC4zFBJ0YltiRvw2a0YNOH7ttBhUTz2OwHeblMJF-Axh_zCsLG4pbB5oOFpIfJ2lhQOxcGZU_CxtvdKtwVwyoFhyUUbVxnbpBjTnYm3iL3eKXcrEGNk6gSRsGOOp6DerOXBiYRKj5o4eOIKNfOGaBsePmdZP3uyNSFkB8I4N6Tw_4PUFV4YBDbDS3njtmBS3etb1pwEyWLkJIbL7vwaY1shPY4qEQa27NtE1wFY24Fy9TUJFMGdqCwHPzNzcggFM8p7dRhHYwMUgCy8dK2mPmyPSe1wm9adaOCAY-t4zTVjjqfEl7WopQgPsMZ3af-KAkI6EfZM3jIKG7ifuvNFZJc9b7gfEaoWiAaYOHfjZWMHQSDPQ1Ngcv0k6843HSJ0Yct1JovUGsdkYlRJxn0a8kNw5UY0VobNN7Bo9NUWRFMy0DjRk11RSnnh9WdtxZ5ML4oKSxnkAxAxHPN-Sz9g=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural4);

        aventnatural4 = (ImageView)findViewById(R.id.aventnatural4);
        Picasso.with(this).load(urlaventnatural4).into(aventnatural4);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventnatural4 = (TextView)findViewById(R.id.txtaventnatural4);
        final String stconsulta = txtaventnatural4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventnatural4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventnatural4 = (Button)findViewById(R.id.btncompraaventnatural4);
        btncompraaventnatural4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural4 = new Intent(aventnatural4.this,webview.class);
                btncompraaventnatural4.putExtra("string", urlcombo);
                startActivity(btncompraaventnatural4);
            }
        });

    }
}
