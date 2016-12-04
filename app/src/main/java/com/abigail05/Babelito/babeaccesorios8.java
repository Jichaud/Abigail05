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

public class babeaccesorios8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios8;
    Button btnconsulta;
    TextView txtbabeaccesorios8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ee7172fc894c202e23314fd7eff0da12";
    ImageView babeaccesorios8;
    String urlbabeaccesorios8 = "https://lh3.googleusercontent.com/xtO-_I2IlIfLatzzbkIlVLsI5uLp9ROsME5LsPWdnHVJy_oPQg4mQt9ti47u3_HqorNDae6d_KOWJ4dp-cBL1t1mnsiMaQSLXbGmFDseCqPMlWUdOorAPeEpBUv7hCbQuVAoxYAajGCscPbCCRJuwmP_-acSRgxtddevORq1rXDAVwrNnVjLaVhz4ReWqm7ewr6M920aBfSpfHkK3bMkolWe_3PFk3GfSndl5KwYLjVAF83JZ3QVMexXkMKcX9m6qwvtPYYvT8leQSD2MXp49OhgoBvdkIfoPAbG80hYl2uvAdkLlyYF1UOhBnP18xzLl1obh324YlG38T-i7WAB4wHfq6kseMf8Lh5Y7LJ_mPeXmmnie0QpA_oW-WLMJZp-6wqAHXXpn6uK2P6u-5fQuot-a0jGaW8rSUeONF_VjYklnPAwNnfNJoX3QG1SULm5PwpXHbma7xbpGd-0agvy4SHOPuGPRZK86SoBFUqqTxpnm2OZZLjneAG_nscjFUijWqZy56Ezb31S_sQcy_ZWSXYG-FQK5qOJnE13vP9YPxt5Y2w6VZf_P8EJweJy46BYki8ftmUqD5nKxDl4smgCLy8PqxVG5n0WLcsAseNY_sUTTmTokA=s299-no\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios8);

        babeaccesorios8 = (ImageView)findViewById(R.id.babeaccesorios8);
        Picasso.with(this).load(urlbabeaccesorios8).into(babeaccesorios8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios8 = (TextView)findViewById(R.id.txtbabeaccesorios8);
        final String stconsulta = txtbabeaccesorios8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios8 = (Button)findViewById(R.id.btncomprababeaccesorios8);
        btncomprababeaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios8 = new Intent(babeaccesorios8.this,webview.class);
                btncomprababeaccesorios8.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios8);
            }
        });

    }
}
