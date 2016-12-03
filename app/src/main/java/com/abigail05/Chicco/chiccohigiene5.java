package com.abigail05.Chicco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class chiccohigiene5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene5;
    Button btnconsulta;
    TextView txtchiccohigiene5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=65369040306504561b17d740ecc9f828";
    ImageView chiccohigiene5;
    String urlchiccohigiene5 = "https://lh3.googleusercontent.com/hdzskEzSietknqNgaKYoBDNVufjY5zZaqTY80U-RTThlXvMZnd_hg6ozqsz5MkzOqSTle-dksKaR2OPHycfHVGIlGdhML7pduBF8COOwCr50ge2oQJdHK-FFIHgAEcMytzYnSlyLvZ_OqpJs2sWAcnobF80EvEck4wWMUy9suUWLVgPOOJvNDszNaJm_nty0qhP-8hYZrUB81ENGP-_hpCzwKop_oLKCz6oTAtOEGYOwtHqhFlwsFq8QEAbwaPNk6BeJSEzM_GxMfDWhkbgzgHfahjlianfhZIW8zYzsKgbEjW9F5xD0W23GiSaJf0-53fTVQvQnGSVR30uRMUh6VQUXE4t7zVJM8PU_Xvw23_QQ98182q7J-Pdh7fDG-_8An4K5RqPYnXkaLWbt26iNRsF3K-cOCC5yQnjdlY_JMMh7ULPdkaIa0tZqoaYNPyQTWo6zJPqdzeJNZrvI2eMt08pZOBsGg3k6JzWcj8KXkgXLFFhNgLZf3DWVlrqwu6evlZEdUHIqaUGjEQtsDVrV1ULipwLBejcMuYKtkcj38IbxBKdIyFSNTg7RF6T1ff28oyPhMPOP6nu1DodOF-kQXYy2k4SCavOQmuB4g3v5c8TvmFM7-Q=s400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene5);

        chiccohigiene5 = (ImageView)findViewById(R.id.chiccohigiene5);
        Picasso.with(this).load(urlchiccohigiene5).into(chiccohigiene5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene5 = (TextView)findViewById(R.id.txtchiccohigiene5);
        final String stconsulta = txtchiccohigiene5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene5 = (Button)findViewById(R.id.btncomprachiccohigiene5);
        btncomprachiccohigiene5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene5 = new Intent(chiccohigiene5.this,webview.class);
                btncomprachiccohigiene5.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene5);
            }
        });

    }
}
