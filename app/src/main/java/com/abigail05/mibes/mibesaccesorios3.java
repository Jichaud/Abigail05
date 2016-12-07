package com.abigail05.mibes;

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

public class mibesaccesorios3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesaccesorios3;
    Button btnconsulta;
    TextView txtmibesaccesorios3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=330fc910dbf6ad22eb427ed901a897ed";
    ImageView mibesaccesorios3;
    String urlmibesaccesorios3 = "https://lh3.googleusercontent.com/tTp2uDLQkhMigTu39KQWGnAB8CL9QqwX4lDdrfO2UwXAgHBO3d0umFd8pL6F0Pba7MCK34gpGCoYWdwuG93WEzV8HbesyyR2OLYiQYAPuCupWE9KCIw4zBrzRQlbPQ2jsjCuukLtQs2mv543eAAYsviEWgbPTdBsIOViPu4ByGT4pmDCXW8vxWCPUHMxMfLOgsbqkXfxeLid0Fds760mE7LsdiMauR79inKi_dvCL3p1ErE-EV7Ekpf4GJL9qCapFkfd3rJaqZkdI6JiRBtaQvVsWeC9KocIm4ULRebMqsFPiak0p1ZBmvqsBdnd-tPYCIthlOfAxu_ObS0PdmOBGijITO2QCJ7IvpJXhgHTvpG7C8y-h9QQrl1VFpIl_fAQmzpF4kIiI5MzcvBfRxl_naqkOtI9TGGqWLCzFTdpyItmZlaF0oL1iHAi-Aty_gv381ykJuTFCtMURE-TUDMuiHLrDzmI2vX56u3mHYp8BGLnmSQN-BcdTOAg6ECt4cCWb9snfdSgVPXPrx44q30xWo4W8n2Z71HBSY7VFljQ-Lq-U4NgOWrK3XZNvRLpGUzsQVESRd9TOD3eXhF49XUcAAVCsFKcBD8eI2D0CKtagTdbMExG3fimN1uMeiz1Of48o2hfdQRKZ-s422gZdfop5hP6BfPBPLM-vY1kg4p3wH8=w726-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesaccesorios3);

        mibesaccesorios3 = (ImageView)findViewById(R.id.mibesaccesorios3);
        Picasso.with(this).load(urlmibesaccesorios3).into(mibesaccesorios3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesaccesorios3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesaccesorios3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesaccesorios3 = (TextView)findViewById(R.id.txtmibesaccesorios3);
        final String stconsulta = txtmibesaccesorios3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesaccesorios3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesaccesorios3 = (Button)findViewById(R.id.btncompramibesaccesorios3);
        btncompramibesaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesaccesorios3 = new Intent(mibesaccesorios3.this,webview.class);
                btncompramibesaccesorios3.putExtra("string", urlcombo);
                startActivity(btncompramibesaccesorios3);
            }
        });

    }
}
