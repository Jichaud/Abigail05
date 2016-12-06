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

public class gamisebodyml extends AppCompatActivity {

    Button home;
    Button marca;
    Button btngamisebodyml1;
    Button btngamisebodyml2;
    Button btngamisebodyml3;
    Button btngamisebodyml4;
    TextView preciogamisebodyml1;
    TextView preciogamisebodyml2;
    TextView preciogamisebodyml3;
    TextView preciogamisebodyml4;
    ImageView gamisebodyml1;
    String urlgamisebodyml1 = "https://lh3.googleusercontent.com/_7hxh9DYKZURNMJjO9JgDlcjgjgXc-Ct25koxftQ6dULM4rRge1vQE9LGhyLKgfaFGWv19xsNCZDoL4-PIvkticPemkxfXu1PYjTYw7JAEp8eflQltf9alip_FVeQNYE3z9Jf3Tvkrp4Zei5-1ExZTauyCMjzsKp3jAmeDCFrQYHKsJUJvMnjcJeXHRvW7IYKY1g0XMw89H5eyQTwoiBRccez16jNWSiYQi32qaQXdB6lUmO9HgdrRR3Odg66SVgIlxIdd0p3pqeb_qI7jw9HWVJYfBiSmk5iyGNCXoE3LcY1yXgJSlFlnJw7QbGaqJgnzUEEQJoScMzvSKUdUDJn29Rse4pG-32hqYUtZB_oeqP-1hwPgf3zlhawjAnVGocX7UK-IUCWmYMXDSFgO5VllgMVpe0bQl82HcklFycOeBQU6E05HPXP2KFzzhYabPF1a8hSPVY7IZLiG4wRAUEEC7bS7aXgW3HPEx6NVlz-7hyJiU_0sta4wh1QEkDLHOTMzczxOLIVxR9TBhswynlW0BfPtbx1oLjgWkPkxfoV4mR94af2txJ0cNx-LN1PGbGfyK_E59nbEUs1ANYenvgdNbpn1XI9eb2-40c7Ih4EGfZj_Or373lE7DZ6UXSdNR22nh5XcXDjm-JgDW9XrKHuLy27l5Zbw9LU7Qec_gffP0=w400-h386-no";
    ImageView gamisebodyml2;
    String urlgamisebodyml2 = "https://lh3.googleusercontent.com/FgeX8AVrkNjCo63-guInoPnqpcTBRI6iLU90g89FN0Yx-Ufe4KE837BBwHcK8QbvLLfyrQ-q8sL5b6RAlJZxcgps5AF5et0VGgGwp1OD9w_iJzpWfDjVeyJhP5Iu_G4y1xRKEDkryoLIvwtzCppLBj3LHniNemCEw4cn-OG6cmyCrTE88bvtC8jfPCULc0cAqTWm5XTrWlYTuc8h_4Zqf0ImBQ_hpyo3PnX417bo-r2bvnCpnTQRD8xmCmH8p4qwgrrErSGLF181OViyprNLoIYHN9MFRWilKBnTTxgL2oOymffX6PZLyG7ASOkvI3Pkz_Ji93IpV_9E4VoVj_bvsGs76OH1aTvDO6VoBXtyWk6Argmtuwa1OBz4-t5S2thpXsQ1NYEZZKsJiCuHlGvpTM1rF41mj0y3oRO3Pn8Mqxe1JM0gE0nxWoSdXM8Z9AhMyXNKbFtodc9AhcPYozyixfUIynCqxQiY5fZYtnVI7AGXWQX9dHWZlmetDDcDXDYoV6x46eVQOPWL-_AC3INjwqtF4y11jYOq7jkkVM4VLMl_f8MxMH2DzLYD_8peASLNi83Os8aK91ZTQjLWqMaXzrzGq0imkaN4QXj5eg5VbrGQuHFqc6pHGev0Pz3JQHyRnhD403qmaqbLcm0mhtpD0FHvUDt2qWIdPjKj-4v_4-A=w400-h386-no";
    ImageView gamisebodyml3;
    String urlgamisebodyml3 = "https://lh3.googleusercontent.com/0JgBbSfb4NtfCAO06bi0nznSLB-BSgg52h1NNOb18TphMUFlZnCmextqahqngdEQG_E1IpyyNIGZi8c7Yf0SqTVWclO-qYD368LIoiIFsQSTn3bU_BQXeykDUjf2okILfaHRrMs_itRLkzSR4UcahGZmng5sjfShmkEyR3NoBXFQoVJyCM4CgcqrIVkEGw9pZltnOtknhpqfrmJ4VlyqV6KXnERBcxbGI0j1alO1L8dKNrOMZYjHlBY8OmwjuIBRWmQ9NMEra1z5s16GRpp7gzKzp9a28LSGT5omowv8iuUhksy_fDBfOVvAC2juqzzIR5gxGvDf_xf9oEBQ_zMdD5YlNaY7uL9ggpgdZFr8vIEM4AYGC06L5Ta4NoL_OXyMFbv7voyNSCk1AWz25IMOJGKSupF1UrpSs40IscR2FR9VGu4gjQKWVFZVpwZMC69koltzypRPXQKxL8jeb3XVXVxzniPTk45N3TdXAkzzBk2DaD2YaLLuLU31gg3q0whu2MMKoDcpmbWJzYTpM-ovFML2iY2oCUWNSGTLVHSYepsnihwgEcPvS4_4EHL5dsRlGS2gXiX3ooxdnGAwh3Vct-j2Sv_PDRNn3mCVye3DCvmHTHaQrQ_wz0fTlZckJ3JRi7BBheiMs7WBDdUpZxypulC-lEWN8pMw3TtiPxtymY4=w400-h386-no";
    ImageView gamisebodyml4;
    String urlgamisebodyml4 = "https://lh3.googleusercontent.com/IKJRAv0aO0-jK3hymJmNK6-s4wAR2_k5Dar-wyDy9_PfT1TtX5dVoULiA7AnUBBCDSh1tGUQwo7UP1CwiU5JkdERpb7XB2s9LVmmJWb1bfC6X5GiiqJwr6IqW4nDKrmf23JtlUqCC3yDJEW99_X7B8yF8F54r-moCqiJ5BNn3DXx07qvDyev8vihVUSBL3kJSP54plEFAmjdHN1KHORn0OAkw3X6LdTJ2pYr7lTM96Omyenyo2iPXRBhi6n6vzobxnQNq0yYiGG-Visoun2S_5LSzxcSLK-IXOtAmR0-9Oz1NDuCXUsfksXLS5OL3MQ8hEZqtZ5QQcRRZaZuesdUpfT86l87lu2pIpRCvyKoZXumbodJAckM3zfPg3wNBGoAeL9VkAhtL6Vcp5kxFZdJyjqJfecJIrqkVCMe9LMbtzTmEeYqhEzHmquc18FLUgo54r8IANlAJIpH0jVNaL1sPfSpecA5BRzy510KQfdYlHCnNhG5QWcMy3C3MsC8RjsULGgjohzNbvn9fBedyA4_2_KyO3wpQAPf1b46pCiromdBQg8be44Zn8mZ8H4sS6jQtzuiglWgm9butqg78FXmIXJuOK5N0xmlOJHjA59lG5qxiIRLqKu5cntNd3uT-Pl0fRrOv4z143keaJho2CkKvDXptgAWhBKniP9k2pMeAoY=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodyml);

        new preciogamisebodymlAsync().execute();

        preciogamisebodyml1 = (TextView)findViewById(R.id.preciogamisebodyml1);
        preciogamisebodyml2 = (TextView)findViewById(R.id.preciogamisebodyml2);
        preciogamisebodyml3 = (TextView)findViewById(R.id.preciogamisebodyml3);
        preciogamisebodyml4 = (TextView)findViewById(R.id.preciogamisebodyml4);

        gamisebodyml1 = (ImageView)findViewById(R.id.gamisebodyml1);
        Picasso.with(this).load(urlgamisebodyml1).into(gamisebodyml1);

        gamisebodyml2 = (ImageView)findViewById(R.id.gamisebodyml2);
        Picasso.with(this).load(urlgamisebodyml2).into(gamisebodyml2);

        gamisebodyml3 = (ImageView)findViewById(R.id.gamisebodyml3);
        Picasso.with(this).load(urlgamisebodyml3).into(gamisebodyml3);

        gamisebodyml4 = (ImageView)findViewById(R.id.gamisebodyml4);
        Picasso.with(this).load(urlgamisebodyml4).into(gamisebodyml4);

        btngamisebodyml1 = (Button)findViewById(R.id.btngamisebodyml1);
        btngamisebodyml1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodyml1 = new Intent(gamisebodyml.this, gamisebodyml1.class);
                startActivity(btngamisebodyml1);
            }
        });

        btngamisebodyml2 = (Button)findViewById(R.id.btngamisebodyml2);
        btngamisebodyml2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodyml2 = new Intent(gamisebodyml.this, gamisebodyml2.class);
                startActivity(btngamisebodyml2);
            }
        });

        btngamisebodyml3 = (Button)findViewById(R.id.btngamisebodyml3);
        btngamisebodyml3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodyml3 = new Intent(gamisebodyml.this, gamisebodyml3.class);
                startActivity(btngamisebodyml3);
            }
        });

        btngamisebodyml4 = (Button)findViewById(R.id.btngamisebodyml4);
        btngamisebodyml4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btngamisebodyml4 = new Intent(gamisebodyml.this, gamisebodyml4.class);
                startActivity(btngamisebodyml4);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodyml.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodyml.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciogamisebodymlAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=955c8bd0e3d2bd0084ef7f13af328558";
        String preciogamisebodyml1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=955c8bd0e3d2bd0084ef7f13af328558";
        String preciogamisebodyml2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=955c8bd0e3d2bd0084ef7f13af328558";
        String preciogamisebodyml3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=955c8bd0e3d2bd0084ef7f13af328558";
        String preciogamisebodyml4st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciogamisebodyml1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciogamisebodyml2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciogamisebodyml3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciogamisebodyml4st = metapropoerty4.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciogamisebodyml1.setText(preciogamisebodyml1st);
            preciogamisebodyml2.setText(preciogamisebodyml2st);
            preciogamisebodyml3.setText(preciogamisebodyml3st);
            preciogamisebodyml4.setText(preciogamisebodyml4st);
        }

    }
}
