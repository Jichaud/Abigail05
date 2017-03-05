package com.abigail05.Babelito;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
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

public class babemamaderas extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababemamaderas1;
    Button btnconsultaa1;
    TextView txtbabemamaderas1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6adc9de4f85b7e8975244e9ff40c11a9";
    ImageView babemamaderas1a1;
    Button btncomprababemamaderas2;
    Button btnconsultaa2;
    TextView txtbabemamaderas2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4380e9cd58a3fe799defcbd04da266a9";
    ImageView babemamaderas2a2;
    Button btncomprababemamaderas3;
    Button btnconsultaa3;
    TextView txtbabemamaderas3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5421fd8159329ac3865b9dfa3c6dfa7f";
    ImageView babemamaderas3a3;
    Button btncomprababemamaderas4;
    Button btnconsultaa4;
    TextView txtbabemamaderas4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=056a6857bd536f0b53541a2d593733c9";
    ImageView babemamaderas4a4;
    Button btncomprababemamaderas5;
    Button btnconsultaa5;
    TextView txtbabemamaderas5a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=17918e2f4330c8b230ad5f81d86decb9";
    ImageView babemamaderas5a5;
    Button btncomprababemamaderas6;
    Button btnconsultaa6;
    TextView txtbabemamaderas6a6;
    String urlcomboa6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f05fded301cc515a526bd5317195ece9";
    ImageView babemamaderas6a6;
    Button btncomprababemamaderas7;
    Button btnconsultaa7;
    TextView txtbabemamaderas7a7;
    String urlcomboa7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=86cd03c05405dc2e51bb5fa66fa53b5e";
    ImageView babemamaderas7a7;
    Button btncomprababemamaderas8;
    Button btnconsultaa8;
    TextView txtbabemamaderas8a8;
    String urlcomboa8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d6e48acc9e47683f646b3ba9898cbfd4";
    ImageView babemamaderas8a8;
    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    LinearLayout lineara1;
    LinearLayout lineara2;
    LinearLayout lineara3;
    LinearLayout lineara4;
    LinearLayout lineara5;
    LinearLayout lineara6;
    LinearLayout lineara7;
    LinearLayout lineara8;
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

        /* babemamaderas 1 */

        babemamaderas1a1 = (ImageView)findViewById(R.id.babemamaderas1a1);
        Picasso.with(this).load(urlbabemamaderas1).into(babemamaderas1a1);

        txtbabemamaderas1a1 = (TextView)findViewById(R.id.txtbabemamaderas1a1);
        final String stconsultaa1 = txtbabemamaderas1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(babemamaderas.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });

        btncomprababemamaderas1 = (Button)findViewById(R.id.btncomprababemamaderas1);
        btncomprababemamaderas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas1 = new Intent(babemamaderas.this,webview.class);
                btncomprababemamaderas1.putExtra("string", urlcomboa1);
                startActivity(btncomprababemamaderas1);
            }
        });

        lineara1 = (LinearLayout)findViewById(R.id.lineara1);

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch1.isChecked()) {
                    lineara1.setVisibility(View.VISIBLE);
                } else {
                    lineara1.setVisibility(View.GONE);
                }

            }
        });

        /* babemamaderas 2 */

        babemamaderas2a2 = (ImageView)findViewById(R.id.babemamaderas2a2);
        Picasso.with(this).load(urlbabemamaderas2).into(babemamaderas2a2);

        txtbabemamaderas2a2 = (TextView)findViewById(R.id.txtbabemamaderas2a2);
        final String stconsultaa2 = txtbabemamaderas2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(babemamaderas.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncomprababemamaderas2 = (Button)findViewById(R.id.btncomprababemamaderas2);
        btncomprababemamaderas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas2 = new Intent(babemamaderas.this,webview.class);
                btncomprababemamaderas2.putExtra("string", urlcomboa2);
                startActivity(btncomprababemamaderas2);
            }
        });

        lineara2 = (LinearLayout)findViewById(R.id.lineara2);

        switch2 = (Switch)findViewById(R.id.switch2);
        switch2.setChecked(false);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch2.isChecked()) {
                    lineara2.setVisibility(View.VISIBLE);
                } else {
                    lineara2.setVisibility(View.GONE);
                }

            }
        });

        /* babemamaderas 3 */

        babemamaderas3a3 = (ImageView)findViewById(R.id.babemamaderas3a3);
        Picasso.with(this).load(urlbabemamaderas3).into(babemamaderas3a3);

        txtbabemamaderas3a3 = (TextView)findViewById(R.id.txtbabemamaderas3a3);
        final String stconsultaa3 = txtbabemamaderas3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(babemamaderas.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncomprababemamaderas3 = (Button)findViewById(R.id.btncomprababemamaderas3);
        btncomprababemamaderas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas3 = new Intent(babemamaderas.this,webview.class);
                btncomprababemamaderas3.putExtra("string", urlcomboa3);
                startActivity(btncomprababemamaderas3);
            }
        });

        lineara3 = (LinearLayout)findViewById(R.id.lineara3);

        switch3 = (Switch)findViewById(R.id.switch3);
        switch3.setChecked(false);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch3.isChecked()) {
                    lineara3.setVisibility(View.VISIBLE);
                } else {
                    lineara3.setVisibility(View.GONE);
                }

            }
        });

        /* babemamaderas 4 */

        babemamaderas4a4 = (ImageView)findViewById(R.id.babemamaderas4a4);
        Picasso.with(this).load(urlbabemamaderas4).into(babemamaderas4a4);

        txtbabemamaderas4a4 = (TextView)findViewById(R.id.txtbabemamaderas4a4);
        final String stconsultaa4 = txtbabemamaderas4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(babemamaderas.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });


        btncomprababemamaderas4 = (Button)findViewById(R.id.btncomprababemamaderas4);
        btncomprababemamaderas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas4 = new Intent(babemamaderas.this,webview.class);
                btncomprababemamaderas4.putExtra("string", urlcomboa4);
                startActivity(btncomprababemamaderas4);
            }
        });

        lineara4 = (LinearLayout)findViewById(R.id.lineara4);

        switch4 = (Switch)findViewById(R.id.switch4);
        switch4.setChecked(false);
        switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch4.isChecked()) {
                    lineara4.setVisibility(View.VISIBLE);
                } else {
                    lineara4.setVisibility(View.GONE);
                }

            }
        });

        /* babemamaderas 5 */

        babemamaderas5a5 = (ImageView)findViewById(R.id.babemamaderas5a5);
        Picasso.with(this).load(urlbabemamaderas5).into(babemamaderas5a5);

        txtbabemamaderas5a5 = (TextView)findViewById(R.id.txtbabemamaderas5a5);
        final String stconsultaa5 = txtbabemamaderas5a5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa5 = new Intent(babemamaderas.this,contacto.class);
                btnconsultaa5.putExtra("consulta", stconsultaa5);
                startActivity(btnconsultaa5);
            }
        });


        btncomprababemamaderas5 = (Button)findViewById(R.id.btncomprababemamaderas5);
        btncomprababemamaderas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas5 = new Intent(babemamaderas.this,webview.class);
                btncomprababemamaderas5.putExtra("string", urlcomboa5);
                startActivity(btncomprababemamaderas5);
            }
        });

        lineara5 = (LinearLayout)findViewById(R.id.lineara5);

        switch5 = (Switch)findViewById(R.id.switch5);
        switch5.setChecked(false);
        switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch5.isChecked()) {
                    lineara5.setVisibility(View.VISIBLE);
                } else {
                    lineara5.setVisibility(View.GONE);
                }

            }
        });

        /* babemamaderas 6 */

        babemamaderas6a6 = (ImageView)findViewById(R.id.babemamaderas6a6);
        Picasso.with(this).load(urlbabemamaderas6).into(babemamaderas6a6);

        txtbabemamaderas6a6 = (TextView)findViewById(R.id.txtbabemamaderas6a6);
        final String stconsultaa6 = txtbabemamaderas6a6.getText().toString();
        btnconsultaa6 = (Button)findViewById(R.id.btnconsultaa6);
        btnconsultaa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa6 = new Intent(babemamaderas.this,contacto.class);
                btnconsultaa6.putExtra("consulta", stconsultaa6);
                startActivity(btnconsultaa6);
            }
        });


        btncomprababemamaderas6 = (Button)findViewById(R.id.btncomprababemamaderas6);
        btncomprababemamaderas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas6 = new Intent(babemamaderas.this,webview.class);
                btncomprababemamaderas6.putExtra("string", urlcomboa6);
                startActivity(btncomprababemamaderas6);
            }
        });

        lineara6 = (LinearLayout)findViewById(R.id.lineara6);

        switch6 = (Switch)findViewById(R.id.switch6);
        switch6.setChecked(false);
        switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch6.isChecked()) {
                    lineara6.setVisibility(View.VISIBLE);
                } else {
                    lineara6.setVisibility(View.GONE);
                }

            }
        });

        /* babemamaderas 7 */

        babemamaderas7a7 = (ImageView)findViewById(R.id.babemamaderas7a7);
        Picasso.with(this).load(urlbabemamaderas7).into(babemamaderas7a7);

        txtbabemamaderas7a7 = (TextView)findViewById(R.id.txtbabemamaderas7a7);
        final String stconsultaa7 = txtbabemamaderas7a7.getText().toString();
        btnconsultaa7 = (Button)findViewById(R.id.btnconsultaa7);
        btnconsultaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa7 = new Intent(babemamaderas.this,contacto.class);
                btnconsultaa7.putExtra("consulta", stconsultaa7);
                startActivity(btnconsultaa7);
            }
        });


        btncomprababemamaderas7 = (Button)findViewById(R.id.btncomprababemamaderas7);
        btncomprababemamaderas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas7 = new Intent(babemamaderas.this,webview.class);
                btncomprababemamaderas7.putExtra("string", urlcomboa7);
                startActivity(btncomprababemamaderas7);
            }
        });

        lineara7 = (LinearLayout)findViewById(R.id.lineara7);

        switch7 = (Switch)findViewById(R.id.switch7);
        switch7.setChecked(false);
        switch7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch7.isChecked()) {
                    lineara7.setVisibility(View.VISIBLE);
                } else {
                    lineara7.setVisibility(View.GONE);
                }

            }
        });

        /* babemamaderas 8 */

        babemamaderas8a8 = (ImageView)findViewById(R.id.babemamaderas8a8);
        Picasso.with(this).load(urlbabemamaderas8).into(babemamaderas8a8);

        txtbabemamaderas8a8 = (TextView)findViewById(R.id.txtbabemamaderas8a8);
        final String stconsultaa8 = txtbabemamaderas8a8.getText().toString();
        btnconsultaa8 = (Button)findViewById(R.id.btnconsultaa8);
        btnconsultaa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa8 = new Intent(babemamaderas.this,contacto.class);
                btnconsultaa8.putExtra("consulta", stconsultaa8);
                startActivity(btnconsultaa8);
            }
        });


        btncomprababemamaderas8 = (Button)findViewById(R.id.btncomprababemamaderas8);
        btncomprababemamaderas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababemamaderas8 = new Intent(babemamaderas.this,webview.class);
                btncomprababemamaderas8.putExtra("string", urlcomboa8);
                startActivity(btncomprababemamaderas8);
            }
        });

        lineara8 = (LinearLayout)findViewById(R.id.lineara8);

        switch8 = (Switch)findViewById(R.id.switch8);
        switch8.setChecked(false);
        switch8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch8.isChecked()) {
                    lineara8.setVisibility(View.VISIBLE);
                } else {
                    lineara8.setVisibility(View.GONE);
                }

            }
        });

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
