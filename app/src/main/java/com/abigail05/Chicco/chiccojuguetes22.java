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

public class chiccojuguetes22 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes22;
    Button btnconsulta;
    TextView txtchiccojuguetes22;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f0ded81c62129f9bcc4372beda3a0ae3#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes22;
    String urlchiccojuguetes22 = "https://lh3.googleusercontent.com/mVvjJvXraPz4B4Gurx2MUmoTpLeMHL4vX8tcmoi_RbFq1vEfMJI6GoZwVzN7qieJQN31l-sLeeW07YYGXE_SphBGKnocCN9umrYuDntGShvmWSzp8WtQCksxP1wP9KqNO3ulchXaAGEdVOpxn2OVR3h-_rEBnWf57K7YKCqvtx_kc91E_aWP3w5Zyd_Y-LttGMqXcjYG78ZnKPs8Ynn5TP_-dnZtJ5xObB1n3JrDTsVfSoosZbpxxekBXuxCWEXjjgDbJDPIsVB7DgHmylo9OUz8Krc75KFZZoOOSdiEzfBWKXM9mN074_FXNaaa261zDCbElRz-QrQNveazLouP7zcQhba1ckwgpJ9dHDDlEoAy4afqmIWelCAUOzWWcM4fa7oehK2jnBVW-URPSdM9upGvzHyl5j1e3GdnziOg3ODTlCwDtxjXAIn4ViPL4CwBC1JvkPwR8Vf5m9BCLx_aGJsRAsJ3-OpELyJSkWgJhiJZ0Ox0U2VNBItmAySbiV03-g879RjI_CHgu09G3mH8LgYhWvcdzdvfQFSR0Agl0k0o-U6s1pIK8V8a8ck_8tRhU7TlYaFjks10YihFMs4TVO91XZTngeTIzRVcUBHZCDVu3N15aWxq8wFDUrhR21Vw78c_aYfTnfFRP4hcuKYRm2HC9S6RvPyIHEtAqpe4j54=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes22);

        chiccojuguetes22 = (ImageView)findViewById(R.id.chiccojuguetes22);
        Picasso.with(this).load(urlchiccojuguetes22).into(chiccojuguetes22);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes22.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes22.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes22 = (TextView)findViewById(R.id.txtchiccojuguetes22);
        final String stconsulta = txtchiccojuguetes22.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes22.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes22 = (Button)findViewById(R.id.btncomprachiccojuguetes22);
        btncomprachiccojuguetes22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes22 = new Intent(chiccojuguetes22.this,webview.class);
                btncomprachiccojuguetes22.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes22);
            }
        });

    }
}
