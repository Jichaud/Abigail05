package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class aventclassic2 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraaventclassic2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7afd4b7a5f4d2e01f2b812a14a5f8cc8";
    ImageView aventclassic2;
    String urlaventclassic2 = "https://lh3.googleusercontent.com/-3HjBiOLrG-y43LFlKuF37TQa3f1E2hC117vVUVEapgzbjKS9rfbn6fGr4gcN3WStNmLRDp94T4KB4LPUnqRMBAtpGcqIcM0TnB2UnUN5uEWTzdyCcXQB4KQF67AWtoJ9GYTn8VHS3cwBWcS9PL0KEvEjucizEdCQJudo5gKEeobE6m_YuIrNt9bMIG99rf22YnLVHhZbkl8Bj66XLzEqUZBVhSjLC5sZ11knn0IszLGSMFAlQbMyzsOZqkYBhGCdPfo3kvNWGLnjT9jyD1SGG4wQbq2bKAH9OWOfeI8vqZWa_ReImo9sy-Z9nv5EFvQD4XHHF-kXQQ4yTluu5OVtUkX8PszJdM8nUkC1EOHErQVk_mVLv3R5CjVeR7j2dMW4MhO94xAz0qkG6XqjKQpNceztrUaG4NYvbTd66l9ND4NmRZhIMF5FzUZoSj8NHs9iJClj52lXDc0US9nIiEfhdoZhjrLii27mNDaHT-UhJq9KMI5SmMQHYhOOYYHWYUHDGD_1U9vuwj4Bvvw6wQFhd1H7icSYsUHNUmTZkuu5887G33pymr-mOn4YbOz9JqfQ5pOYT1aFAA7-zWNL-SzRH9q9jqQqWXS4LgNT786s5uPeDWu-Q=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic2);

        aventclassic2 = (ImageView)findViewById(R.id.aventclassic2);
        Picasso.with(this).load(urlaventclassic2).into(aventclassic2);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic2 = (Button)findViewById(R.id.btncompraaventclassic2);
        btncompraaventclassic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic1 = new Intent(aventclassic2.this,webview.class);
                btncompraaventclassic1.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic1);
            }
        });

    }
}
