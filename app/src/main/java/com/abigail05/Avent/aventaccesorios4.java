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

public class aventaccesorios4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios4;
    Button btnconsulta;
    TextView txtaventaccesorios4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=736ba4fb69c99eb6774091d37490b09f";
    ImageView aventaccesorios4;
    String urlaventaccesorios4 = "https://lh3.googleusercontent.com/kfLGW6yCvdguRF1HQ7yJh0w8XXM2P0Zp9iXW8a7eYHWmeYekiDnE9rbbLBsy_L1TP6YxD4O1Q0DXolwSYUUOr-kz7l0c5c64oDfL4VRRNcVo7tJBFa67R71a99EzSkT7btFmUXs33cqiHblpiZXjaDXsiVfuz8yFD5ZYSAl65QSNrCoGrxUy-pERuzL4kypS3BQiLfu_XsI-84dlMS14trj9GLffHKTsYQ6L5ON5sdMQKTxNpBB04UR1I4mtcLHn-UYdMbkZex-L2khiCjCqbyOjYBf9u8VNnWMoatNzwpJI3vXGOliLxgWw5GLM_znIHM09ggPPcPDpPUDk4iFQgXN1EhYaeQZGEGwzP8jhDLWZYamIsFSN89rUBfr8dOQZG61gq2AjBoeGnCaSerBx3940grJHfgoZHUFEqVknO3a7Z34BVOm_NrJ7sexRr5wzP0TXAW9oGfFDfWJDvOX6yeodxaYEpQvEW-P8xSedRJPEKNiycPQ0rMw6YNiXio56vWgVNZZ78KEsVbsg0vr9DsyywCKcOK5EquqaSCyQWOKmKkk9ZP84r3cY8ZaAeMQVUen_eO5lRFj5VzlxRpL5ChRZBeiPYcTAohIggJXlWAvcHJzj9A=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios4);

        aventaccesorios4 = (ImageView)findViewById(R.id.aventaccesorios4);
        Picasso.with(this).load(urlaventaccesorios4).into(aventaccesorios4);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventaccesorios4 = (TextView)findViewById(R.id.txtaventaccesorios4);
        final String stconsulta = txtaventaccesorios4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventaccesorios4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventaccesorios4 = (Button)findViewById(R.id.btncompraaventaccesorios4);
        btncompraaventaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios4 = new Intent(aventaccesorios4.this,webview.class);
                btncompraaventaccesorios4.putExtra("string", urlcombo);
                startActivity(btncompraaventaccesorios4);
            }
        });

    }
}
