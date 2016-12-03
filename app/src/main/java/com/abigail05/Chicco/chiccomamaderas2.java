package com.abigail05.Chicco;

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

public class chiccomamaderas2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas2;
    Button btnconsulta;
    TextView txtchiccomamaderas2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=921d15ee20f0dddeeeed71e06b22557a";
    ImageView chiccomamaderas2;
    String urlchiccomamaderas2 = "https://lh3.googleusercontent.com/h3Z5ynWmhdEsMPjJllpiruFTDeI70WfurYUdiYY3ZRcJUdWQvcj0mYCCgQsnYIwADLNBrjATtpTPJCBlPNZBWzicsJta4FTavr4ySWCA4FsBp8je6vYgb4sP62-OB_F_-UTzVs9SrqHETPayobeVDEh8LSnNp1B21pd399c3DquCWYwhFahx5SDhSKoiF3B8Ii0ph1zzTBd9IoQNtsJmbAJTOgn6is5qjVg1aOlai2Y3XgJKhs34xyQYD1cVigaY65r70Ubpl9zVg7bcsdlziCTB3Pi3m2BD_nePYsOuAilqSPQ0ct-fBRkZjYG3necZ9JEHIwdNep3OTPW42dZOS8lFl6BXB2Pe9M-2d_73xuX5N4orPGqdHEKUxkio3Zl7TayB5aJhQ9vwIZDlOAmHL-Jo2QIXab8prZa8t9wXjbRR_O9lvTwy7OYhWONK9h4kQwhALxB69O3chk3Ki83mqelKCfaY7a8wLstqFS91liUWuU9kIp9C5hay9ZVHh5WjFlZ7PwEMBYiTVuGT09KhVFdcZ7qRAP7KbRcV71EGInWYH7hdCiFKTBQe4B3-BhoIupkpb9l27D5i59x5hySYWOgZZe-HNDPq5nJTdzjMOey_zsJlzA=w400-h399-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas2);

        chiccomamaderas2 = (ImageView)findViewById(R.id.chiccomamaderas2);
        Picasso.with(this).load(urlchiccomamaderas2).into(chiccomamaderas2);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas2 = (TextView)findViewById(R.id.txtchiccomamaderas2);
        final String stconsulta = txtchiccomamaderas2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas2 = (Button)findViewById(R.id.btncomprachiccomamaderas2);
        btncomprachiccomamaderas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas2 = new Intent(chiccomamaderas2.this,webview.class);
                btncomprachiccomamaderas2.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas2);
            }
        });

    }
}
