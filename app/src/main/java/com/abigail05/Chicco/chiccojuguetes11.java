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

public class chiccojuguetes11 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes11;
    Button btnconsulta;
    TextView txtchiccojuguetes11;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=77e2843e77613d0bd52e99f6618fc069#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes11;
    String urlchiccojuguetes11 = "https://lh3.googleusercontent.com/k2TZblnazO1dn-3fp3R49eUbcO2NUohgO8E5SQ8G6fYihjyNVeWFiT_Es9RuuVXCUVztIMy-VAwjwV3vKhwdtG1Yyp1CSC6nSE5w5SazfJRMK0DTABsB6NzCmweTTuO9BGWQaLvEMqHYCtgoYMvmOidEwHnh2R9E8Tn3ASQiIjn9a48riCS2Mmz9weaTnlTemTaAfu2zBXYRxTgWuVzNneddr496Oofac9sw0Ng8z-ObSZBfSnJbncfNDHhL_WWUWRDd6TaNjyoi8Fh3vBvT3tj8hqR4XDDfPP512Y9n2Id73K6NYH_VLt5TsMAWC9lN09weJ0JB5PreuGPRyaonkkh7f4lX_-fRdwCNU7Phn9KhLVHlJVv-C9cymAcl2RfNDvK0U46oXqcNFID2NW6rBnTTKCxxwwZldi2hSOyA4fXD0gkkQopqoh_RR6sCT9CxEv3isVJXEaJTaQA2EzN_Eqh9EFCRHUhni1zC2KF3D6xwLCoa9viuLcjj7SgU3mxcgJguwm4cilcUSSrZ--UaVz0OVEQAxfFExsJQe9fupfg0wxZDOFnbk49Eb_9m216Q11XVUUwdaT3sG4FrNe215MMrcsKrQ_l1xqZRHjaP8ekjxFc3Onja8rZht6qgJvIQlh1IUopnOzOw8GdxcGRHchLyLcZsDzhb9WCwcUtCZSk=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes11);

        chiccojuguetes11 = (ImageView)findViewById(R.id.chiccojuguetes11);
        Picasso.with(this).load(urlchiccojuguetes11).into(chiccojuguetes11);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes11.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes11.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes11 = (TextView)findViewById(R.id.txtchiccojuguetes11);
        final String stconsulta = txtchiccojuguetes11.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes11.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes11 = (Button)findViewById(R.id.btncomprachiccojuguetes11);
        btncomprachiccojuguetes11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes11 = new Intent(chiccojuguetes11.this,webview.class);
                btncomprachiccojuguetes11.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes11);
            }
        });

    }
}
