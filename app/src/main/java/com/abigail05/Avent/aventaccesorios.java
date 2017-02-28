package com.abigail05.Avent;

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

public class aventaccesorios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventaccesorios1;
    Button btnconsultaa1;
    TextView txtaventaccesorios1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=5e0624fe163726e090e34eb10898ed58";
    ImageView aventaccesorios1a1;
    Button btncompraaventaccesorios2;
    Button btnconsultaa2;
    TextView txtaventaccesorios2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e3cd9b82cdc5b8fc798411c4b5ea7902";
    ImageView aventaccesorios2a2;
    Button btncompraaventaccesorios3;
    Button btnconsultaa3;
    TextView txtaventaccesorios3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1faa11e23629f8560ce31f9b5f5cf7f0";
    ImageView aventaccesorios3a3;
    Button btncompraaventaccesorios4;
    Button btnconsultaa4;
    TextView txtaventaccesorios4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=736ba4fb69c99eb6774091d37490b09f";
    ImageView aventaccesorios4a4;
    Button btncompraaventaccesorios5;
    Button btnconsultaa5;
    TextView txtaventaccesorios5a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=76ea6ef94846d4202c32f828078016f5";
    ImageView aventaccesorios5a5;
    Button btncompraaventaccesorios6;
    Button btnconsultaa6;
    TextView txtaventaccesorios6a6;
    String urlcomboa6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c7f3c017947efcd1569ab4b5984046f8";
    ImageView aventaccesorios6a6;
    Button btncompraaventaccesorios7;
    Button btnconsultaa7;
    TextView txtaventaccesorios7a7;
    String urlcomboa7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1e277bc500b7afff68b2eb8830e2aea0";
    ImageView aventaccesorios7a7;
    Button btncompraaventaccesorios8;
    Button btnconsultaa8;
    TextView txtaventaccesorios8a8;
    String urlcomboa8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=59901973afcbea0ffc2cbd0bf547bbf9";
    ImageView aventaccesorios8a8;
    Button btncompraaventaccesorios9;
    Button btnconsultaa9;
    TextView txtaventaccesorios9a9;
    String urlcomboa9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8d87a1cb8979ca6e93f15ba0c5091ecd";
    ImageView aventaccesorios9a9;
    Button btncompraaventaccesorios10;
    Button btnconsultaa10;
    TextView txtaventaccesorios10a10;
    String urlcomboa10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=527a0440ef4446bea89d5c8aca10cfe0";
    ImageView aventaccesorios10a10;
    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    LinearLayout lineara1;
    LinearLayout lineara2;
    LinearLayout lineara3;
    LinearLayout lineara4;
    LinearLayout lineara5;
    LinearLayout lineara6;
    LinearLayout lineara7;
    LinearLayout lineara8;
    LinearLayout lineara9;
    LinearLayout lineara10;
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

        /* accesorios 1 */

        aventaccesorios1a1 = (ImageView)findViewById(R.id.aventaccesorios1a1);
        Picasso.with(this).load(urlaventaccesorios1).into(aventaccesorios1a1);

        txtaventaccesorios1a1 = (TextView)findViewById(R.id.txtaventaccesorios1a1);
        final String stconsultaa1 = txtaventaccesorios1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });


        btncompraaventaccesorios1 = (Button)findViewById(R.id.btncompraaventaccesorios1);
        btncompraaventaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios1 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios1.putExtra("string", urlcomboa1);
                startActivity(btncompraaventaccesorios1);
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

        /* accesorios 2*/

        aventaccesorios2a2 = (ImageView)findViewById(R.id.aventaccesorios2a2);
        Picasso.with(this).load(urlaventaccesorios2).into(aventaccesorios2a2);


        txtaventaccesorios2a2 = (TextView)findViewById(R.id.txtaventaccesorios2a2);
        final String stconsultaa2 = txtaventaccesorios2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncompraaventaccesorios2 = (Button)findViewById(R.id.btncompraaventaccesorios2);
        btncompraaventaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios2 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios2.putExtra("string", urlcomboa2);
                startActivity(btncompraaventaccesorios2);
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

        /* accesorios 3*/

        aventaccesorios3a3 = (ImageView)findViewById(R.id.aventaccesorios3a3);
        Picasso.with(this).load(urlaventaccesorios3).into(aventaccesorios3a3);


        txtaventaccesorios3a3 = (TextView)findViewById(R.id.txtaventaccesorios3a3);
        final String stconsultaa3 = txtaventaccesorios3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncompraaventaccesorios3 = (Button)findViewById(R.id.btncompraaventaccesorios3);
        btncompraaventaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios3 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios3.putExtra("string", urlcomboa3);
                startActivity(btncompraaventaccesorios3);
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

        /* accesorios 4*/

        aventaccesorios4a4 = (ImageView)findViewById(R.id.aventaccesorios4a4);
        Picasso.with(this).load(urlaventaccesorios4).into(aventaccesorios4a4);


        txtaventaccesorios4a4 = (TextView)findViewById(R.id.txtaventaccesorios4a4);
        final String stconsultaa4 = txtaventaccesorios4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });


        btncompraaventaccesorios4 = (Button)findViewById(R.id.btncompraaventaccesorios4);
        btncompraaventaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios4 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios4.putExtra("string", urlcomboa4);
                startActivity(btncompraaventaccesorios4);
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

        /* accesorios 5*/

        aventaccesorios5a5 = (ImageView)findViewById(R.id.aventaccesorios5a5);
        Picasso.with(this).load(urlaventaccesorios5).into(aventaccesorios5a5);


        txtaventaccesorios5a5 = (TextView)findViewById(R.id.txtaventaccesorios5a5);
        final String stconsultaa5 = txtaventaccesorios5a5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa5 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa5.putExtra("consulta", stconsultaa5);
                startActivity(btnconsultaa5);
            }
        });


        btncompraaventaccesorios5 = (Button)findViewById(R.id.btncompraaventaccesorios5);
        btncompraaventaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios5 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios5.putExtra("string", urlcomboa5);
                startActivity(btncompraaventaccesorios5);
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

        /* accesorios 6 */

        aventaccesorios6a6 = (ImageView)findViewById(R.id.aventaccesorios6a6);
        Picasso.with(this).load(urlaventaccesorios6).into(aventaccesorios6a6);


        txtaventaccesorios6a6 = (TextView)findViewById(R.id.txtaventaccesorios6a6);
        final String stconsultaa6 = txtaventaccesorios6a6.getText().toString();
        btnconsultaa6 = (Button)findViewById(R.id.btnconsultaa6);
        btnconsultaa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa6 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa6.putExtra("consulta", stconsultaa6);
                startActivity(btnconsultaa6);
            }
        });


        btncompraaventaccesorios6 = (Button)findViewById(R.id.btncompraaventaccesorios6);
        btncompraaventaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios6 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios6.putExtra("string", urlcomboa6);
                startActivity(btncompraaventaccesorios6);
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

        /* accesorios 7 */

        aventaccesorios7a7 = (ImageView)findViewById(R.id.aventaccesorios7a7);
        Picasso.with(this).load(urlaventaccesorios7).into(aventaccesorios7a7);


        txtaventaccesorios7a7 = (TextView)findViewById(R.id.txtaventaccesorios7a7);
        final String stconsultaa7 = txtaventaccesorios7a7.getText().toString();
        btnconsultaa7 = (Button)findViewById(R.id.btnconsultaa7);
        btnconsultaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa7 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa7.putExtra("consulta", stconsultaa7);
                startActivity(btnconsultaa7);
            }
        });


        btncompraaventaccesorios7 = (Button)findViewById(R.id.btncompraaventaccesorios7);
        btncompraaventaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios7 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios7.putExtra("string", urlcomboa7);
                startActivity(btncompraaventaccesorios7);
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

        /* accesorios 8 */

        aventaccesorios8a8 = (ImageView)findViewById(R.id.aventaccesorios8a8);
        Picasso.with(this).load(urlaventaccesorios8).into(aventaccesorios8a8);


        txtaventaccesorios8a8 = (TextView)findViewById(R.id.txtaventaccesorios8a8);
        final String stconsultaa8 = txtaventaccesorios8a8.getText().toString();
        btnconsultaa8 = (Button)findViewById(R.id.btnconsultaa8);
        btnconsultaa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa8 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa8.putExtra("consulta", stconsultaa8);
                startActivity(btnconsultaa8);
            }
        });


        btncompraaventaccesorios8 = (Button)findViewById(R.id.btncompraaventaccesorios8);
        btncompraaventaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios8 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios8.putExtra("string", urlcomboa8);
                startActivity(btncompraaventaccesorios8);
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

        /* accesorios 9 */

        aventaccesorios9a9 = (ImageView)findViewById(R.id.aventaccesorios9a9);
        Picasso.with(this).load(urlaventaccesorios9).into(aventaccesorios9a9);


        txtaventaccesorios9a9 = (TextView)findViewById(R.id.txtaventaccesorios9a9);
        final String stconsultaa9 = txtaventaccesorios9a9.getText().toString();
        btnconsultaa9 = (Button)findViewById(R.id.btnconsultaa9);
        btnconsultaa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa9 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa9.putExtra("consulta", stconsultaa9);
                startActivity(btnconsultaa9);
            }
        });


        btncompraaventaccesorios9 = (Button)findViewById(R.id.btncompraaventaccesorios9);
        btncompraaventaccesorios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios9 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios9.putExtra("string", urlcomboa9);
                startActivity(btncompraaventaccesorios9);
            }
        });

        lineara9 = (LinearLayout)findViewById(R.id.lineara9);

        switch9 = (Switch)findViewById(R.id.switch9);
        switch9.setChecked(false);
        switch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch9.isChecked()) {
                    lineara9.setVisibility(View.VISIBLE);
                } else {
                    lineara9.setVisibility(View.GONE);
                }

            }
        });

        /* accesorios 10 */

        aventaccesorios10a10 = (ImageView)findViewById(R.id.aventaccesorios10a10);
        Picasso.with(this).load(urlaventaccesorios10).into(aventaccesorios10a10);


        txtaventaccesorios10a10 = (TextView)findViewById(R.id.txtaventaccesorios10a10);
        final String stconsultaa10 = txtaventaccesorios10a10.getText().toString();
        btnconsultaa10 = (Button)findViewById(R.id.btnconsultaa10);
        btnconsultaa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa10 = new Intent(aventaccesorios.this,contacto.class);
                btnconsultaa10.putExtra("consulta", stconsultaa10);
                startActivity(btnconsultaa10);
            }
        });


        btncompraaventaccesorios10 = (Button)findViewById(R.id.btncompraaventaccesorios10);
        btncompraaventaccesorios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventaccesorios10 = new Intent(aventaccesorios.this,webview.class);
                btncompraaventaccesorios10.putExtra("string", urlcomboa10);
                startActivity(btncompraaventaccesorios10);
            }
        });

        lineara10 = (LinearLayout)findViewById(R.id.lineara10);

        switch10 = (Switch)findViewById(R.id.switch10);
        switch10.setChecked(false);
        switch10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch10.isChecked()) {
                    lineara10.setVisibility(View.VISIBLE);
                } else {
                    lineara10.setVisibility(View.GONE);
                }

            }
        });


        /* resto código */

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

