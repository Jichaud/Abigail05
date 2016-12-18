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

public class mibesmoises4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesmoises4;
    Button btnconsulta;
    TextView txtmibesmoises4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6740a4ac70c695f56708d4f84ae396cb";
    ImageView mibesmoises4;
    String urlmibesmoises4 = "https://lh3.googleusercontent.com/uaj-lGeOP3YelLdselPgaVFYOgyZ7R6Xrp1ZaOz8locucX_A1PB0rqTE_2KXdVAB_rnHRxYdPRR_Sqq-ukNXQktgu1Bl69-mN2_zid06ttqTMCyqopEVYFYA1P2wkl80aEGZHGOwd4sCEA7RDHNnzcikaOyEEYQQ5TzwO_EH9WP6nxit9JYZV1-NVQMgq2olaZl-Gl7McnCJEOr7vPY7ugRKw8e9x1yczZ-jSAMgihtE7kj3jNWenxXbeIEF_9kXvNAiGStFz00Ej_V-zmhbbscjrUr2LdQ_C07lOpV_26Ib1wrSzbAJ2FnDMi8CAmC7P9RZquw7FeIECw04JNj9In4UwdhRr_owQTQui9yZ55Xqbby8GJLO2aO0d5BH0LHlehBAeDESRF9SiDol2yohejEMgEB9iX6sgndoDb4O8r_f3Ei3EyaWX429yzjmPgqoxFvFm4B9INE_QDwDUBXDeIyR-CEnAlJpcKlvvWcp9bDOWFqWCUH8CtCX_vnmSncAdFbO0Z4dmbLyiQSJG5t3M6Li71mc1xZYR7vBJ4X5xvqstISm68pN7UBsvUzA8vTvLGUrY8EwqVu1HfEPHjs9S_bevLk9KjTqu7Jtk7-YEO4ykHCVj1nmv8_bf95ExOCRdVgyt3Vg3p_8W_TJ2_zWdvG3Xg5AIjkAm4eGGTpQn5k=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises4);

        mibesmoises4 = (ImageView)findViewById(R.id.mibesmoises4);
        Picasso.with(this).load(urlmibesmoises4).into(mibesmoises4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesmoises4 = (TextView)findViewById(R.id.txtmibesmoises4);
        final String stconsulta = txtmibesmoises4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesmoises4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesmoises4 = (Button)findViewById(R.id.btncompramibesmoises4);
        btncompramibesmoises4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesmoises4 = new Intent(mibesmoises4.this,webview.class);
                btncompramibesmoises4.putExtra("string", urlcombo);
                startActivity(btncompramibesmoises4);
            }
        });

    }
}
