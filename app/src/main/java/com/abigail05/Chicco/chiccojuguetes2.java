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

public class chiccojuguetes2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes2;
    Button btnconsulta;
    TextView txtchiccojuguetes2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3182c7e12be43e667ddb0feca7bb45d8#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes2;
    String urlchiccojuguetes2 = "https://lh3.googleusercontent.com/2x5NU_TCWiHKY1L4XbPfakjTcEH3jFlNKldLY6a8-st4mXlB2ORrksc2nrACrORZZ_K25j2N-kv_DlWJ6-2CEtBLCxxuWV3jEjxMt2MKzwKD8ONdXDDWpvDq46oZmmGeA2xORQe0IXmaVaENKA2ZDAp3LicmOy9RZCjcH2Vc2NkFoZAfYwB01w7GM85yyC67hlz2Kq4pC-nH50ZZ1GUyJMnA8NX-Kr7FH7hX29X6XcRAllWg3Hb_mmrLa8SwlBjhz4jgQH4qFx3XWf97OAcxud3-NHMRUR8jb7bwzXq_uC8b7_JBuEoldaYKM-ED6Wg2lyH2abnWEzt_CkVqrMIh6ov804gOM_ovYI520Ieiz4K2I71h8EwvrK_IMrOK1W07dyDqejCUsyyE4Xil_xEZPvGjEI9TZNBxkfQcMQ3HBps1wkBSGx3JbfRKZx7hyPGGthZdK7UT7rM4T2oD9y-btnnNOJmg_NvTFq8a7o-gZFTa_-G-MvfKH4ewJ1hBHYEFiVcb9g9wVo0Q81Hyxq65AFg4YckKRqmAsuDxLV_5IUc7VI1pS1TioZgnCDy44HAbDkKqxt4ycvQRO95-6qq56AAERxN779KoI2LbUHkrkU2UmAY08FRoORDA56-EKrRFGj_Xhj6NRTWWScf5S_fziFEpRaRHVh3M15oOiR16uWM=s451-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes2);

        chiccojuguetes2 = (ImageView)findViewById(R.id.chiccojuguetes2);
        Picasso.with(this).load(urlchiccojuguetes2).into(chiccojuguetes2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes2 = (TextView)findViewById(R.id.txtchiccojuguetes2);
        final String stconsulta = txtchiccojuguetes2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes2 = (Button)findViewById(R.id.btncomprachiccojuguetes2);
        btncomprachiccojuguetes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes2 = new Intent(chiccojuguetes2.this,webview.class);
                btncomprachiccojuguetes2.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes2);
            }
        });

    }
}
