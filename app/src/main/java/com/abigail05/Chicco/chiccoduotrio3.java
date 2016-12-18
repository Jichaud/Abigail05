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

public class chiccoduotrio3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccoduotrio3;
    Button btnconsulta;
    TextView txtchiccoduotrio3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=10b707b0fb3a97de75c39d0f2eee046a";
    ImageView chiccoduotrio3;
    String urlchiccoduotrio3 = "https://lh3.googleusercontent.com/JNuvmCjxnIgtzoLVBO0A2r89g-6Cb0wFcWfcG8uv2a0LD4GCcj5T4RMl6kkGjo9uZSUriyJSoM9EZujHPYQYlEZ3H074ckAU0xnzL87ltCXdBpayRAUweYFqyuYHnRSp3s31n-FfE63XfOvYz9H3yMbpgRDFCYckY4h905jT6S_ueM2FsjRjfoofWCyI4c6rNoXUODOWYxztDFBLvwghxYuujz39e6OlVxjkDZ160HQxl6hsDTJ9xr96mRM9xrvViJ8teyifmFtD0sbIQAln4Dx7ofrSyx5VV-EF1tBlLqOaxSHl6dCXidOuHUcsZ4OZKz06vVnSaGDl3e8_5wqMa0xGGWsegqYf7-DAhkc7wjlXTKlqsjpg8SpxjG3Dj9vGnZKrcSjBzRFZNuH_X6Oy8IFUBbR8_TCKaYNTEPeEI5ivDTGkQlX5_RaiwWJxmJR0ifSS7vYp5C6UoUP7GNXYPXlEfhmJ0wNr5_vPackbAzK_OmoApWkT-qwqj8XrWKYcqg0ipJaNWjO4zQTst-kUvYJwUq_eOk1IIQ3qxmB2vOQGqzVvxfwhMVVFE7O8bAom3tdfad1B-5PaHXvSAD1pe1zWlUrUiZ53gZbLHKkxWE3ndun1KvUCtjf-m3CgiwXSyaciPCOQLJPsolHgT4vm2L7mgJEa9ZaHBFmQgY2TYBU=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoduotrio3);

        chiccoduotrio3 = (ImageView)findViewById(R.id.chiccoduotrio3);
        Picasso.with(this).load(urlchiccoduotrio3).into(chiccoduotrio3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoduotrio3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoduotrio3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccoduotrio3 = (TextView)findViewById(R.id.txtchiccoduotrio3);
        final String stconsulta = txtchiccoduotrio3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoduotrio3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccoduotrio3 = (Button)findViewById(R.id.btncomprachiccoduotrio3);
        btncomprachiccoduotrio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccoduotrio3 = new Intent(chiccoduotrio3.this,webview.class);
                btncomprachiccoduotrio3.putExtra("string", urlcombo);
                startActivity(btncomprachiccoduotrio3);
            }
        });

    }
}
