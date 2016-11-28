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

public class aventnatural5 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventnatural5;
    Button btnconsulta;
    TextView txtaventnatural5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4db14fafcace0f069d478ae124efe429";
    ImageView aventnatural5;
    String urlaventnatural5 = "https://lh3.googleusercontent.com/mQzTNtsUw4zHrSs6kDYAnRX4DdSt1OJ9dU4ic9YgGTOvzVOs76HKMqL3u1VfQKu2tpvJ_lxSSS3Pqrg3bWDV57cRlNY2P5yv28bN8v6dD3eO6wnedTgPtS12l_2q8e034KWc9--UjjemCNap8VMJ0pc59fBe5wb5rxFdoWCsYrCJUraUgDcacRzsM3m7C6iQbbp5aJ0aaZzfOocVfiCzeiB0Fc6T_NpRLV9WeTaoOQC6Hh2F9KYYCx6IfBTOpDM_aGQIru9AUjnwdptAEFZM4MSPm3T94gmYF_NEbBrOaI9xamgwvkUX56WwgnN3eYe7zT-NAJF4wIFT3CglS73W7IrazE0G2XHSlTsst-bol-VOLnrA7GXmZcegMD0_jsAauaS9nhfLjhjcDbb0B_drpijqaDp8tyBx4UPpEoGkJ4nK_5Se7oOyOJH1V9fKzN50LK8W9Pdf2rGFrjgryrAI2F_8Ghgtw1a6KHqIj1vzbpqoqsADHmmsnL78DDdpCWQwRDcF9eIoqd2AEYnkhErWz7O0X74oD0Zby3m4oWyrgzz0dafsr1T9rUWip-4Ab2io9F1TA2up_zBFaJjhQ9a-JD4CGsJkUuLVojeX8Qyq1Tb9j-kp4A=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural5);

        aventnatural5 = (ImageView)findViewById(R.id.aventnatural5);
        Picasso.with(this).load(urlaventnatural5).into(aventnatural5);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventnatural5 = (TextView)findViewById(R.id.txtaventnatural5);
        final String stconsulta = txtaventnatural5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventnatural5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventnatural5 = (Button)findViewById(R.id.btncompraaventnatural5);
        btncompraaventnatural5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural5 = new Intent(aventnatural5.this,webview.class);
                btncompraaventnatural5.putExtra("string", urlcombo);
                startActivity(btncompraaventnatural5);
            }
        });

    }
}
