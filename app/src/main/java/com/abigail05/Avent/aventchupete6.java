package com.abigail05.Avent;

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

public class aventchupete6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete6;
    Button btnconsulta;
    TextView txtaventchupete6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2552fe124cf4710a065eee02ad8cc626";
    ImageView aventchupete6;
    String urlaventchupete6 = "https://lh3.googleusercontent.com/sFRKepQH1CoKHXov2vD2YG61d1ODA4jWEhNybbVZfKTe5kIvWNfrC4orSn7XAoBJIVsGQhnm3WrIyqskjPjuRx89QDlYspiDVgTUpD-pfrgGEJLRNMcsbZcl6IvKWwnUNm7bRA-QzDNF8465b4z_-G3ekCkLGU6MxPkYOkl55YDBFCb-T7PWaptWzcd9d0Iv27HBDf-sY13n3-ISCwOfiQ6Fycf5mRyLXaq2RuUUeck1hjl6B9JHbGKjD1qTbfyZgWhQ_jtYLisr3HNBCepNflFLQYod3V4yK5lDZSLhFHM9Pztc7H_9ShRotkTzMWF4VaN9MenuVnpZn0fVCQQJkKfI9idggSMfeuD0bTUxz0HWrk98XuBdKlG_k_w-uslVWFqbbJfk1Le8WHpUvsOPtejaAl-YzHQ7gyp-iR1sA4PLIY0zF5qWKHpaRQyzSPrs5L1ShttRZ2RmXx7H21t-_jVQtkl08LTIdJ7-FZRJb3FrL4lCJCbnLV1f8C8SsoCqaHNYpUk0Rn2xMAMwFURb6uaJHsQbMSyjRleaFAHuov0-OeGlXeQgLPcZ_ptZFi-Man70FqOblpLnz0GJFuG-VwAOz08KSiAbp-Ewf2lgW9PdQW41Ug=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete6);

        aventchupete6 = (ImageView)findViewById(R.id.aventchupete6);
        Picasso.with(this).load(urlaventchupete6).into(aventchupete6);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete6 = (TextView)findViewById(R.id.txtaventchupete6);
        final String stconsulta = txtaventchupete6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete6 = (Button)findViewById(R.id.btncompraaventchupete6);
        btncompraaventchupete6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete6 = new Intent(aventchupete6.this,webview.class);
                btncompraaventchupete6.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete6);
            }
        });

    }
}
