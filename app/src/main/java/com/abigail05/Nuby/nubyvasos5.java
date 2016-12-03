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

public class nubyvasos5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyvasos5;
    Button btnconsulta;
    TextView txtnubyvasos5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e90610c52716eb7949f20dedc090d301";
    ImageView nubyvasos5;
    String urlnubyvasos5 = "https://lh3.googleusercontent.com/-xeP_bq4Vf9kS9WJWWTh6N9WH4yQ9hRm5MRV4EryPIaYgD869x4TAzxeW3s0f_1vjqJSzhy6Gm1hOs6RixbZWJTHKMJOigKHsF0SZnU3z635WmdPb4VUSxRRwQmCkqa8NU_k-7IvVRv0vSh856Kh7lT5qWmbFY_q7gB-8qxoFXZOLHck5LmMtLX1v3sQHBz4sqgXQN5Oz9L9w7HALFi6XtkOm9qE1oLKHyaxc03BP7AibzE9i5pI588_chIoOLhDUjtQUXKCUFA5aTUwX2aYxoePUZNZgfZRsAQzEk1Gog1n7_dSv5uBrIinKzfxyXVBxvxukLF0GpDlQEQBdZ1vv0fNp8o_FfKzKZ1hO4icqF-pl9ruZk5FoPn9RNkAk6wsF9PLLIu1Q3UrCkYS97zESvraE-1Y54WrB8qoRT10u6MRMnWyIpp7in1yIJ0iuFteEUKc7mQxXjVgdgFdJyLwcAM0ar0p_qKkF8NwnbtiuX8hIQ2BMJbx0xtGVYkS6eEv6SmOKiUfibfwm7YcuGUlnLT0bl_oU2iAwYUcjJ7sBiI40AiGsji1QM742_i9B-BLH37FTKtROtBFL-tXxZeTPQuRmP0H_nrsMIHek-sCRodVd9aJvQ=s480-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyvasos5);

        nubyvasos5 = (ImageView)findViewById(R.id.nubyvasos5);
        Picasso.with(this).load(urlnubyvasos5).into(nubyvasos5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyvasos5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyvasos5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyvasos5 = (TextView)findViewById(R.id.txtnubyvasos5);
        final String stconsulta = txtnubyvasos5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyvasos5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyvasos5 = (Button)findViewById(R.id.btncompranubyvasos5);
        btncompranubyvasos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos5 = new Intent(nubyvasos5.this,webview.class);
                btncompranubyvasos5.putExtra("string", urlcombo);
                startActivity(btncompranubyvasos5);
            }
        });

    }
}
