package com.abigail05.NowyBaby;

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

public class nowybutacas1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowybutacas1;
    Button btnconsulta;
    TextView txtnowybutacas1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1716998a91c758c3b10d0a927d7be3ee";
    ImageView nowybutacas1;
    String urlnowybutacas1 = "https://lh3.googleusercontent.com/91MnOYXFgx10py1JD1z2iCtIa8URs5xVlnT37tsmEGUFEEaOU7fz856-yYcNAAir42xob9OcyY46IGH7C4HhA0k9Z9Qqtooezd_NqqJquJ3Bq7B8gjm6EpDUkIP-MCrXiX3XMiEvPsAVZZZRsPyai_xOqwrk2G0jstjNiqeUWNcFJvTESiWz46P-cmtQhRQwdd8p2XAemW4O9yDRbjPagCIfhj_5k-yJJisawNvf6cg-DXY4EmSH3rb1sbhYc8M5iR9FrrPFpg-R6TNv-uzmyjIz95gUoM5qzDIakDg8hhox06ZpCLEVt5fMQvTtvRXWjiz3BPuweEkV3zd-T0Igh7L5gyCpW4uR2VWrQuvkn5hdvKAv_vOeyYr0heMoc5RqzeydAEDt8S-UGfrttLb2h-KrtcA7tWLvQHs26SwtLOSZW2BWaJjzXH2zC9kinXFRKJPgh0AF5dwVdkVWmpHKD7IRUzRdS8mH0eeSX3j4IvBeoUH2xcAxhhi0wTNm04cLxQIHOdLWQFASmlwvc_lEfdFsEqC2w3rXnf1Bdk1tHAGMxTie2mM75X5CF9QjosqRWQErAvsrbEUAmfBrVqwAdiGySMQHYPybZjGm2DxIFGSUDdEKhw=w360-h480-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowybutacas1);

        nowybutacas1 = (ImageView)findViewById(R.id.nowybutacas1);
        Picasso.with(this).load(urlnowybutacas1).into(nowybutacas1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowybutacas1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowybutacas1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowybutacas1 = (TextView)findViewById(R.id.txtnowybutacas1);
        final String stconsulta = txtnowybutacas1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowybutacas1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowybutacas1 = (Button)findViewById(R.id.btncompranowybutacas1);
        btncompranowybutacas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowybutacas1 = new Intent(nowybutacas1.this,webview.class);
                btncompranowybutacas1.putExtra("string", urlcombo);
                startActivity(btncompranowybutacas1);
            }
        });

    }
}
