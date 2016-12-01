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

public class aventaccesorios3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios3;
    Button btnconsulta;
    TextView txtaventaccesorios3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1faa11e23629f8560ce31f9b5f5cf7f0";
    ImageView aventaccesorios3;
    String urlaventaccesorios3 = "https://lh3.googleusercontent.com/gfCnHkvHLVL7halBW4rtm8byHTyVjFULn1ucLjXNwyC5vhZa1uGiJt9mKf0MPYT9Ug_jBuLHT7Qnag045-i6Hu5ekhuXNBeLPpzu7A_ocSsml6GlV78O0x0RQDMRdPvYOfL7m_nU1u7lFUd62FUyz7Y1ZesME-GYoLchUfrZwXgxB00Yl36tMTVQQCBTyMtdCaZbVzb7Snp9JdZPT_4QseBIOs7gJj5UTKBunhKVktIvXw58rP-KIv9JFdnCKvIlxe8q6He1IWJWB66OpoZhXtK5FaC3UjC2igzReUeqQljZdlXiDVD77_sDWfSouqmBbIs0u1nwN-229XA-rlTFZTqbL1OdKeUNmYmXLMCmweuLvvmELfuJ05bhbKa-pys9ZltC1xX59kyVaYMgq03wjVHR5Nd7kItcMamKAAVoM_FsfG_DJFfE8NZCe1zzOE1-5FogMILPnB8s-qlV7I0foCE21uauCL8fNWYHEzujyNCJJp-6nJRhSHJo4Mv5hFMVl1b6_EwOhW_k2vOCrJsniew8qv_R4W1xRdB2V6NuOOJ2oxmXlcop-e3w0guGXtme1xQtF8_4PfB7hIWXfIniuYK-8B54sN1054iHrTArglCLSuN7mQ=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios3);

        aventaccesorios3 = (ImageView)findViewById(R.id.aventaccesorios3);
        Picasso.with(this).load(urlaventaccesorios3).into(aventaccesorios3);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios3 = (TextView)findViewById(R.id.txtaventaccesorios3);
        final String stconsulta = txtaventaccesorios3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios3 = (Button)findViewById(R.id.btncompraaventaccesorios3);
        btncompraaventaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios3 = new Intent(aventaccesorios3.this,webview.class);
                btncompraaventaccesorios3.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios3);
            }
        });

    }
}
