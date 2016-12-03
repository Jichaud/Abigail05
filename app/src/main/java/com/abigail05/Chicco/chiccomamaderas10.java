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

public class chiccomamaderas10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas10;
    Button btnconsulta;
    TextView txtchiccomamaderas10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=647d80235744dd9fa0e7323d55d66712";
    ImageView chiccomamaderas10;
    String urlchiccomamaderas10 = "https://lh3.googleusercontent.com/ajc-zoULa66M0aK8LgR2FLZHXp7_gf0Tq3_0cnmOffb5sDRu_IOoHjvEBOI4zygiGR2mAsALw9ALBIjHHXz2sogB-ngZVu3V4Z-tENkQD6Qc9WTcgME-sG8M11BFRyOq_-fFT1po2JQ94Zc3XXdjSyL1o6XHgsNpsuR6eNNJsCx9_fT5CvBl8fNMZdH7QMIDacV9suS-9T3xB1JQbWbxujvB2fmeQmzzz75ahfsxXOOCrus60NW_FwzCUjfAs9vJXLXVsnQ9JJo_T6wciTPCfxNAjmthybMJrwLPr0lG8tgDQU34o15OCtg2KcwWivWRBk92t1rpkBpbezyJLjTrHcZQdZZA8Rntr4pSAjbVj1hB5Jl9Q4-eo_OMLwP2DcYh-vv469zbED6zBRH_wTS0TJThFyboddgOOqScW5fG2BIuLTzkVXRCFu_q2qV0RQ95RU9HA8b2BcBQh_Goglk05N15VNTVl9T-PVeUSFF9nhL3Maw7nNhMSwC177ukALle0qIhF7hk5Gyc0PM0tZEobnLDvG-UtjZMHEV7QGcY3unIpxx0dy-vNxXP0gWXBh5c9mdaUlLkYT3FQ2JO_y4Dk_LFy7le7NKHDnYviu3w8b10-q3LGw=w423-h424-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas10);

        chiccomamaderas10 = (ImageView)findViewById(R.id.chiccomamaderas10);
        Picasso.with(this).load(urlchiccomamaderas10).into(chiccomamaderas10);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas10 = (TextView)findViewById(R.id.txtchiccomamaderas10);
        final String stconsulta = txtchiccomamaderas10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas10 = (Button)findViewById(R.id.btncomprachiccomamaderas10);
        btncomprachiccomamaderas10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas10 = new Intent(chiccomamaderas10.this,webview.class);
                btncomprachiccomamaderas10.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas10);
            }
        });

    }
}
