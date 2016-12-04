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

public class babeaccesorios1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios1;
    Button btnconsulta;
    TextView txtbabeaccesorios1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8fc6ec9f5e5f9efa1492b41ac624a9c0";
    ImageView babeaccesorios1;
    String urlbabeaccesorios1 = "https://lh3.googleusercontent.com/uZ65Oqfhq_f5fAjabsZW195OelLjUYRNoBQ8FZt8T7bOVom7PxK_lGKPS8PkcoU4QDeucnWjoGd5E46-atE9bpDoBH7mcZLF1UO8iNoyveXD1zs4fisGAu7lpJa66ZNEKscF4jmSmxsd8oHNLGqrYCdXDlr9stJVjwlJwnveHOZ8bc0NRC8DKncCoUxJ073RMnRQn8djwYbETJ2qSGcKO3orphbWnc7ytmNBTQNdrvPHkoKymfXG7qygiKKftHFEdCuZghc6o0ubn1ed7r9GL4Es6kWnjvc8A9KRYQB-AXkI9R30sBxXjAuwx_gxR3-XB0oCH9nv0RJ6qsvb5YeIL6P3lfxQNua_RM6PCgZYien_QlfPONF8ocSqZTDrdLIbNpJfv2BSzGDIo9HR3Z_ISQFa8BSkIKg0qrOZXGlejO2pAag9HlngC8N52W9qJE8wEVvj_IV3Wxn8yApoKVgjdgHjT0iftmjDQ7MxXKI1SsEKMv7rndNnSsX-CcTMOLbF0iXNiZJaMoAkZFDnRk0NYleXEzPiVd7dr1ReDX6LPNnE6Knslr7430xhq_4eu15GegPrHSFCfQp7lb8Xo7T75SboUxo4TywnWSXtVICUwXceLcySkg=w360-h356-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios1);

        babeaccesorios1 = (ImageView)findViewById(R.id.babeaccesorios1);
        Picasso.with(this).load(urlbabeaccesorios1).into(babeaccesorios1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios1 = (TextView)findViewById(R.id.txtbabeaccesorios1);
        final String stconsulta = txtbabeaccesorios1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios1 = (Button)findViewById(R.id.btncomprababeaccesorios1);
        btncomprababeaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios1 = new Intent(babeaccesorios1.this,webview.class);
                btncomprababeaccesorios1.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios1);
            }
        });

    }
}
