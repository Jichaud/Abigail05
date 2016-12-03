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

public class chiccomamaderas15 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas15;
    Button btnconsulta;
    TextView txtchiccomamaderas15;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=77dba17f306b92bb6731a83216973346";
    ImageView chiccomamaderas15;
    String urlchiccomamaderas15 = "https://lh3.googleusercontent.com/XQGwPBPbLIHGHMfPiZekU7fII6Y0DzUhUN0VhxSm5zNmiv_EJXi4p3L-lzbZcpsW3_sjnZfI_6RQtekWtr3AfYtP9b2eCIlAWZQQOl0FHSE07oN9_KyPxGjhdU8rWrOnxWoO5QQaLUH2L3N_rd6uxca2055KrQAHpOUHdhmtK6l04RhWjkd5P_kPPuLAXhiRecAtUdLBkY0RD7AljjbNG8ol-htKASnn9aFuUT7AWQXyCyuSC4kK4i3PhNN2V4JwotegSqGjAndR0TcWoRHVXc0OmkbeHK5JsUpcsoVTXDjKudMQTBgeuczbMJBQ0CIxVDc9hzvJvkY6sRXIypFKRTR41WMXRuh3dXFAKX2Ggw0y9YSmWpSRpcsN_MYIu7oZQTO_6OgRkem4mHxdN_0Pm3yADy7SGbZ7DD0pmpGiOjGtTtLF7zSGqAjztQwiOnz7mvt_6d-zsMN-8bi1bmXmRMHtYdbgu0Zas1Q6DBDdcrvMC6IwdXLFhn3ZetvVsZJOjfUHpbi-1zcP5ocCENr8pRHtcxm_JbdlVWPio9nYsqmoWYwaYT0M_MZyY2BAtYy3UWX24pycUPB2jfcvwBeiyPWERtRLwND4Iz82Bm1WsSiaNdtxXw=w428-h460-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas15);

        chiccomamaderas15 = (ImageView)findViewById(R.id.chiccomamaderas15);
        Picasso.with(this).load(urlchiccomamaderas15).into(chiccomamaderas15);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas15.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas15.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas15 = (TextView)findViewById(R.id.txtchiccomamaderas15);
        final String stconsulta = txtchiccomamaderas15.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas15.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas15 = (Button)findViewById(R.id.btncomprachiccomamaderas15);
        btncomprachiccomamaderas15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas15 = new Intent(chiccomamaderas15.this,webview.class);
                btncomprachiccomamaderas15.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas15);
            }
        });

    }
}
