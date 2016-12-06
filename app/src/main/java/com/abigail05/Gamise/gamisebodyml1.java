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

public class gamisebodyml1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodyml1;
    Button btnconsulta;
    TextView txtgamisebodyml1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=955c8bd0e3d2bd0084ef7f13af328558";
    ImageView gamisebodyml1;
    String urlgamisebodyml1 = "https://lh3.googleusercontent.com/_7hxh9DYKZURNMJjO9JgDlcjgjgXc-Ct25koxftQ6dULM4rRge1vQE9LGhyLKgfaFGWv19xsNCZDoL4-PIvkticPemkxfXu1PYjTYw7JAEp8eflQltf9alip_FVeQNYE3z9Jf3Tvkrp4Zei5-1ExZTauyCMjzsKp3jAmeDCFrQYHKsJUJvMnjcJeXHRvW7IYKY1g0XMw89H5eyQTwoiBRccez16jNWSiYQi32qaQXdB6lUmO9HgdrRR3Odg66SVgIlxIdd0p3pqeb_qI7jw9HWVJYfBiSmk5iyGNCXoE3LcY1yXgJSlFlnJw7QbGaqJgnzUEEQJoScMzvSKUdUDJn29Rse4pG-32hqYUtZB_oeqP-1hwPgf3zlhawjAnVGocX7UK-IUCWmYMXDSFgO5VllgMVpe0bQl82HcklFycOeBQU6E05HPXP2KFzzhYabPF1a8hSPVY7IZLiG4wRAUEEC7bS7aXgW3HPEx6NVlz-7hyJiU_0sta4wh1QEkDLHOTMzczxOLIVxR9TBhswynlW0BfPtbx1oLjgWkPkxfoV4mR94af2txJ0cNx-LN1PGbGfyK_E59nbEUs1ANYenvgdNbpn1XI9eb2-40c7Ih4EGfZj_Or373lE7DZ6UXSdNR22nh5XcXDjm-JgDW9XrKHuLy27l5Zbw9LU7Qec_gffP0=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodyml1);

        gamisebodyml1 = (ImageView)findViewById(R.id.gamisebodyml1);
        Picasso.with(this).load(urlgamisebodyml1).into(gamisebodyml1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodyml1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodyml1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodyml1 = (TextView)findViewById(R.id.txtgamisebodyml1);
        final String stconsulta = txtgamisebodyml1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodyml1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodyml1 = (Button)findViewById(R.id.btncompragamisebodyml1);
        btncompragamisebodyml1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodyml1 = new Intent(gamisebodyml1.this,webview.class);
                btncompragamisebodyml1.putExtra("string", urlcombo);
                startActivity(btncompragamisebodyml1);
            }
        });

    }
}
