package com.abigail05.BabyInnovation;

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

public class babyinvarios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnbabyinvarios1;
    Button btnbabyinvarios2;
    Button btnbabyinvarios3;
    Button btnbabyinvarios4;
    Button btnbabyinvarios5;
    Button btnbabyinvarios6;
    Button btnbabyinvarios7;
    Button btnbabyinvarios8;
    TextView preciobabyinvarios1;
    TextView preciobabyinvarios2;
    TextView preciobabyinvarios3;
    TextView preciobabyinvarios4;
    TextView preciobabyinvarios5;
    TextView preciobabyinvarios6;
    TextView preciobabyinvarios7;
    TextView preciobabyinvarios8;
    ImageView babyinvarios1;
    String urlbabyinvarios1 = "https://lh3.googleusercontent.com/HvTg0DcFJ7PaI5HpK1ZzYSn-BYuQXvVsMmnKU0rSoVLxS2DlLWYL0HSOIGFc9u3p1TQrjtxdlO6x9SyrnXYJKSx4-OzgTWWuZ2m9dg7D4nG7RWpbv4yM9ux4cxOiKzd8xPf__8H6XjvJmCdqwEP7YR2Yro3G2EYgjRGBv1IX9BQys0PtRueBL2xdmv6zrYPMTrR4x7ujYlZvSfIwkA0ydpYI3eQK9xUXZSht4dLKJH3l4HglFj3F9CvKzs7ssf7cebmpOp_pL01Wde6vIAvL5ph_cjsNqx8jep7P-Xy2Es6_YVplu5RgKiuCHa6ACeBQYdSXitczDmW2rmCf8K3PVgfSwBqGpRQCVXjjkrSoGin70-L3A6gO7hbf7PrexpHb80amjT8jbc3cW0I1yCbyIl1YU9H5-9nl4mRgd3PcdpWbU2RNnhSlffapgeoVAm4Urb-JIAIY69gsECaSVi4P5B_e589HqjtMtc8hykj4k1w5wCjZpK7XZsLIcyX5b36gU5VYdHBYdekdGMoofGuS6nJDnXlE78RNzsifl8camS71nQw-siL0ukzVoFfpq2ZxueodlOpQ3Y9fOuWR0CLy-sqDLh6QdkYYe-z2wdw1NVpkHQSviQ=s320-no";
    ImageView babyinvarios2;
    String urlbabyinvarios2 = "https://lh3.googleusercontent.com/BYFSr-zi7_FIBo8AhABK_opTbtrb6zTANFGWjy7cxICCAmMZXcEET4Rzw7noPPPymxt76gNrVSAkvnMsYwSsxx5CGLTSPnsoP_Yi4jqDzpbEu1NDehPDg5PrdPAZ-MRtFda2vc6rZBEBWCZ1U3rmuFGxKzxf-BW9VkELIT7RAAnvVLz2Ys2USVT5qOSlI1jx5uMc1R7Vp5JsRVdPIHnPXq0hz9towolNH_Z2R3zGJc6XGS8mFwS86y9MzmCYRSOPzfo2WrLWm3FXk0_ZtAxSJl7e0eEt2-rqkCHc6inMcAuQioAL_VWg7OFpbyx69q5kEuCzPLXawTPbxmzMMR4UDj1BScwrvEGRoUiptKrHPkTNVcehPd4Bcb5J0CXDTGDOaTB-v6X599rsbUlF3ItwrEq9KdJM6_vR8inzHcIqy-DLw-M3w60cA0KFQ_S7AaQPcIvAtG5GFbgPrOPjYHbxe7psItA8HyECo3e25-8ayoTTfKiiXyBb3p4buz0CKwdkCsEvpcTQXavtnBcXdB840HdJajNlW7i5iSRuGvgtLu-w3DOPCsjytNLRi1pl43PjghrG52hWRQ0h0guWiNeBLy5c8UPjNuhBKnv1Mz86ukXG3TelKw=s320-no";
    ImageView babyinvarios3;
    String urlbabyinvarios3 = "https://lh3.googleusercontent.com/0HYmWPGbEQQgdFuQlSZbLoYS97bD8NExw7v67Oe9GEQWRUKOsRbXYimTEdlw2fQ3eW1uE-_BItc1bOdABlTv-MW-qSOpLAKa-yo9mp5HAV1CD7MJ3eXSK0WyYH2WPaOtyxFPaQX4gbD8zbckSRmSgXU3TzVK41lAPnWyig7c1quqpSh0H0zsJ_645rS2q2y-wyfi8HjdP_DOcibOj_eQjdafJbSGKFKRX08b7J3O79XGq4k7lfpLcJMEJyVjoW0q_bYKGnwlYXb3bi8LE3WHIdIqUtmNGVee5vuiMewv4ilLAqIAkZuisD5LlxPavQa9jhFlxjVMep1n1x-so17nPo-6E1QSK0HPG1FmEE7U5EwzZdQpbQW4CIJMA6w9lKJR3x05mW2T7A_6h8ItTE957kUHjpFoqQWZNa3nNXM4WkUlLGNrXZ_fJ2dYKeyM1ZoPNY8kTpcckKUvwJxnoTkEr2QWDk-16A87iok4msbtWA-apP_F0t5f9OGwteBY1kcLXOufMjbUnVBBPLzpAsZZxwVDUkV38wf5ZyErmBdJTjjTxKbrbrAbUFiTJ7quh2Zq1L2F4_O61SdGdc-xDnYRcPTw-KdJo0VGXOamAjuFw3kZS25gzg=s320-no";
    ImageView babyinvarios4;
    String urlbabyinvarios4 = "https://lh3.googleusercontent.com/K-l6ft7PnTSenjdZM-iQwatmRRGIg-gp_elW3ZXU4rGCKvtT-OY8jd-aK8WpLgRMmX-pUX1-EZOtTvcnEJkm50MsAazdhSZ0hCKSBohsCvWXS_akv0aOT9u1c1q98SOuPd3g4uC9seN8_3oZHNrl_GOh5ZIg3FwFXK0jflK78sapcT2qWRYjfaE2xqqk6zmvNuzDHJ1bcDrmCBDr66wYShu6rqWEt1VlczlqQZJe9Ffd4Xftrlfh2CF_5A4q07ag3Y4AVybXbSiic8lBBi0T-QyUgKztLMdBo05pb5Oris7shAMKCKF9v8dqtAmXPLqRI2UnwZAUNlOyqxgFCtlfxW0QyzFgWp67Bfq4jnmgkxeSwg_iYM6_DAgRR9RYEQV0IzkvS4tqf8CCvRdTUTM9Slc3k2UhmlRAC9nh9hjVK0GxYSNk5qoHNY7DGzySHq9mapTS1m12MicNbTGgBQYcrCreCv4yirKMAVEJzXs1RsOfIXIPd6jHMDg_9I3xcJ4MmUG0n9X1ybJ2VaU0EGOJR9EYUcuytsNqDKg6LTcGN1FaAC_FR2c1FJKH6QqBYmSe1TU93nn2XvLhiZBKKt8UfT1iT5Sh-gx3GL2k7h69dyFt8riu6Q=s320-no";
    ImageView babyinvarios5;
    String urlbabyinvarios5 = "https://lh3.googleusercontent.com/hEXUYG_3elL8pp2M9pMO2OhdlRyRiu_e2Awp3NtwW_swYJQEDzI8fLCYJSUdTdbRYtME_1Z37w_8HoMkD9fNW9ymdZIp8sR4kAVKhcEgo2GCGPxMpD8fa8-v_ZUpbsXqgQIQ7QVo7Sl_dR7bNB1ljYnH5Y4mu-skTlunHJFmvYulGWa5CzB52HmIkcR8YCnEE68b6SCPDpkTJ-u8amvkPSEDjFLg5MBTQ6S_NhhY6woJ1sB_Kh78OmMdq57wklouFi3O_mO0h29Y2E6kCiXsOXzz1Quvd7X4GUO_FZLhcaqb5r_8SxJ48IuxEZOOaDlXxbiKp64VeWJTxzTNAy0b8Wfxx0ej4ulUaj42Q-qofEl0Hm1PDUt9FLfk6YAM_ecAhpJSCsiUq74mxes_XSh2MG11BwjoiWfTTJx78u_F9FQM7n_l5NhQCFojjK28rX1JQQ_iVAB1NiQ1WV0p0skwEDRBj4ifXWTyAK4nNqAUfh0oWkhTvtMqjRcUOmXz_LRKjmYb1Z3gm2QC7TXeaNhEkc8ajSAW4AHs6uTZiDO6zF3T4qQ257z4R1bwKGexe9XSMzShyAPF6qC4bdEXtex-ODo4jp3hnVe4X8_VE_UoEUFSk9mUWg=s320-no";
    ImageView babyinvarios6;
    String urlbabyinvarios6 = "https://lh3.googleusercontent.com/ANel_Nm0SR9N3plRxpcVFBpFNjkv_Hd6LLavwWVptuFaDznBkkSVsniL5nSy8oO5F3Vfk8s_zWk1bXSuHaoM7rRPOFj4q6UqA0oXADqvwv6TC9W3gwQdDSeYA8oDR6DYYbRqvmXQxt_X4m2gyTkLlFEGjM3iRRT7YbUHHJ1NYKhkkb1G9TMynpfgFbC7I30ivHBdYpDCBeKxxSFmj1OiqDsDOvx6Qligt9matZ6ZLjHu225yt2uyx1y8STbSid_b1JwXwx1ps3af1W0He4jfuQ7bnJROuaq5ZivYsZBGNl6EFyS7wPLbPUkF_u2YCg4C7PEXRgM7RkuCWNMYgzakVHX2GTKlypjWVFi5Ys_SJrOkLOBnnLyc-kUaJHv84RjsEhX7_sicUyO_bvYL_1RFlacvFndUbpP6RPJwWON7nyZSKm-PiLUbnZIsy-8STALOqAkWaWFrFoosJt1QF3cqS_HluEjfI_btS85FnYidjr04rMNTKoTyZ-cwwM1b46XQp8ATpFBGjTq_SdOF6qXxfinKudW8XBX08iDAj8wWzIqCING3lc_M68TFBCjJfgEi4w9yX7ytZ7SxDFNKcpH47TXhqOB97-ift7E-i3QXq__MS4z1iw=s320-no";
    ImageView babyinvarios7;
    String urlbabyinvarios7 = "https://lh3.googleusercontent.com/4NTrFP0YoYIEB9PNjyMz8jWpE6LiNLyBMobqFKPQk6cfCt3vBC9f2w8zKegL1XplcQZmnxE1_Etw-cmLRbuRz8jkMnZ1JTgP5Q9CELYnW9XvCoAFw-FH77RnbEh9nyU5y7W_xCMz3iee7q2ZvaP8bwgzjPSEhFc3Ei6XeT3UUAfmgYTq_zkrqltxzXXBb4xVCuXGnkZEzZ0GT08QB7z-l1FdlOEfASDdGAj8sSWGYH5DGiN3awXgNxrMxv6wNzR8dck4KNT4kYVN38MqvuiPtzgWhCDyIKUfqiHeX_HAQpfdSq2YeO-smNYK0gwuZLrg28uKvBaNXcjGJJbVTCoNLR4OORh0uBOOWuxCfPCygPvZFXizmP2Z6aSHeZ3-acZzLuMtNLAoopjlQ2-HB81UoBvewXRHfoUbXMAWrCtzEHtcPMFRt6E8FnC7ktUkt1-uq0ABO8sVhMfhh4n_1LiZb2Xum9bCf8XCoMdqJ-tW-0RFKIBsDPl6IY_qyk1Ehs18B27iBi7QILA2dtS7a7WJCrbbB8_FhpCr-ZBzxDjOPitb2slukaxGlgkWLiWCbhZr4Tpgoxo5NJiuT7s-W8m1ft59B50aioKd2UipcgU3eojYkXwVHw=s320-no";
    ImageView babyinvarios8;
    String urlbabyinvarios8 = "https://lh3.googleusercontent.com/r1qY_F7WeY7jY-75I_G25XnslvAcd6-SmJvgk4gaF3sBcsNSdt2O9QEj3wjZxSKrY5jOcvKno1HhtkvbuoW6VaBnBxMd8gVpBYA_4Q56VzEDVz5wBDwFwAouVDTsA1yTo2oHo3LAxGR5B-7bEbYbx425V5ZehfxtMNjBlZ76VlDCNsomkd3DYwae2GzbIIWP5IXFS-4Bs0OvnBggkH5d5eQShgnMBPnVOSGV58PGU2zFZWrihMnlTQVh_jOci6YZRW7G6YWqi_KuIcUYxsj1oSDxswQU2iMHt0jzSmwJ8o2PXqxvzcnWIP-ja9X_6MTGeRmn6UXOCFs5KgjKJ-LXypKrvmj7NyAA_nR3pN_eKNbL5CCF0-vP-cTpM1tAwholEY4j4ioxMXT52h1nhub4_hrqJgid-TMiHNjnsGsiPr0StqCJTE1lkOqGQvV6_VvNwv_4yR_fg4BVmufnTTVd585pYxIeBN3OxmcENrIDaRJ8U0p2f64gmqxhxdH_2oF4w57S0Mub4GMqY4tsNNS-zWRkwPSPt4YG785mzC0kdTg19xkDcF7Y1mV8QX0CUQw2a7F8bLSvrg_jqe3LOmlTXerGqBZRLDFjQyGr3pjSu2GUwYZedg=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios);

        new preciobabyinvariosAsync().execute();

        preciobabyinvarios1 = (TextView)findViewById(R.id.preciobabyinvarios1);
        preciobabyinvarios2 = (TextView)findViewById(R.id.preciobabyinvarios2);
        preciobabyinvarios3 = (TextView)findViewById(R.id.preciobabyinvarios3);
        preciobabyinvarios4 = (TextView)findViewById(R.id.preciobabyinvarios4);
        preciobabyinvarios5 = (TextView)findViewById(R.id.preciobabyinvarios5);
        preciobabyinvarios6 = (TextView)findViewById(R.id.preciobabyinvarios6);
        preciobabyinvarios7 = (TextView)findViewById(R.id.preciobabyinvarios7);
        preciobabyinvarios8 = (TextView)findViewById(R.id.preciobabyinvarios8);

        babyinvarios1 = (ImageView)findViewById(R.id.babyinvarios1);
        Picasso.with(this).load(urlbabyinvarios1).into(babyinvarios1);

        babyinvarios2 = (ImageView)findViewById(R.id.babyinvarios2);
        Picasso.with(this).load(urlbabyinvarios2).into(babyinvarios2);

        babyinvarios3 = (ImageView)findViewById(R.id.babyinvarios3);
        Picasso.with(this).load(urlbabyinvarios3).into(babyinvarios3);

        babyinvarios4 = (ImageView)findViewById(R.id.babyinvarios4);
        Picasso.with(this).load(urlbabyinvarios4).into(babyinvarios4);

        babyinvarios5 = (ImageView)findViewById(R.id.babyinvarios5);
        Picasso.with(this).load(urlbabyinvarios5).into(babyinvarios5);

        babyinvarios6 = (ImageView)findViewById(R.id.babyinvarios6);
        Picasso.with(this).load(urlbabyinvarios6).into(babyinvarios6);

        babyinvarios7 = (ImageView)findViewById(R.id.babyinvarios7);
        Picasso.with(this).load(urlbabyinvarios7).into(babyinvarios7);

        babyinvarios8 = (ImageView)findViewById(R.id.babyinvarios8);
        Picasso.with(this).load(urlbabyinvarios8).into(babyinvarios8);

        btnbabyinvarios1 = (Button)findViewById(R.id.btnbabyinvarios1);
        btnbabyinvarios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios1 = new Intent(babyinvarios.this, babyinvarios1.class);
                startActivity(btnbabyinvarios1);
            }
        });

        btnbabyinvarios2 = (Button)findViewById(R.id.btnbabyinvarios2);
        btnbabyinvarios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios2 = new Intent(babyinvarios.this, babyinvarios2.class);
                startActivity(btnbabyinvarios2);
            }
        });

        btnbabyinvarios3 = (Button)findViewById(R.id.btnbabyinvarios3);
        btnbabyinvarios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios3 = new Intent(babyinvarios.this, babyinvarios3.class);
                startActivity(btnbabyinvarios3);
            }
        });

        btnbabyinvarios4 = (Button)findViewById(R.id.btnbabyinvarios4);
        btnbabyinvarios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios4 = new Intent(babyinvarios.this, babyinvarios4.class);
                startActivity(btnbabyinvarios4);
            }
        });

        btnbabyinvarios5 = (Button)findViewById(R.id.btnbabyinvarios5);
        btnbabyinvarios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios5 = new Intent(babyinvarios.this, babyinvarios5.class);
                startActivity(btnbabyinvarios5);
            }
        });

        btnbabyinvarios6 = (Button)findViewById(R.id.btnbabyinvarios6);
        btnbabyinvarios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios6 = new Intent(babyinvarios.this, babyinvarios6.class);
                startActivity(btnbabyinvarios6);
            }
        });

        btnbabyinvarios7 = (Button)findViewById(R.id.btnbabyinvarios7);
        btnbabyinvarios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios7 = new Intent(babyinvarios.this, babyinvarios7.class);
                startActivity(btnbabyinvarios7);
            }
        });

        btnbabyinvarios8 = (Button)findViewById(R.id.btnbabyinvarios8);
        btnbabyinvarios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinvarios8 = new Intent(babyinvarios.this, babyinvarios8.class);
                startActivity(btnbabyinvarios8);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciobabyinvariosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e1ea2bcef20db1062278cd6e562b932f";
        String preciobabyinvarios1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6712232c5add22599885e180274875a3";
        String preciobabyinvarios2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e110c5ef4782bd1e35deae91197fbef1";
        String preciobabyinvarios3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=07e04dc39d89342dc070888d16c93084";
        String preciobabyinvarios4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=909f5f4179bdcb3a56e5a436ea3607f5";
        String preciobabyinvarios5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e1189278f6a84da84dbf3d4ccdeb353";
        String preciobabyinvarios6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=50080f1de4b9da07946b4def126c79c4";
        String preciobabyinvarios7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e08f4a83bde266f528748f53ad1ba9f3";
        String preciobabyinvarios8st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciobabyinvarios1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciobabyinvarios2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciobabyinvarios3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciobabyinvarios4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciobabyinvarios5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciobabyinvarios6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciobabyinvarios7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciobabyinvarios8st = metapropoerty8.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciobabyinvarios1.setText(preciobabyinvarios1st);
            preciobabyinvarios2.setText(preciobabyinvarios2st);
            preciobabyinvarios3.setText(preciobabyinvarios3st);
            preciobabyinvarios4.setText(preciobabyinvarios4st);
            preciobabyinvarios5.setText(preciobabyinvarios5st);
            preciobabyinvarios6.setText(preciobabyinvarios6st);
            preciobabyinvarios7.setText(preciobabyinvarios7st);
            preciobabyinvarios8.setText(preciobabyinvarios8st);
        }

    }
}
