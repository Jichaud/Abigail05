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

public class nubyaccesorios2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios2;
    Button btnconsulta;
    TextView txtnubyaccesorios2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e97f44bfe4dd2005d076086be1ab5182";
    ImageView nubyaccesorios2;
    String urlnubyaccesorios2 = "https://lh3.googleusercontent.com/jELiSa0a6Okac7ou6zoCTs1jHdaMLbNGK-rAn7Z5EKAOdpiLRxqOg8OvqvZooDnZ2DPY2tpcbg368IgzVwd9SQH88pi3AhkFk3ffVV21wJSpacCm4a8YvkWEknblF0fulxwexQaIO_r6N2rqNSgTRkFcFngUu5pjuqOdx4dQjaXUTob3jr10Ks5ktV4Gc0XRW6rsGZw6tomLmhz1Z4ovfdCaUVDVpxJUmRNc4PrjdJBThLE4NcSTEGparLF0TuykxujoJ-Y61-dpYqZB-GU6irHZ6UgzxZbfq9TIHuQ0cZFl8KZjuLX4zlInSKeSGW2HR7XVUKxISLVjchCchMaGfVEtZMmH2CpCqgiugPRoURxcXDdk3XazVAN_-sqwzooHg3oUlZ6pCTY2aeeiGoUE5FXWJlUFjEfybhkGK8htAng39ojs-k00XmFzY6ADyMhpqBh0zUGNx0xneFXxs804_t5Y5h62N3aG7nbfmEqXLJx6YZkFiFAOzbZvFQw7Tg9dvefGqwPAlqZBJh4qEsqYhPFNf3AP5ot3UGN24wiKbonRcl0dHKIOM8d_pkLSLS34vFIrF4F5dUK-kU7fJ-xfgU4uwqgr6y8NwtT_MXrDu7vs68gIPQ=w500-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios2);

        nubyaccesorios2 = (ImageView)findViewById(R.id.nubyaccesorios2);
        Picasso.with(this).load(urlnubyaccesorios2).into(nubyaccesorios2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios2 = (TextView)findViewById(R.id.txtnubyaccesorios2);
        final String stconsulta = txtnubyaccesorios2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios2 = (Button)findViewById(R.id.btncompranubyaccesorios2);
        btncompranubyaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios2 = new Intent(nubyaccesorios2.this,webview.class);
                btncompranubyaccesorios2.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios2);
            }
        });

    }
}
