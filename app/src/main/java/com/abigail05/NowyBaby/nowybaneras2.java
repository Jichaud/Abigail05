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

public class nowybaneras2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowybaneras2;
    Button btnconsulta;
    TextView txtnowybaneras2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=03e87afecf22127a2c2dba59b84a23e7";
    ImageView nowybaneras2;
    String urlnowybaneras2 = "https://lh3.googleusercontent.com/pJdVsjE6cmzYGJsqrMSAZSyMvhP3w3JFNHU1ncImxfP9nZM_PKDqjrgl8-U9K_5pdJ9U3AvYsGyqXIpsjdGx3jG3eJXi0B1WuKV7VA2aIU4sN9rWjo9KFVFwB1xLdVuR9ma07KFehvl45C6PptNMQzze5Ku1QF9wKwAIVvoOOZPTNteZpKKs3omiDc984fjFEQD7TTzN7GazNOj2PBl81qGu-4_96rxdbTW6lrxE3B5g_tV5-2YP7zAR2IT_HGTDh1B-4CtAm9OIHSpsErsqxevAa_6twQbyU3tq22RgZiAbakeEgHo7t57QoRj7kwySTJgxrBVKdaqXhKUgoJhpCDBAC8salgioaVedkGAGbUf9D05Q44_yqmeWN50N2lNBxI2JWT5YAiiatu8IKOO1pjK70BkVfX18UlgLyX01ZRysn3Y-zJHqlecA-hLzlrjtFwxaAnew9hBInFSzwd5DUz-NJ1GCr9T_VV--BnERXdETwuplTKFwq5Xc402Bs-nQsORDsVChD7axV-UUT560v_EuOwoZEAUAyQVo5HvQsInKAxIFl8jST2Cm9ovL8aUh0rPsmBgCVdRuh-fgT3RjjwVdAtL4SETG6vcqpvzeriixolKSzQ=w448-h451-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowybaneras2);

        nowybaneras2 = (ImageView)findViewById(R.id.nowybaneras2);
        Picasso.with(this).load(urlnowybaneras2).into(nowybaneras2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowybaneras2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowybaneras2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowybaneras2 = (TextView)findViewById(R.id.txtnowybaneras2);
        final String stconsulta = txtnowybaneras2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowybaneras2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowybaneras2 = (Button)findViewById(R.id.btncompranowybaneras2);
        btncompranowybaneras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowybaneras2 = new Intent(nowybaneras2.this,webview.class);
                btncompranowybaneras2.putExtra("string", urlcombo);
                startActivity(btncompranowybaneras2);
            }
        });

    }
}
