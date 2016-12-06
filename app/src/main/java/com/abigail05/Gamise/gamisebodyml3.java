package com.abigail05.Gamise;

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

public class gamisebodyml3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodyml3;
    Button btnconsulta;
    TextView txtgamisebodyml3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=955c8bd0e3d2bd0084ef7f13af328558";
    ImageView gamisebodyml3;
    String urlgamisebodyml3 = "https://lh3.googleusercontent.com/0JgBbSfb4NtfCAO06bi0nznSLB-BSgg52h1NNOb18TphMUFlZnCmextqahqngdEQG_E1IpyyNIGZi8c7Yf0SqTVWclO-qYD368LIoiIFsQSTn3bU_BQXeykDUjf2okILfaHRrMs_itRLkzSR4UcahGZmng5sjfShmkEyR3NoBXFQoVJyCM4CgcqrIVkEGw9pZltnOtknhpqfrmJ4VlyqV6KXnERBcxbGI0j1alO1L8dKNrOMZYjHlBY8OmwjuIBRWmQ9NMEra1z5s16GRpp7gzKzp9a28LSGT5omowv8iuUhksy_fDBfOVvAC2juqzzIR5gxGvDf_xf9oEBQ_zMdD5YlNaY7uL9ggpgdZFr8vIEM4AYGC06L5Ta4NoL_OXyMFbv7voyNSCk1AWz25IMOJGKSupF1UrpSs40IscR2FR9VGu4gjQKWVFZVpwZMC69koltzypRPXQKxL8jeb3XVXVxzniPTk45N3TdXAkzzBk2DaD2YaLLuLU31gg3q0whu2MMKoDcpmbWJzYTpM-ovFML2iY2oCUWNSGTLVHSYepsnihwgEcPvS4_4EHL5dsRlGS2gXiX3ooxdnGAwh3Vct-j2Sv_PDRNn3mCVye3DCvmHTHaQrQ_wz0fTlZckJ3JRi7BBheiMs7WBDdUpZxypulC-lEWN8pMw3TtiPxtymY4=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodyml3);

        gamisebodyml3 = (ImageView)findViewById(R.id.gamisebodyml3);
        Picasso.with(this).load(urlgamisebodyml3).into(gamisebodyml3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodyml3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodyml3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodyml3 = (TextView)findViewById(R.id.txtgamisebodyml3);
        final String stconsulta = txtgamisebodyml3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodyml3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodyml3 = (Button)findViewById(R.id.btncompragamisebodyml3);
        btncompragamisebodyml3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodyml3 = new Intent(gamisebodyml3.this,webview.class);
                btncompragamisebodyml3.putExtra("string", urlcombo);
                startActivity(btncompragamisebodyml3);
            }
        });

    }
}
