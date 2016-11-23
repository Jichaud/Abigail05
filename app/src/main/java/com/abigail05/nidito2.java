package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class nidito2 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompranidito2;
    TextView txtmodelo1;
    TextView txtmodelo2;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1270985443f9cb4b4f4a0b42782c6bb3";
    String urlnidito2img = "https://lh3.googleusercontent.com/F-4t9Kt3FwzS1sYc6rTCUBjfNY8_a3wmaYRC6FLFQKv5I7-98AbnhjhFVTs3KOlLVn3fgaa0NtmrnIIEBuwuxe_D_v7JMOJ1w3mj0ZFdEtxmHHIedI9F8IWyZiFH0syOvRMPmPhsJ9y2fHUxA5NuC9MtPjzAu-uqRE7RH6LdWPLRzpsLf5Db_uhRJHQG2GOSxPDNge36R050O8OrQA4iFAyu6wf9o0w_4CTDm1f4vzuCF2H1kbDengynacihfuQJjG_lAxHQrXKYtaEDzYERtYYCfXjYtJUn4GS5uqeC2LLIxF34cnonJg3BPshBEHWKCjGMVJx5lfcCxTzk7we0AFVM-3VQLmF_K8U0BHeHverm8G_aoQjjn1M9z1URqW3DhX9lmoipe-1I3HnHazhofIccbxNB4fP3zhSOIPCFgUC3KGmP1192GIecMKTLANoCCiYzSnvYiYU-BAF4-7KndFhL_TBfjR0u_zJJzWomHfN2BRVFB3qLwmpCbgycK0QfaH3XIAC4_iOYO5K1-dEddJSLpmPXMsqrKULsCcnq3aBt3f2mDAIkHvYAUPORNniBg4Ixotz78lT1aqvD5QykIpCtya5K0kGjvepgbbvvY_DBwd00Zg=w742-h541-no";
    String urlnidito1img = "https://lh3.googleusercontent.com/6Z1v57Y3l8TLV6_V-7-76fNXf_WV-iOW4n-vG-N_-OVmggx4uDqhjWfELqit0Ss6etZc58wQcwaZWzU1BiWRfsr0nMz6CZbS97tiPoWwJ-9ags3R-KKUlbTI_owGutNpi13Edn6p1GUkxUg6BCnUukO5XuHiKqZff-IRF-VUHokkXwaWcwUD3QOY2hjvyAdam6yZ573hh0-kJ9e3JzVP1S9Oc5UNBgFFVH9UHwtXFlR_-mbVsGb-rMMcdu9dp_FH44bCV7hVm4q5UNuMa2_WYvoj7a3eN3xHdQi6ZBjkPhGlciaBIAXNzdCeI5ms4fz-T_tJQ2OVyknhxmCkz6bLGoIoL-pw_HMcSFbk7Q-51LIIL58k-A5NeQPwknB18jeRpEtl9aYy-4Uew-uZvSkIjfO_AJyMOtKwGlyKAtf5LzZtECgISy8zqK8LKhFPhuf9CaeTzDncS1UFhekaUgoHYrIDBfj08xhg0Q9WJuK7yDNbGg3-qmXLxA04EXvaVbQe8rQ8W9mWLQc-VdPQMBPJRR5uRnsO82y_9B_mt4SN0YOhNXOm7tvnSn52rFoBo3edEC9GUVlZWWsv_b9IYNjhDCpI-u0xf83sSDClY8f1WiLWtCurSQ=w322-h296-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nidito2);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nidito2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranidito2 = (Button)findViewById(R.id.btncompranidito2);
        btncompranidito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compranidito2 = new Intent(nidito2.this, webview.class);
                compranidito2.putExtra("string", urlcombo);
                startActivity(compranidito2);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        imgmodelo1 = (ImageView)findViewById(R.id.nidito1img);
        Picasso.with(this).load(urlnidito1img).into(imgmodelo1);
        imgmodelo2 = (ImageView)findViewById(R.id.nidito2img);
        Picasso.with(this).load(urlnidito2img).into(imgmodelo2);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.VISIBLE);
                imgmodelo2.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.VISIBLE);
            }
        });

    }
}
