package com.abigail05.BabyInnovation;

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

public class babyinvarios9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios9;
    Button btnconsulta;
    TextView txtbabyinvarios9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=675409f50684a85a2ed4214d2b7e8776#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios9;
    String urlbabyinvarios9 = "https://lh3.googleusercontent.com/eXAPDhkTuSKw-gsvxQ4_m9fj_5t7rnd1RjOtsjuxtA3fy4V3DNtKi_4sGWLgBJwKd-EmadWX8dqWb8TIrTxEuCVcI3_jURp52fkag4aGV3vGCNXg0vD5uAu5n4NlS1S_lEgnl4cf-YwE81dy3GYEMh6ESHnuXlr9WZiYCWrf3LHVDNPw3CuiXlFd90f_WEiP74CDuPeEL_740XsZffFuFmgkCDcLS_STVZ9GPJ6zgonNMX3MA2ezoDcq76gSv2wZe0St1PQZbLZIaO_am2KKRV50sv9jAr4CjcTXclwM3Yl4NZh8AV5zhA-6ofv3wdoggYe6KrOM61R8Ds36p3BUF0OdwWC5joiq13JKiDjdJjHIzyLeFK4hCLl6oqtsmzBwZgiWhvd_XyWpVAxT3MMeL_JMT_uL_W6u2Bmo5vPMMpO9fjipFKWB9zIqlahHugwv1CAH-q9La_M_XHluVViAYqdFnCzIQULH11BiRZpbqlSyeOTSRGpOQBnxvoiQ3TbwqNHmpYkphy8FgArpd8fMUwqPoQo51U5KEy7xs4-IiKatuRuPjbQZf43jtxK68cYJ5cNGaOdrCsRlbVk0Qq7dnvTXfHgSjKX_U7keZ1HA8zDTpvTSCXfPr8T3qx0WMQLp-6enC_2TOLtNNmHtKOwYG9MJhmUkq1_A0dinlkVh-0w=w328-h332-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios9);

        babyinvarios9 = (ImageView)findViewById(R.id.babyinvarios9);
        Picasso.with(this).load(urlbabyinvarios9).into(babyinvarios9);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios9 = (TextView)findViewById(R.id.txtbabyinvarios9);
        final String stconsulta = txtbabyinvarios9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios9 = (Button)findViewById(R.id.btncomprababyinvarios9);
        btncomprababyinvarios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios9 = new Intent(babyinvarios9.this,webview.class);
                btncomprababyinvarios9.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios9);
            }
        });

    }
}
