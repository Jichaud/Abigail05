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

public class aventchupete3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete3;
    Button btnconsulta;
    TextView txtaventchupete3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a97aa0c1a059bb2ab2b08129d63a0e80";
    ImageView aventchupete3;
    String urlaventchupete3 = "https://lh3.googleusercontent.com/68262NbSeGvqcINBSUKsAssSG0xGhRyfj9Ns2gBKksALSOg0jTluCvxziWZ7vrtXkEPDOKLmpezK-XeP-E-7lZ8Cmgo8K8NcMQwzPhurxFfU9A2hC9Z9t08K-aE2oc7HhsTq14yboh18CY7hisTjZG8jaS-jqoJlF6f5RBzOcZaRMwI6FclnOn6pVtY3hUV5RsEughUo_b98aZOCoD1RBdsXnJIMayPc7ONRfCSJwnILb2MXs9D2aZB6MfMw9M5k3lWPU8dAOyy5xL3EUEyKoAPI8jdf8hRy1Rhoh3m2rSaxSvCWNNBgfBGr-pHnVPEX3PmydSnpnwim7jFyOnklrC2AmXARseCVq72mvr-D7pQkRLHX9U_Sdd1KZSQf5JbZlvADLZGJ4GVOUpSzsWV6115aOPVG5hH6qnR2XMgJLKwXKmDYdi2L2qQpxZGtvATq5Oywgo_AaUCqpwNValdAldWfN_kzuq4YhsX9HLYDgSyFD-YJYY5yYCPou-HfBrWWI-DB4cn9VbR3CI4ckQk0sTDqM6aRg0Bg7OncR3i8rvH-5MnODP6AK86vSoKWZ8vJ45jKOFpaIoTDrd3yj8CJQKVop3h2pDyWe_ss7cridldqVZyedg=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete3);

        aventchupete3 = (ImageView)findViewById(R.id.aventchupete3);
        Picasso.with(this).load(urlaventchupete3).into(aventchupete3);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete3 = (TextView)findViewById(R.id.txtaventchupete3);
        final String stconsulta = txtaventchupete3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete3 = (Button)findViewById(R.id.btncompraaventchupete3);
        btncompraaventchupete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete3 = new Intent(aventchupete3.this,webview.class);
                btncompraaventchupete3.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete3);
            }
        });

    }
}
