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

public class aventchupete2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventchupete2;
    Button btnconsulta;
    TextView txtaventchupete2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=405f187e2fd7622b6190d480b76395df";
    ImageView aventchupete2;
    String urlaventchupete2 = "https://lh3.googleusercontent.com/Wb7X0c16lsjSrAXvGfWfcGwr2bm61lX-x0vPa9R5hwCYPF1MEAULxTuHCviJ8aKw1uCPss2-t3lrXcT866tuPBWWqjW6AH0TrnB4xuxHcIT7gU5WQUnCQ89ao37Pf88Oc3IFUJzGXqPUCMI5kEKjDOLdEGoZfQlhiZtDD2pZCT3wZp3z_p8azNLPjlQQ9Z-TmN4HKDtbryu2jXUL-_SVquEb2Xk_I-r5CBju3Ar7ZDfsUf8ebBiAtsbUqIlYRPhUPGEuTnsx6pJyX66V-5siOHscmrD5srI_tiK5oggsDrOBBCLVK7SVpktSeFnEFase1Mbk57hpJFGlhHWoY_0tSmtoW0XuvvkOGp1W9pM5IMTr1rrby0awjl5vTR-49ZlGSnIrGbCysVAMrCtFckIfD0Yq4hx4t62EqQ2zzjgRnUgRYnoF9030jEExzH0W74IArubV1zozFSQNqf-71Cvx3FD-5r9zlX6saYnzXFr1zct2_yU5k8OuUGekH9PXFsqdBHecCln0-IJWLeuc2GByXIuMmhJsEzPraK2X91S_yZkvaQzPNKwH8SmCxK50eyIhbMhZGpNK7bDnG3tOPxKrWjbHvPWLuqqwAy9Q6CmTaM7M3SC5Tw=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupete2);

        aventchupete2 = (ImageView)findViewById(R.id.aventchupete2);
        Picasso.with(this).load(urlaventchupete2).into(aventchupete2);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupete2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupete2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtaventchupete2 = (TextView)findViewById(R.id.txtaventchupete2);
        final String stconsulta = txtaventchupete2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(aventchupete2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraaventchupete2 = (Button)findViewById(R.id.btncompraaventchupete2);
        btncompraaventchupete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventchupete2 = new Intent(aventchupete2.this,webview.class);
                btncompraaventchupete2.putExtra("string", urlcombo);
                startActivity(btncompraaventchupete2);
            }
        });

    }
}
