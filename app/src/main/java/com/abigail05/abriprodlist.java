package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class abriprodlist extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btnlista1;
    Button btnlista2;
    Button btnlista3;
    ImageView lista1img;
    String urllista1img = "https://lh3.googleusercontent.com/0PZVM2KAiLotF7nrs-MHjo0F7IAtdclqVzPegR1Hva2PXoQn4mJaH1zoykpqTtF5Wqqw2eaFz41VhGp63-SLObi1U3IxKntfhGxsCeNqul_s37yDLQ-VNhCHrdPvZ1ceQNHCRxqNpx67XLvoSN4H8aMUjqrPF5o41PvdQ5jgYu_97WAruYnzWcHx_P6kUWfdISZKWvFgdAthWrJ4NDr89vhDTarqtYD6l4O91uw1DzbxVgoJAG3iFEYI00Oenixfa7Bx8Yl4EydMmzxk0-EwTqUbm8Tife0gTajaYHPQa-NVBrFbv8qGEXv4H29Xdj8-DeA4cgquQCOsv_xzPMOh6EEp48DbLu2n6mL7MLNeZnAhobXxkiClvjxDcQ9oJ328QxZ7ncKzQO6sjWgl2YKAeGFq9HWApNa1X6_9bYafPVMyXu-M7DdfRcyyE8ALDdbYlJAa1Ys5OT97LfNQK1IVCdkd5nFYM8MpPf1UuctiBGkJEtewdOLzlNg5QP_mPsF1ZgWOhUeaJmhYWIgEXo4yj0QjCSgLCvfAkuwYrrm5GV0knm3YYthDMyyw12yLw2_woZbfadGRGmKmYkP-cOI0dEyur5rxZu7x2cP7fA61ElKk5MLwYg=w571-h591-no";
    ImageView lista2img;
    String urllista2img = "https://lh3.googleusercontent.com/F-4t9Kt3FwzS1sYc6rTCUBjfNY8_a3wmaYRC6FLFQKv5I7-98AbnhjhFVTs3KOlLVn3fgaa0NtmrnIIEBuwuxe_D_v7JMOJ1w3mj0ZFdEtxmHHIedI9F8IWyZiFH0syOvRMPmPhsJ9y2fHUxA5NuC9MtPjzAu-uqRE7RH6LdWPLRzpsLf5Db_uhRJHQG2GOSxPDNge36R050O8OrQA4iFAyu6wf9o0w_4CTDm1f4vzuCF2H1kbDengynacihfuQJjG_lAxHQrXKYtaEDzYERtYYCfXjYtJUn4GS5uqeC2LLIxF34cnonJg3BPshBEHWKCjGMVJx5lfcCxTzk7we0AFVM-3VQLmF_K8U0BHeHverm8G_aoQjjn1M9z1URqW3DhX9lmoipe-1I3HnHazhofIccbxNB4fP3zhSOIPCFgUC3KGmP1192GIecMKTLANoCCiYzSnvYiYU-BAF4-7KndFhL_TBfjR0u_zJJzWomHfN2BRVFB3qLwmpCbgycK0QfaH3XIAC4_iOYO5K1-dEddJSLpmPXMsqrKULsCcnq3aBt3f2mDAIkHvYAUPORNniBg4Ixotz78lT1aqvD5QykIpCtya5K0kGjvepgbbvvY_DBwd00Zg=w742-h541-no";
    ImageView lista3img;
    String urllista3img = "https://lh3.googleusercontent.com/n3KN8Dd58VXVoSxFEo-kgDF_aKfa0RreRfeH2O6mLPyRijPQkiFnKf6IEPtrbG3_VuYAG-H3OCxFdx56reiRlt_-SqEMjDwNQKrWbKGuUGevHWKkGOcxaKdmnYTvVh1tPQ6mDc6UHdaH2mRm8uyo6o999rE-CwZyM3-EL-oZw_fsoiFs2W0fyTHYkvJQ3HblijkV6AzoecuXffrjsfe3aQ2Xh0NM5SZbx7D5K_UMP6dur0QHMj-gqOybVDGymQPL0DR8KMAAR9YvD2E9GSInbvqHzyHCeQFcQfiF9W5LhQNed9IbGCCwZ0RJSsvD25KR5TXEmBFyexte-ZiCmcFilMxkG8bm3mDXnwC2h3MgNyzBcAOBZ_4XYRbZp9ISkgqT0QwVfG1U2HKJVerluI1ffj_iljSX0ZGVznQyuz2IbYGg2ceqsgp38wT9yD2EOzRAhMkc4AYY0G_LmnN7hEky2sawntlCXF4_oXH1rLaZW9sP1wPCncfXjQGj2-QdAo2-fTnIXwfTe0sZ5tma2UAnGEIl7mz0cRJUkjdTqQLqFRQms6pkVi_UB9ghms0GiSRu5Sv86BFvXs9k82oFME0vtUvKZkXf3njpcKGLZ4av14EAnoUZww=s541-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abriprodlist);

        lista1img = (ImageView)findViewById(R.id.lista1img);
        Picasso.with(this).load(urllista1img).into(lista1img);

        lista2img = (ImageView)findViewById(R.id.lista2img);
        Picasso.with(this).load(urllista2img).into(lista2img);

        lista3img = (ImageView)findViewById(R.id.lista3img);
        Picasso.with(this).load(urllista3img).into(lista3img);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(abriprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        btnlista1 = (Button)findViewById(R.id.btnlista1);
        btnlista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista1 = new Intent(abriprodlist.this, almohadones.class);
                startActivity(btnlista1);
            }
        });

        btnlista2 = (Button)findViewById(R.id.btnlista2);
        btnlista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista2 = new Intent(abriprodlist.this, niditos.class);
                startActivity(btnlista2);
            }
        });

        btnlista3 = (Button)findViewById(R.id.btnlista3);
        btnlista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista3 = new Intent(abriprodlist.this, colchon1.class);
                startActivity(btnlista3);
            }
        });

    }
}
