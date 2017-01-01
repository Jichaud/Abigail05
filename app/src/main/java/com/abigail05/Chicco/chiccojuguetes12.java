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

public class chiccojuguetes12 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes12;
    Button btnconsulta;
    TextView txtchiccojuguetes12;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0b690a894109a8c8cfe4bc06259c7297#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes12;
    String urlchiccojuguetes12 = "https://lh3.googleusercontent.com/bybHOktMfaKIj36fdxmNHPp9dYBl0IR_SwFcG7ReL_RUA3BeFi3jQ_n5z_W2SgziwKuYkATKLk-4oXCEuDW1hpmu-f5jsu-7k6xFC_myWoYHnNX95neosTqutN0Aeb05WciWUdzSvPAy0TDNPBO74E-51N8TCD5zVUNly_hVGrv-2_o-Rzn24w4QXK1cQ1aZJYzpFJN2ehbZrmZM9A3n4DXhxcwiGbkXCC45ulFoEhQ5Dh327KJog1zOw0CNGjIolnaTafLLl2DASaCch29-XaGBAocdLN2BfrW0-1GvxCW_hbesdrV5srIq8PIuJ9RouGUOOHTDjJ4B7lcej5BSepwm9coLX0317veVnuviq9iegNkA_lf6MMZSLzHRa1Vke-dgFZD64T_FbPZTF7Hj52UBhIi1xogVOZzh3kLU1OA6YOMWl0HuWtTzeLypCKZT9mG48Qi_ZNYy6UJJRn_xk05HOBo-ICVWuMoQIrjRj9oD2RI4NZ-pRvrrx-VpXp2NMsHZfGQbxzJq2FlpyYEsjOEAZiaWRmdCTCpysTs7Zb30FRmnOmiI8DIkaMKbv7YEYE9m8jF90MwXN_yfB6G8_cHFhitH0NiejuOpuqdnIm-Xz7m0H0qzT-Lp29SrCLKG7IkHAL7eZtenxheh0nYQQDm0CTs08Hw1mO_8BexdBeU=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes12);

        chiccojuguetes12 = (ImageView)findViewById(R.id.chiccojuguetes12);
        Picasso.with(this).load(urlchiccojuguetes12).into(chiccojuguetes12);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes12.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes12.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes12 = (TextView)findViewById(R.id.txtchiccojuguetes12);
        final String stconsulta = txtchiccojuguetes12.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes12.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes12 = (Button)findViewById(R.id.btncomprachiccojuguetes12);
        btncomprachiccojuguetes12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes12 = new Intent(chiccojuguetes12.this,webview.class);
                btncomprachiccojuguetes12.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes12);
            }
        });

    }
}
