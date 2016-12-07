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

public class mibesaccesorios4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesaccesorios4;
    Button btnconsulta;
    TextView txtmibesaccesorios4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=45f1077793d8fb52f9510a4e511a2db9";
    ImageView mibesaccesorios4;
    String urlmibesaccesorios4 = "https://lh3.googleusercontent.com/hqneVFnTMqQt7PB8dwGcDz188EuSJMGb36xl2Pm_WhSAB0GQ_F1bAmuLg12PCTVKlshXn6md8WuLqVIz5Fwfl14oSsWR5Mlhy4e6xx-Vgt1ND_09wa3SWQBAfH27zXrQM67an9YeE7J298UqCtzpX3d5_O2VaPKtDlE-DaLuBc-1Gc7fusce3-OwmFJ5rIQF_AamEzqudPwEuxoW68741twoy0UvP7rIIm9XYaGr62ANSMkR-zZMBbClCIHCkp9OcBWFyDQFabEAi3zxnjqywgTyou5TwZ_Kdt8ZUPUXi6cHAMSnoCy7Zb9GaVEB42fSF0yap4oLOj0G1ms1lwFLfQLkv0N2ypd3CWaBVLlk0ax64BS47IU780OZStDZwJydgVkke0wLX7nqcjP5yulzSdFnubkmnzM0aJGydjm94rabscu3tXBC_DLvLNmkNw_pEjxVFCSd_jBLaiaXDJVrOUDKshrw0lwHfz2BxYDx7mxyKL3sXq7b5TMZHYtzxW42pK_E20RJoLGoMl60GC-CF7qspX-l_IDO4fu42BOPDYLsbyMJF55YjKyQBarmCZsH2GA6uV-y3LjLmXHNx0W3girGvdeQJ0SHE24dSCPwcgTcLZT-GP09cRYu1m3aIj2-4YOVeK7LMsJnUev2W9lJdJukgWy-1SpaNC6YNQ1rSB4=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesaccesorios4);

        mibesaccesorios4 = (ImageView)findViewById(R.id.mibesaccesorios4);
        Picasso.with(this).load(urlmibesaccesorios4).into(mibesaccesorios4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesaccesorios4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesaccesorios4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesaccesorios4 = (TextView)findViewById(R.id.txtmibesaccesorios4);
        final String stconsulta = txtmibesaccesorios4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesaccesorios4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesaccesorios4 = (Button)findViewById(R.id.btncompramibesaccesorios4);
        btncompramibesaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesaccesorios4 = new Intent(mibesaccesorios4.this,webview.class);
                btncompramibesaccesorios4.putExtra("string", urlcombo);
                startActivity(btncompramibesaccesorios4);
            }
        });

    }
}
