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

public class aventclassic8 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventclassic8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=fe9002f6de0329ac775f467a73f1abf1";
    ImageView aventclassic8;
    String urlaventclassic8 = "https://lh3.googleusercontent.com/D_-NFEmtJEn4QxrguLuuloyfOVTqVSwkqZEJZ-AoBJRlLgwVBdf0iZWr7MvKjCgB0qvCNzUTaRgrBjkYOEmFx3jDXhOQKGEfUpxiMz2XGyy7jmih3xjASyMdYnRwlFeJ7qqj4x6D_kADZ2LAXqbCH2jc07k4l5Wv7BHEnh-bF60zg-Q3TDg22m5zXY9WuMXEtWz3UEFIPYQSfy0B_HHz9Pb_i9XosGcvvsN7_3x9st0B6uKqMEtIXa8_cZU27zrt3FFoieBOnS8SE0eWYSYxvkpdo99y8RO8gcjh3QdRdglo9uxN6WbinQ_wGy8aKo1MAeYq7iKh4NKzkdecbdhnsqSuxT79lSQanjToHkm0P4wrMSCkPls1Yr74RFtRO25MnQkJi-wu_qCMerFWTiYbzgu8SU_sHGPH4fGnegbT1WwB_oPXsaOVJAcOWBEMCLgmCFmrRLw7vh5K_J--OR95d0vcg7z4vmFb-hanQAdwh5SU7l77_5CzboV0rZFuU74WtXxOx_y7PBMMMQhrLDhCoCbvpfnLe4f0SPA9nJO1DZhtoI_fZS0My3X6bRbR3OpAKn8o5E20L-n56S6Q_Mu38zS1h96b5LydLiM3jPTFoz1-3rT4zg=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic8);

        aventclassic8 = (ImageView)findViewById(R.id.aventclassic8);
        Picasso.with(this).load(urlaventclassic8).into(aventclassic8);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic8.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic8 = (Button)findViewById(R.id.btncompraaventclassic8);
        btncompraaventclassic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic8 = new Intent(aventclassic8.this,webview.class);
                btncompraaventclassic8.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic8);
            }
        });

    }
}
