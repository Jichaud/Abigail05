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

public class gamiseconj3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamiseconj3;
    Button btnconsulta;
    TextView txtgamiseconj3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4630b370798efb9b4d7fbbd6ce7dc8f6";
    ImageView gamiseconj3;
    String urlgamiseconj3 = "https://lh3.googleusercontent.com/8j36niTLz1SuwtxGrmdU9ONXFWUOzW4mvGUWSVIeFQrdR5NVWoJCRlzaI6m8qiWQfZrxIpzXWFM9eesOmb1pOlLf0vCTeFdlo9FtDcufsNa3zO9W72faCKcbdl3kumefiA7l1ijVIzuZgPf5tqBYsVWcDzmNWC1XuUfwU-q7CNBDKGy5iu31EfBwQ-z0V5pFCSeitnLiYy7gedUswLwpCudQPeLghuRlxa6eTQoNTk_UC-B0xVL1sNO6u9Sc8LenR8lw5VPeThNxJlp6uqAtMMvONKtOveHluwq1JyQxf7Ttrn_TKEfxrnng797q9mI7wEbPHGg1u-43Sor45ZeskOBVBApngIAKjC4DQvBamKIvUwkUHgQfIaLQvxG0D3TwM67JBwIhjGmRBvdCRmStrIZfU6j4bLiK17bUPUqZiTmV0NaZqpzQlPfJEbKb7ckoE-shsIcYbVPVjVrL8fLBZl3WRQScfWtTIeWmuTzLgItO7lDOW-wzuTJR-K3kj1KDONAcI30AzZUkO9zhyxQQcHz7MijTYRQvh4ssY4b2bPokFWoQ4qnmGVHLoNsOJWwarf-dG2q8xg9nf-MnfLXtQ72oTtG1gvxaz1B9Ulz53EHeXxk9RY9SHWap2UAWAww0COYrl2ZjvgEzNhvo9DkNj5NCWSADlBUF7W6yDqdJzOE=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamiseconj3);

        gamiseconj3 = (ImageView)findViewById(R.id.gamiseconj3);
        Picasso.with(this).load(urlgamiseconj3).into(gamiseconj3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamiseconj3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamiseconj3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamiseconj3 = (TextView)findViewById(R.id.txtgamiseconj3);
        final String stconsulta = txtgamiseconj3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamiseconj3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamiseconj3 = (Button)findViewById(R.id.btncompragamiseconj3);
        btncompragamiseconj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamiseconj3 = new Intent(gamiseconj3.this,webview.class);
                btncompragamiseconj3.putExtra("string", urlcombo);
                startActivity(btncompragamiseconj3);
            }
        });

    }
}
