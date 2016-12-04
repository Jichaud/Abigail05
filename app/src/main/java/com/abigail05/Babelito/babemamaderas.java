package com.abigail05.Babelito;

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

public class babemamaderas extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnbabemamaderas1;
    Button btnbabemamaderas2;
    Button btnbabemamaderas3;
    Button btnbabemamaderas4;
    Button btnbabemamaderas5;
    Button btnbabemamaderas6;
    Button btnbabemamaderas7;
    Button btnbabemamaderas8;
    TextView preciobabemamaderas1;
    TextView preciobabemamaderas2;
    TextView preciobabemamaderas3;
    TextView preciobabemamaderas4;
    TextView preciobabemamaderas5;
    TextView preciobabemamaderas6;
    TextView preciobabemamaderas7;
    TextView preciobabemamaderas8;
    ImageView babemamaderas1;
    String urlbabemamaderas1 = "https://lh3.googleusercontent.com/NEHIsZfkuthOLccApRfs_Kg3EWXK2J3rOeseQ9-4WFDaPuOaA7XxjQPgvVKxpWMBiNeQONpi6jBq3GtzGNltifBmPQquUlppvyvBki-33_p3sK9l9w9Vkq5frpOS6i6iS5L2PyTsGgOqwhc7JPMK_oA-d0wMYpXzLKb20lOKfdabb10hcKTKPp8AhWR3doiPgBDPbqlD6eobY3nIb74c0MYX7Ft7uLYNtJtfS0DY9tFa2dgaBEPsSjiozUlsOQ18MoD0A57r_YlFaA17TiVvlmJqh8S7s6cp4GHoHWxeGMLB-JA6VG782oLGDmX4mxqbK75F4jOk4inZRf3DbLLFg0u3lCjjlRq4KUJlBbBgQsaUFE9kiliFPt2UcwAPIaarhHHysx3hXd7Bd1qdAa-iaKC5gffGfvDoZ7rOqJL0mVQxhe99id2w9bDMBnJ8Obe4dm2W4kyoeSdYiXI4WD5aBqbwmYk_HPUC70dbZbfeyq9g7vT19qYKbYd2hriOEomxDEshbpMVE49fEssNN-IVFveqKeh9vKOef4nt4xGzNYnaDbeKo79GrAbBdQd32lLCnVmm3LrVse60PMink80iAi6NOgK5cKu08eoFXctpR5b23WknUA=s368-no";
    ImageView babemamaderas2;
    String urlbabemamaderas2 = "https://lh3.googleusercontent.com/YxNZKP95BD94G8ZfA5w_EspVfVbyVjcrQWppi9NQ16g_xDOB5_I4GNxI123Kxnt9BDYmEZu_PTgBShZKgGmefdgCxhVFlfkO-yH6kaRoY8TeubqWhZytj_ZmgIiWXwL45ye3r5lb41F-Tf2ohGCccCVPV2VUgOL7Z1OKpZ2fmBR5EWTWPS_v5t6ZCTo7_VB9qmzZpZve28DokcHT3QzWpZa_jN1ZjfZWndeO-8fbwA2XSXpATlaOlzskDWe3He57DvdGquXQP3m5MvT4_14wf38RXkDt6lY-9UfbbQYz1MvejYd-JONDqL_lpvy4SHOiNfc6taTvm2fduEuoeRorVwGUlieuZnqZbZKWqPZNKwz17TAUaqqAaS7qqE6w02bzm3o1Hbwppi3Eqmj97w9WSPddevDBGi2LDjbdNZCjk69EvKx9GhC-8RhHKlYm5QvNg2q6-7HGoL70AGIvkvO4-526xCVcK_ziCHmFj4kLOE3-IC8yF3aQcZXQ6qLnpojEm1HZMmu3nDbMXrJ83YqMYC-IFM7o7UPCi3XeXpDyYHY2w-IxYmU1_8aF-qsAKpIhawL3nOVaHwPK-eRvRNkLeLpMiQoG5gVqMRsOl_JB08v--KjyPQ=s368-no";
    ImageView babemamaderas3;
    String urlbabemamaderas3 = "https://lh3.googleusercontent.com/n52_7Cc1iaxXn3HUvrIhhAaJgQbm5sDKrv_AoLe2Ka7utTU5iYKy9eTJMhDulF31z4rHnX8RyC5lM40uM9OgGCun4tF5MjVipUTOU5Y48UBShDBEjZCIi28pony_N4e1mUtQP8-e2U_V8PVsFZSjahZg1fuTos4nrzHZJpHyXqGrPpdk_ae7WjHuENfxnd-bqtawnZ78WBq4zDAvIHvIkg8XHU11kff_nEiqDBnshY3TrfNvnrk8-D5FiP3-4UshTijZoaiN2E90lROqPDxkHcUeVrsedsZq0MmkT5MLM2HjQem0f80mNHkisEgEk6Cqx6MLiCtTst9BSIbzC9uq0NvWmW6XIxXh_Fpi_dHpI7XibK0D3IX-C2hHe42Yhf3J-_qiayR7bkIGdOWuML1ZiUXvQ79rB-RUox1dXMr1rSQ5bIfpRvK7dRNgNvD61qAchBIqtmZmQYfq7MWrxt8VQItg2QEKZYOSteQDbVS-DurmNK2UlzqRm-Bx_LcoZ0ypcdCNNFeMcVvW-h2dNLT6fyYkKc0GUT1DHJYHcVdyRe8iC9aHaxUBmmx4BrDcx1xgiXrqDFfVJnLUTX3hs3bDFMfWsAwagKYEr5ygU4TTHSZiyjPmow=s299-no";
    ImageView babemamaderas4;
    String urlbabemamaderas4 = "https://lh3.googleusercontent.com/IMSYOISwzkLDBPVGmLxG0kGTUK2m6hdxm-RXklt-YXoVpjhEB4fo1BaDoJ12FsxUShvcGRKe3Qk-PMlmZnmuvzzlIY74MytGHtEkC_9Pozalz7njLouYH6rfm2p1-rfXVPNiQfNH6AGslDs2L6ijwvAryAtS3Q4Gu7Pvyx5hmsGnwxIP-pE9EuWYeO8hdFC74h2B77-PRQr0FVQ6xH80A4vMCkXKbraFStUoFtIJEhk62uSoccJ46cJSpkeXuuc9brQfi3CAQDP8alwtYpPEHjXuLh5YpZmPOu3mMbz8O237r449pFNhkU9zasfjXSoxnI7kzQGDDZhEwB9TArUpVcSTkv3kMcJNYi1dAYhwkfZrQRsj5gsqODuN1bPWvJibJV7zn9ZP8ew45N4j6rHfR-dBj3No5TTPvxFVlQ3UynpldNhO2Aabh2WIO7XtoPuoeQQzGNofE9pUHGkIckG4Cmfw6QuSpCxKM-oX28Gn8BgxRQOlZrmryCI7YF7BFzS4Fwr41PvvWN9B9HLg3lhnqB4b-0WS1_PwuGoDJLB9Js4YxGb0i-5ku8TPwS4nk7yMHjRIwCglT0NmsLWSAGaF1QrBCSqaf8fLztwZDGuMyt1CLnaj4w=s299-no";
    ImageView babemamaderas5;
    String urlbabemamaderas5 = "https://lh3.googleusercontent.com/SVKixR-1F0-OpvjfboAxesDLXG3fcR9WlrWh06e7QjJCKkNgI1PDoNEuR1DHou1cSBJY7LxXYoc1RHYIjCxv6WKU_HHysnO3VPObO7djBxxe1HY-I_Nq1vCC-Q1yak4aXVgSIzw_JaaIUUKiX44Re1QVlMet5gorwCVWKuV3EGMouF3oPspzcrojP0DOswHkNbMa6Oi81Lsogu5QP4UboTCKtSk0VcHBkoHkrqmXO1Zt8Rrvq0kU4q52d89fbKAOE-IY7Q8FDkkfVhfBmjFyAgM3jUVo9KMPoc5c1hjboznHCZShYI0DbutHa1LizkGRjSOKcCyR3J-_gNt0pxg-oyCibowADAJIkr6aLN1svix62XsbNrCX5C5ETHO6Bq02OOx59o3kRpC-my1zWZwDuKWTjbi8z8FwsYLHTA1eD4CZI5NOw84bEVLz_jugz5sdAGUy0wSMwJ7NSpbiGGHUDogvAqxJfbaqDE_Honf6Op__Ij1hqdBeess6J7NsdV_iRB147nl7-vS_Ubc3hjE2yX1s9AeicL9PTKCi8QDVfgUviTA_tVRc8FFT3K_ismQa1D_YgGUTVitOCMbCmsO6jUfymig_c8bxHQ-GxdEjNYN4ujSlLg=w232-h300-no";
    ImageView babemamaderas6;
    String urlbabemamaderas6 = "https://lh3.googleusercontent.com/Wghbiu9VTb3ntiGBEnrP7xgobINxKm5-ShDRP_9ZRcfO-RLJb8LArsFAG83pBnCZZKPHTeoh0Q4zi5new2GoFNfO3Fl3qf0oV-0fY232CTGplydcpIpY269g51j_I6mx5LT0Tf3_S0artGoTeZbCzvJLH8l2lTHhQwvAZY20THKypKyFrQ6tR3pvm3R8xT5AYgMiQq72qZpQ2HwdLSoT5bYZmkfhZQxt0oKs8JeDOG2fW0vEbEmxoneqaXgxoQjlp9DnwuV534-BmjcdB9-GXO3CNXgTOh3r7Xq_YgBmne1mXP54ZbsPfgRf2KYmzxXiREWTQjy1yB7-_rnHfC8XOjAG45KSTKnWCNp2u8e8cKcfU49v55laADEnSH3SK7Dkwu7pCYXj4iBB9veqvCSa5sX7EkgayKjTNB91mU9X6-XEbu6gNRAI_binEOWv41Tc8d5Z1kMLxwxin44Id5EdEBYXKj0c-mzMdp8p8VPMXoJXJNm8p6si4sSddD2G_nUDUsQ2BCpwWuox5pGR9DlIr7i-WLpYrXj_prqrL1CCQDl16_7NdA1AlqGqEj-ltQ-6tEU-lU8UlSBjv1CueA4Q4BqTWDQNPs6PVV0f2RWOOPE_m4qFMg=s299-no";
    ImageView babemamaderas7;
    String urlbabemamaderas7 = "https://lh3.googleusercontent.com/yLJ49oekWRm59s5owdLtlyVVTFYbwJ_ADbjq89kD5srZHKwKTg77zw0puMPbJj73VUk2bN4w0B17RIkFeFu0OkyfohhGukRBsn0FDLgOn17k_6DNBbMl6ZJ6-XZsFT8zWPWKLkgyCb-r72qle06ytrw7vblgSLBPj1hS1FACeLecG76aXS9B9GlSu87C-RN-cwUze4XVPhPXi7W8zxQ24V7Xa8xa9INFnwLcLh52ZU4jei-4G2uurcfHbqaPD86DNckAYWw5ezfZiQDglvjgr3Q9mVW9OGWqwWjq3uSGaB9tcrWRVQJM7Q9bOU2m2taFF_0ZklBvlnjzpt-fyKN7W6KSjMqMk8rYXOdEOlcuYvQw6t1WQKpLXoS1-nQFsTAsMWIjXBSx06__t3seNBFAufdM_3HRC0STeSghN0OSYdtoL8BdHaBA1tdMDDQGvz7hC1sS2bAyvzhhiP3lrIe21_PaHnNtWPEXZjnnDjOyc0Z95fIKnar4BW5nJXVrMFeTGWFOi8QkYggB7DHHoEw0zFpUmqYn0S57_5PctFBx72jE0YqhTzzQwBibSd7HGvNHJchkfVmYjEyCDnuQQh07nuJNSPQsIw9byK7QXz-11hJ3MuoFQQ=w371-h368-no";
    ImageView babemamaderas8;
    String urlbabemamaderas8 = "https://lh3.googleusercontent.com/KkhawmLWC8qclBdjWchKewZgNmHjo5IUvEzP7uKvh_pTknayCDV261FCBFAiFCC4eVmerDTx0iZdLonpMfRauljy-d2QLJqytabFE4TxNf6xCE3SSLGmObu3TfUYfJjvOq70Sz7Z_xjSQnaCHMlfnv7emK6HJB3AGWPV6uZQ3HHSf7qcvp1z1Un_nPuU-5yQMrsXtcsmksqaCy6-WtIaM2TnMcYG0GfEipRazWAiLPghGfYdDllisoK5G4VwUGxZVXEljvq3DOuF_oGJJ_3NBm_8uzlaw0I4Ws3SKaz-hrNE4QgNPOV08PaKxLGe_VkTFoWaApCEkLvrET1Pa7RmDPgdTsdIlX8danfQOA5gJfX2YHlDBUwiHnGYFjKgYMlP6zfnt2-CGeEZGst1eX1rWVDk74wbUTAygKMS7DCcM6hirgmmoXvFZTraG2M-xw-tG52cmgpMcYH1UK6e0sVRDj0-YIFdnKUYsKGMbMyN4FU3h4v2bWGKkXJ4_HLeY8B_VR40qtIsgcy8QVUrVQdit1inFvKxYl61tx-DsJuAY_YOc_G58IOE9rkRjWe01gjXLYdRYtbJb3jKqkuqJskmcEXVmqn3TcY9gg6ahp5R2zpQMk78cA=s372-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babemamaderas);

        new preciobabemamaderasAsync().execute();

        preciobabemamaderas1 = (TextView)findViewById(R.id.preciobabemamaderas1);
        preciobabemamaderas2 = (TextView)findViewById(R.id.preciobabemamaderas2);
        preciobabemamaderas3 = (TextView)findViewById(R.id.preciobabemamaderas3);
        preciobabemamaderas4 = (TextView)findViewById(R.id.preciobabemamaderas4);
        preciobabemamaderas5 = (TextView)findViewById(R.id.preciobabemamaderas5);
        preciobabemamaderas6 = (TextView)findViewById(R.id.preciobabemamaderas6);
        preciobabemamaderas7 = (TextView)findViewById(R.id.preciobabemamaderas7);
        preciobabemamaderas8 = (TextView)findViewById(R.id.preciobabemamaderas8);

        babemamaderas1 = (ImageView)findViewById(R.id.babemamaderas1);
        Picasso.with(this).load(urlbabemamaderas1).into(babemamaderas1);

        babemamaderas2 = (ImageView)findViewById(R.id.babemamaderas2);
        Picasso.with(this).load(urlbabemamaderas2).into(babemamaderas2);

        babemamaderas3 = (ImageView)findViewById(R.id.babemamaderas3);
        Picasso.with(this).load(urlbabemamaderas3).into(babemamaderas3);

        babemamaderas4 = (ImageView)findViewById(R.id.babemamaderas4);
        Picasso.with(this).load(urlbabemamaderas4).into(babemamaderas4);

        babemamaderas5 = (ImageView)findViewById(R.id.babemamaderas5);
        Picasso.with(this).load(urlbabemamaderas5).into(babemamaderas5);

        babemamaderas6 = (ImageView)findViewById(R.id.babemamaderas6);
        Picasso.with(this).load(urlbabemamaderas6).into(babemamaderas6);

        babemamaderas7 = (ImageView)findViewById(R.id.babemamaderas7);
        Picasso.with(this).load(urlbabemamaderas7).into(babemamaderas7);

        babemamaderas8 = (ImageView)findViewById(R.id.babemamaderas8);
        Picasso.with(this).load(urlbabemamaderas8).into(babemamaderas8);

        btnbabemamaderas1 = (Button)findViewById(R.id.btnbabemamaderas1);
        btnbabemamaderas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas1 = new Intent(babemamaderas.this, babemamaderas1.class);
                startActivity(btnbabemamaderas1);
            }
        });

        btnbabemamaderas2 = (Button)findViewById(R.id.btnbabemamaderas2);
        btnbabemamaderas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas2 = new Intent(babemamaderas.this, babemamaderas2.class);
                startActivity(btnbabemamaderas2);
            }
        });

        btnbabemamaderas3 = (Button)findViewById(R.id.btnbabemamaderas3);
        btnbabemamaderas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas3 = new Intent(babemamaderas.this, babemamaderas3.class);
                startActivity(btnbabemamaderas3);
            }
        });

        btnbabemamaderas4 = (Button)findViewById(R.id.btnbabemamaderas4);
        btnbabemamaderas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas4 = new Intent(babemamaderas.this, babemamaderas4.class);
                startActivity(btnbabemamaderas4);
            }
        });

        btnbabemamaderas5 = (Button)findViewById(R.id.btnbabemamaderas5);
        btnbabemamaderas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas5 = new Intent(babemamaderas.this, babemamaderas5.class);
                startActivity(btnbabemamaderas5);
            }
        });

        btnbabemamaderas6 = (Button)findViewById(R.id.btnbabemamaderas6);
        btnbabemamaderas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas6 = new Intent(babemamaderas.this, babemamaderas6.class);
                startActivity(btnbabemamaderas6);
            }
        });

        btnbabemamaderas7 = (Button)findViewById(R.id.btnbabemamaderas7);
        btnbabemamaderas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas7 = new Intent(babemamaderas.this, babemamaderas7.class);
                startActivity(btnbabemamaderas7);
            }
        });

        btnbabemamaderas8 = (Button)findViewById(R.id.btnbabemamaderas8);
        btnbabemamaderas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas8 = new Intent(babemamaderas.this, babemamaderas8.class);
                startActivity(btnbabemamaderas8);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babemamaderas.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babemamaderas.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciobabemamaderasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6adc9de4f85b7e8975244e9ff40c11a9";
        String preciobabemamaderas1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4380e9cd58a3fe799defcbd04da266a9";
        String preciobabemamaderas2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5421fd8159329ac3865b9dfa3c6dfa7f";
        String preciobabemamaderas3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=056a6857bd536f0b53541a2d593733c9";
        String preciobabemamaderas4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=17918e2f4330c8b230ad5f81d86decb9";
        String preciobabemamaderas5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f05fded301cc515a526bd5317195ece9";
        String preciobabemamaderas6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=86cd03c05405dc2e51bb5fa66fa53b5e";
        String preciobabemamaderas7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d6e48acc9e47683f646b3ba9898cbfd4";
        String preciobabemamaderas8st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciobabemamaderas1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciobabemamaderas2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciobabemamaderas3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciobabemamaderas4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciobabemamaderas5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciobabemamaderas6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciobabemamaderas7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciobabemamaderas8st = metapropoerty8.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciobabemamaderas1.setText(preciobabemamaderas1st);
            preciobabemamaderas2.setText(preciobabemamaderas2st);
            preciobabemamaderas3.setText(preciobabemamaderas3st);
            preciobabemamaderas4.setText(preciobabemamaderas4st);
            preciobabemamaderas5.setText(preciobabemamaderas5st);
            preciobabemamaderas6.setText(preciobabemamaderas6st);
            preciobabemamaderas7.setText(preciobabemamaderas7st);
            preciobabemamaderas8.setText(preciobabemamaderas8st);
        }

    }
}
