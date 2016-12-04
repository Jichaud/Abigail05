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

public class babeaccesorios9 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios9;
    Button btnconsulta;
    TextView txtbabeaccesorios9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e94b61e4be49ae26ecacb27644048385";
    ImageView babeaccesorios9;
    String urlbabeaccesorios9 = "https://lh3.googleusercontent.com/niursT_mMDMdDKILJZGj0EycUm-ghg4NMy-fF05gV9fZsdtBVGHSQoLMogr6kcUAVOcfiTzNsDb6qO2jT3QafK045XOL7jsJ2y-righ6A66V91DrUsweiVzhZOvjteom3i_tTTmx_AtyWA2lMY9MZG7VTFYuZZOdPNOgPu5XsoZR2CB0yOM6_sPWkhLuYE5UCVVuDW1IzcfxPYAWVN6rH0ErzUnNAx-lmvOqJR1c-6cWot7LaisrK84bVXTNDVMa1we-f5UngmIoRal-GvorksV3UdLXRfJHoPw8fpqHjGJbO7LkWsXS5flZKJWPaDKj55WxkXuJregm_Zom6vvjI5o6KL8gykLcSrUxd8wpZCqQmdmWIy_UozlwNFxUpsG9a2OXGS3PWyQRt5bt4w5tJMop_sP_W3ioFczslgPAOX_nya6wRTFjnObdBwxliYFwaWfjFMW5E3ExdojmyGPdJNrmLe9EsvhW5RsSHAUL2G9wATuALmVrLi1Ppc1sb3mRfTF4RlxZYKXFvSToilcBBd586cuiZkfB4mIkrpqPIMi-21eawJUs6G51862UdiXesUG70i3ga-a-DAxGKw3OZnG8GsENfwvoymfBTp4UkwRwFXKBHA=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios9);

        babeaccesorios9 = (ImageView)findViewById(R.id.babeaccesorios9);
        Picasso.with(this).load(urlbabeaccesorios9).into(babeaccesorios9);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios9.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios9 = (TextView)findViewById(R.id.txtbabeaccesorios9);
        final String stconsulta = txtbabeaccesorios9.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios9.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios9 = (Button)findViewById(R.id.btncomprababeaccesorios9);
        btncomprababeaccesorios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios9 = new Intent(babeaccesorios9.this,webview.class);
                btncomprababeaccesorios9.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios9);
            }
        });

    }
}
