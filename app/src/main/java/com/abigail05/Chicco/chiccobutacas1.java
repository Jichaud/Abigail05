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

public class chiccobutacas1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    String urlchiccobutacas = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a9e3a888118947ca397d2761376e8010";
    Button comprarchiccobutacas1;
    TextView chiccobutacas1txtdesc;
    ImageView chiccobutacas1;
    ImageView chiccobutacas2;
    ImageView chiccobutacas3;
    ImageView chiccobutacas4;
    ImageView chiccobutacas5;
    ImageView chiccobutacas6;
    ImageView chiccobutacas7;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    TextView txtmodelo6;
    TextView txtmodelo7;
    String urlchiccobutacas1 = "https://lh3.googleusercontent.com/lcadj4raCW8tpzz3MjJglrAiv7rrFR1htf6KFtoqJMKPcSZvp9NGvpafBXLfOzhpmZIyh83sa6M6fbHbRrCZ00iGSs7p5qO5cHa93XBJ_jmYp83A7jx_VuRlcNXn-10xX_1d6K3NespIJ6TdqjOHa-vrmlsqvkUkpkEUXMkozpv4p_B132OPlrnYXbSGRGs4EwbZFo4Z01ZPsZZL1Cd8yQEOWSwgzuZAJcNv0IdQmj_kq0S3A1R4s3mCkFrz_zzx8h-Y6kqPBvLvB-oCjV8571BM2x9UfbZzfSKMjP2LJ5c-T88x8BEmNf8h1y1SBpHhDqtok9v79PZPXmAA3jbEACKlhh5ZbrIGIC6upPDitCAmApnwU_TBYQ2n9JUSXqhxuTV0lE-sVKC_YxVuv9RB63yUgpxu2Xbe4IxJWmH8x8IENusQIJomc4ZxQaKgwg1Wn5lxf_RoLQ3ThrfOj_hTbNIxRReUaRWLOkjOeRwPIT7oACRzlzyQCE2tQJa4ZY21RY2iLXsHPSPuYR734jLcTWb30wWphx0Ba8UBN3QoDm4Cw-LI5MalceonDpt7WSYE16OGss-6lRKwkR00NcCfsuu-0KWyHsOE-MbRppbulynWfPCrzTOQy4kH2nTTDs5X8aTS31vMBP5vA81cBVyMwxjTOyU5DmMwXW4PXq6B_eU=s725-no";
    String urlchiccobutacas2 = "https://lh3.googleusercontent.com/Be8ObLbUQy1CdmFOCvG6zEAOyHa_QauB2igNMvzEhp7ya1iR_QXt62Lu2zFryJ2EhhmLnlUx0P9u8KVX5TXuKhRAYpjOER58RpMYLGc3DBGt9FYUm9na2QtK1n8E6QWUY7QHlqV1KqxanjsuvTja0HtjKg-H-13jIVyk-Ysc4nzHP7COJbFcKOb1mal1rB_1lhh0YEwmVH-0KXnuGILdkC03JbIM5_GO4kwrog2ufnLgGrfs2qOgzq394k3lcKBR3hj3EEizHSCbgjs3jcOubiKZGdGHzTPpL33pRWtUWxT0aB8J2wdDfov3O_IuOCJT8ibKrTSgHOpcCjD-xBNll-T8qt2r7O3N_-aqCDPzqHeKTHektUq_3xrOsuUa519PsqU27XQGwywIhJiT_GLyzdD1Lagg0x9GT5VRMO8OBKL5bgjrgjpHXq9v6tQByQrvSxWL6b3Al3qwYKJVdW2sT7OPX74z3ytf1DnwCbQomq_Vtq10SL7fPgyUvUbSrMAwNb6lEeMqXBgYfFxYZFGHKVOwgDkxPUcaZ2BwMcZV87VIfImc0e5_tMqy6xeZWB1jMwmBWS-vzhqXdxJBQTcR5yARs77YH_cOeUdad0lbmDuAlhT0BEYKap5q2z1_3eQInjHpsIMpyWHT9GhnaI2oSAPMIieKbtemb-ucq-kN6Rg=s725-no";
    String urlchiccobutacas3 = "https://lh3.googleusercontent.com/LoltLjhpuI4ablrV8Rd-gPWAe7rSS-860AgFg_FgQlRiLerzdyl8ugRhfd7r7LbPD96NZ5nW9mcZWRYPJMhSBju9NTlAC0QBhtm_WhPcY6Zsw90fwPbvzLazavPThL407bktfG9qIu7rmpxOPsPCMloX6etC66QdrPVUoNY52CqVv21QMeeBDDyHIocM6ykCwneLh3OutkaUtHrRH8uBiu-xepYkmEhmt66Pl_nNr_QMHDxSXMe-pSweTKVx3ExjTBTQuDrRQuwQMT6HA14k_FrpHpfkn3nBJRsKL3jgpf38TAAsaQ2aQ0R1saEN_nyqZA2cmUoGDzeCNbHoXooK1S5sIo4VYu7vpqdLXLNgDe-yA-9ljJYqAKUEiSB6c2u69xi_Mf2whD0zmCJlpeUeSYGyWixf9w0oyDs-L65H01dtmVu-dg5z6DyF_cd49LIfYL-rbmeYd-blg3jz_Sz0WIcgV4wq7rmIeFz1hbGgY2Fk6rxIKP7jNKniIfTvF8qxgRJolVDpRNSUMxFlZmj1T5cm2n7Z_dtAp6QODu0--MJAHun6fFjk_sWxJh3i2fbG-cEha6hK-QYLFqfV3tLy8qpI6vILz74I_567e1kpCmuZJH4zEqOIA3zAqsDkp_v50MpU_nFtPoCloWvrY5W57JG4Dbk_3ZctdWdfhKcyy_o=s725-no";
    String urlchiccobutacas4 = "https://lh3.googleusercontent.com/t_dNvtrQAuC0EB9--3evS94SLhTl-DrhJYVwwtuAGRr7ETGFBE32IZ096X8skU8MkSFQ_0CuYA-6uneOa3d4osKyVyQjOVeglR2Hwh8rRrYtXMoyVkt8aSSN7Y5vL7LT1fugDq00Kf0hgIjjQhUFp7FiUxfhJjqPB9iORCYGvTd5_5i0B-sSqZsFKOAktx5csx3QQSMTQQnMEQiy-aMXGWuFgg3lFkhX8A75kQBAdMeG32QSHdmCmkfr9x6RvNIUzC6V2eGnp-ftuWfIUmwdZcPnihUjPqw1hS67pYqxfDXP_l5tgou7Temiqrft-0VESqoHZoQOiDKDsYa3wzNQ5iHbig51c79Cn2FXuMn6UGB1Y6AL0rwO2XtxueujbwGJw6KMw1QzIMGMqMs_z9op-ODK-ORM7fsJxP8DP5ZV8wr8Y15RaPkvHOLODhOh--SXdiqh2e7QepjPJ1iO6f8cp7-PGPpnYM5jLSZppjycKAhDL9ZQgRpIrItWTdZMRpuxUzhajybWWVtpZYF5oD2wnSeTj323JyRz3hIuUhFBtAB_Wa1kkmjCS_egsGmLvL_Thh9V1mt5qBmUUEBt1N6CRG1nNg3auDvk4O5GLegWdgMJrHaq13dcZTV4_tvq-UTr8o2Zh2RfD6Gck65QmQxGDbvv3uAvkETcHQt0kkmtGlE=w740-h400-no";
    String urlchiccobutacas5 = "https://lh3.googleusercontent.com/tv_eGYKUUY57RH2_LPdpRuRui44EkZyc_3KEDYtQX1-aAUIBQye5J9XAeytNUA6UdTSi0rWV7lt4KJ-YKyEyXbJnVfm3InBinee6FNMRm2iB0qvqa4aXB7qiYnT8f8AFAOhdKGG0opvulmzETqqhMgR15dbANAVH8YETPv00D3Ee-ah_R09wbeYDfW4tSZ2THiVjTG5_lRwUbDrBrazo0dByB6_dtc2wXdldfTHixk9ThdAAjMKLEvkFdSZbXXFslv6v5Bg-1P5tehyAKWUInAJbMwtqX05kh2ROa_7NoYfGKclRpsyFmbIhu00HMlSaFFNzkO4f3Xo0UDi_nW4y7xWGW8y9dnRnLUb0mKuNjH2ovbZvfW6VJuo63FjOlva-K3OS3ZPw-Eh7mvhAqpizfL084SDv0X3jgu47AAsEJS0PnMBt5jWpip1FZF9bb5y8hRYrjOcJI7FBqrYNmMoTnbTqKfvBEKvNuC8-aooCzfeCLKzLs_Pb07HXkny8cDfUVQYD_AEkteBrjaYKsS7WWniMgtUf2Sw-CSWfB8C8nSxJxNxze6rHAgleArZD9cnD44GNi0HIXwzAHRY8oQ88u8OuOpPOJbPvdjGGEFaDMjjqu-8WAWZJV4FN5d0Bg0w0YpJUkVCnpH-6nflmfHQRdnbpEA-4B9DbXCnsLOaF70I=w740-h400-no";
    String urlchiccobutacas6 = "https://lh3.googleusercontent.com/j_OzpgtTz__fW9ftdhc6IswGNs26_0sXvRrtxF4m70t4jOg5_Y_3cTlY3w5yUkMaDCcOkdGoS2c07dFLGgzacLAto-kRKJgHKYlNNy4rQeJp4EI38l0e5LqhMXHlsgHWg7_46YN2-9fWK0mBE_J4WktJ3-SqySZ-9NoRmCPLjiYKLMq8J2JYPGS6x9sNyZA0TYnhKb0gqvdMY2FG3TsfFMOQ-1lD9JvY3pfxg2T6uXEc9EggclwT0wenaEyGHl16cqy_6YPJDJPRFVYBu8xgw2M531-uQUoi-1hQ4iSffBWZPuNX_O1HtEgQGvDrJ92by0nGkGQkVPxv9Bqa6ULubrfDTqt5btZMKfCO7y3Y_EXX1zcQGC1iZV6_rmEIALghIpCymH7lMzS-oppE9ZwTfACTuMUhjlIue1HdcUQNClsIs1yynLaM-4Wsl-ezM7sTDkLuxJY7DAzUNouBRq9Q5tsxviusj_5gKEsKr4FF_wMaHe6wZ7Js0J876QBpJRORPbHFZtyUvYFX88QvIdQ-2VC7Q8yCNuqeOMkQf3LPEaiP8jQBDc-MkEC_NUVOj7aLWnAZsDRyE8R6HKpIiXrDCnIZlPUpLpucD5Q-5EQwh3ZX9neKZZGkMt26KXRcZKB7pn7Cbl65Vu4EhHUo8I4iyiIi5wXZ8iSlIJeZPC6-6Ls=w740-h400-no";
    String urlchiccobutacas7 = "https://lh3.googleusercontent.com/1GZYixSGPJ-qQSo0zrWbQWgBd2MZi4oLSLl9gf53XrkavfZfRoAJwtC_5-nZdD1Z2SrOCB7LDgBNVcao5za7hoR8DoS5cdoUQ9N-H8KX6YNr5uajMA9qN86c9catQsQY8n5yV9HHO7tI-kFfwz_8HmSyLlN6c9otqTJvoSTwo1jgSwmoEUl4YWWZSK80DYmjgGFUbZdOjiu-JGvKsz8pd_BYC69xs4c1jHa9_EKJ0Z9uttzbc49N3u1LXgSLoD_foiOlgHkuEjAFH0o72gZWguL_yypcS_7lKqAKZUHkwqCm7yz6OJ44b9L-lxEm9ZSa3LU0oh0BceIpnjrk3yxwleviyM-3DOWXgBmBpBqQY5bR_r5wMIwR-aNLsR0CRsQ1pJLG9o1zCaSCxJXrEQhRAaOZk1jKw_sfO84vDMIIZOEV5L3546nbnRiQLZorjc5f8j9SMzdG1Z6Od8f49b0OQPbBClXRrxPofuG1-9y3zvL0QwPcOdQsgG9bGOi2UztjKdzrxdl-g2tpTRKdW4HFtZ0DLjhjfbD2PBlwQAZQf1SLlqfP15qr02Y_DthYoJjUy0keb4gfn0fQH9Fg7GfzVGRIKjn_0cx1dWR4_V-W1zhLe30FUO_rK8P4oPkeC-eLzFFy7SgkL8N5QxckqX_4JoeBh6hdJP0MPtp23-Ive4A=w740-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccobutacas1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccobutacas1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccobutacas1.this, MainActivity.class);
                startActivity(home);
            }
        });

        chiccobutacas1txtdesc = (TextView)findViewById(R.id.txtchiccobutacas1);
        final String stconsulta = chiccobutacas1txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccobutacas1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });

        comprarchiccobutacas1 = (Button)findViewById(R.id.btncomprachiccobutacas1);
        comprarchiccobutacas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccobutacas1 = new Intent(chiccobutacas1.this, webview.class);
                comprarchiccobutacas1.putExtra("string", urlchiccobutacas);
                startActivity(comprarchiccobutacas1);
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
                chiccobutacas6.setVisibility(View.GONE);
                chiccobutacas7.setVisibility(View.GONE);
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
                chiccobutacas6.setVisibility(View.GONE);
                chiccobutacas7.setVisibility(View.GONE);
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
                chiccobutacas6.setVisibility(View.GONE);
                chiccobutacas7.setVisibility(View.GONE);
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
                chiccobutacas6.setVisibility(View.GONE);
                chiccobutacas7.setVisibility(View.GONE);
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
                chiccobutacas6.setVisibility(View.GONE);
                chiccobutacas7.setVisibility(View.GONE);
            }
        });

        chiccobutacas6 = (ImageView)findViewById(R.id.chiccobutacas6);
        Picasso.with(this).load(urlchiccobutacas6).into(chiccobutacas6);
        txtmodelo6 = (TextView)findViewById(R.id.modelo6);
        txtmodelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1.setVisibility(View.INVISIBLE);
                chiccobutacas2.setVisibility(View.GONE);
                chiccobutacas3.setVisibility(View.GONE);
                chiccobutacas4.setVisibility(View.GONE);
                chiccobutacas5.setVisibility(View.GONE);
                chiccobutacas6.setVisibility(View.VISIBLE);
                chiccobutacas7.setVisibility(View.GONE);
            }
        });

        chiccobutacas7 = (ImageView)findViewById(R.id.chiccobutacas7);
        Picasso.with(this).load(urlchiccobutacas7).into(chiccobutacas7);
        txtmodelo7 = (TextView)findViewById(R.id.modelo7);
        txtmodelo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1.setVisibility(View.INVISIBLE);
                chiccobutacas2.setVisibility(View.GONE);
                chiccobutacas3.setVisibility(View.GONE);
                chiccobutacas4.setVisibility(View.GONE);
                chiccobutacas5.setVisibility(View.GONE);
                chiccobutacas6.setVisibility(View.GONE);
                chiccobutacas7.setVisibility(View.VISIBLE);
            }
        });

    }
}
