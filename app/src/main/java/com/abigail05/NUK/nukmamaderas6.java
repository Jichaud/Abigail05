package com.abigail05.NUK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventclassic6;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class nukmamaderas6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas6;
    Button btnconsulta;
    TextView txtnukmamaderas6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c6a64e97466d94755eb5a9d406bc76fd";
    ImageView nukmamaderas6;
    String urlnukmamaderas6 = "https://lh3.googleusercontent.com/cjLknSWe2ReUHQittasPYV5dDoYPVVokJjaO19I675x03BcWL_x-4fGuG2rIMydwa8H5PwM0OXt1HEr7YoO5hrjmQvMfxnQBzPLvnuKEr3iCU1r__wLTxaky5dPy1q7EsN5qk49obnJVXHPJiJHp-b8wqBtCS2-Cktwq7CeoVf-bZEFQV6_fo7to4QQJVNl-0NwzOKpWuPxwDK4InMBFPqYQKwJd6-Mwbq-o3RohCu7OgrZ6aQuyNQ9FB07Maqyp6buxeLCPdC1WrPJbjAbxpdUyq8dhhWaDdx3sQzk-CIfeCihu9_DCZcRIzRF3SNQBSPfS2AvXTOAHv8XlYunbyvAlNCebRNOKz_671ymElvmkcY82nBO2OrbmUyUGDnXv_XVtRPumrun79s8hC6EZ6HoMHtzi7Mmp6BB0BZFWDIk8KLwPTzC3op0dCQUs1ekkubxBlYrGpK2LBPnqqKRgCi-e68tDzQRlxYo_2fNkjScGxwJJgsUGNj33Y94LtYiIV03fPNIOC1u2r5NDuxihbNQPQMgRLQzlL-N1SdoIMaVnOfOHfnJkVKDi06JGWEpCzt0cJYUR5kYZXjPvLc3vSWmqXBMT1J4vYWs9envvndnyLP9FJw=w247-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas6);

        nukmamaderas6 = (ImageView)findViewById(R.id.nukmamaderas6);
        Picasso.with(this).load(urlnukmamaderas6).into(nukmamaderas6);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas6 = (TextView)findViewById(R.id.txtnukmamaderas6);
        final String stconsulta = txtnukmamaderas6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas6 = (Button)findViewById(R.id.btncompranukmamaderas6);
        btncompranukmamaderas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas6 = new Intent(nukmamaderas6.this,webview.class);
                btncompranukmamaderas6.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas6);
            }
        });

    }
}
