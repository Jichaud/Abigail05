package com.abigail05.Babelito;

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

public class babeaccesorios14 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios14;
    Button btnconsulta;
    TextView txtbabeaccesorios14;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9eac7e55abdf17c8545e99d6ef1691c2";
    ImageView babeaccesorios14;
    String urlbabeaccesorios14 = "https://lh3.googleusercontent.com/MF4K88XLyQCZrSwScVcpqyCC--59Yfm7YTOXN092IrCDS2qwb04aU3VWFGglL1Y8WjxUu4Fm8kINMHt2h_G9rdWu6XksV7JEpYcjIN3CQsyJa-zEnYgkAnREDGZablOJdWYtFr8eUuUKsuKbE8WcjPfNuGmGuQ3tMvtMAvcwZMrvaidWH_LxCbYo1MVFUd6-hqxLPonlINV77ACP5RZ_3pLNzjxBNuk9MHi5CeVKLo0PiyGIx0YV_p6B2NAvuDk0qVr3Cke3I-6Mhr7PRVRgESXstwrfI2qPCt1TeGYZcPRn9mte5TDk-MmZIiUHGL2GUfStCGWUML1ocviyKk2LciwCH5E0UGq63e_2c8yGrAzHz0lpVNjdQ1eW95HE9ogVPi_N6nOsMj8R1WYMV5623_TUI8hE_gYV3gGAmhQah5lg5VOuNLQ5v77y6ecLYMsHRgoL6imgG3YTS7nZplosS7oKFdhYKHR36q0SIkzSw3y5PlOuShvoSB9QEVAT0_Q0dBSpom9ixTEVVpbmuV2kYJSlW6EZhfefxNVtWqE5XSLLLVxwefyWYsclDjBEaFQshgM4cjXAVn9aUVcfQGA1X5bRjQbtyg26B2468Bwc-Q0hQ03HmQ=s210-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios14);

        babeaccesorios14 = (ImageView)findViewById(R.id.babeaccesorios14);
        Picasso.with(this).load(urlbabeaccesorios14).into(babeaccesorios14);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios14.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios14.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios14 = (TextView)findViewById(R.id.txtbabeaccesorios14);
        final String stconsulta = txtbabeaccesorios14.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios14.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios14 = (Button)findViewById(R.id.btncomprababeaccesorios14);
        btncomprababeaccesorios14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios14 = new Intent(babeaccesorios14.this,webview.class);
                btncomprababeaccesorios14.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios14);
            }
        });

    }
}
