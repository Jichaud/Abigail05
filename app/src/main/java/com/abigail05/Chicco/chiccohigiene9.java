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

public class chiccohigiene9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene9;
    Button btnconsulta;
    TextView txtchiccohigiene9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4202397a2086515e55faaa5ce999ad67#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccohigiene9;
    String urlchiccohigiene9 = "https://lh3.googleusercontent.com/L8J6Ug-MoWXGPwB8uBmIGKBGj84wZhZBPC1SrqkwLCrl5zx39MrBnHnPmmZXK-CXPektrJQqileVQFNHM-GYFTFbkUG5HktAf7-S8XUQj7hqatcgLYyuNi47KLP0VCy01gKLIzTYxhSfzuHSax11aYokoqJleCcjZ7zATCYB8AMzo0znv2Wz_3giV2-umFZfY09DeAWkjzLzykVoqI61JtWA3jiothq-Zk6ckqbqJ0keYtkbg8thj6BItt0idoKJikiwNBAeRej6EVrrXXjYeiZqZq88CtdZ6MoqiPD-SvimXEOzReGRmtPQ1aK36vlqVjXo_CRaT583FNFqcTV9dzwn05Gy1TtFa8u_CPW1pp6zqRVCBKE1GtJYZIXXjlIrDzzu9g5eJYRmCUUDcbMJqd0aP3ciieNTvEEsFjNMCj8my7A6NssRhKayl_Fdpime2BqpGu5Jxop19jrDMt5xyPENicLGYyPA4QYhvv5JrpetQ7wjIMXjYzGMb3zwcjdOtYkSGOVeWHh0SJiQEir8aFKclS_59YMIrM2eHdhfpDREByLEBPjyqnazMfwreJqmmF6M-XCaAgf7tMgh1_ABZ5AEezhDnnsuVUqMFmC9WUQdt6VbGm5TruC04zdKzjUcU8rh_FhwB1iZCoUQcLdyfTKdlo8V4KT_B_zqabT5jHA=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene9);

        chiccohigiene9 = (ImageView)findViewById(R.id.chiccohigiene9);
        Picasso.with(this).load(urlchiccohigiene9).into(chiccohigiene9);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene9 = (TextView)findViewById(R.id.txtchiccohigiene9);
        final String stconsulta = txtchiccohigiene9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene9 = (Button)findViewById(R.id.btncomprachiccohigiene9);
        btncomprachiccohigiene9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene9 = new Intent(chiccohigiene9.this,webview.class);
                btncomprachiccohigiene9.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene9);
            }
        });

    }
}
