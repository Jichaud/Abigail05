package com.abigail05;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class marcas extends AppCompatActivity {

    ImageView pilim;
    String url="https://lh3.googleusercontent.com/OghH4Ygumk2ZNblQu5izXAY4KhqnZs3hUp1pC-cAIQNCS1hxM3liMMW-kfwRUDWT3E2GOjgzmGETd3Gc2TLk2HK7Hqe1gYU4njwHebwcoW-D0MHN2ZBsmQbW-2roMs9IU2-fH0v7oon8ytB6IeZYqTXFLhbpLjHfkDlXMCSfTD5C0fuxzdnr1fFk_jXW3F3WK3FdNC1U0XMGz9yglXX5h1Od8ZNBQ407BB6RaUjUcMKBEfVMiz7nKW8oZVRaKBb-BsfCvffY381WBScpm4fwSQTEu7HAlnne-hZhWsoQ_GavtxqSZ5iZ6GA_vesujk3iZhha5S2D37aFP04NaTZYPZ4W-2QqruPxxGfqT9j7uaYkgmsJkzjeoCJfiFAYPZItKoTCQbfqCE6TRy2XUTFuMjxYjtJeIbyevaq467LNizvwl4SQdfMNmUYYzXu1p9_bxW_rSwy-Y3UgREMFLNu8CrO9vTnpuS71hFyFVRA5K2O4-1Os6eVAJv4tq9b7pbMAqXLgwa558Sxji_WsKc5wrX9TbJrHhoCv5OUUoWrjqXCG_H6xE4tKL0cfn_c7KBJ1XU7-JmKelcuJHZo4rtM4rPkphQBshikd0MtpdaZM7qjfpe0ptQ=w260-h214-no";
    Button btnpilim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcas);

        pilim = (ImageView) findViewById(R.id.pilim);
        Picasso.with(this).load(url).into(pilim);

        btnpilim = (Button)findViewById(R.id.btnpilim);
        btnpilim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnpilim = new Intent(marcas.this,pilimprodlist.class);
                startActivity(btnpilim);
            }
        });
    }
}
