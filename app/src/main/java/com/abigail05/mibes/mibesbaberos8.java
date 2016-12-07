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

public class mibesbaberos8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesbaberos8;
    Button btnconsulta;
    TextView txtmibesbaberos8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dfb82caa53e2fd722b77ef84075acb4f";
    ImageView mibesbaberos8;
    String urlmibesbaberos8 = "https://lh3.googleusercontent.com/LfFlaKLlilBMrhR6g8mX5Oeq39c2asmuocglINf-nD2clxV1cV0Iqf06G_i0uHeRQaRQsiSIsJB1Uiwvq77UlayP6Hu0ikfqipvRgWFy9BYuBDXMG4qduGCeDt9ZMyTTi4NLBohx5wCOZl6BPTMwibK1mqBk9rOfkcOYpRlhvV56wdKlaCRUgP7NgSEtCzppNhp_684dB8srcgz4CpGQU3NTpmP9xTaRx6PtQXElYK6O3Fs1GxeCtX447IvD-SJ_310YV0fLDALtLxomv7n5Xlh7FRbPIrdzahMicSULTvb-HjQjw5FUJNoDwcWY3-H70qcIQ1Zb4S1ED4qfzD6hmiXAwGcCadqbfLfEJho4VIlvXvi7zJMkTlydCrK9kD_nJRrX7d9j1EkcebN-Zf1H96W_AW0nMWlE6F9dSHq9gN0RcBqpd4XKhWehzXtcBiOq9GdgYwAIVrymGm3Bkisww-zbWD1o-HURlPVL3j0krN50GHMJ5AP4kTaGFMPK9Ohk6AymbMfAMJqWjDyA2aGqt6olSOhvlslbqUa3Dxlz0E6N-2GUDZye28m4KRWkpjVwNo8DubtokfhyLaV7mRlZ7u264Gp4jG_D5RS4MYTGsh3pXdp-g-5lOvwezZzvv6Vl__mJxGXEkJyRUXN-e87UkUY9dJLiHY4cdymKr1Jl2tY=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos8);

        mibesbaberos8 = (ImageView)findViewById(R.id.mibesbaberos8);
        Picasso.with(this).load(urlmibesbaberos8).into(mibesbaberos8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesbaberos8 = (TextView)findViewById(R.id.txtmibesbaberos8);
        final String stconsulta = txtmibesbaberos8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesbaberos8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesbaberos8 = (Button)findViewById(R.id.btncompramibesbaberos8);
        btncompramibesbaberos8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesbaberos8 = new Intent(mibesbaberos8.this,webview.class);
                btncompramibesbaberos8.putExtra("string", urlcombo);
                startActivity(btncompramibesbaberos8);
            }
        });

    }
}
