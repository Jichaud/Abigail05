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

public class chiccoduotrio extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnchiccoduotrio1;
    Button btnchiccoduotrio2;
    Button btnchiccoduotrio3;
    Button btnchiccoduotrio4;
    Button btnchiccoduotrio5;
    TextView preciochiccoduotrio1;
    TextView preciochiccoduotrio2;
    TextView preciochiccoduotrio3;
    TextView preciochiccoduotrio4;
    TextView preciochiccoduotrio5;
    ImageView chiccoduotrio1;
    String urlchiccoduotrio1 = "https://lh3.googleusercontent.com/5TH1LyOdBkBVjlHhpCAggeT-mCeZw4j2MDbB0sYhwC5K1n-FSjdoG5S4bRPA61pT583WfaKZoqIW7vVWaFILYY16vpj9Wyv4oNGKPFC1Mdg0tdDtjYtkHlDibBE-myUsTrbHI8uT6N77i7KLyJziOuICjXhPP65LkqMptB8sq2FHBvGjwwFW8FbV25az1et7zcUADnxUAk82u0Hmov_XkWFTsNtnHf68AVPrfGaICJrueaCI-sVLka1yNmTnWzb1X_XHABPcEnrbH1gMka67ZilpI2Gau3LxC1PB_3FMtNnSqKqeWmPDvk6lsyWfxC-tbEfJ_zyTeXG8bfx8yJbcV-KqsuCMoram5fN_Gyv4RSkRQFrqOPixZ7olw-dZej79W1Tc-gZ4jPhvvr4V_CZZ0O10JXKiA5LTBzUNK7Ou-HVQq_kuEs2653xIlhp4qF7ErqTubHjh_WuotFFrGPZnioea_VhcJYDEV6RLGjW6El57Q49SHtJhAwNNwkCrHucFQ2ndObTT6T5DXRNXoOniT4337MDNUAhgAsqrOiwwYFTFiP7vpSyBAUGeCU5U1a77ORx5tYq-sJfHuUSiAq9Eajt60JG2dJEHjyeZoxP3jj6Y82gUdO2i7qj74tpQ15qF-jVPlt8nZoM9QkCzj6sRMN6ot6auBjobwLrZx3SuFC0=s725-no";
    ImageView chiccoduotrio2;
    String urlchiccoduotrio2 = "https://lh3.googleusercontent.com/aLCa2bwglHwByQrvQ4HkbTT5UtRQvmGgeZnqorMR49fnXTxVY4-gpkA7Oiqqxh8WLOOuox8yz37qwM-9eNh045pNK_tFrE5ap_nOMC1doqLg1cP96PVdNJ1XS9vh85bPSFGFg80yrqO4Dbp0pSQ4EGtDDWHn5vMQiLBgzzMSM0vOXLKUtydgLw9dBxkUOaf8Nw9mMIVbhGf0c7NXxdq-gb18kNns58aZ-meRZpXsAQ2Oc_-pDH13zdjUGcMWfNgL9EvFJ2uKWrWCRI4RUskIOQEjnnx3gT89uKt3Oy-ueajIenQtcmbLaSEedmz1WhSi-QYYC_C2h-Jpu_672efftaRouM3VfdO7YiUIQyh_30LXufMquQpPKgykbnyjUt755YSHUQZuZ-MTDF22Qdkpm3RAorb6U2tc6CaBQqHs5uG2EKn3fumJYRPKf3EPKXM8IXK6m0cmCvr9kVjf9a1Z2W2DZFYGcrUYnTw-RFbPankNeCAdjmiIKEIqjtPiVYJURKjxPgvOfG_d0FSGcZlBk-EMYnc4_iCaUDIgLEl_svrJ4rC5_RDIFx_khBxoHv5YznZ5DOKSnS9FdKqsXj62Z-WPc-l2CzY6BFEbMoAfVsRx5KU4Ufkoip15atnKLt5HYWBVezDaD1RN3iQ6rLRKMGlGeFMZuzgSpwSxF03xeUo=w725-h726-no";
    ImageView chiccoduotrio3;
    String urlchiccoduotrio3 = "https://lh3.googleusercontent.com/JNuvmCjxnIgtzoLVBO0A2r89g-6Cb0wFcWfcG8uv2a0LD4GCcj5T4RMl6kkGjo9uZSUriyJSoM9EZujHPYQYlEZ3H074ckAU0xnzL87ltCXdBpayRAUweYFqyuYHnRSp3s31n-FfE63XfOvYz9H3yMbpgRDFCYckY4h905jT6S_ueM2FsjRjfoofWCyI4c6rNoXUODOWYxztDFBLvwghxYuujz39e6OlVxjkDZ160HQxl6hsDTJ9xr96mRM9xrvViJ8teyifmFtD0sbIQAln4Dx7ofrSyx5VV-EF1tBlLqOaxSHl6dCXidOuHUcsZ4OZKz06vVnSaGDl3e8_5wqMa0xGGWsegqYf7-DAhkc7wjlXTKlqsjpg8SpxjG3Dj9vGnZKrcSjBzRFZNuH_X6Oy8IFUBbR8_TCKaYNTEPeEI5ivDTGkQlX5_RaiwWJxmJR0ifSS7vYp5C6UoUP7GNXYPXlEfhmJ0wNr5_vPackbAzK_OmoApWkT-qwqj8XrWKYcqg0ipJaNWjO4zQTst-kUvYJwUq_eOk1IIQ3qxmB2vOQGqzVvxfwhMVVFE7O8bAom3tdfad1B-5PaHXvSAD1pe1zWlUrUiZ53gZbLHKkxWE3ndun1KvUCtjf-m3CgiwXSyaciPCOQLJPsolHgT4vm2L7mgJEa9ZaHBFmQgY2TYBU=s725-no";
    ImageView chiccoduotrio4;
    String urlchiccoduotrio4 = "https://lh3.googleusercontent.com/7C5p46FPe0UL5jV0sb5wVPWA8wg1UB_wBpXBFZwYDEijYUDNAertxkzYMAPo08Rkku5Y1KlMbIsPyftIb_TTa7liCPMHzlSLveGNocjVCtROKKP85QqpMspEGsEZagLlRG9XgCFGpBeKDvNMEBc4MSjeDjt6gmPKYc2g_2j_A6AZ44a1o3s9ot1HFFXD3nekCK7Dbv2guo9pycwdaeNGMk5Yp-GdOCi1IqgIbsmyAmwvOAu3uYfgUuzQ1gTZh0jh_y-D1x6Zr4Tu5MB5zXscCJzZAbQw3yjv3rDiu35ccxnmzM-xj7hoy4PWrBUfFUep1FhdLS5N--NQzm2g842eJfZ6nbI-OmXX8ilkPJ2vTT4bqhlgUMw0arx609-lu497j3xfqIwGtF9AmEvnsbi0YW9lizLh4nrwm0vXuvWhkcjU9goRDz7cyeSTymagCOPBfMjHryocJeTuMKvJY2uFjTD9J28q8HUhnweGDBmKze4-q-d_Sl3Z7nn2s4q7r-NcP5b-FoeHxeRAy-bCaK-i-rME9QAhfQWsBxfafDk115OunQFXCNB6D0L_kJsjHbzTnlHyCv1zweLgiD6l8c-YmoQfmAHV50HwgTlK222-luP5r1fHkQc4lV1HMOMqZa2wqYMdB8UcbxZlx6ARZ7rJvLUrRaP4b4sMjeV_DAoRSiM=s726-no";
    ImageView chiccoduotrio5;
    String urlchiccoduotrio5 = "https://lh3.googleusercontent.com/B9gC3XyeDp2w-KYxa4-Qs85d7yOqul2mof8AooY-QTIfTRdk8vtxw1OVj8ujFFvdYEi4du6AQLtrEiETYwUmHtNKGEO_3VbiQ2MiyeNw7BS9riDNpXZi3z_Dzt0-bQwmohU91GuskHfDjotaLrpmam9_vyvwiVnQsWQqzjj7XBM45_CMrf6YENSGsjiolksodx0j7FbOzMnAgmn1ioB1txYWS3jsh9WPQ3JZCIY8uPdrkY0hPUpLGlyXZZ0cgnI0O7EDEfeVjiXky7csdyv89PrYduNvmRr_8foBlNnppRWiTcvhzQufE_vbb8zwPqtzHzMyKK4a4d2OnrZDg5soQFNf9wawP0-hivUpW83Ej6f2W-EM0RtFbY7S49XatHyFhHibAOXBJHQKtthGko6iLrKMWh59kcte6hWQgZbqZk_-4QWncjMrhbccd_PBDD3v0hjIHmVrjbP30qXelJaA-EbD_zMurmD5FlEIYDF5UrTS-1nLIrOpEkQk94EEvgRuGTt54OC94Q4oTB8lks0-YCB8kYD5_rm4KKyUWuwc1epBVtsQj5dLoa0gq8xGFqRiv5GH7HUhZxu3P3XCQWYAK4O6pBMhqZyqW7wnGT-G6gYeSx3DH292AbKjXmI14Gg8o2xO6lAPPzYVeZ_YF_Y2JQwUxCWdREG4cNMVfdo7kfY=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoduotrio);

        new chiccoduotrio.preciochiccoduotrioAsync().execute();

        preciochiccoduotrio1 = (TextView)findViewById(R.id.preciochiccoduotrio1);
        preciochiccoduotrio2 = (TextView)findViewById(R.id.preciochiccoduotrio2);
        preciochiccoduotrio3 = (TextView)findViewById(R.id.preciochiccoduotrio3);
        preciochiccoduotrio4 = (TextView)findViewById(R.id.preciochiccoduotrio4);
        preciochiccoduotrio5 = (TextView)findViewById(R.id.preciochiccoduotrio5);

        chiccoduotrio1 = (ImageView)findViewById(R.id.chiccoduotrio1);
        Picasso.with(this).load(urlchiccoduotrio1).into(chiccoduotrio1);

        chiccoduotrio2 = (ImageView)findViewById(R.id.chiccoduotrio2);
        Picasso.with(this).load(urlchiccoduotrio2).into(chiccoduotrio2);

        chiccoduotrio3 = (ImageView)findViewById(R.id.chiccoduotrio3);
        Picasso.with(this).load(urlchiccoduotrio3).into(chiccoduotrio3);

        chiccoduotrio4 = (ImageView)findViewById(R.id.chiccoduotrio4);
        Picasso.with(this).load(urlchiccoduotrio4).into(chiccoduotrio4);

        chiccoduotrio5 = (ImageView)findViewById(R.id.chiccoduotrio5);
        Picasso.with(this).load(urlchiccoduotrio5).into(chiccoduotrio5);

        btnchiccoduotrio1 = (Button)findViewById(R.id.btnchiccoduotrio1);
        btnchiccoduotrio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoduotrio1 = new Intent(chiccoduotrio.this, chiccoduotrio1.class);
                startActivity(btnchiccoduotrio1);
            }
        });

        btnchiccoduotrio2 = (Button)findViewById(R.id.btnchiccoduotrio2);
        btnchiccoduotrio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoduotrio2 = new Intent(chiccoduotrio.this, chiccoduotrio2.class);
                startActivity(btnchiccoduotrio2);
            }
        });

        btnchiccoduotrio3 = (Button)findViewById(R.id.btnchiccoduotrio3);
        btnchiccoduotrio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoduotrio3 = new Intent(chiccoduotrio.this, chiccoduotrio3.class);
                startActivity(btnchiccoduotrio3);
            }
        });

        btnchiccoduotrio4 = (Button)findViewById(R.id.btnchiccoduotrio4);
        btnchiccoduotrio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoduotrio4 = new Intent(chiccoduotrio.this, chiccoduotrio4.class);
                startActivity(btnchiccoduotrio4);
            }
        });

        btnchiccoduotrio5 = (Button)findViewById(R.id.btnchiccoduotrio5);
        btnchiccoduotrio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoduotrio5 = new Intent(chiccoduotrio.this, chiccoduotrio5.class);
                startActivity(btnchiccoduotrio5);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoduotrio.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoduotrio.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccoduotrioAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=27d8e203c90fcd24ffdf3cb4852b5cde";
        String preciochiccoduotrio1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e29dbdebd15b27b8fc030402d90939b3";
        String preciochiccoduotrio2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=10b707b0fb3a97de75c39d0f2eee046a";
        String preciochiccoduotrio3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=faeb1b3afa9d330cbedc7200a8a47e04";
        String preciochiccoduotrio4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e8e81fea5c048c70273d2af6b24b6437";
        String preciochiccoduotrio5st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccoduotrio1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccoduotrio2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccoduotrio3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciochiccoduotrio4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciochiccoduotrio5st = metapropoerty5.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccoduotrio1.setText(preciochiccoduotrio1st);
            preciochiccoduotrio2.setText(preciochiccoduotrio2st);
            preciochiccoduotrio3.setText(preciochiccoduotrio3st);
            preciochiccoduotrio4.setText(preciochiccoduotrio4st);
            preciochiccoduotrio5.setText(preciochiccoduotrio5st);
        }

    }

}
