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

public class chiccojuguetes4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes4;
    Button btnconsulta;
    TextView txtchiccojuguetes4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=af43bb95016ec5c0b45d7c9fb6c787e0#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes4;
    String urlchiccojuguetes4 = "https://lh3.googleusercontent.com/E1KzRFeZ6Uz4wbvdJqbuDZp-sZr7Tc4870zGjj5WKjbUpZ7s2okCYpDNiLBIahBwlYLHnp84OdG89PBeIfRe4ue4qI3Ss5JhvKJRF657DuyuX3BfuA09KaPqUl5uExVWmfQ3P-s2LCGPzdm-qw9KgzDsR0H04CUspouqGpSXgJZoId5PL--EdqDNV-1pawEy-jxoEGu4vtzkEENu1oHmwq6J4H35Vq4kZC0no03jbOC86TvBi7PHlfar8elNV0IMbPcfhMPmkz6MdeaOgqt-h1f15KxoVN6eh5aaNsfmNAOUKzps9sL2J1b45DRZF_nTxr5lRhFgzBpkGWktkX1L3f7V6Btp7stKbgxBeFfT4qo4GR5SBWytSzYJ4d23UXsNRikhWec8bGYWZxYoOh5OtMHQWOPy5rJsZo2HwiVTJAoaNSWV3A78JJVQXNZFUBSsMbVMK47Lsgd0-2cY9H9GoeoZoAL1i-BaOyA8JY3gUbnrDcrvtZACMbNOaXkPu2O2hYkJ1IbgtMDnfqj3WeWuQGa-wbW0ozPzf3comh7Q-LSIa_qPpLQJBEkfWzFPYodKnK6hMvUN_UAbZ_OvLEeBElnHfmnHF1WfTsOboNy0GR5YN4DlPCY37L0OzR3cmK77SAEEvFvKSDn9M444eSKKX_ZIY-A2lJSK_HWyAyqqWbk=s400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes4);

        chiccojuguetes4 = (ImageView)findViewById(R.id.chiccojuguetes4);
        Picasso.with(this).load(urlchiccojuguetes4).into(chiccojuguetes4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes4 = (TextView)findViewById(R.id.txtchiccojuguetes4);
        final String stconsulta = txtchiccojuguetes4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes4 = (Button)findViewById(R.id.btncomprachiccojuguetes4);
        btncomprachiccojuguetes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes4 = new Intent(chiccojuguetes4.this,webview.class);
                btncomprachiccojuguetes4.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes4);
            }
        });

    }
}
