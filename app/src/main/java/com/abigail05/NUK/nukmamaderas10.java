package com.abigail05.NUK;

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

public class nukmamaderas10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas10;
    Button btnconsulta;
    TextView txtnukmamaderas10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=528f3df2e8d066a35a4e3f5ae7acdc54";
    ImageView nukmamaderas10;
    String urlnukmamaderas10 = "https://lh3.googleusercontent.com/tPo7SYZWIdJeO6KnH7DOYsHLakvCO3gBajRb5TtqNv2ZX3YjIy34XxhR1BgfZ5nZhtQK58XFp05OImCiWDt-ZXkdyb0WQ919h3TnX_ew6kSZZZ9S4VuDmR4sGz0SYMmM6XkdYJEtFefDiwWB0CHQb8cxf4Ey7C6mo4ucM864meU5POgEBZJwNVeKfAcOrI-Xg6DqlWoDhrCSoloURjwkvhvsXSSUB6H3V91R_LqbReHflbaouTAnDqvTwjwRnZgjShIczdCuallY6eg4XSH72RFY7roVJ7MQ30SmxVcz5UqBRcMqbYKMXBiq6aw0mAHXW3Tg6HjrqdZ2hBy0ZfkizBzsf8tpC3SgMtfCWvFAWbhdUkt8t-LyuM6HwL0fM-8CNdzzR7EwRvzajRuu7CPTkwYiTjzRw0cBaUL6K2CjTLBAt5o9VUPFAACK1XF_U8IcFPnH2eGWtRToFSWbTygQ3sf02CubFQkyC7_DA9J5MqcHX2p6ZiFUziHXBCSXKU-9E0edtmRJeK8791umOUTpF8ANv7FsFCGoYihxuAwHJ-Ypb3iX8FtKOfprIqk4HDwmzaOXsWb-OAkkl78zO_O4l3_0V_CMv12iPGWcMoIDo2i6INALwg=w203-h365-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas10);

        nukmamaderas10 = (ImageView)findViewById(R.id.nukmamaderas10);
        Picasso.with(this).load(urlnukmamaderas10).into(nukmamaderas10);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas10 = (TextView)findViewById(R.id.txtnukmamaderas10);
        final String stconsulta = txtnukmamaderas10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas10 = (Button)findViewById(R.id.btncompranukmamaderas10);
        btncompranukmamaderas10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas10 = new Intent(nukmamaderas10.this,webview.class);
                btncompranukmamaderas10.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas10);
            }
        });

    }
}
