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

public class mibesbaberos6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesbaberos6;
    Button btnconsulta;
    TextView txtmibesbaberos6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0f0d37f4f5d2b6376728c16a1623c722";
    ImageView mibesbaberos6;
    String urlmibesbaberos6 = "https://lh3.googleusercontent.com/MsdAR4Ie_YoYJLsW-q011DpS-x9ikyJPACjmiw70cZD2h486V_yEnBkwBD4nahj8XRICqj8dlXvSSo4yunRqAs6UKv6uFoFs8_myBjQfVSPs64AzXdNBoLOnWK3PoJnnwD2v0Tgb4Uire5qnyr0nA8jhYCh6qdqVonqtJ5Ju9ECk0-vJV5eTKYqrFQelDFuPYy1Wz-HSp5qSyeOAy8_vMbmUs-33DytdoQn7mybUmzjyBD98lJEHLf3M2KCi48qVV-kifT39IwgaeXJdqgS93xmTIqhW3IC0T0U5qWAWFEBVY7OA5vPK0RifMlrMz54HzkDCbcFysBmxDOdjjm1MfJE9g7DVtNd7O4Deo-1lVoxVv_yETAOb4e2nPUjMse_Hf4ysRQJtVvMiWAVvaa-xjOH5I-oB4xF4mMKeQgul-wzqAqOR5lEZGL2VhPNqN7Ts9eRcd6R6Zt4UxUhsD54-it0pwIrx3sG4LC55ENr8wbotUbb38_mVhNNZbGt2LL_Vm93z6mod9VZv6ZCkfyJmCydbd3FAfkq2qF4pQgpP8OnluxjG8OyMCU3QtRGYoIrY2aZVenLd3-CHsmAbpyevBo8pWXVzHRVzP6-vfA0CJa8ReNVMklRfawSTLoi4x9DJkU3dr8WX2YqhhGtAFfqKgj0XFyeWn8S8t6sdtJ_Aqzc=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesbaberos6);

        mibesbaberos6 = (ImageView)findViewById(R.id.mibesbaberos6);
        Picasso.with(this).load(urlmibesbaberos6).into(mibesbaberos6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesbaberos6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesbaberos6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesbaberos6 = (TextView)findViewById(R.id.txtmibesbaberos6);
        final String stconsulta = txtmibesbaberos6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesbaberos6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesbaberos6 = (Button)findViewById(R.id.btncompramibesbaberos6);
        btncompramibesbaberos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesbaberos6 = new Intent(mibesbaberos6.this,webview.class);
                btncompramibesbaberos6.putExtra("string", urlcombo);
                startActivity(btncompramibesbaberos6);
            }
        });

    }
}
