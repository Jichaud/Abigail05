package com.abigail05.Abigail;

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

public class niditos extends AppCompatActivity {

    Button home;
    Button marca;
    TextView precionidito1;
    TextView precionidito2;
    TextView precionidito3;
    ImageView nidito1img;
    String urlnidito1img = "https://lh3.googleusercontent.com/azLfqv-uz03eh61Zt1qjmkLdDzV96CydQ_hXOQrLQ5IiJoFOzG8UD8Mg2Pnfwxel2z7D0N9yrKK1oQAdd0u2JYzSKKPacISWwkwRrxD2kwy3C1KDIxkpCGs-hOw7TZl8OZIjm15o29w1nvCFaO9vJYjZrA7yP3SPp3e76Ga-N4redX3d0anSAlO9wUHfpoxswgvDnIgtlKHRiYBCCp8aBs6QHHyiWbNRLiz2cMEbJWqH8rgGBgu-AnFOJCXqX1K4z1TtHD7rC2tP7qLUmC3Vfh6K83dLZjt3ShbkOutMZD7IanCLMAQJn4xUDRQS6pLWZHgF8YaKulJ8GX7rmLr35mnSAxwsAHQROpQb_jubf-gjBt7j2VSMsWCjWC3TpK76Eh_kcu7gWnfaQvct1dlXZsNYzMhBxqfj-9Cz8iKTfQ60O4GfHgMBcmn2A-MWG5_rTkdDTJD2u5J1C1VtpTyeWLJTIquag-r21oTA1LKzBlX-XoVJnP-S8dpgAN2Xra8HayK5MZEBlNtBKNOVFD0slKXtea_-HT4PJy4oW713_KtINRMFqZ4buBb5r4oNq-h7YxG2ZXz_PsVFcF-7-oz5aoiGPEQZuYsG9V3E9-nkoNfeJ1CWkw=w471-h404-no";
    ImageView nidito2img;
    String urlnidito2img = "https://lh3.googleusercontent.com/6Z1v57Y3l8TLV6_V-7-76fNXf_WV-iOW4n-vG-N_-OVmggx4uDqhjWfELqit0Ss6etZc58wQcwaZWzU1BiWRfsr0nMz6CZbS97tiPoWwJ-9ags3R-KKUlbTI_owGutNpi13Edn6p1GUkxUg6BCnUukO5XuHiKqZff-IRF-VUHokkXwaWcwUD3QOY2hjvyAdam6yZ573hh0-kJ9e3JzVP1S9Oc5UNBgFFVH9UHwtXFlR_-mbVsGb-rMMcdu9dp_FH44bCV7hVm4q5UNuMa2_WYvoj7a3eN3xHdQi6ZBjkPhGlciaBIAXNzdCeI5ms4fz-T_tJQ2OVyknhxmCkz6bLGoIoL-pw_HMcSFbk7Q-51LIIL58k-A5NeQPwknB18jeRpEtl9aYy-4Uew-uZvSkIjfO_AJyMOtKwGlyKAtf5LzZtECgISy8zqK8LKhFPhuf9CaeTzDncS1UFhekaUgoHYrIDBfj08xhg0Q9WJuK7yDNbGg3-qmXLxA04EXvaVbQe8rQ8W9mWLQc-VdPQMBPJRR5uRnsO82y_9B_mt4SN0YOhNXOm7tvnSn52rFoBo3edEC9GUVlZWWsv_b9IYNjhDCpI-u0xf83sSDClY8f1WiLWtCurSQ=w322-h296-no";
    ImageView nidito3img;
    String urlnidito3img = "https://lh3.googleusercontent.com/SCVHgQ2GE5eELeBMQ86Fm-3GYIeVfHo4gZcnwNykzDGnADuUHSTUMoz1BeEe9TqpFSLuRqUBoWIpBm2EZUFX7a16IYWj5b4IMyhWb5u8_mrQ50H_fCQv2m3hJekra--TZGj3CU73hFNw6ZICAdj7V_maSbm7TS6T6ask5d0_Phizhtvyu6gWRkavpahQfsti0eWmnEeHtSq-aUm1RF7M8i_5gKvoPKkiK6Dvl85VrCwL3bUQ2OoorJ7XR_rRmSwij5fAjopvBK7jiZLLMju5FvcvrkKVjC4acZlWoMLJip_1l0trJoBgNcHfgNWwlOWIIrAOE5DC5RPPTt1cBJ5oaQqCULFk_Lz8vgRp4E21ijz7WcWp0qkHffSaATUOiTR4CLJGSIMJSl7T0R2G4BAn7FBdM6RiSR4ykJ7qjUPJUfYznv6RKbQbBonFVlNZsd2_xtdukIqyEHT_sAQdx_kij6LcSmD9JLT_pXB5ly_f_mHV-ItJMMIsr_sRieX-5pwgk94y6vgr3Gsd4NrSxL85gpO7-fjvmUarT1iLTICTN4hcjjoxhWVGcXjwcdpwunZe4t8YzCH0i6VETFu8msOYLSb5AcEWf81imyMeCUPzUe_LH0sgnQ=s541-no";
    Button btncompranidito1;
    Button btnconsultan1;
    TextView nidito1txtdescn1;
    String urlcombon1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=eb68d4b4bf34329b8db92491a6cfed65";
    Switch switch1;
    LinearLayout linearnidito1;
    Button btncompranidito2;
    Button btnconsultan2;
    TextView txtmodelo1n2;
    TextView txtmodelo2n2;
    TextView nidito2txtdesc;
    ImageView imgmodelo1n2;
    ImageView imgmodelo2n2;
    String urlcombon2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1270985443f9cb4b4f4a0b42782c6bb3";
    String urlnidito2imgn2 = "https://lh3.googleusercontent.com/F-4t9Kt3FwzS1sYc6rTCUBjfNY8_a3wmaYRC6FLFQKv5I7-98AbnhjhFVTs3KOlLVn3fgaa0NtmrnIIEBuwuxe_D_v7JMOJ1w3mj0ZFdEtxmHHIedI9F8IWyZiFH0syOvRMPmPhsJ9y2fHUxA5NuC9MtPjzAu-uqRE7RH6LdWPLRzpsLf5Db_uhRJHQG2GOSxPDNge36R050O8OrQA4iFAyu6wf9o0w_4CTDm1f4vzuCF2H1kbDengynacihfuQJjG_lAxHQrXKYtaEDzYERtYYCfXjYtJUn4GS5uqeC2LLIxF34cnonJg3BPshBEHWKCjGMVJx5lfcCxTzk7we0AFVM-3VQLmF_K8U0BHeHverm8G_aoQjjn1M9z1URqW3DhX9lmoipe-1I3HnHazhofIccbxNB4fP3zhSOIPCFgUC3KGmP1192GIecMKTLANoCCiYzSnvYiYU-BAF4-7KndFhL_TBfjR0u_zJJzWomHfN2BRVFB3qLwmpCbgycK0QfaH3XIAC4_iOYO5K1-dEddJSLpmPXMsqrKULsCcnq3aBt3f2mDAIkHvYAUPORNniBg4Ixotz78lT1aqvD5QykIpCtya5K0kGjvepgbbvvY_DBwd00Zg=w742-h541-no";
    Switch switch2;
    LinearLayout linearnidito2;
    Button btncompranidito3;
    Button btnconsultan3;
    TextView txtmodelo1n3;
    TextView txtmodelo2n3;
    TextView nidito3txtdesc;
    ImageView imgmodelo3n3;
    ImageView imgmodelo4n3;
    String urlcombon3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=00adb14c0a2fb5329a19dd28a3d78a6b";
    String urlnidito4imgn3 = "https://lh3.googleusercontent.com/VBvrSY2xaYeQcMceryK-oubCrMfuFnh3HrbqXOofoIfpltJ2Np5FGQnrKAn6yJf7JacE32cxO0qHSPQq8h5S6IR6vhfDjUv8HT2VW_3TqtLZQIfJQS9aAEnEbBXu95RMEhsO-ojutkb0LJpU9sLQ_fxd891gjV95445yNmLIceh6iOLSzsnRz750poqDmjovrqAq8yOxN8UewgLMbwulUuzAww0y8UZkSK5m1lkNQodXO3t2HoCUJR0_YXNrq7vsxj4iCjXKYjZe5dp5GakQlmhVRshmUPu7oIhO8IKABhp6KHDlj7r7ozl1_ogcBeiCY1YcNscw0eui0HJ1gJz-ovaQkzoGQiV7hWLoT9N-p_cWll_m5_l-vd50OrBA7jfGaZZcSSwK8ro3_PD3tLoryEJRP4lzkqwBiCxyK6cd_R0eGwjxDUmmfG6Guhx4RTyFujP336nHNrlQXYJVqt90UNUDQ7z3SLKIVLNPEq9FKLWcgazhtt_KI2LY3eafwXljWa0O3CYda3DaQf489z0wHoT_y9rqjKTDUexAPQ1bNDWA68K3EbHToYUzeBJQCS5mAdqQsp4acuQoYzih9wDw8Sr6QlPCW4XwJj9ZkBVUhee5zUsb5A=s541-no";
    Switch switch3;
    LinearLayout linearnidito3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niditos);

        new precionidito1Async().execute();

        /* nidito 1 */

        nidito1img = (ImageView)findViewById(R.id.nidito1imgn1);
        Picasso.with(this).load(urlnidito1img).into(nidito1img);

        nidito1txtdescn1 = (TextView)findViewById(R.id.nidito1txtdescn1);
        final String stconsultan1 = nidito1txtdescn1.getText().toString();
        btnconsultan1 = (Button)findViewById(R.id.btnconsultan1);
        btnconsultan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultan1 = new Intent(niditos.this,contacto.class);
                btnconsultan1.putExtra("consulta", stconsultan1);
                startActivity(btnconsultan1);
            }
        });

        btncompranidito1 = (Button)findViewById(R.id.btncompranidito1);
        btncompranidito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compranidito1 = new Intent(niditos.this, webview.class);
                compranidito1.putExtra("string", urlcombon1);
                startActivity(compranidito1);
            }
        });

        linearnidito1 = (LinearLayout)findViewById(R.id.linearnidito1);

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()) {
                    linearnidito1.setVisibility(View.VISIBLE);
                } else {
                    linearnidito1.setVisibility(View.GONE);
                }

            }
        });

        /* nidito 2 */

        nidito2txtdesc = (TextView)findViewById(R.id.nidito2txtdescn2);
        final String stconsultan2 = nidito2txtdesc.getText().toString();
        btnconsultan2 = (Button)findViewById(R.id.btnconsultan2);
        btnconsultan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultan2 = new Intent(niditos.this,contacto.class);
                btnconsultan2.putExtra("consulta", stconsultan2);
                startActivity(btnconsultan2);
            }
        });


        btncompranidito2 = (Button)findViewById(R.id.btncompranidito2);
        btncompranidito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compranidito2 = new Intent(niditos.this, webview.class);
                compranidito2.putExtra("string", urlcombon2);
                startActivity(compranidito2);
            }
        });

        txtmodelo1n2 = (TextView)findViewById(R.id.modelo1n2);
        txtmodelo2n2 = (TextView)findViewById(R.id.modelo2n2);
        imgmodelo1n2 = (ImageView)findViewById(R.id.nidito1imgn2);
        Picasso.with(this).load(urlnidito2img).into(imgmodelo1n2);
        imgmodelo2n2 = (ImageView)findViewById(R.id.nidito2imgn2);
        Picasso.with(this).load(urlnidito2imgn2).into(imgmodelo2n2);

        txtmodelo1n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1n2.setVisibility(View.VISIBLE);
                imgmodelo2n2.setVisibility(View.GONE);
            }
        });

        txtmodelo2n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1n2.setVisibility(View.INVISIBLE);
                imgmodelo2n2.setVisibility(View.VISIBLE);
            }
        });

        linearnidito2 = (LinearLayout)findViewById(R.id.linearnidito2);

        switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setChecked(false);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch2.isChecked()) {
                    linearnidito2.setVisibility(View.VISIBLE);
                } else {
                    linearnidito2.setVisibility(View.GONE);
                }

            }
        });

        /* nidito 3 */

        nidito3txtdesc = (TextView)findViewById(R.id.nidito3txtdescn3);
        final String stconsultan3 = nidito3txtdesc.getText().toString();
        btnconsultan3 = (Button)findViewById(R.id.btnconsultan3);
        btnconsultan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultan3 = new Intent(niditos.this,contacto.class);
                btnconsultan3.putExtra("consulta", stconsultan3);
                startActivity(btnconsultan3);
            }
        });


        btncompranidito3 = (Button)findViewById(R.id.btncompranidito3);
        btncompranidito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compranidito3 = new Intent(niditos.this, webview.class);
                compranidito3.putExtra("string", urlcombon3);
                startActivity(compranidito3);
            }
        });

        txtmodelo1n3 = (TextView)findViewById(R.id.modelo1n3);
        txtmodelo2n3 = (TextView)findViewById(R.id.modelo2n3);
        imgmodelo3n3 = (ImageView)findViewById(R.id.nidito3imgn3);
        Picasso.with(this).load(urlnidito3img).into(imgmodelo3n3);
        imgmodelo4n3 = (ImageView)findViewById(R.id.nidito4imgn3);
        Picasso.with(this).load(urlnidito4imgn3).into(imgmodelo4n3);

        txtmodelo1n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo3n3.setVisibility(View.VISIBLE);
                imgmodelo4n3.setVisibility(View.GONE);
            }
        });

        txtmodelo2n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo3n3.setVisibility(View.INVISIBLE);
                imgmodelo4n3.setVisibility(View.VISIBLE);
            }
        });

        linearnidito3 = (LinearLayout)findViewById(R.id.linearnidito3);

        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setChecked(false);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch3.isChecked()) {
                    linearnidito3.setVisibility(View.VISIBLE);
                } else {
                    linearnidito3.setVisibility(View.GONE);
                }

            }
        });

        /* RESTO CÓDIGO */

        precionidito1 = (TextView)findViewById(R.id.precionidito1);
        precionidito2 = (TextView)findViewById(R.id.precionidito2);
        precionidito3 = (TextView)findViewById(R.id.precionidito3);

        nidito1img = (ImageView)findViewById(R.id.nidito1img);
        Picasso.with(this).load(urlnidito1img).into(nidito1img);

        nidito2img = (ImageView)findViewById(R.id.nidito2img);
        Picasso.with(this).load(urlnidito2img).into(nidito2img);

        nidito3img = (ImageView)findViewById(R.id.nidito3img);
        Picasso.with(this).load(urlnidito3img).into(nidito3img);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(niditos.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(niditos.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionidito1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=eb68d4b4bf34329b8db92491a6cfed65";
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1270985443f9cb4b4f4a0b42782c6bb3";
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=00adb14c0a2fb5329a19dd28a3d78a6b";
        String precionidito1st;
        String precionidito2st;
        String precionidito3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionidito1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionidito2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionidito3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionidito1.setText(precionidito1st);
            precionidito2.setText(precionidito2st);
            precionidito3.setText(precionidito3st);
        }

    }

}