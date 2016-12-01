package com.abigail05.NUK;

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

public class nukmamaderas extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnukmamaderas1;
    Button btnnukmamaderas2;
    Button btnnukmamaderas3;
    Button btnnukmamaderas4;
    Button btnnukmamaderas5;
    Button btnnukmamaderas6;
    Button btnnukmamaderas7;
    Button btnnukmamaderas8;
    Button btnnukmamaderas9;
    Button btnnukmamaderas10;
    Button btnnukmamaderas11;
    TextView precionukmamaderas1;
    TextView precionukmamaderas2;
    TextView precionukmamaderas3;
    TextView precionukmamaderas4;
    TextView precionukmamaderas5;
    TextView precionukmamaderas6;
    TextView precionukmamaderas7;
    TextView precionukmamaderas8;
    TextView precionukmamaderas9;
    TextView precionukmamaderas10;
    TextView precionukmamaderas11;
    ImageView nukmamaderas1;
    String urlnukmamaderas1 = "https://lh3.googleusercontent.com/6nqbwdrLLZdc56Itat4I1rzZ5EDBnAERnLuY49EJae7z8BFRV-UCexllblkE2nq8xyUtOU0VqrPTejBhKif9TvrdTp2SIjyQIYh1jg9ZyjxrqJF_ufbUeRxvTQIYKg--YqNyohHHYaMX8xlz8Zy_XbtbGv5Y5AsVEQQRgLU-LAW5-7CS12qazBNsBPrBsMmRo3wo0AYg0tg6t0tZfRVSXhqh2eY6TGRF2BQlF_lPpztg77XI4QVveg-wanWaOMchItRBxaPxdHxU_uTCxE4W1HAWKl3Z5HHCqLTddJm9pfCXLE9pkMeFdtfw891JhTsukPURFh2W_oPsATPCeEH2IyR_I0q83wIIpGkpuwXSNktY1nL8TOHQOLbjfkwu43RsG3vA07zUwKkZdbyLxt5ZBPn_ntk0JGLsN32hIq1QmFjhhQ9en0-zcFspKd2dDj3oLtj95LmnedLQufPCElhRlRh2rFsxj7um2f1-_9SC7yokdsuT6CwfgdF3sI-qf2gT-WYuGKOcYABmCRpoFV938CH0YfyFZQdcDahCP6A-p_IJ7QGIsjRFrJpXiA07fDeG032zkmKGt93ne5YNFC8DZKzrB1-W96xnZpEIQ7W67Zk2VZLtRA=w234-h340-no";
    ImageView nukmamaderas2;
    String urlnukmamaderas2 = "https://lh3.googleusercontent.com/CGV2SlxRpZ323xvBXGv2Mq1zajV7M2HbP15veI3UzoeWo5wxxvnyLQE4UcxhV1ENixiJRMqp6amBNKL7i4a2yELS04HRwrbOijbgODGSNYTyCgInyVW7N7JUWpYU6aASKJUIv6sSg5fFPle0eSib2fgFfgRoa8mkMxUL1Pvn0wQUdOGuggHxsz43mnfHjm7zgGqGddHUgZWiDQkeSwmfRYdMUB5WJurw0XVC4N5m4TSS5G-Tv-x9F2Ib-A7H7pNk5c3OUF6-auN7kOkrJW0ezg2KF5XEn86cHheHuW1kjNoUyzTJRgWTE2WkHcDtjnl6prccCwPE4JXL2dXPi4Az9kAE1gKUqcoDwwKDHZTguwZArP9U709BS7rYne_34tgQBxiIrKhBuhW3TO-Iq8gwVM_dKyXW4X6Bo3Gv2BSl6Mt5lpuVlXK_IGX_2tv0AgJkUUyIHH0qFkEBnIEwLWUJzVbhCvEycDfcCsynNy6nzqg3k-u0kL_GiSvpEfTAY6SkcOseHfZU1DowZmKNw0xX7Zr1HHaizFchbLXAI14W2Zh6mUa9BYtki2-cxF13HNkDnHFlcr0Y40WvHxXxxt8tUMPXC4Qw6CBFFMzbLGu_fdqdzwwQAA=w191-h340-no";
    ImageView nukmamaderas3;
    String urlnukmamaderas3 = "https://lh3.googleusercontent.com/1XUWcKG3abYaWxwuGfqqMtrIKwEby-fgrlptueXhCsHIJiLq2Q4rbQD15QgBRM7VCDPEeXDk3M25QG6lMMCw6zAcus5igyhG1XWgvF5yXbd1Yck1_iEGw5awQC0bdNyJ09NWYo9MbUZzp6eTKRleEasU9vVyemAKAYwAMUPQ5CwymFZaiTUjbDmseC7ubhqibEYnsayuugt3i3JIcUDH3G2mAkcHE0Bv-wTMevVwlIFVkgNDoiS2knEEmUC9qc59K0qFBox_3YQDdnUTNUGZThxZ8hMPkFJVFPpfsXDjHycCcwLEBFyIb-FdINWplCDzop7fK3vKPmget6BDM1erzeG8F1XYKVj1Uo5tbn-lAnB6_NRasyfnjk1ohod3UbJqPHIrn1L4wuDyZSRncg_3MJCsCB0qJl_aJcQBuhG-a9stfnPKlnj64pff6UwlQgS4bINUg47c7xlFZwjz8qoPzEfaOuLn0c8mDZx3eTxnyZ5uGe2oBrcxdh1jef9ewQmy8d8-SDpwCmLy6vfoTuEkZ1VII2x9m3UNGgtfjxIRL1ybq7Dm9WEgU3jVTzgxT3nhem_EBDAhCEHUz47Y2jVPsD5ToTvUHhSi-WfSUWxAJD4fQeDVxQ=w259-h365-no";
    ImageView nukmamaderas4;
    String urlnukmamaderas4 = "https://lh3.googleusercontent.com/cfQWuaJQbBK5oJVL6P3ImpFy2GysNbwTIWjI6MgB7Rr9vAPPZ4otGKL_kuKhE5VlpAqX6SH4L-utOEGLH8ba8jdLNTRaNBze6_Uq18dOogHMpeFkVU-WLbCfDvSJVUM1gijsWrAJiFxLBNz2Epri8vn198cCQFQtEvD2AjtbkPOyMp6SsY6M80x_N6BRaRhzhhOYFNJlfk5y0ni0BszxfILWM51cTRaPCbIN4l9Efxb4KQo154d5Wko3opsGDBUKn2wzdY4qlqQmCKM6e9GJRb5dxzaF9w5Qfxw-trVxzImcmRWR8YIfOQO2isa3auk8onTE6QKt7zx_Bi2MXObPNuwYLmSxYaFqQ-2xKCpXvnaa0atrUlwonnqQTGBjCW2yzItwOC5zzSfuhPuKhhH3O9kKCg_EIEizLVjXIslSz6uQMzIPs3YBGp8SmvQ6b1JztyKNfElzDRkwAPs4Jp6eNVdhZd4feT0nZYt2ZJnRFKdM0Zo_WXlOC9sto8v68HGh-9cCrFnTe5WVnAbzAnphcx9AMoZRuu0e8Rz3ZWs_-Zzme3NUTu-yotEuo_E_Q_H87ZifohnrUA3PfswIs82GTl5jbLZFwUW36Cp_N9oXN12CgOIgow=w259-h365-no";
    ImageView nukmamaderas5;
    String urlnukmamaderas5 = "https://lh3.googleusercontent.com/O-YHKrzOnuQTMJZe94rYCODbjBQCIdel9Jz-Vf73yBWaWtZfYLN8e6k1ZtQ3WEaP36ibbr5QJcRquWqr8l7cqCzWgrVeBfeDNb8ZDHJ6VcGNETREd-RCu_H896ifnA-pWSzOw8sG4Islq-wwor--yYxLn-iAod5pB9wj3c28xEEoGvzPzAezX0tbiCEcqfymLjOqjwsQOdl4DJYRp0pru__5DlX-sAsCT43IGCkiSggoloQNXWFNjxK328DQN965eK4EGE_E0lXSduz6YACIkxA5YLx8fpv2g9fnxC6wuZfKHdTVrPvSyDP6KeYlVXk4oAFon5T7K_qakbiAx1ASJOpIdkXIYyGqBic4-wEdzHuZ_CaXFO-UcyVJlxlh4IeRYeQcJy9p7CWS5W_FFSWyyPxhf13b3NRLOkCTOnnh3x7LL3evJHUOufrEBI8it4Ct-Wr5eELMaiZNV10_HCvrCXt3BXdDPL4yPJLYVg3mu3Kx3jXUv7E48drYZcAkk2EqpF8g-deir92LR1JgC84lBqanTwImNCLGTsztcJqkRIB4q1LHremqOYhi3DRHArHIYm_V5-6kqpzMKuaJ9GI2xgKwTCxhcVKawhSKM5GR0y5i-4D6pg=w191-h340-no";
    ImageView nukmamaderas6;
    String urlnukmamaderas6 = "https://lh3.googleusercontent.com/cjLknSWe2ReUHQittasPYV5dDoYPVVokJjaO19I675x03BcWL_x-4fGuG2rIMydwa8H5PwM0OXt1HEr7YoO5hrjmQvMfxnQBzPLvnuKEr3iCU1r__wLTxaky5dPy1q7EsN5qk49obnJVXHPJiJHp-b8wqBtCS2-Cktwq7CeoVf-bZEFQV6_fo7to4QQJVNl-0NwzOKpWuPxwDK4InMBFPqYQKwJd6-Mwbq-o3RohCu7OgrZ6aQuyNQ9FB07Maqyp6buxeLCPdC1WrPJbjAbxpdUyq8dhhWaDdx3sQzk-CIfeCihu9_DCZcRIzRF3SNQBSPfS2AvXTOAHv8XlYunbyvAlNCebRNOKz_671ymElvmkcY82nBO2OrbmUyUGDnXv_XVtRPumrun79s8hC6EZ6HoMHtzi7Mmp6BB0BZFWDIk8KLwPTzC3op0dCQUs1ekkubxBlYrGpK2LBPnqqKRgCi-e68tDzQRlxYo_2fNkjScGxwJJgsUGNj33Y94LtYiIV03fPNIOC1u2r5NDuxihbNQPQMgRLQzlL-N1SdoIMaVnOfOHfnJkVKDi06JGWEpCzt0cJYUR5kYZXjPvLc3vSWmqXBMT1J4vYWs9envvndnyLP9FJw=w247-h340-no";
    ImageView nukmamaderas7;
    String urlnukmamaderas7 = "https://lh3.googleusercontent.com/0SmycNcFXtCh9ZpxGiPFLD5RB9yfWK6YUeJG8qzYuS7wrh_uNiYHMlLppR2WoZ3n5TFAlBiS5vmeoP5nMFQUmZSKFPgerKmni9zJxAnEUpiJJhs-YcaQoZX-OI-W4N84s62HdD3yiMSizaN20Nmf3BS42QMT2kdQOibYi9d05wOeU-7B69iK762PncHyTXF4YN-0Luy80XBLDQj_r7jek2sPhXbtbhl3BL9XzIcoV46Fx1A7rF4RhK-3r0XIeRkglhNVAozBguRY6eqLAu-AgnJPiIDVuSF1OZ_jhjijLWr-x-T875pqtJyLLmPG7-llZX349xlpaZCneb0yRcsHVBEUFcu2B3vfkGDiq0jyqFT84i1J14fmVvMJRNWuZ01XMyoPMqmWPjU6JSD_ih4DW_wRO3VcSQTfONByPqEUdVU7zJe_6qASrHmc90NLCHgk-vN964Ph6865rXZZ2PJqvvnTKvLIjkN9e8DQjLXsIbAmPymYZeSYEHfg4KlyVZ15tEWFvr57BMiP8ML0JaFijJ_2Ks4ntFGRlJ91GgIbsJXPp87F3PRESJEZTNODNLLx7r4teyWr0pdcECraznuv0tS_WCFFPozfS9E8eYK3c4dgooCIYA=w316-h340-no";
    ImageView nukmamaderas8;
    String urlnukmamaderas8 = "https://lh3.googleusercontent.com/oZx_vYIh1jbYxk0_UCXSLaxg0W8hMKHNV1mTh3vCaGBL1Lc4qXX-tJnZftV3_Qv_1IZGjlKIVeAuGJMVTXsOoasoN4LFtX3CWk7Xf3H6TchxWu-CaWLmcpjAVkjJoM94bZwFocTrQETRX2p_3cU8aXhNkjr96Z5ChGZDMVtaQs-ueusD75O9HqspkEt9F5lbMglpP7UwxPfhqxclrXR1DZYjCL-axBWeD0e0TUNHzeeTiUK4g4pdx0j8faJVBmFzxecOpIrO_Vk9AH7UuZCGoYp_DWuc4qgNtkTJ7bFr442a5Lo-jLNPsmkLHU4pKN-ifqRD-5k_AFJ1rRW2UxOgl6Z40nBlfweegq-7_pr1PPQGUfNI9Ly-TkbUusEJgDMLHH-tm_GeMfX2kmnHyi5BgnsAqS7FkgeJqi_uT4Q0jn5DsYspeJpMm17apaG8cKgCAIfvZBnsWhzaKupZMQxWgh3DFlqTWI8VECDzYnvf2Oigz8ByIxVcVDDm0CFaaLspaA347BSXkwwRDpinhNkK8_pO-Lpbb5gqI24mPOVRkoxP4ATz_lYz9e2ggeXayQeug8u4ruTTT565lqqe204GhXrmtBrx6q4JF7FQj6PfBPTztKXA3A=w198-h340-no";
    ImageView nukmamaderas9;
    String urlnukmamaderas9 = "https://lh3.googleusercontent.com/GhJCIep2YMn3eNO6oGgM8BMZwjVOjcTjyMVS-xU6bgS4CQISZjAviOAyUF9PLtLfEY0Q1g29ODsIYK9jQN219UghfoolL5GlOyijmnZUut6h2BydX1rFe0ovtVYDc-NSiHMvS91sGulm5TJbiA9ehm37i7-2olw5zBnxxnj-k23hxyosmf54mvTqNMyGXzOp1mQ0CJBDXdfOhrIaDwTM4nLq8uev139wMSGOnQZqdaKcSYeE4deslrFqvSgJd52RhTw1uQV_TKLrXTmZZ4-jTMAS6xxRayd5kw3HFKLuNQuLkAYAUXEjnDoq9uMIzxooUbDXkj_E7OmNigUww7wF1cmD-URaMsghxaArnIOi_WacbJ269Xt4J3n-cO6nQcpj_Ev5MJQzC0H5sBxHk7mvdi3UKTYowJC7Id0LTNc8uoX84V0SFF2VOQsvRe45Uuix6uAwkO4d9lPWGEVEnzvtgTcqpafZfqzc3rYelsjdTEuzqiE2b-a8HvY6W2InXtmkDLIgF3ymPBl3wyeCFdN_guX5Kac6JZOhGZGrr2eygYPwAyaiOyVtumabYtr4DKvcYPiEyj8pkjyvm0Pdk31G8N2qblg-0Z75c9fhM1w0O8KzkeZ07w=w191-h340-no";
    ImageView nukmamaderas10;
    String urlnukmamaderas10 = "https://lh3.googleusercontent.com/tPo7SYZWIdJeO6KnH7DOYsHLakvCO3gBajRb5TtqNv2ZX3YjIy34XxhR1BgfZ5nZhtQK58XFp05OImCiWDt-ZXkdyb0WQ919h3TnX_ew6kSZZZ9S4VuDmR4sGz0SYMmM6XkdYJEtFefDiwWB0CHQb8cxf4Ey7C6mo4ucM864meU5POgEBZJwNVeKfAcOrI-Xg6DqlWoDhrCSoloURjwkvhvsXSSUB6H3V91R_LqbReHflbaouTAnDqvTwjwRnZgjShIczdCuallY6eg4XSH72RFY7roVJ7MQ30SmxVcz5UqBRcMqbYKMXBiq6aw0mAHXW3Tg6HjrqdZ2hBy0ZfkizBzsf8tpC3SgMtfCWvFAWbhdUkt8t-LyuM6HwL0fM-8CNdzzR7EwRvzajRuu7CPTkwYiTjzRw0cBaUL6K2CjTLBAt5o9VUPFAACK1XF_U8IcFPnH2eGWtRToFSWbTygQ3sf02CubFQkyC7_DA9J5MqcHX2p6ZiFUziHXBCSXKU-9E0edtmRJeK8791umOUTpF8ANv7FsFCGoYihxuAwHJ-Ypb3iX8FtKOfprIqk4HDwmzaOXsWb-OAkkl78zO_O4l3_0V_CMv12iPGWcMoIDo2i6INALwg=w203-h365-no";
    ImageView nukmamaderas11;
    String urlnukmamaderas11 = "https://lh3.googleusercontent.com/fejhyq7ySaHjEexBQdYqFxUkjxOrvvpHiIHGDA4BzUjtHxKaRZH9Kk6MMyUxKMeZJDeHXeWRkiHja7AH0oSEM5khARFOXqVvs2J7F6vRrvivpbRS9rh1UM_3DScELJZDlwIZSjZHDiFbxL2KixkcWLir7NXMUX8_i80_ftMZxDEywuXRkn_7gqtjD4ZQQAQeEH13qZchOc2ox6iqhYfmA0EcOdxBv72r6gNqjgtecwGM9weKrvr9iXbWSiPiV8PRH-7PaNAP2_DAWPGKkbmaAgdO5AfqgN0TUFw85mEq6vPHRulIKDkrOdYuFGqpydAIBvYMUY3Vzt20CBUpMuO9vUgxKdiGHJvfAvE8lnLFguZpIYfJ-tklz5CcXBZ2LxrEqL-jRzY2prTs4XD-okrO6dl2eCMJ1IL8E52Fmc6r-CbjCVMswe0_JIuhNu6md327uFnw8_0-lgVI-4RMv3awgyzAb-31VRFCDgCOHYeIAffZq5whwMCPki-t91aLnTZNIqq4tPRjVzR32BBHu-dC5PNa_AxeN-NYBN7pz5h7r5hbteiuwptj14b7-p98cR8DPIeHIwDXk1H5O7K5Vu4IjiSJTpmL7qhDxkBH19Ck-2h8PVLtuA=w254-h298-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas);

        new precionukmamaderasAsync().execute();

        precionukmamaderas1 = (TextView)findViewById(R.id.precionukmamaderas1);
        precionukmamaderas2 = (TextView)findViewById(R.id.precionukmamaderas2);
        precionukmamaderas3 = (TextView)findViewById(R.id.precionukmamaderas3);
        precionukmamaderas4 = (TextView)findViewById(R.id.precionukmamaderas4);
        precionukmamaderas5 = (TextView)findViewById(R.id.precionukmamaderas5);
        precionukmamaderas6 = (TextView)findViewById(R.id.precionukmamaderas6);
        precionukmamaderas7 = (TextView)findViewById(R.id.precionukmamaderas7);
        precionukmamaderas8 = (TextView)findViewById(R.id.precionukmamaderas8);
        precionukmamaderas9 = (TextView)findViewById(R.id.precionukmamaderas9);
        precionukmamaderas10 = (TextView)findViewById(R.id.precionukmamaderas10);
        precionukmamaderas11 = (TextView)findViewById(R.id.precionukmamaderas11);

        nukmamaderas1 = (ImageView)findViewById(R.id.nukmamaderas1);
        Picasso.with(this).load(urlnukmamaderas1).into(nukmamaderas1);

        nukmamaderas2 = (ImageView)findViewById(R.id.nukmamaderas2);
        Picasso.with(this).load(urlnukmamaderas2).into(nukmamaderas2);

        nukmamaderas3 = (ImageView)findViewById(R.id.nukmamaderas3);
        Picasso.with(this).load(urlnukmamaderas3).into(nukmamaderas3);

        nukmamaderas4 = (ImageView)findViewById(R.id.nukmamaderas4);
        Picasso.with(this).load(urlnukmamaderas4).into(nukmamaderas4);

        nukmamaderas5 = (ImageView)findViewById(R.id.nukmamaderas5);
        Picasso.with(this).load(urlnukmamaderas5).into(nukmamaderas5);

        nukmamaderas6 = (ImageView)findViewById(R.id.nukmamaderas6);
        Picasso.with(this).load(urlnukmamaderas6).into(nukmamaderas6);

        nukmamaderas7 = (ImageView)findViewById(R.id.nukmamaderas7);
        Picasso.with(this).load(urlnukmamaderas7).into(nukmamaderas7);

        nukmamaderas8 = (ImageView)findViewById(R.id.nukmamaderas8);
        Picasso.with(this).load(urlnukmamaderas8).into(nukmamaderas8);

        nukmamaderas9 = (ImageView)findViewById(R.id.nukmamaderas9);
        Picasso.with(this).load(urlnukmamaderas9).into(nukmamaderas9);

        nukmamaderas10 = (ImageView)findViewById(R.id.nukmamaderas10);
        Picasso.with(this).load(urlnukmamaderas10).into(nukmamaderas10);

        nukmamaderas11 = (ImageView)findViewById(R.id.nukmamaderas11);
        Picasso.with(this).load(urlnukmamaderas11).into(nukmamaderas11);

        btnnukmamaderas1 = (Button)findViewById(R.id.btnnukmamaderas1);
        btnnukmamaderas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas1 = new Intent(nukmamaderas.this, nukmamaderas1.class);
                startActivity(btnnukmamaderas1);
            }
        });

        btnnukmamaderas2 = (Button)findViewById(R.id.btnnukmamaderas2);
        btnnukmamaderas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas2 = new Intent(nukmamaderas.this, nukmamaderas2.class);
                startActivity(btnnukmamaderas2);
            }
        });

        btnnukmamaderas3 = (Button)findViewById(R.id.btnnukmamaderas3);
        btnnukmamaderas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas3 = new Intent(nukmamaderas.this, nukmamaderas3.class);
                startActivity(btnnukmamaderas3);
            }
        });

        btnnukmamaderas4 = (Button)findViewById(R.id.btnnukmamaderas4);
        btnnukmamaderas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas4 = new Intent(nukmamaderas.this, nukmamaderas4.class);
                startActivity(btnnukmamaderas4);
            }
        });

        btnnukmamaderas5 = (Button)findViewById(R.id.btnnukmamaderas5);
        btnnukmamaderas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas5 = new Intent(nukmamaderas.this, nukmamaderas5.class);
                startActivity(btnnukmamaderas5);
            }
        });

        btnnukmamaderas6 = (Button)findViewById(R.id.btnnukmamaderas6);
        btnnukmamaderas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas6 = new Intent(nukmamaderas.this, nukmamaderas6.class);
                startActivity(btnnukmamaderas6);
            }
        });

        btnnukmamaderas7 = (Button)findViewById(R.id.btnnukmamaderas7);
        btnnukmamaderas7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas7 = new Intent(nukmamaderas.this, nukmamaderas7.class);
                startActivity(btnnukmamaderas7);
            }
        });

        btnnukmamaderas8 = (Button)findViewById(R.id.btnnukmamaderas8);
        btnnukmamaderas8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas8 = new Intent(nukmamaderas.this, nukmamaderas8.class);
                startActivity(btnnukmamaderas8);
            }
        });

        btnnukmamaderas9 = (Button)findViewById(R.id.btnnukmamaderas9);
        btnnukmamaderas9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas9 = new Intent(nukmamaderas.this, nukmamaderas9.class);
                startActivity(btnnukmamaderas9);
            }
        });

        btnnukmamaderas10 = (Button)findViewById(R.id.btnnukmamaderas10);
        btnnukmamaderas10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas10 = new Intent(nukmamaderas.this, nukmamaderas10.class);
                startActivity(btnnukmamaderas10);
            }
        });

        btnnukmamaderas11 = (Button)findViewById(R.id.btnnukmamaderas11);
        btnnukmamaderas11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas11 = new Intent(nukmamaderas.this, nukmamaderas11.class);
                startActivity(btnnukmamaderas11);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionukmamaderasAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=88ced653ed0d1d6496026ec9e3f5d129";
        String precionukmamaderas1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d94b250da87c34c453c936d39f1615b7";
        String precionukmamaderas2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=587a4120b1d859a29333f5aad08cefc8";
        String precionukmamaderas3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=659b488096093474268ad392d5a97fff";
        String precionukmamaderas4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=bd1ffa973914bfe7041bb0a01cc3aa24";
        String precionukmamaderas5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c6a64e97466d94755eb5a9d406bc76fd";
        String precionukmamaderas6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2a687d2d2446ca0d7d4d595d37fcdc72";
        String precionukmamaderas7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e7f63c0e88c8e498dce9329e18a404ea";
        String precionukmamaderas8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6d71f64395f19cd6350dd9eed386b5ed";
        String precionukmamaderas9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=528f3df2e8d066a35a4e3f5ae7acdc54";
        String precionukmamaderas10st;
        String urlprecio11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5190303add1c7673ef0bc2df23851ad0";
        String precionukmamaderas11st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionukmamaderas1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionukmamaderas2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionukmamaderas3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precionukmamaderas4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precionukmamaderas5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precionukmamaderas6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precionukmamaderas7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                precionukmamaderas8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                precionukmamaderas9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                precionukmamaderas10st = metapropoerty10.attr("content");

                Document doc11 = Jsoup.connect(urlprecio11).get();
                Elements metapropoerty11 = doc11.select("meta[property=\"og:description\"]");
                precionukmamaderas11st = metapropoerty11.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionukmamaderas1.setText(precionukmamaderas1st);
            precionukmamaderas2.setText(precionukmamaderas2st);
            precionukmamaderas3.setText(precionukmamaderas3st);
            precionukmamaderas4.setText(precionukmamaderas4st);
            precionukmamaderas5.setText(precionukmamaderas5st);
            precionukmamaderas6.setText(precionukmamaderas6st);
            precionukmamaderas7.setText(precionukmamaderas7st);
            precionukmamaderas8.setText(precionukmamaderas8st);
            precionukmamaderas9.setText(precionukmamaderas9st);
            precionukmamaderas10.setText(precionukmamaderas10st);
            precionukmamaderas11.setText(precionukmamaderas11st);
        }

    }

}