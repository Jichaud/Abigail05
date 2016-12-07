package com.abigail05.mibes;

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

public class mibesaccesorios2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesaccesorios2;
    Button btnconsulta;
    TextView txtmibesaccesorios2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3b36ebbb42c777b786680a9fff6861b4";
    ImageView mibesaccesorios2;
    String urlmibesaccesorios2 = "https://lh3.googleusercontent.com/ohW0zf6gbTXRh02BFlvx6oH0vHOFxWNaVYOQk5w0NDE9GV20v0Xan304ai3JsDefw0yfVE8hHe-nFJfYLLzgVf5RY6NvzdcXNUS58tSDja5YYL9C3qv9Z4XvbX7IFjwkO81usv7f43FzICQ1709Y0R4hFRDNbgq17_HHkhVsCiip2q2fhWg-VQO_1RRxo8HzDM-9i9br5oMm90SJM-1PWlbF8nSNMhWZhc57pVl9j-Jb6glEz9ajZrXZ9IB3ZKrRzPvcJ-S9o0_CtuprucEnP96nIV5pl6W1OeIx_yj57-vPIez_XkglDfJvLOde-r_Jslt0Ux-fZ17CdzJOkCOGhZMMwdDNLyRKxQKYbbZRpuEVytvfiGchO93fQkiq-FM3jw9c_Z_vh5I4zUnJOMQ--4O_mdb2PPB7DCTWUU2Iwa1Iu_bAd1G1fDMO-GV1BFYjnw7Veiaq_SErvRMGL2EAOiszzQRe0fIcfisN7k0hEn_1PYMkOAcazA_EoV7EFj-PNHN8sU0st_IcyEWh3LSSXevvMANf9y6cFeLtdfKgqW3AM1rOclU6d29sYWSF_Bqjo6jQaIOtuouXzIvPDGA-6V0KTpVfWI3iEK97SQAJuwrx2LBrxj7m7k22OV06gKZRoGseHxyZRShUOefhJRkZTNYdswp0YtcXl6dYtSf6Bpw=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesaccesorios2);

        mibesaccesorios2 = (ImageView)findViewById(R.id.mibesaccesorios2);
        Picasso.with(this).load(urlmibesaccesorios2).into(mibesaccesorios2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesaccesorios2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesaccesorios2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesaccesorios2 = (TextView)findViewById(R.id.txtmibesaccesorios2);
        final String stconsulta = txtmibesaccesorios2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesaccesorios2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesaccesorios2 = (Button)findViewById(R.id.btncompramibesaccesorios2);
        btncompramibesaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesaccesorios2 = new Intent(mibesaccesorios2.this,webview.class);
                btncompramibesaccesorios2.putExtra("string", urlcombo);
                startActivity(btncompramibesaccesorios2);
            }
        });

    }
}
