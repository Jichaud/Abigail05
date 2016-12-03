package com.abigail05.Chicco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class chiccomamaderas11 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas11;
    Button btnconsulta;
    TextView txtchiccomamaderas11;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=da99acd0caf73566da3f17e1a7119dbf";
    ImageView chiccomamaderas11;
    String urlchiccomamaderas11 = "https://lh3.googleusercontent.com/eule38NVNu9HiDPXBDuAN-S83UF1QDLUwa8C2OfelWPTeavyALpPCfvjZuRb2JTFz0q9Bc3y6d50AHx_zESWIpeJ6aM3hTkQ8-RlXm0l-iQ3PUqgIxNTzps4Cg_t6oo95LBXRQ8BXwruBIPq0DFLygyU9iFvwjWOvRbS5TbR-p_TA_WgyANhKPwmopypAQmKC9VA6fu8Z1cvX5zLgpBGLyksWvA4qJR91A-xC9aflzjZdf4WJv9kuJzgpQlBo5r_suXft0bEjZG1sT1LgG0DDRczI82tjZatOvVruGjdszGNx8x92wfzPMT0NzhiShEkP9OcV3zaK5KLOK84grXR8wxBfyZNFfylDZjVmQ_ZzdhKHC3hWwLLQJiLX3sFOEeRMTxKcaf_cuePEYWbqvmMjv3yd-2eelf51w8XkVb8Uee2NjYh8AsosfZxqCS8--1iBPD8SZzCpGsa4378zhV6W1orYA_Z5s18tKv1-rV03W6j6xen1lXFNgktlLSh2NZzvpGlgCAPACq7mEJKTGYS0ILvOKky9q9_wricq4QJGza7FQTQVnl8nqJYIeEXpoChZIUiOu_LtHoFX0oK1Gg4enlPCiYjPDeVvkRftqCCqEt65M_y9g=w426-h423-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas11);

        chiccomamaderas11 = (ImageView)findViewById(R.id.chiccomamaderas11);
        Picasso.with(this).load(urlchiccomamaderas11).into(chiccomamaderas11);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas11.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas11.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas11 = (TextView)findViewById(R.id.txtchiccomamaderas11);
        final String stconsulta = txtchiccomamaderas11.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas11.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas11 = (Button)findViewById(R.id.btncomprachiccomamaderas11);
        btncomprachiccomamaderas11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas11 = new Intent(chiccomamaderas11.this,webview.class);
                btncomprachiccomamaderas11.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas11);
            }
        });

    }
}
