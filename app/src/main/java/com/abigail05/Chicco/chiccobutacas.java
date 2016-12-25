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

public class chiccobutacas extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnchiccobutacas1;
    Button btnchiccobutacas2;
    Button btnchiccobutacas3;
    Button btnchiccobutacas4;
    TextView preciochiccobutacas1;
    TextView preciochiccobutacas2;
    TextView preciochiccobutacas3;
    TextView preciochiccobutacas4;
    ImageView chiccobutacas1;
    String urlchiccobutacas1 = "https://lh3.googleusercontent.com/lcadj4raCW8tpzz3MjJglrAiv7rrFR1htf6KFtoqJMKPcSZvp9NGvpafBXLfOzhpmZIyh83sa6M6fbHbRrCZ00iGSs7p5qO5cHa93XBJ_jmYp83A7jx_VuRlcNXn-10xX_1d6K3NespIJ6TdqjOHa-vrmlsqvkUkpkEUXMkozpv4p_B132OPlrnYXbSGRGs4EwbZFo4Z01ZPsZZL1Cd8yQEOWSwgzuZAJcNv0IdQmj_kq0S3A1R4s3mCkFrz_zzx8h-Y6kqPBvLvB-oCjV8571BM2x9UfbZzfSKMjP2LJ5c-T88x8BEmNf8h1y1SBpHhDqtok9v79PZPXmAA3jbEACKlhh5ZbrIGIC6upPDitCAmApnwU_TBYQ2n9JUSXqhxuTV0lE-sVKC_YxVuv9RB63yUgpxu2Xbe4IxJWmH8x8IENusQIJomc4ZxQaKgwg1Wn5lxf_RoLQ3ThrfOj_hTbNIxRReUaRWLOkjOeRwPIT7oACRzlzyQCE2tQJa4ZY21RY2iLXsHPSPuYR734jLcTWb30wWphx0Ba8UBN3QoDm4Cw-LI5MalceonDpt7WSYE16OGss-6lRKwkR00NcCfsuu-0KWyHsOE-MbRppbulynWfPCrzTOQy4kH2nTTDs5X8aTS31vMBP5vA81cBVyMwxjTOyU5DmMwXW4PXq6B_eU=s725-no";
    ImageView chiccobutacas2;
    String urlchiccobutacas2 = "https://lh3.googleusercontent.com/1rrPX2OD2rjyci90_GF5LpJHNJvNddx47C90kifhiWO6kGcyC2ZTE2N0sgFoZAxLoq1I4hYNRFDgmMhPXJTZVicQfnC8k4ZzzEasQb-GupCJ5vZZdt23lOj_r2iFYx9vPd3QVUxKf9E14PG0AYPO0Df9NeD-b12K7v_0naR1i1ix3Udw1gnaxWMJXi3TZJcH4txLkkLmLv1brm8g5DCYwdaV_adRWmvlcBX_2jlRIW-wdzw_XsYtZSQdkhujbx9OB6R7_RDr94k_u9ZGWuFcncyZhBJ9daaSMAYPnKb7Znb96sp5HDG1XSPgPHzzvJObgekqBxj9xiy8TQQKEYohE4vYE-Fs1II38FUgNw4RjQxVJVZ1EZd9vDsxk6WbcUv2PKdzFwY-bskT3FD4X4FuQqd-ASFvpy9eoMcmpbFPk7tKHZZcHYwf79_g6TNQ3U5meK54kvO_2XpVbRnwTa4L4pnDJmCzdaK3OKYGvdmT2dpjHu-dBxqFvQc07zrZ6mHvm1alHYwR3WbrtARO3ILApcdeZxCBNVmPyg-B2dHhEKociylOUeox1Np20t28BynW-QJkRrGQzjGmUhMAZVKPR2g5XAnt134OUzip_1TZ4vbPU5S1sp3QeM9E1XlmAGfTtxZFtIqQhDKMAS4aYK3PEuve91dI4s6q0jf2_SrHYyk=s725-no";
    ImageView chiccobutacas3;
    String urlchiccobutacas3 = "https://lh3.googleusercontent.com/6FW-ae2iaDy6ssl43Z109SZ3hvjcdU7Cv_DtvBx49bT1f17YzAsQ9XrIt5lRfDlD5TrbwMzsLRXU0JfpxW8DJRWJ9Zui7OzdL-H8JVlNjQA2ywJ290Sag7FltWNQpSp9zUzSo_95v6yNuBVvrHKwuo-RGlc7E7xWsnGUrAj8fgBHLY5ywm9WH4RlUBBRagOkVISN4Vmf0VM2Zfsigt709ifCjYF56NatXYQuBvVjRwusKP4ZO4I79-YvOXbM3n5TK5oQHyj03QvLaTIrZC7HaTxCw35WyDGHX_k9lR2jVNLuQjZmO7hWWeDbmC9Cl_VlMMm0JeGsln8HMLDZ36RAfmPLYdJQOxnL-fihyeGvvmv5wFOX4UGhXGI_OJ45bYEaniNzkO8-_Y6Q9qB1rEh4O_-dEHFc2O3wiKODAPH99grTG5I9xQ5lDfyBsn5bfm13z8BugSXVumfU4hVDA1LAK-9xOwUumx_UPD65fHo1IdeR5UFM92zWObcPUd3303GW809k9XUI4-q_KsT9mGwI2LcT24t2kM7Q5pdHz9QCfH-luckDeA13NgVJupFpnkH2HYopyZEK4THAKl-A9yAxdIJCxFjJErrAfc56C0_StEIEckU7xV_bbhtd3pOagSG4SwG6TPC5I-DHX8nAgKSxA4wdel7PbTH2-Ww7C_iCwgk=s725-no";
    ImageView chiccobutacas4;
    String urlchiccobutacas4 = "https://lh3.googleusercontent.com/pk3igtBDJ7fIWz2havoYmvVvOI6KfZSIK3RVsQuTEBCgCe_joYyzoKbcL27g3Mnj-ml_1FPvYR41bgZdaDMaFHm_ItbyCb2RYCviIvw-zhevIOgcT0N0aGCVjhSI-HjyHFQuPwAoy-yhTmyTJfrxAVMLeGUdOKpc9ahi2tmfBu4_XVAqt_-0kWNWR-GvfhFkQUXwShnGwncAr3HorNhy8SmpDi--vbvNd2VCawz_nu2hULIK8XE7SC7W6jRhKRsE_GRlHk7KgxVxbpKBvNjQvpwvKPwhLw-LmYLDBQW_7_UJsQaRwBaepofkg_AuVphkbtQG9eiskMSZJ22MSG3_V0X9OAAFV6ci7DSgrB9Ty1Ihfo5A30dMgvnk4MOJ73-CytR-h_jKWs7eYQMcL-jrfWbxWuUV_Y-76Z5yh_u0srrpxU3mrB9c2_aDf_WL8d_CGRXPe7F8uOEDkGzs7KngTYET6w0MNqjFZd8XQroa6P7ghoT1krPh6paitt0thMl0JkegPHm2eHN0RzS5KUI2dqqWYedYrTsZW2ot0qMbPmcOmI6dc0F79rpub_-V_gJdjiNeUfvVWxJBdWSgsnBPPU60Zm-MZ1_rYor8NmTQSsBCiUyslEQIKO9COFpVyJXe90_A1SVCJPIwxpjoDArbiqTMvlg-4Uu62QCLtgDXv60=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccobutacas);

        new chiccobutacas.preciochiccobutacasAsync().execute();

        preciochiccobutacas1 = (TextView)findViewById(R.id.preciochiccobutacas1);
        preciochiccobutacas2 = (TextView)findViewById(R.id.preciochiccobutacas2);
        preciochiccobutacas3 = (TextView)findViewById(R.id.preciochiccobutacas3);
        preciochiccobutacas4 = (TextView)findViewById(R.id.preciochiccobutacas4);

        chiccobutacas1 = (ImageView)findViewById(R.id.chiccobutacas1);
        Picasso.with(this).load(urlchiccobutacas1).into(chiccobutacas1);

        chiccobutacas2 = (ImageView)findViewById(R.id.chiccobutacas2);
        Picasso.with(this).load(urlchiccobutacas2).into(chiccobutacas2);

        chiccobutacas3 = (ImageView)findViewById(R.id.chiccobutacas3);
        Picasso.with(this).load(urlchiccobutacas3).into(chiccobutacas3);

        chiccobutacas4 = (ImageView)findViewById(R.id.chiccobutacas4);
        Picasso.with(this).load(urlchiccobutacas4).into(chiccobutacas4);

        btnchiccobutacas1 = (Button)findViewById(R.id.btnchiccobutacas1);
        btnchiccobutacas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccobutacas1 = new Intent(chiccobutacas.this, chiccobutacas1.class);
                startActivity(btnchiccobutacas1);
            }
        });

        btnchiccobutacas2 = (Button)findViewById(R.id.btnchiccobutacas2);
        btnchiccobutacas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccobutacas2 = new Intent(chiccobutacas.this, chiccobutacas2.class);
                startActivity(btnchiccobutacas2);
            }
        });

        btnchiccobutacas3 = (Button)findViewById(R.id.btnchiccobutacas3);
        btnchiccobutacas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccobutacas3 = new Intent(chiccobutacas.this, chiccobutacas3.class);
                startActivity(btnchiccobutacas3);
            }
        });

        btnchiccobutacas4 = (Button)findViewById(R.id.btnchiccobutacas4);
        btnchiccobutacas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccobutacas4 = new Intent(chiccobutacas.this, chiccobutacas4.class);
                startActivity(btnchiccobutacas4);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccobutacas.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccobutacas.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccobutacasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a9e3a888118947ca397d2761376e8010";
        String preciochiccobutacas1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0a4daa1ab465e5e976d52e082e36beb9";
        String preciochiccobutacas2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a82f2675d46912b84ff29d50e816c47";
        String preciochiccobutacas3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=608b3bdbba70716515651525bd449a4f";
        String preciochiccobutacas4st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccobutacas1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccobutacas2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccobutacas3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciochiccobutacas4st = metapropoerty4.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccobutacas1.setText(preciochiccobutacas1st);
            preciochiccobutacas2.setText(preciochiccobutacas2st);
            preciochiccobutacas3.setText(preciochiccobutacas3st);
            preciochiccobutacas4.setText(preciochiccobutacas4st);
        }

    }
}
