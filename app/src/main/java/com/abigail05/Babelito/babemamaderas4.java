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

public class babemamaderas4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas4;
    Button btnconsulta;
    TextView txtbabemamaderas4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=056a6857bd536f0b53541a2d593733c9";
    ImageView babemamaderas4;
    String urlbabemamaderas4 = "https://lh3.googleusercontent.com/IMSYOISwzkLDBPVGmLxG0kGTUK2m6hdxm-RXklt-YXoVpjhEB4fo1BaDoJ12FsxUShvcGRKe3Qk-PMlmZnmuvzzlIY74MytGHtEkC_9Pozalz7njLouYH6rfm2p1-rfXVPNiQfNH6AGslDs2L6ijwvAryAtS3Q4Gu7Pvyx5hmsGnwxIP-pE9EuWYeO8hdFC74h2B77-PRQr0FVQ6xH80A4vMCkXKbraFStUoFtIJEhk62uSoccJ46cJSpkeXuuc9brQfi3CAQDP8alwtYpPEHjXuLh5YpZmPOu3mMbz8O237r449pFNhkU9zasfjXSoxnI7kzQGDDZhEwB9TArUpVcSTkv3kMcJNYi1dAYhwkfZrQRsj5gsqODuN1bPWvJibJV7zn9ZP8ew45N4j6rHfR-dBj3No5TTPvxFVlQ3UynpldNhO2Aabh2WIO7XtoPuoeQQzGNofE9pUHGkIckG4Cmfw6QuSpCxKM-oX28Gn8BgxRQOlZrmryCI7YF7BFzS4Fwr41PvvWN9B9HLg3lhnqB4b-0WS1_PwuGoDJLB9Js4YxGb0i-5ku8TPwS4nk7yMHjRIwCglT0NmsLWSAGaF1QrBCSqaf8fLztwZDGuMyt1CLnaj4w=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas4);

        babemamaderas4 = (ImageView)findViewById(R.id.babemamaderas4);
        Picasso.with(this).load(urlbabemamaderas4).into(babemamaderas4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabemamaderas4 = (TextView)findViewById(R.id.txtbabemamaderas4);
        final String stconsulta = txtbabemamaderas4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babemamaderas4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababemamaderas4 = (Button)findViewById(R.id.btncomprababemamaderas4);
        btncomprababemamaderas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas4 = new Intent(babemamaderas4.this,webview.class);
                btncomprababemamaderas4.putExtra("string", urlcombo);
                startActivity(btncomprababemamaderas4);
            }
        });

    }
}
