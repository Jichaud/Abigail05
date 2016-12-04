package com.abigail05.Nuby;

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

public class nubyvasos3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyvasos3;
    Button btnconsulta;
    TextView txtnubyvasos3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=15ab63cbabad543c8762a6bb8a930269";
    ImageView nubyvasos3;
    String urlnubyvasos3 = "https://lh3.googleusercontent.com/SGZ-3AS_EWfbith6Nlf1O5IBNV9csmByyJeAYKQAycD3le9J8iWsBMc86Z-5eHiHjsh_pCKJq-cDgsYive__4Ihf3WvOELTMXj_oSj7MfaZuXWEh7GBFndD3JuNlPu0Xfw5WPus0YQ4TICG4QPK2dQ5_nN_2s1Ga-eUyBq4gNqu0_9Lq7i2oaIyMkuPcddpahnqA6x5CPRsqciJFwfmvLytiz7LVc6U8mgjIz7CtxwdffWlaVbMb8I_qZyXycUUTGM934DJSom_ZHtIRMdyMrCjxsVJ1yUWTfUpOOrXVKyakDzpUjX5wZpAAeSec-k9YDBmWLlGTUBGrFjFuPJcTlwxdPjUVVJRiqX6a-dDFeiSdxwEEgCEmfna70cbQ6G0dw_MFcdlIghv--31aMgmG7tP-3b2ftr38PUmGptgFsZkNc4_T0zL50ptUCF-08ldiacfrzkMkYnR3FjUvigSEMzBN6vEt4KH8Yaf08MKXSB1y8cJRbCDL3BT_yedHx6tSWwmq1PXZgJRs1BPSFT7C7NRtMlYcXxKAHdNQIk5A4P_rOOeLY0UPTRt7iiR2nfe1AJ3jDIubvI7gp9WQozoVJLEZR9ce5pnJ29lbrhYUOp8odTfmyw=w546-h450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyvasos3);

        nubyvasos3 = (ImageView)findViewById(R.id.nubyvasos3);
        Picasso.with(this).load(urlnubyvasos3).into(nubyvasos3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyvasos3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyvasos3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyvasos3 = (TextView)findViewById(R.id.txtnubyvasos3);
        final String stconsulta = txtnubyvasos3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyvasos3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyvasos3 = (Button)findViewById(R.id.btncompranubyvasos3);
        btncompranubyvasos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos3 = new Intent(nubyvasos3.this,webview.class);
                btncompranubyvasos3.putExtra("string", urlcombo);
                startActivity(btncompranubyvasos3);
            }
        });

    }
}
