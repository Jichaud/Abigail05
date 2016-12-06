package com.abigail05.Gamise;

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

public class gamisebodymc3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodymc3;
    Button btnconsulta;
    TextView txtgamisebodymc3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
    ImageView gamisebodymc3;
    String urlgamisebodymc3 = "https://lh3.googleusercontent.com/6DJOD0ELeH69mi_ZbOEOmYPVd5QMIcqc6mWxE4CC-PFgDEdAiqo93ompo_k6RkwAOohxc2m3cJDFkJ2R0sbDb75IZ1NnbF0i61FEWKa6LDIUmEIXyD2t4l6FTc-EYkfqCCzkoWN_X0eJdkrughVjQRftae_0VSWS5zwBt3MmixzaEy--TgGR4AGLk3Ven24YjjU9dAO_lFi36rNGz2DLBVdm_dVZqgrz1txpJfc5JD39W8unDhc_WWvCZ7x-COt-BiSy6uLWXwAHYgGeZ8WS3Ftm3iyDPZgQfdC1lcbwfgWAJAu5-M0rhN2cTsj_y00R_k1_gSfe6NAmmbyoD0asEE46Ei7lkIlajtWaPlQtRrUZeArUwrr0Ov0055wg838OS03uKV43vfN5NWpsAICIXKmg8Sp49aj2gTJp0UPO250ebypDhkAI3eJWHZS7ZAqnVRXcfCle4cA2I8vqpo7xBzGPG4C7SW9LEjupHn4gUgLWfPN_4aos1pW1NwJJzR-vlsvwGf8S2-Q7RszCxiZojbuJm0ziZuMydEK4EPxwXq4ykMATgp3YkWJu2pnWuf8iSTO10XToIUrfPgOkjsOCAaCksHWDq3k20SkCXHpNcT5uxKYp-DB9i_MrIfuYj8ctaE18-4CzKxnsqipCMp3VPeEwRDiQraiGttABxBr_lyk=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodymc3);

        gamisebodymc3 = (ImageView)findViewById(R.id.gamisebodymc3);
        Picasso.with(this).load(urlgamisebodymc3).into(gamisebodymc3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodymc3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodymc3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodymc3 = (TextView)findViewById(R.id.txtgamisebodymc3);
        final String stconsulta = txtgamisebodymc3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodymc3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodymc3 = (Button)findViewById(R.id.btncompragamisebodymc3);
        btncompragamisebodymc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodymc3 = new Intent(gamisebodymc3.this,webview.class);
                btncompragamisebodymc3.putExtra("string", urlcombo);
                startActivity(btncompragamisebodymc3);
            }
        });

    }
}