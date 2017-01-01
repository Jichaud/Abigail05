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

public class chiccojuguetes10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes10;
    Button btnconsulta;
    TextView txtchiccojuguetes10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=84f7df372898b3acd5d7103e7fca8ff3#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes10;
    String urlchiccojuguetes10 = "https://lh3.googleusercontent.com/OWM2jp1CVBRa1Q-kGgSOseyJrr6YnoVkfKETvmoaa8yfG91bpP4gs1QSf8-fSBhc-dX2CuepY9YoRpxV2R5IJb7q6f2ZEKOrP6geP3DDGhBXtDQnuh1HcouXcHNOvw4dON03eXzLtydUpKxSvBiimeLSaF2l0VpsM5drfXbOenWwjP7WKMB-qhQ-XV0CzJqw7tNhKZAg7NUAiddo1PSNkDnwrUzcYma4N0yCb_nhAUc6xefkqD1AACQ2tnLTkEECIWtd9Q6UooP-rhyrk6WGRQ0BL29HKgTGnAuhTKMZwJFxhwBYFmJcJLi6RpSy6DaoU39cR3Z0wTeGF7LsRiQav-tw8SuxOeQ_bWaLxde5lHuSELQLSp9VixqHQWcZjYJfiq8Z7jsT-CSJurRv73oPygqW2Zcye1_y9KzvQIA5O4KxOysHc8UlZS0Jq5H6p3diZx7r3N3clpdGxjyXXKYCNJiAXT7B67FewJtzGES1BbtacU3LI2MMeQGkkJRSAIXT6jm0ouPWMchp4ah8SW5ZPmJdLshYpgd5Nu2guYA-hMVbRsidfALZmCb-9s9oDBymw4KH79zzs6YIFcdk47fdxoE2B1wi9iA4RQnFEJL2k1IySw0ZqeycrzciSWbiDJ9-N3cQmTEO6W2975SHcPmR5rwI9GAng6OS3_miEl6Jdg4=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes10);

        chiccojuguetes10 = (ImageView)findViewById(R.id.chiccojuguetes10);
        Picasso.with(this).load(urlchiccojuguetes10).into(chiccojuguetes10);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes10 = (TextView)findViewById(R.id.txtchiccojuguetes10);
        final String stconsulta = txtchiccojuguetes10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes10 = (Button)findViewById(R.id.btncomprachiccojuguetes10);
        btncomprachiccojuguetes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes10 = new Intent(chiccojuguetes10.this,webview.class);
                btncomprachiccojuguetes10.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes10);
            }
        });

    }
}
