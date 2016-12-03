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

public class nukchupetes4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukchupetes4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a9c80c79f446efda9701fb7e22247f4";
    ImageView nukchupetes4;
    ImageView nukchupetes44;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtnukchupetes4;
    String urlnukchupetes4 = "https://lh3.googleusercontent.com/AmTCEGTvq84oNkVqVcMYo2R0yuGNU3zoKzQFgysqOaUL-1MD4mFLvAK7kLSy8400iRXXmIZZf0nPzpjNUjDCTCn-gqA47D2ncJb6xKUVVPnj9wlAq-HQKIs6gL7bfJlrYhPedTkfhx8wiGpBB_90BkcsupQhCYS8LcoVXw2k7oT9AX456Axq2p02OOy-lQ2-rwIKaRuiwPFsENYfqMNEUyWBBSlgDZk3r7JhY81ioRmsa6efo5cM9_hyyt6ZUfDMP3K3jHgrDfdITjNcZYvq048Awtp8_U6goY-mCZJwo8eXLTQzH36m1wp6OH45YQcGf-O9-ts4R3FSO5jk4iDZ4H4fv2WsHMPrAbmNRhnqdmIi2ixK9ZDS8TkYqMuSYKIZ6eDNAts8H7WVFzk6QTpjsti5KZxh1UyqtVliJwYAAolf3i5MZ8Rw-kdKa3Pa-w_EucZq6NEE_bolNgpmWhwvIrJCH4qY2H41bAK0d6Amhw28PkaoPFBadwutGDQr6ID6kceGNR4R1jZXTD7Z_ZLRm6zSe4-JnIj-h1DycpImHZULYICKjRoDiN11KVJ2lkjJxVk4jVE-f1DAMgOaBxtkLMosvLJOT8JLt9IVptIgh4l4U7rNfw=w361-h300-no";
    String urlnukchupetes44 = "https://lh3.googleusercontent.com/pivLwlyp8dPKpWFDJF1IExWbuM-h1_N1ve-mSudcJZ0Qts7l7pmPe0pdCuGQl0OhAYSxC4YVfvnY8tqnE-jb8j27tTZrY3cyvUSRcTwMCTWuo7L0_HNOhnVFscat6dOM8Fe7BuGQMnW7BzhxxWoVf40iq5Y6IOFVoWwWW0YG7JzL1Cah_PowTaddq55dsB7d1a3HY2D9O86xEC3kfZaGdbiExlgh4j_uqsM7b3OKm0AuyIVyargg2dqBrV69ACR2VyMRFqEnb3KaNb5CZh-5oExdhT8OuT1NthO7JFpN1DSwxPeOALoC8PTDQhzokzCPPCk_bzPXZ9cWvcE-pU4YD8uFB4K6WETZPxBViFsvR2kQNVEFhFjovvcHw8BU7AiP1mYa6tWxBN6PPbeOFHAvK8fIamxvQJMSYeiCvAD9sVJsL35Ye0j1pCNi_a-X6D8BElLvkzdXHXxKJRpYMN3mTYbqtLK8lfd66Ho16kZl8E2RrIv7MLLBfWBmPhBj7Am8SndpYC7bJqhoRrQDM5O6Ahcr2ymK-V1Sb1BD-o8haFTA0aSFfm1TjhbGzk-dsKcTJT8lcRD1jaFXeFGONikdHxOOFEbE6x-vZ6iEJ7APO9wqyWMUyQ=w361-h300-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukchupetes4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukchupetes4.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukchupetes4 = (TextView)findViewById(R.id.txtnukchupetes4);
        final String stconsulta = txtnukchupetes4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukchupetes4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukchupetes4.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukchupetes4 = (Button)findViewById(R.id.btncompranukchupetes4);
        btncompranukchupetes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukchupetes4 = new Intent(nukchupetes4.this, webview.class);
                btncompranukchupetes4.putExtra("string", urlcombo);
                startActivity(btncompranukchupetes4);
            }
        });

        nukchupetes4 = (ImageView)findViewById(R.id.nukchupetes4);
        Picasso.with(this).load(urlnukchupetes4).into(nukchupetes4);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes4.setVisibility(View.VISIBLE);
                nukchupetes44.setVisibility(View.GONE);
            }
        });

        nukchupetes44 = (ImageView)findViewById(R.id.nukchupetes44);
        Picasso.with(this).load(urlnukchupetes44).into(nukchupetes44);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes44.setVisibility(View.VISIBLE);
                nukchupetes4.setVisibility(View.INVISIBLE);
            }
        });

    }
}
