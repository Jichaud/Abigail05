package com.abigail05.Gorditoo;

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

public class gorditoozapa1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompragorditoozapa1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=286b9c7ace0d0ba1719b37025de7ff3e";
    ImageView gorditoozapa1;
    ImageView gorditoozapa2;
    ImageView gorditoozapa3;
    ImageView gorditoozapa4;
    ImageView gorditoozapa5;
    ImageView gorditoozapa6;
    ImageView gorditoozapa7;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    TextView txtmodelo6;
    TextView txtmodelo7;
    TextView txtgorditoozapa1;
    TextView preciogorditoozapa1;
    String urlgorditoozapa1 = "https://lh3.googleusercontent.com/VML3hXZNtnLSOxD727shxXcXj1rZQKzxkd07upjJXgMOpM7G9ETIhy2N-YNQvF8GW0P6I7zOZZ_oGg_0muPADEgk9yVYDQGexDLJyEqjkipOLzR0rEqBgckxCLJ7cAh4Awl__L8oJe3vZVe-RmJSRZr7qD5JUIoGXUgRNgxdA1tD8nTaKwreve58qMfeMqRCA11y-y8HVqqjPLiPqYdaIOONQlx1h00kO58GYSrVGYcauTI9Ida35r4S_cU2M2g1QkVFt31PQ90gU05idM9UPDZq5YTF33CuUs8_Z8o8Z71CIeJBq4xcUsFvETvaO-RvWRSW5JseOJmYHIIiaMr5JL-s15kaRpwMlSuJDjO1uIOZm1gwL1UsY74ekx7GV0e8OOuoGwmeUcP6D-R2PTBforsQnOnV2sensDvQounHdzMumJ5XggnOiQ3Lp4cMgSk913vEbd8exRi3xt5KHHQaAu1J7ZcPncsO4GPEVynLG_GDY42GpzTG-V-e6Cux7RTDvouGNxSMNgTVBEZ_8fv2Sfnp_XsfecxhCr1EA-kYw8BHGhN_JRy_kBjlkwLwQolbFC8Q5j1XPNNoaRDyl9Ig5282DZYIQ6-BXhIYuHnGptOCM_HNbQ=s256-no";
    String urlgorditoozapa2 = "https://lh3.googleusercontent.com/6kjaDWxhtY88cEfhtAQh1ujbxYQAHIG9520Fo1MLaw1aWzUHCIf43b5Ivs_qEdxZWtGMOrE2C6nL84s3wMkEsvySWIB2SlurOw8ZqPQD1DS8rkDFGm9LEiAhA2a6QO-9n1tYD_OT_-jqBTeV85OPKa7uKcj-x4CiPuUWu7qTMJmewlTGR5wSiVWTAI-pspmP5a0QUI9S4ysZU5z1N9OiDcq8z1J0uMgVlGwOqgdZ_VNyVXVb29fWiWS3XP-49p833Hp0Z072djTfGI9jtYyjYjfzz8bihoah-v2y8rcqNVTHo9dEpEfaxQHWVL09t6MCNhPrCVEKn0Rj1xalWODbQE9lSgPL_sZzR5_LZIeP0bCOX07P3owB-1HTQhDG0Zczhp_9F9E7NwLYyTMI0JC2bYbuSpETue0D4iP-qiE6XoPjoZqErd97DmoW0DSZtDt2Iz6pldzV5S9f2tITij8_Bn2ZGc86QU2OwDcUyWOIQ8AG--n5Q-UNa_3Zvs79Oapew0K7nM49wjJ5ZdXQBJ4ejPQIsDTWwVhNiy4eRub-vBtjACJZh_EhSHMLMBw_5vjczSTEDY-Bfvwn1X6EtTUBt9lO5V3az5TgVsC0f0U6ldZ0eiis0w=s256-no";
    String urlgorditoozapa3 = "https://lh3.googleusercontent.com/FhyojDURpxN853fBBHY-xF8RmIphG2oHs3JOKYKocg1pPmdIKPTQy9zCiDuA4X8-TrnbTtOgo5X3V4i-3uJJIhM-ZDSg20_oQX98rHH9elRHCfTftseyh8MdCCgz64SBR7WVE74LzWLotxDXOFLhNhsZtydOvKQbsyONkyziICszmQE7Xb8JWwRXRGqBTitEp6lMnK7LEfDbc9FYtTMrXdc91d0SkUmaGVhMZj0gcOF8CaSrU9em2eUhzRvg3rnkga4_4mkw42H-1K3zJBiGpQgrWA-Aq83cTHKQepPqEg1-pweU5T5G3zOBwO_lzmSGJAKz0biCnLHRT3ucCwumiY-ehQThHijwvt8VwAsYZmHlnorRu3i_PKTIxMiIh8OGe21y5dXjdwMejPVnhdPsgr1XYiYzWtF4YbioAJLnEn6uLQ3w-T4C3rD6ocdHv7TDEWK4Q7Hu7fZeWz1DBMZjaxA_1vCdJ4DXXDC7RdETTRu0YCf6bP4OSHFoK6av4q_Sa1x_KpDMWfBiMGgy3UzH2RbUsSJ7G_rRfOh5o0m142Nzg0iIPkCZ_BIl3saTIeIZRBxoWVLilI2Z8Zls3ta6mUHFITHtbPuD1UMrLOcV6kukQFlhog=s256-no";
    String urlgorditoozapa4 = "https://lh3.googleusercontent.com/odxj7VFZ7lxDp1vJ8pVFUa3xNYuSARraIe6fF3ESa4x2d_h2dtBpkOEBM6YCBvLsBZvf0vVchOmy6829XarIXlWhIIFWXTy7M5cGO9o_h6r68F3DJarORu1cnJr5uPCleVWNTCWwpIDnPyHOfW7VbHwDZAExVZifTpywYuHRiZPKYpFPMT1Xl_Ph4jMZssoAVh8Ei1trb4223uCJsfygBOgAfuZxJwd8FkuicIvfIvU-oAi6wEAor6270DspTGvH_etOKzIH_cjKRTmg9BxySrC-HcT37V0L_VqhcXQc3RNYfTwAr2-5cmXT6f0h5dR-2G4boZi4kKdCRAAkaEtK8QoM1w-T0w6ZlAqzBKj7d9nReU6hXvWYrENHZYV_V-hPDJf4Dp2AaC5j8Tlc5IP5iMYemDO-Cztq6wInyhkg5l4NhnsUEZtmMOV4VVqS9vkCSTeU-lF_X2iAOMxIHU8QK-jqUOduPnxz6KYPIJEYaycsobEqFSij25gwfkNTwFXkm17mNefVeZEcd_qzHCwnv0R9UsTwF7IxVVxMMxG9ZqOweaJu4OUkJokUcW0UgXgFaEDCl6WQqW2i4B8d_eJo2GvzyujqK8YWy41eth6XOuZJfoeDyw=s256-no";
    String urlgorditoozapa5 = "https://lh3.googleusercontent.com/OFfLrZQ6OD8lN2qd7cTsWkJzadYd70UYI9JOsFAx1l9lvnyrWjqdmT2dYdqfQuUpPBi_E3YXPu5BhrVBeI6ouLPgDmROuKYYMZ-sFNCujKrtNBQHT38yLUGhUt_94ojvLdh-oMIJzb4WVD80tAIgf6z1_TWx_z45yjweF3TYCNKsUCXWWsCZydLWIHrbZB_ocHbF5Ppa9nAlzGSpVStD3tgo-nWv0fMVnvB1RU1VIIrpCUxpwrOJOtYR6qzWKdB6qRNtI4I6RunvXaWXpX9O6n76NQUePktT_oAIXmgUfENbUEQNHaUmiRUML9hhp70kQZ39kpqDwNhoElMnd6Yz3NYklN6Tg8hsUIv5ssHcs3kya1JEStpPK4baFivkq7tjwZ2pbWO3KvV8jvH3zrBIDF1NqjQ4urKyiM4HZWQgJK-S7z7E9wTE5JlSuR6OeJRp4SQoYiLglUc6ZXPiEb4GPNAyNJWf_Z0MtjGQn_3CXY7SE9huzduxaOufnurwsLyYwrIdOCAbQQZmUQx6cwNNFXXJY5kZ_4OLx9D_UYrkNlinwjnM8Qw65_Yf6725efwqMhatKJv_6oa7aLJEHZ5F086VQEWJtMpQJfKiXXOJNp78xtZM3g=s256-no";
    String urlgorditoozapa6 = "https://lh3.googleusercontent.com/l7RXIOlXkTh2asMt4dOkTKghL4odkPWpFW1Cl1ah1FWxHXnHMyc9LmAvgW7T7Hw0D8NGV4a_KebwOpl_BnW8bGJ9NiyAc8oUeQO4Ro7RRfgaVUMBFC7sXv9JRVRcF4bl2Zdx9-h99oDLcqzreemL0AEoyG9vjM5l7Pcf4-79iJOxunK40MYSEhoB7J5tlfOvnXVj230VepjmeyZAuKiXxSlAAFfaakwEI3l7nCLeSKf6_EfGFQZLrnLCQwbjTqu1dOe4gXdas9OAT73pH-DIFGUKyH9FEx75n9hpniAI_iYcGoTEbaQfCoj53F6XF0_GocXN9kWZ54ccbfWlXp819UmWym1Alg7M-FGK49SS5rVx7I-VpE4CtLInA9-paYji3f8T8UQJ5qe8ut96Y4Aca0JwRU8dZ-vvK0RvpNA2n1WbyC6UlvRTUeJg8tWh10zoQW1FyE4qHYMJGK2yXtJf0lj8vlyGicU0ePYE09knkxZFfFlhk6QEWTN5P_8tCE8LDgqtieba0C5Ylkqv_xOA2YsmMwhouCN8hwWzhRKqgeqqMOCDaLEOIHYJ73K6_r-13oH_52c9aZZwdPJ9J2_tfwO_GF0amrT2S56GA2x-bJjLIt_5AA=s256-no";
    String urlgorditoozapa7 = "https://lh3.googleusercontent.com/QpkIhhGZfCTm95mrpN1pgSh51XtS9KiDA3YLaH87Vu8-5csE2WdE8DItDsGTq4BfDZsqIvAhEPbJ88dv-xI8pbo2HfYQHCaAIrCwXeyjPEM79EQCq73moZwpjvXw69AwPNEupKVglzrpINMER3y4RQgg9TXjujyOPm6Z7YiU2fau2t6ndENWTHg8NXG54G6WU39Mqbtf60L5LAkTQlxyCg9LIRzrvMW_pL1KddBXND4epPuEKpB-MFYREiO4c1cPO4DIgtfsNw0mXXso_2Ol69H2C9fWUff1DfIXM4CpGfAIDMBEkEJ7yGE-LN2SZAQPNQ8oR7vi7ZR5oRxkmAt-b3W123RCbiOkQV-wI5NdzbFphdfR0WN2I1CpAwwE4GxUUdBtwSOZGP3aXDnib_qfdrKTlLXQ9TxeI_8uLY2M-JnJ9MuBvahThGm6_cYflcDcF6wXHmZ8o3im3nmyLYagU0joFLVkQ91qWaXvGpORpDqJVfZVXuyePiW02eh4aFkz_eVfGteULA34BJpiOmvzUQzF3JLVDfyPQQ8neuv8YDMAGlA2OKctKCQCJOwikbWVSd9URYxyMe5Ku5v7YFO4-1nWZOu6ieh1D_wPal8oyTJeWc-y-Q=s256-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorditoozapa1);

        new preciogorditoozapa1Async().execute();

        preciogorditoozapa1 = (TextView)findViewById(R.id.preciogorditoozapa1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gorditoozapa1.this,marcas.class);
                startActivity(marca);
            }
        });

        txtgorditoozapa1 = (TextView)findViewById(R.id.txtgorditoozapa1);
        final String stconsulta = txtgorditoozapa1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gorditoozapa1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gorditoozapa1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompragorditoozapa1 = (Button)findViewById(R.id.btncompragorditoozapa1);
        btncompragorditoozapa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompragorditoozapa1 = new Intent(gorditoozapa1.this, webview.class);
                btncompragorditoozapa1.putExtra("string", urlcombo);
                startActivity(btncompragorditoozapa1);
            }
        });

        gorditoozapa1 = (ImageView)findViewById(R.id.gorditoozapa1);
        Picasso.with(this).load(urlgorditoozapa1).into(gorditoozapa1);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorditoozapa1.setVisibility(View.VISIBLE);
                gorditoozapa2.setVisibility(View.GONE);
                gorditoozapa3.setVisibility(View.GONE);
                gorditoozapa4.setVisibility(View.GONE);
                gorditoozapa5.setVisibility(View.GONE);
                gorditoozapa6.setVisibility(View.GONE);
                gorditoozapa7.setVisibility(View.GONE);
            }
        });

        gorditoozapa2 = (ImageView)findViewById(R.id.gorditoozapa2);
        Picasso.with(this).load(urlgorditoozapa2).into(gorditoozapa2);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorditoozapa1.setVisibility(View.INVISIBLE);
                gorditoozapa2.setVisibility(View.VISIBLE);
                gorditoozapa3.setVisibility(View.GONE);
                gorditoozapa4.setVisibility(View.GONE);
                gorditoozapa5.setVisibility(View.GONE);
                gorditoozapa6.setVisibility(View.GONE);
                gorditoozapa7.setVisibility(View.GONE);
            }
        });

        gorditoozapa3 = (ImageView)findViewById(R.id.gorditoozapa3);
        Picasso.with(this).load(urlgorditoozapa3).into(gorditoozapa3);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorditoozapa1.setVisibility(View.INVISIBLE);
                gorditoozapa2.setVisibility(View.GONE);
                gorditoozapa3.setVisibility(View.VISIBLE);
                gorditoozapa4.setVisibility(View.GONE);
                gorditoozapa5.setVisibility(View.GONE);
                gorditoozapa6.setVisibility(View.GONE);
                gorditoozapa7.setVisibility(View.GONE);
            }
        });

        gorditoozapa4 = (ImageView)findViewById(R.id.gorditoozapa4);
        Picasso.with(this).load(urlgorditoozapa4).into(gorditoozapa4);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorditoozapa1.setVisibility(View.INVISIBLE);
                gorditoozapa2.setVisibility(View.GONE);
                gorditoozapa3.setVisibility(View.GONE);
                gorditoozapa4.setVisibility(View.VISIBLE);
                gorditoozapa5.setVisibility(View.GONE);
                gorditoozapa6.setVisibility(View.GONE);
                gorditoozapa7.setVisibility(View.GONE);
            }
        });

        gorditoozapa5 = (ImageView)findViewById(R.id.gorditoozapa5);
        Picasso.with(this).load(urlgorditoozapa5).into(gorditoozapa5);
        txtmodelo5 = (TextView)findViewById(R.id.modelo5);
        txtmodelo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorditoozapa1.setVisibility(View.INVISIBLE);
                gorditoozapa2.setVisibility(View.GONE);
                gorditoozapa3.setVisibility(View.GONE);
                gorditoozapa4.setVisibility(View.GONE);
                gorditoozapa5.setVisibility(View.VISIBLE);
                gorditoozapa6.setVisibility(View.GONE);
                gorditoozapa7.setVisibility(View.GONE);
            }
        });

        gorditoozapa6 = (ImageView)findViewById(R.id.gorditoozapa6);
        Picasso.with(this).load(urlgorditoozapa6).into(gorditoozapa6);
        txtmodelo6 = (TextView)findViewById(R.id.modelo6);
        txtmodelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorditoozapa1.setVisibility(View.INVISIBLE);
                gorditoozapa2.setVisibility(View.GONE);
                gorditoozapa3.setVisibility(View.GONE);
                gorditoozapa4.setVisibility(View.GONE);
                gorditoozapa5.setVisibility(View.GONE);
                gorditoozapa6.setVisibility(View.VISIBLE);
                gorditoozapa7.setVisibility(View.GONE);
            }
        });

        gorditoozapa7 = (ImageView)findViewById(R.id.gorditoozapa7);
        Picasso.with(this).load(urlgorditoozapa7).into(gorditoozapa7);
        txtmodelo7 = (TextView)findViewById(R.id.modelo7);
        txtmodelo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gorditoozapa1.setVisibility(View.INVISIBLE);
                gorditoozapa2.setVisibility(View.GONE);
                gorditoozapa3.setVisibility(View.GONE);
                gorditoozapa4.setVisibility(View.GONE);
                gorditoozapa5.setVisibility(View.GONE);
                gorditoozapa6.setVisibility(View.GONE);
                gorditoozapa7.setVisibility(View.VISIBLE);
            }
        });

    }

    public class preciogorditoozapa1Async extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5776ee37234e1d62289ddc960e17749b";
        String preciogorditoozapa1st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciogorditoozapa1st = metapropoerty1.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciogorditoozapa1.setText(preciogorditoozapa1st);
        }

    }
}
