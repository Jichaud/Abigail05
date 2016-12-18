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

public class mibescatres6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres6;
    Button btnconsulta;
    TextView txtmibescatres6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f69e2789641775d6dc4eda1359e2eab8#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres6;
    String urlmibescatres6 = "https://lh3.googleusercontent.com/aAMkJ4lJi3EtKF2VNtGm6Di1rW0No7OoiCsHPJZybrPdFbnsGAUj1wfv_YtO5Ma7iAsY-ZtQiURBXUsb6yxoho89WWapu79eoHBEyRZXo5r3HtPjuwENGS5jklCaoMyDD5Tb_g9X6ZobuI5CvDpQEJ4mlrMdrsd7uCLnZnHQBTKfcrjvny3-McYehlcug4lpJyq2t35xbfNjS8ajXrKo-6_MyyrWD065ljrhN-ffVbUNJNVldrleAbq8usB6HyDbxce_SmcGUWuNBVDZ15iWsnpYwnacxSxCVLsWN4Y7HYTh9DWD5pCtZ4ffgSCE-_OwEE_PAdgg3uENJHTb94H5cc8zAfrCajeg8ajnun3DZggp-QN6ghZveo7SySTr8hhV3yVvI10Ahud_zqD4QvFoqNEVgEx2pQWCJ0Pzahz8qRVAfieVGACvu6LcMMcpqinekSnJfOWUE2Sb3nQ9i19V9lHQ_DIxKNKAsaQYJymcUqgEB8sQf_5BLvvaWeDM0r_X0nXRRg0WI1n44uudcHbEn27hXCy8iULFoUt_vFNAU2ys8RJ7b4x6XVW8GDkOQqoLFBZXbpwKg1CUzzCDYUr9MVtImlRnUqi937nSNcn3CUd0bu6HBzszw9qK7DcvPXgghXSoB_PIFqOKluUjgOnN4GnJwrsD2AG6Bf_MgvzRJDU=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres6);

        mibescatres6 = (ImageView)findViewById(R.id.mibescatres6);
        Picasso.with(this).load(urlmibescatres6).into(mibescatres6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres6 = (TextView)findViewById(R.id.txtmibescatres6);
        final String stconsulta = txtmibescatres6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres6 = (Button)findViewById(R.id.btncompramibescatres6);
        btncompramibescatres6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres6 = new Intent(mibescatres6.this,webview.class);
                btncompramibescatres6.putExtra("string", urlcombo);
                startActivity(btncompramibescatres6);
            }
        });

    }
}
