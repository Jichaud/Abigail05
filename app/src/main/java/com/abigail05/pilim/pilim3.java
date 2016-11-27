package com.abigail05.pilim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class pilim3 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncomprapilim3;
    TextView txtmodelo1;
    TextView txtmodelo2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dc0ea334c6b659fc062f49c63a67c96c";
    ImageView pilim6;
    String urlpilim6 = "https://lh3.googleusercontent.com/UOrMlPYmT0EXKkUrzBGHx5OT0iYyQ59WqcGbE0_v9_hKFyUkqcRDdqi6LNxPlO2GAm0otYODljWOCeSuj_1LHeKGx7wSqS3oL8M9RR7pHLhOo2FeDtJo2TJjxYDbVgJ1wk0gGDzAK2kLtHYl7AXER5lnMVrmWyOWOV8IBSHHJjull9zznbWgqzjI_kJOpVTklPqcUkLadVYj6Jkg3WTqHl5ptrS0dGw_WAq_3Ts0SgMOLz5FLf9AZ1GDjfVe6efKevc0fdokSmrENxdFObdg7io2YW_SjayxVALeI81RLR6NMNCIaKvGBezYwGsJPexiEvZg08VonMn6n19jra1kdsKXiqWFzPRwhUnwE3cBeEaZrCZQZu2axtbXvlbi9oOznEkfYUQQKptrTizYvtwLYybLMra4Z4cLf0TvpYw_DothjWALj1XeRkblJnPEUmTGTq8PyYcfZqE4DZLj3JjZmsrgL22Ky1NEwg75z3Nm-UvdxmOJZl1ZskkE8lILBqsCJY6hJbCq1AAzs_Uvd4sGgsyOwYGaKHvAlYNUfHkVrTpCf2AdmjLs20xz4dwZ_kAFDas9YEtrJBBmnyC1XNaF8CNl3iT68wJ63AeQOEllQXm7Du0b8g=w294-h313-no";
    ImageView pilim7;
    String urlpilim7 = "https://lh3.googleusercontent.com/RwPg6u4OmRLynhBkvHBV6EPIMOcq_6ehn1qR0XjxyLm6WnyeKyeof-TMt1HXI5rn7_7lcurMmWT8i3Hkp4RJ5WFKNo04T47aXqskOH3VM3Pz0OQ29_jRte3Qjn95gTljWqTFCtEdhU2UBtIRX2zSUyzs1vsVzKlqGgSD2Q6TdUb-ckwxKB7PFfkeQ-_KN5G9VsxVG0ew3DGL6ekT0zgqJ6wkeqM_UVu2X9s4yeQB_JYeO9oF-rNo5VW9_FvoA9rQsOB7PxuquugkDAm_zBiiaAUeew1D6YUhOkwvOqHnc8q5V3n1AVTx8eb8atQjK9GLQkw6GIVNHk0tWF2IPWjNtfrfarKZOTz_-otGzLOGR7uFiyiAmMxXWr4DTwrre3opJWKbpgeELT11z9vDfpviAmqLnURVtSOUACC4zYPbcXQKxYh7xhVPFvsfHsKixmmTNMKW24-xAzci2egGsLlo4NKV-_XExGfHdsA33BvCPcgbl7y9FOx36eJZTBZj-utkfZmvzPum6cjAPocAPxVbERg9dMwvZbgKxqvJUZlGVqJRRosPBj7mv37V96Y9bJ-Xxm45XieDs9R9sTA7JqQdYZIup5uYxMsWYAAS0bqvX1y9y8ebgA=w308-h316-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilim3);

        pilim6 = (ImageView)findViewById(R.id.pilim6);
        Picasso.with(this).load(urlpilim6).into(pilim6);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim6.setVisibility(View.VISIBLE);
                pilim7.setVisibility(View.GONE);
            }
        });

        pilim7 = (ImageView)findViewById(R.id.pilim7);
        Picasso.with(this).load(urlpilim7).into(pilim7);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim6.setVisibility(View.INVISIBLE);
                pilim7.setVisibility(View.VISIBLE);
            }
        });

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(pilim3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(pilim3.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncomprapilim3 = (Button)findViewById(R.id.btncomprapilim3);
        btncomprapilim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprapilim3 = new Intent(pilim3.this,webview.class);
                btncomprapilim3.putExtra("string", urlcombo);
                startActivity(btncomprapilim3);
            }
        });
    }
}
