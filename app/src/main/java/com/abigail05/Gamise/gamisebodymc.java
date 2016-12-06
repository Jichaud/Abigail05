package com.abigail05.Gamise;

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

public class gamisebodymc extends AppCompatActivity {

    Button home;
    Button marca;
    Button btngamisebodymc1;
    Button btngamisebodymc2;
    Button btngamisebodymc3;
    Button btngamisebodymc4;
    Button btngamisebodymc5;
    Button btngamisebodymc6;
    Button btngamisebodymc7;
    TextView preciogamisebodymc1;
    TextView preciogamisebodymc2;
    TextView preciogamisebodymc3;
    TextView preciogamisebodymc4;
    TextView preciogamisebodymc5;
    TextView preciogamisebodymc6;
    TextView preciogamisebodymc7;
    ImageView gamisebodymc1;
    String urlgamisebodymc1 = "https://lh3.googleusercontent.com/0og556OJpj5YYTOXEaNyUwXGkhNB_15k5hiYxNRgsoQd-8tOV9ojQ0uHg9B4edcICvNhVYkyDagR5pAj6q1IsX18nU8TDvH7ouv9lo3162WCnszhTkqYnScsdIbyLvwng7hfA0eQ_U8QfAC50wKgbRqtvmH1XRAFyQqsPWi5GmhmQ0Lo8OtZyIk2yaUP1F4RYYqK8V2_KFv6GWHRs9nQhFagWPT5d9BMcD9lZKhtxlXwqrH_ogj9nrxhcR21oG04lFmuLDR6YREfYRtUKURqqJCcENAckLfgn8OMKh9bFolDn7mYxiL-aSqcFYirnYsUZYxgMiVtee-o5HTUMIjqGJYez_VkMa80SN0gKAwgVaMuDgug0QLIVUKLNojEqtN7LcWE9FkC2tpH4P7QA2-HZROHHe3OIBDaPBjo4xcV1M6Gs7RuIi6HbfwP2gbEYBKW05FFgai9ooxTbr2mgguYOzFahV2BU2QmT-MkQyo0BnXhU2iQBWJupyObsVCRorkFqu7WtTsJO0O3efPdQEw-OsrO1saTKKfwbbQTpICqMeWIN6y7JXKwj8a5kA0scIf85LDewjxY0VsLsY8nfOCR1m23UYuKGTAXPEhM4t9EDp5TWcOgO9q7L54SU0KV4MCd-KbVm1n_Cs3CzbI-0JrUr-21jXr43seuzoW7BF4XWCE=w400-h386-no";
    ImageView gamisebodymc2;
    String urlgamisebodymc2 = "https://lh3.googleusercontent.com/W3ssHVXSoY4Ej0Vl7YMci4ag-tit8ScxGVac6id4U1k9msvVr5AKD2d7IvvOUegsi50LiwI_KSAiccnb8rKRTGGX6_ufEh085a-GiaF8PdllkmwJ5t88YQeEVi0X1gl24yihyPti0-jkgt7s7fB5mCFoq3Ehj4nTudhZWa3TPq98Kwy-q9wS0AcKnTExu98mgn4IK-QR5TOyN7d0yMqQsITD3fg92UAdZ1xSjfJdJ3bAQIOK6jl0c2HJmqqlGUD9LyBZzX13tiNkZGzRbsAIYxYLrU2S_TvfOI9sM_KN8glvmyK1ud_ZRy65nJprXAPQ8l0VCZz7Ka7tJ8nEzxQIqk7ZVA6OdnipcCT63H2OCQed18ykW--b62Hijos_RYzCFRtpiWquUSOK4L3lXvCLM071wvij8PbK1CiMXHqzYEpG3rXAgMuXR4Owc8gDRblGMgNJfcbvcF6yS2cUCSYq0VQpcUaOIZSfjmCFxwwnWwGj_mgfBWcCFQ_Kzhe7UcUTLOKLDH1uIyM45tLvzHGmHnGq6jn_iCjMCsfpaD_Fe77ORH12HTI8yvO7RKV6J5uV8YynyEs52dPH8zCyXmbZdWcP3MlQUKjHPQPQw1P4T4-M-XlbcARmX7_bcj_YBLt32Hg9_n6FGV-gm0zH4UqZVJX8qP8dfQA_bE8-szWTlY8=w400-h386-no";
    ImageView gamisebodymc3;
    String urlgamisebodymc3 = "https://lh3.googleusercontent.com/6DJOD0ELeH69mi_ZbOEOmYPVd5QMIcqc6mWxE4CC-PFgDEdAiqo93ompo_k6RkwAOohxc2m3cJDFkJ2R0sbDb75IZ1NnbF0i61FEWKa6LDIUmEIXyD2t4l6FTc-EYkfqCCzkoWN_X0eJdkrughVjQRftae_0VSWS5zwBt3MmixzaEy--TgGR4AGLk3Ven24YjjU9dAO_lFi36rNGz2DLBVdm_dVZqgrz1txpJfc5JD39W8unDhc_WWvCZ7x-COt-BiSy6uLWXwAHYgGeZ8WS3Ftm3iyDPZgQfdC1lcbwfgWAJAu5-M0rhN2cTsj_y00R_k1_gSfe6NAmmbyoD0asEE46Ei7lkIlajtWaPlQtRrUZeArUwrr0Ov0055wg838OS03uKV43vfN5NWpsAICIXKmg8Sp49aj2gTJp0UPO250ebypDhkAI3eJWHZS7ZAqnVRXcfCle4cA2I8vqpo7xBzGPG4C7SW9LEjupHn4gUgLWfPN_4aos1pW1NwJJzR-vlsvwGf8S2-Q7RszCxiZojbuJm0ziZuMydEK4EPxwXq4ykMATgp3YkWJu2pnWuf8iSTO10XToIUrfPgOkjsOCAaCksHWDq3k20SkCXHpNcT5uxKYp-DB9i_MrIfuYj8ctaE18-4CzKxnsqipCMp3VPeEwRDiQraiGttABxBr_lyk=w400-h386-no";
    ImageView gamisebodymc4;
    String urlgamisebodymc4 = "https://lh3.googleusercontent.com/9tcXWuNzjJpSNBhGyVRMoi-qvtVAU_ETXi5JfQPOdydCGneijgIZMX_YMl1AtFN5FdATyceMXBReH_AAnYcqZZJruT4PHUV48bvKmalkpCD2XRrMJhRULpNnUrf-11xWA1g18Mu8L-ogWZQltIwio0nMQ0S1dUNZkBpHfhoxWMKFUlrJdTxUFnG8_5VFA3QZ_zVqf2vGDa66yKn08zBv0XyX-bB_PNPfEtqznH7TLkfN9i4YtqpMQsOtzU0yFvlMiP1vTV-PohN8E30Ydmz7ORW3vojrVtAe3q_UnSdHNDzC04nTLpWErBl4isC9lbvcxEwvhphI4ns0wM-oGQ31RArq-YFiDDxCvp8JnpRucZ3jAq9J_eoh-Cf_zB29ukMd1jz7qy_l8IKvLOAwiFhIC3fwCckpjgCs3eNzzi7En107GvDJmiYND1p_b2NIIyq-v9IIyLTnv-ekjolZI5EM4Pt9sqcR2MDRRVF_xj_8tvSoHMy0l1e2wk10WnV1E3B3zrxMHoom0jZdhLiSDBctth8vxiDDS9zbLSuRuYnISseOtEVsRkiss7Lz_y4VhdHt1IcQYk0eK68zxphgggi7g2OGa04xtZDylwsBjcff2-NKzW5hqtPsrF69EuBHmRV4aTmtw27rQEDRANp4XYNjjadNneBNt4LO-RE_nlmh9os=w400-h386-no";
    ImageView gamisebodymc5;
    String urlgamisebodymc5 = "https://lh3.googleusercontent.com/mXzCesPhlmJ8sjY0tTZdro8uBzsvLZnfA4J7KFtCgP0kgdTrBsxxmfKXdvBEJulZFnwJWIKnTwCppF6n9djbGu2LzCW2SpT0GqUmtUgv9f9_B-Hfz8Ow_LhSt5_zqhaqqY5XRx0yairbctua8gsTW5a6kLR4Valabx9Ha_Mjxy2En5T1KqSS783FJ6apiUxRdWHGMJj_Exa539jgFo2enLrytVfLsc_NzcaS24tPNpdLL2mMGjbATG8_9qDiYo7nyS2Mn3wf05xgHV28ZvMR1K7UROcHGpf_cLhunMo5J8kxLlq9ddJOliVY-bITyfoWZjRrjGcDY4TOEnbamKurc_LHFrSYCYzotgQOqTZa4Z24rwFhyZSt0GLlV0b0XYkVODlF4z72YGiu4SUIpX1DXzlc-ue81_VmDDbaQq_Ervp570oOgHvFNt7FGaVTQgR8SuGu-1DE5ai7p3fAkGBIz3_dH0kifkKHUBDRFNedTrauP1xwogZc_0Hn18lqdOEl6Hk7KB2JfyV3GRn1T5qNLky5KRUs43rEIFIpKpna7Pjvh13R9sjwuy_hp809ZnN30EXROgmKsn8bsYulJ48-2-kgZxgggwWwJPyASSeFApuDMA7_k0uvNuaxonZ0WeTjyTQ3F4TZtepQt9uqudKIaufJPhoai4EgsKkZ85Qgq0U=w400-h386-no";
    ImageView gamisebodymc6;
    String urlgamisebodymc6 = "https://lh3.googleusercontent.com/vQRg0jzNqK4knMmQt-f_DRDfbWZBz_-03mS1A9da0YJva_vkkRZLjQ5WHDEPssyVthjNDbkypaCvDmAfVNOGqZ_HH9Rcuk-19_skImQ9ZbGquqxrGeU-X94CsqNavIkx3sRu8LIE9bslps_1C6i40Vf7D8VxqOpHsB6L7syZdX2bPvlMEVEnWTJQwj_6dk0BN-DCDJmbYpTTMBGsn5-crbfKxWzhjC968FBpJGXKrz4LhqhRrZSebTMpw9_I_ATAnmNK6A4do51mIHQ3bAHvlwc86TEjuuTMcIkxmXkh696l5tbN-xco1bb9_6xMgly4Wc_h7sB_uWy5VLjz1vvXD7uEKv_kmn8WjuDW6Nb16Ftyp6FJ-mLGGqIaKvZ769UAq6_dMlxb7eHlH-9nvxqdyHQqQllYqSLV8Z0NCMY6sQgc7iPjPa4esAMTc5bAnJ8XR6tN5vUzrNwSd_2-GkH0ONpIE-fDwmuXxXFV6UYJt5Qy_FkexqAXo5LsdDqim1dw8qsP-ipuS--75QiBs2cRGetEPl6k-FPqylXAPNceyt4lmtpcw_REuIXH9FraqpUvxKnyqjOBM2x6XeTNAPF101pn6FTdaQRNOnWkwDTh9BvsY0aGjRWe6BxfmOo6ScbNar1JtbzpP6Ja8PWNA6qPgB7bAIvxNIN7J4x6i-uXPo8=w400-h386-no";
    ImageView gamisebodymc7;
    String urlgamisebodymc7 = "https://lh3.googleusercontent.com/A_bkLDR48SoawavyDx_FCmO-DQmIqDKJZU8q7gTK6pXf3xIrezQ3bNS_tYiwFUTc44rhMzqQvFfQEGagP1pCEAfvi6RnFBTObb6MnMBTDYvZNpXdsDyuFWpEnMWnVatbVf_NM29SFC2ynFu5fu8uH8DRufoog5PazmrEDxDqEb4HcL9Zpr7N2Qni_mlMkTZUD5BwUBXEMs_ujaA3NB7pqCy2cO_x3Q_QDKd2lg6x8XQ7sqmR4FZthSGLN9tIEFvdCgv8178FjwmgqHanWs_1l9RfaJCW3LZvVOqkEj71SW1623uKeeoSOuyM282_rZ9S_X6bpg_wV4sjthn_QMcc3bcRSxbS8vfV-XbGBQwBitKsE6wb3byfzVBVctQnOWEZmPZTNCmxX1F8u7eryitYey-wX0EaCPi4reLzRXAaYoyNB99c9fdiW11pD3oRv_9IHs7Bq3ACq_AzFsqQKI1rx9OICWpSzUb6bwAwpwZcesHR9AQVLbYGBcAuv42Kp1G4xld84NVN-mM1P-BzJZlsvZVkNy9VO9wKg1QbNJzEs4wXrQqJ5Mkpde7uow9NuCmOBoW1lc583dMEGPg0JXvA1LHLza05-Cv3NIcPQCMX-1Nx6ZYb1GjCL3L_S4Hhl0ldjCHqpdvsiNluncuqrjCq5h3FBTi_MOpVTtjp8_QAcO4=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodymc);

        new preciogamisebodymcAsync().execute();

        preciogamisebodymc1 = (TextView)findViewById(R.id.preciogamisebodymc1);
        preciogamisebodymc2 = (TextView)findViewById(R.id.preciogamisebodymc2);
        preciogamisebodymc3 = (TextView)findViewById(R.id.preciogamisebodymc3);
        preciogamisebodymc4 = (TextView)findViewById(R.id.preciogamisebodymc4);
        preciogamisebodymc5 = (TextView)findViewById(R.id.preciogamisebodymc5);
        preciogamisebodymc6 = (TextView)findViewById(R.id.preciogamisebodymc6);
        preciogamisebodymc7 = (TextView)findViewById(R.id.preciogamisebodymc7);

        gamisebodymc1 = (ImageView)findViewById(R.id.gamisebodymc1);
        Picasso.with(this).load(urlgamisebodymc1).into(gamisebodymc1);

        gamisebodymc2 = (ImageView)findViewById(R.id.gamisebodymc2);
        Picasso.with(this).load(urlgamisebodymc2).into(gamisebodymc2);

        gamisebodymc3 = (ImageView)findViewById(R.id.gamisebodymc3);
        Picasso.with(this).load(urlgamisebodymc3).into(gamisebodymc3);

        gamisebodymc4 = (ImageView)findViewById(R.id.gamisebodymc4);
        Picasso.with(this).load(urlgamisebodymc4).into(gamisebodymc4);

        gamisebodymc5 = (ImageView)findViewById(R.id.gamisebodymc5);
        Picasso.with(this).load(urlgamisebodymc5).into(gamisebodymc5);

        gamisebodymc6 = (ImageView)findViewById(R.id.gamisebodymc6);
        Picasso.with(this).load(urlgamisebodymc6).into(gamisebodymc6);

        gamisebodymc7 = (ImageView)findViewById(R.id.gamisebodymc7);
        Picasso.with(this).load(urlgamisebodymc7).into(gamisebodymc7);

        btngamisebodymc1 = (Button)findViewById(R.id.btngamisebodymc1);
        btngamisebodymc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodymc1 = new Intent(gamisebodymc.this, gamisebodymc1.class);
                startActivity(btngamisebodymc1);
            }
        });

        btngamisebodymc2 = (Button)findViewById(R.id.btngamisebodymc2);
        btngamisebodymc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodymc2 = new Intent(gamisebodymc.this, gamisebodymc2.class);
                startActivity(btngamisebodymc2);
            }
        });

        btngamisebodymc3 = (Button)findViewById(R.id.btngamisebodymc3);
        btngamisebodymc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodymc3 = new Intent(gamisebodymc.this, gamisebodymc3.class);
                startActivity(btngamisebodymc3);
            }
        });

        btngamisebodymc4 = (Button)findViewById(R.id.btngamisebodymc4);
        btngamisebodymc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodymc4 = new Intent(gamisebodymc.this, gamisebodymc4.class);
                startActivity(btngamisebodymc4);
            }
        });

        btngamisebodymc5 = (Button)findViewById(R.id.btngamisebodymc5);
        btngamisebodymc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodymc5 = new Intent(gamisebodymc.this, gamisebodymc5.class);
                startActivity(btngamisebodymc5);
            }
        });

        btngamisebodymc6 = (Button)findViewById(R.id.btngamisebodymc6);
        btngamisebodymc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodymc6 = new Intent(gamisebodymc.this, gamisebodymc6.class);
                startActivity(btngamisebodymc6);
            }
        });

        btngamisebodymc7 = (Button)findViewById(R.id.btngamisebodymc7);
        btngamisebodymc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodymc7 = new Intent(gamisebodymc.this, gamisebodymc7.class);
                startActivity(btngamisebodymc7);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodymc.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodymc.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciogamisebodymcAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
        String preciogamisebodymc1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
        String preciogamisebodymc2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
        String preciogamisebodymc3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
        String preciogamisebodymc4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
        String preciogamisebodymc5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
        String preciogamisebodymc6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5d31999ac270c7a861e43e2db2498875";
        String preciogamisebodymc7st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciogamisebodymc1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciogamisebodymc2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciogamisebodymc3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciogamisebodymc4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciogamisebodymc5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciogamisebodymc6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciogamisebodymc7st = metapropoerty7.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciogamisebodymc1.setText(preciogamisebodymc1st);
            preciogamisebodymc2.setText(preciogamisebodymc2st);
            preciogamisebodymc3.setText(preciogamisebodymc3st);
            preciogamisebodymc4.setText(preciogamisebodymc4st);
            preciogamisebodymc5.setText(preciogamisebodymc5st);
            preciogamisebodymc6.setText(preciogamisebodymc6st);
            preciogamisebodymc7.setText(preciogamisebodymc7st);
        }

    }
}
