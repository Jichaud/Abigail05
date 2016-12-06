package com.abigail05.Gamise;

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

public class gamiseconj5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamiseconj5;
    Button btnconsulta;
    TextView txtgamiseconj5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=60b74977b5d86e678b4e3a75ef5f6ed7";
    ImageView gamiseconj5;
    String urlgamiseconj5 = "https://lh3.googleusercontent.com/EXo1Qivb3OAH1FAgKkdE5VIIFG4UZ0sqK5GE1m4qqn6QWN0a9MRFUK5EXxH6Dbez118VKWYcY2UaSrNwyMe-eQ_iusOnrf0NYiVpP4xeS599Ahw5rqbdiZFzHDLm3rU_V4U50t-fEYNidnnOq6WWSH6rfDlKTC-o6H_eTvpz00ynl_fSovb1BVgzXCrKvSFKTV1NvuyHCejH3ygcLzso670sgiZrmnGaMP5DqSoYrzNL4OGbNohD-nBPa_Reogikb067l9KFwEr2cRUatxsgdc_Bf_13azpPNoaORqGWIfv2uBJ3wSUGLQ62gZEmOGS0BDfCc2BA4DpNxEl68oYFPm-mMykiQ4DGR8in3QXWjC2YhWiTqKmIAePZaTg8Zsfiy6edyYb0jLGp80A3mmvFIqYopFyXIz6bKbMhQpVLB7g81hW0iCPWVTVzJ1J_8MJ8cS2kUBkakJ7r_Pm-BszrF_TOadUr0X5D5uyx9at8L9PNgQZ-Wip4uI0tUEJq7NK1SrbjohKwu3fLEv7-UOlvDEgdEQpaE8fZP_GXwz-vFliWr9sOwMPzjPmHXFhD7UxBS60Pyk9_dH8u_-ybq8NJR26Q85M6wJs_XhPs3vksH67GFEF2v5acsNcNzBpRqO8mmjhHp3A_ALOWCQ6qWEUvEukfkKS9G6mimbWMB2fg-Gg=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamiseconj5);

        gamiseconj5 = (ImageView)findViewById(R.id.gamiseconj5);
        Picasso.with(this).load(urlgamiseconj5).into(gamiseconj5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamiseconj5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamiseconj5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamiseconj5 = (TextView)findViewById(R.id.txtgamiseconj5);
        final String stconsulta = txtgamiseconj5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamiseconj5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamiseconj5 = (Button)findViewById(R.id.btncompragamiseconj5);
        btncompragamiseconj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamiseconj5 = new Intent(gamiseconj5.this,webview.class);
                btncompragamiseconj5.putExtra("string", urlcombo);
                startActivity(btncompragamiseconj5);
            }
        });

    }
}
