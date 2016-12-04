package com.abigail05.NowyBaby;

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

public class nowysillas1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowysillas1;
    Button btnconsulta;
    TextView txtnowysillas1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0d48c40333e7ef6f5484a60f68772d31";
    ImageView nowysillas1;
    String urlnowysillas1 = "https://lh3.googleusercontent.com/12Lei0EJBMdRKpms5AS_bYpCfXPHBgD4GSEjby8_tp4d9W-e97plNoQ61DWaNO9UoWNdns2tKruIEqR1WtZTNRdnuSzo-IY5ZfU5zfaMZwxEVof10IzfY1u4bWAQYajFhx-s5IbFy1FZpnRu6AHReM5DMYHa9C7C_1PDIyy0u3Q9vM6ru_fPD4uc70kTGVn4XijFZIaNP4G7YDUmvyj7yUCl8M45Ovlww376-4igvYbfG2XMwWZhVNZBLSsSYRbS8iVEkMSeuCid_ubceEY0OzRn7VOOACVpR2myfEjXJg6KmcasiF8eMgaC_SRzYY1rw1uNPEZGBUX8neMutf-ySG8G8U4XqvLcwlBvNWteuX5Pae3f9v9zlvBbS1Lm1Iclx068pmppx6mZ_OQuiL6VmsxEUZZ1GYaGclbY-ONoAIzLO3DhgGL0a7022uccmRJP5WlXenLcAigSXZ3QWCpX9svFSQ2bvtGzNTk46Nd91u3ZrXmtOOsALyqH6F0eIiuldj6w1EeLXnjAYdZySm8GCo_1WmMiT_tMP2TP2S3CKN02P6d8m0SyaLPpGEIXSPoa-2OgaHCAZsczGd2dXudW-QtdSS-Qk8pIbVwelv_gP9NPu_8iPw=w492-h696-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowysillas1);

        nowysillas1 = (ImageView)findViewById(R.id.nowysillas1);
        Picasso.with(this).load(urlnowysillas1).into(nowysillas1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowysillas1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowysillas1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowysillas1 = (TextView)findViewById(R.id.txtnowysillas1);
        final String stconsulta = txtnowysillas1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowysillas1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowysillas1 = (Button)findViewById(R.id.btncompranowysillas1);
        btncompranowysillas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowysillas1 = new Intent(nowysillas1.this,webview.class);
                btncompranowysillas1.putExtra("string", urlcombo);
                startActivity(btncompranowysillas1);
            }
        });

    }
}
