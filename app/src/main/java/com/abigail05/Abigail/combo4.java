package com.abigail05.Abigail;

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

public class combo4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button comprarcombo4;
    Button btnconsulta;
    TextView combo1txtdesc;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=14b2978d8fe35ce2ea4157a8652e48e8";
    ImageView combo4img;
    String urlcombo4img = "https://lh3.googleusercontent.com/TNP66LtKXbcgW-VXfLQasJeZWjL5LfHBlmZda1Tp7BX0tuzzX8XQaTHTnOr4P_ifEIKrwFYXzrYvJ4mvCkmg5js-KrlfC38RMU-67DWUDLj0usJcR932eV6FKb2KG-n5U7Do7GailUFHLq5FgN3DBl4xKSVO8XZsaxAWAvVggoOgR5Pdu6JQCpaExWi5qdVjZGtpxwOVEmYz_LdS2tptyxqmHKvtVpcIW6q50pmFNBJEo9tRljXjGplUwaPEm_FG_JBZRwYsJa-zLUjcy497EAhA-54aEyewAjWvTxWxk390q8mS02QcoEvFLnZgYVqF1T_Eyk5IhN5a4UJubY96n5rSCG48msWsFQ8R83fLf43EhrC6zqIRBuvKAX2N8x9AG3pMOkPZMWJS_XbZrp0lQzGaq9q1UvtP-TmxMMWCd2WJpEgJJC7VOQ7VQItkCEhZRFAdVPc7e0rccddo4z9qnMXskJthqBVoVm1Qp3lSKGTLQEcTgYE8rAKhtVhCxfg9NvVdX88g2tajMd3pes3BuJLKyLUzHSqioWkSGasvb_NZAkR8SsoKs3SbeOGe1LMA42OUAIbWsVFT6U2SK5mX2SX_APFPmxcchjvYC9CVc_HrRSZ7Ww=w460-h284-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo4);

        combo4img = (ImageView)findViewById(R.id.combo4img);
        Picasso.with(this).load(urlcombo4img).into(combo4img);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(combo4.this,marcas.class);
                startActivity(marca);
            }
        });

        combo1txtdesc = (TextView)findViewById(R.id.combo1txtdesc);
        final String stconsulta = combo1txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(combo4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(combo4.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcombo4 = (Button)findViewById(R.id.btncompracombo4);
        comprarcombo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo4 = new Intent(combo4.this, webview.class);
                comprarcombo4.putExtra("string", urlcombo);
                startActivity(comprarcombo4);
            }
        });

    }
}
