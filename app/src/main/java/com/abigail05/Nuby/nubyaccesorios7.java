package com.abigail05.Nuby;

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

public class nubyaccesorios7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios7;
    Button btnconsulta;
    TextView txtnubyaccesorios7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7ce09ab96694f7e6d8fb76ca7418846c";
    ImageView nubyaccesorios7;
    String urlnubyaccesorios7 = "https://lh3.googleusercontent.com/k3-Ur1BDUP6YeP1ZovXTwh_8UwPp_140vk_ACLtdOVzw3BpgTY4xbDazo5ZnDbQmm_INvokGvbIVXV8rTgJnVY50w9oFvi0p21smN9_qsBMWwipmMC2djYWpxZ-UzaqZDC5LhnKoMG4qP1YG4SeaCD8Lr4FbyFNUpi6YpW2XzlpgsARrayvijITPWK9cZ7HiYukjMBLZ1lIZ_0A5cTyvsml9_BROboFP9FRkMUjSBt41V8s96u-gh2-GejsC52WkFPxv-x_4-4lOTBFXDymlaQHTCQVP9xISqoNZSvyqnhhYoVKR8rdwmWid-LwMd1gmSd2bGNFfiotjjG6zCltc9h_zQjbuE0XKCvRtYR3nKirdR1W3byHnKQgRzBvNSn_CU7W-peym6XTAjDnNpR7814SJlcOsYksqHdnxTsrTzMDidn4sNXPqOF6-LpVrdCL-bWJ5_gegCe_zmALt8obx8IbYY_ZPYsu_X9JScFoMmBNshT_I7E4SvMZSX7_YofEdjRfj_9iM1XwPzp2itr6FhSPeeS6Zx4sxam0M33cQ6qhGLPIEcdaJPn_ufm1dPuR39e6pi7rJwfGZJWOtY5H8Zz6pGRizzBkx8Ov-j6vD3OEGoaRVCg=w500-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios7);

        nubyaccesorios7 = (ImageView)findViewById(R.id.nubyaccesorios7);
        Picasso.with(this).load(urlnubyaccesorios7).into(nubyaccesorios7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios7 = (TextView)findViewById(R.id.txtnubyaccesorios7);
        final String stconsulta = txtnubyaccesorios7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios7 = (Button)findViewById(R.id.btncompranubyaccesorios7);
        btncompranubyaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios7 = new Intent(nubyaccesorios7.this,webview.class);
                btncompranubyaccesorios7.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios7);
            }
        });

    }
}
