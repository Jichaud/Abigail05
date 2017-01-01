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

public class chiccojuguetes21 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes21;
    Button btnconsulta;
    TextView txtchiccojuguetes21;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=414a00047c3e34830aebd30c676a254a#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes21;
    String urlchiccojuguetes21 = "https://lh3.googleusercontent.com/NjolME4mgpi3eaM9pMRuZJQ2pwKedv9yx1GcR6zayOs_PeFLHTAmVJSb8OogbsrdPQ0wZPZ_NRLrPiYxAb0MkXaZeg0d1V0cYxUYI4-BSUbcpOUm_0_pEIbkooPgLXuFqxzicFk3jYS5MSSXVr5awKzg3NFqtvvZ0iNhz4nTCA1nrMJQ54rN6fLu-UKtZVePkGDBvB5FALfax6AZIcLzN3zeg3bpEwk8ykbrCEAdKzPlvr3NxdcKYkQjhe5JujtE8QQFqVOG8fpvxGf1AgJ50ZRLQECxYyAheWIcroXaG0SBZVeamzMCnm1NW-bZlP8yvzSJTYtvnMjpTzUAPNj5C4sMV3ZRJPBZJeZFnE1QTz9cPorhPKD23s_dmYG5nPLlTrHfGeNldspJOO_v80KuuvO-CImpyLRwzWzIuiT_R5z_37yEu7rTDgLSiXZvXy8tCqLS9xlztzZrx7samU7nnpLmSa-GCPynX6S3z48gWUMv_wY72JdnyMaWf6Vaj0vUgNqmvykRG0MpzQL_13FEEzjT6GI4D8aGIgKdj2-2XdscAQjPgg5GfnDlNbtlZnaZQx5tTcwtV4X4fLF0tgA8S4gXmtav_X3sjUUi2IyUfjsW3Pb4NIA3D_cWTblutskavU3KDNInu2Vnp1ga0w4LHTiKjVPcEMpDte-kCCGtCa0=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes21);

        chiccojuguetes21 = (ImageView)findViewById(R.id.chiccojuguetes21);
        Picasso.with(this).load(urlchiccojuguetes21).into(chiccojuguetes21);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes21.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes21.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes21 = (TextView)findViewById(R.id.txtchiccojuguetes21);
        final String stconsulta = txtchiccojuguetes21.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes21.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes21 = (Button)findViewById(R.id.btncomprachiccojuguetes21);
        btncomprachiccojuguetes21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes21 = new Intent(chiccojuguetes21.this,webview.class);
                btncomprachiccojuguetes21.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes21);
            }
        });

    }
}
