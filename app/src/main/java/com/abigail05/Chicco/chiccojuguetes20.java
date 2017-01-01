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

public class chiccojuguetes20 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes20;
    Button btnconsulta;
    TextView txtchiccojuguetes20;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8c08b9ef758bfee7c7b61c2edebd5730#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes20;
    String urlchiccojuguetes20 = "https://lh3.googleusercontent.com/Tq1hXCuPglDZmsnLyntVpJeWQ9sdmVbGiATuZH1KuVA4zVkgYR1l4x8MScx3d6ktrpLuT4q72aiiUvpDs3-QrDyWFvp2BaRK2ulYiRZn--smaHB_45aG2WDsnCNwZg1hjRozv9Ubt9t1-PX3wC96Ze8YN_IPpToif8pVJMcLPGek6pLY3TZKrjwQfpgxJ2_zUd0YuYsjDh8qPXwQiQgV33xcSCaM0P9hF9UZfPYGEpDG4tYqh6Adrbsg5vPHAUYNksSbdx3ocY57VEf667cQUrD1MBDDv6KiGMmeDf9jprzIN2tGxVSWfSBTLQYxSO_WkDQYhYdPiZOOoeHmRAoDszFhnzfWrEdwzaqcSRlS_tLC28o0LB2aYx06ugcT8HdNaFgue_32zaBZJw2H9m_WqxZ3ZGFB0rl2WpX7dKixVNDR4Wov3LtwTf-WQhqTt-RILeJrValANPeZAvrtlqDfvSSMhmIbzShU6cwUIunnVB4jo7m2-TQ5rIvdELW4UeUJUHpyd12RmJk3_wkHZnC-bOsVY-rswNnoXd4GmleoOxJw8daVjmNfZ1EUdo-vu-8cHFpOsCCFecyGiiMDbWRh_KJAlv9nqZcaPpaT4m7XYazGMd0twRGof0zysEKeHBOBXlx4tMs3BI9ZYLrCquDrvlOclHFZTUse8yIeHR39DFM=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes20);

        chiccojuguetes20 = (ImageView)findViewById(R.id.chiccojuguetes20);
        Picasso.with(this).load(urlchiccojuguetes20).into(chiccojuguetes20);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes20.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes20.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes20 = (TextView)findViewById(R.id.txtchiccojuguetes20);
        final String stconsulta = txtchiccojuguetes20.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes20.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes20 = (Button)findViewById(R.id.btncomprachiccojuguetes20);
        btncomprachiccojuguetes20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes20 = new Intent(chiccojuguetes20.this,webview.class);
                btncomprachiccojuguetes20.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes20);
            }
        });

    }
}
