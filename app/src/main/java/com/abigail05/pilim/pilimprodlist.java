package com.abigail05.pilim;

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

public class pilimprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    ImageView pilim1;
    String urlpilim1 = "https://lh3.googleusercontent.com/hqtoV3EVr8wjVKB3YLvmA1k-QfmdWTWhrVD-ukEunBx_KTxZ-j-2zpIz1AwdziXyjFqA7E8X9aKDngMvEyOEZ1q0AFw8OLgC4XCWqdJx48TJbRdlOyfyOLVQziwGKXx2KeL9ymUUpZ66EkFJhmQncKfm9YNrWZWKxBMTJp_9zcJR5iauGZue22nIS6SFeQOmmLiAxz7b8BaEnFD37belOev3jtQ5GbysZnH5uqEvCh3OdVyA3HvPL8gzk408bwuRC-QIoppRKTp1RSIlW6fc13yjOXEJnoxfLgETu13WIF48Ne1c9b_ECnHG57xzGlB0TZq250TovCdcPs8HAXHZDB25GbjxG8DwEZjkTQQyADB2WuXKsAb2sOVJDa_7FTvkh5k5ES1EOmJiVIFya9zF1iCk850wcADX44-sMEYUWAmsOWgrg8IxbUPZFCDqXOM24nHSbp5SmMvVXxo_KLhB4K7BjSYAPtnEzIpZluewOjqbWXdRgilHCkYLi5uwgZ1ZeMuWBitv2Pj_KgDcBL__j3BfApEFldAmZfWSsRfCSVy1GgFPh-saejzItlnqEiv4cHMU5LV0sR8S5E92LnESd0LauLvr1Nbk52sdIY3EVpJt_Vp9hQ=w402-h296-no";
    ImageView pilim2;
    String urlpilim2 = "https://lh3.googleusercontent.com/wfM_F43ccHd5K3_oy41urV8wcb1R0O1r9m_5n8YPd32D9JeigN7xSa12v67IR40iEFBjlIH7tyDzDl-VeVZB5vFCkFoU5cEgt-VRuE7ohUj_TShm7vQ9g47kk_GbGgOoCHFnM3FVAPyMpufa6pvqIJOD_QjSsC8kxjnJmMQE8WAA8adErT1XxXe15y9iaGIFW5BF6EIYJaEuzxGS96GUHcpd7TaRW_V3MiD3tfePGgy9z2J9R7N2pWxL42ViQkW5vwphkMTvGsePJrXIJoYJ7dSQRvKT3tViFw0-uY6Z3uEKFWXNTMETb899DM30G8jORKH06C9HvVuhJu-c1TpsYXyRZR9kbxrAq4RijSVxXIxFszmwP6Et-WbfezXMRv3Ym47MOqvNQUPN3juC_z_6nHbX7mT6y_XU8_meYfkerhrB442m00KQzOMplvni4g4JeSDPwVRqnNOAhGDPbotr7OqtXrVWaLicTQXMDvABXrFbI1m-gOcfx3Y6SHKPRIz0VoDrLS0M9XVayE4KGhpyQEnYe9YXLh4Ay987XtXnuRyv7juuHEr5M7EcKSBS36BJMfvRIT2Tc42yFdlIqrrBRoHj5Qh2oW9QTBoeX22c_o3CAbQFwg=w296-h324-no";
    ImageView pilim6;
    String urlpilim6 = "https://lh3.googleusercontent.com/UOrMlPYmT0EXKkUrzBGHx5OT0iYyQ59WqcGbE0_v9_hKFyUkqcRDdqi6LNxPlO2GAm0otYODljWOCeSuj_1LHeKGx7wSqS3oL8M9RR7pHLhOo2FeDtJo2TJjxYDbVgJ1wk0gGDzAK2kLtHYl7AXER5lnMVrmWyOWOV8IBSHHJjull9zznbWgqzjI_kJOpVTklPqcUkLadVYj6Jkg3WTqHl5ptrS0dGw_WAq_3Ts0SgMOLz5FLf9AZ1GDjfVe6efKevc0fdokSmrENxdFObdg7io2YW_SjayxVALeI81RLR6NMNCIaKvGBezYwGsJPexiEvZg08VonMn6n19jra1kdsKXiqWFzPRwhUnwE3cBeEaZrCZQZu2axtbXvlbi9oOznEkfYUQQKptrTizYvtwLYybLMra4Z4cLf0TvpYw_DothjWALj1XeRkblJnPEUmTGTq8PyYcfZqE4DZLj3JjZmsrgL22Ky1NEwg75z3Nm-UvdxmOJZl1ZskkE8lILBqsCJY6hJbCq1AAzs_Uvd4sGgsyOwYGaKHvAlYNUfHkVrTpCf2AdmjLs20xz4dwZ_kAFDas9YEtrJBBmnyC1XNaF8CNl3iT68wJ63AeQOEllQXm7Du0b8g=w294-h313-no";
    Button btnpilim1;
    Button btnpilim2;
    Button btnpilim3;
    TextView preciopilim1;
    TextView preciopilim2;
    TextView preciopilim3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilimprodlist);

        new preciopilimAsync().execute();

        btnpilim1 = (Button)findViewById(R.id.btnpilim1);
        btnpilim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnpilim1 = new Intent(pilimprodlist.this, pilim1.class);
                startActivity(btnpilim1);
            }
        });

        btnpilim2 = (Button)findViewById(R.id.btnpilim2);
        btnpilim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent btnpilim2 = new Intent(pilimprodlist.this, com.abigail05.pilim.pilim2.class);
                startActivity(btnpilim2);
            }
        });

        btnpilim3 = (Button)findViewById(R.id.btnpilim3);
        btnpilim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnpilim3 = new Intent(pilimprodlist.this,pilim3.class);
                startActivity(btnpilim3);
            }
        });

        preciopilim1 = (TextView)findViewById(R.id.preciopilim1);
        preciopilim2 = (TextView)findViewById(R.id.preciopilim2);
        preciopilim3 = (TextView)findViewById(R.id.preciopilim3);

        pilim1 = (ImageView)findViewById(R.id.pilim1);
        Picasso.with(this).load(urlpilim1).into(pilim1);

        pilim2 = (ImageView)findViewById(R.id.pilim2);
        Picasso.with(this).load(urlpilim2).into(pilim2);

        pilim6 = (ImageView)findViewById(R.id.pilim6);
        Picasso.with(this).load(urlpilim6).into(pilim6);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(pilimprodlist.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(pilimprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciopilimAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f9b9d9993ff842ef4c9292c5103427a3";
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7988d79ef48ac53ea98c5ab6a6975735";
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dc0ea334c6b659fc062f49c63a67c96c";
        String preciopilim1st;
        String preciopilim2st;
        String preciopilim3st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciopilim1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciopilim2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciopilim3st = metapropoerty3.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciopilim1.setText(preciopilim1st);
            preciopilim2.setText(preciopilim2st);
            preciopilim3.setText(preciopilim3st);
        }

    }

}
