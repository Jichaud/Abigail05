package com.abigail05.Nuby;

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

public class nubyvasos4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyvasos4;
    Button btnconsulta;
    TextView txtnubyvasos4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c8f42fda3ec0ad040ae248197d95dd26";
    ImageView nubyvasos4;
    String urlnubyvasos4 = "https://lh3.googleusercontent.com/MXpyD7SHdoxVFG6cpNQRIAMU3c81Dv5CsxqpSCWlOkVpwZ74f5mDDb8IBzOrRiDI3x3daevwDJYCgRx3Sx4vAvS0e9YMCI3K6oDMadNkJHkuGQpSexWr2gDJxtSJL3FZlV8DybzsyDWzNknDE4l0id8XSPpg8sayPflaoltKWzSy7ITZpMqJJOb0-M93DDFSxpqcAQkXKhtrW1hiE5nlgOdbNWkEnYShxuDIzEKFbWuLtEshqcYIuGSiHXWRQ2URmvBIDzfyH36gbtUNClhgfqaRnKwulbN_WviSjvtvb1ca5L01Ht0jLoIYB6CzGxhxTeC1SWxvafBdDL8_Nuxeh6Cx71zcElIJ_8NvagsLCtbEm7hIqkhkmAsyzfCUVIvXUvPnZCTJsmh2RX8ITkUknDwfXDlF-pOAvhH0mRqHIfFPNL-6_htq1_SBnYXlk0jL4FrSLex_hMwxFbJy2CStDw1yXsr7gvWZglO2hR3H4C7MNZf8pbsP53uH7sP_fvFIg2iNcj0xs4sKTY5eyvTq2phmqBaXE5E_410367wKbp2qTM-QY1tHd5eSESfJ8qvI8B6Wn76Vnv-MMK8sJKy2gIcgHl2PJNV2Zcq4EhoQ9RkC5tMYEw=w923-h406-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyvasos4);

        nubyvasos4 = (ImageView)findViewById(R.id.nubyvasos4);
        Picasso.with(this).load(urlnubyvasos4).into(nubyvasos4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyvasos4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyvasos4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyvasos4 = (TextView)findViewById(R.id.txtnubyvasos4);
        final String stconsulta = txtnubyvasos4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyvasos4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyvasos4 = (Button)findViewById(R.id.btncompranubyvasos4);
        btncompranubyvasos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos4 = new Intent(nubyvasos4.this,webview.class);
                btncompranubyvasos4.putExtra("string", urlcombo);
                startActivity(btncompranubyvasos4);
            }
        });

    }
}
