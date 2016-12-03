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

public class nukhigiene5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukhigiene5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6bbd8a62a0bd2dcb3b1472d0acc243c3";
    ImageView nukhigiene5;
    ImageView nukhigiene51;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtnukhigiene5;
    String urlnukhigiene5 = "https://lh3.googleusercontent.com/-0BwNx23C9EmskQGdKJeGCvXuJY2Bon2yLeY-4EM9rR-RW3Fdme7X7f27YbMQp4Hl460KuXt6PJao3TjDrXHRqequtl6SkFXJuslKXnM9fkLkSQa90M-GxdTNcj2sfK1k-HAjytS3vcrMs8ggldqo0d56MVMBXf00SS518HoOq8EP665PR7RmGoNVOZ9IJP2KthLX0YfTFyjRShWZItm1vSsHsbntGE_CclHUeSyEHp76KE2PDOWLzbXbGQsdEaf2mTu_J65zUFAxgO7xDQAixGAlfFWOeH7bXLj2Mak9LTWiIsXNCe5SopBPeVhOdRRH5m3sMhrrLbMUyPWcayhbeLhIxme7dPLVHPDEpC13c49vS3PHG7nyidy00ftRe07LIfbAas-joyl60BsFbtvCCLZqn2s8bYkxmmp4ow0qSGG-5JCh9y3DKyLRHxpSdYo4v8CCqb7xo1VqOK0XnjiLrzmV3hqY15AmBqi8ECO-TyMXyW0LD8wO1S8HkjXKKVhpHwv_1cqKiYkN7qS_kCHhsayVzGTt7yVfBF_1Z1Rto7zT4h-IhyBIqqaSRmq1PzSxS8zqSY86JlI1N9LJj5aSkTg9XitZtasytcmOsWBrQlv-9R2Dw=w378-h296-no";
    String urlnukhigiene51 = "https://lh3.googleusercontent.com/zc17sAx9A4fW3e2NySi58ZreKaaa38QWLLX6ZxImXXImnC-1niV75KR94Pk2ep5tQ_4AYhwr3efE9eRfMU1fkOOw-bXbK4OqrJOmWOdteHcadZgNqEZHWcsacWlhEBK2DtSBUeNPoiqtUpq6Y-1IqB_no_Xm7rQtI4RT-XmaRd80O0ZlkIyW50-3wWy6b4NY3sSFitArXUVCLUZCQojIU-4nVz2dMkAEv0ePQK2fHXN3WQ0K80jl-DIFbNmu9BaOzTOTf4KTCoXLjXX9UOffrQPUZjHIki4hoXa0G6_VstsPqUAjpDMvAtAlnljKpbVd108cNYQYUojhTZUVWMuWv_oxULNcmfEIu_DdIz7nj_RR_k2I3M-LX2uTEbf1GIfFchhkwCy6LAYIjDbjUs7tktP0917zKipTg8Va4035TTvHIWa5YOsPntItNroJuUwc0x-DRrQMpNv2by7b9aXzinGBa8SSHaSs-Q1duIwi08rAX1LGQq8glSFcDHuHaRmTGamYuVOsbdHysKy9OP725rbeSm6E63UhFmj2J0Q2J93cJ7JMmqKU0u9-m08ndqIcpAbcNBgDfztduyph68WWXWp1muZ1mhCwK1XcbIGuncOtsOyZ3A=w371-h290-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukhigiene5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukhigiene5.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukhigiene5 = (TextView)findViewById(R.id.txtnukhigiene5);
        final String stconsulta = txtnukhigiene5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukhigiene5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukhigiene5.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukhigiene5 = (Button)findViewById(R.id.btncompranukhigiene5);
        btncompranukhigiene5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukhigiene5 = new Intent(nukhigiene5.this, webview.class);
                btncompranukhigiene5.putExtra("string", urlcombo);
                startActivity(btncompranukhigiene5);
            }
        });

        nukhigiene5 = (ImageView)findViewById(R.id.nukhigiene5);
        Picasso.with(this).load(urlnukhigiene5).into(nukhigiene5);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene5.setVisibility(View.VISIBLE);
                nukhigiene51.setVisibility(View.GONE);
            }
        });

        nukhigiene51 = (ImageView)findViewById(R.id.nukhigiene51);
        Picasso.with(this).load(urlnukhigiene51).into(nukhigiene51);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene51.setVisibility(View.VISIBLE);
                nukhigiene5.setVisibility(View.INVISIBLE);
            }
        });

    }
}
