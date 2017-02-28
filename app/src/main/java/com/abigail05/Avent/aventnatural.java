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

public class aventnatural extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompraaventnatural1;
    Button btnconsultaa1;
    TextView txtaventnatural1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3ed0ce591b116179260b0e605239b7b8";
    ImageView aventnatural1a1;
    Button btncompraaventnatural2;
    Button btnconsultaa2;
    TextView txtaventnatural2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a44b5a1f392314f1234d0f5ceb43149";
    ImageView aventnatural2a2;
    Button btncompraaventnatural3;
    Button btnconsultaa3;
    TextView txtaventnatural3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=90e5de4dcbdade80a077de3c078dcd09";
    ImageView aventnatural3a3;
    Button btncompraaventnatural4;
    Button btnconsultaa4;
    TextView txtaventnatural4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=942bf90fd3bf459942267ba05ddf857e";
    ImageView aventnatural4a4;
    Button btncompraaventnatural5;
    Button btnconsultaa5;
    TextView txtaventnatural5a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4db14fafcace0f069d478ae124efe429";
    ImageView aventnatural5a5;
    Button btncompraaventnatural6;
    Button btnconsultaa6;
    TextView txtaventnatural6a6;
    String urlcomboa6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4dcc086fb27308e70ba2736cd27a078d";
    ImageView aventnatural6a6;
    Button btncompraaventnatural7;
    Button btnconsultaa7;
    TextView txtaventnatural7a7;
    String urlcomboa7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=06af2f3209771555f8e9bc45dcbe717a";
    ImageView aventnatural7a7;
    Button btncompraaventnatural8;
    Button btnconsultaa8;
    TextView txtaventnatural8a8;
    String urlcomboa8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=702e30fc285e25bbb235beb165165150";
    ImageView aventnatural8a8;
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
    TextView precioaventnatural1;
    TextView precioaventnatural2;
    TextView precioaventnatural3;
    TextView precioaventnatural4;
    TextView precioaventnatural5;
    TextView precioaventnatural6;
    TextView precioaventnatural7;
    TextView precioaventnatural8;
    ImageView aventnatural1;
    String urlaventnatural1 = "https://lh3.googleusercontent.com/UK_SeyKcbYbe9uNwZ3_LWVYT7wXIWoPyCKzBUoneWmGSsIRDkyjiBi66-NjfgDNKYocUBziQdT9D7ROyA6AgAqRzCRUOXTgTbbVJd-GM49oGrbo5xMQIbKqwve_95Joxvf6SaKWFQ5zvcHDgqao9m0WEwdabvBRUBQ2guynMpJLSzEd2HO34Ef_Ou2YN6XughB5FxOb7wpbPaWg108eAgZunY6QRO_ayTODpX0B6GnqpL29XM8j8UhoBbd7AnZVVM_9EkYSGNO88pO5DzlPto25hmNSntkFd2JyemB236yy7W3xpsFgbqwykTkEFPJ8FyKlyANVPKbJeK8qY4Oa5FZm8751b2z1RRrYvZNsm9113bTar0rDpWNtKgG_ZQWxW6YXGURE_m-faao-ixfCaRwJWQZu-Md6FPdxU1QeAYqd2yHx-lffsNP1hJMc2PsMb-ne4_Tsaqk3UaCXbiRj-jEaLyuxc-McOSK3VIepBliuse4VnRUa2zSGNd6PBmjF1g8WGfcJUAG4X_RhTYyvWZKVlTbnawrG9U4c8FNQM_u1SEFKlNeYCV8RAZzBtCXT3KhZLeCSI3fl9XhR5_iMfJoJKoDopRGKbSN07g40EnUAfJDDeRQ=w494-h435-no";
    ImageView aventnatural2;
    String urlaventnatural2 = "https://lh3.googleusercontent.com/mWTh4Krv_JYq1-wPTdSFiDMyOanzvXHr8ZNXISmJDaoK2tJITUi8ZO6UK9s-2qYRnGZeOxB7x4h3tp--M8_M36Ikp3QR8XTgJvtpUooUQlbKGBVLj2gvfPAaEH886a6QH1johbdAT0AhuvVOhf782IA2vVV8McQptwwBwgYMMlNZoevsesdBPFyPNuC-cOoq3HnFkyTFNbAQFN9CZrPMWt6mthl0qTvzywDdi57mjSQlqy6U2bKxI5fRZq18k0zbKLIiVUQW72k5U3e6LTvpxIlu8nS4JpnsymEb6rsYja7zSxz59kUVDUSS7asisUF8hOWeJFxmavYLL0RNfdBVgf7LrmLedLxFwqgmyoVe_lq_6FyNE22zle6pPNs7uh-Z755aEFxtJFA5XS4ka9tcq61QNnSiIhoKOQD7thExncAXC6ChdNhpKonRTqtngGcXQb4jAq2EXEcDUYJqX-YDwwyOfNcEoWjYHVPnmeuZrDjtm_NSFeiTYlU80JAuqrdiIdeBSQSfx3_ZZLSX20_fmGaeMgr5RRRqQHsVW_2HGDbPaOGF9CcNRAhjMSeACKZn4hBPDmHApq7aBOtYDLa85g5TLtbv-98HDeqAbb86HCF7jzxjNA=w494-h435-no";
    ImageView aventnatural3;
    String urlaventnatural3 = "https://lh3.googleusercontent.com/FN_grY82MXxXoauLmYOVuKWI1iTeSbsYWmQCKdghPrwCoJUhyUgREUkzzm68DJnu6bwJRzGtPth7cdtYHq8e9fbl8n0LUKJRk9IbNZZyviaRkpUIfXMaivA-GWppZaDsqHhSjud3t1PF76UGrzyJl_l1CokfzafCvGoT2HfKqiESRpcYWoFQtSOnMhn0NN-QXNqDWAzd1yRlukl2leC0Pi0ZxIgsc8CP_JO-s7-n0xbAQtgkcJ3eNRtYNQY_DaSqpxgNzZZyE8PaGDmffQgCgsncxNi1LD_FXvRp4ke4ipbZYPg91Um-EAaEi9_cqIVSFky-RmRGLr-CgwdRSPb0XOcct_2_B5lkfFifW3W8TfuIER6nLXKdCS2PgSfNu2YYDxbs6cVJVJYE1TFzijG4y-D6Y-cQHJJeQH8zaTv3xfV3xPcvcbyTj18XBbIi6IAftRuFfpksDwChoL4phdUkK3dhQ1JW-iJ7GSrCCYKzqEgMPM38ev1gZIZPNwKLieFqp6EXVcnGfP-_UPUL0muyr8hOONCzyfDn1GEpT3HschgddmSsTrHddA79cGaBrq8IZpvRtqSP94KQk-jXRh1ysHRKi3UfGZL-PwyHf1n2FMIoe7DKJg=w494-h435-no";
    ImageView aventnatural4;
    String urlaventnatural4 = "https://lh3.googleusercontent.com/Thw-UWL6Xl1nICW9aQE4w2SFLWJWNqKrdcfEWrqZkYLy2wf0uNjCJ-_esc5yLaq8n_AEs9kvb8mkX5hHdmQC89j3KR99TEYlcwG1U8x_znjLXGOLPmCcB9TeIBBO2LM1JvmjJ0nTovcq8ImRg9-UT-jYCDKBf0zcC4zFBJ0YltiRvw2a0YNOH7ttBhUTz2OwHeblMJF-Axh_zCsLG4pbB5oOFpIfJ2lhQOxcGZU_CxtvdKtwVwyoFhyUUbVxnbpBjTnYm3iL3eKXcrEGNk6gSRsGOOp6DerOXBiYRKj5o4eOIKNfOGaBsePmdZP3uyNSFkB8I4N6Tw_4PUFV4YBDbDS3njtmBS3etb1pwEyWLkJIbL7vwaY1shPY4qEQa27NtE1wFY24Fy9TUJFMGdqCwHPzNzcggFM8p7dRhHYwMUgCy8dK2mPmyPSe1wm9adaOCAY-t4zTVjjqfEl7WopQgPsMZ3af-KAkI6EfZM3jIKG7ifuvNFZJc9b7gfEaoWiAaYOHfjZWMHQSDPQ1Ngcv0k6843HSJ0Yct1JovUGsdkYlRJxn0a8kNw5UY0VobNN7Bo9NUWRFMy0DjRk11RSnnh9WdtxZ5ML4oKSxnkAxAxHPN-Sz9g=w494-h435-no";
    ImageView aventnatural5;
    String urlaventnatural5 = "https://lh3.googleusercontent.com/mQzTNtsUw4zHrSs6kDYAnRX4DdSt1OJ9dU4ic9YgGTOvzVOs76HKMqL3u1VfQKu2tpvJ_lxSSS3Pqrg3bWDV57cRlNY2P5yv28bN8v6dD3eO6wnedTgPtS12l_2q8e034KWc9--UjjemCNap8VMJ0pc59fBe5wb5rxFdoWCsYrCJUraUgDcacRzsM3m7C6iQbbp5aJ0aaZzfOocVfiCzeiB0Fc6T_NpRLV9WeTaoOQC6Hh2F9KYYCx6IfBTOpDM_aGQIru9AUjnwdptAEFZM4MSPm3T94gmYF_NEbBrOaI9xamgwvkUX56WwgnN3eYe7zT-NAJF4wIFT3CglS73W7IrazE0G2XHSlTsst-bol-VOLnrA7GXmZcegMD0_jsAauaS9nhfLjhjcDbb0B_drpijqaDp8tyBx4UPpEoGkJ4nK_5Se7oOyOJH1V9fKzN50LK8W9Pdf2rGFrjgryrAI2F_8Ghgtw1a6KHqIj1vzbpqoqsADHmmsnL78DDdpCWQwRDcF9eIoqd2AEYnkhErWz7O0X74oD0Zby3m4oWyrgzz0dafsr1T9rUWip-4Ab2io9F1TA2up_zBFaJjhQ9a-JD4CGsJkUuLVojeX8Qyq1Tb9j-kp4A=w494-h435-no";
    ImageView aventnatural6;
    String urlaventnatural6 = "https://lh3.googleusercontent.com/TlVaaw3zsVBCndHgziTpFWkJeLy4ju0LJ-bYcrFe9L5e34l7A3coTKSOkNTTfIQI2bqA-a6Idyg7693QyEW5uztFBrQYaeIYc4W7I4e6mXkBWoitmoHDwnAuGJKuEkzvJOtvE10anfVQSWgGAD-MH2hKqjPEIM1a8I23-9M5uY27b6G1vKNahKtc8fh0oDI69PrVukLg2g6QK3gHbR49uvVGiW77BDL3pJ8Sr69-vK_76uJccFEi0G8PwWpEw4VQy1HlkIOp2hxkfyyaSsUsb6gOUVwO5qxxAIIa7BoSBE51dvx1JM4X_guhnvVeJNeI2BeSEEJM3H1Ex4fb-LENTAEUSfsvMnmA5RSVei0Cazbdrva827Mc9zfgT94x1qz9Sp0EE1cV8HG2M_hKzEhxTwjS7ewDnFPyVNcY6q3NJX9G-Amel4sj07xyZ_9uXk7-Za04QY97WxJoJ7xAcnJYyzNhNmUgz-wUnjwuKn5IjyZFyCMrVjLdNP4eL4mTXPqxjDtQbRbMSDn4-eZAt0K8eMlg2aB0qekX-d5xGy2ryUcW-QxyJTZyvovYrbrbGIkVAnK8XeUi03AmFNyb5g-ALwNwRUu0MDltpcL4fm7ApVe7ji-sbQ=w494-h435-no";
    ImageView aventnatural7;
    String urlaventnatural7 = "https://lh3.googleusercontent.com/LGvIw_IBSEDQZSQAQA_aalliZf01fDBgtvUh9_HBooF8hTkbIzg3nrjWclV_tn4DNlI9iTTY7bdwbk_pYYB92dJd16DvVlefjYjgRKhIY1DcrrtKpmb9mMMCxEXFkrNkQWFrs8JF_gyx-nfEHDHlglasolGGicLCbvewb7IcN0xhwzYRtrSiZJKhgqSBhLZ0zFRmJAH8NW5PGJkeNw4gz2F7R5Px4M40D8Xj8cdNzfZYkwOo-YiKVSPtz6AYzqo6crHQxfUVcTQ1H67KhSestub8IkSgNreqvMyHwJW3Llz-US7eq-Wj2Fp7-6eVdK9G2PnJ3aXeogmlAoGGPF_EzIQtNu3A5LdMDmZyI1ULb1VODd_nTbTPO5lIDV4EbSyJGrCqcGdQzJYVFAxcbttO-hl7A0SjeAB8xL0dmM1AyKBiGZdUniro2u3u4fAdHomXx4K6swgx-fpjJ8DRAkb8ZRINOzHckMPKPs9NofRJGh-DhjbgIrns9vpYX2uHuftnCqXj8IMyQJ1T5kjmy7XdDWZUP6Fry4dXiQj0EBUmOEy8kjVYJdxBZzR_LQnjf4QkyD4-qqoOwd1iArEHF3TNp3iJVUvtu0HuAr0KXlkvzQc5MtbEpA=w494-h435-no";
    ImageView aventnatural8;
    String urlaventnatural8 = "https://lh3.googleusercontent.com/f2a40sl0IvjKrgKefa900kEeEsYUfhbTU3xhydQXrHbZeHI4ljCAg4rFcgR4Q9BGxP1bWKxnMCY20NoLldc0kQ2d-InEzXEe7LmdD2xsFSrr9MtkPXOFbfhiAQLcJ0Uv0CfIK78mYsUejxyxR-d0olJMY6_wo4Ux3AYbBM-ubxRxlAlFjMZQ_rnc44Fk5LD_Q1kc2ht-RTg8KxBcytMIBriUiRfv356xay6aWUg69tnIKwnxr9juxE5ywSPzfsEF-IoKj3GOwFFgY7Lm0TW3yngPPXFYtn678DAQ_fYA5ylKRGRNTEnIg4mOhVP2tM43NVepbo1CxL1PBGoCgrAp3Jy1J7bV2OdQzWTXcWOKUSrkfIF7MhbxzRAF4wIh-M7zchA2GaBnpfDgDkDassQPcQvBNBD_OlukgsVH7gpq0ru8KEG9Nwm2JlVXC6_HGfY5VCerI1JiDFVbPaHPh_N9642PzNriTk7S97CcGwsEKf08mSQXoJWTYUg1uIgKCP3Lq99JfACSQn4qHQcE9tRZMIUkx-mW3LCpj7G_JRLT20lcP0Qd3cvSY5HLPg_mVM29ZM4rD8aqe5Jac0Sdq3lCWo8FP5FbfSyYdgED59H3aAkvv7D6xg=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural);

        new precioaventnaturalAsync().execute();

        /* natural 1 */

        aventnatural1a1 = (ImageView)findViewById(R.id.aventnatural1a1);
        Picasso.with(this).load(urlaventnatural1).into(aventnatural1a1);


        txtaventnatural1a1 = (TextView)findViewById(R.id.txtaventnatural1a1);
        final String stconsultaa1 = txtaventnatural1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(aventnatural.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });


        btncompraaventnatural1 = (Button)findViewById(R.id.btncompraaventnatural1);
        btncompraaventnatural1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural1 = new Intent(aventnatural.this,webview.class);
                btncompraaventnatural1.putExtra("string", urlcomboa1);
                startActivity(btncompraaventnatural1);
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

        /* natural 2 */

        aventnatural2a2 = (ImageView)findViewById(R.id.aventnatural2a2);
        Picasso.with(this).load(urlaventnatural2).into(aventnatural2a2);


        txtaventnatural2a2 = (TextView)findViewById(R.id.txtaventnatural2a2);
        final String stconsultaa2 = txtaventnatural2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(aventnatural.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncompraaventnatural2 = (Button)findViewById(R.id.btncompraaventnatural2);
        btncompraaventnatural2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural2 = new Intent(aventnatural.this,webview.class);
                btncompraaventnatural2.putExtra("string", urlcomboa2);
                startActivity(btncompraaventnatural2);
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

        /* natural 3 */

        aventnatural3a3 = (ImageView)findViewById(R.id.aventnatural3a3);
        Picasso.with(this).load(urlaventnatural3).into(aventnatural3a3);


        txtaventnatural3a3 = (TextView)findViewById(R.id.txtaventnatural3a3);
        final String stconsultaa3 = txtaventnatural3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(aventnatural.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncompraaventnatural3 = (Button)findViewById(R.id.btncompraaventnatural3);
        btncompraaventnatural3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural3 = new Intent(aventnatural.this,webview.class);
                btncompraaventnatural3.putExtra("string", urlcomboa3);
                startActivity(btncompraaventnatural3);
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

        /* natural 4 */

        aventnatural4a4 = (ImageView)findViewById(R.id.aventnatural4a4);
        Picasso.with(this).load(urlaventnatural4).into(aventnatural4a4);


        txtaventnatural4a4 = (TextView)findViewById(R.id.txtaventnatural4a4);
        final String stconsultaa4 = txtaventnatural4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(aventnatural.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });


        btncompraaventnatural4 = (Button)findViewById(R.id.btncompraaventnatural4);
        btncompraaventnatural4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural4 = new Intent(aventnatural.this,webview.class);
                btncompraaventnatural4.putExtra("string", urlcomboa4);
                startActivity(btncompraaventnatural4);
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

        /* natural 5 */

        aventnatural5a5 = (ImageView)findViewById(R.id.aventnatural5a5);
        Picasso.with(this).load(urlaventnatural5).into(aventnatural5a5);


        txtaventnatural5a5 = (TextView)findViewById(R.id.txtaventnatural5a5);
        final String stconsultaa5 = txtaventnatural5a5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa5 = new Intent(aventnatural.this,contacto.class);
                btnconsultaa5.putExtra("consulta", stconsultaa5);
                startActivity(btnconsultaa5);
            }
        });


        btncompraaventnatural5 = (Button)findViewById(R.id.btncompraaventnatural5);
        btncompraaventnatural5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural5 = new Intent(aventnatural.this,webview.class);
                btncompraaventnatural5.putExtra("string", urlcomboa5);
                startActivity(btncompraaventnatural5);
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

        /* natural 6 */

        aventnatural6a6 = (ImageView)findViewById(R.id.aventnatural6a6);
        Picasso.with(this).load(urlaventnatural6).into(aventnatural6a6);


        txtaventnatural6a6 = (TextView)findViewById(R.id.txtaventnatural6a6);
        final String stconsultaa6 = txtaventnatural6a6.getText().toString();
        btnconsultaa6 = (Button)findViewById(R.id.btnconsultaa6);
        btnconsultaa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa6 = new Intent(aventnatural.this,contacto.class);
                btnconsultaa6.putExtra("consulta", stconsultaa6);
                startActivity(btnconsultaa6);
            }
        });


        btncompraaventnatural6 = (Button)findViewById(R.id.btncompraaventnatural6);
        btncompraaventnatural6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural6 = new Intent(aventnatural.this,webview.class);
                btncompraaventnatural6.putExtra("string", urlcomboa6);
                startActivity(btncompraaventnatural6);
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

        /* natural 7 */

        aventnatural7a7 = (ImageView)findViewById(R.id.aventnatural7a7);
        Picasso.with(this).load(urlaventnatural7).into(aventnatural7a7);


        txtaventnatural7a7 = (TextView)findViewById(R.id.txtaventnatural7a7);
        final String stconsultaa7 = txtaventnatural7a7.getText().toString();
        btnconsultaa7 = (Button)findViewById(R.id.btnconsultaa7);
        btnconsultaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa7 = new Intent(aventnatural.this,contacto.class);
                btnconsultaa7.putExtra("consulta", stconsultaa7);
                startActivity(btnconsultaa7);
            }
        });


        btncompraaventnatural7 = (Button)findViewById(R.id.btncompraaventnatural7);
        btncompraaventnatural7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural7 = new Intent(aventnatural.this,webview.class);
                btncompraaventnatural7.putExtra("string", urlcomboa7);
                startActivity(btncompraaventnatural7);
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

        /* natural 8 */

        aventnatural8a8 = (ImageView)findViewById(R.id.aventnatural8a8);
        Picasso.with(this).load(urlaventnatural8).into(aventnatural8a8);


        txtaventnatural8a8 = (TextView)findViewById(R.id.txtaventnatural8a8);
        final String stconsultaa8 = txtaventnatural8a8.getText().toString();
        btnconsultaa8 = (Button)findViewById(R.id.btnconsultaa8);
        btnconsultaa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa8 = new Intent(aventnatural.this,contacto.class);
                btnconsultaa8.putExtra("consulta", stconsultaa8);
                startActivity(btnconsultaa8);
            }
        });


        btncompraaventnatural8 = (Button)findViewById(R.id.btncompraaventnatural8);
        btncompraaventnatural8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural8 = new Intent(aventnatural.this,webview.class);
                btncompraaventnatural8.putExtra("string", urlcomboa8);
                startActivity(btncompraaventnatural8);
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
        
        /* resto de código */

        precioaventnatural1 = (TextView)findViewById(R.id.precioaventnatural1);
        precioaventnatural2 = (TextView)findViewById(R.id.precioaventnatural2);
        precioaventnatural3 = (TextView)findViewById(R.id.precioaventnatural3);
        precioaventnatural4 = (TextView)findViewById(R.id.precioaventnatural4);
        precioaventnatural5 = (TextView)findViewById(R.id.precioaventnatural5);
        precioaventnatural6 = (TextView)findViewById(R.id.precioaventnatural6);
        precioaventnatural7 = (TextView)findViewById(R.id.precioaventnatural7);
        precioaventnatural8 = (TextView)findViewById(R.id.precioaventnatural8);
        
        aventnatural1 = (ImageView)findViewById(R.id.aventnatural1);
        Picasso.with(this).load(urlaventnatural1).into(aventnatural1);

        aventnatural2 = (ImageView)findViewById(R.id.aventnatural2);
        Picasso.with(this).load(urlaventnatural2).into(aventnatural2);

        aventnatural3 = (ImageView)findViewById(R.id.aventnatural3);
        Picasso.with(this).load(urlaventnatural3).into(aventnatural3);

        aventnatural4 = (ImageView)findViewById(R.id.aventnatural4);
        Picasso.with(this).load(urlaventnatural4).into(aventnatural4);

        aventnatural5 = (ImageView)findViewById(R.id.aventnatural5);
        Picasso.with(this).load(urlaventnatural5).into(aventnatural5);

        aventnatural6 = (ImageView)findViewById(R.id.aventnatural6);
        Picasso.with(this).load(urlaventnatural6).into(aventnatural6);

        aventnatural7 = (ImageView)findViewById(R.id.aventnatural7);
        Picasso.with(this).load(urlaventnatural7).into(aventnatural7);

        aventnatural8 = (ImageView)findViewById(R.id.aventnatural8);
        Picasso.with(this).load(urlaventnatural8).into(aventnatural8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural.this, MainActivity.class);
                startActivity(home);
            }
        });


    }

    public class precioaventnaturalAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3ed0ce591b116179260b0e605239b7b8";
        String precioaventnatural1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a44b5a1f392314f1234d0f5ceb43149";
        String precioaventnatural2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=90e5de4dcbdade80a077de3c078dcd09";
        String precioaventnatural3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=942bf90fd3bf459942267ba05ddf857e";
        String precioaventnatural4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4db14fafcace0f069d478ae124efe429";
        String precioaventnatural5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4dcc086fb27308e70ba2736cd27a078d";
        String precioaventnatural6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=06af2f3209771555f8e9bc45dcbe717a";
        String precioaventnatural7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=702e30fc285e25bbb235beb165165150";
        String precioaventnatural8st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precioaventnatural1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precioaventnatural2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precioaventnatural3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precioaventnatural4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precioaventnatural5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precioaventnatural6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precioaventnatural7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                precioaventnatural8st = metapropoerty8.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precioaventnatural1.setText(precioaventnatural1st);
            precioaventnatural2.setText(precioaventnatural2st);
            precioaventnatural3.setText(precioaventnatural3st);
            precioaventnatural4.setText(precioaventnatural4st);
            precioaventnatural5.setText(precioaventnatural5st);
            precioaventnatural6.setText(precioaventnatural6st);
            precioaventnatural7.setText(precioaventnatural7st);
            precioaventnatural8.setText(precioaventnatural8st);
        }

    }
}
