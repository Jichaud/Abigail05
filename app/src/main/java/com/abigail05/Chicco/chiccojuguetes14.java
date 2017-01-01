package com.abigail05.Chicco;

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

public class chiccojuguetes14 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes14;
    Button btnconsulta;
    TextView txtchiccojuguetes14;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e201c5df31b117d4b988ca75d227457#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes14;
    String urlchiccojuguetes14 = "https://lh3.googleusercontent.com/zpfmoq93bjlDuSqCd7EtI2m7xaZb9tCVq1Pwo-d1F_aCi3vw-nysilRU1-p6oj7FrTgbUDGQoDmLvF5u6pTT3K1LPM5nuS5vH7CjVB32jG-lNEvhnGnB66nDHUdfCTluewKXQ42ZDigW_WApoxriE6jHLaXEYjFYh4NRk0h04b2pP_iopWgzfkhZGfZDo57_QvNii3FYnnVcYczi5GIX75lt2_FsC0KwW28s1_aRbwQk05cWWaCEeelQ7z0eyJR4-hvoJT7Qn7rMa8OsKtqW63VTu2PAB6fSO4wP2lvsPXC_osgX4blb9SL3wsnZN_TX0S_MXm--vKd1TZ9aTxqKDksHU6LAco-QgcwfDyIQclJt-rRaA-gGSxD_nOVOI_er225nIe7GwuA2CFlfYUYaMSjpOZEeHfmNQgFgZ-45M_9GM8AFz5AxEN8ltcWKiYyOt8MtOBuzhtSFP99L_GlIm4xCXj3tuvG8cEl-_rEKGaQa3yp7l17Z0cZiGycF7xoCxm1yt88ANqMVbiuwjzdLU1Oc9z4b94bjHh7U8Q7IVAHhHU5d0fXZ3csMSw1xcmLZwPlbglu5v7eXvX0Yafr2K9_cRv3gAw90xP-MtHF7LHOmLHYV_kRHyXhpD19HaMqof9lGMjRqybSuKoWAOHxnDk2QP5M8T3dMLH8MDU8G0eo=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes14);

        chiccojuguetes14 = (ImageView)findViewById(R.id.chiccojuguetes14);
        Picasso.with(this).load(urlchiccojuguetes14).into(chiccojuguetes14);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes14.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes14.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes14 = (TextView)findViewById(R.id.txtchiccojuguetes14);
        final String stconsulta = txtchiccojuguetes14.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes14.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes14 = (Button)findViewById(R.id.btncomprachiccojuguetes14);
        btncomprachiccojuguetes14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes14 = new Intent(chiccojuguetes14.this,webview.class);
                btncomprachiccojuguetes14.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes14);
            }
        });

    }
}
