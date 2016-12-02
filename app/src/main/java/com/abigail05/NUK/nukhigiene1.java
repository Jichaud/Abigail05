package com.abigail05.NUK;

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

public class nukhigiene1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukhigiene1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=24ef076d3c107753c44caee4cc129072";
    ImageView nukhigiene1;
    ImageView nukhigiene11;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtnukhigiene1;
    String urlnukhigiene1 = "https://lh3.googleusercontent.com/iHGOWl_Ch-7XO5gIDnh3urbKpjgpEhblaO5hELZ-hAU5uuSCtz0lRlVwVizDeV4TOYmd1wnLxVxuyNxnKMwrRZtTXgxVTf0F9hQM9Un-GNsTtfqAqo5bdfukkY056aYevJnzeCOIZ4mB9MNSDV8NUTR_HLvTV52SfYUhPusNTZtKqNRsNWt578psygXPiRrbUORB_EIL8dWJEPJ7zZ6ZzEJU6zVrx09vx6O9iBAFn8J3qxrvRUXajTZm2QlsEb-N3-WjBbrd3mr5I36ilNVHrrWf0qQ1iqc7bUY4te7WKStXN7Hn38iEe-DUGuC1JJm-6TnjQ8Qnt-uXiqLuyQpmw9retbURAovNsKmyokclhB7FPgvY6k_RgY_6Eg2OvxcUXmyXWLsNLE3cPsT7IYMUMIhlzy3z_PZ08sip6aGdz5ENa-CwCmQazKzHEiikx6GNkgoc0ZWdJ3K5yzP1dKRlv5sKk74OMMRLYSKKFLgbV-be0NvTKhqh5RRfNLyOV7Q1Tr9yiyRazAUguON6eEjhZy73bP76jepK8RhZjHlp7oo2jSWeS6kk6uKoaewc4f_O_DCln4H4mWTlki2rMd704Tb8i7O6LD3HqPMsnoa6w8OQJvmH4Q=w480-h253-no";
    String urlnukhigiene11 = "https://lh3.googleusercontent.com/Ww7jT5K1Ln6wVpj6S9ElfFNDmBegvIrN6Le9pqUzk6qRq-TVT7LYfQrqZQaFDp4Bv0jT1SXPhyAr-g8iUlRx0CCkqoW7WLktVX-C29idZCBmsBp84a4m8wBclu8TI-Algdo5vZPkC5FoppSDCNNE9TClAasKP0s-w4cgNwx49dRNX7RDU881g6GIKnKP-552QxoKFnTSD_3_Ik7-TrNzTCm-WCxLfEDMHGGNi4QrL6BBIN5Q2TRcwksjG84zOVRohrh-jwuezfrT-Gte0TfkX7DI7NXgV3SoQuU0N7KZnDINUJmXSHnxaD-VMbfGH7n4b-pIh2VD047n7pF_Qb2cySZG3l7XRze1UJvBdwJHa8CXTxXoQ_8zqkNbBfswWRDZUIX5nAO2TkezDP9pxk1V9JWrlmeHOcMBugQC0vdWbghj1EZVfWok-jboTQ0gRaHDUzHkzd8h9CQLJCST1VkiWr2tIl7LswlxcAj2MOjYjBLQxnQyV2QEsLJyPV_HMMkCB4W1V_f615_xTxC6MJs8IDUFhctO4lOi20hmSM_uBWC4RMc6k2nqAVCBqjq2__TMyd408xnDqOZ2wTsioQMzDSr56S0fNRVBaeVZuq21ogHISKMZBg=w480-h253-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukhigiene1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukhigiene1.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukhigiene1 = (TextView)findViewById(R.id.txtnukhigiene1);
        final String stconsulta = txtnukhigiene1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukhigiene1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukhigiene1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukhigiene1 = (Button)findViewById(R.id.btncompranukhigiene1);
        btncompranukhigiene1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukhigiene1 = new Intent(nukhigiene1.this, webview.class);
                btncompranukhigiene1.putExtra("string", urlcombo);
                startActivity(btncompranukhigiene1);
            }
        });

        nukhigiene1 = (ImageView)findViewById(R.id.nukhigiene1);
        Picasso.with(this).load(urlnukhigiene1).into(nukhigiene1);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene1.setVisibility(View.VISIBLE);
                nukhigiene11.setVisibility(View.GONE);
            }
        });

        nukhigiene11 = (ImageView)findViewById(R.id.nukhigiene11);
        Picasso.with(this).load(urlnukhigiene11).into(nukhigiene11);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukhigiene11.setVisibility(View.VISIBLE);
                nukhigiene1.setVisibility(View.INVISIBLE);
            }
        });

    }
}
