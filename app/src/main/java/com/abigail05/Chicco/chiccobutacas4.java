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

public class chiccobutacas4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    String urlchiccobutacas = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=608b3bdbba70716515651525bd449a4f";
    Button comprarchiccobutacas4;
    TextView chiccobutacas4txtdesc;
    ImageView chiccobutacas1;
    ImageView chiccobutacas2;
    ImageView chiccobutacas3;
    ImageView chiccobutacas4;
    ImageView chiccobutacas5;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    String urlchiccobutacas1 = "https://lh3.googleusercontent.com/pk3igtBDJ7fIWz2havoYmvVvOI6KfZSIK3RVsQuTEBCgCe_joYyzoKbcL27g3Mnj-ml_1FPvYR41bgZdaDMaFHm_ItbyCb2RYCviIvw-zhevIOgcT0N0aGCVjhSI-HjyHFQuPwAoy-yhTmyTJfrxAVMLeGUdOKpc9ahi2tmfBu4_XVAqt_-0kWNWR-GvfhFkQUXwShnGwncAr3HorNhy8SmpDi--vbvNd2VCawz_nu2hULIK8XE7SC7W6jRhKRsE_GRlHk7KgxVxbpKBvNjQvpwvKPwhLw-LmYLDBQW_7_UJsQaRwBaepofkg_AuVphkbtQG9eiskMSZJ22MSG3_V0X9OAAFV6ci7DSgrB9Ty1Ihfo5A30dMgvnk4MOJ73-CytR-h_jKWs7eYQMcL-jrfWbxWuUV_Y-76Z5yh_u0srrpxU3mrB9c2_aDf_WL8d_CGRXPe7F8uOEDkGzs7KngTYET6w0MNqjFZd8XQroa6P7ghoT1krPh6paitt0thMl0JkegPHm2eHN0RzS5KUI2dqqWYedYrTsZW2ot0qMbPmcOmI6dc0F79rpub_-V_gJdjiNeUfvVWxJBdWSgsnBPPU60Zm-MZ1_rYor8NmTQSsBCiUyslEQIKO9COFpVyJXe90_A1SVCJPIwxpjoDArbiqTMvlg-4Uu62QCLtgDXv60=s725-no";
    String urlchiccobutacas2 = "https://lh3.googleusercontent.com/fS-Q26kTMFqPfRB7myXerQowqRiAnjYwjWH4T-8v5aCttewcmRiLAfwb6-B62vLshpjBd4V4EvlFfs03Wpzp525sjEtB1_Eai_oTom8iyTzmbgsCLz0iFa5XE1bcW7czNXUVGHkRgGsa13Rd1BqlqEqbKnTL-pBnBxU5rLvXvwbWHVbvBmrO9fJ7Oizb--sHi2Xc1FfItlsApUeBLaLiaXg-GJ-74Kfcqfj-mpmuXcbjeRnucTTswP0En6UP7DFTSROqqYo7mOKPQ-PLyjwthcEp9mJT_ooUWo-xK-3IA2BBtXjZiHNSQ_W96586V6hjmd9qwSI8_KcZFI_-W0EqeGZq0d5EtySh31-nEjC8ePCOQx6u7M1BETq4Zt6NL6zwjaWo8xc_cOW68SN9c1nvKl1spqjv0Y14EwC1STXHMBzhp1qbco3Td0hNVFggkn_4_u-lm8g5ICYiqJAAaz63LJL5E8rFUmVvmq810-BZV_5l9wlGStBWUuvjZHW5_36NVKWjERNODH5gIQ07LSnoLShYYt5C8CIRlW5y2O3e8JSwmHdE564THKAt6elEN6diz43iC__7_bBPhqAxl_V646UNL9R2ELMVdiNwgYR9LTyno84qEvZhrui4zMIyY7ozgXVKjcZypBQAg0d7ZVv-iQNpQMIugVilg3MdB0DqcW4=s725-no";
    String urlchiccobutacas3 = "https://lh3.googleusercontent.com/vkx28BwSk9sF2Hq3IAM0K-mvyKYQzQY-v6TME9u0SuBvWUBmirCA1A598dOvdvH1LpFIRGXaocKXdN-3uBChj1zLWCYaXTQ13G8bd5GdRnkelxyR2VjMuNb2A5yKFy939WFe_Pgv8fPL-Z-UJK0sueW7TkeQjvEjDp8wH3UZDwmKll5sD0vezdvZwWIfHeA5oQjiyQBb-4P9HRID6pzBa4LPivOZO7CjEV1In5Ch9ZOa2IbFNE_yL8ul1gVua28Gg5Z7nlu1lvnQ-DopLG99Y5gWWAjf5idXqaoOFKzynPj2dW4Seo91OV3PprA7px2SGj3To9o6k6lmo8IMxNJrFKfSjTaPfN1nQZ5m4EMyaWH5bInAI6jbSC9ixyfvSU-odoKMk2m1t2lUTLKJmvkvEo4Mhnfo8IEVvcBF8hHmcD95Eiy03VKMSnUAF1njbTbQARPyq1n4ZL2UPp18Z7t5XBTrx0KKKn03o7vHd7-DhdPFOm02XVwqCUKgY0W24rqOcCfbUfC1gHCCBhKc9-xcJVvR3YUJJarhjaSNF4hLMklrSgmoprAPAmdBZXK7qgMC68lf4xCbesytvttLfZTmA_Xd6aGdaHV-yZCCnFczxtFMsHMRZ-DL7P36LN2qZhenxSBfF8gBi6TNl8oPITjFs_MUkGdoBJGr-C1oFh_l1RU=s725-no";
    String urlchiccobutacas4 = "https://lh3.googleusercontent.com/TmOyuD6wsQACBWM6SXKiH8DBo9tmGYL-CnilP4LsrK95cm6m96-HCpqd9mUQCtPLv3jCuTa0HBJrPqjboHh-hAj5SkGyBHRqECRvVxDc2KUTWKVf9rtP5Co2JoSWUV61-TPXIy8JC4vS_RENPLpJiWnOAS7G9n4453R9iXd_oqH4iqrYPiOtogPVe1pdJqPWBrfdZKCENum_0eG5ODkS3IhtN4K90Yql58OL7hLwMRUzf0yVeXSvlYt_6mYL9MCG83moiUHERhsVDwJTJdShiryIM8e3e1_TJemyisNGnOPQAD2x7ZOqVDHATPU25WaE29A4DW-a6VJRYdEwT61NFIGQBUDodVYUbrmR8-ovcXxJU9GevPcyVkdp8qXQ0ZIgJyrxBfmjHrn3ProxAK8H_6C2R2xjK1XnI7LJUnvDMASpwVmhVUKGKn8bEqiCQ0bSZy5JlDjkpEckVcufFy9Wdi1B8hDYt_pIY_wI48HCdxu_NZCy6YakTnVSrKNHGgb5u-pgswhRRiWoJWnCCRg1_-Cr7dNOE7rW0W8iYz0J2b-eON63mwgi-FXhYNW0sfFVM3ngjFyd3j4o5XrSBsBxvmU2t18gHUfR6qvXtIOh8mVAw2CfIm2zI7LRVn09PfApEVvqbsYUU8Dhk4E2gMf31F7FDjQMZ5fHzxQe8_yo9yE=s725-no";
    String urlchiccobutacas5 = "https://lh3.googleusercontent.com/Thq8MTEPe17O5m0gHWmwthMjfTDSJmKkTqXsMPeftZa15kI2eLtdk8CETSza5KVNobZgE4jD6DEfD5bfYEtDIrRckZP-h5wLsAgEh_rKBWDJFS6QFkYUi50d2G9-FL5anpKYF0GuHRCgZd6vTckUAN7vwxdx7PngKfQ_wWAD9rWJJHfJJD7RU-kByxlu3cWsFEtDQNAtkHJOySKaqGibj8mDfdpSQAnP6Hwo6NjTbEbgMFAW8UMelAIryvyVugkw6VlCykmq3erUbE98yc4cJbiyxdM54w7qbPictFaWsGThoGLrFw5sBTcT-5cK02n4X2ZfNMTtY03oos0Upo7j-TUdqk1x7rwMt8Dqk4Q8aznUdqWq6Yr_oRVAoYD5vBZzBEuFLGTg65QGwx47Kt7B5P8vS9JnUW2NkbZ_7E8lavP1o2LwzmfW2_z-1Q09aJOLYrfcurFu7WS3Pngibxaffq1PRVGMqWL6RUxFEPTG-evylwXU03zMqMei2_iz5PjJxgYPf_DtNqB-TgfTPGo3QH2CYRS47VnNZItV0w0zVTLGMZ8yCiGR0P3P0NQ1CsT4oaj91nwaglmT0_fD7VOcOmEU7B_qZdq0gjQ9FNWa34O1jGDquIf2wvq2wQp0d4sB-_Z3sOCVh-ctEOHQH3FOsBQ4aEjwPQyYY6As3-1ycCs=w741-h401-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccobutacas4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccobutacas4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccobutacas4.this, MainActivity.class);
                startActivity(home);
            }
        });

        chiccobutacas4txtdesc = (TextView)findViewById(R.id.txtchiccobutacas4);
        final String stconsulta = chiccobutacas4txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccobutacas4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });

        comprarchiccobutacas4 = (Button)findViewById(R.id.btncomprachiccobutacas4);
        comprarchiccobutacas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccobutacas4 = new Intent(chiccobutacas4.this, webview.class);
                comprarchiccobutacas4.putExtra("string", urlchiccobutacas);
                startActivity(comprarchiccobutacas4);
            }
        });

        chiccobutacas1 = (ImageView)findViewById(R.id.chiccobutacas1);
        Picasso.with(this).load(urlchiccobutacas1).into(chiccobutacas1);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1.setVisibility(View.VISIBLE);
                chiccobutacas2.setVisibility(View.GONE);
                chiccobutacas3.setVisibility(View.GONE);
                chiccobutacas4.setVisibility(View.GONE);
                chiccobutacas5.setVisibility(View.GONE);
            }
        });

        chiccobutacas2 = (ImageView)findViewById(R.id.chiccobutacas2);
        Picasso.with(this).load(urlchiccobutacas2).into(chiccobutacas2);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1.setVisibility(View.INVISIBLE);
                chiccobutacas2.setVisibility(View.VISIBLE);
                chiccobutacas3.setVisibility(View.GONE);
                chiccobutacas4.setVisibility(View.GONE);
                chiccobutacas5.setVisibility(View.GONE);
            }
        });

        chiccobutacas3 = (ImageView)findViewById(R.id.chiccobutacas3);
        Picasso.with(this).load(urlchiccobutacas3).into(chiccobutacas3);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1.setVisibility(View.INVISIBLE);
                chiccobutacas2.setVisibility(View.GONE);
                chiccobutacas3.setVisibility(View.VISIBLE);
                chiccobutacas4.setVisibility(View.GONE);
                chiccobutacas5.setVisibility(View.GONE);
            }
        });

        chiccobutacas4 = (ImageView)findViewById(R.id.chiccobutacas4);
        Picasso.with(this).load(urlchiccobutacas4).into(chiccobutacas4);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1.setVisibility(View.INVISIBLE);
                chiccobutacas2.setVisibility(View.GONE);
                chiccobutacas3.setVisibility(View.GONE);
                chiccobutacas4.setVisibility(View.VISIBLE);
                chiccobutacas5.setVisibility(View.GONE);
            }
        });

        chiccobutacas5 = (ImageView)findViewById(R.id.chiccobutacas5);
        Picasso.with(this).load(urlchiccobutacas5).into(chiccobutacas5);
        txtmodelo5 = (TextView)findViewById(R.id.modelo5);
        txtmodelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1.setVisibility(View.INVISIBLE);
                chiccobutacas2.setVisibility(View.GONE);
                chiccobutacas3.setVisibility(View.GONE);
                chiccobutacas4.setVisibility(View.GONE);
                chiccobutacas5.setVisibility(View.VISIBLE);
            }
        });

    }
}
