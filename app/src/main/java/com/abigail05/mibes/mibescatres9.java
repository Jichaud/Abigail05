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

public class mibescatres9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres9;
    Button btnconsulta;
    TextView txtmibescatres9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ebc905f519d4dcde4bea6ef69e4464e7#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres9;
    String urlmibescatres9 = "https://lh3.googleusercontent.com/w0kVgYV3v8ADpg6ngJlQF6SqA5tWaxAc1aBdevXP4DTXaaz6OufRt8kM1vfu2-oOsXtkAD86ToSrF0CN2nDD9Hedej52gvjyWpR6-IMyv1X3WwuCbAtbV_Yzc7MMHEAHAHuCx-6IxX33eRLEXmUEexK03uqUblwegMJ5octmXFrFxRuANHBmoj3ppkJjqzA4zWxZLGp_gI238lrwB0AEpdheTmmJEW-4hu0UhxQmleQqfJD89Hup6_s1JlfRIJkcXwLKbPpRrwcBYgxa3CrRphPfaNjhhkzugFfXfa92RcQpWPa-CuNC_-aVsTU3loyuPqOqya2fXd2TsL_wX0saDTgXwMJgjYjHxko6wPb39j49dowv5GXWQGpv79CHWeYW_RrApBzpJc20CpbAJLsp9B36EVnEOo0pWOQFqwvt-Dm_nBKnghfjiXRlVpUQ6meXc4HxFaYjJiKZ-IT4HHWtH6MRPt-xtWhHX-MTYEOtjBG55UdXk3fUZmCL4XZvfCK1mXk5VzEljDwuDsPd2RS9bwA4Yd6kWVT5POsoQ08GB5eJ-FxSCpnjWvBdKnnVIKWctVODUI9WbZrIIXT3nlt27nA3j6WaS42GU72Ez9aE96k4DWlKFlOudGZVQBuC7vV7pI862vNBaQCPApD6Bc59kpqyE4aNqWDk66PtlwIR6hw=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres9);

        mibescatres9 = (ImageView)findViewById(R.id.mibescatres9);
        Picasso.with(this).load(urlmibescatres9).into(mibescatres9);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres9 = (TextView)findViewById(R.id.txtmibescatres9);
        final String stconsulta = txtmibescatres9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres9 = (Button)findViewById(R.id.btncompramibescatres9);
        btncompramibescatres9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres9 = new Intent(mibescatres9.this,webview.class);
                btncompramibescatres9.putExtra("string", urlcombo);
                startActivity(btncompramibescatres9);
            }
        });

    }
}
