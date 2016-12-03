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

public class nubyvasos2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyvasos2;
    Button btnconsulta;
    TextView txtnubyvasos2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5c18a82394cae04948a686d63646838e";
    ImageView nubyvasos2;
    String urlnubyvasos2 = "https://lh3.googleusercontent.com/TYievQd5q1maW9JM5UwhFsgHYYm4wf1z-tJ9AEKEIklCv8Qa93xku7tchdBvavtDq-UPZBkIcyGXTU3F3-2aXHmIjcPjhccxjev5cNqFATX6LKnrLRfCKEm8Mz0Cjt9NLAfbMOVsFlzbW7Cc-Aof3a8IaZ180NbHDdmp1lalMD8Q3wa_fPVpRqlEnW3zVMzEPg6EsPUbVwUkFAl5EMKwg2S9aF75c3M1sBC9vkbWtEDKeTBancQAwsf_dE8HEvTsrSHASmBiwi0XfcV86BmbxQMNHT0f693gqZvPvwM9eyD27NFO12KM6hpvj0uYqKgyhfRnlTbrC6VcC4Pv2KtmjgEPTAngrS2mLyoIfJVnbLchqYgv8MVyH9d1pQ0hCuTEPh-OIIPm7rCeZzC0lenOR-vIj5wXhlsJTvUGooqP_KDdm8U59cS70FXnuKdHxezauRcGAMvwpFL8k26ts60ubBNyZmW1h9vZrIXU_F5mtVCTPDx0ulXwhuA4aPxtFW-JZu43wlBtMQSefzr25wh6byfqY2B_N-SACczXr9b5GMS5jWwP_rOoGNwk72-MvuS6IS9QY26AdjalWCmS_wWopz49kdwwC_GSpGMZWJ86J8IsCHZXPw=w497-h312-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyvasos2);

        nubyvasos2 = (ImageView)findViewById(R.id.nubyvasos2);
        Picasso.with(this).load(urlnubyvasos2).into(nubyvasos2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyvasos2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyvasos2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyvasos2 = (TextView)findViewById(R.id.txtnubyvasos2);
        final String stconsulta = txtnubyvasos2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyvasos2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyvasos2 = (Button)findViewById(R.id.btncompranubyvasos2);
        btncompranubyvasos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos2 = new Intent(nubyvasos2.this,webview.class);
                btncompranubyvasos2.putExtra("string", urlcombo);
                startActivity(btncompranubyvasos2);
            }
        });

    }
}
