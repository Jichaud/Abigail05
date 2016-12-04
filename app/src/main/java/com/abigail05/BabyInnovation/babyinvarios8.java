package com.abigail05.BabyInnovation;

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

public class babyinvarios8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios8;
    Button btnconsulta;
    TextView txtbabyinvarios8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e08f4a83bde266f528748f53ad1ba9f3";
    ImageView babyinvarios8;
    String urlbabyinvarios8 = "https://lh3.googleusercontent.com/r1qY_F7WeY7jY-75I_G25XnslvAcd6-SmJvgk4gaF3sBcsNSdt2O9QEj3wjZxSKrY5jOcvKno1HhtkvbuoW6VaBnBxMd8gVpBYA_4Q56VzEDVz5wBDwFwAouVDTsA1yTo2oHo3LAxGR5B-7bEbYbx425V5ZehfxtMNjBlZ76VlDCNsomkd3DYwae2GzbIIWP5IXFS-4Bs0OvnBggkH5d5eQShgnMBPnVOSGV58PGU2zFZWrihMnlTQVh_jOci6YZRW7G6YWqi_KuIcUYxsj1oSDxswQU2iMHt0jzSmwJ8o2PXqxvzcnWIP-ja9X_6MTGeRmn6UXOCFs5KgjKJ-LXypKrvmj7NyAA_nR3pN_eKNbL5CCF0-vP-cTpM1tAwholEY4j4ioxMXT52h1nhub4_hrqJgid-TMiHNjnsGsiPr0StqCJTE1lkOqGQvV6_VvNwv_4yR_fg4BVmufnTTVd585pYxIeBN3OxmcENrIDaRJ8U0p2f64gmqxhxdH_2oF4w57S0Mub4GMqY4tsNNS-zWRkwPSPt4YG785mzC0kdTg19xkDcF7Y1mV8QX0CUQw2a7F8bLSvrg_jqe3LOmlTXerGqBZRLDFjQyGr3pjSu2GUwYZedg=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios8);

        babyinvarios8 = (ImageView)findViewById(R.id.babyinvarios8);
        Picasso.with(this).load(urlbabyinvarios8).into(babyinvarios8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios8 = (TextView)findViewById(R.id.txtbabyinvarios8);
        final String stconsulta = txtbabyinvarios8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios8 = (Button)findViewById(R.id.btncomprababyinvarios8);
        btncomprababyinvarios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios8 = new Intent(babyinvarios8.this,webview.class);
                btncomprababyinvarios8.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios8);
            }
        });

    }
}
