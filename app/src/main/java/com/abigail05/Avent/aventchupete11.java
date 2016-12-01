package com.abigail05.Avent;

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

public class aventchupete11 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete11;
    Button btnconsulta;
    TextView txtaventchupete11;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f115f600618b5c3ccde7ac1205a3ec7e";
    ImageView aventchupete11;
    String urlaventchupete11 = "https://lh3.googleusercontent.com/jg2HAiro_zIHXxx6mQxTbXznVLfGeYXXD3e2ualOG6QFZqpdZA0SEPrbmGf4rNK7n7UkzBt_QTEGR8yA4TTE99Q2fHM6zu1ZFEZcbwLNrQSCBUZpT4xh1kFQDwdJhqcHlW0H8doQUrQQ6HBh3x-b2cvF1i60jaUhlnRnwGfP_KRlDEEg7THPp3_qOD7Ztn30VVaACqgo1iw9H-IzqPpoabNAw8e97KtAVfOXoHc3me_beQBNW-iopIYPaZdByeDLIGGDDrvmQ25zaY5GxhJwH2uONbIN3b68Nz42XcYVh5amaUifoLzbWcVk2Nedko0f4_GsafHeO_oMLHBpyS-f0wqsBB_XpSVVN85Deh8OHUjNVxLGXiWy_WDv7us2Kx7ITKNhs1SwiCpHUbYUKC-Lmbj90EFIbdx63nmaUu5Nxjafxgi2TRBoWmk3bF3oA55qjoZTtclSLwEdsY9CY5hmQMT-h8NtrLqddq1xG_DwOICo2_1gdnU9AalvhVN93NO4Jk8cTYoyVQCwpF5NotsG-YVP83PVYKkvhwd4NgMVrRLbtrcIgoTYa_fy5o96lTUm4rltXekqCpDfXyFkMvuqAYeD5oiVgnRyAOrckDSe4Snge1wjcw=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete11);

        aventchupete11 = (ImageView)findViewById(R.id.aventchupete11);
        Picasso.with(this).load(urlaventchupete11).into(aventchupete11);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete11.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete11.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete11 = (TextView)findViewById(R.id.txtaventchupete11);
        final String stconsulta = txtaventchupete11.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete11.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete11 = (Button)findViewById(R.id.btncompraaventchupete11);
        btncompraaventchupete11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete1 = new Intent(aventchupete11.this,webview.class);
                btncompraaventchupete1.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete1);
            }
        });

    }
}
