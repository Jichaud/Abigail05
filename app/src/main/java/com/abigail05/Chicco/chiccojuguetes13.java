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

public class chiccojuguetes13 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes13;
    Button btnconsulta;
    TextView txtchiccojuguetes13;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4e277adffcf7ac5036e0702225f86d54#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes13;
    String urlchiccojuguetes13 = "https://lh3.googleusercontent.com/2Wj4pTG1JS-He4lLuBwFKyxY5V864gmvbV-xJ8uvtzP7x2bv1aRr2RTE-rvPxE61vQ2qJj_GOqoCfiVaSKlVA6-3sPRGsRa4uKSU72TjVwARoMcYuJ2sFMzuLN2X2AfWUw0uYdWsf2Zn9rcP68SaZZWfulXAKGblne6MmA3uOU_B71wBnSFymGg9Um3bKzkkDvyYZjpuVD1SXlc4m9q-Fqc7wRTNHT-MxLq9YzcvANLNPvV2mfGkWHgSTsv7jvam8tJuFFDVEWhRanbwy3C3Ll443LZ2FWLb-fkE65GdDmEdsB6ipB3FNP7slmxRCNvhhbrN43ZfKLxoGLg_ZNCWI2nD0AOYcFU9QWHdjxSvUWnrfxr2ec4vaSPvkbPjWHeje-C2m9b0VEnSleOIg1DgCz1Ask30qoolj0w9af0gGH-zRh3FYY4fzXwzyIo0Fpg73FWZxCTvhpjzLyoLNbmoKdUiscPfNkIeDotBLN7CMxWGdc50S0Z0IMFm2faRPy2irLZj4X0Elvsv1S_quQqQxcbYo4XsV5-KVSWnCWfIAhVMNZzkwgiRylUgJUsheysRheLWTianuS5kWjDaSiZnG-5r3a1EsV2lc-K8W1DwmkNvpR4Q7gYSdDssnMNP7wqkBCCns0kRUE8f43yn1Ei0_Ph3DvLSs-Om02yhgcJJHg8=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes13);

        chiccojuguetes13 = (ImageView)findViewById(R.id.chiccojuguetes13);
        Picasso.with(this).load(urlchiccojuguetes13).into(chiccojuguetes13);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes13.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes13.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes13 = (TextView)findViewById(R.id.txtchiccojuguetes13);
        final String stconsulta = txtchiccojuguetes13.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes13.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes13 = (Button)findViewById(R.id.btncomprachiccojuguetes13);
        btncomprachiccojuguetes13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes13 = new Intent(chiccojuguetes13.this,webview.class);
                btncomprachiccojuguetes13.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes13);
            }
        });

    }
}
