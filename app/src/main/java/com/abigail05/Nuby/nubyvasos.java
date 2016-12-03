package com.abigail05.Nuby;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Chicco.chiccohigiene;
import com.abigail05.Chicco.chiccohigiene1;
import com.abigail05.Chicco.chiccohigiene2;
import com.abigail05.Chicco.chiccohigiene3;
import com.abigail05.Chicco.chiccohigiene4;
import com.abigail05.Chicco.chiccohigiene5;
import com.abigail05.Chicco.chiccohigiene6;
import com.abigail05.Chicco.chiccohigiene7;
import com.abigail05.Chicco.chiccohigiene8;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class nubyvasos extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnubyvasos1;
    Button btnnubyvasos2;
    Button btnnubyvasos3;
    Button btnnubyvasos4;
    Button btnnubyvasos5;
    Button btnnubyvasos6;
    TextView precionubyvasos1;
    TextView precionubyvasos2;
    TextView precionubyvasos3;
    TextView precionubyvasos4;
    TextView precionubyvasos5;
    TextView precionubyvasos6;
    ImageView nubyvasos1;
    String urlnubyvasos1 = "https://lh3.googleusercontent.com/Jd5hI2dkfzrO4zzZbPiwo4FaiP2VetWLdTt4lzA33qzdN3-1hHS7lPYjAgYx9smFh5kCf6vkcayF5hbNLo7z_JtMY8Zobd8ynwM_Yz78NhyGwNoQvd-ald3FXmi7-HhXCUFBZLfIOk5XtnVXMuQj6cI5eUGbU8vEF0hRgo5EuDR90qayJlyZq_hh7J4Pkr7JQ--JDUWCr0U5bk_p_2F3iqfenQtljEbCDw41enIHOIBBYg8VDy0zXu1f43o4rTMZiLv6QsBs4aydzYeC7OJzEodZXYxcEAyfmIwa5mPt6ivLluoSvapHoGg6sAKCDh2Z67hFYQcA5fXhLHsbSDx-N-FrjU2e1YwXq87v04d_232GPwhPwLoisSK78UQ_yi_WqHDNC3hCWJt9LWqtCuT5IRPHjLPdPWWsB278lcRGZ1tvzEvCB8dUDuquS3hfOW7Cvt_xmUM4VU4xRjGz5GstPQ5ne2QSOnke1kVqGJ0bx_vZprgen63zZBkq2zVzZ-dlLBuSyzKy1h74KmaQ8VlTnpB5OyYsztdnOh0OJfJgKXM_Y1tO5MrlTuiOLXAymnDm2dfjWP8MQ9KgxCGuzMRX6A04EEpbJUb0b_Qg242GnHMnBXOvvA=s450-no";
    ImageView nubyvasos2;
    String urlnubyvasos2 = "https://lh3.googleusercontent.com/TYievQd5q1maW9JM5UwhFsgHYYm4wf1z-tJ9AEKEIklCv8Qa93xku7tchdBvavtDq-UPZBkIcyGXTU3F3-2aXHmIjcPjhccxjev5cNqFATX6LKnrLRfCKEm8Mz0Cjt9NLAfbMOVsFlzbW7Cc-Aof3a8IaZ180NbHDdmp1lalMD8Q3wa_fPVpRqlEnW3zVMzEPg6EsPUbVwUkFAl5EMKwg2S9aF75c3M1sBC9vkbWtEDKeTBancQAwsf_dE8HEvTsrSHASmBiwi0XfcV86BmbxQMNHT0f693gqZvPvwM9eyD27NFO12KM6hpvj0uYqKgyhfRnlTbrC6VcC4Pv2KtmjgEPTAngrS2mLyoIfJVnbLchqYgv8MVyH9d1pQ0hCuTEPh-OIIPm7rCeZzC0lenOR-vIj5wXhlsJTvUGooqP_KDdm8U59cS70FXnuKdHxezauRcGAMvwpFL8k26ts60ubBNyZmW1h9vZrIXU_F5mtVCTPDx0ulXwhuA4aPxtFW-JZu43wlBtMQSefzr25wh6byfqY2B_N-SACczXr9b5GMS5jWwP_rOoGNwk72-MvuS6IS9QY26AdjalWCmS_wWopz49kdwwC_GSpGMZWJ86J8IsCHZXPw=w497-h312-no";
    ImageView nubyvasos3;
    String urlnubyvasos3 = "https://lh3.googleusercontent.com/SGZ-3AS_EWfbith6Nlf1O5IBNV9csmByyJeAYKQAycD3le9J8iWsBMc86Z-5eHiHjsh_pCKJq-cDgsYive__4Ihf3WvOELTMXj_oSj7MfaZuXWEh7GBFndD3JuNlPu0Xfw5WPus0YQ4TICG4QPK2dQ5_nN_2s1Ga-eUyBq4gNqu0_9Lq7i2oaIyMkuPcddpahnqA6x5CPRsqciJFwfmvLytiz7LVc6U8mgjIz7CtxwdffWlaVbMb8I_qZyXycUUTGM934DJSom_ZHtIRMdyMrCjxsVJ1yUWTfUpOOrXVKyakDzpUjX5wZpAAeSec-k9YDBmWLlGTUBGrFjFuPJcTlwxdPjUVVJRiqX6a-dDFeiSdxwEEgCEmfna70cbQ6G0dw_MFcdlIghv--31aMgmG7tP-3b2ftr38PUmGptgFsZkNc4_T0zL50ptUCF-08ldiacfrzkMkYnR3FjUvigSEMzBN6vEt4KH8Yaf08MKXSB1y8cJRbCDL3BT_yedHx6tSWwmq1PXZgJRs1BPSFT7C7NRtMlYcXxKAHdNQIk5A4P_rOOeLY0UPTRt7iiR2nfe1AJ3jDIubvI7gp9WQozoVJLEZR9ce5pnJ29lbrhYUOp8odTfmyw=w546-h450-no";
    ImageView nubyvasos4;
    String urlnubyvasos4 = "https://lh3.googleusercontent.com/MXpyD7SHdoxVFG6cpNQRIAMU3c81Dv5CsxqpSCWlOkVpwZ74f5mDDb8IBzOrRiDI3x3daevwDJYCgRx3Sx4vAvS0e9YMCI3K6oDMadNkJHkuGQpSexWr2gDJxtSJL3FZlV8DybzsyDWzNknDE4l0id8XSPpg8sayPflaoltKWzSy7ITZpMqJJOb0-M93DDFSxpqcAQkXKhtrW1hiE5nlgOdbNWkEnYShxuDIzEKFbWuLtEshqcYIuGSiHXWRQ2URmvBIDzfyH36gbtUNClhgfqaRnKwulbN_WviSjvtvb1ca5L01Ht0jLoIYB6CzGxhxTeC1SWxvafBdDL8_Nuxeh6Cx71zcElIJ_8NvagsLCtbEm7hIqkhkmAsyzfCUVIvXUvPnZCTJsmh2RX8ITkUknDwfXDlF-pOAvhH0mRqHIfFPNL-6_htq1_SBnYXlk0jL4FrSLex_hMwxFbJy2CStDw1yXsr7gvWZglO2hR3H4C7MNZf8pbsP53uH7sP_fvFIg2iNcj0xs4sKTY5eyvTq2phmqBaXE5E_410367wKbp2qTM-QY1tHd5eSESfJ8qvI8B6Wn76Vnv-MMK8sJKy2gIcgHl2PJNV2Zcq4EhoQ9RkC5tMYEw=w923-h406-no";
    ImageView nubyvasos5;
    String urlnubyvasos5 = "https://lh3.googleusercontent.com/-xeP_bq4Vf9kS9WJWWTh6N9WH4yQ9hRm5MRV4EryPIaYgD869x4TAzxeW3s0f_1vjqJSzhy6Gm1hOs6RixbZWJTHKMJOigKHsF0SZnU3z635WmdPb4VUSxRRwQmCkqa8NU_k-7IvVRv0vSh856Kh7lT5qWmbFY_q7gB-8qxoFXZOLHck5LmMtLX1v3sQHBz4sqgXQN5Oz9L9w7HALFi6XtkOm9qE1oLKHyaxc03BP7AibzE9i5pI588_chIoOLhDUjtQUXKCUFA5aTUwX2aYxoePUZNZgfZRsAQzEk1Gog1n7_dSv5uBrIinKzfxyXVBxvxukLF0GpDlQEQBdZ1vv0fNp8o_FfKzKZ1hO4icqF-pl9ruZk5FoPn9RNkAk6wsF9PLLIu1Q3UrCkYS97zESvraE-1Y54WrB8qoRT10u6MRMnWyIpp7in1yIJ0iuFteEUKc7mQxXjVgdgFdJyLwcAM0ar0p_qKkF8NwnbtiuX8hIQ2BMJbx0xtGVYkS6eEv6SmOKiUfibfwm7YcuGUlnLT0bl_oU2iAwYUcjJ7sBiI40AiGsji1QM742_i9B-BLH37FTKtROtBFL-tXxZeTPQuRmP0H_nrsMIHek-sCRodVd9aJvQ=s480-no";
    ImageView nubyvasos6;
    String urlnubyvasos6 = "https://lh3.googleusercontent.com/Q2PV5OhinETR8rPoI2Iwwku6nJgI_FGXSpfC5SDKA0Ph9G4_YcSU28IA2G3ln4crSm2Z1NRYjnuKVCp3RvC14b8hNtJFO2wuhZf0lnvi5RWxi2HuiLwjzH3uIVc9u-rQNcTfFy0J0ieG88s-_O5cNqgzRori80Wody95Fyy2gXmjfx7WSPvTIYjd41-_0TddMDEJ1czDMt2F0Ob8blTYWwNfJdRv9-3zIl-sjddUMrQ3T2N97kaILEJgbQP4EYFDH3HggycYrG0ObBw9hwFSo65Z0KUlMfD3wdaxoeP3QFUOe4UbwItKlH-cSiHIN2cSU6gCvKa6fVZakMpYNywrHLs_v-6HbeVrD9Rd_sJke5wkfwZYkiUkm762X2ice4_XmWWaXX5ybyS6iz7mS_xangbR_-RE8DQLBO9TXTxK-_OBhNZ1X5ODeoNvF-ItTPft28vLYpmcD4mqTwZBLtlf9G7z3HlZzPbBBg_IGeBDSJMDfLQNjjRQHIDhtVab2_vB-a-Ak7KIeobUfR1neJsyC9ic85i4ryuNrVBSgyuPz40Nl68obhh2a5NlGH8woiRHgaY4b_-lXz_5qNBGDRNMf9QjTviGvw6uHsPMZk2jv355i8vtyA=w355-h576-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyvasos);

        new precionubyvasosAsync().execute();

        precionubyvasos1 = (TextView)findViewById(R.id.precionubyvasos1);
        precionubyvasos2 = (TextView)findViewById(R.id.precionubyvasos2);
        precionubyvasos3 = (TextView)findViewById(R.id.precionubyvasos3);
        precionubyvasos4 = (TextView)findViewById(R.id.precionubyvasos4);
        precionubyvasos5 = (TextView)findViewById(R.id.precionubyvasos5);
        precionubyvasos6 = (TextView)findViewById(R.id.precionubyvasos6);

        nubyvasos1 = (ImageView)findViewById(R.id.nubyvasos1);
        Picasso.with(this).load(urlnubyvasos1).into(nubyvasos1);

        nubyvasos2 = (ImageView)findViewById(R.id.nubyvasos2);
        Picasso.with(this).load(urlnubyvasos2).into(nubyvasos2);

        nubyvasos3 = (ImageView)findViewById(R.id.nubyvasos3);
        Picasso.with(this).load(urlnubyvasos3).into(nubyvasos3);

        nubyvasos4 = (ImageView)findViewById(R.id.nubyvasos4);
        Picasso.with(this).load(urlnubyvasos4).into(nubyvasos4);

        nubyvasos5 = (ImageView)findViewById(R.id.nubyvasos5);
        Picasso.with(this).load(urlnubyvasos5).into(nubyvasos5);

        nubyvasos6 = (ImageView)findViewById(R.id.nubyvasos6);
        Picasso.with(this).load(urlnubyvasos6).into(nubyvasos6);

        btnnubyvasos1 = (Button)findViewById(R.id.btnnubyvasos1);
        btnnubyvasos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyvasos1 = new Intent(nubyvasos.this, nubyvasos1.class);
                startActivity(btnnubyvasos1);
            }
        });

        btnnubyvasos2 = (Button)findViewById(R.id.btnnubyvasos2);
        btnnubyvasos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyvasos2 = new Intent(nubyvasos.this, nubyvasos2.class);
                startActivity(btnnubyvasos2);
            }
        });

        btnnubyvasos3 = (Button)findViewById(R.id.btnnubyvasos3);
        btnnubyvasos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyvasos3 = new Intent(nubyvasos.this, nubyvasos3.class);
                startActivity(btnnubyvasos3);
            }
        });

        btnnubyvasos4 = (Button)findViewById(R.id.btnnubyvasos4);
        btnnubyvasos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyvasos4 = new Intent(nubyvasos.this, nubyvasos4.class);
                startActivity(btnnubyvasos4);
            }
        });

        btnnubyvasos5 = (Button)findViewById(R.id.btnnubyvasos5);
        btnnubyvasos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyvasos5 = new Intent(nubyvasos.this, nubyvasos5.class);
                startActivity(btnnubyvasos5);
            }
        });

        btnnubyvasos6 = (Button)findViewById(R.id.btnnubyvasos6);
        btnnubyvasos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnubyvasos6 = new Intent(nubyvasos.this, nubyvasos6.class);
                startActivity(btnnubyvasos6);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyvasos.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyvasos.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionubyvasosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ec722d139958051577c494bfc704b05d";
        String precionubyvasos1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5c18a82394cae04948a686d63646838e";
        String precionubyvasos2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=15ab63cbabad543c8762a6bb8a930269";
        String precionubyvasos3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c8f42fda3ec0ad040ae248197d95dd26";
        String precionubyvasos4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e90610c52716eb7949f20dedc090d301";
        String precionubyvasos5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e6e76c24030302a858daeb22a8a0c14a";
        String precionubyvasos6st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionubyvasos1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionubyvasos2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionubyvasos3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precionubyvasos4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precionubyvasos5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precionubyvasos6st = metapropoerty6.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionubyvasos1.setText(precionubyvasos1st);
            precionubyvasos2.setText(precionubyvasos2st);
            precionubyvasos3.setText(precionubyvasos3st);
            precionubyvasos4.setText(precionubyvasos4st);
            precionubyvasos5.setText(precionubyvasos5st);
            precionubyvasos6.setText(precionubyvasos6st);
        }

    }
}
