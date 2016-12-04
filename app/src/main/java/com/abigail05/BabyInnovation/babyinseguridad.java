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

public class babyinseguridad extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnbabyinseguridad1;
    Button btnbabyinseguridad2;
    Button btnbabyinseguridad3;
    TextView preciobabyinseguridad1;
    TextView preciobabyinseguridad2;
    TextView preciobabyinseguridad3;
    ImageView babyinseguridad1;
    String urlbabyinseguridad1 = "https://lh3.googleusercontent.com/9rp616C5Sv4vPZHysWxIRYvBQ8k9TYrgIEJN6OOp3tQjgRbCDrxRSxWl5UT5ZcoN8YLMw7kgiUVukoTydxDBmHNdjtkO30CaoLi8SDeKw0J01ty3eoJ5rYL329yDn7fu32r7KXZkMihRvOm383fCWfqZYvdmsR8yV2WvzAMoHCEWDhLdTrpQ_nXiyW7QZ89CBb7Cp9AuHGrVEvQn6A9HeJiyESY_XAi9nU-wJHqY3JL7N_Sk5UUhOL0wOD6j-P-vCWZZj00iMJDF-Dsn9eTKE46NNDKIrwIDP3vslIz5FYsjulj5WGnR4kd4q1wJhiumXnytBz3YI1Za37jEcmDkuYIY6IGT6KD5ayePR1_e01Sx4_okDdcdVLO9d6guQTKY1pQ21AThg7F7YS-g3H9mEbPnxYQ7LdG5kl_-QlUNE-diXxNf7ktNKZiplBK7C1D4z6PqPS6ZACNxeY66gxAOUmVDJh58_MPxxlNxke9y5dkxOExYXx-fOHTQTM4Hi96Ir30jrl0UUkumdVPjMCq-av_zfl4r11q9tGMh-2-0np_VikfHs2bSMRdpC9_h4zo09xQne-eSfLyGJDn-JAcE3MU8uzQB0_NQsa5De13zkIOnkb5wJQ=s320-no";
    ImageView babyinseguridad2;
    String urlbabyinseguridad2 = "https://lh3.googleusercontent.com/tv9oREAGGe2AwyJSvzG1BEEioBMMDlZfcsj6HVOfVFMCUSF7MN1kVKcvlHOj2J2wPvND8yPExGl4agjp7cPpAUEm_cifSn_c6UzaRAVb8rydO9Vg4QCTFbRoiHNf7Y_FYG1vfAjJS2zti_Ts2IkozfpnPWrZ1Hj_Qtz7kRnBlio3kfEU0Rw3z1-tBhd9R34ir-SqVUpEhqzD9ZPpCSCV_H9OlQu0n8oWO8ILrIBKRS2wxH9glKbvDDi4Ok-SYR0K33x1F4m32MH5K-hrXkazPyQDhr46wt0QZ7DlrbjMkUTmTAeColqtRiin8arRg-SDC45_1IGR2hiTRmdTFLhXQpxbnGgoUKuEFdP02_KxFvSG1MbG4l9u2ZaUeg4-FCI1lOsASbB9wGfGztKE3H5R4XSUeJl9X9K_oHpqxODpYT7r4Ap1Yt65L1K_SDDMwDkFE5wqPl7h1gxGW0VC6ILyvgA3JBnU1NQWHwFNnTLN3i-6Ooy86JwcB3hudK87y10JtCw_SQ8IvjtdabgYNbbB3mKG_4wfjJUbAWO3CDdTlWciAflMyhMh5l2ondBgg4vrQ_GdM3nGBseDtwHq4rgAgvNvgCMUUAIIwrB9JhWmaJFsja6XDQ=s320-no";
    ImageView babyinseguridad3;
    String urlbabyinseguridad3 = "https://lh3.googleusercontent.com/UPo9pFMIJ0sErZ9PMT0mX9BgK6SgqLeN-sl4YY8EkX11M2ZZ7boKut0JurOm4tyQI32SZxuJLCw0X0f4GimERLUEkoRY3YG8sRw9GkFUXknkrOp7dD-K8v9NHZhk7tdjmEgWbM_82gmU026nXXHRJcKZMsgvakqsWQAMXi8ODEoySZWpfjk4i3uJEY1vWl_mPnAQ_OFZ2QmD8Ab6FPjk0ynoPnBslTiN495tU3a5zKyEsVfXeyqUFbaCzE_zqFRRA8Y0MoHQ99YGR7eqOIwXWwbIdSJKNpIm-uL-EGHtTofjydLeV98y8Otm-5roIxOXkt0BJA_LlFpXblKps4cSA_Ax4tMamKeD-fgqpXqUVNJprLyWEwYG4MyrnuAbGLodQbVCBOl9d4V48dIpBn6QgAwWGxpQVo7vmLO96hjskKwlhshWQ1WFHSsLssU5fgc0BSoL9iZzGc1JZ3735YZWKolpbWCjBVjaw0iXX4-EOBCcE2Exny7jxFf3bteeOVQT8kCZpxiNBOwsFoei1pHbGKd7CYtUwNODx7GpiELa7oTWFSebv6vvQMFAdQFG37QjvEd34PDNRl9X1b-arMhLqkKDw6K4xAIqgcUFGin0wuHoeEHgMA=s320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinseguridad);

        new preciobabyinseguridadAsync().execute();

        preciobabyinseguridad1 = (TextView)findViewById(R.id.preciobabyinseguridad1);
        preciobabyinseguridad2 = (TextView)findViewById(R.id.preciobabyinseguridad2);
        preciobabyinseguridad3 = (TextView)findViewById(R.id.preciobabyinseguridad3);

        babyinseguridad1 = (ImageView)findViewById(R.id.babyinseguridad1);
        Picasso.with(this).load(urlbabyinseguridad1).into(babyinseguridad1);

        babyinseguridad2 = (ImageView)findViewById(R.id.babyinseguridad2);
        Picasso.with(this).load(urlbabyinseguridad2).into(babyinseguridad2);

        babyinseguridad3 = (ImageView)findViewById(R.id.babyinseguridad3);
        Picasso.with(this).load(urlbabyinseguridad3).into(babyinseguridad3);

        btnbabyinseguridad1 = (Button)findViewById(R.id.btnbabyinseguridad1);
        btnbabyinseguridad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinseguridad1 = new Intent(babyinseguridad.this, babyinseguridad1.class);
                startActivity(btnbabyinseguridad1);
            }
        });

        btnbabyinseguridad2 = (Button)findViewById(R.id.btnbabyinseguridad2);
        btnbabyinseguridad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinseguridad2 = new Intent(babyinseguridad.this, babyinseguridad2.class);
                startActivity(btnbabyinseguridad2);
            }
        });

        btnbabyinseguridad3 = (Button)findViewById(R.id.btnbabyinseguridad3);
        btnbabyinseguridad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabyinseguridad3 = new Intent(babyinseguridad.this, babyinseguridad3.class);
                startActivity(btnbabyinseguridad3);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinseguridad.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinseguridad.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciobabyinseguridadAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=450419c68c767c0cd8a057af5205e1e6";
        String preciobabyinseguridad1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf4e2e6109567e5904b81813c595fe82";
        String preciobabyinseguridad2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7e63a92406afbb6fb668df60adf9967c";
        String preciobabyinseguridad3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciobabyinseguridad1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciobabyinseguridad2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciobabyinseguridad3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciobabyinseguridad1.setText(preciobabyinseguridad1st);
            preciobabyinseguridad2.setText(preciobabyinseguridad2st);
            preciobabyinseguridad3.setText(preciobabyinseguridad3st);
        }

    }
}
