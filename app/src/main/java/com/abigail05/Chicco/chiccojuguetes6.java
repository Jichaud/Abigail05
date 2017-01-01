package com.abigail05.Chicco;

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

public class chiccojuguetes6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes6;
    Button btnconsulta;
    TextView txtchiccojuguetes6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=889db988d9b7bce05b84e6930cdc5483#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes6;
    String urlchiccojuguetes6 = "https://lh3.googleusercontent.com/eu5HGjQbu7UyXe20yPvoOfEi2PJj-e12VamYg-XI4TxiHTLKR9YZRngw68b7xSKeujnWijVZuFd0DoPu0Sh-MtDxcnd-8qDQpmc4C9dr8tn1tr6VCLhR_MZ5O78QyDbJo349Lg1grV7pKi7Py6AYrRSEFHnnDKK98BVmYiqce5e-tOg9nEbmQluVKgd0CfJ7OSBksg6fFd9Tr48sc7XZ1Ejmmsko1sQHE1hxlzeMH03-hRGrhO-0j0V4aCdGkw7K9skA2AE-HstRP1OnKNQF-dmbPNZgAYS5imkjVnQGsvtTyq0RLOQpwPoqAbPrKK1A0xHAs52GCD_tniKUAUzXIlJfOlAN6Vw4Hlwx5Nng52Phz3judSrX-7qSEJEAAdr9UpMREQ4S4P164WV_rKx9E8Ye2ugW9Pyzrzbze8eY3ZDfPaOn4FDuc_JSEmgJ-aquEWNzCq9L1nnXozdY7knIJQQI17tHjyLcqwW5NDDyNYYpTHkPIeq21WTeRQkpau-RQgA0UWba3O_4MAXByuSgmicrNzT5GP-dBwj1WjQequ5CBgt01jwBHesexIbzGi9kn4SfjBNfRLLsetAl-uIR2aNOq5AJBISQADmjXZVSYus9J1v8c048C0M5sxZIvrxWmsS9u4Vsrrv0sUx-ge03FJ7FZN3ndiKW7nKiH6UwLR8=s400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes6);

        chiccojuguetes6 = (ImageView)findViewById(R.id.chiccojuguetes6);
        Picasso.with(this).load(urlchiccojuguetes6).into(chiccojuguetes6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes6 = (TextView)findViewById(R.id.txtchiccojuguetes6);
        final String stconsulta = txtchiccojuguetes6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes6 = (Button)findViewById(R.id.btncomprachiccojuguetes6);
        btncomprachiccojuguetes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes6 = new Intent(chiccojuguetes6.this,webview.class);
                btncomprachiccojuguetes6.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes6);
            }
        });

    }
}
