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

public class chiccobutacas3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    String urlchiccobutacas = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a82f2675d46912b84ff29d50e816c47";
    Button comprarchiccobutacas3;
    TextView chiccobutacas3txtdesc;
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
    String urlchiccobutacas1 = "https://lh3.googleusercontent.com/6FW-ae2iaDy6ssl43Z109SZ3hvjcdU7Cv_DtvBx49bT1f17YzAsQ9XrIt5lRfDlD5TrbwMzsLRXU0JfpxW8DJRWJ9Zui7OzdL-H8JVlNjQA2ywJ290Sag7FltWNQpSp9zUzSo_95v6yNuBVvrHKwuo-RGlc7E7xWsnGUrAj8fgBHLY5ywm9WH4RlUBBRagOkVISN4Vmf0VM2Zfsigt709ifCjYF56NatXYQuBvVjRwusKP4ZO4I79-YvOXbM3n5TK5oQHyj03QvLaTIrZC7HaTxCw35WyDGHX_k9lR2jVNLuQjZmO7hWWeDbmC9Cl_VlMMm0JeGsln8HMLDZ36RAfmPLYdJQOxnL-fihyeGvvmv5wFOX4UGhXGI_OJ45bYEaniNzkO8-_Y6Q9qB1rEh4O_-dEHFc2O3wiKODAPH99grTG5I9xQ5lDfyBsn5bfm13z8BugSXVumfU4hVDA1LAK-9xOwUumx_UPD65fHo1IdeR5UFM92zWObcPUd3303GW809k9XUI4-q_KsT9mGwI2LcT24t2kM7Q5pdHz9QCfH-luckDeA13NgVJupFpnkH2HYopyZEK4THAKl-A9yAxdIJCxFjJErrAfc56C0_StEIEckU7xV_bbhtd3pOagSG4SwG6TPC5I-DHX8nAgKSxA4wdel7PbTH2-Ww7C_iCwgk=s725-no";
    String urlchiccobutacas2 = "https://lh3.googleusercontent.com/1YKwtyHgQqQgtVIf-TeE7tHR-2iEb_2B5hPZNSa23dI3cEir72bDguXL8YSsa-VHzZycCmuZ4lvx34Z0ZIDSogfeBgNTZNN0FBFju7sXPYoD_r0GO4LJ7H4J0NLjoIYbcWIwuhgtaqnr31MyhxAxfEEGA5029g63WAjW6WTIhYbPbSKCceAtUR3y_n_U52QzkZ19m8xMMhNRFsl2sQKK9amc7jGJX4e4SHxKrZJjzIOr7XCKdQdacmYF8WTZkr7EmxqpaS39vqyP5N_ldmUEtJIPHMhC_EIwUkJbVzoAYQZKGASoOgMUiHWl8U-eAzxj6znHG2GEpP83HdtVTWPUImOX1jYJylCGstVxbXsGSeicgeL5SnjBX8FU0GOnoKtWx3R7Vd18rL5_floJ1BEDlJy-zWrCdCUZC4YvfBcnXvJ06wWGao4jwPDylrYMvCEVnsUYyIJdH3CEOSFI-6rlwWLeLwrLQCL4YKb_xEXDfB7EyviHGzKz5WF0nnx-gQDvSIThigOxOAmcFw7CB2jC_xVmig9Spln-sa-QyMQT72IxG-9trpZ1enWbrF63OCNMB9l1YkVy_xFGu2sp42mJH_cvdwaYU4vOs_zy6omF240jNSBRKzEYnNBKrzTEuINVsNudR6vjLB1SVpSiy0G-eIjYhPzFOzeYS0HJ9fTwUaw=w740-h400-no";
    String urlchiccobutacas3 = "https://lh3.googleusercontent.com/qfiu2jhkinWLWIF_6aRplbjFwhPX6vGMH2bOaQ8IbfKaj0lpSDLAGyALHVLZCVuqaj08YqQz64qE00gdfGCqqdLoksKsw4pEqZuI8GjZkkBpbsh5iseHv1wqFqEnYtggeL1vWzjBb63RBa0HFJlKbVw5KLvSmuo1fkm9dyHIKKq4JKiul-RECBJHiqTAUKRyRfQi1gYjRvSqpthxrd-ykBchcv_2HpAxxhsB60lB6GKTkDRqARQoGxn9imEUcCrSBB8BuknhD3ZGL--e_94AZj6cmYMY7Azn8ziBdbHQdAQpTmn9Ht4GtM94V3rCdiob6w8q_9bw8mTsoUsL3aj85X26M6mqx0muu_Am_6yCLGJzYMyD8Qe-q5kbIOJK5p9c0U_Wgc8fMNjuAptuxMcxrc-lwUoHqL6Hvz_iKr-LbBAPC9HVAyVTGtAVgXqJ3KeGNnrajg1LlGA2HL9O8l8pMGIF_nHQ07H4U6dpgK1ElDmOgO-1M-RhogmwZoIpEV34epEFAv4MXwIlclcK1mpcJepsUO3TVvvPzNIgXiiM8sdsZi0UFZ6mehBYt8VMkYsYKKntrtHddzsyKOJnLd8Rv2V1w_okUmt68DlR0PkzSdgJoxUOsFRtCFhclG_pPED7o78i5wlj3sbscSYff1rFj0x0rp_rra_CPqQQv1VMTZE=w740-h400-no";
    String urlchiccobutacas4 = "https://lh3.googleusercontent.com/CrsmxKkg6YNAC5O7MR_uH9eoDO3RKKOYSexjPJvx4zQm57uDiBGswXUDiaGf3SdwmetbVzTg7FCSRyYgt2hoQF25YzbiflDwcm5TmR3ZdYUmwBAr_W6e9lSeWH1cNmjl5ICrgAGsF2Qmiz8U-cOs9Bbnc1NjFhoeHfEjReU1Ne7xAb65le21gz3ts2Lt3iX4hpX4wZntPIsLdwDGnte0gfa2_lgpNQGS8bIcZ_qipYWnJ1hbGbQp3bIvExJBl03QG7M8qHy5CRK1slC_gJUwOZ2l5lAvaB2SG2WXA-V4a1Nz9ZPLZPECZ2z4c2ewkvXJHpzeC5EZmc0XjwyWuLhVuKBADJpC3axFL_CCbt4sorYs3d5aslFq7iZiP_JH6nrWL8pdiaaWbZ3ERQc3S1FPZ6ZiHQRbdBImp2A3AMA0FRGDPD0kqYCg0IX6w1VUyn8YHIBgBhoMdI12rDUECLWvuiqwBS7P0YXyejpGIX_eV2nj238bZ6HAkmMeuZGYyAYN6NeLG379r2p49c7Zd07JuRrQzl0jZGNEVp4yvwFpsm_t_Pi_L2OAstDKpsIc79SdnsHO-RDYfsVlNF4zXys3WNm1vH-weK6VbOyztaZuZMYp181wUpcMH3o2V4JMcbCxofuTC0Cn17WBVIPgHzFet0T3H5M3NmlTjjrbqjPqUcI=w740-h400-no";
    String urlchiccobutacas5 = "https://lh3.googleusercontent.com/C0uY0J48cqnZ06KPgAEzSqvwiTV5aRxx-k_p1G6AXwoBQwTi--IramUdUcwcfYQHpuQ6IYn1LlYClMu0LTet_U1jMVkIBZqzZ18QGAeKPcMbDqM2nXs9kDwmRD7FdapyxoWF1ovip8muwt6qHvs3luefRKmn1lquVASq8cMZ4epp5u7i3M1JnT5xqOs0e_MYUiAdOUrqguDpO_RasDPxuPJeUgC-RoCcKMuDa_Co6LXMPjVzvxQt1igyiCTTjQ15v3cW407V2my72wLT2MLZT0lp0TAAtiGyZLn7ynrTLVeLrFqubWbS7wdwajJGzv5izHyyz6rYzRGm23iZzTUxhYDcB1_EnaNCPszdr3F1UB6mq1xNalTwBJf5CkLRtdfqzVwF1fLnIUhD6z7l1kSc_e2mx5Dt5GHCG9zHyIH2KBhL81aGDyHfDv4nga_2q7EELL96smkJMxwJIKObNb-Fx9WlaAP-QZErRiY7Z1mJgktilwSTIiB49j1NbkNBnIEIBxDcaTyIFqEEPnB7QgKnIaw5EO2n-D7Rw9qn87zKkOwghxrwNZSbc2hZAhyHPDurjIH_v-zcQ_p4bDaQKsWgxMPz0yPNq3cRSP7tDvn_KUH_E4BT7a25h8lxtzHSplA5aVulCdDj9NgGjbl4dPsNX7jZoGHiT6HKY6AnQ2TbY8k=w740-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccobutacas3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccobutacas3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccobutacas3.this, MainActivity.class);
                startActivity(home);
            }
        });

        chiccobutacas3txtdesc = (TextView)findViewById(R.id.txtchiccobutacas3);
        final String stconsulta = chiccobutacas3txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccobutacas3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });

        comprarchiccobutacas3 = (Button)findViewById(R.id.btncomprachiccobutacas3);
        comprarchiccobutacas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccobutacas3 = new Intent(chiccobutacas3.this, webview.class);
                comprarchiccobutacas3.putExtra("string", urlchiccobutacas);
                startActivity(comprarchiccobutacas3);
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
