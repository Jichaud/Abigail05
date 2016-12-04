package com.abigail05.Colombraro;

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

public class colobaneras3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompracolobaneras3;
    Button btnconsulta;
    TextView txtcolobaneras3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=635031a46b3ab007375bef8acf4769f6";
    ImageView colobaneras3;
    String urlcolobaneras3 = "https://lh3.googleusercontent.com/UjjVdFtVYpQ6ymc6pZ3xJLtRMW_64ah0AXq5fIoDZZsP1BVuZZwc9eExzSEvBvwXJBX9l_2SC5inhVwM5FYMoml0SPjCxaZx9rTArqMn3naNn4sltv_1S2lNrD_12QGCwCNRD3ra0CYvGiMZcLQ1WPKxdgNeQV1dPs1PeRk8dgjuUFXGC1KN8ZY3q0TfhhQ3LtK2Z-C-5S0EQLL7gRLEsCsxXzEp6rkt8X8uGvIWTRpHWGIOfbe2TjjpgZv8Gi3pPBKZJackGhAd84__nl2GQE_uUx15c9MkcippG3DytxQakV57gfuOQwqInfJVEWxYnZxeyptgVkhTdylOlBLdemWHYyPBwymNAheS6NuQAFE86A-UAnFUJCuvJDpJk3KvFyl1dDN-qToblLgzvysHurnRAaD6Zy3xOsDjMRwYxv3YAihIZLe6LOq83tsg4P7uOc6zKwacrYgOMaD2I3mnzHklAjMB50DWo3R2qGCinf3szDB6YoWdqEQ59d2ZqAQo0OzDIoYxByKER7Ay2X_dc0eW9Mtjsrvyutt-uu_bK9ESZDGeFu9NHj_9V9xQxHyETsd3lOdFxGWKm3xTVUbnOR4SdWyD_0OHN60a0saIJEjhHSgleg=w512-h508-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colobaneras3);

        colobaneras3 = (ImageView)findViewById(R.id.colobaneras3);
        Picasso.with(this).load(urlcolobaneras3).into(colobaneras3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(colobaneras3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(colobaneras3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtcolobaneras3 = (TextView)findViewById(R.id.txtcolobaneras3);
        final String stconsulta = txtcolobaneras3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(colobaneras3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompracolobaneras3 = (Button)findViewById(R.id.btncompracolobaneras3);
        btncompracolobaneras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompracolobaneras3 = new Intent(colobaneras3.this,webview.class);
                btncompracolobaneras3.putExtra("string", urlcombo);
                startActivity(btncompracolobaneras3);
            }
        });

    }
}
