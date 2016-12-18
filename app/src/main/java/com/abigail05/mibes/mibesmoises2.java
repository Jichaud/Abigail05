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

public class mibesmoises2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises2;
    Button btnconsulta;
    TextView txtmibesmoises2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=80b3934aea1a051fea31c397eb988de7";
    ImageView mibesmoises2;
    String urlmibesmoises2 = "https://lh3.googleusercontent.com/h87aghRBciKowOCik6HiGAxOrnoCbJ6CFvX7APsJmzBRryhkoQ0fCQ-CoJJhl_Drd5xAApNmjejiVh1Cbz-yWJmS9qfcxt8cI_neuE1qsIBHyOKfcw2sf4yuMcYDnHvCC9AZJ9WVbOd2RFcBetxtwM-c-iWCdPR5v6kUjiP4newOol9t7plTndgyGSaUxP3vb16zl-QAn4SaO2iblRhSRMv6-qghj7vQ1n_x3OZi0eGajPJ2Jg5y-77MnyUT2H86Ljt_7C-x4K2FohFWD1ilF75AN3e4dQLU2rSshdN7oRTGX7c92flNmHFdEHBInGozUE6OMaKVhMfjzqAX8ziNMlAEOMLZ_4TAsqY-Ssbg60YnDZdcBKsX34MrnaBkKGHCt2Hloyzp3Jfz1FMfGag0ZDErcElGs_62AHhYdZOepkIIV9ibPncZ_1z7kXT-AgBWr0gDtzrxG7RMVPjntNfmCZOyHaj25p8O9fI7iuCj2sTFH3FfYapx5Oi0ctwIOtutN0vKIOcAeU-eljL0gBPDl8RKByCrBrLDAh_6WwMCWQrDuelBXa8VREb4SJF8LiCaFBhSxRRwfGqX0kCGZnBBMGjnAM3Ga9Dul6woFeAtTRybmRqAiFPyk-v6VPTN_7b_Dv7cY9HFk54YYJ0Ue8U7SDAQjk8rUpCasybLG18gAkw=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises2);

        mibesmoises2 = (ImageView)findViewById(R.id.mibesmoises2);
        Picasso.with(this).load(urlmibesmoises2).into(mibesmoises2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises2 = (TextView)findViewById(R.id.txtmibesmoises2);
        final String stconsulta = txtmibesmoises2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises2 = (Button)findViewById(R.id.btncompramibesmoises2);
        btncompramibesmoises2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises2 = new Intent(mibesmoises2.this,webview.class);
                btncompramibesmoises2.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises2);
            }
        });

    }
}
