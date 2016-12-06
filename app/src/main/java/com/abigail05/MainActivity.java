package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Abigail.abiprodlist;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button vermasAbi;
    Button marcabtn;
    Button btnmail;
    TextView txtnosotros;
    ImageView abigail05;
    ImageView imgAbi;
    ImageView imgmail;
    ImageView imgmarca;
    String urllogo = "https://lh3.googleusercontent.com/BN2PVNdf8OxzxlPAi5a-iF4gAOKOaxXwUb9V4QnxWU6SwX1Gn9twRMG8RxFjYaqnhOK1bapd7k_WWwGEcZXcy8TJRXwVmNiO3N8CGFoxn7ZTnTxEIpu6BzFXTgn1iyFqZsxVPAfDf6segNIAZ1_Y2mNy8KiNX1Vu8ZPyox_PN_1Kz1mfREjd9oH8MtE2WE0OoqD1fXT7WdcFdS3pD_Wt11g2P9EXZtx0sAWwm3p5H2etv2zmilkFgpSbbqiGSkIYwqBNCUpKkR0DC3OCujOwmZhJTEf--XbwMhoK2Yzyegbc6SVSL0aZV_vAcPJxgY6OobaIm8peOMc6ysEkSiXqdZdWS-80r3rMC_ZWnKm3Vp8xRwlY1Baug3Lfj5bfCwO04izQ9e9jyDljkD4KBg3qk5wo2dcvBLK1B2Sfzm5159mc1Npx5IEH80dTngiaW0WDOOau1rjnbDPo8MOnZ63G7BxOdq-5fzeCztJ2a7V2YNM4JTNNZi_7pa5uM5x1x5IFGtgVYr8ouhkYevv867bvKxkWSRdk-3_qSvWmtlXfWaueTpSGxhREkOPmC-bWsD1NDK7XBp-vyJpzKgSyPTOBCbxLw_NbzMWUBeFLpYhAsLDTcfJJrA=w332-h128-no";
    String urlimgAbi = "https://lh3.googleusercontent.com/BN2PVNdf8OxzxlPAi5a-iF4gAOKOaxXwUb9V4QnxWU6SwX1Gn9twRMG8RxFjYaqnhOK1bapd7k_WWwGEcZXcy8TJRXwVmNiO3N8CGFoxn7ZTnTxEIpu6BzFXTgn1iyFqZsxVPAfDf6segNIAZ1_Y2mNy8KiNX1Vu8ZPyox_PN_1Kz1mfREjd9oH8MtE2WE0OoqD1fXT7WdcFdS3pD_Wt11g2P9EXZtx0sAWwm3p5H2etv2zmilkFgpSbbqiGSkIYwqBNCUpKkR0DC3OCujOwmZhJTEf--XbwMhoK2Yzyegbc6SVSL0aZV_vAcPJxgY6OobaIm8peOMc6ysEkSiXqdZdWS-80r3rMC_ZWnKm3Vp8xRwlY1Baug3Lfj5bfCwO04izQ9e9jyDljkD4KBg3qk5wo2dcvBLK1B2Sfzm5159mc1Npx5IEH80dTngiaW0WDOOau1rjnbDPo8MOnZ63G7BxOdq-5fzeCztJ2a7V2YNM4JTNNZi_7pa5uM5x1x5IFGtgVYr8ouhkYevv867bvKxkWSRdk-3_qSvWmtlXfWaueTpSGxhREkOPmC-bWsD1NDK7XBp-vyJpzKgSyPTOBCbxLw_NbzMWUBeFLpYhAsLDTcfJJrA=w332-h128-no";
    String urlmail = "https://lh3.googleusercontent.com/BrWpeiSZZfl_pCp-F3GivYAhmzzTRs_yrD08CKoIxM1AyVhJ0neo-KGRD9Zj3HgN4Yb8EQBTOPjmoaXa-sqpKfFYvkYrq7QfRDxKLV2F3zjeKTSQKh5xWWy8lI32JDcaRUg8RaoaqnJmUO21mbUgi1jdHadIHRxvSjtwnPRKMrFF8w9TygbgE2WL6BgV7CURDabLil8KIP50mTm0Ca7sgIC-hb1C5_8IcJWvTVBkwZhXeuVkPKjfB0LABJXva_x8ctPAOouO1ELWCsKNXDV694TKfT3glDlbdxtHZCu9cNz64HRmnOn6aZYmRtXARFauPtlMCEhZHoGsd9fmqvr1PuO95u4BqaiQSd1ChAnPev7Egt1e-m-isXmoFGZNB2UnYkgjmsQqy8LthKwPmcOb_zH32ymkz8dV49gAF5ksfFFfGYfaiEQlwgETQQLSCLSUfxyXpd32gDtfXxHQKcdxHRjOiv6yinR5rSEsifythE5RmXY9rMHdfK7NsbCgfjj3Exk1wK1vGEnnL7KV1lRCihCDK1NqvaASqmMk_vn_s0y5hPu-LaoGY-60xOG3VcpYHV9hveFwWst0fUccZK3za1VxUOKxxibh_3bRdRYxCRUuNR78Bw=s128-no";
    String urlimgmarca = "https://lh3.googleusercontent.com/gRhvrwzGXUP7yVm03c8x8rpUQlCBsfjvV16R_MM6eCgRSTiFsLOR1F3zHVV6AxupxQrSqYciVYFfhHbOLLI80Le7si2bvVZERSPuPYBkBj_YeebuVh9sFsiXlyOL88TFdER9Jxt00TQlhkHFlC5ft7LCoK1xKOS6tvlzgy3NaiwDya69mwbbFzczUnAzpGVgTZg29P_iVzWSyaCVKVAzI1HC-GKjbJH8MAgpIqBk4quqdehK60-0UtjcdjcaBTnfCluWrMiu0c55kWj8ooB8cT8oqX7dDGOsr1_HIl65wLOaL01ro6-kc9O1t4NDKGu7H6O-EbewB840c6MngCcA9ZTSvpZXFaYzBRywrsAGGmVbwklogrOMpbnka6lvp1aJ4XsCQCFmr15ClXtP5cqWt0sfRz3hpjG-aGiRCQUWJDhpApukiBMzg2qliWVNR5Odf8WjQxnf6ghNavTDt49hQsp6Ssq9SjzbKb9TsgJ5Mrz5_lg_HtmxSSrDcGZtAJQAGAT-l-rvkVdKLikO-vPOTCOGPiO2AtMtnscSlP6XZzug709yNZVbQKDUx_VmdeKzml5d6QQWoa4Oz7_IZW12X12JXH5ry6dmaNQQDG1U7M7P2lse9g=s48-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnosotros = (TextView)findViewById(R.id.txtnosotros);
        txtnosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtnosotros = new Intent(MainActivity.this,nosotros.class);
                startActivity(txtnosotros);
            }
        });

        abigail05 = (ImageView)findViewById(R.id.abigail05);
        Picasso.with(this).load(urllogo).into(abigail05);

        imgAbi = (ImageView)findViewById(R.id.imgAbi);
        Picasso.with(this).load(urlimgAbi).into(imgAbi);

        imgmail = (ImageView)findViewById(R.id.imgmail);
        Picasso.with(this).load(urlmail).into(imgmail);

        imgmarca = (ImageView)findViewById(R.id.imgmarca);
        Picasso.with(this).load(urlimgmarca).into(imgmarca);

        vermasAbi = (Button)findViewById(R.id.abibtn);
        vermasAbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vermasAbi = new Intent(MainActivity.this, abiprodlist.class);
                startActivity(vermasAbi);
            }
        });

        marcabtn = (Button)findViewById(R.id.marcabtn);
        marcabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marcabtn = new Intent(MainActivity.this,marcas.class);
                startActivity(marcabtn);
            }
        });

        btnmail = (Button)findViewById(R.id.btnmail);
        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmail = new Intent(MainActivity.this,contacto.class);
                startActivity(btnmail);
            }
        });

    }

}