package com.abigail05.NUK;

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

public class nukaccesorios1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesorios1;
    Button btnconsulta;
    TextView txtnukaccesorios1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=36d0c273b926b622fe30dc39b74972b3";
    ImageView nukaccesorios1;
    String urlnukaccesorios1 = "https://lh3.googleusercontent.com/8gJcKhG-PMmCYfKAWS5aK72yOmO20P-tLpYu7zvnE4JmvV41dAgh5qAUe3y4o0p4EMoQu9-1KW5G5dajba3wQmiF1RfU6jdxnZnix5a1tlL9zu-viTwuCUofh8EcP6tdMnC1a5WdN94ubJiBA2k1ezlwZ5cxCE2G7EfcuB8p5_jhDmP5FmPrdGwCn1x9v3jgSwcLtycnWYKUmQOOk8p5vefrkZXEy1dZGk-IpNWLdNCA7qfR4arsM6PEN3jsqnF0aNg2bodPKsZRDSHEU02TUkD8rhNMdRPLTTD8mcQ2Lxl5IbtqxzIsJc15O3J2LYSGqjSPNAg4HqSiJ6B3m9n76nsRKYWPZ7sfACfV8TF78phtCZD5xSAY5MKpuhmqlF45sWixgAjjayk2YSO7NCJDo573wQbaK6NabCvhHHi2EDKFgRVkPw9PHcs8pArQcCHnNNxxHvuTAhjaOV5m9BBRC1_-JDrDK49WROIAbDCeqg-FuoT7f8a1FaZufmhltn34Zx_5WGqviItS_fzExhggIUaZ28Fxwui419F_0ozRiGtt9O3oDOV1D_qDAJpgRH49iifbAVtetkP7BccD2U6E9hJ7DnCsxFWOkgVBNQwPSWSVXtwySg=w282-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios1);

        nukaccesorios1 = (ImageView)findViewById(R.id.nukaccesorios1);
        Picasso.with(this).load(urlnukaccesorios1).into(nukaccesorios1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesorios1 = (TextView)findViewById(R.id.txtnukaccesorios1);
        final String stconsulta = txtnukaccesorios1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesorios1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesorios1 = (Button)findViewById(R.id.btncompranukaccesorios1);
        btncompranukaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesorios1 = new Intent(nukaccesorios1.this,webview.class);
                btncompranukaccesorios1.putExtra("string", urlcombo);
                startActivity(btncompranukaccesorios1);
            }
        });

    }
}
