package com.abigail05.NUK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventchupete11;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class nukmamaderas11 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas11;
    Button btnconsulta;
    TextView txtnukmamaderas11;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5190303add1c7673ef0bc2df23851ad0";
    ImageView nukmamaderas11;
    String urlnukmamaderas11 = "https://lh3.googleusercontent.com/fejhyq7ySaHjEexBQdYqFxUkjxOrvvpHiIHGDA4BzUjtHxKaRZH9Kk6MMyUxKMeZJDeHXeWRkiHja7AH0oSEM5khARFOXqVvs2J7F6vRrvivpbRS9rh1UM_3DScELJZDlwIZSjZHDiFbxL2KixkcWLir7NXMUX8_i80_ftMZxDEywuXRkn_7gqtjD4ZQQAQeEH13qZchOc2ox6iqhYfmA0EcOdxBv72r6gNqjgtecwGM9weKrvr9iXbWSiPiV8PRH-7PaNAP2_DAWPGKkbmaAgdO5AfqgN0TUFw85mEq6vPHRulIKDkrOdYuFGqpydAIBvYMUY3Vzt20CBUpMuO9vUgxKdiGHJvfAvE8lnLFguZpIYfJ-tklz5CcXBZ2LxrEqL-jRzY2prTs4XD-okrO6dl2eCMJ1IL8E52Fmc6r-CbjCVMswe0_JIuhNu6md327uFnw8_0-lgVI-4RMv3awgyzAb-31VRFCDgCOHYeIAffZq5whwMCPki-t91aLnTZNIqq4tPRjVzR32BBHu-dC5PNa_AxeN-NYBN7pz5h7r5hbteiuwptj14b7-p98cR8DPIeHIwDXk1H5O7K5Vu4IjiSJTpmL7qhDxkBH19Ck-2h8PVLtuA=w254-h298-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas11);

        nukmamaderas11 = (ImageView)findViewById(R.id.nukmamaderas11);
        Picasso.with(this).load(urlnukmamaderas11).into(nukmamaderas11);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas11.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas11.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas11 = (TextView)findViewById(R.id.txtnukmamaderas11);
        final String stconsulta = txtnukmamaderas11.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas11.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas11 = (Button)findViewById(R.id.btncompranukmamaderas11);
        btncompranukmamaderas11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas1 = new Intent(nukmamaderas11.this,webview.class);
                btncompranukmamaderas1.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas1);
            }
        });

    }
}
