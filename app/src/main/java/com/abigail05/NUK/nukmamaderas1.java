package com.abigail05.NUK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventclassic1;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class nukmamaderas1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas1;
    Button btnconsulta;
    TextView txtnukmamaderas1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=88ced653ed0d1d6496026ec9e3f5d129";
    ImageView nukmamaderas1;
    String urlnukmamaderas1 = "https://lh3.googleusercontent.com/6nqbwdrLLZdc56Itat4I1rzZ5EDBnAERnLuY49EJae7z8BFRV-UCexllblkE2nq8xyUtOU0VqrPTejBhKif9TvrdTp2SIjyQIYh1jg9ZyjxrqJF_ufbUeRxvTQIYKg--YqNyohHHYaMX8xlz8Zy_XbtbGv5Y5AsVEQQRgLU-LAW5-7CS12qazBNsBPrBsMmRo3wo0AYg0tg6t0tZfRVSXhqh2eY6TGRF2BQlF_lPpztg77XI4QVveg-wanWaOMchItRBxaPxdHxU_uTCxE4W1HAWKl3Z5HHCqLTddJm9pfCXLE9pkMeFdtfw891JhTsukPURFh2W_oPsATPCeEH2IyR_I0q83wIIpGkpuwXSNktY1nL8TOHQOLbjfkwu43RsG3vA07zUwKkZdbyLxt5ZBPn_ntk0JGLsN32hIq1QmFjhhQ9en0-zcFspKd2dDj3oLtj95LmnedLQufPCElhRlRh2rFsxj7um2f1-_9SC7yokdsuT6CwfgdF3sI-qf2gT-WYuGKOcYABmCRpoFV938CH0YfyFZQdcDahCP6A-p_IJ7QGIsjRFrJpXiA07fDeG032zkmKGt93ne5YNFC8DZKzrB1-W96xnZpEIQ7W67Zk2VZLtRA=w234-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas1);

        nukmamaderas1 = (ImageView)findViewById(R.id.nukmamaderas1);
        Picasso.with(this).load(urlnukmamaderas1).into(nukmamaderas1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas1 = (TextView)findViewById(R.id.txtnukmamaderas1);
        final String stconsulta = txtnukmamaderas1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas1 = (Button)findViewById(R.id.btncompranukmamaderas1);
        btncompranukmamaderas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas1 = new Intent(nukmamaderas1.this,webview.class);
                btncompranukmamaderas1.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas1);
            }
        });

    }
}
