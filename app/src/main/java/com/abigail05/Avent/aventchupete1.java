package com.abigail05.Avent;

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

public class aventchupete1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete1;
    Button btnconsulta;
    TextView txtaventchupete1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3f271b615c2e60d8d4b074aee3471f51";
    ImageView aventchupete1;
    String urlaventchupete1 = "https://lh3.googleusercontent.com/WoWMsQPEc4nwe5k1ar0Mn5IsUIlKhhnfrY66YgiOY1E2TxljD8EcfTiBcLeYW5qOh3hLfFdCFziIHhcZ06-6bCZ3CcfaD9C1b1E2-X7x_sqZWc-fEzNN-myg5JGZqK0R6SKVFF33p0XN0IZB5DEyCpPq5Ed6tURhba7EALBGDuweoZUFme2swlYHVCbkVC48F3svNhmPPEk47AS3KhD1mZcq10teTo26N_FrndBdzCx9YkDEBisieVNuLWU1b9Ov2TxA-8PG0Maalr2iM-BKZgONUPJbGny61SDCCbwOX9SQiM1Qj-uu6y-X_7FZqp_B2T7TfVB7HO81AXFTWOp6bAWC2yJ2w6rz7IaSwOtnPEwrDre932TiGlzTukAZOypz3x7DZebuCGmtK270kakMxz7sWyuoYHvv7_YRGvNPrb9dN_da8FAlfpEvX9n2jP_Ef1B30pqStmhXrJqwaZERAtl26h6w2UAz0bweiotRBbYmQ7tYsJ6QsLlRe0r0HaLlMT9jHmWTGFw6HAHkCxjWpoiKTWG5Lc8RAZdK_BpoWAzhNgmx4jGkI5nM_53ISr-O1pdOcsOUDMDxb5Jhl4Pp-_L8Eblss8IEYkw5Ft-gSTCXY27aTg=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete1);

        aventchupete1 = (ImageView)findViewById(R.id.aventchupete1);
        Picasso.with(this).load(urlaventchupete1).into(aventchupete1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete1 = (TextView)findViewById(R.id.txtaventchupete1);
        final String stconsulta = txtaventchupete1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete1 = (Button)findViewById(R.id.btncompraaventchupete1);
        btncompraaventchupete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete1 = new Intent(aventchupete1.this,webview.class);
                btncompraaventchupete1.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete1);
            }
        });

    }
}
