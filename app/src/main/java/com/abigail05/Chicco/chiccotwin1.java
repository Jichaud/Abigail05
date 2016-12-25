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
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class chiccotwin1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button comprarchiccotwin1;
    Button btnconsulta;
    TextView chiccotwin1txtdesc;
    TextView preciochiccotwin1;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    ImageView imgmodelo1;
    ImageView imgmodelo2;
    ImageView imgmodelo3;
    ImageView imgmodelo4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4148e6a58f4ef779d66dfe97e3f60053";
    String urlchiccotwin4 = "https://lh3.googleusercontent.com/dbuQwpfge31dNOoe9gfMWgGgeO732JWvrw5cKi-39s6G77H4UQUvpB7alKIxJZYPh4WezhvoKJDYFGDdHkoFHUHXT0Ko_ewi5Q21wyEpjGDuFSAdTg4tIp9z6sVhv7HVilS5o-UPWBPs6K5aS9-h_TU21w6tzX5sGrjrWlZ14qofXqNxOPGPCt8jlfU6odZK8tIE7oUprCPgZ_WG7lPzS4c8vLtF_tU2Na3FmZn4WcdIHkGPudv6ueBYU_YqvH5T9oUUFpRukmifG7YO-ZRmMEVPVD7GFWkjh22-OhsA3CiPxTnRvX5InFTo0Y2WPXByR_Cw39NPaDp6wD2-K7KhMCeN1RhLK-QZ-5r12--mk5xGW5t7X9cpla2HGdV2xtNHb_RcXLOPj1H0BxZPm9OGD5trU7I2wQ6CZ_88ZC75rWvdl-alsknqtZuPqcValxyfpctkhgVFVC1BmY-LOzN4RvifFtpdEkb893baM2QpUVqvbjp0xs_-rkt7aK63KY03n6Y_u6q-cHksCQqJ0DVBWaZjJs6jfvhROD-O2b9MfORPBn5U9l4c5dq6S09bbVW96hu01IU3rWyG6QbKYEd2XTBi93x4hSsPAPLogYRa8XYYyahCBnpQacAD11pCVOFfv7oo8h4Kmyd4LwPKf4ehJvNh2LzK8uZLnsjLWXjdQq8=w740-h400-no";
    String urlchiccotwin3 = "https://lh3.googleusercontent.com/CSBkP3-zuN830SlVWP2M9qdZZAhQmpKVXl0lx0S7VS4ipmpNnflf-6GIsuIHOozEOzR6j2ahRYz5FUZC_xc7WcX8ODt-FhSrKfxtEpY-kMFMq8xLFNJAP8c8foDktMqw1eIEgZ65Qyb5PrNHAQCJhXTUnn85zh9gMdcMES0PDTlbMrFxLlazfm1YVHY39LJPqQy0aa5g1a4xpFsvR1eeOcFxzM2VyY4LKH7nqba56Ty-QDrz1_aOlkT278CpRkKQZ8pOKQD6X_LsxAgvwSc_Qx_cxTuUq-pggW_yDGhfcpPEXchov6KUiXXjKV_rVo0ZREN4nMuEH2hloffeMymUsbPdwRqp27QwWfhUjHv4U-P-8kPQIcCJYcYRfArPzHe1lgCvnqnJaOP3LXayoDuCGv1xZThX28tqYdjsfs5H9XTXR4lGgbTpe-yr8s3PF0j-TVEwYqY4-6GZE3DniTQB_u_QtX3iWrO9wXbqxF_Bpxuqasu42G-zg4B2OPOaPwvSOkiNCS3EphqNWrRSKIANcJtzP1-mx4GR6Gh1MZy4_tO9ydINPIu3AFVrgSllFG6rBxiwUtCIZvexabw6NmThocWRSLu41ngWvW2tDDWKH9MxLCMrJ6UqZC5CXtpWcEP6gZYWSPgI5Dkj-wguqwux-rpyLwTxjsGFumrzEbI2pDM=w740-h400-no";
    String urlchiccotwin2 = "https://lh3.googleusercontent.com/G0h1JcB40tSkyi5kz9fqRzSiNZLIvCRzw-cRGSUUZ7s1g0LyYYXI4VdtDZCdqOCKIrxYrjGlFI9wXHSWwRM5jG24bBhe9cG9VkjIZGB_HJLWAoUvq0Wo5qEbrhYooL1twefxHvB3UqcZn0fKEeoBYpqrvApQP3PjBMKhIyJ_zITgaDgyi6-PUKxatoOUvAZIWTL3vJetRg7wu93cHGqsVFSbiI0iPEmMZi96ATr_VBXLcl4IKZxf2qbcQr89p2Ps4sZ8pFRGeJJccVkzyKsewuqeVkA94qA6rF8qsgWqqT5mTjqjImUoJGw_WgJQmmMlNqL138ExKdi1jnJUkN993iuM8r10RKlPQ3m-mbseMNHyIoiv8IVoNY_bDMr_gvvxQIXL9hV030Icd_sWUvuPgOoD9acsPGic4S8PVySP084i-_xqTZWAsgMfSXFx3cHQ3WQfVxZbVGgTjLykILDUKDqyEEaxp74pwlwIJUjfUYo7X9Xm60ytyvaq421CLulnXy5opM0hkk1VWOcsQeuqfJyparvh3zf73TxiBCaYH_xXkeUs3XIEdh8hI3uwlws0OCDqJN3OBRqhPPWJ9GgUQiaGTjxWqfVgZHqiXjc37aJulQpq2Ga-vaBg6NHLOdOiYwmb9OkSW4IEOKnpTIYBqzwxU3tqFHjeg0olrIi4TCc=w740-h400-no";
    String urlchiccotwin1 = "https://lh3.googleusercontent.com/M90hahCRCSuA9EL5m_1MhmyBTBzIYZOMftgENanT8a-u7rDPcYMX-09SmaX-cJk2nbzIRFyB8tS6h7kH_8Io2cUc0qPXiBXMzGKdh5Nidd-4N1RBT1EuuoDJu3welvonIZz5I8ztu38VwG7UTJ4AYe3gUT9G9QvXd9McfzV-gHDsdxcyANTPby0eWQ8IodKw291Ng6DccHHE9c5rJwBIUww-MjogFtIMJPt2MeMZXIcM5RlgFOAkt3Iq8uAedOW4cpXd9rpE64v5X2XEqeqPG0JTxPFFhvDmaKdesCdeCpVS0_Ye7AVnYdoXxLgP3PPsozIL0ndCVXiNHtSM4ObSr-b6OsFfRGvjcV4oRDVIKgeMVMvbE9NMM8_tljCOsOOs1z4EX6V22VhVP1bMVON38pKvxjwLAwTHC1R7TV23uyIt8078KsQ5YeWYHufu_K-I8jWrnSZ89OI7soqnjCsLPrZAOg251miwLI4PG-9yWj5_0-rlooLaVNusdipPLTbVB1wX1LWqFdBc88ptXr9qEl7beHd0CbUpGxopuPeA_qHGNc78LvD43GO3qUEg5j6C_-lu84aY6vpXH4e4IsGPiyjeqEmdAvJpMnMSNaDTEnHeR1zSpww2JgEOVZDtmGeBzYDzH2gH5PIVvsNg7X_1AQNC6FoKZFpdasUPueV4o1s=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccotwin1);

        new chiccotwin1.preciochiccotwin1Async().execute();

        preciochiccotwin1 = (TextView)findViewById(R.id.preciochiccotwin1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccotwin1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccotwin1.this, MainActivity.class);
                startActivity(home);
            }
        });

        chiccotwin1txtdesc = (TextView)findViewById(R.id.chiccotwin1txtdesc);
        final String stconsulta = chiccotwin1txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccotwin1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        comprarchiccotwin1 = (Button)findViewById(R.id.btnchiccotwin1);
        comprarchiccotwin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccotwin1 = new Intent(chiccotwin1.this, webview.class);
                comprarchiccotwin1.putExtra("string", urlcombo);
                startActivity(comprarchiccotwin1);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        imgmodelo1 = (ImageView)findViewById(R.id.chiccotwin1);
        Picasso.with(this).load(urlchiccotwin1).into(imgmodelo1);
        imgmodelo2 = (ImageView)findViewById(R.id.chiccotwin2);
        Picasso.with(this).load(urlchiccotwin2).into(imgmodelo2);
        imgmodelo3 = (ImageView)findViewById(R.id.chiccotwin3);
        Picasso.with(this).load(urlchiccotwin3).into(imgmodelo3);
        imgmodelo4 = (ImageView)findViewById(R.id.chiccotwin4);
        Picasso.with(this).load(urlchiccotwin4).into(imgmodelo4);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.VISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.VISIBLE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.GONE);
            }
        });

        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.VISIBLE);
                imgmodelo4.setVisibility(View.GONE);
            }
        });

        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo1.setVisibility(View.INVISIBLE);
                imgmodelo2.setVisibility(View.GONE);
                imgmodelo3.setVisibility(View.GONE);
                imgmodelo4.setVisibility(View.VISIBLE);
            }
        });

    }

    public class preciochiccotwin1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4148e6a58f4ef779d66dfe97e3f60053";
        String preciochiccotwin1st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccotwin1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccotwin1.setText(preciochiccotwin1st);

        }

    }
}
