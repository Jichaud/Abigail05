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

public class babyinseguridad1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinseguridad1;
    Button btnconsulta;
    TextView txtbabyinseguridad1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=450419c68c767c0cd8a057af5205e1e6";
    ImageView babyinseguridad1;
    String urlbabyinseguridad1 = "https://lh3.googleusercontent.com/9rp616C5Sv4vPZHysWxIRYvBQ8k9TYrgIEJN6OOp3tQjgRbCDrxRSxWl5UT5ZcoN8YLMw7kgiUVukoTydxDBmHNdjtkO30CaoLi8SDeKw0J01ty3eoJ5rYL329yDn7fu32r7KXZkMihRvOm383fCWfqZYvdmsR8yV2WvzAMoHCEWDhLdTrpQ_nXiyW7QZ89CBb7Cp9AuHGrVEvQn6A9HeJiyESY_XAi9nU-wJHqY3JL7N_Sk5UUhOL0wOD6j-P-vCWZZj00iMJDF-Dsn9eTKE46NNDKIrwIDP3vslIz5FYsjulj5WGnR4kd4q1wJhiumXnytBz3YI1Za37jEcmDkuYIY6IGT6KD5ayePR1_e01Sx4_okDdcdVLO9d6guQTKY1pQ21AThg7F7YS-g3H9mEbPnxYQ7LdG5kl_-QlUNE-diXxNf7ktNKZiplBK7C1D4z6PqPS6ZACNxeY66gxAOUmVDJh58_MPxxlNxke9y5dkxOExYXx-fOHTQTM4Hi96Ir30jrl0UUkumdVPjMCq-av_zfl4r11q9tGMh-2-0np_VikfHs2bSMRdpC9_h4zo09xQne-eSfLyGJDn-JAcE3MU8uzQB0_NQsa5De13zkIOnkb5wJQ=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinseguridad1);

        babyinseguridad1 = (ImageView)findViewById(R.id.babyinseguridad1);
        Picasso.with(this).load(urlbabyinseguridad1).into(babyinseguridad1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinseguridad1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinseguridad1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinseguridad1 = (TextView)findViewById(R.id.txtbabyinseguridad1);
        final String stconsulta = txtbabyinseguridad1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinseguridad1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinseguridad1 = (Button)findViewById(R.id.btncomprababyinseguridad1);
        btncomprababyinseguridad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinseguridad1 = new Intent(babyinseguridad1.this,webview.class);
                btncomprababyinseguridad1.putExtra("string", urlcombo);
                startActivity(btncomprababyinseguridad1);
            }
        });

    }
}
