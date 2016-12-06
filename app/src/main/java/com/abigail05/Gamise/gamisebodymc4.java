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

public class gamisebodymc4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodymc4;
    Button btnconsulta;
    TextView txtgamisebodymc4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
    ImageView gamisebodymc4;
    String urlgamisebodymc4 = "https://lh3.googleusercontent.com/9tcXWuNzjJpSNBhGyVRMoi-qvtVAU_ETXi5JfQPOdydCGneijgIZMX_YMl1AtFN5FdATyceMXBReH_AAnYcqZZJruT4PHUV48bvKmalkpCD2XRrMJhRULpNnUrf-11xWA1g18Mu8L-ogWZQltIwio0nMQ0S1dUNZkBpHfhoxWMKFUlrJdTxUFnG8_5VFA3QZ_zVqf2vGDa66yKn08zBv0XyX-bB_PNPfEtqznH7TLkfN9i4YtqpMQsOtzU0yFvlMiP1vTV-PohN8E30Ydmz7ORW3vojrVtAe3q_UnSdHNDzC04nTLpWErBl4isC9lbvcxEwvhphI4ns0wM-oGQ31RArq-YFiDDxCvp8JnpRucZ3jAq9J_eoh-Cf_zB29ukMd1jz7qy_l8IKvLOAwiFhIC3fwCckpjgCs3eNzzi7En107GvDJmiYND1p_b2NIIyq-v9IIyLTnv-ekjolZI5EM4Pt9sqcR2MDRRVF_xj_8tvSoHMy0l1e2wk10WnV1E3B3zrxMHoom0jZdhLiSDBctth8vxiDDS9zbLSuRuYnISseOtEVsRkiss7Lz_y4VhdHt1IcQYk0eK68zxphgggi7g2OGa04xtZDylwsBjcff2-NKzW5hqtPsrF69EuBHmRV4aTmtw27rQEDRANp4XYNjjadNneBNt4LO-RE_nlmh9os=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodymc4);

        gamisebodymc4 = (ImageView)findViewById(R.id.gamisebodymc4);
        Picasso.with(this).load(urlgamisebodymc4).into(gamisebodymc4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodymc4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodymc4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodymc4 = (TextView)findViewById(R.id.txtgamisebodymc4);
        final String stconsulta = txtgamisebodymc4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodymc4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodymc4 = (Button)findViewById(R.id.btncompragamisebodymc4);
        btncompragamisebodymc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodymc4 = new Intent(gamisebodymc4.this,webview.class);
                btncompragamisebodymc4.putExtra("string", urlcombo);
                startActivity(btncompragamisebodymc4);
            }
        });

    }
}