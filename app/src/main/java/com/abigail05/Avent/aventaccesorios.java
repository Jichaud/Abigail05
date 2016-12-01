package com.abigail05.Avent;

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

public class aventaccesorios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnaventaccesorios1;
    Button btnaventaccesorios2;
    Button btnaventaccesorios3;
    Button btnaventaccesorios4;
    Button btnaventaccesorios5;
    Button btnaventaccesorios6;
    Button btnaventaccesorios7;
    Button btnaventaccesorios8;
    Button btnaventaccesorios9;
    Button btnaventaccesorios10;
    TextView precioaventaccesorios1;
    TextView precioaventaccesorios2;
    TextView precioaventaccesorios3;
    TextView precioaventaccesorios4;
    TextView precioaventaccesorios5;
    TextView precioaventaccesorios6;
    TextView precioaventaccesorios7;
    TextView precioaventaccesorios8;
    TextView precioaventaccesorios9;
    TextView precioaventaccesorios10;
    ImageView aventaccesorios1;
    String urlaventaccesorios1 = "https://lh3.googleusercontent.com/FxcdaUSuqoz2lXdLmlx8Tp1IQBYH5rdeTC6oJTxBFl11Wn7SndKvdYDBRMtJ2Jfyqvt5B9mP58oChRAfUFY8b00DOUjZRMfyuIt__YjjWj8tSRZq3sxEgmnMZLnrraC4qE2PNDL7ELn5mIdY-ptA2bVUwS2WEt0mgCws0XIwqtvGssdfRl65MBzkI_9Z0Z166A1WZhoBMqiRkJV1eP11LRNrE9zVlo-kJO9pHDwgTN0xoGGJJcLY89yaA7bTsBl5f_ePh2VUZAo0oHHXYpYgVJ3edgiyvHqLYwogKYPpYDadQQXlbovPAFV5qM7sFwBDNalel-28nH2xigbfvXU285M0eabgay0qivzWI0Yv8Q2EKEEM9DaMf-wT6jPKm0i-uqfJVMLb8P7R9dvHbIIGxVC3MBpwC7ARhfpUO2SNdpcMPl6vx_fBxMcfBCSVyRL1ZlTGQOq0V38U_WKZx8d1uZbwuUT4lTgsC8bIx31TXUWn1x9-fLHgNF7EHdJteDdcCsxUZkNz3J1IyJb4cCCBCiqm6bm76PaSqLU8vdC0hvqvx1g4IDHSPk42Z4p2_d7EKYKbO1QGSpJw_SFYz6_y5hGQKoAnKwc8DDFCS0LDMaFiqDcACg=w494-h435-no";
    ImageView aventaccesorios2;
    String urlaventaccesorios2 = "https://lh3.googleusercontent.com/5okm8Yz4EiP6h9Ytcry_zDALhrPMAseBHtB6puPjVbzub6m-h2wuCDiHuNzjLsQEQWxIwm6xvctJ2HTrjutD-xUcQpckSRYFjAF9xngeDGcmozp0KWXQP79Lq9vYYwpWYwJ93cLNH33IuuZ4C7Xu9MZ54VvhHaRh6FA_YasP8MXiZe8U-FnIs8m-O74H65MaoGMChUmPOYm9VrE6NjVmwbKQ-trEvHb4aA6o84cs_hLdShcOW7kDnbDVYQekjbcW3kOH5rbDHKaIWMSs_DbwxzhluBNfOMiRdCYQ4G5MXOk_mtot81TNar05IWz3OVsHu6-U55rO8u2v9M4Hykt0LHOF-g_U2D7WoxtJZATO03siyGJsn5m5Nks4eqpRNM3L7USR-YYmlbIlkgbKa66LUHcSq1q0MVFFKc8-b1tnvkModgY68bKYA2CYuzvukK42kq1LXceiptZa_sU0Ih-KNjzWZJtCJWeOmUqF_iAgGeQGE2scARsQSGiLD9zI2Nxr1QNyruYNPtV-TK9I_xTW4fmPkNhA8FR-dYb2UG9V4DREnroCAOjK7e_FkklW4R3pN-ZjdDF9LT91XKMFNDv11-gmRDrnaS_0ig6YQsN0ff933aGRYw=w494-h435-no";
    ImageView aventaccesorios3;
    String urlaventaccesorios3 = "https://lh3.googleusercontent.com/gfCnHkvHLVL7halBW4rtm8byHTyVjFULn1ucLjXNwyC5vhZa1uGiJt9mKf0MPYT9Ug_jBuLHT7Qnag045-i6Hu5ekhuXNBeLPpzu7A_ocSsml6GlV78O0x0RQDMRdPvYOfL7m_nU1u7lFUd62FUyz7Y1ZesME-GYoLchUfrZwXgxB00Yl36tMTVQQCBTyMtdCaZbVzb7Snp9JdZPT_4QseBIOs7gJj5UTKBunhKVktIvXw58rP-KIv9JFdnCKvIlxe8q6He1IWJWB66OpoZhXtK5FaC3UjC2igzReUeqQljZdlXiDVD77_sDWfSouqmBbIs0u1nwN-229XA-rlTFZTqbL1OdKeUNmYmXLMCmweuLvvmELfuJ05bhbKa-pys9ZltC1xX59kyVaYMgq03wjVHR5Nd7kItcMamKAAVoM_FsfG_DJFfE8NZCe1zzOE1-5FogMILPnB8s-qlV7I0foCE21uauCL8fNWYHEzujyNCJJp-6nJRhSHJo4Mv5hFMVl1b6_EwOhW_k2vOCrJsniew8qv_R4W1xRdB2V6NuOOJ2oxmXlcop-e3w0guGXtme1xQtF8_4PfB7hIWXfIniuYK-8B54sN1054iHrTArglCLSuN7mQ=w494-h435-no";
    ImageView aventaccesorios4;
    String urlaventaccesorios4 = "https://lh3.googleusercontent.com/kfLGW6yCvdguRF1HQ7yJh0w8XXM2P0Zp9iXW8a7eYHWmeYekiDnE9rbbLBsy_L1TP6YxD4O1Q0DXolwSYUUOr-kz7l0c5c64oDfL4VRRNcVo7tJBFa67R71a99EzSkT7btFmUXs33cqiHblpiZXjaDXsiVfuz8yFD5ZYSAl65QSNrCoGrxUy-pERuzL4kypS3BQiLfu_XsI-84dlMS14trj9GLffHKTsYQ6L5ON5sdMQKTxNpBB04UR1I4mtcLHn-UYdMbkZex-L2khiCjCqbyOjYBf9u8VNnWMoatNzwpJI3vXGOliLxgWw5GLM_znIHM09ggPPcPDpPUDk4iFQgXN1EhYaeQZGEGwzP8jhDLWZYamIsFSN89rUBfr8dOQZG61gq2AjBoeGnCaSerBx3940grJHfgoZHUFEqVknO3a7Z34BVOm_NrJ7sexRr5wzP0TXAW9oGfFDfWJDvOX6yeodxaYEpQvEW-P8xSedRJPEKNiycPQ0rMw6YNiXio56vWgVNZZ78KEsVbsg0vr9DsyywCKcOK5EquqaSCyQWOKmKkk9ZP84r3cY8ZaAeMQVUen_eO5lRFj5VzlxRpL5ChRZBeiPYcTAohIggJXlWAvcHJzj9A=w494-h435-no";
    ImageView aventaccesorios5;
    String urlaventaccesorios5 = "https://lh3.googleusercontent.com/7X5YeKSk8FK12hnqRGHaSxaLbDuZA1YKH-pVZqdeowPfbQemEPpZZJaenUtf-Tf7PZcucMPKfuYU1JnAS3n_QpvXyvZVkv6f0narp0UJo-Unxczdt5kENHz8v_A5ceaZbSc_Sh4Pzng0OBxjNCMH5xGqWcfo0YAB1rdGSiyL6zpSCL9wbANdenCsbBh7OQCCaUSqhYouwm_b44oNqZenoVF5NGv5pb63-eiaZ-dVf0K9zEAf7fVBEcLHrNiwcffllCQw-qynY9cuE4KiO3eN7gRWDXukxUiZ46PjIJbu9iW0GuCExP2jFhz6G3vltfgTQyrC3XCh0qKUNnv1cd89-HwWWe0cYvz7y6LAGdAL5S9WYJubrS3HPmIleNIS0dL8kNpOokkdUqO3_iYCStytP5-kL0EY6MP1aVe8QUYunUrhd9jNXp45EOhnNJp-i9J6CIBSF3wybYLkiImz1nWNMMnT0JrrdDRMrk1NQNRRh9FU1wtzcIKvYAGBccVsWK4L9HwkDC5m-iMs7JqjJouwkozYTq1GgxQNGHedqWkAc5UCX5MES9FBKIt4HOJSevt9PQrD5jLVPJwFUXTj4VfvySgC1zXI5YDfZ1VYF1H572EMHV4XEw=w494-h435-no";
    ImageView aventaccesorios6;
    String urlaventaccesorios6 = "https://lh3.googleusercontent.com/-6KyloQNPj3aCDANthx4NKivmMue0A6p76Md3KMXnkKCgpDEdbQOOqk-8neZj-60Lczrw1FiXL6dNCE6AuP3h-hFgZM4L_rvyGQfI6ormf8d9cQApWBHG_FvxT_ZoEe7PDz73yogUhpHBYK0dwJAv_pgcmfnz-UZT6FGlQKXRVOwoP7N5aGnjE-W6p3PzeqlRenE0-id03_X_1xfCfIhRtupwneCB-ASqMOk0wznzwQzn38dn2-5bScqDC2rXsljoG5K3zAYJ_jE72TAcKkBo3631OxCx_eBhLmeaTNcJa1MIuUpimTVvgJjia2E-l2pKT9JDZXenUJPCdjJaiqirUYR3UcnSeotZrI9PP-TIVe3E023vGEWkG49T0sdTDNPsDzK2cf3q3ED45a_8O-zpb0q88bu2h7bEgCJWVY2gVSdHdMNOI8Fqn3b0EMTApTRnRw0QNbmZRDFBFT1jPXQ-lF1EzltGkyo6xpPLkMhirpwkC5Zp0IcSkcJaErGXrMA4lxJoAOsrLyx7OCLHxcogb1KWHxW_8MNJ4yb6pIpEg9GvlB2rkJhtnwMFe_xPDXUEBmY6fjnaQ4UbzG7XkpC7sldUUWWy_Y68jtEQVhvb9t3BKKK1Q=w494-h435-no";
    ImageView aventaccesorios7;
    String urlaventaccesorios7 = "https://lh3.googleusercontent.com/yFr9hfLhd_9_ZvHMm0j70uxzvXH2BZlcpvtgFgle1w-noUXdqs_CBJmP3N4N4M_bWA9HneZPMY1KFv0LzSCQOCH5kejleDgzctVX5PPjhYtDpYU0SaH4Rqqp94I-U1evipeISpv_a8ADu6POadQO6O5p3I1DsfaaVTkw6P3K-8w-Q0O4QmdlVE_sYQLnaU6BXGRG75TJ5OPe1VroXHZYk43y3b9mgqbGk3FwKVhH5YTmAkjmHsOx7wEWKy_1UnWc_IpJWq3KnnkQ6nzniZ4ZJpEPcVeJ0NPC-Ap6H7Fi54mQtexSvh-AwGzO22QDjV6itl-5BrIyDcr2D6OM-ARuUwQSdaig1-VQgEhEcZVB_nQZNqfzyg457vncIPqE0q-Sr4griFQm64O1Pg4gD6detLVtrQypy6lNww2NpZusQlUOtHQg1mFhrFoTNYaSUGJK7DBS7ACsfQu9q_uP7eUzY5MXFh-htmXIjYFL18rI1FopnK5heCt-DRsr_YBSNwp9zvoyLImxnjtQFlZLfVTN7k47E50xtTsC7CpJSmvhaTRxa4XbuFxe_H5fhgHPo_VT3dUXR00f9_DxrfrXfzSO6jrrbFRdm7-LP-hMYIDtTe1esPJm2g=w494-h435-no";
    ImageView aventaccesorios8;
    String urlaventaccesorios8 = "https://lh3.googleusercontent.com/yFr9hfLhd_9_ZvHMm0j70uxzvXH2BZlcpvtgFgle1w-noUXdqs_CBJmP3N4N4M_bWA9HneZPMY1KFv0LzSCQOCH5kejleDgzctVX5PPjhYtDpYU0SaH4Rqqp94I-U1evipeISpv_a8ADu6POadQO6O5p3I1DsfaaVTkw6P3K-8w-Q0O4QmdlVE_sYQLnaU6BXGRG75TJ5OPe1VroXHZYk43y3b9mgqbGk3FwKVhH5YTmAkjmHsOx7wEWKy_1UnWc_IpJWq3KnnkQ6nzniZ4ZJpEPcVeJ0NPC-Ap6H7Fi54mQtexSvh-AwGzO22QDjV6itl-5BrIyDcr2D6OM-ARuUwQSdaig1-VQgEhEcZVB_nQZNqfzyg457vncIPqE0q-Sr4griFQm64O1Pg4gD6detLVtrQypy6lNww2NpZusQlUOtHQg1mFhrFoTNYaSUGJK7DBS7ACsfQu9q_uP7eUzY5MXFh-htmXIjYFL18rI1FopnK5heCt-DRsr_YBSNwp9zvoyLImxnjtQFlZLfVTN7k47E50xtTsC7CpJSmvhaTRxa4XbuFxe_H5fhgHPo_VT3dUXR00f9_DxrfrXfzSO6jrrbFRdm7-LP-hMYIDtTe1esPJm2g=w494-h435-no";
    ImageView aventaccesorios9;
    String urlaventaccesorios9 = "https://lh3.googleusercontent.com/-m41GF3BN_RwYQUI76p6MTbUdl0Q29mVJysi7k3GSDnhXXhEKS9cRMmPqlQ5BD4o2Sdc1jhAbNeJ0DiFRnjsUNRQfYzgOnXVpwyW__bD558QC9oBCmzvfAFUoj_L2EKLH8nuazg78ySNH9sOF4bGhD6Gnf6b05Kyubb3jspINOfGvcsqRqAJi5fNfSdmwCaHEV_TDH1BkNdtj7Vh_MM4eP4POa5SGFsko1TKxculmKQB3sZZwNwmBtuZ4PS6-RmcsdWWadQ2wmG0_ap5drtgRtbKwkNhUgAuc3xu5ZqxeQTgNA9YyY6Moh_iwODUE8hbp2NBQg2Kp5-V3B7Yb85IoIbDtu8-9O3-MXPRBEztgSdhoiLAxuXcPDTeeniHuQCsAGOXRuxe6FBnoCgX6Kov31Iyen4Ume3qFLEdr30WZILQw5BlcVv6zIlsdi7uqAsZ1dpQsVrpqCq348LAA0pkigIOOBJuK1YDF8Ed4ysjHOeQw5VlucOQmWBgWT7MpDFX3WgqMOHqqo8DtSVqLe7-zojqgnrwyzOLwjEbguoeLZbOQK4ZXrxRwFA7N-nwHgLs0TiZQKrNQtdMAQ9dozWjsN65HKVLJjgn2ICbLeHtnboHQGI0uA=w494-h435-no";
    ImageView aventaccesorios10;
    String urlaventaccesorios10 = "https://lh3.googleusercontent.com/kBzPZF7XnKOWkGbmXeP4YxTIMIkobcWCZe_-9DriyQGwoPGQKafuErB2QYdM46K8ZQBChgTa50GpLveaa1OBdYcC3MA29AnfwqSAF7Hch6Bps_MjzqFgS4TaZlYQgKqAqcxVxWTsCvWsGyEmlcD8YuZMj9Zq2ti04Sl0GXe0bTGeIeKZqfetHhF6Xf6IjuqOdvMvf9MaeVW3MBjKOc6o6HYbJyz7GUwwwYeOWGBB2Y7tMoug5aqPvLR1oxNk9pMzJTC1I5ixgxflEB9SIQ7UEumNyNKKRBLte9eIpvv31p45LjVcA4ea9Oe-wiYB7Qfmz5GjlTiKlVecug3UmyJjOibbfHDDL97NvtdH9x9weH8thIK7fHFlsIOBSAhyE1pQvNC2Z4W1xHbRuEFUPYDRhtQ7aNTyvYJ36YwLbQy4WNgItVHB4jRX9_dF586_sPou5ajg2BzcJXNZdjD-5zTzLIjGZrPbUL6c8eh021scweAnxxiWbKGQQ4vPCfd2lO6JJf2-OzD9K99v296YknMiWhxlH-y9sQuLS4S1hrzSNGrKraA1uCjmXz4qoFRH9v3114pV9QVGRM7NAj7o_n0OpB7uUkclmUSc6_o_sSBBNTR46oSR8Q=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventaccesorios);

        new aventaccesorios.precioaventaccesoriosAsync().execute();

        precioaventaccesorios1 = (TextView)findViewById(R.id.precioaventaccesorios1);
        precioaventaccesorios2 = (TextView)findViewById(R.id.precioaventaccesorios2);
        precioaventaccesorios3 = (TextView)findViewById(R.id.precioaventaccesorios3);
        precioaventaccesorios4 = (TextView)findViewById(R.id.precioaventaccesorios4);
        precioaventaccesorios5 = (TextView)findViewById(R.id.precioaventaccesorios5);
        precioaventaccesorios6 = (TextView)findViewById(R.id.precioaventaccesorios6);
        precioaventaccesorios7 = (TextView)findViewById(R.id.precioaventaccesorios7);
        precioaventaccesorios8 = (TextView)findViewById(R.id.precioaventaccesorios8);
        precioaventaccesorios9 = (TextView)findViewById(R.id.precioaventaccesorios9);
        precioaventaccesorios10 = (TextView)findViewById(R.id.precioaventaccesorios10);

        aventaccesorios1 = (ImageView)findViewById(R.id.aventaccesorios1);
        Picasso.with(this).load(urlaventaccesorios1).into(aventaccesorios1);

        aventaccesorios2 = (ImageView)findViewById(R.id.aventaccesorios2);
        Picasso.with(this).load(urlaventaccesorios2).into(aventaccesorios2);

        aventaccesorios3 = (ImageView)findViewById(R.id.aventaccesorios3);
        Picasso.with(this).load(urlaventaccesorios3).into(aventaccesorios3);

        aventaccesorios4 = (ImageView)findViewById(R.id.aventaccesorios4);
        Picasso.with(this).load(urlaventaccesorios4).into(aventaccesorios4);

        aventaccesorios5 = (ImageView)findViewById(R.id.aventaccesorios5);
        Picasso.with(this).load(urlaventaccesorios5).into(aventaccesorios5);

        aventaccesorios6 = (ImageView)findViewById(R.id.aventaccesorios6);
        Picasso.with(this).load(urlaventaccesorios6).into(aventaccesorios6);

        aventaccesorios7 = (ImageView)findViewById(R.id.aventaccesorios7);
        Picasso.with(this).load(urlaventaccesorios7).into(aventaccesorios7);

        aventaccesorios8 = (ImageView)findViewById(R.id.aventaccesorios8);
        Picasso.with(this).load(urlaventaccesorios8).into(aventaccesorios8);

        aventaccesorios9 = (ImageView)findViewById(R.id.aventaccesorios9);
        Picasso.with(this).load(urlaventaccesorios9).into(aventaccesorios9);

        aventaccesorios10 = (ImageView)findViewById(R.id.aventaccesorios10);
        Picasso.with(this).load(urlaventaccesorios10).into(aventaccesorios10);

        btnaventaccesorios1 = (Button)findViewById(R.id.btnaventaccesorios1);
        btnaventaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios1 = new Intent(aventaccesorios.this, aventaccesorios1.class);
                startActivity(btnaventaccesorios1);
            }
        });

        btnaventaccesorios2 = (Button)findViewById(R.id.btnaventaccesorios2);
        btnaventaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios2 = new Intent(aventaccesorios.this, aventaccesorios2.class);
                startActivity(btnaventaccesorios2);
            }
        });

        btnaventaccesorios3 = (Button)findViewById(R.id.btnaventaccesorios3);
        btnaventaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios3 = new Intent(aventaccesorios.this, aventaccesorios3.class);
                startActivity(btnaventaccesorios3);
            }
        });

        btnaventaccesorios4 = (Button)findViewById(R.id.btnaventaccesorios4);
        btnaventaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios4 = new Intent(aventaccesorios.this, aventaccesorios4.class);
                startActivity(btnaventaccesorios4);
            }
        });

        btnaventaccesorios5 = (Button)findViewById(R.id.btnaventaccesorios5);
        btnaventaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios5 = new Intent(aventaccesorios.this, aventaccesorios5.class);
                startActivity(btnaventaccesorios5);
            }
        });

        btnaventaccesorios6 = (Button)findViewById(R.id.btnaventaccesorios6);
        btnaventaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios6 = new Intent(aventaccesorios.this, aventaccesorios6.class);
                startActivity(btnaventaccesorios6);
            }
        });

        btnaventaccesorios7 = (Button)findViewById(R.id.btnaventaccesorios7);
        btnaventaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios7 = new Intent(aventaccesorios.this, aventaccesorios7.class);
                startActivity(btnaventaccesorios7);
            }
        });

        btnaventaccesorios8 = (Button)findViewById(R.id.btnaventaccesorios8);
        btnaventaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios8 = new Intent(aventaccesorios.this, aventaccesorios8.class);
                startActivity(btnaventaccesorios8);
            }
        });

        btnaventaccesorios9 = (Button)findViewById(R.id.btnaventaccesorios9);
        btnaventaccesorios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios9 = new Intent(aventaccesorios.this, aventaccesorios9.class);
                startActivity(btnaventaccesorios9);
            }
        });

        btnaventaccesorios10 = (Button)findViewById(R.id.btnaventaccesorios10);
        btnaventaccesorios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventaccesorios10 = new Intent(aventaccesorios.this, aventaccesorios10.class);
                startActivity(btnaventaccesorios10);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventaccesorios.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventaccesorios.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precioaventaccesoriosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5e0624fe163726e090e34eb10898ed58";
        String precioaventaccesorios1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e3cd9b82cdc5b8fc798411c4b5ea7902";
        String precioaventaccesorios2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1faa11e23629f8560ce31f9b5f5cf7f0";
        String precioaventaccesorios3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=736ba4fb69c99eb6774091d37490b09f";
        String precioaventaccesorios4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=76ea6ef94846d4202c32f828078016f5";
        String precioaventaccesorios5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c7f3c017947efcd1569ab4b5984046f8";
        String precioaventaccesorios6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e277bc500b7afff68b2eb8830e2aea0";
        String precioaventaccesorios7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=59901973afcbea0ffc2cbd0bf547bbf9";
        String precioaventaccesorios8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8d87a1cb8979ca6e93f15ba0c5091ecd";
        String precioaventaccesorios9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=527a0440ef4446bea89d5c8aca10cfe0";
        String precioaventaccesorios10st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precioaventaccesorios1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precioaventaccesorios2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precioaventaccesorios3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precioaventaccesorios4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precioaventaccesorios5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precioaventaccesorios6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precioaventaccesorios7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                precioaventaccesorios8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                precioaventaccesorios9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                precioaventaccesorios10st = metapropoerty10.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precioaventaccesorios1.setText(precioaventaccesorios1st);
            precioaventaccesorios2.setText(precioaventaccesorios2st);
            precioaventaccesorios3.setText(precioaventaccesorios3st);
            precioaventaccesorios4.setText(precioaventaccesorios4st);
            precioaventaccesorios5.setText(precioaventaccesorios5st);
            precioaventaccesorios6.setText(precioaventaccesorios6st);
            precioaventaccesorios7.setText(precioaventaccesorios7st);
            precioaventaccesorios8.setText(precioaventaccesorios8st);
            precioaventaccesorios9.setText(precioaventaccesorios9st);
            precioaventaccesorios10.setText(precioaventaccesorios10st);
        }

    }

}

