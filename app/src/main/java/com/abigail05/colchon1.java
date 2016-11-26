package com.abigail05;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class colchon1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button comprarcolchon1;
    TextView preciocolchon1;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    ImageView imgmodelo3;
    ImageView imgmodelo4;
    ImageView imgmodelo5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d71eaa2befd5ed119ea3bf37a813bdad";
    String urlcolchon5 = "https://lh3.googleusercontent.com/Fa8TQtFxTi4htmtH5WcXUJBTMoghNFOpdvdytMH4BT1Boc7sLdIaS2oX3oxwBay6kJeQJAeprYr_eorCUQ5KXBJ5hCQKdVUcZPaFxqPPbDOo3u49Q2u5zxa6xEWYQc_ujE2XCh1aWyUTzTjRaF5qpNJvtyIFY27mZekE1NkKQAHUxVVBp0OBWB4MPGln_kqZ9aEK7Gf2nVuGCTkmL9fLXmHFkDdQ01pBpqcM_5cISoSF7r20ME5jN-yd-Ly7KVTU_phpj4yrmnwcNq0_cuQP4jfuRqA5TtOSiSWERkfVoAuMP6TdLCKPTr-Z4bu3g_JusRIB52j7NT2Jc9GeknkaPq_Qx9UcXPxWavXFkUkIHWr35Y78jYitPoTGV_mt9EXsKE1o6xjg-SgvfMgr81QWJs-fnAAHDkJxHKv995afWsRyhtS5sIgOdbBwt2EZM05kNEF2crR76IskZ1I8QuTKb0OT3bgyN95TTAMMjfX7PQfTptX33K-QUC90Sy1BBHqWmMnbgd-z7Zp7opEBVYP_LkJCqKFMQf2KgscRAcHG6HhlRR2jo3ygpvaXReSYTk7aQFdp7RFxKJIVVxSJyBHXgYhLdd4yDhaBxnDGwJgsKbh-Ycczbw=w406-h541-no";
    String urlcolchon4 = "https://lh3.googleusercontent.com/elhnpI81vZQUj23aXEdu9XBiPFZPNX1DJh8JKqcKNXbrDnTtakBaHqzFMqbDX52uOTX-2uP5WkZRZDr-CyIS6iLH2qFX6I3qiq2fMNfmoGX0aqZub_BMcjWJRQwtFLYY3jKZX94A2jbdOpyEEDlkSbqZTKCnhVcDqpvLNxGNJogMel91ezgSTffF2Qk4Ho657ypiYBGHPuaJy45vJ1HHTj3tSs8-Az2wXwHFTPbF619HsdKZ2Kd1AQlc5Ir2qXd_9SyvrApSa_3oJ1Ze0pTwGZlQ61qKViCI7LaaO3RTsGSLg0MTzcepSL3zYXhcrZF-aNt4Nolix6v4fy4IfdU5h0mkYhHsyP-ZrXqFrdXeKgYZhiEnmupZfBCm5sEOrK5uUw4rhj4UIHAGQulmb36TnZaeGhtdTA0rZO-MQi3bQ3quBIrE01iH1p3q38hy_-N5HILZiYCvOayH3q-zP3ClvpWs10CVAMQOWgozONaMcJ1QtNjcH_8eIRZQVhm4lZLhpafDOrwBPpBb5juBliIqCV_tIFa5qwr8L5SCtxGTbjeKVQYIf9WmOSNraoA8ekKw5jm4eHNbFtKH7I8SsZvU4I4X36N5NPfJpv37j61aA-fyQGajzA=w406-h541-no";
    String urlcolchon3 = "https://lh3.googleusercontent.com/Sa0ZEHaHyEeI_B3YhLctfHtcw9vN7kcmdVVI97PsvuujJoXr5ZReCp0gcSwOfKurX9ExDK4zFp5CAptifvxWGi1CbN3sVDMHfgQTsMZ3EiB4RTcmRYaAOx5KGmeeZDI8AIlhcw9uZkW-p_B3P4vI7kl0A0hj8DaJ7Lva-OQRD3Pj-Bii_lF8aRqzAdHXsJzsxjXGTocnd6rW0ieT_TDII2A3w6KovgxtQO3ARk7cf7u9K5KGQsG39DK5pR1zS2LIMO6ZqDdhiNAmdIqHaoh12m9x6c8EcSxsRsnM3kZcpB2aF1hOxJKv3OmF7eFEKp56vD3E3tfVSoWuheNq0DgA6jBbvpBbP2lhJVaEi9NdoudCT1-S_Si9mK9Mh0lntq7xz5Y8gt_w2M2XQPU4ZBWUWoMgG9I1o-o0Gq5Dr14P9sZM89SwTc5t-EjOfGf13mx6NEUhMYv3SjwJM7Lgy9Dj7_xEhKzcdkUQv1FzKRhSy_ELWTMgSVCDPzbPT8ga6IedciNBswQ2qmqQoeSGIKpQMM2_cGR8qVajmeKPWTOPgv1FBIWbTweIVaNARBeB8rF2YSoTFjTksQp2Afj-4j4ITslDgx1Y7MFh3rnXeSF2Lxiq70D9Fg=w561-h299-no";
    String urlcolchon2 = "https://lh3.googleusercontent.com/9h2b8e3FEwheWpq77LyBrNYLYY9SAj6nSSHxE0OViTuQ_atTcD_Gxj4_GxQufj7OldOwnYW1_VMhzzJU57MG-9-Xyo8CN3hQ0LwZip9mllI9ogPf-NHGVNKy5u8a64coynU6posdz3KXNrOrL4JQiBMJXh3UQ5EquTfi-f6Kay2T-_v19r4swSZuqEb6fmRIQVhjO6BIggsJ6puqTZIkGkWKUPViE10koKhI2-awvQC36Ga-QRRP7KL0q2UZIuVLAsAomeVokm6ZQMCpT0AHYfuO1xqa4wfdQjMQuNCKa_xupGn4FhuCAalRRMFSLrpsT3Bz2WF7v0AAvEawCeDNI6SJblziDJqPfIZ1aa4zz0BRzTf0-pVRQBtzfQ_D85zQNKceNDHMKNRG6A4UZRRiAcRCe8Nj7Lmej4hEhj-hL8dIA2EHiTjTzYL1QlheCAlpfa1fr099lzbX79w7vMzmKFodNaQBsPeMghhBOGj5XlIgr-a9N80UYWL2tzfsTWBGAhc28BKvhyulWBzXnp9c_ScRU3Fe7eSXvdAv2e_ZuchlVLtIMHiXlfRzQhrXDmjtg3m4UuQGdK4LL8Zt2rqTP0dgSIxAW9lcUQwMfKuaE8sPoyBrZA=w1042-h541-no";
    String urlcolchon1 = "https://lh3.googleusercontent.com/n3KN8Dd58VXVoSxFEo-kgDF_aKfa0RreRfeH2O6mLPyRijPQkiFnKf6IEPtrbG3_VuYAG-H3OCxFdx56reiRlt_-SqEMjDwNQKrWbKGuUGevHWKkGOcxaKdmnYTvVh1tPQ6mDc6UHdaH2mRm8uyo6o999rE-CwZyM3-EL-oZw_fsoiFs2W0fyTHYkvJQ3HblijkV6AzoecuXffrjsfe3aQ2Xh0NM5SZbx7D5K_UMP6dur0QHMj-gqOybVDGymQPL0DR8KMAAR9YvD2E9GSInbvqHzyHCeQFcQfiF9W5LhQNed9IbGCCwZ0RJSsvD25KR5TXEmBFyexte-ZiCmcFilMxkG8bm3mDXnwC2h3MgNyzBcAOBZ_4XYRbZp9ISkgqT0QwVfG1U2HKJVerluI1ffj_iljSX0ZGVznQyuz2IbYGg2ceqsgp38wT9yD2EOzRAhMkc4AYY0G_LmnN7hEky2sawntlCXF4_oXH1rLaZW9sP1wPCncfXjQGj2-QdAo2-fTnIXwfTe0sZ5tma2UAnGEIl7mz0cRJUkjdTqQLqFRQms6pkVi_UB9ghms0GiSRu5Sv86BFvXs9k82oFME0vtUvKZkXf3njpcKGLZ4av14EAnoUZww=s541-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colchon1);

        new preciocolchon1Async().execute();

        preciocolchon1 = (TextView)findViewById(R.id.preciocolchon1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(colchon1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(colchon1.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarcolchon1 = (Button)findViewById(R.id.btncolchon1);
        comprarcolchon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcolchon1 = new Intent(colchon1.this, webview.class);
                comprarcolchon1.putExtra("string", urlcombo);
                startActivity(comprarcolchon1);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo5 = (TextView)findViewById(R.id.modelo5);
        imgmodelo1 = (ImageView)findViewById(R.id.colchon1);
        Picasso.with(this).load(urlcolchon1).into(imgmodelo1);
        imgmodelo2 = (ImageView)findViewById(R.id.colchon2);
        Picasso.with(this).load(urlcolchon2).into(imgmodelo2);
        imgmodelo3 = (ImageView)findViewById(R.id.colchon3);
        Picasso.with(this).load(urlcolchon3).into(imgmodelo3);
        imgmodelo4 = (ImageView)findViewById(R.id.colchon4);
        Picasso.with(this).load(urlcolchon4).into(imgmodelo4);
        imgmodelo5 = (ImageView)findViewById(R.id.colchon5);
        Picasso.with(this).load(urlcolchon5).into(imgmodelo5);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.VISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.VISIBLE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
            }
        });

        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.VISIBLE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.GONE);
            }
        });

        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.VISIBLE);
                imgmodelo5.setVisibility(View.GONE);
            }
        });

        txtmodelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
                imgmodelo5.setVisibility(View.VISIBLE);
            }
        });

    }

    public class preciocolchon1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d71eaa2befd5ed119ea3bf37a813bdad";
        String preciocolchon1st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciocolchon1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciocolchon1.setText(preciocolchon1st);
        }

    }

}
