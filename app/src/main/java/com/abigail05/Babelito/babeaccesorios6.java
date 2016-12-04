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

public class babeaccesorios6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios6;
    Button btnconsulta;
    TextView txtbabeaccesorios6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=55242dd644b38a8e866802c2ae121ed0";
    ImageView babeaccesorios6;
    String urlbabeaccesorios6 = "https://lh3.googleusercontent.com/2vBjrFNLR-P2RcO-iJJGgJVRxyWhSXg7lDWASoJxhZa-rdQ1pW-heXGEpGYtWlY8MXll1W7Gd-05-uPe1ROJK7OuZIc2-VWq5-FWwiWeg7a1TOpGSrqrhu9elaNsFMN67m56AECdZS99Rv95SaAQUgKS50BziRfChVnf5zqaHWMA85Rc-JdNpT9xbvqBAkPjCT9qRc-uxWl0h7WngkOL2rCv-aM-FUE3gCTEjPL6Qatqaa4RaOUa0mxwbF2Q8X_vZvvD6u4JtsLDeoBpmvKkdjNd8GQ_lXalnkY0aGZ-ALd0ceAgZU6SGOVT2ILfcWRcRJK5ROaOFN1S9Z6tKmxlr7GegIeLY2Y72kX_bEOiu94xAK6zWNtbCD7kHV8vEqLEDq5G_c1W07Ii4bunjOd4re5esiSjwXHzT1AkHuM5DZBMTGVwhzmeXMwbWhZ54ONmG28hPeudCcsmy9PjpWB5eiRcgCo6NASkAa2o0cdj1RNoowxY24_TrXWgnPf8e5guV9pAAZLGCj2ytNmG3WKxbBwF_DTA95CaaRvtkIb6OeIhNTDbzPp99KNm8HfrLNK0Wb8MMeqcHfP2Dzq59oaPk_vpDF16Ks8kjAaw0J5BmmeVTPI_oQ=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios6);

        babeaccesorios6 = (ImageView)findViewById(R.id.babeaccesorios6);
        Picasso.with(this).load(urlbabeaccesorios6).into(babeaccesorios6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios6 = (TextView)findViewById(R.id.txtbabeaccesorios6);
        final String stconsulta = txtbabeaccesorios6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios6 = (Button)findViewById(R.id.btncomprababeaccesorios6);
        btncomprababeaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios6 = new Intent(babeaccesorios6.this,webview.class);
                btncomprababeaccesorios6.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios6);
            }
        });

    }
}
