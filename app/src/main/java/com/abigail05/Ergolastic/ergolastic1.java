package com.abigail05.Ergolastic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.Nuby.nubyaccesorios1;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class ergolastic1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraergolasticfaja1;
    Button btnconsulta;
    TextView txtergolasticfaja1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5344d8c6ae47cf3b7a2339a4eda5f629";
    ImageView ergolasticfaja1;
    String urlergolasticfaja1 = "https://lh3.googleusercontent.com/uhMxEPhdEeqoS9wy1_QUyFUoXHTIVWVhtThVN7h-1UpRIu9VeXs8zdSWiFmi1IOcaIgF1D4KvaOjHE78muPfNMVfLF6Lojqfenf5J8Z1PTjtGtqvpaT0Tsx5F8bebFMrql833cGBBm355MnCd-bldd1fPMLoJomtCpi0oa8xB-3SeQonpb1kGqjbyWQ3LsdMyKOLrfGFTKGIzNy1DRqs5KYMHD1YY_LGhAi2aomlL_RHY75clO1pGJ_O2glrb672ne4G2aujeV2eOGvBoEUWCCW3iWpEpsGZwz-XcY36VO0qCbfjCEHwKrLv8EV8we7vl_9mcw0L5j5anncvhSellVnSa9xQsAv0FE_1QMU9K5ntqSXi_lu93mjsr_uY9ZF_S_gu-9cVWAB4O530jB1MIx2LZRr0C6JYKdzQwqVvX6c2TVQ-BpfpHAusMFpajLSHXfrdn0MCq0Lb261Qsr1RwHwOYmb-OzBwhzbOsN3NzjpgA-NfOgJtanqqgbk4VFg9TV-dFMbcAGF8Q7FQeDn5cK5V_R4WnEGM2y6kjjEPna4gBgnS-_H9uF0x5dzGkkXW3SbWMsO1VPK2jyColA1nBxMVxs4yk0OR0F_2gTaNSmNrpv3cww=s600-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ergolastic1);

        ergolasticfaja1 = (ImageView)findViewById(R.id.ergolasticfaja1);
        Picasso.with(this).load(urlergolasticfaja1).into(ergolasticfaja1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(ergolastic1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ergolastic1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtergolasticfaja1 = (TextView)findViewById(R.id.txtergolasticfaja1);
        final String stconsulta = txtergolasticfaja1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(ergolastic1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompraergolasticfaja1 = (Button)findViewById(R.id.btncompraergolasticfaja1);
        btncompraergolasticfaja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraergolasticfaja1 = new Intent(ergolastic1.this,webview.class);
                btncompraergolasticfaja1.putExtra("string", urlcombo);
                startActivity(btncompraergolasticfaja1);
            }
        });

    }
}
