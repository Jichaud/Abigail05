package com.abigail05.mibes;

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

public class mibesmoises extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnmibesmoises1;
    Button btnmibesmoises2;
    Button btnmibesmoises3;
    Button btnmibesmoises4;
    Button btnmibesmoises5;
    Button btnmibesmoises6;
    Button btnmibesmoises7;
    Button btnmibesmoises8;
    Button btnmibesmoises9;
    TextView preciomibesmoises1;
    TextView preciomibesmoises2;
    TextView preciomibesmoises3;
    TextView preciomibesmoises4;
    TextView preciomibesmoises5;
    TextView preciomibesmoises6;
    TextView preciomibesmoises7;
    TextView preciomibesmoises8;
    TextView preciomibesmoises9;
    ImageView mibesmoises1;
    String urlmibesmoises1 = "https://lh3.googleusercontent.com/qWj54wp2luJNnfGVnbN3Ea_F6of1OIRO5s1CxTMcLChcQiZI3i4g5BBq8yb-M9xn2XBA5UwHdE0mS1tfbaSzXdPLDKT7EX3gtCr8cocZ5cb5mR12CaDzRCrmirVOSyvTotgc51hPTmxk0Jraf-jWUHrINqdAjQueTpPEGXFBHN6yS7hdpmdc5NEa8PlRq85WsF8Dh3nqabggBvNhl96OKfjA2VoCiUk3TXatMaGwSvquF2ogd0o5ecHsXE65o7PDAvsUUThFOaA6qURhXXg9HXjB05zj5kKRQVEcOSycpkkcA8Zw9MOtp_35WY5x-njKPBCCpUlylYNsyKy9IBYLJw216_WPCTa03c65zziJAXCx5fQ84Dqsk4RsRKkp5Iai3XNxQGkNVJleCuZFUrCnq37DB2fQEfJqwD1Y90Ij6i34bgZz6XQBfADP8jlfMci25pdTH0UgbkAmSrbHf6jKMMum9xjHuHqBbw_TdydiBYtFhJZXEGUz75dD4Y9a-ATv6GlskVz088ZC_nIoGN4Ik1qnl11129NRd69J4ObRPHDW9woBrTx9eUcnpS8sB876DWZK6bUeAHIW-92GnS6tvjOoH5i_tW840_STnNvgvs67s3TXbZBfoNnSTKlbd2DWCtY6qZT1JxT9Cl9Z8mWmoS9VdOVXpso2yC1J_iBjmwM=w967-h725-no";
    ImageView mibesmoises2;
    String urlmibesmoises2 = "https://lh3.googleusercontent.com/h87aghRBciKowOCik6HiGAxOrnoCbJ6CFvX7APsJmzBRryhkoQ0fCQ-CoJJhl_Drd5xAApNmjejiVh1Cbz-yWJmS9qfcxt8cI_neuE1qsIBHyOKfcw2sf4yuMcYDnHvCC9AZJ9WVbOd2RFcBetxtwM-c-iWCdPR5v6kUjiP4newOol9t7plTndgyGSaUxP3vb16zl-QAn4SaO2iblRhSRMv6-qghj7vQ1n_x3OZi0eGajPJ2Jg5y-77MnyUT2H86Ljt_7C-x4K2FohFWD1ilF75AN3e4dQLU2rSshdN7oRTGX7c92flNmHFdEHBInGozUE6OMaKVhMfjzqAX8ziNMlAEOMLZ_4TAsqY-Ssbg60YnDZdcBKsX34MrnaBkKGHCt2Hloyzp3Jfz1FMfGag0ZDErcElGs_62AHhYdZOepkIIV9ibPncZ_1z7kXT-AgBWr0gDtzrxG7RMVPjntNfmCZOyHaj25p8O9fI7iuCj2sTFH3FfYapx5Oi0ctwIOtutN0vKIOcAeU-eljL0gBPDl8RKByCrBrLDAh_6WwMCWQrDuelBXa8VREb4SJF8LiCaFBhSxRRwfGqX0kCGZnBBMGjnAM3Ga9Dul6woFeAtTRybmRqAiFPyk-v6VPTN_7b_Dv7cY9HFk54YYJ0Ue8U7SDAQjk8rUpCasybLG18gAkw=w967-h725-no";
    ImageView mibesmoises3;
    String urlmibesmoises3 = "https://lh3.googleusercontent.com/aq21D-UFzk1z1PGqC-TiL7RZ4tepTi3caP3D_5O9NqKNhNEyIR2l-WAxoudXaL41nPSFL-w6SAAs3JY5XUv9o1LmnV7S1EiReMnG1XuW6Ov5IJP1Dciqxur67YH0IGnsLHzNBPHlZA_pK-9IotpMdKaccnGvA6BOJF-F8UAS6Etn29Bd25dTkHu_gHoV5zJNdNuEL230OA8wY9EXwwWHCjhCGoER3d94hJ8ySI5QEunCsoUI1Mx8VGPjPxc8FKbi-g3Ka9vpIjwPrfgBK24U20nvM9CNPGthYdh4N1ty5Y1TQAFpgyJhGYnr7bfHyfF8GtCezJ1JNN0braWLEw-6fCrgF4MwBFTmeZLlpChyGmoSdQTRutXp3Pn1SP3yHrMssGXt5mmRL-6L5_Zn8A_qnRHF_4HOm1dwpy-n8xIUmuMVaO6tQ5nA_XCCRA3jt7zJOgeS8TZDG4wklMc3VKJR29GdyLSHprHBZQtvjKjA2dmKJpKOyMXgjkPcEKAbbqxlb8uyvUHkWMYnKRkuZfx9M9x29O_A2DqB-f8NXRFH8BNax6ZjI4bbkYyJGF_5yLMMSsHrcpQNyp4SzXvTFowsIG-4UWXwHLOVF2vJoprCYfgKitFZvOPiGq_4q0j6ifp6rqr315TigQCtBf-enkFCaR2bmkwI3Q9YbsceCZk_9so=w967-h725-no";
    ImageView mibesmoises4;
    String urlmibesmoises4 = "https://lh3.googleusercontent.com/uaj-lGeOP3YelLdselPgaVFYOgyZ7R6Xrp1ZaOz8locucX_A1PB0rqTE_2KXdVAB_rnHRxYdPRR_Sqq-ukNXQktgu1Bl69-mN2_zid06ttqTMCyqopEVYFYA1P2wkl80aEGZHGOwd4sCEA7RDHNnzcikaOyEEYQQ5TzwO_EH9WP6nxit9JYZV1-NVQMgq2olaZl-Gl7McnCJEOr7vPY7ugRKw8e9x1yczZ-jSAMgihtE7kj3jNWenxXbeIEF_9kXvNAiGStFz00Ej_V-zmhbbscjrUr2LdQ_C07lOpV_26Ib1wrSzbAJ2FnDMi8CAmC7P9RZquw7FeIECw04JNj9In4UwdhRr_owQTQui9yZ55Xqbby8GJLO2aO0d5BH0LHlehBAeDESRF9SiDol2yohejEMgEB9iX6sgndoDb4O8r_f3Ei3EyaWX429yzjmPgqoxFvFm4B9INE_QDwDUBXDeIyR-CEnAlJpcKlvvWcp9bDOWFqWCUH8CtCX_vnmSncAdFbO0Z4dmbLyiQSJG5t3M6Li71mc1xZYR7vBJ4X5xvqstISm68pN7UBsvUzA8vTvLGUrY8EwqVu1HfEPHjs9S_bevLk9KjTqu7Jtk7-YEO4ykHCVj1nmv8_bf95ExOCRdVgyt3Vg3p_8W_TJ2_zWdvG3Xg5AIjkAm4eGGTpQn5k=w967-h725-no";
    ImageView mibesmoises5;
    String urlmibesmoises5 = "https://lh3.googleusercontent.com/UuV8lkXIHQ3ZKwKBfnZGmsZ58C8cP4JoS27Z4YB4ppJwSs36IeRL1xBHVYLWTSM-0eDS4fwBGrNuAok2sMSzMUKrfvgD3rJphphJnJDIUvp86WA95eOxZ7BbQcS8YDQvDcyRce8u5vLjsZe9VJtlNTAaKQ78CIVO_j8n-cv7TjvdXB3i62jjJY3VHBbT3_pjZuw8TTi2qZfF9Bi86pQJTQivtgGBpvrATfrjxUC4iShL-I_R3VQe1kfn3oMB0dwGH_FIaQZlBDrsx3DbogncXhdHV4PbF_faYaiX3V6xPHRPrkNRRzeFGm4Xu4GfoFj_8yHkDWoRyR2YklsVdWPOmKsZbUaK3OVLm7EembRv_ckuYbhvy7NhPndILnia8C2mvZZ1pD4qq08xOCAqnxTZhBW3WZ5rYTttkllZRjPjKgUJSLOTo1ZSkwNqpSCxo6cMiV7Hyk2g4pLTShN_drS28ZHYG-n3bJZXSTlR_xVeeYVrAPoVWCj5Nlkr2LtOAcRAT0RMnoPo0lNudFV_9KgAvzQDQImvsiI55t9dnRZMLLhmMagNAUtlhChzNnCFlrJUr09I-UURiHPI1NQBh8zo4TLU850iciYEC4Oi39d1njM45M6uwsZXtJT5Yi7cNAIbXkFCBQHOSMWyJhkDzfIgbQfbazGVoNkjLJ2isDgprBQ=w967-h725-no";
    ImageView mibesmoises6;
    String urlmibesmoises6 = "https://lh3.googleusercontent.com/ICtB-YAMhiiHxdgAh5oEVZ7ncluzrEt1WSfEcu73VqiL9S-UwHzNEvJDUJXNIZeYfacJXfOEmz21pR5R1Ne5GaRKe7JKR0cbK87PHWNfhBydGyFUAnYZMjXkzUAfjzAub3II0WaZkaVoQst2C4xwKO7NnHNDvbN5YZV1dd7kzvP7xO2gkemNXf0pVf2E9aoIKFO6Xto3hk7tIXsWO_cj7xnrJ3lh84WxFN_T4mKgjFMdEHNSHA3g5cUPbhtNCyh7E9P8BU35b6KAcUKjJAlTLS_r4YFqh_cKTd9kw3iI8f6e-fuCkz0v07lsy5jZqkZrnGETPOWojz08Yzu6gl02FZvYiFzR3BVJ2hZspBTkOHlOV41wcTwMymaKCPLPuaLpJMkk7IqMWojws9SFcuaHRGKdTvbjXuO8_KPdt2NOnHVnh49H3pPy5ltXPKUYpDppIOFafNKDskIufKtokMZCNJX4Q6Tji6F9abcUB7wfEFmn1LHbUNYkSvcYYeaYPvXuwBznk6evrUIptCd5_uzAX64nc-2h1MOfmLz6Ba5es290duXH0sP2PoeQFtNXUkx6zpWwC6MHfdWF3c6Qq2qDarqcRKf7GADygFzt-flx5xM3_XlwVBHZFCCP-uNnesCwHcm8UIk3BVM3xkh1gJbNyPQ7rYSQeYOwQVFqsC8ShZw=w967-h725-no";
    ImageView mibesmoises7;
    String urlmibesmoises7 = "https://lh3.googleusercontent.com/dVhkfBCY439oi3jS1Tpu7A-FLonymTeXj9U7wBc8cTYvjAyQLWQ8ibF24IkJ3kuvXOdz9F-QLU3J4KpMm1yu2J2MUIJCmSB_dNsqXr7seEqiWoFUuTW9omcchM5tLwyJ6NNc5lURQomoX89sIaGxA1PMr9YpNT6LQsmNv-pZ7vokVN5qJnWItfJh-DCTMusUtwRA6nOvZaIg4xRcnxkcBRr-Wy7Ucx9JuwepQN1KKpWdwfj2ML9jK-q20lycoDKBDH8avoAk3pjhJSVnERi8Hp7h9wz0i62cKxuYCTQ0hdXsna1P3YRPHE-DYk2URed6sEJz3TPUoy2l78q50_TecPeiqyhY1Fg0pWPnGN5DJjGzD39_Jv3wV0MS5aU4ZpK4Q45LCDvHldkqSkrUSM_vqCDfr8FujDF6yl_cpe4Ox_dHuGQ6beWXbFdmjN30inLHf4GKvzKpTZT7vi4pG6eUXp90tXTBC52DYB3dUqfOXt2bk7hdEsSMbwsKKgec3rl13QoucP0TlPjXWE8vPoP8yXktJzJv38_b63XQIEXTY6HVi5PUxJSs-GvAHGv_MwgCeJUBiLy_qZZNv9s897qnLEJY88aNj9balcWiX52M0Nx8z5gf3nmBfjYe3MlhoVl33Is5J9SvsK563rIoRjvmGfMnbwzCtADZlcWoXgTEIVs=w967-h725-no";
    ImageView mibesmoises8;
    String urlmibesmoises8 = "https://lh3.googleusercontent.com/nVw-b6BOpLEHqWIZoMb44wescLsx8-BmgUOMwJ3szCZG-AY_zfnkL1NCQBW1GDDp5kBvmtIfMOxaIGpV3LjRcDOFVEUr05VXCiA_m7Zf1D7736I4-FbWuM2o3G-JWEtqBI9oiXHvSfIfpj-YX6hK7OpXq181_JQv5FD56LdVivFXq3UxXCLAEj12Wd8Pl32yZv_I__-8nOuCVV2Y0_23wIYYdiW9_zX5uZK5EFaf2COtJmUJJxR25lsfoEh3dD4979j9NuLN35X7r80dmvXLxt65MPhnDkuKYHUra9MQkaSihm0Pb_bLhA4E288MO40kNKIw6sWdOsvoukzR3YsoSyTBgz8xIgFLbyumFSus-B3jQqIPjTzgN-p5sxmXAsV85P14OGm90chggi-dJcWLdi2cikDYPuswQ3d8w2yKyspqQxi3koyz8smWbbXrUqBF9g-Jpv_YweKuwIPVNHyB425MQJVHzyCc3EjwBZqxBYyPfvoWzvuYqSORZDmGfiMNCKyxiXKDJovawdFt69fcnIm9jk0DKg5r2kBZfa2_QEiIix5HGOmjC0VlkO8gB3coB7bvAX7oKZgWhWWntBK9jkitJasn0BpwCz08cUkMkbh7ux1Q5TYv6FWRu2kkGDj5r9gw0J3jN7oWpQFAhKY_lhCdwatogf4BHBSCaFvGfdQ=w967-h725-no";
    ImageView mibesmoises9;
    String urlmibesmoises9 = "https://lh3.googleusercontent.com/HlHCAiZhfBLqpsqSLqDQVIA0tonreBeDgYbLsN-k13fYmhEscxH5PWvaE5yOW5hdRReLFwMp0zeCsaSPJGQNCwXLL_qzEA0d8fiAt2kKZXm0Q9Td6MMxoEL7-stb9CKacpwguEHKyB67S0_t-l8We9GU1reIsc72_oABLy-vMRU2gHxlWmQ3o9LHqSGsHbDzKcz71XwK8rXHdz56UAJKv2zPAP7qEkrKmN54DHIc8Ic4qbebTiW347uG6KqkiagfPppkGbbFaBdAF7R_oBk-iqImaFb_-WuPfwMJq2_AUXy8XuSKB4q6vpRilAmuGn5rrKf_2ijR85nwST5RJbEAybPUNZ1bnRCTvor0gcpzksVR7l0wMNhNktdEfKWeRyH3E8xO5fc7-JItvWVIBhZpYaFKPX_3C1WR3kHFPiNUyrB_MHqsYf7vT0BlqvOsNW0yZpGC_ymaos8PbZc7JaIXvqhBJJsss2-Ic7qmydZU4pATZxgORTT8YqNGkbTcPmUjMuOMRKj0NuG_geTFwxxHHl9JhnkO7W8-_LgQcEijil5EGgqs4JnrvOblVLat5hQJUbIjoHTAPRCH_YSEhDceIFvxcAiDvdfIwIpocubK5qy1mB1EPlBjqw85nTNUFdUJMOOm9NBGBrf0lZk2qRg8t4bA6bCRcXNB1ohGraKQUiY=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesmoises);

        new mibesmoises.preciomibesmoisesAsync().execute();

        preciomibesmoises1 = (TextView)findViewById(R.id.preciomibesmoises1);
        preciomibesmoises2 = (TextView)findViewById(R.id.preciomibesmoises2);
        preciomibesmoises3 = (TextView)findViewById(R.id.preciomibesmoises3);
        preciomibesmoises4 = (TextView)findViewById(R.id.preciomibesmoises4);
        preciomibesmoises5 = (TextView)findViewById(R.id.preciomibesmoises5);
        preciomibesmoises6 = (TextView)findViewById(R.id.preciomibesmoises6);
        preciomibesmoises7 = (TextView)findViewById(R.id.preciomibesmoises7);
        preciomibesmoises8 = (TextView)findViewById(R.id.preciomibesmoises8);
        preciomibesmoises9 = (TextView)findViewById(R.id.preciomibesmoises9);

        mibesmoises1 = (ImageView)findViewById(R.id.mibesmoises1);
        Picasso.with(this).load(urlmibesmoises1).into(mibesmoises1);

        mibesmoises2 = (ImageView)findViewById(R.id.mibesmoises2);
        Picasso.with(this).load(urlmibesmoises2).into(mibesmoises2);

        mibesmoises3 = (ImageView)findViewById(R.id.mibesmoises3);
        Picasso.with(this).load(urlmibesmoises3).into(mibesmoises3);

        mibesmoises4 = (ImageView)findViewById(R.id.mibesmoises4);
        Picasso.with(this).load(urlmibesmoises4).into(mibesmoises4);

        mibesmoises5 = (ImageView)findViewById(R.id.mibesmoises5);
        Picasso.with(this).load(urlmibesmoises5).into(mibesmoises5);

        mibesmoises6 = (ImageView)findViewById(R.id.mibesmoises6);
        Picasso.with(this).load(urlmibesmoises6).into(mibesmoises6);

        mibesmoises7 = (ImageView)findViewById(R.id.mibesmoises7);
        Picasso.with(this).load(urlmibesmoises7).into(mibesmoises7);

        mibesmoises8 = (ImageView)findViewById(R.id.mibesmoises8);
        Picasso.with(this).load(urlmibesmoises8).into(mibesmoises8);

        mibesmoises9 = (ImageView)findViewById(R.id.mibesmoises9);
        Picasso.with(this).load(urlmibesmoises9).into(mibesmoises9);

        btnmibesmoises1 = (Button)findViewById(R.id.btnmibesmoises1);
        btnmibesmoises1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises1 = new Intent(mibesmoises.this, mibesmoises1.class);
                startActivity(btnmibesmoises1);
            }
        });

        btnmibesmoises2 = (Button)findViewById(R.id.btnmibesmoises2);
        btnmibesmoises2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises2 = new Intent(mibesmoises.this, mibesmoises2.class);
                startActivity(btnmibesmoises2);
            }
        });

        btnmibesmoises3 = (Button)findViewById(R.id.btnmibesmoises3);
        btnmibesmoises3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises3 = new Intent(mibesmoises.this, mibesmoises3.class);
                startActivity(btnmibesmoises3);
            }
        });

        btnmibesmoises4 = (Button)findViewById(R.id.btnmibesmoises4);
        btnmibesmoises4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises4 = new Intent(mibesmoises.this, mibesmoises4.class);
                startActivity(btnmibesmoises4);
            }
        });

        btnmibesmoises5 = (Button)findViewById(R.id.btnmibesmoises5);
        btnmibesmoises5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises5 = new Intent(mibesmoises.this, mibesmoises5.class);
                startActivity(btnmibesmoises5);
            }
        });

        btnmibesmoises6 = (Button)findViewById(R.id.btnmibesmoises6);
        btnmibesmoises6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises6 = new Intent(mibesmoises.this, mibesmoises6.class);
                startActivity(btnmibesmoises6);
            }
        });

        btnmibesmoises7 = (Button)findViewById(R.id.btnmibesmoises7);
        btnmibesmoises7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises7 = new Intent(mibesmoises.this, mibesmoises7.class);
                startActivity(btnmibesmoises7);
            }
        });

        btnmibesmoises8 = (Button)findViewById(R.id.btnmibesmoises8);
        btnmibesmoises8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises8 = new Intent(mibesmoises.this, mibesmoises8.class);
                startActivity(btnmibesmoises8);
            }
        });

        btnmibesmoises9 = (Button)findViewById(R.id.btnmibesmoises9);
        btnmibesmoises9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesmoises9 = new Intent(mibesmoises.this, mibesmoises9.class);
                startActivity(btnmibesmoises9);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesmoises.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesmoises.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciomibesmoisesAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=198089087116bc0c18d3c3ef5b574ec2";
        String preciomibesmoises1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=80b3934aea1a051fea31c397eb988de7";
        String preciomibesmoises2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e13fde36b9d069a3a384fce225dbdae7";
        String preciomibesmoises3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6740a4ac70c695f56708d4f84ae396cb";
        String preciomibesmoises4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=015b32a9c1887bcfcd99e1c8ad4bbb10";
        String preciomibesmoises5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4b85d290b1dc461ee09ec03eebaaa498";
        String preciomibesmoises6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f23492b8f73c850a3eff67486f9af419";
        String preciomibesmoises7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0bb30c4b501cb71bafc8cadc221ba1bf";
        String preciomibesmoises8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e6608849579113223cbdbabe3f68ab76";
        String preciomibesmoises9st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciomibesmoises1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciomibesmoises2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciomibesmoises3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciomibesmoises4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciomibesmoises5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciomibesmoises6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciomibesmoises7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciomibesmoises8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                preciomibesmoises9st = metapropoerty9.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciomibesmoises1.setText(preciomibesmoises1st);
            preciomibesmoises2.setText(preciomibesmoises2st);
            preciomibesmoises3.setText(preciomibesmoises3st);
            preciomibesmoises4.setText(preciomibesmoises4st);
            preciomibesmoises5.setText(preciomibesmoises5st);
            preciomibesmoises6.setText(preciomibesmoises6st);
            preciomibesmoises7.setText(preciomibesmoises7st);
            preciomibesmoises8.setText(preciomibesmoises8st);
            preciomibesmoises9.setText(preciomibesmoises9st);
        }

    }

}
