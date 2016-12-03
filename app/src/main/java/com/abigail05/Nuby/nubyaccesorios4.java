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

public class nubyaccesorios4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios4;
    Button btnconsulta;
    TextView txtnubyaccesorios4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=33699074e8be3d4aac726e417e720ddc";
    ImageView nubyaccesorios4;
    String urlnubyaccesorios4 = "https://lh3.googleusercontent.com/9X0onEomHrIrsnS1F2nJ5xlelvMFsyOwxQQzY6hKjkb8fiw2ftbNPHLZyIo6r6DUrB65WKKCg79b_IophRyXxYc1mkB8qBnEKHf9fcXDgCFOzSuuyimTPTzbN-_vxknlZi83BcJhftZpC0j1cibKU5Q16A_lMIuXSuKIgdt3yEUZRdBEBZ4N78dBTD9cGVlYeTdfHGK25-bql0O_gC4KoJr5syXlcOQe4sm54WqcWpJzWMxiVJi1tTrUHClHhVXSHmCjKO2hM0fZhSEBlXB-Y3IWvFaqitiKLLe9t1MOzVNBbgqyTujbSM7ZRHWXzUxt8TGOCjgsZDfSmrSvnQYAK1vAhz3yfd0LLALGvahG_mxqoV_t5AjUNrFPanz-NTOxasxS6WLgWoNtkoEvT0-IrLFm-Abk0JEDfbfL-KpTFFOPixW0YA3Xphr3S-UnlEQwt6Z588QIAM74A7frCZKvgrCojJw4oYvZf2H2H3skwVlQYlYDe_81TpMHQRK_9FGQdJzKR3zzPlkzfseHCkpU6eJ4rIbQYvVCRfxSNJ3N0F4TRTvlpa61WLMHt9d1RBGWgO_bku7Qr4vHntf3COYIKmPNlBJAYPPTOVOAo-s5jEF4S1wsRg=w500-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios4);

        nubyaccesorios4 = (ImageView)findViewById(R.id.nubyaccesorios4);
        Picasso.with(this).load(urlnubyaccesorios4).into(nubyaccesorios4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios4 = (TextView)findViewById(R.id.txtnubyaccesorios4);
        final String stconsulta = txtnubyaccesorios4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios4 = (Button)findViewById(R.id.btncompranubyaccesorios4);
        btncompranubyaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios4 = new Intent(nubyaccesorios4.this,webview.class);
                btncompranubyaccesorios4.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios4);
            }
        });

    }
}
