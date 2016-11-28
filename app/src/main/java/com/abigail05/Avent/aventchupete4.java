package com.abigail05.Avent;

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

public class aventchupete4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete4;
    Button btnconsulta;
    TextView txtaventchupete4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7a5a1dc83b2b13daf4c801fd89a5c6f5";
    ImageView aventchupete4;
    String urlaventchupete4 = "https://lh3.googleusercontent.com/O7Hj0VVQ4gAh4Ht5UrRj1GRV3A1y7prgjq8qCiiROWqKgm4EP_AV9RU_axO5Ju6Evz3-1MnjBdXEQ5AuZyO-0o79-gDOpn0fFWoJxuZOCmdkOP9yiyr5_BukLDbM6JGDrNTc4Rkqc6zclT_ammKzOw-wJedDeEhCzRY-uCnuXbLSA2gm8b_-j2dalBOJS1EAw7OzfxyZh8pKg2pEFR2hK0sZrcUwzNHHr4Ga57MyjVw4OzvL80xpYbXgndMtocOn_9Yxlim8sZYxPfnSbQPlyMCiluOcHfK2CXhAEe7ewgW2AeEmJzojr8n4QFdI2JOAyTNGb9VAP8nuwX3R9vkdRvC8-aB1-FjJfaDxMcnKb4IaPTESXcSvm1890vM7fdPrVY2K8AaDzCBELPgmNM5LfPy18viHS7pnJpHj98PSZEFD6B9OBtxVY5hv8AKHf8wjjEjRnPo9Z200QFYS6pAR8BcFYyUszWIZ02yLD2qAkiQhOEtvl0YlwXGspjb4CkHJTsKp6wRGuRIEEjQfNK_5Vu_I1q83I_AEMTAGKChT5eop-oe6PyMhJP_DF6aFT4GUWMdQB9ZI3vHMuAD3jPherESoM6eyYO9chuY6fVukeDyjawkraA=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete4);

        aventchupete4 = (ImageView)findViewById(R.id.aventchupete4);
        Picasso.with(this).load(urlaventchupete4).into(aventchupete4);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete4 = (TextView)findViewById(R.id.txtaventchupete4);
        final String stconsulta = txtaventchupete4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete4 = (Button)findViewById(R.id.btncompraaventchupete4);
        btncompraaventchupete4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete4 = new Intent(aventchupete4.this,webview.class);
                btncompraaventchupete4.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete4);
            }
        });

    }
}
