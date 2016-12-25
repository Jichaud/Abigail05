package com.abigail05.Chicco;

import android.content.Intent;
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

public class chiccoultra3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button comprarchiccoultra3;
    String urlchiccoultra = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2778911a16c68c7289b613913db8f9af";
    ImageView chiccoultra3imgrojo;
    ImageView chiccoultra3imgnaranja;
    ImageView chiccoultra3imglila;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView chiccoultra3txtdesc;
    String urlchiccoultra3imgrojo = "https://lh3.googleusercontent.com/3rQAzvvG6FaM5Ofc1mPLuvckTxIITACNQ7ybbUaf_BFZcZmp2tCVXmH8ulbSIh5SW2OJSG-llpc3Xtpq08Dd5v6nUNW1UJkvx5FbLxeK7kM1HB4aqKJ13MsO84xSH2MeD_H3FQmwmp734hgjTe_sSj2iIdKmLRfnHUm6FvTgUerTSDNl6dCryTWMFSn81ye70-l9ou26LkipkufI5N5ZdbcHrzUFTsciZ1uSkWhW94nbr41u8gGXbd2K9DDBDmmv2JKuSZCg04QjKAnfN_-OHZqp1ewj1KxpU6L2fyzrsqlKoKVnbSFws-v4pP38PltzyeMzPUILUrBzI9e1snnd8FZv3G6kEx3xJcHHMo_HKygWWlO5y9W4Svib1JKmA_NeyMSCKYPF3rsQIwq9QtIwhN2U4_4BqpgnQ9B6NNWul52n_gItGDsX2ABLYo86aYyN46-Y3l7rF9-vNCa_kdrGgFEr32_ONBOuekVgskMUYSYn3zJOfvVkmGZLrkYPb-kl5Mncsk4pURVlEPJF1kwip-uU6pOGLexyoTAwIDdBmvm8VsvYVAX7HgU4idcCsVD6mrqjfRGgCjam0bHOAVqBodjXV5zjkv0G2l1MfWey7jhHtrOCIPpjblU27cFzQJZ1qJLlRVZeoxcB2HlskCPscs3diqKn4YWL70WQZgNWFrQ=w393-h578-no";
    String urlchiccoultra3imgnaranja = "https://lh3.googleusercontent.com/fCnipi3yUF8CUTr4pTJpclLQ0Magyteyur9rYe0Id80B1t9xCZNvNaBHgtchJ7693M5UZ21URt1mXL29RZg6t-cq8XggnpYNsET1Q6glGSneqWzPwVWMh8MfWMVmsB4mB0JH2AHs2tn2By7tb1ClMwBFBO8c-3ejBsTWvkiKhc5fMHoxlE7s58asQg1xU60XonoI6sVFiSGpmxOlEKXwv2Ic_Zw25r3dUnXs51Y6pu80QMQWnWPQyPgNchDTub3dmZFI0IJeFlqKrvBxt4NlsXGOReb2QavEnQgPwClimAu4XuQD1CfVrAnuVm-zc_vsxY1Xv8DhdtRJT_xrggIkLhc9X5uqyIkPNnbZWAfNzGlIY21IvXrsDdEMXBnXhUVc7gLAmIxbC9ErN-esIND3AxGZECze-95buWRyUcp9uDLWt6LKA1-GtqOwwYZu0y0Wy24dlHztDG9NL3tfE9r14Bi72ZjVZJmvDroYzdf_-8uCOTnQzCU9i8EOgZ39uCr4FqQ6N7wzfD7PAVpT4CNSLu42C5-XFTbw4DOeUihGdh4HTk4MuZvkXq_uaYc-d-qFtigxSqZrisc9ReosOC6tK1lI6CA0P2NIA6LvAm_dcDPz0ND2wdF1pXi1cwdWajmzzev0ptRzr0rJdM4LuJUROsZqTSl59pXIWNcurOdv87s=s725-no";
    String urlchiccoultra2imglila = "https://lh3.googleusercontent.com/RFyyYzED3DSG6snWd7QQx5aSLfr2-PzAB5VLk0EO345qi0yB7WNGgqZW3X6_1_KHysE0DX-amiPDHnnZj1BxcLSBgnuXLu9pjr3-X2OxiKomJFFHRKHyROFwv7k7u-FybhOcE3E5DL2w70z7xE5heFcLForR_0CzhVoCQcSQV1-4BwibRTwMQISEKRr7_QHQqFBy5NDYa5vZgNAh5UVCwu90lEX79uDU4ZsjdRjfLFfgo-5SsK8q83T56xcY6FQOcZy6UYbFk3n91DAd8NS01e6zuwpzC_cGHwQyrQmcZu0noT93nY5Gh00CewmuxGll_6IACAz2Hu_sDpwX5USYVgOA37OaSkNnaX6UiW1VKYWYS9sTzemUBNh2nMaRozenomDwCf9AahUYJlr0XmgBHHp-TNz0vuTQQ872Us4LApcQhifVbA4F7faSc9hPGI8iUQ_sgKWsV4m_9J-NwmuaeobwN5huqfMwOd8S1HU8r_4yY2l4oqjXq5lw510eB3y6Y-b-LSEiA1PnYunXNwnTZeAj9noIEBAPXJXM9GPJ8O8ysss4eSf8OkiW3jJ52tCpVW1PQCUlH0tkWTuJP_jsDbyLtJ7zvtfMa0H_0yslR5LLVCchjJSYDVAWiWx3Y9WcL7OgIC_YLz0W4fLIdO__cmZ4sSy6ZHAANydI_zgxV3A=s650-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoultra3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoultra3.this,marcas.class);
                startActivity(marca);
            }
        });

        chiccoultra3txtdesc = (TextView)findViewById(R.id.chiccoultra3txtdesc);
        final String stconsulta = chiccoultra3txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoultra3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoultra3.this, MainActivity.class);
                startActivity(home);
            }
        });

        comprarchiccoultra3 = (Button)findViewById(R.id.btncomprachiccoultra3);
        comprarchiccoultra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccoultra3 = new Intent(chiccoultra3.this, webview.class);
                comprarchiccoultra3.putExtra("string", urlchiccoultra);
                startActivity(comprarchiccoultra3);
            }
        });

        chiccoultra3imgrojo = (ImageView)findViewById(R.id.chiccoultra3imgrojo);
        Picasso.with(this).load(urlchiccoultra3imgrojo).into(chiccoultra3imgrojo);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra3imgrojo.setVisibility(View.VISIBLE);
                chiccoultra3imgnaranja.setVisibility(View.GONE);
                chiccoultra3imglila.setVisibility(View.INVISIBLE);
            }
        });

        chiccoultra3imgnaranja = (ImageView)findViewById(R.id.chiccoultra3imgnaranja);
        Picasso.with(this).load(urlchiccoultra3imgnaranja).into(chiccoultra3imgnaranja);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra3imgnaranja.setVisibility(View.VISIBLE);
                chiccoultra3imgrojo.setVisibility(View.INVISIBLE);
                chiccoultra3imglila.setVisibility(View.INVISIBLE);
            }
        });

        chiccoultra3imglila = (ImageView)findViewById(R.id.chiccoultra3imglila);
        Picasso.with(this).load(urlchiccoultra2imglila).into(chiccoultra3imglila);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccoultra3imglila.setVisibility(View.VISIBLE);
                chiccoultra3imgnaranja.setVisibility(View.INVISIBLE);
                chiccoultra3imgrojo.setVisibility(View.INVISIBLE);
            }
        });

    }
}
