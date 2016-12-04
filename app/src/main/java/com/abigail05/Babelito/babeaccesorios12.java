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

public class babeaccesorios12 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios12;
    Button btnconsulta;
    TextView txtbabeaccesorios12;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ad2b8ecf10bf707c58c8f89db981b863";
    ImageView babeaccesorios12;
    String urlbabeaccesorios12 = "https://lh3.googleusercontent.com/y_kgecswZzLDHn-zaJWR_-yYtCeZDAKJCpurIYAej-z_r31nhxjvwkfae3ClHUqdZtP0RDYp3cEaYGgK_LkwxG_6W7G_3Gt0naWbrxrs48nbV6cbhSXoR0nfnrM__HWHiJxv8-LwfkpJvPEBtDMPcP76OzU2Wynn-pEYyIJ9WOREKkPfG59FTqH0qRntfF0OJjuKzL8ZN68LmtlVsLJSz-2qi8_vp1O-50wKp1NEEYLpJUjaBD_XcP5Nu67OIwFevjzUN8GbmLthEcbBut7208cU1U3h-CphfT62JMZXU_w_tzOYlHo-d_V-tpC2tBSasDr_6HGCSIEGBANTTCurmnaOWvXG2GiQP6ljzpZR6IVjRDajmI4CBSeWf6SY8rmqNGb8H7_Mmice6aF5qadxS3AUh2yx5ACJeI_UGa1iRrKpvtALk_44uPPYasPU8Y77VprBbDbM3raEHfrmq5ettvYXO8c7QbqPiUtFHVhLWlFCreB8hkpGZyw1zYdTs7kLtVuMQiF5fWbKNlwy0OWgHkYToQzWT7Of2ZQd0G-ESDeXOrwkn47Jr0ic3YG9bHTDVshQ4R2N-01XbaKjRS9RdFxe_wbtk8gc_nFB7BwPn7yKJdxTAw=s299-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios12);

        babeaccesorios12 = (ImageView)findViewById(R.id.babeaccesorios12);
        Picasso.with(this).load(urlbabeaccesorios12).into(babeaccesorios12);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios12.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios12.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios12 = (TextView)findViewById(R.id.txtbabeaccesorios12);
        final String stconsulta = txtbabeaccesorios12.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios12.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios12 = (Button)findViewById(R.id.btncomprababeaccesorios12);
        btncomprababeaccesorios12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios12 = new Intent(babeaccesorios12.this,webview.class);
                btncomprababeaccesorios12.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios12);
            }
        });

    }
}
