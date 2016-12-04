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

public class nubyaccesorios5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios5;
    Button btnconsulta;
    TextView txtnubyaccesorios5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=117761131e7d06d8f5920b7bb1ff8e60";
    ImageView nubyaccesorios5;
    String urlnubyaccesorios5 = "https://lh3.googleusercontent.com/Vi6glieTEMFS8APwtFSlxgEBUhHcEcFwyCYzKYCBYC1ZAelQfLRhhzKY-pIibB9ossezACl0s73xoYg4tTZTT9_utLKNxrTPsii80aVj960J6TG9T619nSw_F15FZzfdSwJWnftP-VYAk6KsXLfH_u8kpRPCN26Ea0uZtycnnkz08laFmzJtftKUF48yTzTW2KjRtS5152Jvtx8J61ax7OEWjg66ln7i7O5glJucPjwXc_-EWrntZIqEpjUPMmUB7nfp1hiFMwuVM-1zyMXvgWO9qZcnuRVGh5nKpUzHx4RMYnGAjrVLjpjxARqaG2qyU7A1Tx0I1vE97laetfODfROElfbSYMzNEYGeBkq9b7k8YO7di5yowTj_Ok73wzxQ-1vj0zuGb5ZEy__L-VDAdEcSfiD_-Xwwj4K71EI4GgEQXV7Sv9kubR9mgWZkaDToNeEwoUlG9TaTCsnC7aEUQ9iWeOJ848czhDPJ72yj4HNagktxFJ16JLmSuOv9w0D10E9cd6UCAUWaep4OjbOXGiG13gZxbIcOLi51X0v_Yo6ecUdEG0tDGBlzcBH0ByKjeubzFylNI4yWm3ANtzLHfHLHthlqE9atgJmY2cHbKuDyZcyBLw=w500-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios5);

        nubyaccesorios5 = (ImageView)findViewById(R.id.nubyaccesorios5);
        Picasso.with(this).load(urlnubyaccesorios5).into(nubyaccesorios5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios5 = (TextView)findViewById(R.id.txtnubyaccesorios5);
        final String stconsulta = txtnubyaccesorios5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios5 = (Button)findViewById(R.id.btncompranubyaccesorios5);
        btncompranubyaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios5 = new Intent(nubyaccesorios5.this,webview.class);
                btncompranubyaccesorios5.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios5);
            }
        });

    }
}
