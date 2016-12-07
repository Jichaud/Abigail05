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

public class mibesaccesorios6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesaccesorios6;
    Button btnconsulta;
    TextView txtmibesaccesorios6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=95109edaa2b2f3958ea85923e379344a";
    ImageView mibesaccesorios6;
    String urlmibesaccesorios6 = "https://lh3.googleusercontent.com/JMEEZYkZP6qKWW0zU-auHONw5rHGCCPZRpM9r9QWHGJb7eWmIonteECdnn0D3u_ekmKziQbb9-_99Zzy7FiGplZiQAe_JuxiXMfuiJPTshHA441oz_O6BUb4cZkO_x5pbVmjXgf1QEbEwpJ0cMj0fhm1NnNCk3DS0yEJ2rmJxMY5K6WXXzBKObnitrybunxmpYFypF7aczAKEQ0-VSywAOIn6AWZNasHCY4DU-ZgnvYJIrxY7RRiIgvGOv7SgJuUl054cylfVuDZOoCK6P3a-gcMFnjjA2iInvXFy7wBuVQdCefZSDRbjXV_FLcs0qUaLDP4RjKi7V3uW1EGvfQwxkCAANvE7qplZw3dyiCQlux0N04ACu2Rn0RjSlKWf3yH6PgQCK-KCsJQOpWFsjBM3ITiEUQ1W1W9qvs8HPm9IRlGl-TjnA_tMQmRxcNRmX7CKH9F9C7Gd9u_Sg3hFwFGdVTXWo_NyTigmIbCFyG6z85lWfCGB7cKaefsE_0cWqJLu54Jk_EnniPpIOX9AfE2hIKb_LclsuFM_6uwPSSlLmnFNztpGi2SOqrzlBC0DAIG4J5YLsE20qz_pM2KR3ug5F0y3uARY0wiEBXK042HIuMdAo4nwUvfkUOjDvU5IhJdoA61nYueNAr6e0SoPJzcyVmM5Tv93pzSsNa4GuMCJ9A=w811-h619-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesaccesorios6);

        mibesaccesorios6 = (ImageView)findViewById(R.id.mibesaccesorios6);
        Picasso.with(this).load(urlmibesaccesorios6).into(mibesaccesorios6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesaccesorios6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesaccesorios6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesaccesorios6 = (TextView)findViewById(R.id.txtmibesaccesorios6);
        final String stconsulta = txtmibesaccesorios6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesaccesorios6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesaccesorios6 = (Button)findViewById(R.id.btncompramibesaccesorios6);
        btncompramibesaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesaccesorios6 = new Intent(mibesaccesorios6.this,webview.class);
                btncompramibesaccesorios6.putExtra("string", urlcombo);
                startActivity(btncompramibesaccesorios6);
            }
        });

    }
}
