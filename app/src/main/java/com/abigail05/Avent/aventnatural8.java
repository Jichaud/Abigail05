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

public class aventnatural8 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventnatural8;
    Button btnconsulta;
    TextView txtaventnatural8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=702e30fc285e25bbb235beb165165150";
    ImageView aventnatural8;
    String urlaventnatural8 = "https://lh3.googleusercontent.com/f2a40sl0IvjKrgKefa900kEeEsYUfhbTU3xhydQXrHbZeHI4ljCAg4rFcgR4Q9BGxP1bWKxnMCY20NoLldc0kQ2d-InEzXEe7LmdD2xsFSrr9MtkPXOFbfhiAQLcJ0Uv0CfIK78mYsUejxyxR-d0olJMY6_wo4Ux3AYbBM-ubxRxlAlFjMZQ_rnc44Fk5LD_Q1kc2ht-RTg8KxBcytMIBriUiRfv356xay6aWUg69tnIKwnxr9juxE5ywSPzfsEF-IoKj3GOwFFgY7Lm0TW3yngPPXFYtn678DAQ_fYA5ylKRGRNTEnIg4mOhVP2tM43NVepbo1CxL1PBGoCgrAp3Jy1J7bV2OdQzWTXcWOKUSrkfIF7MhbxzRAF4wIh-M7zchA2GaBnpfDgDkDassQPcQvBNBD_OlukgsVH7gpq0ru8KEG9Nwm2JlVXC6_HGfY5VCerI1JiDFVbPaHPh_N9642PzNriTk7S97CcGwsEKf08mSQXoJWTYUg1uIgKCP3Lq99JfACSQn4qHQcE9tRZMIUkx-mW3LCpj7G_JRLT20lcP0Qd3cvSY5HLPg_mVM29ZM4rD8aqe5Jac0Sdq3lCWo8FP5FbfSyYdgED59H3aAkvv7D6xg=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural8);

        aventnatural8 = (ImageView)findViewById(R.id.aventnatural8);
        Picasso.with(this).load(urlaventnatural8).into(aventnatural8);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventnatural8 = (TextView)findViewById(R.id.txtaventnatural8);
        final String stconsulta = txtaventnatural8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventnatural8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventnatural8 = (Button)findViewById(R.id.btncompraaventnatural8);
        btncompraaventnatural8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural8 = new Intent(aventnatural8.this,webview.class);
                btncompraaventnatural8.putExtra("string", urlcombo);
                startActivity(btncompraaventnatural8);
            }
        });

    }
}
