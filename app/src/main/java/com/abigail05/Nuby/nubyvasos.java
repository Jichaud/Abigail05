package com.abigail05.Nuby;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class nubyvasos extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyvasos1;
    Button btnconsultav1;
    TextView txtnubyvasos1v1;
    String urlcombov1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=ec722d139958051577c494bfc704b05d";
    ImageView nubyvasos1v1;
    Button btncompranubyvasos2;
    Button btnconsultav2;
    TextView txtnubyvasos2v2;
    String urlcombov2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5c18a82394cae04948a686d63646838e";
    ImageView nubyvasos2v2;
    Button btncompranubyvasos3;
    Button btnconsultav3;
    TextView txtnubyvasos3v3;
    String urlcombov3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=15ab63cbabad543c8762a6bb8a930269";
    ImageView nubyvasos3v3;
    Button btncompranubyvasos4;
    Button btnconsultav4;
    TextView txtnubyvasos4v4;
    String urlcombov4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c8f42fda3ec0ad040ae248197d95dd26";
    ImageView nubyvasos4v4;
    Button btncompranubyvasos5;
    Button btnconsultav5;
    TextView txtnubyvasos5v5;
    String urlcombov5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e90610c52716eb7949f20dedc090d301";
    ImageView nubyvasos5v5;
    Button btncompranubyvasos6;
    Button btnconsultav6;
    TextView txtnubyvasos6v6;
    String urlcombov6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e6e76c24030302a858daeb22a8a0c14a";
    ImageView nubyvasos6v6;
    Button btncompranubyvasos7;
    Button btnconsultav7;
    TextView txtnubyvasos7v7;
    String urlcombov7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3a144e9a87d6499e29e70b84669d25ef#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView nubyvasos7v7;
    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    LinearLayout linearv1;
    LinearLayout linearv2;
    LinearLayout linearv3;
    LinearLayout linearv4;
    LinearLayout linearv5;
    LinearLayout linearv6;
    LinearLayout linearv7;
    TextView precionubyvasos1;
    TextView precionubyvasos2;
    TextView precionubyvasos3;
    TextView precionubyvasos4;
    TextView precionubyvasos5;
    TextView precionubyvasos6;
    TextView precionubyvasos7;
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
    ImageView nubyvasos7;
    String urlnubyvasos7 = "https://lh3.googleusercontent.com/OGgynrQ9I3zsQt7GpKmILngTlDBgt9Rzgz5aN8SiRtXCB0jzpml_ZmOXQVjtNzF61x6077DePiQW5Xa8tf79FeQOMMdHiSoit6Nz2iLZFEPokIERH4_B1iPI-KnsFJ89Co54P35QOz5GH9TABj5AAxaF3vS4oadhC-I_UCMxHKOlQvhmhIVZ-IU7KwLEpdnHtK74VVVpK7cn3hD4NPMS-1aF9z9ucsCZksvuqG_SHWeaOcM7oO3PgzyYfzcnS3RDe-pDYihoen8DhJ8Nk3MJ7-TrR5wV5MnJcwCSeXq9Y5w5dHc1rhg7EbYTxquQyHQR-N27W4F5Z6AeP-93iujG2zEpMg-91O8TrWaGySag3ZL0IqS1BKaUG0svtvz2Eqpc_lBgBKCJQdDxM4i4Nfa_BuHfx18Y2fDkzoguDbKFHJ7yUzCEXQ7IpVE2KTkWECdUAlPsu5lfRp3kkzJr0TuG7bpogYO6R0n-XcS8a2Buo_VeGDl4_48FDB4J73aMzSjmFOB1KaYFJTdi19nCeKqvtVJg7Opn1UjSM1IOSMFDNuEY67vJ9ZyIXgD31Ua45a9vKnPOm5hXgnZk5YKpY5XfX-mkW4kC4CWsrD91CgYNZC4tWSwe0Q_ZxVlrAfU8MJh35CC5kn-XKgydp0Kk8CUa5Q8i5xr9lXOeknmUgB-gahA=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyvasos);

        new precionubyvasosAsync().execute();

        /* vaso 1 */

        nubyvasos1v1 = (ImageView)findViewById(R.id.nubyvasos1v1);
        Picasso.with(this).load(urlnubyvasos1).into(nubyvasos1v1);

        txtnubyvasos1v1 = (TextView)findViewById(R.id.txtnubyvasos1v1);
        final String stconsultav1 = txtnubyvasos1v1.getText().toString();
        btnconsultav1 = (Button)findViewById(R.id.btnconsultav1);
        btnconsultav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultav1 = new Intent(nubyvasos.this,contacto.class);
                btnconsultav1.putExtra("consulta", stconsultav1);
                startActivity(btnconsultav1);
            }
        });


        btncompranubyvasos1 = (Button)findViewById(R.id.btncompranubyvasos1);
        btncompranubyvasos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos1 = new Intent(nubyvasos.this,webview.class);
                btncompranubyvasos1.putExtra("string", urlcombov1);
                startActivity(btncompranubyvasos1);
            }
        });

        linearv1 = (LinearLayout)findViewById(R.id.linearv1);

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()) {
                    linearv1.setVisibility(View.VISIBLE);
                } else {
                    linearv1.setVisibility(View.GONE);
                }
            }
        });


        /* vaso 2 */

        nubyvasos2v2 = (ImageView)findViewById(R.id.nubyvasos2v2);
        Picasso.with(this).load(urlnubyvasos2).into(nubyvasos2v2);

        txtnubyvasos2v2 = (TextView)findViewById(R.id.txtnubyvasos2v2);
        final String stconsultav2 = txtnubyvasos2v2.getText().toString();
        btnconsultav2 = (Button)findViewById(R.id.btnconsultav2);
        btnconsultav2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultav2 = new Intent(nubyvasos.this,contacto.class);
                btnconsultav2.putExtra("consulta", stconsultav2);
                startActivity(btnconsultav2);
            }
        });


        btncompranubyvasos2 = (Button)findViewById(R.id.btncompranubyvasos2);
        btncompranubyvasos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos2 = new Intent(nubyvasos.this,webview.class);
                btncompranubyvasos2.putExtra("string", urlcombov2);
                startActivity(btncompranubyvasos2);
            }
        });

        linearv2 = (LinearLayout)findViewById(R.id.linearv2);

        switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setChecked(false);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch2.isChecked()) {
                    linearv2.setVisibility(View.VISIBLE);
                } else {
                    linearv2.setVisibility(View.GONE);
                }
            }
        });

        /* vaso 3 */

        nubyvasos3v3 = (ImageView)findViewById(R.id.nubyvasos3v3);
        Picasso.with(this).load(urlnubyvasos3).into(nubyvasos3v3);

        txtnubyvasos3v3 = (TextView)findViewById(R.id.txtnubyvasos3v3);
        final String stconsultav3 = txtnubyvasos3v3.getText().toString();
        btnconsultav3 = (Button)findViewById(R.id.btnconsultav3);
        btnconsultav3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultav3 = new Intent(nubyvasos.this,contacto.class);
                btnconsultav3.putExtra("consulta", stconsultav3);
                startActivity(btnconsultav3);
            }
        });


        btncompranubyvasos3 = (Button)findViewById(R.id.btncompranubyvasos3);
        btncompranubyvasos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos3 = new Intent(nubyvasos.this,webview.class);
                btncompranubyvasos3.putExtra("string", urlcombov3);
                startActivity(btncompranubyvasos3);
            }
        });

        linearv3 = (LinearLayout)findViewById(R.id.linearv3);

        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setChecked(false);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch3.isChecked()) {
                    linearv3.setVisibility(View.VISIBLE);
                } else {
                    linearv3.setVisibility(View.GONE);
                }
            }
        });

        /* vaso 4 */

        nubyvasos4v4 = (ImageView)findViewById(R.id.nubyvasos4v4);
        Picasso.with(this).load(urlnubyvasos4).into(nubyvasos4v4);

        txtnubyvasos4v4 = (TextView)findViewById(R.id.txtnubyvasos4v4);
        final String stconsultav4 = txtnubyvasos4v4.getText().toString();
        btnconsultav4 = (Button)findViewById(R.id.btnconsultav4);
        btnconsultav4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultav4 = new Intent(nubyvasos.this,contacto.class);
                btnconsultav4.putExtra("consulta", stconsultav4);
                startActivity(btnconsultav4);
            }
        });


        btncompranubyvasos4 = (Button)findViewById(R.id.btncompranubyvasos4);
        btncompranubyvasos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos4 = new Intent(nubyvasos.this,webview.class);
                btncompranubyvasos4.putExtra("string", urlcombov4);
                startActivity(btncompranubyvasos4);
            }
        });

        linearv4 = (LinearLayout)findViewById(R.id.linearv4);

        switch4 = (Switch)findViewById(R.id.switch4);
        switch4.setChecked(false);
        switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch4.isChecked()) {
                    linearv4.setVisibility(View.VISIBLE);
                } else {
                    linearv4.setVisibility(View.GONE);
                }
            }
        });

        /* vaso 5 */

        nubyvasos5v5 = (ImageView)findViewById(R.id.nubyvasos5v5);
        Picasso.with(this).load(urlnubyvasos5).into(nubyvasos5v5);

        txtnubyvasos5v5 = (TextView)findViewById(R.id.txtnubyvasos5v5);
        final String stconsultav5 = txtnubyvasos5v5.getText().toString();
        btnconsultav5 = (Button)findViewById(R.id.btnconsultav5);
        btnconsultav5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultav5 = new Intent(nubyvasos.this,contacto.class);
                btnconsultav5.putExtra("consulta", stconsultav5);
                startActivity(btnconsultav5);
            }
        });


        btncompranubyvasos5 = (Button)findViewById(R.id.btncompranubyvasos5);
        btncompranubyvasos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos5 = new Intent(nubyvasos.this,webview.class);
                btncompranubyvasos5.putExtra("string", urlcombov5);
                startActivity(btncompranubyvasos5);
            }
        });

        linearv5 = (LinearLayout)findViewById(R.id.linearv5);

        switch5 = (Switch)findViewById(R.id.switch5);
        switch5.setChecked(false);
        switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch5.isChecked()) {
                    linearv5.setVisibility(View.VISIBLE);
                } else {
                    linearv5.setVisibility(View.GONE);
                }
            }
        });

        /* vaso 6 */

        nubyvasos6v6 = (ImageView)findViewById(R.id.nubyvasos6v6);
        Picasso.with(this).load(urlnubyvasos6).into(nubyvasos6v6);

        txtnubyvasos6v6 = (TextView)findViewById(R.id.txtnubyvasos6v6);
        final String stconsultav6 = txtnubyvasos6v6.getText().toString();
        btnconsultav6 = (Button)findViewById(R.id.btnconsultav6);
        btnconsultav6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultav6 = new Intent(nubyvasos.this,contacto.class);
                btnconsultav6.putExtra("consulta", stconsultav6);
                startActivity(btnconsultav6);
            }
        });


        btncompranubyvasos6 = (Button)findViewById(R.id.btncompranubyvasos6);
        btncompranubyvasos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos6 = new Intent(nubyvasos.this,webview.class);
                btncompranubyvasos6.putExtra("string", urlcombov6);
                startActivity(btncompranubyvasos6);
            }
        });

        linearv6 = (LinearLayout)findViewById(R.id.linearv6);

        switch6 = (Switch)findViewById(R.id.switch6);
        switch6.setChecked(false);
        switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch6.isChecked()) {
                    linearv6.setVisibility(View.VISIBLE);
                } else {
                    linearv6.setVisibility(View.GONE);
                }
            }
        });

        /* vaso 7 */

        nubyvasos7v7 = (ImageView)findViewById(R.id.nubyvasos7v7);
        Picasso.with(this).load(urlnubyvasos7).into(nubyvasos7v7);

        txtnubyvasos7v7 = (TextView)findViewById(R.id.txtnubyvasos7v7);
        final String stconsultav7 = txtnubyvasos7v7.getText().toString();
        btnconsultav7 = (Button)findViewById(R.id.btnconsultav7);
        btnconsultav7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultav7 = new Intent(nubyvasos.this,contacto.class);
                btnconsultav7.putExtra("consulta", stconsultav7);
                startActivity(btnconsultav7);
            }
        });


        btncompranubyvasos7 = (Button)findViewById(R.id.btncompranubyvasos7);
        btncompranubyvasos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyvasos7 = new Intent(nubyvasos.this,webview.class);
                btncompranubyvasos7.putExtra("string", urlcombov7);
                startActivity(btncompranubyvasos7);
            }
        });

        linearv7 = (LinearLayout)findViewById(R.id.linearv7);

        switch7 = (Switch)findViewById(R.id.switch7);
        switch7.setChecked(false);
        switch7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch7.isChecked()) {
                    linearv7.setVisibility(View.VISIBLE);
                } else {
                    linearv7.setVisibility(View.GONE);
                }
            }
        });

        
        /* Resto de código */

        precionubyvasos1 = (TextView)findViewById(R.id.precionubyvasos1);
        precionubyvasos2 = (TextView)findViewById(R.id.precionubyvasos2);
        precionubyvasos3 = (TextView)findViewById(R.id.precionubyvasos3);
        precionubyvasos4 = (TextView)findViewById(R.id.precionubyvasos4);
        precionubyvasos5 = (TextView)findViewById(R.id.precionubyvasos5);
        precionubyvasos6 = (TextView)findViewById(R.id.precionubyvasos6);
        precionubyvasos7 = (TextView)findViewById(R.id.precionubyvasos7);

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

        nubyvasos7 = (ImageView)findViewById(R.id.nubyvasos7);
        Picasso.with(this).load(urlnubyvasos7).into(nubyvasos7);

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
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3a144e9a87d6499e29e70b84669d25ef#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String precionubyvasos7st;

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

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precionubyvasos7st = metapropoerty7.attr("content");

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
            precionubyvasos7.setText(precionubyvasos7st);
        }

    }
}
