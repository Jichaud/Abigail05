package com.abigail05.mibes;

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

public class mibesmoises6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises6;
    Button btnconsulta;
    TextView txtmibesmoises6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4b85d290b1dc461ee09ec03eebaaa498";
    ImageView mibesmoises6;
    String urlmibesmoises6 = "https://lh3.googleusercontent.com/ICtB-YAMhiiHxdgAh5oEVZ7ncluzrEt1WSfEcu73VqiL9S-UwHzNEvJDUJXNIZeYfacJXfOEmz21pR5R1Ne5GaRKe7JKR0cbK87PHWNfhBydGyFUAnYZMjXkzUAfjzAub3II0WaZkaVoQst2C4xwKO7NnHNDvbN5YZV1dd7kzvP7xO2gkemNXf0pVf2E9aoIKFO6Xto3hk7tIXsWO_cj7xnrJ3lh84WxFN_T4mKgjFMdEHNSHA3g5cUPbhtNCyh7E9P8BU35b6KAcUKjJAlTLS_r4YFqh_cKTd9kw3iI8f6e-fuCkz0v07lsy5jZqkZrnGETPOWojz08Yzu6gl02FZvYiFzR3BVJ2hZspBTkOHlOV41wcTwMymaKCPLPuaLpJMkk7IqMWojws9SFcuaHRGKdTvbjXuO8_KPdt2NOnHVnh49H3pPy5ltXPKUYpDppIOFafNKDskIufKtokMZCNJX4Q6Tji6F9abcUB7wfEFmn1LHbUNYkSvcYYeaYPvXuwBznk6evrUIptCd5_uzAX64nc-2h1MOfmLz6Ba5es290duXH0sP2PoeQFtNXUkx6zpWwC6MHfdWF3c6Qq2qDarqcRKf7GADygFzt-flx5xM3_XlwVBHZFCCP-uNnesCwHcm8UIk3BVM3xkh1gJbNyPQ7rYSQeYOwQVFqsC8ShZw=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises6);

        mibesmoises6 = (ImageView)findViewById(R.id.mibesmoises6);
        Picasso.with(this).load(urlmibesmoises6).into(mibesmoises6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises6 = (TextView)findViewById(R.id.txtmibesmoises6);
        final String stconsulta = txtmibesmoises6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises6 = (Button)findViewById(R.id.btncompramibesmoises6);
        btncompramibesmoises6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises6 = new Intent(mibesmoises6.this,webview.class);
                btncompramibesmoises6.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises6);
            }
        });

    }
}
