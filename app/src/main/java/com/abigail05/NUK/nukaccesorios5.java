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

public class nukaccesorios5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesorios5;
    Button btnconsulta;
    ImageView nukaccesorios5;
    ImageView nukaccesorios51;
    ImageView nukaccesorios52;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtnukaccesorios5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=38195ba6d3c64c703fe4489e249669f4";
    String urlnukaccesorios5 = "https://lh3.googleusercontent.com/Nvoz-QaszCBoN_MDEwHeATWdfwMMeTAzonAbjEc466J4IvqnPhZhM1PrmyW7E_-snLYZXOhykiepywgPQuB6wBZMbcOAe9J4q6pgb006sRmh5FJz9xEEJhjb50j09nXvGb3kITPrTX2F2ciLp1WD33svPtk5tEIusMy9bU3RX6VHbWcrMUHLcUqQYam3_McRWqmJFVKuHpog59kbXDZMefL7q7Kqsm1EebtX0u2_NtQTUJNfOvPXnNZD7hCTLBjRIZ8jZMJoJj6psmrQRNf5JVs9MPIDKoDwr3Ul7xYyzTMNICyY3g6gFPj3OD3FznpInvmK0KlxAZyfEQQQ2At1aiB3PsH4YA6oLNrE1tPoa8k8j2puUN7c6rL2DGu6PsE8KMvRyFg-puLzV2om0m9bD7jGH37U_NZcrRHRr9L8TzfsDPBpC0af2ubzC4Bgbj8lN1c3jz_rjahvCiQoT4nKtWR-cDUSt30kqMsMQrywlq0W_m7EAwOORIkXjUVuYuyWFf8pGgSdhQLLwhdC4j0jc8x_EeYbko73ZlsrEJgEQ-7z1DwhSb7ROA5F3bJQ9nZAzlWSdrowuee5VoPym3t43aeFNWJ6vZf8ymrreLe4SiZAWHIIaQ=w375-h300-no";
    String urlnukaccesorios51 = "https://lh3.googleusercontent.com/NzVNAgmxLY3szrKXVev5-3AgH1Revv1ijIZvG1DS7me4Rh_mlkHFbUiSQWctlHu2JZr1zqMC0PxCDF_rgFsZ_qtd4K6fuqrT_7M3nWILZJ3iVlSw9I6y_yMywp9anLuL_vstuEI3rmz30g-T3RRJ9xRW7ZOkdix2Ze0tJUOovFe4OP4AqgwHPZNRvFicX_gSAGyV8PnwIpmPCf4o-KORJ8foZ02xUd6UdbOS6AaX3BgBOPHemNO0Zpt68jtQ6Atngu2tRMyN1IRPlSN0myr25ltBjLTexOU6UXgPYxtdk8vrbpAraoEOZSfdKG-PHiqDME1PqDn6MQ33_a0wIvZVQw1NCZogQ1kYDF55Afzu7zwMKwl5sf9uGPRK1qcmwrVQ3jFdZt2RMM_mDHLTtMIURxsc-WYsSqdfnAMRdpDHGe75YzUrjcE7aQauhhdzqDNk4xV9J8N00mligcszKb40nD17g9E_1OmQlnl08Q5VtG5k0h3Xq07agvbUgXKM9KeFA-43jjklacgNU0YEIXNXecjrov_zmUhwX-euQU10QE1JMD8SMyftxaRKeREsdEqz7_V7Xlt-If7gGdQyalDm1_a6AjOc6dODSWvAGDalvAojMv2dqg=w377-h300-no";
    String urlnukaccesorios52 = "https://lh3.googleusercontent.com/lPkXPdMBwZGpbIipzdIJMVZ9wKcWgH3KZhzF137eKz07LPslxlbip7lyy8ydvCQbGs9QGxTUgnwswfi-l3hkDr-M6b3Ks5z5NCYHQLHNbZ2ZvElYkxJQQWuMErTL__5owb3IxlaG6mntWbG_4bTgBymCnkQzT3rEOqmuV4NFVwGdpfIJhF-TT7Lq8tdW2sp5iG3nT_jPWasYRdlrCpEwcVg_4PBgWH6rRx8n_vlM__ZhUHSl4XLvzJGdltmkvNeBl2vJog1WVVtiVMLHTMv8ihEhawcOvpYkg7gR5gdcVms9BvwBv7StqrYGl3-DM9W52F3XDJ5JNyfCe8Xt0f1U94D_1uMnIQ6mZMYvsQYEkInn11igQelmJH2M0ZZajO6uy7zytyudbwg0nBDrtm86r2L_iEGbXdngkVywjyg4ykheW6UmlpnuOYXpGaL0ZTsYmNhWIhiOtbukKbT8od51w0RwHu1BgD-1TfUx_FN62pk1QAoeF4B79OcUVLzR5aZACn0IrWBRuBhhDXv8SaozNEIyFVc2u8P_O3XWfeeV4YFUnVhMGknxq6aaKLp1ULlwxIMmexMLumAAyrcBw5Kyc9q-5GalYKWiERPHAoezp56e4nYUMQ=w372-h300-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios5.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukaccesorios5 = (TextView)findViewById(R.id.txtnukaccesorios5);
        final String stconsulta = txtnukaccesorios5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesorios5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios5.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukaccesorios5 = (Button)findViewById(R.id.btncompranukaccesorios5);
        btncompranukaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukaccesorios5 = new Intent(nukaccesorios5.this, webview.class);
                btncompranukaccesorios5.putExtra("string", urlcombo);
                startActivity(btncompranukaccesorios5);
            }
        });

        nukaccesorios5 = (ImageView)findViewById(R.id.nukaccesorios5);
        Picasso.with(this).load(urlnukaccesorios5).into(nukaccesorios5);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukaccesorios5.setVisibility(View.VISIBLE);
                nukaccesorios51.setVisibility(View.GONE);
                nukaccesorios52.setVisibility(View.GONE);
            }
        });

        nukaccesorios51 = (ImageView)findViewById(R.id.nukaccesorios51);
        Picasso.with(this).load(urlnukaccesorios51).into(nukaccesorios51);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukaccesorios51.setVisibility(View.VISIBLE);
                nukaccesorios5.setVisibility(View.INVISIBLE);
                nukaccesorios52.setVisibility(View.GONE);
            }
        });

        nukaccesorios52 = (ImageView)findViewById(R.id.nukaccesorios52);
        Picasso.with(this).load(urlnukaccesorios52).into(nukaccesorios52);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukaccesorios52.setVisibility(View.VISIBLE);
                nukaccesorios5.setVisibility(View.INVISIBLE);
                nukaccesorios51.setVisibility(View.GONE);
            }
        });

    }
}
