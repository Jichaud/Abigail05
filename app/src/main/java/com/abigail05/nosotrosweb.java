package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class nosotrosweb extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnlista1;
    Button btnlista2;
    Button btnlista3;
    String urlwebpage = "http://abigail05online.wixsite.com/abigail05";
    String urlfacebook = "https://www.facebook.com/ABIGAIL05-289577613434/";
    String urlmlpage = "http://listado.mercadolibre.com.ar/abigail-05";
    ImageView webpageicon;
    ImageView fbicon;
    ImageView mlicon;
    String urlwebpageicon = "https://lh3.googleusercontent.com/GbDySgMM1ZoEZj4LspUr0nxfpPiFlPn2yunAEUpLeC49Mfr5ElY_KNrMn8hbYJ6uMGlhNPuNbfXk1qqjQaqWfEAHrARGd8mdocPHcZNZG9oS4Y8ePaoj0CN7k1D2xgSwIwux1CTeWodof1VbNi3Ktimi4ZEkKwRDyWHii7oRzz5vKDUaF0P1dV1Ev8m5jCvjeZEf2gAhZGjbe-8UpY5Ce6doPBI5gkaI7PFh2PkKHnK_CnjUVwL0OV8kge7_STr9SRltSM3aUYa1teO3ZjFH3H684W21LHZFwxx7o8y9RpruVyLO0k_6WoFNhRxo1SNkpm2bJAYDYkihCgr4SfptpFQNtBHpklQL9DWpULsIgO4ztVkjy2OkVH7j4CzF2nlzEQb_uMdSvH5KvUA6axsFvLR6vcTpfRbsqDtGKwRC2hyOr69-ghKuO80H1NP8mrfcWo1S3OWOH-0oZUqKUfl98hzMIhTooK8q8ZJUI2yX3ir31h-CJW57HgHjOpRT1NET_sxhsOju8NuEGP-z-wWbm8o9-BrJd7U1ZxMqVnYxIgtu55E5RDmfhWzkXHZRldbvdGNPw-arFVb6Av0R-liiO411dI6L0neNWwec_xacFs7IJhhGr-gpvMTJvhGHl6J1rBjnNp0YsRI2Ing9WPcxpfelL84rzTSpWZmD2CAaq1U=s225-no";
    String urlfbicon = "https://lh3.googleusercontent.com/OyCZksH8nOwqRb0okcZZE7FjSZuqAW6P4LDmTeGB0u3UZRwPfI5RowYGTi_VlZnNlZGQbqGlEiVA0wCOOItS4igXHJWo_6Orx1LFuZ4IzO-ekw9bZEWnX5pJab7jIlCsmWUzI5RdD4Rne2zY-e_qUhnAVuY80dt3cMcpCoUak0mHD3H3ZZ5h0Gi9opWkrPWL8bEl4D8DD3WS04YVPdXiEH8-brQeaD5zeGtT8TsXTxTFtrjGrtmqvnbMR3WTMed4OqSGoMfdTMNg0MWiagFe-iuwrY4R9Xo06chxTkvRzaE97n7a9rkquEXp-RuOjSHV_Xhqi1Y8PeJUVuQ9kmTlPI7dbDuFqdtdY0N5f37hQdJ87JyZOoo_mRHDB5isBCo1LEokb5qkrTY_k5XmlXGAcMjO59JKjARG1zdaXT9k5B3w8aExUKzqCKcvlftgs9syTIFMhR1I0wwETHA_KsCJxS3ZLxP2dk_n39laola-OwnFhnFm5HcThjkzGGiHzIRM3dn_dqYItNjuys3d_4-zIN3SBMAJjM1rT7SzP-CUa_t7jBLurg6qMKXfDLuY4uxhrVOTU_xxs5fLivyQQlX0QuQxWy9Ha8VBgIALeh8oN9jTutqb9qb-Hp35eM9MHJy3n36jnOvsJvpWFbaRbG7dNF7b2wMNKwZOacv5hD2HVk4=s200-no";
    String urlmlicon = "https://lh3.googleusercontent.com/VwQFmye6c-77fkxSxDy0-DUg7Q285htGm6CDIltlDePE9UGbJFsBJQNA8EFVyQb8RK6ZCCnXoNqqXZeCi4_DAt2e8-qrFDfNBb8FKWQhnzpnOi2NG5silQb3I-3Hr1bBTV9EjdlBm_wjIoM0IxYrO-pKBqMpvEnNubWClBYEFN3mE5hmHvKbp7dCcZqRO47Sgi_hq8n7G1BSZOD7LbleQSRYccSQyMrJg6YjSig-9LCAyJrR6KY_qaH0qMlk7_nv1j8WTOzHKiRXYUeVHTUdWUFgK2th_hZ8IsPhTl9s4Tra0k3hLSGAp2E3XbbUzlBIZlJ7n4qxUPH74cF8HL0mlbBjZq4tXKJD6R7dP5ERFtXVk7NJJqiV-vTYw_ugSiu_Pz-pFwjvvGLApGSYbv4uqN-Yqe3Zc8x_AW8FjVCIxmjJpVS_3ubOG-6bOCAEy98i_lfLEaEME4Q3f2ZpReFY_uLmOvB_zySMo8K5VBsBkxOBbaJkRiB8aoSvHph-g_p5_Jjx2u1nlcNIizPc09TgO0SUtK634AZsk_mnT45kOmWpSzWOjF-tfVMt1JF7NH3ZimoaFKBZUqaWdLzILYtbG1bQ7tEr3GCvajMBApggTETU8AWk1GCeSJ_NJRj_QwcwYLnP2MUkMiOHLxAy0YrrjoJ6Q62WkJOPn0abk0e4Of8=w362-h139-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nosotrosweb);

        webpageicon = (ImageView)findViewById(R.id.webpageicon);
        Picasso.with(this).load(urlwebpageicon).into(webpageicon);

        fbicon = (ImageView)findViewById(R.id.fbicon);
        Picasso.with(this).load(urlfbicon).into(fbicon);

        mlicon = (ImageView)findViewById(R.id.mlicon);
        Picasso.with(this).load(urlmlicon).into(mlicon);

        btnlista1 = (Button)findViewById(R.id.btnlista1);
        btnlista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista1 = new Intent(nosotrosweb.this,webview.class);
                btnlista1.putExtra("string",urlwebpage);
                startActivity(btnlista1);
            }
        });

        btnlista2 = (Button)findViewById(R.id.btnlista2);
        btnlista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista2 = new Intent(nosotrosweb.this,webview.class);
                btnlista2.putExtra("string", urlfacebook);
                startActivity(btnlista2);
            }
        });

        btnlista3 = (Button)findViewById(R.id.btnlista3);
        btnlista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnlista3 = new Intent(nosotrosweb.this,webview.class);
                btnlista3.putExtra("string", urlmlpage);
                startActivity(btnlista3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nosotrosweb.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nosotrosweb.this, MainActivity.class);
                startActivity(home);
            }
        });

    }
}
