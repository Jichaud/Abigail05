package com.abigail05.BabyInnovation;

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

public class babyinseguridad2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinseguridad2;
    Button btnconsulta;
    TextView txtbabyinseguridad2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf4e2e6109567e5904b81813c595fe82";
    ImageView babyinseguridad2;
    String urlbabyinseguridad2 = "https://lh3.googleusercontent.com/tv9oREAGGe2AwyJSvzG1BEEioBMMDlZfcsj6HVOfVFMCUSF7MN1kVKcvlHOj2J2wPvND8yPExGl4agjp7cPpAUEm_cifSn_c6UzaRAVb8rydO9Vg4QCTFbRoiHNf7Y_FYG1vfAjJS2zti_Ts2IkozfpnPWrZ1Hj_Qtz7kRnBlio3kfEU0Rw3z1-tBhd9R34ir-SqVUpEhqzD9ZPpCSCV_H9OlQu0n8oWO8ILrIBKRS2wxH9glKbvDDi4Ok-SYR0K33x1F4m32MH5K-hrXkazPyQDhr46wt0QZ7DlrbjMkUTmTAeColqtRiin8arRg-SDC45_1IGR2hiTRmdTFLhXQpxbnGgoUKuEFdP02_KxFvSG1MbG4l9u2ZaUeg4-FCI1lOsASbB9wGfGztKE3H5R4XSUeJl9X9K_oHpqxODpYT7r4Ap1Yt65L1K_SDDMwDkFE5wqPl7h1gxGW0VC6ILyvgA3JBnU1NQWHwFNnTLN3i-6Ooy86JwcB3hudK87y10JtCw_SQ8IvjtdabgYNbbB3mKG_4wfjJUbAWO3CDdTlWciAflMyhMh5l2ondBgg4vrQ_GdM3nGBseDtwHq4rgAgvNvgCMUUAIIwrB9JhWmaJFsja6XDQ=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinseguridad2);

        babyinseguridad2 = (ImageView)findViewById(R.id.babyinseguridad2);
        Picasso.with(this).load(urlbabyinseguridad2).into(babyinseguridad2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinseguridad2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinseguridad2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinseguridad2 = (TextView)findViewById(R.id.txtbabyinseguridad2);
        final String stconsulta = txtbabyinseguridad2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinseguridad2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinseguridad2 = (Button)findViewById(R.id.btncomprababyinseguridad2);
        btncomprababyinseguridad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinseguridad2 = new Intent(babyinseguridad2.this,webview.class);
                btncomprababyinseguridad2.putExtra("string", urlcombo);
                startActivity(btncomprababyinseguridad2);
            }
        });

    }
}
