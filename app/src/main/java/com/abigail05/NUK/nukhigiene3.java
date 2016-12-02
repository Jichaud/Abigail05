package com.abigail05.NUK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nukhigiene3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukhigiene3;
    Button btnconsulta;
    TextView txtnukhigiene3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9e7bbada21f19d65a52ff3812aeeb8ba";
    ImageView nukhigiene3;
    String urlnukhigiene3 = "https://lh3.googleusercontent.com/Ep62l4aumCAKKhuuDnvkFdMCMsgim7oIGluBF-_PwU12g6PkLEjtaHulxtL_TOghD1z4aoasD4AUPN6m5GEvQXVwFtY2J4UveC3AZUtdQPwKvURnSpywXvRJ8I6JX-pBlxtFk8GYg4fCRPkavPXXBC0fSaI0jhMDKehfB2aUzf44EMIATy_5pAbDn-1ULIX43UJOqZm5y0xAP_HYfFBulZojUR736hx9n_5TSNBnT1SCx6WlENbndeTxnJCZmPZMeVxeJoDOQPT2a4D0ZV7ru6DPXxh5n2cG2kGFqYaKW2Imx6Zj4X1XmCvK-N-U30VUjtUQTfFn7rcl38CWn6n6g3QIdPGhiyQlKkiYi-cYG-OA7UX0KooXN2faNa7SHUfOA9un3eIl5NNWTzWR2OV4pvYaIujuy3_2kMAmu_nMVNQWCQW_NSYnY86iF05DKpdeDhJLY-v_RMHt1hkaS0_y6hWHBDxzS3yo3gCRCEO_BkOL_foWpkkMYRcl2K66EE6ZAXl1ccD5MkP6XMCqYFWyQ1KClwlON5kElJ6s9dFTwfCsDko88ZGp5UuszokgfPAHPYYgQbnbTt1S9e7ePHIAfOieuZu85tjcsU1U_hPGmjuGDEBCcQ=w405-h328-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukhigiene3);

        nukhigiene3 = (ImageView)findViewById(R.id.nukhigiene3);
        Picasso.with(this).load(urlnukhigiene3).into(nukhigiene3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukhigiene3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukhigiene3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukhigiene3 = (TextView)findViewById(R.id.txtnukhigiene3);
        final String stconsulta = txtnukhigiene3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukhigiene3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukhigiene3 = (Button)findViewById(R.id.btncompranukhigiene3);
        btncompranukhigiene3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukhigiene3 = new Intent(nukhigiene3.this,webview.class);
                btncompranukhigiene3.putExtra("string", urlcombo);
                startActivity(btncompranukhigiene3);
            }
        });

    }
}
