package com.abigail05.Abigail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

public class abiprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnlista1;
    Button btnlista2;
    Button btnlista3;
    Button btnalmohada1;
    Button btnfular1;
    ImageView lista1img;
    String urllista1img = "https://lh3.googleusercontent.com/0PZVM2KAiLotF7nrs-MHjo0F7IAtdclqVzPegR1Hva2PXoQn4mJaH1zoykpqTtF5Wqqw2eaFz41VhGp63-SLObi1U3IxKntfhGxsCeNqul_s37yDLQ-VNhCHrdPvZ1ceQNHCRxqNpx67XLvoSN4H8aMUjqrPF5o41PvdQ5jgYu_97WAruYnzWcHx_P6kUWfdISZKWvFgdAthWrJ4NDr89vhDTarqtYD6l4O91uw1DzbxVgoJAG3iFEYI00Oenixfa7Bx8Yl4EydMmzxk0-EwTqUbm8Tife0gTajaYHPQa-NVBrFbv8qGEXv4H29Xdj8-DeA4cgquQCOsv_xzPMOh6EEp48DbLu2n6mL7MLNeZnAhobXxkiClvjxDcQ9oJ328QxZ7ncKzQO6sjWgl2YKAeGFq9HWApNa1X6_9bYafPVMyXu-M7DdfRcyyE8ALDdbYlJAa1Ys5OT97LfNQK1IVCdkd5nFYM8MpPf1UuctiBGkJEtewdOLzlNg5QP_mPsF1ZgWOhUeaJmhYWIgEXo4yj0QjCSgLCvfAkuwYrrm5GV0knm3YYthDMyyw12yLw2_woZbfadGRGmKmYkP-cOI0dEyur5rxZu7x2cP7fA61ElKk5MLwYg=w571-h591-no";
    ImageView lista2img;
    String urllista2img = "https://lh3.googleusercontent.com/F-4t9Kt3FwzS1sYc6rTCUBjfNY8_a3wmaYRC6FLFQKv5I7-98AbnhjhFVTs3KOlLVn3fgaa0NtmrnIIEBuwuxe_D_v7JMOJ1w3mj0ZFdEtxmHHIedI9F8IWyZiFH0syOvRMPmPhsJ9y2fHUxA5NuC9MtPjzAu-uqRE7RH6LdWPLRzpsLf5Db_uhRJHQG2GOSxPDNge36R050O8OrQA4iFAyu6wf9o0w_4CTDm1f4vzuCF2H1kbDengynacihfuQJjG_lAxHQrXKYtaEDzYERtYYCfXjYtJUn4GS5uqeC2LLIxF34cnonJg3BPshBEHWKCjGMVJx5lfcCxTzk7we0AFVM-3VQLmF_K8U0BHeHverm8G_aoQjjn1M9z1URqW3DhX9lmoipe-1I3HnHazhofIccbxNB4fP3zhSOIPCFgUC3KGmP1192GIecMKTLANoCCiYzSnvYiYU-BAF4-7KndFhL_TBfjR0u_zJJzWomHfN2BRVFB3qLwmpCbgycK0QfaH3XIAC4_iOYO5K1-dEddJSLpmPXMsqrKULsCcnq3aBt3f2mDAIkHvYAUPORNniBg4Ixotz78lT1aqvD5QykIpCtya5K0kGjvepgbbvvY_DBwd00Zg=w742-h541-no";
    ImageView lista3img;
    String urllista3img = "https://lh3.googleusercontent.com/n3KN8Dd58VXVoSxFEo-kgDF_aKfa0RreRfeH2O6mLPyRijPQkiFnKf6IEPtrbG3_VuYAG-H3OCxFdx56reiRlt_-SqEMjDwNQKrWbKGuUGevHWKkGOcxaKdmnYTvVh1tPQ6mDc6UHdaH2mRm8uyo6o999rE-CwZyM3-EL-oZw_fsoiFs2W0fyTHYkvJQ3HblijkV6AzoecuXffrjsfe3aQ2Xh0NM5SZbx7D5K_UMP6dur0QHMj-gqOybVDGymQPL0DR8KMAAR9YvD2E9GSInbvqHzyHCeQFcQfiF9W5LhQNed9IbGCCwZ0RJSsvD25KR5TXEmBFyexte-ZiCmcFilMxkG8bm3mDXnwC2h3MgNyzBcAOBZ_4XYRbZp9ISkgqT0QwVfG1U2HKJVerluI1ffj_iljSX0ZGVznQyuz2IbYGg2ceqsgp38wT9yD2EOzRAhMkc4AYY0G_LmnN7hEky2sawntlCXF4_oXH1rLaZW9sP1wPCncfXjQGj2-QdAo2-fTnIXwfTe0sZ5tma2UAnGEIl7mz0cRJUkjdTqQLqFRQms6pkVi_UB9ghms0GiSRu5Sv86BFvXs9k82oFME0vtUvKZkXf3njpcKGLZ4av14EAnoUZww=s541-no";
    ImageView almohada1;
    String urlalmohada1 = "https://lh3.googleusercontent.com/-hc1nxRgBR8uYR_iWxiaA8HNood97t7sMYf5YmieBMaWDrDI-MU_i943PKWKiWMME0B8V2oj5KRLZUx-aTtDSmYHnR27yqydrXoqeRsVneEm4FT3hkksAvgs9qYVuyfRXfUWBEHQFObEgqD8iIb0S-epETYUahQvjwgYhHJiOMaAM7dt8vDiyHpPGY45W9PJ9zHk7yDSE-ikX-UsTr3WdGzoObUZKbptMZBv1CAAWpev5vyBziPwS3uYfhbl9I9nZXom4qP6w4nFvLsng3yh-E03yziRMw8Oc_sUZfFll1LB6y-rgubJEVd6BagUcDEiYiv-YBrLlnb_n-VsbG3NCZK0IaG80b-8Luv5GnPDMQmZwsnqYFtItVX14AgJhiOb7wK29wM2v_sDA3JvnQ5mGeZ__Vz4k4OfC5EZ2yDOLJJXx4QKg8YuOhy_xqDlJBiTt1LPf0vcXGiqAgVhLmImWzepYTKqCh5uLjRLikUpnfXEMtobJQMjrzicXAoXNE8EL7FOyv6h3gRUwF2T_tC_U9urpQ0AGTzVAUI2wnk0oQkAMvvcHsCd2hTAX4GfK4_3N4_bJ3q-qcR1NpftayetuUmlKH_2XO1vveMKAfdyQWu_RTjLlA=w480-h312-no";
    ImageView fular1;
    String urlfular1 = "https://lh3.googleusercontent.com/4uATwRsq1K6FkkyjXkabmJKX9e2aQ2rYVNSQ2jiRILpd1YvCbVBWNqnl1D3I7pBcTp7t4wwAFBZTdzns-dSxsx4CMrZ99jA-Ep_VwJr4MgfkSvDAO1KCQaQHzCSvUdfIsk6lu4EY2E5hSK3Llb3KruviuFeQPJAXuTtDm4MKWp-rFd3xVHvuZM8_7Jce4To3438o7qsqmCS5XUsOKGw4nYA1A8qtr3VpUJRbq9Tsau9CMZRE_eFtkoAtGR_lxI0ApA-s4800K4Rjh6IAEA0uoXtNopcNO2YOn2OiG-x4H7c8SyvXBE_SL6mYiekdaFgixSTzuGUdYcdEcSZQawf0HylRUQFEeSASkqYgrOCDeGJNMW2qZIIvgJhGaXm9cW-4WXP4GJAziKbfyAWQZKSpostRs4yNj-HL2Hhsx4TczGXAfX95130oTk5iuEcbAp_2h1Nl1UDu67d-xwtMVsYI_8Vrjc4D0bKeynBLkIrt2D8XN3dCJUuKbAmZQICj9t8_drDKiaooa4aK_2rbaN8yH1SgJbtuuIQTNgk70W9t6ACd-0qzYusUOv_kmyP-xqq87SsR2KkHo2z_zU6E3Kx1wQnLDJnKeUDyhTRndBaI6vJz3UdbMg=w480-h312-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abiprodlist);

        lista1img = (ImageView) findViewById(R.id.lista1img);
        Picasso.with(this).load(urllista1img).into(lista1img);

        lista2img = (ImageView) findViewById(R.id.lista2img);
        Picasso.with(this).load(urllista2img).into(lista2img);

        lista3img = (ImageView) findViewById(R.id.lista3img);
        Picasso.with(this).load(urllista3img).into(lista3img);

        almohada1 = (ImageView)findViewById(R.id.almohada1);
        Picasso.with(this).load(urlalmohada1).into(almohada1);

        fular1 = (ImageView)findViewById(R.id.fular1);
        Picasso.with(this).load(urlfular1).into(fular1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(abiprodlist.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(abiprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        btnlista1 = (Button) findViewById(R.id.btnlista1);
        btnlista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista1 = new Intent(abiprodlist.this, almohadones.class);
                startActivity(btnlista1);
            }
        });

        btnlista2 = (Button) findViewById(R.id.btnlista2);
        btnlista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista2 = new Intent(abiprodlist.this, niditos.class);
                startActivity(btnlista2);
            }
        });

        btnlista3 = (Button) findViewById(R.id.btnlista3);
        btnlista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista3 = new Intent(abiprodlist.this, colchon1.class);
                startActivity(btnlista3);
            }
        });

        btnalmohada1 = (Button)findViewById(R.id.btnalmohada1);
        btnalmohada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnalmohada1 = new Intent(abiprodlist.this, almohada1.class);
                startActivity(btnalmohada1);
            }
        });

        btnfular1 = (Button)findViewById(R.id.btnfular1);
        btnfular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnfular1 = new Intent(abiprodlist.this, fular1.class);
                startActivity(btnfular1);
            }
        });

    }

}
