package com.abigail05.BabyInnovation;

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

public class babyinseguridad4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinseguridad4;
    Button btnconsulta;
    TextView txtbabyinseguridad4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=326e3689365586a3cb16c00c86eabfba#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinseguridad4;
    String urlbabyinseguridad4 = "https://lh3.googleusercontent.com/KswwpCIPXhQrmWj4HA0njDHcBaPG1Rw4KibJ0jE80aR6-fmFR1N3FopwIvG7ETVoH33Py_JYTGY0scKliydcF3BP-yjReGcRP_FgRdwatP70NAJRYv9qBxJ09xV2GEabSBA9jxn9yeehUHbA_Nw19NEGxwfc7oH5865JvSp6tRp59vdWwME4lEqfM9NB6iWoT09c2g193r8YnvONpSvYTQrKgODAxAzuMX2Bsz4O6KEFYLgN6nQoqHO9nKVr9TvgZ1TyQSCL2qeCMWBx47aAgnwH7mTC9c8lYzSSMTgQrgNq4iUtJlVWE59is1N2oL6dRlqlUpuPAU_nQN39nXywdVzPlM4Et4S5OoAY0V4bm1Ne5AUNyITbGRI81kaRhTOSkO9qTIDcy1HkHd7dcoeN0Ip_xplWaaAhWy4tKNa82kA_k-7fT8v5RdRlYNm2kPEi7ybrvyQMLW1aocyi11ecUaRpeCLqUzPFHp4VeFrD1esG0hwo7oSI0SL9biL_3k2ivIh3AV9xS64iWDWFI7Mz_p5kBO9-pEmROTYPsRWeeRhjQRLWprWU3GewNu6xMRFGlb2x4AZTpToQiVmKY7Dpar-A4WLepPLepUZNcy2Ghe7dQ6pju1XFOXdVEAoxnledg5N3sMehYq-XAc-9FfoIyQc0cIWdrB-asU7ru00Xsyg=w328-h332-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinseguridad4);

        babyinseguridad4 = (ImageView)findViewById(R.id.babyinseguridad4);
        Picasso.with(this).load(urlbabyinseguridad4).into(babyinseguridad4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinseguridad4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinseguridad4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinseguridad4 = (TextView)findViewById(R.id.txtbabyinseguridad4);
        final String stconsulta = txtbabyinseguridad4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinseguridad4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinseguridad4 = (Button)findViewById(R.id.btncomprababyinseguridad4);
        btncomprababyinseguridad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinseguridad4 = new Intent(babyinseguridad4.this,webview.class);
                btncomprababyinseguridad4.putExtra("string", urlcombo);
                startActivity(btncomprababyinseguridad4);
            }
        });

    }
}
