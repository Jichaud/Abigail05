package com.abigail05.mibes;

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

public class mibesmoises7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises7;
    Button btnconsulta;
    TextView txtmibesmoises7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f23492b8f73c850a3eff67486f9af419";
    ImageView mibesmoises7;
    String urlmibesmoises7 = "https://lh3.googleusercontent.com/dVhkfBCY439oi3jS1Tpu7A-FLonymTeXj9U7wBc8cTYvjAyQLWQ8ibF24IkJ3kuvXOdz9F-QLU3J4KpMm1yu2J2MUIJCmSB_dNsqXr7seEqiWoFUuTW9omcchM5tLwyJ6NNc5lURQomoX89sIaGxA1PMr9YpNT6LQsmNv-pZ7vokVN5qJnWItfJh-DCTMusUtwRA6nOvZaIg4xRcnxkcBRr-Wy7Ucx9JuwepQN1KKpWdwfj2ML9jK-q20lycoDKBDH8avoAk3pjhJSVnERi8Hp7h9wz0i62cKxuYCTQ0hdXsna1P3YRPHE-DYk2URed6sEJz3TPUoy2l78q50_TecPeiqyhY1Fg0pWPnGN5DJjGzD39_Jv3wV0MS5aU4ZpK4Q45LCDvHldkqSkrUSM_vqCDfr8FujDF6yl_cpe4Ox_dHuGQ6beWXbFdmjN30inLHf4GKvzKpTZT7vi4pG6eUXp90tXTBC52DYB3dUqfOXt2bk7hdEsSMbwsKKgec3rl13QoucP0TlPjXWE8vPoP8yXktJzJv38_b63XQIEXTY6HVi5PUxJSs-GvAHGv_MwgCeJUBiLy_qZZNv9s897qnLEJY88aNj9balcWiX52M0Nx8z5gf3nmBfjYe3MlhoVl33Is5J9SvsK563rIoRjvmGfMnbwzCtADZlcWoXgTEIVs=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises7);

        mibesmoises7 = (ImageView)findViewById(R.id.mibesmoises7);
        Picasso.with(this).load(urlmibesmoises7).into(mibesmoises7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises7 = (TextView)findViewById(R.id.txtmibesmoises7);
        final String stconsulta = txtmibesmoises7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises7 = (Button)findViewById(R.id.btncompramibesmoises7);
        btncompramibesmoises7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises7 = new Intent(mibesmoises7.this,webview.class);
                btncompramibesmoises7.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises7);
            }
        });

    }
}
