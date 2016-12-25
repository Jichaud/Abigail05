package com.abigail05.Chicco;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class chiccoultra extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnchiccoultra1;
    Button btnchiccoultra2;
    Button btnchiccoultra3;
    TextView preciochiccoultra1;
    TextView preciochiccoultra2;
    TextView preciochiccoultra3;
    ImageView chiccoultra1;
    String urlchiccoultra1 = "https://lh3.googleusercontent.com/1JPNzcdcWhNlRquVDIkIDTQrpFjO2y9SCfuuhF33UeBwVnPm-m9E3opwwMw_OToWHIyvtELD5K2Xphdx1_nJg0W_mkxsg361Yqb_p7977SLW3TXG_vRhZpSoCp1tEDQfVdDKYF1gVlLRAq_Ncv5eHI2xL5g8RMnuycXi42voFR-cKaNnu1rKm7DitMuV638bpWcarICmHKcDLPO3dMWJTVC4sidj8JijCvlxJtx3MuwBUvqy6F4RwqtIXYl7s_utIdCfNj1gkLiidMjiTrB9i9VqRdCukfllWJo-5I8xtxe4OwhId3D4boc2_QdXUGSTePyZEW3dP5NmQd6jWE4BbZNBMElUytqWMjRlvO1zhRW-TLUxYrjcp77AKl2osZI7ULBQiWWfuDfWD4EjOiB2WuGKhqOnjEAuv9_hYyrkWJRf6gHopIr9JQBpzc8qKlOubV3XF_CutPjo2rI3X51RUeIAi-fFVwMiNGqLol6PvWI51hXM6bDvDSfNqjxB7ACwqd7SFNP4fDb0D4bZl1kyLaOX4u__ZM6OoCfp-xBwftj-HY_BJXJ4ewfbExzhFxFQut2hyb_FsUmhqx7Nnuv_fXM0YIQtcrWkuIaJURQeIkcF6dtqLc1CtogCSplGQO5AmtSo-3cgHLhZ2iXVoeNFEsWDecJ3p3mk_myXs_-JNVg=s725-no";
    ImageView chiccoultra2;
    String urlchiccoultra2 = "https://lh3.googleusercontent.com/orQ3WoU8N4EWplAhpCwhMbhERe05DVaxvzoavvp2eTXh_r21CHyT5oJhuiTFX7FSnQ3H_hWIG-ZD6ZU3dkxbjzdrYaYGuBetqjpTAh-0ly0ByHG7EolpQMbKhFK7n5pAlEJcQ5AkmnqktvtLPs0glshO-qBrMFf-rzRMEPz3OQDPl_39iX1TtfANQbYUmU6crW0fBEyseWDS8OzPOUYr4ytxbag3WIMggJOyaZIqKCwOMMapcXrtchnG6nGjzqU1rB2zOaZMenni_ynHTkqpHfQDaJMNGnQuM3idNcONrHW80Rp8MA8AzljQ-EYhHa7vm-i4WGLv37eF3ZFxMM_paLuJN3l_mKt0DcZr42d7gtys4W6FAZ_lbr_qnCqhnWHYEQevUcBIH2sGpt6wF1ugzQ4zlkphTRxu_ivR88Y3Hx7klr4bP-_z9QZaQWGhDwJLZnejKAbotjq54MnLIzF3fawL7Q9ZCMJir2sPpmQmeIFtaqraliwiPxQK0tmgq3HYNpDTwS5J-ViDcCKv37Cja3SNVd-8eNEXnd6StO6kiCzGO4OKKsmfR27wBon1vb-JkyPccIvuPhtANh3aQIb1a1fTLyJhsaH2FLc13LBpNSbBGj1s7kgj27TJn18ULJXCoS6ry4Aq_cX-eQS_sFH_4ksjvuc8OCUvZXiO3xNoO2I=s725-no";
    ImageView chiccoultra3;
    String urlchiccoultra3 = "https://lh3.googleusercontent.com/3rQAzvvG6FaM5Ofc1mPLuvckTxIITACNQ7ybbUaf_BFZcZmp2tCVXmH8ulbSIh5SW2OJSG-llpc3Xtpq08Dd5v6nUNW1UJkvx5FbLxeK7kM1HB4aqKJ13MsO84xSH2MeD_H3FQmwmp734hgjTe_sSj2iIdKmLRfnHUm6FvTgUerTSDNl6dCryTWMFSn81ye70-l9ou26LkipkufI5N5ZdbcHrzUFTsciZ1uSkWhW94nbr41u8gGXbd2K9DDBDmmv2JKuSZCg04QjKAnfN_-OHZqp1ewj1KxpU6L2fyzrsqlKoKVnbSFws-v4pP38PltzyeMzPUILUrBzI9e1snnd8FZv3G6kEx3xJcHHMo_HKygWWlO5y9W4Svib1JKmA_NeyMSCKYPF3rsQIwq9QtIwhN2U4_4BqpgnQ9B6NNWul52n_gItGDsX2ABLYo86aYyN46-Y3l7rF9-vNCa_kdrGgFEr32_ONBOuekVgskMUYSYn3zJOfvVkmGZLrkYPb-kl5Mncsk4pURVlEPJF1kwip-uU6pOGLexyoTAwIDdBmvm8VsvYVAX7HgU4idcCsVD6mrqjfRGgCjam0bHOAVqBodjXV5zjkv0G2l1MfWey7jhHtrOCIPpjblU27cFzQJZ1qJLlRVZeoxcB2HlskCPscs3diqKn4YWL70WQZgNWFrQ=w393-h578-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoultra);

        new chiccoultra.preciochiccoultraAsync().execute();

        preciochiccoultra1 = (TextView)findViewById(R.id.preciochiccoultra1);
        preciochiccoultra2 = (TextView)findViewById(R.id.preciochiccoultra2);
        preciochiccoultra3 = (TextView)findViewById(R.id.preciochiccoultra3);

        chiccoultra1 = (ImageView)findViewById(R.id.chiccoultra1);
        Picasso.with(this).load(urlchiccoultra1).into(chiccoultra1);

        chiccoultra2 = (ImageView)findViewById(R.id.chiccoultra2);
        Picasso.with(this).load(urlchiccoultra2).into(chiccoultra2);

        chiccoultra3 = (ImageView)findViewById(R.id.chiccoultra3);
        Picasso.with(this).load(urlchiccoultra3).into(chiccoultra3);

        btnchiccoultra1 = (Button)findViewById(R.id.btnchiccoultra1);
        btnchiccoultra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoultra1 = new Intent(chiccoultra.this, chiccoultra1.class);
                startActivity(btnchiccoultra1);
            }
        });

        btnchiccoultra2 = (Button)findViewById(R.id.btnchiccoultra2);
        btnchiccoultra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoultra2 = new Intent(chiccoultra.this, chiccoultra2.class);
                startActivity(btnchiccoultra2);
            }
        });

        btnchiccoultra3 = (Button)findViewById(R.id.btnchiccoultra3);
        btnchiccoultra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoultra3 = new Intent(chiccoultra.this, chiccoultra3.class);
                startActivity(btnchiccoultra3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoultra.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoultra.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccoultraAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b3dd1cba02a91c7df8020c934fc6969f";
        String preciochiccoultra1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=985d6f4af3f8f49a10beb4d8aeecaae5";
        String preciochiccoultra2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2778911a16c68c7289b613913db8f9af";
        String preciochiccoultra3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccoultra1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccoultra2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccoultra3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccoultra1.setText(preciochiccoultra1st);
            preciochiccoultra2.setText(preciochiccoultra2st);
            preciochiccoultra3.setText(preciochiccoultra3st);
        }


    }
}
