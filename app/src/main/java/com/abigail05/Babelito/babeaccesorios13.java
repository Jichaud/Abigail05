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

public class babeaccesorios13 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios13;
    Button btnconsulta;
    TextView txtbabeaccesorios13;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=672a422109c29bd86c3c06f6598f5f53";
    ImageView babeaccesorios13;
    String urlbabeaccesorios13 = "https://lh3.googleusercontent.com/gN8v0-SYp0aHxwPqGGPfBPP9jfdTsLX3fu4v7pnRL1WaqJ1-FQqPB4NPoeDDl45SK_YVqfhG_WlMUgHDqYsuR6qjhboeAi5vSWqo8eJQZrZ3oyeim357lhUptS6x_0YhUlQFYvnV2MhhBzb-uEpkvvREsnkd1zK16WBNxokF43VoSPcanfZLbGq2qpN-xZPG0_agImx9cYGy1y13ox0_P3z8Rod3e_dIwDHd9ylc767pqgWoYD9Kj04tpoEf53hrWN6PGRdhWsUSodJLXwgK9yxtLS7DtDF1XDf-Jw-3h9Z9ioFOUcUes7LEsyhGhDtl0EiT5wiqyW4jn3TemFlBchBWVV55zvGv574q816BESfvBtAX42HfGNXlVTtUN2RFim3RVbwdcg5cEiGq9A4OzFNTCeuMsSjn_-howRjnvXyYT_CvlNi9xMr7AmVXeATy0S_nGjsQuPo40iCRSYnPv5Y_zv0ATsN3HTDYSV8pjOWA7TJA87Lc54a8ypvMswG40v8kdG_f_0GEbmT9IcAzfghwMBeq8R49RHLoF45RCSHkVxq7d67GScWF1ZS_g7U8iwApe4UMf2DI_ZZzrfTH3jGfMmXd35RUCS-u0SwCV3aH2ms2eA=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios13);

        babeaccesorios13 = (ImageView)findViewById(R.id.babeaccesorios13);
        Picasso.with(this).load(urlbabeaccesorios13).into(babeaccesorios13);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios13.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios13.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios13 = (TextView)findViewById(R.id.txtbabeaccesorios13);
        final String stconsulta = txtbabeaccesorios13.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios13.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios13 = (Button)findViewById(R.id.btncomprababeaccesorios13);
        btncomprababeaccesorios13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios13 = new Intent(babeaccesorios13.this,webview.class);
                btncomprababeaccesorios13.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios13);
            }
        });

    }
}
