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

public class chiccojuguetes8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes8;
    Button btnconsulta;
    TextView txtchiccojuguetes8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=223004d699e041b0a06aeed56a2b01e0#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes8;
    String urlchiccojuguetes8 = "https://lh3.googleusercontent.com/T8XlqbSl-w2D8zvRl0pY5-T4yOl1lqrWYWarIEMDvy5YC-GdSSYOomqtJCPwEoinF-W6uxTC8_Vt5VtQvxF0kzzHx1BdAnc-W9hjpsoIsnNuczmLSOVMdnLella0nyIoSy52ZoXp_NtXmt699aU4S35Iuz3fkijEnpd8Vb3HenAP0kLnN3QupiUuu7pIIs1aDB-ClElN8T8sUaTS8va9dS0OKLReSPTZocQdLuIQo2H7THAQwIRmWhnZiF9aps0eGiYG3dCf2ITTWXqjfE-3g8OH19B4vs61JvO_23-1fyuzm65atDb4eJf0LdG7obChjObBtjqbALCisAB2k_s1wQXanSENtn6urAY1xZmSUaviYPDgxOVrpI1f7Cd1QwS2CnESwF57Fatgy2K4MwUDN_tt2VvOwrP3DGhCdVXCCUBV95QtCUPee8yVa8aQEZJybEcH7hUOdJSoWVMLgmOUZMmeWeWGnRgHHuayhxZV8dDPTaGzyh-MXBzEkkORBtlI3TQabGayhxkZ42gvXdrmqATVjHAUPEBYe4-1mRvMXJJsf5czsEt7nkKeFsdZtAa2caRaO1_H6d9nLv2iJZI3Gnd0Lprg9MZX7i0GChaZmmxWXUmLhZ94s-0O9OHQTFj8nXcIQjh2LLzmp9-OkmlmvNDvQcmveOt_xqZWN38rjng=s400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes8);

        chiccojuguetes8 = (ImageView)findViewById(R.id.chiccojuguetes8);
        Picasso.with(this).load(urlchiccojuguetes8).into(chiccojuguetes8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes8 = (TextView)findViewById(R.id.txtchiccojuguetes8);
        final String stconsulta = txtchiccojuguetes8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes8 = (Button)findViewById(R.id.btncomprachiccojuguetes8);
        btncomprachiccojuguetes8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes8 = new Intent(chiccojuguetes8.this,webview.class);
                btncomprachiccojuguetes8.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes8);
            }
        });

    }
}
