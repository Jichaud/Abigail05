package com.abigail05.Babelito;

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

public class babeaccesorios10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios10;
    Button btnconsulta;
    TextView txtbabeaccesorios10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e45c861c8a62d3f6d22f4575f2d80c07";
    ImageView babeaccesorios10;
    String urlbabeaccesorios10 = "https://lh3.googleusercontent.com/-Cc_g4ybHAEaeqV6InStoIdlDrV9VQM9EXJhUi6_J3emiQnEqRRI0ytlHEw4MsfG2VoE-xyPMWCH0D3SVgvb2bRwOZuQQhxtdyX5i-S8BdksL1LUQ4eQ3OSmk68_fZgZF3kj1_IypYndodbcWVTlrUINX-kxjhEQgjT_VwDFa2jydbJC3YXmNZFzTXJ4ckTxEMlz9H40bYTivvuwm1wCs55kVUsWA2TRo04qUETuPJ37r-b2tGBGHNZVTdEvKjQmBIIlJfE2XDLVMsU30c7vxVB1p2JWA5EkMEJ9u1EoscBttusZExTAWtw0yL4TX2lk9FDT9erJAP-bTn_LiKTsWSYk_NJEGruf56rA9rk_lQC6hqv6yfXJSwkkZLWY4xPQ1UHzpvDTw_fa-7cSx2A00oG42YGXWs8sV9FphMtUmVBUOhvAk0sl0-taPWJBL24f8fju1uW9tZ3Zxurw6j30Rsb3FDD8jM0z6KJxIDtgwIqhAy55qcblsvyGeKSSsgI34prERMeCDPrZvWw_lmVHkTJGFDGC1wp-iwju89d8I_lBZ5hSsBxhz5U_kjtN0HAlJjUK6W8trVv9jY_sbjjKjofakrWpy1GZS5o5T50Kj51LTX9aBg=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios10);

        babeaccesorios10 = (ImageView)findViewById(R.id.babeaccesorios10);
        Picasso.with(this).load(urlbabeaccesorios10).into(babeaccesorios10);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios10 = (TextView)findViewById(R.id.txtbabeaccesorios10);
        final String stconsulta = txtbabeaccesorios10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios10 = (Button)findViewById(R.id.btncomprababeaccesorios10);
        btncomprababeaccesorios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios10 = new Intent(babeaccesorios10.this,webview.class);
                btncomprababeaccesorios10.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios10);
            }
        });

    }
}
