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

public class babyinseguridad3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinseguridad3;
    Button btnconsulta;
    TextView txtbabyinseguridad3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7e63a92406afbb6fb668df60adf9967c";
    ImageView babyinseguridad3;
    String urlbabyinseguridad3 = "https://lh3.googleusercontent.com/UPo9pFMIJ0sErZ9PMT0mX9BgK6SgqLeN-sl4YY8EkX11M2ZZ7boKut0JurOm4tyQI32SZxuJLCw0X0f4GimERLUEkoRY3YG8sRw9GkFUXknkrOp7dD-K8v9NHZhk7tdjmEgWbM_82gmU026nXXHRJcKZMsgvakqsWQAMXi8ODEoySZWpfjk4i3uJEY1vWl_mPnAQ_OFZ2QmD8Ab6FPjk0ynoPnBslTiN495tU3a5zKyEsVfXeyqUFbaCzE_zqFRRA8Y0MoHQ99YGR7eqOIwXWwbIdSJKNpIm-uL-EGHtTofjydLeV98y8Otm-5roIxOXkt0BJA_LlFpXblKps4cSA_Ax4tMamKeD-fgqpXqUVNJprLyWEwYG4MyrnuAbGLodQbVCBOl9d4V48dIpBn6QgAwWGxpQVo7vmLO96hjskKwlhshWQ1WFHSsLssU5fgc0BSoL9iZzGc1JZ3735YZWKolpbWCjBVjaw0iXX4-EOBCcE2Exny7jxFf3bteeOVQT8kCZpxiNBOwsFoei1pHbGKd7CYtUwNODx7GpiELa7oTWFSebv6vvQMFAdQFG37QjvEd34PDNRl9X1b-arMhLqkKDw6K4xAIqgcUFGin0wuHoeEHgMA=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinseguridad3);

        babyinseguridad3 = (ImageView)findViewById(R.id.babyinseguridad3);
        Picasso.with(this).load(urlbabyinseguridad3).into(babyinseguridad3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinseguridad3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinseguridad3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinseguridad3 = (TextView)findViewById(R.id.txtbabyinseguridad3);
        final String stconsulta = txtbabyinseguridad3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinseguridad3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinseguridad3 = (Button)findViewById(R.id.btncomprababyinseguridad3);
        btncomprababyinseguridad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinseguridad3 = new Intent(babyinseguridad3.this,webview.class);
                btncomprababyinseguridad3.putExtra("string", urlcombo);
                startActivity(btncomprababyinseguridad3);
            }
        });

    }
}
