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

public class chiccojuguetes19 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes19;
    Button btnconsulta;
    TextView txtchiccojuguetes19;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=20c810577863c40ade26d1f9b179e46b#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes19;
    String urlchiccojuguetes19 = "https://lh3.googleusercontent.com/aPDzWAvLJdZAW_PIjsB4zX0bNtzsjNtARnPmESTlCK9aszpIbn8HrYPHKhSWrVJ3zJsaiJ9LTk5znujHu96QagxpnobltmHjMKLwJJIZe1sk6ixHyWgyfdI2_xNBR_MnxG84EuQdhqa6muJeCiox6JMILD3i0_EdCKeqKEfuksjnyD1aWu7xnss5bnTwK_aKDRE3omNcZ81br8goM9FNmfpTB9yhYurd4dmfSjxR8ttHkzuyvSbmSVnlrnY2vWDjXviDFxjE4vS20HEUqFwfYaD4iSGqETaGg14iVCR8opdJrUPoPVNrRICKKjQefGjWzexR0iuc91ynH-v3ZBW4Td3CJtbQkHhQKXHmQFGJlBXZszfIzjHIePKBM93GE4oL6ZnckJkSVwng2jRUCbMFclajJyZfuqCi3L3hcPRAhOBHPIJyxs_caHCu3_Yv9pvIXmeW14_S6Zv6eWeOtlmCid-uQ4AIduD5gF6xa1pYxoauy86UMfQMIXOo5IbGRhop8-IoL2F8cDukDSh5yYZcidXx-RSIN5XicGnScgcHISt-n3ZvRULHGcaoUH8Xkq7vlUP6frFn8LZauknsTRMHI2w94cB1o0d-NGpofCkjjOCI8VF2a68BDT124YbK9sCH4IRJku0DwXsKw7BnBPB33VTNtYHQg8Mos-yA4pvjSDw=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes19);

        chiccojuguetes19 = (ImageView)findViewById(R.id.chiccojuguetes19);
        Picasso.with(this).load(urlchiccojuguetes19).into(chiccojuguetes19);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes19.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes19.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes19 = (TextView)findViewById(R.id.txtchiccojuguetes19);
        final String stconsulta = txtchiccojuguetes19.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes19.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes19 = (Button)findViewById(R.id.btncomprachiccojuguetes19);
        btncomprachiccojuguetes19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes19 = new Intent(chiccojuguetes19.this,webview.class);
                btncomprachiccojuguetes19.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes19);
            }
        });

    }
}
