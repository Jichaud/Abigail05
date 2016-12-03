package com.abigail05.NUK;

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

public class nukaccesorios3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukaccesorios3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=945dd90bd214a84d9205b18b5323d15f";
    ImageView nukaccesorios3;
    ImageView nukaccesorios31;
    ImageView nukaccesorios32;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtnukaccesorios3;
    String urlnukaccesorios3 = "https://lh3.googleusercontent.com/dRBuT6skJRmkl7sgkxV2LxbZ62gezY1hFBIpqd_iAxHynvVhnZcJ6HNZ4jzWSvhKS3e1FXmwCnes5OmrKTFi_Rtq19qUaGrGKXd9-T0GHH_b4V3wUbEA3otATp6-jssYS7BUGR-NHgT7rueIDd_h4L6949WT0NqdbpvfOtpn_-MjygpAAEW_2Y6cr4dRTYmhSlU5bIAV7jennFclIF21GE4IgJS_xEtUQB4IYpCEv2c5XVahy3eEEga11YgCzGKc_elGPT_G7LmcMUjrNonZuI1clIp6ow3nnpsQMBdDyMc1Ruw6zy1EK3AsvBcyUMC7IW2DpP7ExPmS5ceNkE045VNeYUPTpqUKYZMy_hYJ9Zeg1ss6qpe1xIneLEgvNK751L51TmzptViVSsEQnprw2a1m5g541NkU8ZUVBpgjzc0Kgjg9QztFKVx-BIw55kLXPctnZsRHtm4L51xB3y6gOWhh5j4lh39dWq9RTdWS74YO7GcBof2sk_5CUnNCaPtLTVboxsZlGFaCu4wFE9OrNRTPdMyXU_yQ1unx1PPNMlmaDm9UdZjzXOBmFLDkxb28nuF1a-CNPOio5zg7M1h85IeLT1kCklRoYZsXqXH6H5YSu8f0Ug=w379-h340-no";
    String urlnukaccesorios31 = "https://lh3.googleusercontent.com/xrQGGALh4vGqidb3d7eQ3IGcsDuVUNghdXkzjxEpoW7qSgFzwhqSJ-etsj1_98l8EqIl6b1Ig22C6ohkRGPPBJ27HtxUxSYVjXORZTma_kmjczbAm2yvrgTheChshqhXl1ZKDWvfiaSNSYedlxULQMh8EbcMH8cw2SZeexruH70J3cLVuaPghAbpFnIDj1Ge83tEJNVeL5cU6zbexMt3cMZlE7rSxKEeRYABzoe87JKynL-GC8Cmn1huwDpaRgBkUOoEaCvD-PhXCFtglyx4zYFQehR5ygOzfBmdCK7piP5J8jS0DUR-Vu_q8YIm_Q5TgKVgKGMesBnOMfdrrj1AqBpTWIu6Mmjm_fR10n2SijDV0hGleSQzvRGf-SOhJ6E2Kd6iYDj9lCerzy4QCHZfX9z1rQPXstwLUeltw9zwLUqlHzcomH7K2MEw3_Wyjs4lkQiintvZA8TDXQv1lYCFRjJKnKdJQbL4gpUROS9og3EcyMD3OtihNWuqSvtPVv-8dDgmtKuRQbcqWsD2zEDO113ViwAgpcymFd8IF_TNWD2Kug5c6io6-4mBK13r-wUd6lbtU98Ph6xcLD08pVyGMvwI5XdYYuPSDhfzhM2Q1RR_uLf8XA=w382-h340-no";
    String urlnukaccesorios32 = "https://lh3.googleusercontent.com/wkR9gAumYHbGqz3tXn6Or2YkOgKv8_nwwnOHp-QKI3kUXpeMb9OSKG2iTc4549seASbri-QCX5IYrHOf0Kd-g2l-JdX6DNU_sQ4MdC1YJsuuIxRn7OTPQk5pT09XH4xgdjSoM02FI2Dxkkzo99M_qAnYmcOcj_YBwGlHCRu3ynDRYZC0cIgK8AhsvzQaWQ_r54daVPe_tKZTB9w0WzLs5ik5VmgEOWnkUBKs9sccvMShjvCNzoMPKxUL2UIA_lRT2drmo81xp1B-GgHqFthX8AQNLZADePbJxb9cV5ufc5z6Qhl1LqrcEO1xBa4xHdA2i7CRBJi1w59OOJm5nlCsG_TAzd0eBxM0LDZyxk7TdJ3W_ij07RDk2VLDHprqVcQhY7gtS-A6sltEdkfOWFyVoWwjEOeNBTiTOw9ILZdQNpDyUM9v7p40YP5N4uXMieRoxm2w9CWY4NQnmVeBkRtMmXwvJ6oGfaz5cXI97PCeyFy1m1H_9ih48c5vM-OFWxKWP-CF7gi7goQI5DWSxjiVcAw3KDnsrbR3Vm2vpPeNis59HB37XwuEZgaa1ocgYDTGVjxhzLgHogvBHS2CHjyvxrJVLsnTg9AVqwrJLS_42R2qSGFEuQ=w382-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios3.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukaccesorios3 = (TextView)findViewById(R.id.txtnukaccesorios3);
        final String stconsulta = txtnukaccesorios3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesorios3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios3.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukaccesorios3 = (Button)findViewById(R.id.btncompranukaccesorios3);
        btncompranukaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukaccesorios3 = new Intent(nukaccesorios3.this, webview.class);
                btncompranukaccesorios3.putExtra("string", urlcombo);
                startActivity(btncompranukaccesorios3);
            }
        });

        nukaccesorios3 = (ImageView)findViewById(R.id.nukaccesorios3);
        Picasso.with(this).load(urlnukaccesorios3).into(nukaccesorios3);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukaccesorios3.setVisibility(View.VISIBLE);
                nukaccesorios31.setVisibility(View.GONE);
                nukaccesorios32.setVisibility(View.GONE);
            }
        });

        nukaccesorios31 = (ImageView)findViewById(R.id.nukaccesorios31);
        Picasso.with(this).load(urlnukaccesorios31).into(nukaccesorios31);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukaccesorios31.setVisibility(View.VISIBLE);
                nukaccesorios3.setVisibility(View.INVISIBLE);
                nukaccesorios32.setVisibility(View.GONE);
            }
        });

        nukaccesorios32 = (ImageView)findViewById(R.id.nukaccesorios32);
        Picasso.with(this).load(urlnukaccesorios32).into(nukaccesorios32);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukaccesorios32.setVisibility(View.VISIBLE);
                nukaccesorios3.setVisibility(View.INVISIBLE);
                nukaccesorios31.setVisibility(View.GONE);
            }
        });

    }
}
