package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class aventclassic4 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraaventclassic4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b01e81a362fad8f5a0b424b8b8078aba";
    ImageView aventclassic4;
    String urlaventclassic4 = "https://lh3.googleusercontent.com/Y4COAUQx7NN0GmG8OiPWjDjuzBRP3fCfW7EtMjMU-2zNuPvDSMLloUKfJRiHt9v614s7RqEmMNMmZ4tU-xxMdbnUoYeaMIZlUfnu29G3gRwpGiY3Ru2RfsNDRj4vQXs4F6aDkZXZ-mwnOAiGECOGB7zlH10Nl190fDjo656cfkO5C_Xi846Pk3t8C-qkbyvm_hKq6v2Qhfe48ecZEqqCNrSXupWhwDO4F7LrvBY7Md37nHTTu8XobVK4HCpFNeHmeKYk7iDnI_vAO7Z0vH2zEr979TJQ4ZRMSX2NOHwfNOdY-XN18snUB8MT6tCsTa13pLaQjNISm1x7Sc5KfLFe8w9GOKe7j0CMjKHhRm0N8vjEizLQI4exfJM9NDbikRtS_XA0NpLEKOJuw3wQNXC6Uua7TwAcTB2ooivVCUGaQhx3BFFVvf_nxI_XDT2ga7gmw8-lnnGhqUcVLcQ_tbEYmbKri2rMCRYB6SLQ_FqnUvQFridhHfJ5ZWbgVJIFkfne4fpBioqGRQN52fbbbz3hYwASO8kvsiBOM4iVzsS1QRM03Ap-AXqsKGtBcjEPDkNTGXjIESDGxKqWUHSH6QHh2bBi5b0AjAui60IzwxDBxv32mSXivw=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic4);

        aventclassic4 = (ImageView)findViewById(R.id.aventclassic4);
        Picasso.with(this).load(urlaventclassic4).into(aventclassic4);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic4.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic4 = (Button)findViewById(R.id.btncompraaventclassic4);
        btncompraaventclassic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic4 = new Intent(aventclassic4.this,webview.class);
                btncompraaventclassic4.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic4);
            }
        });

    }
}