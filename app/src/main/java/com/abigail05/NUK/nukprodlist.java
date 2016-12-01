package com.abigail05.NUK;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.Avent.aventaccesorios;
import com.abigail05.Avent.aventchupetes;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

public class nukprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnukmamaderas;
    Button btnnukchupetes;
    Button btnnukaccesorios;
    Button btnnukhigiene;
    Button btnaccesoriosm;
    ImageView nukmamaderas;
    String urlnukmamaderas = "https://lh3.googleusercontent.com/eUK1eCoj8zudq_iwuffoTJSn4Xwo8MQHX4d7D3x6NJiL99mNOQAbaPun7VXmukYVPhJb5_YEnjs5KgIaePce2giDy_I3kvvs5lXvFUY1ue16-LBkcYbwB19OQXucMqthiCsyAYiCQJqoEFmhWTn6kFEJKaLcYY1alpU0GhLnE_2G2MjoYaDxiYI6y6bK7Cez-5KnVtVWSS9x9mCAtbuzz3VD8ZKwZ0Ab3X77QPSQnOKCvwmGvES2tD809hAwn2L6Pcx_kxnqYWdfMtyFL-Ps4k0kvcoYKpubiT1WFXSxlcChFGQ_TsneTBcHqmCQCYj_ftT3lKHJ0uVxBMHhUGJDxRXUt2t2F5_UMWBJN7OQmLJFOm20W4kY_bfIusEyUY-0JvL0K5ruRCsR12LGxYbx_wHNiAvKFAzCY8_68N4uBMo__mhbbUnyeJpf3PitObGA5RYLaOx2-reFzUgDC3Vn8Qxx9qrzq-z9Vc_Hp1ITut2-mNdhiWfvc_BJ3Zo1BaCslisb7rxh1OnruLwSRcSaYnbevGLVxtR3LXD4e89MD7SJ2OpwR7qTunP0vfmo-0wzUha-HYw1BdEcG3RmmYbs1UPE2-h4ott1yGURouwMSyUeO5HXfQ=w234-h340-no";
    ImageView nukchupetes;
    String urlnukchupetes = "https://lh3.googleusercontent.com/YnTR21Hcd0sv33zSL-ZJMKfQn4TahUT7Y4xcLTz2Lac-sASSC32FXbMtl2VDxDuYdbneCFves9uo8pA7KVPc1997srh3IsFFTGxkqRZR7SZnqrTa9xr-IEWvAW4q8z8IRYZb1Y2mXt-aymWYRwVFJGvcNiKQi_d1ljLzA1Z7yDj86b1545hp0GkPEmGIjDIJeQ6FRElvcTPCt2zayU7QYhrWhZKgkqWK-IQnOhEZ1v7ZtNsMT-Coh_ssGqt7uNX01sMy2YknzkNKUGOqEd9FkUJKFITd0nU855Yc9CpjAakFASq9dRc35h7Kg8U2haFlmvfoIdmw_xEJIU2uw43y7QDi2-zVcCbKjOeqx0VWBpnJ-UzxhsXCXLVo7m4AhC8Y-NpWo60nEsd33GMjLvDfmY3zhuMdwIm82QySOOtQItwjI3u87eOAGp8Hyht5u9x4hleHTQjsY6MmPbcQAgs8oKwSK6Tj8biAQFAgWZ5OEAolGxy3ez6MpJwIdqMKXL354S_-8hr_wmbb3f0qqvom0A1s201ElwPuNMW-Ef6aujAPmWU_tmxjkfijUCYX3QKXXcB6iHPefKRbNNCAdGyUEIyKY01vTar8kEzIVwxFJLa7x1_4Mg=w346-h340-no";
    ImageView nukaccesorios;
    String urlnukaccesorios = "https://lh3.googleusercontent.com/d5kkBKcnCvPBrIRbeVQKVVqn6K0uaHJjfYh4a7ZX3JgvGJGmKIVVMoOcXrEzXEv98RPTX_CRMuW_bl4VnYfuSUQm9ZTTRHFX7JayXF-szHwU1Q3euzOZs9aEVEHeR1kLqqw-dSzH61G6rv6GigcBUnSv9G5Ka0WlOdB7Vl4MUxSGf5j95xy9HMp31Bq3olH1vhGIM9xQdb3akYTnF96MTh2Yw0SSqkY9RDaRtA83K2Wkzhta1DQjLjT2_d4n4sRDhSL-fGO68pCoUAhR4cUwApY2IPHifEIDvZep-j1DyFg1RXkDxXn6A1F_IZdvp8OAQGzyrtY35ZXGQEIH8VWoh06nl2XRX0MmqpSxaxJagqOK66rox-aETezkwWr6Lz2qbSl-abd2zZYgGmJ8IckKhyoZ2kIoO_Nq30t6_A4K0ERilOP2bLVd4OfW-BElg3RI1bYGNRhJcDKNfgyuaynN9RhT_JlcJn4SNneKuWxu-T838_7RBcJYls6P_VZT_xdTr3ZCc90_m5DVi4arfYW9ms4TnfpSjWy8hpQfMCOOUSnTbzuWGlyferbkd2CYwH1FubUHu42JGZXCToOb36Z4FuKNHIJuE8tW4aEyw_M18_8nbpkGXg=w282-h320-no";
    ImageView nukhigiene;
    String urlnukhigiene = "https://lh3.googleusercontent.com/IO0nUbmfPwB33DfPzp_1RTcxNBobOqAS9_E9XLdrtMXjbaBMHSqKE_JHPfFm0XX9A49jYFoOpIiKvt6cCtlF6y7Gw56N1pst-hqVhnB6yV4375Lp9V2Di-LlbF4x8pLQimZAlu3-2Tr6h-9gJQx1bJv69DV0m9HGWkL7YB_sFtIWLl7BPeOJRYX4PP_2IaBIMWrJoDj8Ynx3thwCDTC_MV3bCxyu_bQY5qj3LMq1HXuuv4xMF5hvp8xzVnl9SgnInnQnACHNxpKVZNZsqGNFgA12xQhMonJWSL-jC84-LVkzcneLFkMFTUkImJirAYNPwKX58H9ON0qJD2VvegRBIy2_OET5WopZVP0dlTHX4jpqymjBTrKfnvqtu1J8kUawf7dK14tQiSAEvnFcksp6eQ4zMighgznWEjvfTZs8UMWBZZDiaOjBkDmBlp3IzZ9hmFmkYzXvKNueEoJq-KKoRtAIlJhk5TY1MPEwRGvf1WpcAT-e8yoBWc_xMOq3PXn42V3AYzOyjDHINUznWlZUNyjPqLqnKjMgc3mBYrnlc52YBMqM3yh-vJVEI9tFoZAQMEEzon3MQLFvoVn0WaHcY1rRVotdNOdyOnPI2kV30XrpugZ8Tw=w480-h253-no";
    ImageView nukaccesoriosm;
    String urlnukaccesoriosm = "https://lh3.googleusercontent.com/dIzQjuXK1ltg1VW-s17z-hckc0FlaRb5pJk8vYyf4GPg17rz2FudBs7lSCIUvC0TPtrH2zByonoJY_oQq_HYDVfjlBNFxnphoKo6M5-3yxlE4Vc4rGWEfVPBTe8-iAzJWFa5ZMTSrwKDJ7z-6ZcW_Lr7rJB51oLCvKFbrBD5Br1SA3clCXK5QBucJpPOLdFNEAOfQHOvXsgA20XRbXobJyWSuAj622FNX3CbYsALDpcNDd-ZwXdatIxEtcHGkaI1RgIddHt_wmnZI0UT25vFtTP4866gSZLpUzieHXkAMTlua57gLLKYK_UwLibKPnzpSyM7RFQpNdlyG-noyu252cd5JWBG4tfk_obcJWo0nHpE5yGbAZUBN85JVDW0DqBpVf2z74R2wMf8ut_JfsnoZdl-BUv20pyrPptKgXtD706yFYFd320_DqXgI_9NLrCoUKBCvoOIHnbNP2eZvgAFOd4sFNAjWapAUIbJE7l-9WTs0vFUQcodWP9_9WVWQvJYt9KbMUeSbtf_YuCP_Qw4-MamNU9uABNmOiCQ8YVLMwmTW10ik1R3ZfET7v0do4pw-NbQdOhqhmENwQBzPtlGIDoBNxFAWQb_vjeNUsa9aurtP1QC1g=w274-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukprodlist);

        nukmamaderas = (ImageView)findViewById(R.id.nukmamaderas);
        Picasso.with(this).load(urlnukmamaderas).into(nukmamaderas);

        nukchupetes = (ImageView)findViewById(R.id.nukchupetes);
        Picasso.with(this).load(urlnukchupetes).into(nukchupetes);

        nukaccesorios = (ImageView)findViewById(R.id.nukaccesorios);
        Picasso.with(this).load(urlnukaccesorios).into(nukaccesorios);

        nukhigiene = (ImageView)findViewById(R.id.nukhigiene);
        Picasso.with(this).load(urlnukhigiene).into(nukhigiene);

        nukaccesoriosm = (ImageView)findViewById(R.id.nukaccesoriosm);
        Picasso.with(this).load(urlnukaccesoriosm).into(nukaccesoriosm);

        btnnukmamaderas = (Button)findViewById(R.id.btnnukmamaderas);
        btnnukmamaderas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukmamaderas = new Intent(nukprodlist.this, nukmamaderas.class);
                startActivity(btnnukmamaderas);
            }
        });

        btnnukchupetes = (Button)findViewById(R.id.btnnukchupetes);
        btnnukchupetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukchupetes = new Intent(nukprodlist.this, nukchupetes.class);
                startActivity(btnnukchupetes);
            }
        });

        btnnukaccesorios = (Button)findViewById(R.id.btnnukaccesorios);
        btnnukaccesorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukaccesorios = new Intent(nukprodlist.this, aventchupetes.class);
                startActivity(btnnukaccesorios);
            }
        });

        btnnukhigiene = (Button)findViewById(R.id.btnnukhigiene);
        btnnukhigiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukhigiene = new Intent(nukprodlist.this, aventaccesorios.class);
                startActivity(btnnukhigiene);
            }
        });

        btnaccesoriosm = (Button)findViewById(R.id.btnaccesoriosm);
        btnaccesoriosm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaccesoriosm = new Intent(nukprodlist.this, aventaccesorios.class);
                startActivity(btnaccesoriosm);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

    }
}
