package com.abigail05.Babelito;

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

public class babemamaderas8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas8;
    Button btnconsulta;
    TextView txtbabemamaderas8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d6e48acc9e47683f646b3ba9898cbfd4";
    ImageView babemamaderas8;
    String urlbabemamaderas8 = "https://lh3.googleusercontent.com/KkhawmLWC8qclBdjWchKewZgNmHjo5IUvEzP7uKvh_pTknayCDV261FCBFAiFCC4eVmerDTx0iZdLonpMfRauljy-d2QLJqytabFE4TxNf6xCE3SSLGmObu3TfUYfJjvOq70Sz7Z_xjSQnaCHMlfnv7emK6HJB3AGWPV6uZQ3HHSf7qcvp1z1Un_nPuU-5yQMrsXtcsmksqaCy6-WtIaM2TnMcYG0GfEipRazWAiLPghGfYdDllisoK5G4VwUGxZVXEljvq3DOuF_oGJJ_3NBm_8uzlaw0I4Ws3SKaz-hrNE4QgNPOV08PaKxLGe_VkTFoWaApCEkLvrET1Pa7RmDPgdTsdIlX8danfQOA5gJfX2YHlDBUwiHnGYFjKgYMlP6zfnt2-CGeEZGst1eX1rWVDk74wbUTAygKMS7DCcM6hirgmmoXvFZTraG2M-xw-tG52cmgpMcYH1UK6e0sVRDj0-YIFdnKUYsKGMbMyN4FU3h4v2bWGKkXJ4_HLeY8B_VR40qtIsgcy8QVUrVQdit1inFvKxYl61tx-DsJuAY_YOc_G58IOE9rkRjWe01gjXLYdRYtbJb3jKqkuqJskmcEXVmqn3TcY9gg6ahp5R2zpQMk78cA=s372-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas8);

        babemamaderas8 = (ImageView)findViewById(R.id.babemamaderas8);
        Picasso.with(this).load(urlbabemamaderas8).into(babemamaderas8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabemamaderas8 = (TextView)findViewById(R.id.txtbabemamaderas8);
        final String stconsulta = txtbabemamaderas8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babemamaderas8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababemamaderas8 = (Button)findViewById(R.id.btncomprababemamaderas8);
        btncomprababemamaderas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas8 = new Intent(babemamaderas8.this,webview.class);
                btncomprababemamaderas8.putExtra("string", urlcombo);
                startActivity(btncomprababemamaderas8);
            }
        });

    }
}
