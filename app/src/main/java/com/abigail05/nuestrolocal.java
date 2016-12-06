package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class nuestrolocal extends AppCompatActivity {

    ImageView mapa;
    ImageView mapaicon;
    ImageView phoneicon;
    ImageView timeicon;
    Button vermapa;
    Button home;
    Button marca;
    String urlmapa = "https://lh3.googleusercontent.com/twB-0Ml0Y3vSasLKTa7Y1PaLZ9qzNKzmVQPXxXU3IwQw_otTDOJw7Hnr23ckWMlqk58WoK-_EuZChpB-6XErtTV7Etb7AgWa1nlRI9lvkZebXs7ug6ZWZe3p8qjSreB1FMuS43T1q2UDY7wvaCd3GALLTnbjBXGTwo7iI2qD8_KTCCkv6Qp1h-OkswVJz9ECJ-IHy4pvHSVL8ERhn8QF4C0UjnkYVBREOqRhki_Fzj4_RpoikEdlQkx9XjsBs_OgYzG8wCTPCTqIxIkrWMisd1J6UFAsljtWZbxRY9R0_IQMhN49cexWW1_q9BPVo3KXNSNpFwMXzn0NzQI1HuIgZ6t75SEwyfOGHA_C0yz-1F8EG2ykeajZtNlLeb7Om7Q_Nz8rQbVbdHKSHqz-0209g7olYH17tEZ7-0GaCFamNgmg1n1WFeTXX9JAz0GkcCEuYie7wVIsyQFtheEcRsJw9UGeyG-B57eUBjJv2-HL1HiJpMDQ-2l-N111osB5s1HsEx8Vrn7k3O9I0XV_ukuR5ZnW-hAtK7umnPAo9QLlB12wTXnuqLX4VMAXDgZ6fhv-HhjiwuLPw9LPcT-sSRv930714Nx5pdlN2f8aC1sCxdNaSaTC4VUc0yZ_11IMcDZ5Q_5fGtDhm72iD06o1C4CWEvjDWK3ikvtcssauqdV7iI=w681-h479-no";
    String urlmapaicon = "https://lh3.googleusercontent.com/hZAZnAU_p-Kqii0uiXxTLNp3nSyhMmt3j7_5Lb6BYazLQ0ox8KSQ-YbgQUsP5I7kKRNztOTYmzhI7do1UMinDoXxGGFBUsV23ChJntcrKT_QQQQbmaJjSqrbWz78o5kOr8roq6yGyfp1gfsKqlytuB5zdphmzGlSZM_cq_YHoxf5-GuNWZqx-u1ouD0Vvw1UMq7ALh0UcaHdHGGs5M1rGGmLhZLwi9gR0mQZVf8Ho6PTCowQI2ddE5BN8iRUlywC9TmNcyPW5cOrZKKA0U9aMv_lkhu80bSw_b-6R3SNALgW_8s89_Wm34TWeqwma_JNh9GKyq07G4OMt9WsgdXwv0lAbuS2EAaRl0sPtrGr8LkK4Owy_rHqCJphQtiCP4rmKOMi_JsgqfWxWttp_hwRlPquQw5kbC-W4VTacjxsqRZV8u9XbJfanjEqgboLO5YgqmWjMuBJUTaoPb2M-eAwztd-idhZY5J9nDSO4fWMo9J9W6J_fjrkvmP62PuIQ1vgpuG5gI_z-3YtTcVBZCqqJ-Xd4s33BCuzEDU4I0l1SqAI5k4QPOAZG37t7VYPX7F7D-Ou5dtPy90B1sbjMqojtDMrImxS-aJr-MVFUCe32L9vqSUVxrDgUXx3v0FI7NlIGIhx6FGW3QOgvS0uAScLFh9q_dLFOYFz2pvhicAA1vM=w240-h152-no";
    String urlphoneicon = "https://lh3.googleusercontent.com/aCrSH0sSsegxL29wTlmMEWgmXG4HyaqnticgrqSIY5BU2ImNNlvEoQtfvLhYd7g3Hwer4GzuCEiVgRFf_GZPuIRPzUUuLC2kYJ2VwXnHv98OnFvLfm5iTcx-SWSYXlPeM2Yym8HAWpBaubHVDNTBO1YPWbrlFpm_hVyq_oparb1tu9DRD3ey60-EKv9Ivj09Wcekm0TJ8HBKR3fHiNGfOGdVPca2C1_aPTDpLrhbJYUorQyrIe-IPFk6Zq-rILcdy65_RaAXjBtyDJDBGMbZbfv2LV244pJHHkU9Ms1YSv0sRY84wiA5yG12HuzAvJGiAmQl4VT4ginrz_BhQx8pHZybxoe9irpaC-o0nkGAyJspCdr_svrL8WmDpT3rqBkjLuy3mHxn7oozr1n8D0JX8MjN_MKGkZfn20_uuz9q-1wqscG3ACAt5sX7qi6jCwLM0HlHp8TC_ELVcYTXp9rut3b-_iMAJEGMxbG-mV5Eq8oP8xSLcHAMFnjYuyIOqdgBtFpTRdoTr0bCl7GKrGksxvM3wcHXCsBFn47ek4cqMD8NwqFM359H_34uspbH02_MUqIWDAQuUZ9nlPwanjNRuk6WeiIkMFvJ7Dj0ZsM9N3xOs2INaNeB-K_jsUApvKDy_zdyUK8yrDmCGdWbEF9nkRTuWPO9zmwzY_Pc5ctoroo=s225-no";
    String urltimeicon = "https://lh3.googleusercontent.com/7XKeNjm5GYjRvbUbR2bNH2WgZ9539OsXrG4loS5sPT75eh86IdE4R0TCERYiMA0aejfTQDW-ngomk-xUqWemcGV9NVJ-iQSTbjLoCZy49I5T5jgHLqwQnUI-xNuk7OZjXJtSk8B1VMcgOa2ixcJJlwOQrpUWX8bxQKciTZpPewBwRp3i-IC6k_3W9L_JhNeO-FnGOf6hQfsIepIFEyIrKPbR5by9wmTAxHJZHaPzTT9OZB7TaNeSEiMZU3KXv1xFHjqVKjBy7q_pSwBegSyDACXKoG_bCtdkHW-M5Lu2BUy9EsG8xbnkauMudQA2iArg6bLMgQViPTBNH4TeZYWpLam3ubyYi4Uyse1mGDftx2EppSGDan4Dz9kiLpio6UiRdrhU81btFDSHNINhw5eoGQbGvg3mEV5JOsYfmAeL6dOV7EbbSJvx30_cZwH0SP4ecIOivrmSWSveQEbbPUfCYfPog1G_5so87t-PUBDjkih0ORV18ORfic7zEjF7Z4E_VZnyqzOYnErP2hwX9M9jsztTa7symiiiPv_DcfEXC_vFhMplLEKCrN92PmYA94wJ0DfQOWyrCLagp7WdSAKvnXHpxkvfUSF81XptKWMi49vz5IeP2vznTdNFRIfLBUPE_Yh8hBobDn6nJhEU0JJyEuBAETAGqz0uYqst6fICbZA=s225-no";
    String urlcombo = "https://goo.gl/maps/4V63bGMwWDQ2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuestrolocal);

        mapa = (ImageView)findViewById(R.id.mapa);
        Picasso.with(this).load(urlmapa).into(mapa);

        mapaicon = (ImageView)findViewById(R.id.mapaicon);
        Picasso.with(this).load(urlmapaicon).into(mapaicon);

        phoneicon = (ImageView)findViewById(R.id.phoneicon);
        Picasso.with(this).load(urlphoneicon).into(phoneicon);

        timeicon = (ImageView)findViewById(R.id.timeicon);
        Picasso.with(this).load(urltimeicon).into(timeicon);

        vermapa = (Button)findViewById(R.id.vermapa);
        vermapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vermapa = new Intent(nuestrolocal.this, webview.class);
                vermapa.putExtra("string", urlcombo);
                startActivity(vermapa);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nuestrolocal.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nuestrolocal.this, MainActivity.class);
                startActivity(home);
            }
        });

    }
}
