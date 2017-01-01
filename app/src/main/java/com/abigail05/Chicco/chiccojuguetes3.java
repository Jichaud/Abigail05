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

public class chiccojuguetes3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes3;
    Button btnconsulta;
    TextView txtchiccojuguetes3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=35d097e106cb6dbbfbb4aa286acf5796#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes3;
    String urlchiccojuguetes3 = "https://lh3.googleusercontent.com/f5kC3v2OpMBJcurNDYwTT6-itC2qGvteD_dkUFmi1ec4LQHxR_dQ78jzAazz1roKkFZBRQ0XupboyKF_74ciohshowbbOiSFSA8hcvST8nNAP_fYx2pSuH6UPU4gBWR1-LUKXSrwpdRH0sJuOQJc7OKHbPpUkRn36syuKAcLZ8mcCGpa0-C7C-fi1775MeLIhlyE9UmkoyqJ9QDA53U9IY1rK476GpVszJMK5Am5XAYB3miaGQNKIQWXAMAl5HwyTwRTCOpL9yKpf5-jFMU_VP_HfWepUEoRfQHe_muKULMdnfk8O3u44XK_QZu4c7aZMV9FwZ9rqAR4KT4IoJSHqQD-mHVUTphcUWJbhPsaQOfoO5JtPcLWEPec60kTA1Hl0HaMGy5rIxHmgm0mL701tD8XxwXW2AQUNRlzQu-Sh0xl7UXqqW4oqK1mCDwoDYlpTMB6yxMZfp3PzW6mAKCsGvy2jPOjJ6HDJvNeH_P8VLk7Ev6s7IRfkjdA8O2RIO0JFEWOry2Ueqiz_NYWYfWslLZjjBBbvF1BVgyBP9aVjGAANMLsGyKMqaqtL6mRXmHzDQj-agTXRcXl65WjMJSS4-FNb0BDo6eg4D2LUH9r4guCeS5QhNvLLjk2lbcjzMclvAKJ5A2v98NG_XC6XyVQkqKpRXtANQU7S4MXCZTqFIk=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes3);

        chiccojuguetes3 = (ImageView)findViewById(R.id.chiccojuguetes3);
        Picasso.with(this).load(urlchiccojuguetes3).into(chiccojuguetes3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes3 = (TextView)findViewById(R.id.txtchiccojuguetes3);
        final String stconsulta = txtchiccojuguetes3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes3 = (Button)findViewById(R.id.btncomprachiccojuguetes3);
        btncomprachiccojuguetes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes3 = new Intent(chiccojuguetes3.this,webview.class);
                btncomprachiccojuguetes3.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes3);
            }
        });

    }
}
