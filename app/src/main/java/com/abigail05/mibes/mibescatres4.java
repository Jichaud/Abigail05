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

public class mibescatres4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres4;
    Button btnconsulta;
    TextView txtmibescatres4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=884b6c52704d5bad3e78531bac9b2d52#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres4;
    String urlmibescatres4 = "https://lh3.googleusercontent.com/LjkPiAnbXWn60WFWgvN_pBfxpX9NSqENVq8xBqxSgvcTelPJ-DD2eoiOLOvkUOpQGHYtjN49xXczyalmqQoldAqbX_n8unj6DXEpfZKLLu7Pw_jdPkGd98wy1YdS51CexR1F_I_ek4rWc5D4zRd_gQtkp4OnuaO6Rg0zttI54AAPY5Lwx95ofGrxbXmcuTdF2lUuJwniX9TeOm5eraOQBhBBpW5kTdktxyu_Hfu0A1Y8UkzUno4504lTLl5p6CvvPN477W2YokyF2vTSlXi5Fe-MKYSWW-U223ONk7swin73mIRyfNHeLtl-cZipNXbkGSAOp8zOk_WU24-fbjFLU5L0KszI7yQax1p-KQHWK08ScX5fQtNV9sKXwfxAsbPV4rmirURcJZZZzdCRVSLBrQDwq0Sk4MvH5UlkWOBYhe3LJHbD64eyxLQxTXLtyR2A1m-cPN3DWf1JKacsZrLO8RloQkhHsRgnSSr8UxM4x4oGhditQQI6jAlyoygdNUVJD0KDxD5taJwkhNFWU7IOYzDG24UL9PziS_NO_HygX5cMjY1EaolBDPOceTjoCT6N4sdajTxxrruE0ZneHzZAj7VQ-ur0x2IOm7EA4I1Bh1D7EiFf_pw_b7tK_2CVj_J-OnTrVpM40SxDOv-BfOMIzHcWjJhXt9bwWW7m7TnjW24=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres4);

        mibescatres4 = (ImageView)findViewById(R.id.mibescatres4);
        Picasso.with(this).load(urlmibescatres4).into(mibescatres4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres4 = (TextView)findViewById(R.id.txtmibescatres4);
        final String stconsulta = txtmibescatres4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres4 = (Button)findViewById(R.id.btncompramibescatres4);
        btncompramibescatres4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres4 = new Intent(mibescatres4.this,webview.class);
                btncompramibescatres4.putExtra("string", urlcombo);
                startActivity(btncompramibescatres4);
            }
        });

    }
}
