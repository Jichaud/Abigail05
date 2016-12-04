package com.abigail05.BabyInnovation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.Chicco.chiccohigiene;
import com.abigail05.Chicco.chiccomamaderas;
import com.abigail05.Chicco.chiccoprodlist;
import com.abigail05.Chicco.chiccosilla;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

public class babyinprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnbabyinvarios;
    ImageView babyinvarios;
    String urlbabyinvarios = "https://lh3.googleusercontent.com/HvTg0DcFJ7PaI5HpK1ZzYSn-BYuQXvVsMmnKU0rSoVLxS2DlLWYL0HSOIGFc9u3p1TQrjtxdlO6x9SyrnXYJKSx4-OzgTWWuZ2m9dg7D4nG7RWpbv4yM9ux4cxOiKzd8xPf__8H6XjvJmCdqwEP7YR2Yro3G2EYgjRGBv1IX9BQys0PtRueBL2xdmv6zrYPMTrR4x7ujYlZvSfIwkA0ydpYI3eQK9xUXZSht4dLKJH3l4HglFj3F9CvKzs7ssf7cebmpOp_pL01Wde6vIAvL5ph_cjsNqx8jep7P-Xy2Es6_YVplu5RgKiuCHa6ACeBQYdSXitczDmW2rmCf8K3PVgfSwBqGpRQCVXjjkrSoGin70-L3A6gO7hbf7PrexpHb80amjT8jbc3cW0I1yCbyIl1YU9H5-9nl4mRgd3PcdpWbU2RNnhSlffapgeoVAm4Urb-JIAIY69gsECaSVi4P5B_e589HqjtMtc8hykj4k1w5wCjZpK7XZsLIcyX5b36gU5VYdHBYdekdGMoofGuS6nJDnXlE78RNzsifl8camS71nQw-siL0ukzVoFfpq2ZxueodlOpQ3Y9fOuWR0CLy-sqDLh6QdkYYe-z2wdw1NVpkHQSviQ=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinprodlist);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        babyinvarios = (ImageView)findViewById(R.id.babyinvarios);
        Picasso.with(this).load(urlbabyinvarios).into(babyinvarios);

        btnbabyinvarios = (Button)findViewById(R.id.btnbabyinvarios);
        btnbabyinvarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios = new Intent(babyinprodlist.this, babyinvarios.class);
                startActivity(btnbabyinvarios);
            }
        });

    }
}
