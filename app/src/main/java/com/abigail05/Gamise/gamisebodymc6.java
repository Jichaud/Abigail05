package com.abigail05.Gamise;

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

public class gamisebodymc6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodymc6;
    Button btnconsulta;
    TextView txtgamisebodymc6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
    ImageView gamisebodymc6;
    String urlgamisebodymc6 = "https://lh3.googleusercontent.com/vQRg0jzNqK4knMmQt-f_DRDfbWZBz_-03mS1A9da0YJva_vkkRZLjQ5WHDEPssyVthjNDbkypaCvDmAfVNOGqZ_HH9Rcuk-19_skImQ9ZbGquqxrGeU-X94CsqNavIkx3sRu8LIE9bslps_1C6i40Vf7D8VxqOpHsB6L7syZdX2bPvlMEVEnWTJQwj_6dk0BN-DCDJmbYpTTMBGsn5-crbfKxWzhjC968FBpJGXKrz4LhqhRrZSebTMpw9_I_ATAnmNK6A4do51mIHQ3bAHvlwc86TEjuuTMcIkxmXkh696l5tbN-xco1bb9_6xMgly4Wc_h7sB_uWy5VLjz1vvXD7uEKv_kmn8WjuDW6Nb16Ftyp6FJ-mLGGqIaKvZ769UAq6_dMlxb7eHlH-9nvxqdyHQqQllYqSLV8Z0NCMY6sQgc7iPjPa4esAMTc5bAnJ8XR6tN5vUzrNwSd_2-GkH0ONpIE-fDwmuXxXFV6UYJt5Qy_FkexqAXo5LsdDqim1dw8qsP-ipuS--75QiBs2cRGetEPl6k-FPqylXAPNceyt4lmtpcw_REuIXH9FraqpUvxKnyqjOBM2x6XeTNAPF101pn6FTdaQRNOnWkwDTh9BvsY0aGjRWe6BxfmOo6ScbNar1JtbzpP6Ja8PWNA6qPgB7bAIvxNIN7J4x6i-uXPo8=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodymc6);

        gamisebodymc6 = (ImageView)findViewById(R.id.gamisebodymc6);
        Picasso.with(this).load(urlgamisebodymc6).into(gamisebodymc6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodymc6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodymc6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodymc6 = (TextView)findViewById(R.id.txtgamisebodymc6);
        final String stconsulta = txtgamisebodymc6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodymc6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodymc6 = (Button)findViewById(R.id.btncompragamisebodymc6);
        btncompragamisebodymc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodymc6 = new Intent(gamisebodymc6.this,webview.class);
                btncompragamisebodymc6.putExtra("string", urlcombo);
                startActivity(btncompragamisebodymc6);
            }
        });

    }
}
