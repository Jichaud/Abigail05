package com.abigail05.Chicco;

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

public class chiccojuguetes16 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes16;
    Button btnconsulta;
    TextView txtchiccojuguetes16;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=95eaf2695872226cfa88a609f7ce481c#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes16;
    String urlchiccojuguetes16 = "https://lh3.googleusercontent.com/VcZA2naN4FKuN8S-gWnTmsgwKdSGbWRpkl0Lym8Udj4A7MCR6b--TVJkm7hirYd71OGmUybu-5_ZerK2F_Fc1HcNNDPmQ86s0zstpbTH1KenhAeWPhHMGs9B4tHUAlNWKBKEuoJhCMF3DfHDphyImWl4kdI8Q_gYEQQ_5vOgZ0V0PiGfTltdJVmpxPUFEiiYfC1Av2jeQ2mKcP4yCoECsJJpHV974Bs1-aAEy_9xzSjqw4bXP5xTyYKGTAIhQ_HGISx1XF5cD1uB1iC1iYHgQWwz-WDGehjLlexYhZtqMydQnSWSTZGKWP__Hij_45Ft-Z-VptU82lEdpVPmZN5Jd_1htRwK-lzpvYxqKGSAdXaZO-nKgkN29qFzAcPJAe8IYNyzk5amwH5qZKIKtaEi9mrJlb2EbAjMeDaOYHknEug9cCGECDdB3SQDW_LbatPE0b7guh6pxncEUekVKf4jXFj4sv-y_Wcg9hitvRdmPmh3Xlxz7ekahKI1m9HriW_Xgd3dsvdki28PnXKzpjAInRP9XZlPdyhHShaJCAxuANshuko5PC9qcyyYucg1wDrUv528KyA8i9I3Ss2lk59lLpqpV2D41msxAU9Q828BPOSsAewEHiaO2VdsPcnmXdRZGd7w3ZOu9HUfT52Nbmpxv25Mrgul-tre-DwtTGJVUD8=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes16);

        chiccojuguetes16 = (ImageView)findViewById(R.id.chiccojuguetes16);
        Picasso.with(this).load(urlchiccojuguetes16).into(chiccojuguetes16);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes16.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes16.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes16 = (TextView)findViewById(R.id.txtchiccojuguetes16);
        final String stconsulta = txtchiccojuguetes16.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes16.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes16 = (Button)findViewById(R.id.btncomprachiccojuguetes16);
        btncomprachiccojuguetes16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes16 = new Intent(chiccojuguetes16.this,webview.class);
                btncomprachiccojuguetes16.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes16);
            }
        });

    }
}
