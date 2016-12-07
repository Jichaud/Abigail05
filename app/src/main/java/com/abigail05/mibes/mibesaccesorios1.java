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

public class mibesaccesorios1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibesaccesorios1;
    Button btnconsulta;
    TextView txtmibesaccesorios1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d193f559b858344536fae6bcb86161cd";
    ImageView mibesaccesorios1;
    String urlmibesaccesorios1 = "https://lh3.googleusercontent.com/ikp4rjk4vJWC9vv5cJ07u6vnGjgy2fr9_FKSzE-C7Egc2rMX4u3k0HiHTJMsOnwpbmU0FCD0RSr4QMUFFLWS6fOkw3Y5dgdmrYwK3CqW5HKabin82ZzSTPvCr5cz8apNCl4qr4Gr2DsSuscOYnTpMRqepLjjdKQuxn4amA4j0aeF3Nw1EwuCFQx1L1hHPuxtlWnWkdXQBbj6U_vIkotjmMChRFFtFu-TVGpYNar4QDvDsFFoLkrlju28W4VTxNV5_SmjvOYQutocYW_fHAaC-ntsQR259JUFcYDl5vq0b3D593Eyp-JPj_tGA1WxbNU5hDswcxiOKQWhX2UVUHz-Z1DFrsJ0_vELJ8MZwrBkMAwfCEaHxEYgt1euMC_v9nEgpmpdMeHkUCYqkL_DKDLPJ4r0opERGsPJEzXDizKlpFKRGY9MyeOsGPLUkv-iNjhHYuY11RdmdcXLm1aXwc0_STwiHKSc8KqSdXeUdJSWfMgAGZrpU7h_GhoYdRo-JFIvm-lMrNVFbA_44l1bVPEE8zPQO-u2-au9BOHTVIifI4ytU1sP3uaLgtoludUGCZyVXbNaTuQqQ3u0Diwx1RQi0PkrtGBj7-JjwlQrI_eoaP_FBAU3N9tuxiUPoPBS2IaxTzRGRtEnCzhvJ8NHQgdf3t0-_deSNdXMEkxr0FghmUs=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesaccesorios1);

        mibesaccesorios1 = (ImageView)findViewById(R.id.mibesaccesorios1);
        Picasso.with(this).load(urlmibesaccesorios1).into(mibesaccesorios1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesaccesorios1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesaccesorios1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibesaccesorios1 = (TextView)findViewById(R.id.txtmibesaccesorios1);
        final String stconsulta = txtmibesaccesorios1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibesaccesorios1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibesaccesorios1 = (Button)findViewById(R.id.btncompramibesaccesorios1);
        btncompramibesaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibesaccesorios1 = new Intent(mibesaccesorios1.this,webview.class);
                btncompramibesaccesorios1.putExtra("string", urlcombo);
                startActivity(btncompramibesaccesorios1);
            }
        });

    }
}
