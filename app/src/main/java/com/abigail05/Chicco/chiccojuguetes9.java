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

public class chiccojuguetes9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes9;
    Button btnconsulta;
    TextView txtchiccojuguetes9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=badce095a082b537d3b879b73343fddd#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes9;
    String urlchiccojuguetes9 = "https://lh3.googleusercontent.com/wWmHdr9mSzmsTGoMs-gmolAln8YPGEos_zRIBGKWjDPwCVzCT7_HnA9KkK42ubGtRz4QySzvCPbKBeYtTrMP2Y6F7yANzkY1B6W9r52qsRVF6BRhuLOah0FrwBPl1ZeYqHoGxeo3syYd8RbOo9tcHfwxAY82h1plLAK7bprWpnKR40AN5IlhutguBYwc0USMYco8L4J2ujDZTmc4BVujnvCmNAKUWKQUWCU9cVc5GSjNwuFIeHkHR35IR_HEXBLkby6rl6TYp6zq96cHbe2AOgzCC-Y9tXKBcAsQvNeSpq1woeSZvXkmlqPh2VxrfcTJ70v1-444jIBov4m3VFyQS_9T_oi4lle157trtct_cMiS7QULsM4YW4EpWu3rqB1PPSIxDJNkIC2pPGFVP_w2n9HP373YvNfyUaq1v4BzU8rrnv1hMczvdOleXzQK0jklVXBInf6gH7fohPWqtD4Vr7wR1-xjOVqJYmnBUmQLPhEvIzFfjBTL5TLFinPv51SfnBblC0h3IQ3T_n9l1wSGImMmjW3L-p08zBoRRVjjeiBzwB00FRjfZi_YfWrTjoRdsjWR4zoG--W16DOhvINUkA41xweGT0WuNjlg453bTKpPEfPGP8n5o65f8mACCeWMCrwopIP5pqYbUYCtGDJ94xLI11UePNYVUpM44kohVf4=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes9);

        chiccojuguetes9 = (ImageView)findViewById(R.id.chiccojuguetes9);
        Picasso.with(this).load(urlchiccojuguetes9).into(chiccojuguetes9);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes9 = (TextView)findViewById(R.id.txtchiccojuguetes9);
        final String stconsulta = txtchiccojuguetes9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes9 = (Button)findViewById(R.id.btncomprachiccojuguetes9);
        btncomprachiccojuguetes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes9 = new Intent(chiccojuguetes9.this,webview.class);
                btncomprachiccojuguetes9.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes9);
            }
        });

    }
}
