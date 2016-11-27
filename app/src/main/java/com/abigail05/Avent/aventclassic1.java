package com.abigail05.Avent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class aventclassic1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraaventclassic1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3a4283fb4cceb39951b4ab653573cf8e";
    ImageView aventclassic1;
    String urlaventclassic1 = "https://lh3.googleusercontent.com/wmZnWMpzmOf7JAvV9KsT-xVkJK-hNvP02YeGMNkwGslkAGhqdS8j3_BOAOJ0sbpdUzkSWzPysGjT_c4ARgQyYxwKZosYkmJncA_GI-kFIP9DT5Di-9pk16hGV0tvinLV8w6rjdWY_erle5GpBGQPORAuX0-20BrMlYieg5dAomLSPeMEJBMY2s1fhFYjiKI8G_thJMO-BDcUUXm6_xvS9hBe3ZGCUE_6dvyQOLCutuNei6HoxVgbsYg5CLcLZ76sXHUGH2c0Pm1Ezr2d1i4DSqBVJNHVO7YKsdXiUVVdKiiMnqGUwMZU7R7Nh9v6ypIxt1kFvTwdre2hkSk60E9FEXulAcJq3HBHvdj6cR8C5Iqqsb-UbJci2Oh8cfXc6R6SbdEa_bIxIO9btIpKEjytLq28L9EPo_AJFSZLrVIt3rgD9eUXQXZnp_kb-77eDjJmZWMXZoc7lrKMbRUTfDld7va5rLfuRDfpg71vEVOaABegMC0zdqgul3OuG1lVyvcanA-MdaK0mynV106lr3QfLjKxY7Jllp0Km77GTdmS4rgy0Z2BPZ7S6kWxCzhenKnpBxDCyivLQSML2Hdh9ALs9vKz7PxidjkWkeIsH3sHJovRDSsXfw=w494-h435-no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic1);

        aventclassic1 = (ImageView)findViewById(R.id.aventclassic1);
        Picasso.with(this).load(urlaventclassic1).into(aventclassic1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic1 = (Button)findViewById(R.id.btncompraaventclassic1);
        btncompraaventclassic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic1 = new Intent(aventclassic1.this,webview.class);
                btncompraaventclassic1.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic1);
            }
        });


    }
}
