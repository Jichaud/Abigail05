package com.abigail05.NUK;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nukaccesorios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnukaccesorios1;
    Button btnnukaccesorios2;
    Button btnnukaccesorios3;
    Button btnnukaccesorios4;
    Button btnnukaccesorios5;
    Button btnnukaccesorios6;
    Button btnnukaccesorios7;
    Button btnnukaccesorios8;
    Button btnnukaccesorios9;
    Button btnnukaccesorios10;
    Button btnnukaccesorios11;
    TextView precionukaccesorios1;
    TextView precionukaccesorios2;
    TextView precionukaccesorios3;
    TextView precionukaccesorios4;
    TextView precionukaccesorios5;
    TextView precionukaccesorios6;
    TextView precionukaccesorios7;
    TextView precionukaccesorios8;
    TextView precionukaccesorios9;
    TextView precionukaccesorios10;
    TextView precionukaccesorios11;
    ImageView nukaccesorios1;
    String urlnukaccesorios1 = "https://lh3.googleusercontent.com/8gJcKhG-PMmCYfKAWS5aK72yOmO20P-tLpYu7zvnE4JmvV41dAgh5qAUe3y4o0p4EMoQu9-1KW5G5dajba3wQmiF1RfU6jdxnZnix5a1tlL9zu-viTwuCUofh8EcP6tdMnC1a5WdN94ubJiBA2k1ezlwZ5cxCE2G7EfcuB8p5_jhDmP5FmPrdGwCn1x9v3jgSwcLtycnWYKUmQOOk8p5vefrkZXEy1dZGk-IpNWLdNCA7qfR4arsM6PEN3jsqnF0aNg2bodPKsZRDSHEU02TUkD8rhNMdRPLTTD8mcQ2Lxl5IbtqxzIsJc15O3J2LYSGqjSPNAg4HqSiJ6B3m9n76nsRKYWPZ7sfACfV8TF78phtCZD5xSAY5MKpuhmqlF45sWixgAjjayk2YSO7NCJDo573wQbaK6NabCvhHHi2EDKFgRVkPw9PHcs8pArQcCHnNNxxHvuTAhjaOV5m9BBRC1_-JDrDK49WROIAbDCeqg-FuoT7f8a1FaZufmhltn34Zx_5WGqviItS_fzExhggIUaZ28Fxwui419F_0ozRiGtt9O3oDOV1D_qDAJpgRH49iifbAVtetkP7BccD2U6E9hJ7DnCsxFWOkgVBNQwPSWSVXtwySg=w282-h320-no";
    ImageView nukaccesorios2;
    String urlnukaccesorios2 = "https://lh3.googleusercontent.com/19zp7AAgWbNSkvuE7Mho72RhyXUOFGXE5Lit5D8iWtRZJPghcaI0ScIp2ZIobEr7sUhANyt66Y3d7fIECBrnRdebrYve2ze4GxZvWzL1vfbKLP5OCdeoBIO2L9NtSGnqWJeP64WAWtYNrgmHld_dZ4EijZ4cFmi9caEh8cEEinLPEDTKkcSzAGqdFu06Bqd20vgm9veEiMP3upVOGQgYBPjlJ_xNcENMeUqX_y_RiOF3KM2Q6N2JkQbmNldXGywwNgVhpHVOUXzceCmvJdpge-ALzwvOoaew0H4oQcq6o61GmHSlcpwOspBb5kCYr2sreHhJ62SkR3oHeJxkLsZUy0njQJouq-J8e9gG9pMR65YBCkEpSMQV_Zp_nUyVl-ihvvOkbz-pR2G1aahOInM7roekWhJY2SXUOVmJTjjDusxbY9NW3-U7YJO0yCE8IF7L35RKw8l02oQ8EVxSebiqLjoW1bEInJfEZDImcTIjxI6I2ttl4tek9udU1aulY62XK_2caOH3SNxLcO61XGqORWeYpJWyAYfi6neZdkN553WcPW4QzqdOC2HgXtxtF8P5B1e_QP2mhQ_bnnfSqtElsNZCeYaaHcl7K3OvbDpEyhf9Qm8log=w312-h300-no";
    ImageView nukaccesorios3;
    String urlnukaccesorios3 = "https://lh3.googleusercontent.com/dRBuT6skJRmkl7sgkxV2LxbZ62gezY1hFBIpqd_iAxHynvVhnZcJ6HNZ4jzWSvhKS3e1FXmwCnes5OmrKTFi_Rtq19qUaGrGKXd9-T0GHH_b4V3wUbEA3otATp6-jssYS7BUGR-NHgT7rueIDd_h4L6949WT0NqdbpvfOtpn_-MjygpAAEW_2Y6cr4dRTYmhSlU5bIAV7jennFclIF21GE4IgJS_xEtUQB4IYpCEv2c5XVahy3eEEga11YgCzGKc_elGPT_G7LmcMUjrNonZuI1clIp6ow3nnpsQMBdDyMc1Ruw6zy1EK3AsvBcyUMC7IW2DpP7ExPmS5ceNkE045VNeYUPTpqUKYZMy_hYJ9Zeg1ss6qpe1xIneLEgvNK751L51TmzptViVSsEQnprw2a1m5g541NkU8ZUVBpgjzc0Kgjg9QztFKVx-BIw55kLXPctnZsRHtm4L51xB3y6gOWhh5j4lh39dWq9RTdWS74YO7GcBof2sk_5CUnNCaPtLTVboxsZlGFaCu4wFE9OrNRTPdMyXU_yQ1unx1PPNMlmaDm9UdZjzXOBmFLDkxb28nuF1a-CNPOio5zg7M1h85IeLT1kCklRoYZsXqXH6H5YSu8f0Ug=w379-h340-no";
    ImageView nukaccesorios4;
    String urlnukaccesorios4 = "https://lh3.googleusercontent.com/scVEA7Nn0abXSQi9FUDk46S_7ULAFeOw8vrzqwep4RIw0WH9sZz-4S3tETyYx3PQ6EWv_uW5Bf4gTYuT5gz1xCb8nZSe-9lCpi96_TIQzJU7AwDR69kIjKqojuIY6jkXeN2mfN8vLONtcZHPmvVKs6A7QnyTls4Js8jN_Pe0Gw60dsadF2BJljH7ZzVXsohtry_k4Yeaofqu0tGJdS6qZvD4Dj_OJ1D4c7WvHbZXCM63RCl1UWEYmi70S0g9gdRWObsEC-QHqikGqvyB1phxW9W3AmxVEzTkEUr1uXfzfcka8Ngf2V8kTVEhCW4UTqE7DV8V3HzJbxcXYDhzyaquGyeJd8EHw_3GZsHzJNoeXeSTm91ao-Oe6OjrdWvqyMuhT-Cu8qwxVBn2MCfY5EbbGCC1JD5dg5sMYs5bHZwErfKseCaaCzC7sjWeX7M5gEsGeCIJvHKpAzm_UKEGd_pLmQzRFC-1KGn6XhMsbKzpm_RknOWUJaUSWiPziWB5HCJHlml2QJdQKEgUQoXDqAxPW9QFLouhf1PP04UY-H5J1LECVDgqGHJ_I8eSapUe52dfvYEAtgQgvyuhNuhShrtMl57MISnhGgdK_bS_8m4owRuSlUEICw=s340-no";
    ImageView nukaccesorios5;
    String urlnukaccesorios5 = "https://lh3.googleusercontent.com/Nvoz-QaszCBoN_MDEwHeATWdfwMMeTAzonAbjEc466J4IvqnPhZhM1PrmyW7E_-snLYZXOhykiepywgPQuB6wBZMbcOAe9J4q6pgb006sRmh5FJz9xEEJhjb50j09nXvGb3kITPrTX2F2ciLp1WD33svPtk5tEIusMy9bU3RX6VHbWcrMUHLcUqQYam3_McRWqmJFVKuHpog59kbXDZMefL7q7Kqsm1EebtX0u2_NtQTUJNfOvPXnNZD7hCTLBjRIZ8jZMJoJj6psmrQRNf5JVs9MPIDKoDwr3Ul7xYyzTMNICyY3g6gFPj3OD3FznpInvmK0KlxAZyfEQQQ2At1aiB3PsH4YA6oLNrE1tPoa8k8j2puUN7c6rL2DGu6PsE8KMvRyFg-puLzV2om0m9bD7jGH37U_NZcrRHRr9L8TzfsDPBpC0af2ubzC4Bgbj8lN1c3jz_rjahvCiQoT4nKtWR-cDUSt30kqMsMQrywlq0W_m7EAwOORIkXjUVuYuyWFf8pGgSdhQLLwhdC4j0jc8x_EeYbko73ZlsrEJgEQ-7z1DwhSb7ROA5F3bJQ9nZAzlWSdrowuee5VoPym3t43aeFNWJ6vZf8ymrreLe4SiZAWHIIaQ=w375-h300-no";
    ImageView nukaccesorios6;
    String urlnukaccesorios6 = "https://lh3.googleusercontent.com/x7TkQFzUpgnzUPLmx009lzk55gIMWRZWBW-jLfb4lyLvofMLNz3VFt_I6VFfoYeWXanQtIcQpUnDUkVka-TBMQVBle95uf9yqBlNqTD9etg_G9kaUIKq3WkDVJnhfuTDFApQb0oYVdKWeAovoiiDr8AX3SprdlPdPBhnTqSScGAYzH0WXrrOdfZHCjeByBIEQDu4U0-4imaBqvbgHgjhuS7XQJkWmknGWUn_SzUTHneLlWGUxMbVUdJ2TkKKFlDTWVnKrCYW35BkCeTBB6KPZQZWWjStdhxjsvDWDGRNXQD5DEDJnQQs1jzP-Njq1b90CCGw0LcJXvmFteX3xMG54E2XmRSBjvajgbrxJ0LOcxshY5n8ZWGg2yHamD1smQ1-A5vXtvhrtzthC48kJcNnGnisRXEIoYsO60VVO8lh2VFDKHG05-aZ1RLmmBikI0fkFoEr-siH28cZtFuxpPcyNEeg80reEAKpmbGIaWd2NGKFINEix5N1on214Ia9pZVSuhpIdtfjx-pz6weaWr9RoSApyz6tAUgVJzztuDDqEduLbLhulUIfwn5ARSSQFG-VFVxRzGbGubZEz69bhVi2JnbP21H2kSgBFgY-olwdD-v6LIkLKg=w329-h365-no";
    ImageView nukaccesorios7;
    String urlnukaccesorios7 = "https://lh3.googleusercontent.com/x7TkQFzUpgnzUPLmx009lzk55gIMWRZWBW-jLfb4lyLvofMLNz3VFt_I6VFfoYeWXanQtIcQpUnDUkVka-TBMQVBle95uf9yqBlNqTD9etg_G9kaUIKq3WkDVJnhfuTDFApQb0oYVdKWeAovoiiDr8AX3SprdlPdPBhnTqSScGAYzH0WXrrOdfZHCjeByBIEQDu4U0-4imaBqvbgHgjhuS7XQJkWmknGWUn_SzUTHneLlWGUxMbVUdJ2TkKKFlDTWVnKrCYW35BkCeTBB6KPZQZWWjStdhxjsvDWDGRNXQD5DEDJnQQs1jzP-Njq1b90CCGw0LcJXvmFteX3xMG54E2XmRSBjvajgbrxJ0LOcxshY5n8ZWGg2yHamD1smQ1-A5vXtvhrtzthC48kJcNnGnisRXEIoYsO60VVO8lh2VFDKHG05-aZ1RLmmBikI0fkFoEr-siH28cZtFuxpPcyNEeg80reEAKpmbGIaWd2NGKFINEix5N1on214Ia9pZVSuhpIdtfjx-pz6weaWr9RoSApyz6tAUgVJzztuDDqEduLbLhulUIfwn5ARSSQFG-VFVxRzGbGubZEz69bhVi2JnbP21H2kSgBFgY-olwdD-v6LIkLKg=w329-h365-no";
    ImageView nukaccesorios8;
    String urlnukaccesorios8 = "https://lh3.googleusercontent.com/xNekdBvjQNEfALLYlrA1T4qKyvIQZNaSzoOn9hth3y_71wWR4_abHqcmI3VtRwPrGVrZiBgNT9B5H43waIKwabFFbh74Gj6xLVPKfcRSa7V0v9j4dICSiDM5VSxeeBo1dg0O4FunEPa_iC8c1oq9C2cr4xcyPcHKZ7NxR6_259SMS-QR_xv4eSo9gtLwurziUFePBGckV8siiwruuAwM6YlbBsXrsvG0Dv6MMKbxgldZvwkVsctNJauj3t_WTAim7uPUsh69NmZsalcwiP3nQPKBS0EyWvguD65pUqs5_19emgykYe4gdT8SIYKGb4vaCwF4zDETJuB76CJW0zjdihHfAfvaXw3-hTbx3fqwxJpHVf5sAgKTUe7S2kF2oeEPmnXPZsxG_kejZRDEW4lmLO1qyZjaBxQZZ0q-CnYGfHoAp-Yg-GSQgWkRQLaCWYeyZeYDNovrExFrTmvvP1ROo4eU88VkE_Mx-VbUJjKZ73_WOoFiDZpojSKTdYoldP_swvBjK_cl9DI0oSNKb3ttqGPjaaoDJ3TOawmVzlk8k2p_p8geieLgDOU1QC32JPXT8TWPyR8-hOm5IAnTONQHa233_5f1HCZhX9Xwie86RjCH6JyCuA=w304-h365-no";
    ImageView nukaccesorios9;
    String urlnukaccesorios9 = "https://lh3.googleusercontent.com/xNekdBvjQNEfALLYlrA1T4qKyvIQZNaSzoOn9hth3y_71wWR4_abHqcmI3VtRwPrGVrZiBgNT9B5H43waIKwabFFbh74Gj6xLVPKfcRSa7V0v9j4dICSiDM5VSxeeBo1dg0O4FunEPa_iC8c1oq9C2cr4xcyPcHKZ7NxR6_259SMS-QR_xv4eSo9gtLwurziUFePBGckV8siiwruuAwM6YlbBsXrsvG0Dv6MMKbxgldZvwkVsctNJauj3t_WTAim7uPUsh69NmZsalcwiP3nQPKBS0EyWvguD65pUqs5_19emgykYe4gdT8SIYKGb4vaCwF4zDETJuB76CJW0zjdihHfAfvaXw3-hTbx3fqwxJpHVf5sAgKTUe7S2kF2oeEPmnXPZsxG_kejZRDEW4lmLO1qyZjaBxQZZ0q-CnYGfHoAp-Yg-GSQgWkRQLaCWYeyZeYDNovrExFrTmvvP1ROo4eU88VkE_Mx-VbUJjKZ73_WOoFiDZpojSKTdYoldP_swvBjK_cl9DI0oSNKb3ttqGPjaaoDJ3TOawmVzlk8k2p_p8geieLgDOU1QC32JPXT8TWPyR8-hOm5IAnTONQHa233_5f1HCZhX9Xwie86RjCH6JyCuA=w304-h365-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios);

        new nukaccesorios.precionukaccesoriosAsync().execute();

        precionukaccesorios1 = (TextView)findViewById(R.id.precionukaccesorios1);
        precionukaccesorios2 = (TextView)findViewById(R.id.precionukaccesorios2);
        precionukaccesorios3 = (TextView)findViewById(R.id.precionukaccesorios3);
        precionukaccesorios4 = (TextView)findViewById(R.id.precionukaccesorios4);
        precionukaccesorios5 = (TextView)findViewById(R.id.precionukaccesorios5);
        precionukaccesorios6 = (TextView)findViewById(R.id.precionukaccesorios6);
        precionukaccesorios7 = (TextView)findViewById(R.id.precionukaccesorios7);
        precionukaccesorios8 = (TextView)findViewById(R.id.precionukaccesorios8);
        precionukaccesorios9 = (TextView)findViewById(R.id.precionukaccesorios9);

        nukaccesorios1 = (ImageView)findViewById(R.id.nukaccesorios1);
        Picasso.with(this).load(urlnukaccesorios1).into(nukaccesorios1);

        nukaccesorios2 = (ImageView)findViewById(R.id.nukaccesorios2);
        Picasso.with(this).load(urlnukaccesorios2).into(nukaccesorios2);

        nukaccesorios3 = (ImageView)findViewById(R.id.nukaccesorios3);
        Picasso.with(this).load(urlnukaccesorios3).into(nukaccesorios3);

        nukaccesorios4 = (ImageView)findViewById(R.id.nukaccesorios4);
        Picasso.with(this).load(urlnukaccesorios4).into(nukaccesorios4);

        nukaccesorios5 = (ImageView)findViewById(R.id.nukaccesorios5);
        Picasso.with(this).load(urlnukaccesorios5).into(nukaccesorios5);

        nukaccesorios6 = (ImageView)findViewById(R.id.nukaccesorios6);
        Picasso.with(this).load(urlnukaccesorios6).into(nukaccesorios6);

        nukaccesorios7 = (ImageView)findViewById(R.id.nukaccesorios7);
        Picasso.with(this).load(urlnukaccesorios7).into(nukaccesorios7);

        nukaccesorios8 = (ImageView)findViewById(R.id.nukaccesorios8);
        Picasso.with(this).load(urlnukaccesorios8).into(nukaccesorios8);

        nukaccesorios9 = (ImageView)findViewById(R.id.nukaccesorios9);
        Picasso.with(this).load(urlnukaccesorios9).into(nukaccesorios9);

        btnnukaccesorios1 = (Button)findViewById(R.id.btnnukaccesorios1);
        btnnukaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios1 = new Intent(nukaccesorios.this, nukaccesorios1.class);
                startActivity(btnnukaccesorios1);
            }
        });

        btnnukaccesorios2 = (Button)findViewById(R.id.btnnukaccesorios2);
        btnnukaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios2 = new Intent(nukaccesorios.this, nukaccesorios2.class);
                startActivity(btnnukaccesorios2);
            }
        });

        btnnukaccesorios3 = (Button)findViewById(R.id.btnnukaccesorios3);
        btnnukaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios3 = new Intent(nukaccesorios.this, nukaccesorios3.class);
                startActivity(btnnukaccesorios3);
            }
        });

/*        btnnukaccesorios4 = (Button)findViewById(R.id.btnnukaccesorios4);
        btnnukaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios4 = new Intent(nukaccesorios.this, nukaccesorios4.class);
                startActivity(btnnukaccesorios4);
            }
        });

        btnnukaccesorios5 = (Button)findViewById(R.id.btnnukaccesorios5);
        btnnukaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios5 = new Intent(nukaccesorios.this, nukaccesorios5.class);
                startActivity(btnnukaccesorios5);
            }
        });

        btnnukaccesorios6 = (Button)findViewById(R.id.btnnukaccesorios6);
        btnnukaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios6 = new Intent(nukaccesorios.this, nukaccesorios6.class);
                startActivity(btnnukaccesorios6);
            }
        });

        btnnukaccesorios7 = (Button)findViewById(R.id.btnnukaccesorios7);
        btnnukaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios7 = new Intent(nukaccesorios.this, nukaccesorios7.class);
                startActivity(btnnukaccesorios7);
            }
        });

        btnnukaccesorios8 = (Button)findViewById(R.id.btnnukaccesorios8);
        btnnukaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios8 = new Intent(nukaccesorios.this, nukaccesorios8.class);
                startActivity(btnnukaccesorios8);
            }
        });

        btnnukaccesorios9 = (Button)findViewById(R.id.btnnukaccesorios9);
        btnnukaccesorios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios9 = new Intent(nukaccesorios.this, nukaccesorios9.class);
                startActivity(btnnukaccesorios9);
            }
        });
*/
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionukaccesoriosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=36d0c273b926b622fe30dc39b74972b3";
        String precionukaccesorios1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5364330b949bab4cbc1cd21e556a1326";
        String precionukaccesorios2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=945dd90bd214a84d9205b18b5323d15f";
        String precionukaccesorios3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=74db134b97c9c78812d13e457ad8dec4";
        String precionukaccesorios4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=38195ba6d3c64c703fe4489e249669f4";
        String precionukaccesorios5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6d93e726b1843b2b390197dc8011e650";
        String precionukaccesorios6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=152e52e34ab7c191c9660c81b1d1a05b";
        String precionukaccesorios7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a919c107cd9a69d009fb8f327246bad8";
        String precionukaccesorios8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2b4c565ea8b0ff0433950a4ebdce1ad5";
        String precionukaccesorios9st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionukaccesorios1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionukaccesorios2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionukaccesorios3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precionukaccesorios4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precionukaccesorios5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precionukaccesorios6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precionukaccesorios7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                precionukaccesorios8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                precionukaccesorios9st = metapropoerty9.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionukaccesorios1.setText(precionukaccesorios1st);
            precionukaccesorios2.setText(precionukaccesorios2st);
            precionukaccesorios3.setText(precionukaccesorios3st);
            precionukaccesorios4.setText(precionukaccesorios4st);
            precionukaccesorios5.setText(precionukaccesorios5st);
            precionukaccesorios6.setText(precionukaccesorios6st);
            precionukaccesorios7.setText(precionukaccesorios7st);
            precionukaccesorios8.setText(precionukaccesorios8st);
            precionukaccesorios9.setText(precionukaccesorios9st);
        }

    }
}
