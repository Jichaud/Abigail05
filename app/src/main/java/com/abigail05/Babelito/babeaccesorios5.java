package com.abigail05.Babelito;

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

public class babeaccesorios5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios5;
    Button btnconsulta;
    TextView txtbabeaccesorios5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d7626a3d6971a76a56635b059a6bc947";
    ImageView babeaccesorios5;
    String urlbabeaccesorios5 = "https://lh3.googleusercontent.com/VVvfm9i8IKiTKACVVYcRcGsQgKwRweeAj5_pSh3qLh5Uvo02EVjh57-dW3Hk3QL04syls5KYJPNB0i_PD5N1Oj6c4AfKsRKvMK2rwmDqDfcndroxwCQUj6a_qRRP4f8B1EBzprEWgs-cz4hBwGQrQTR-ZD08dYFQnX-bfLAj-unEI5aCeLXs5kVyv8gCtfRnoc-lNU4_w2XzAgLbwkgcIwMh7MsauNBx-mmd98cirBHR__bU4XLTympIaNu3z7TXHkc4pPBFT4XJqW83F4cqUEQEvLWJuD_T95Pc-3JUZpoRDBuUkLqk6wOLJZ_gT5SVOM8GmbO1qX3ufBvBIjygg64DTPyTtIPHVNx3BWrto9W6OY24kRXWtGqRv8So8lAukyN4CAgDVmxPXB80VEt8N3JA_8wVyuMYc1mvamzCWkN4QkJdwhIqyJbluYobE7cVu3N28yudJT-7I-26uQRTLnKPJk7PKg6j7T21tAPPBbm9yNnnIkbkjR8whBUCilSOouHQAxj2fKglxgGrcSElVTwkTKRdTHZvKkWjiR8s6rCV0t7KIxRRzwb7O2Yt3efbxR90GcKUNY0X9xxVAt1JULQjIjiUYpHy1BHBKV8s29p4KXWnpA=s376-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios5);

        babeaccesorios5 = (ImageView)findViewById(R.id.babeaccesorios5);
        Picasso.with(this).load(urlbabeaccesorios5).into(babeaccesorios5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios5 = (TextView)findViewById(R.id.txtbabeaccesorios5);
        final String stconsulta = txtbabeaccesorios5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios5 = (Button)findViewById(R.id.btncomprababeaccesorios5);
        btncomprababeaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios5 = new Intent(babeaccesorios5.this,webview.class);
                btncomprababeaccesorios5.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios5);
            }
        });

    }
}
