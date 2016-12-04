package com.abigail05.NowyBaby;

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

public class nowycoches1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowycoches1;
    Button btnconsulta;
    TextView txtnowycoches1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=bd11f498a3cf1f5000c82972764095a1";
    ImageView nowycoches1;
    String urlnowycoches1 = "https://lh3.googleusercontent.com/7MFw1q2awt5ROGslr2NO1UFJsiYal2_05WuBGE8K3Kgyp6mxVzKeOOuL6Q_2-s7tDGDnYHm6o6mhmdGfRORGgqcI4OEzbgiA-fbLu4Jfymbzs_ArYdz2lXLLgImmnkrxQxHvxHNPPcKKwiMO5_pFFKrd2yx7Fh6ZFY3MCYuS5mQsKf_bqjI6OHkake0SHRq46m6nRzoJWdt0G_sDSY8zeVVQJdR89D09AFr0c3lGHu9Ng1kdgBz_xIle5AI6NhRHTtQkJZgSTliCJeGqqN9DD2gjW9dPDiJUqs_KR20mE1yqHZ5hoONb3Wy2CR7Q85gFYaw8d6uoRTtNUds-KRVAqNKI2xn8hEg0OkpLCUoZhOBVg8p51GF6EO977nUM3JdxHsbxBO-NDRCTX4wOGnLzktGMwjqEF7oPd0dV2lTIQxiRbUOBT_3aUhUPa14nSlfWzjS7T_W-TCXUfm6IVrwmaiOXOlNNINGm2h5uNxT1ilv6FK-tiZXiyHjVN99L3ykt5V_py4mJ21cOJmTG0FYCCcmiQLuheEVi5_FpvxYoSDnYTx3d0n1DLD03dMqyFDaW-FqN-d1q691J8s1warG_VIf7I87LaxE24oGyfVXamNGrLuy-1A=w600-h657-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowycoches1);

        nowycoches1 = (ImageView)findViewById(R.id.nowycoches1);
        Picasso.with(this).load(urlnowycoches1).into(nowycoches1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowycoches1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowycoches1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowycoches1 = (TextView)findViewById(R.id.txtnowycoches1);
        final String stconsulta = txtnowycoches1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowycoches1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowycoches1 = (Button)findViewById(R.id.btncompranowycoches1);
        btncompranowycoches1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowycoches1 = new Intent(nowycoches1.this,webview.class);
                btncompranowycoches1.putExtra("string", urlcombo);
                startActivity(btncompranowycoches1);
            }
        });

    }
}
