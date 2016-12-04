package com.abigail05.NowyBaby;

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

public class nowycoches extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnowycoches1;
    Button btnnowycoches2;
    TextView precionowycoches1;
    TextView precionowycoches2;
    ImageView nowycoches1;
    String urlnowycoches1 = "https://lh3.googleusercontent.com/7MFw1q2awt5ROGslr2NO1UFJsiYal2_05WuBGE8K3Kgyp6mxVzKeOOuL6Q_2-s7tDGDnYHm6o6mhmdGfRORGgqcI4OEzbgiA-fbLu4Jfymbzs_ArYdz2lXLLgImmnkrxQxHvxHNPPcKKwiMO5_pFFKrd2yx7Fh6ZFY3MCYuS5mQsKf_bqjI6OHkake0SHRq46m6nRzoJWdt0G_sDSY8zeVVQJdR89D09AFr0c3lGHu9Ng1kdgBz_xIle5AI6NhRHTtQkJZgSTliCJeGqqN9DD2gjW9dPDiJUqs_KR20mE1yqHZ5hoONb3Wy2CR7Q85gFYaw8d6uoRTtNUds-KRVAqNKI2xn8hEg0OkpLCUoZhOBVg8p51GF6EO977nUM3JdxHsbxBO-NDRCTX4wOGnLzktGMwjqEF7oPd0dV2lTIQxiRbUOBT_3aUhUPa14nSlfWzjS7T_W-TCXUfm6IVrwmaiOXOlNNINGm2h5uNxT1ilv6FK-tiZXiyHjVN99L3ykt5V_py4mJ21cOJmTG0FYCCcmiQLuheEVi5_FpvxYoSDnYTx3d0n1DLD03dMqyFDaW-FqN-d1q691J8s1warG_VIf7I87LaxE24oGyfVXamNGrLuy-1A=w600-h657-no";
    ImageView nowycoches2;
    String urlnowycoches2 = "https://lh3.googleusercontent.com/8qrwjgN13sLvWouJRwDoYgWIWxWFM9lHhJIKde7_X6RIOFGFOPZURKE3ShuJMmKOC1MFyKGF_zxrtGh6Wmz1Kuz3vYJzYTqH7vH7qzKN--V1KSfFhYJigy11kd6XoXxgl3EDuKroOuHQ8qxGVoqX0aA9dTF2LjYQvoI8hs6iIemxXudPZc5TgJB16j8rHJ2taX2wwZSo5tgNZGlbUeX4yy922Zz8fr_xFmNeyFGkFwdq_BNooqN-FfSCzbVhx6L2A_0hv_TupAQY1or8LaO9JImj_r6qTG6lnaqU0zY3DINDNmGF2qCPBCnkLaET8dVR09xAvB1E2Z8tcEzoTey_8Ap8jKR0cS7FspTUyJFf79Y3Db5F1FBfmNeVHhwc7gITgeGWjh38zIO_J1yApio-C5SDQZcxFVS7oigonX3KPNbYfGHVeSjkO7TVWN2V4oAE2cv8uSduXxzwI8XJTEtTlo52NKHcrYZIUoGmjFOHZeJFJNSA-2xdtFg-EH7_KPsfo7teqM8rzixUQ10_rVCoYcwCP_yU261GsPbtgF7ZbHoxj0uQQ6EtCIwelDPY4mkPgIwOwbmHAVDdoLqpxDgJS0iR0U_ykYTqdY0L6ICCaaXayCrnDA=w468-h625-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowycoches);

        new precionowycochesAsync().execute();

        precionowycoches1 = (TextView)findViewById(R.id.precionowycoches1);
        precionowycoches2 = (TextView)findViewById(R.id.precionowycoches2);

        nowycoches1 = (ImageView)findViewById(R.id.nowycoches1);
        Picasso.with(this).load(urlnowycoches1).into(nowycoches1);

        nowycoches2 = (ImageView)findViewById(R.id.nowycoches2);
        Picasso.with(this).load(urlnowycoches2).into(nowycoches2);

        btnnowycoches1 = (Button)findViewById(R.id.btnnowycoches1);
        btnnowycoches1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowycoches1 = new Intent(nowycoches.this, nowycoches1.class);
                startActivity(btnnowycoches1);
            }
        });

        btnnowycoches2 = (Button)findViewById(R.id.btnnowycoches2);
        btnnowycoches2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowycoches2 = new Intent(nowycoches.this, nowycoches2.class);
                startActivity(btnnowycoches2);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowycoches.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowycoches.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionowycochesAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=bd11f498a3cf1f5000c82972764095a1";
        String precionowycoches1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=76e958522cc74cc2e870e4c322b187da";
        String precionowycoches2st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionowycoches1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionowycoches2st = metapropoerty2.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionowycoches1.setText(precionowycoches1st);
            precionowycoches2.setText(precionowycoches2st);
        }

    }
}
