package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class mibes2 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompramibes2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d1bce4a217de52b4d27b15d06a925199";
    ImageView mibes2;
    String urlmibes2 = "https://lh3.googleusercontent.com/-Ft0ZsLR3kXYSyQtohhmK_37d4ThvoR-ZClrw5pTMiDF8NQRhfJpc2WVg3rnP50b5kmhmZY2djYPFcDyrrUU8k72hL4l8bfpoto77wTYAVtO1L4JDx9AGX-NLtthFtmu2EQHGHutyLMRKHxGNU63tSNkoo8GY-pBbl8mCZKqZoYqK4h93Qju5KifANxR3_uryYr_guRQD2vSchIdjgdAMz9npo07Xp9Mm6-4Q9kEuTkV7YNe0vOcf7W0SDrFNEckLITKw3XDVvOaKj8x7rWyJnaQRdfRP2UOGK2BPPXgY-ap67kTD5JlGnzCcs7Fa8gdnaFy8AOALEwDBRV7BNia52Az0X-eSuzaDrX0-KsLh3zEDh6C4kn_qhHA2MZiqd1aseLjc_H-Nr0flbg2pmC9zBS6Uib2qJ0qrvvsZ9GfNaviADw5v79vDHEIZvD8Ty4UhgJ-8Ae5Wxx_Mq837pV248B73T-jjZkbvCT_co-3jKa4FacDvkZOGWY4LGpGbvmWjbmrLLV3v-m_WvZ3HarcBh2S957wQRGOtTHqZMoO8_-mb44EC4NHrXQvrjOjnFZmxxBNqW4oh_FhLMIQq_fme0p9EHo0Gvya2JYRy8kSoSi9R9HPIg=w440-h409-no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibes2);

        mibes2 = (ImageView)findViewById(R.id.mibes2);
        Picasso.with(this).load(urlmibes2).into(mibes2);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibes2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibes2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompramibes2 = (Button)findViewById(R.id.btncompramibes2);
        btncompramibes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibes2 = new Intent(mibes2.this,webview.class);
                btncompramibes2.putExtra("string", urlcombo);
                startActivity(btncompramibes2);
            }
        });

    }
}
