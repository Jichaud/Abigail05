package com.abigail05.NUK;

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

public class nukchupetes6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    Button btncompranukchupetes6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0c8431f26da0910eee7b1264f317ae62";
    ImageView nukchupetes6;
    ImageView nukchupetes66;
    ImageView nukchupetes7;
    ImageView nukchupetes77;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtnukchupetes6;
    String urlnukchupetes6 = "https://lh3.googleusercontent.com/tTmX3K6N27yth_LdrVzEbWjNaFQaPTeefnLZnD3Cs-s36ygk-RLr3sxbNWni4dl5AD0XxKkv1K2_VB3GFG5qaxO8fII7A1dGj45ADaRL9QNoLhp_-JiaHQCuk7ds6pvx71NQ5i1mCAi0j4omwLG0XYZr7t6SFqbqm-0pe-ZIzvsIrug3_HHRTO8qXiFsZBYKZ0ZUsztp952ojN9exuHkr_tzlbDrAFSsIbX64qs03pVeP7S2xmq1kYHXc8FtCBzt0yJVGwoqEo7mckVabw1KERs00iOLaf_22eY0Yrcrm-TUmwyYPVuC3coMvu_59k9L9-Wo-uMhjiX9a9XsoPb2A1n3qZyuKz6W-vLNeBREy1SOXfY2q8TzDU8MeEtKumKDewuesQM2zKcURJ78YCIOwxvCh7YUH2pcaQgo0Q-N2hUVRdaq0KGdM-PJtXkMuXMObDByfqbAIhDZZSDD1BgAS6KdKezYjiWCCrPYW1tWWO7x931HjJJGbKsbbz6lQhWPZyIYAH5zV1jH72pQcKMWJ52oG3suRZVOM_q83K8-yNOgE0yUCDQfv0_L45h1dnuGkHPoj3-qjQAvPvo6-qS8hSGkW06qKxg9FFAXFKwVQIJeNyyCYw=w361-h300-no";
    String urlnukchupetes66 = "https://lh3.googleusercontent.com/7PTyI9wJlOeqWqER9lN1m6xbga71Hxo-_0cBGlPInDUlfwxdfEWDrWoUqvGJvItshUwBcRWjdWlmj1r1hjQ7T6fXXmo_Tf106swaVgZUlw2U0G_rfeBAuYB9ynGO0Dnjzksc99Fbsohb-3XtW_srcufr6Etw-8MVxpby7ZGuu87Ik2XFaBuKNyXGAZMwWU3KYzzp_hxUA4ZhNZMpriQtUHigtn0oLHjQsByEKuhT9O-HRf3ra0v7f-upLxWyFpxPOo0COyoY94wDDg8Zij6Uqj2J97xIKm_uQu_T0r_uh3XnmIhXdDjceujaKWunGdupFAiTfvTrFwePd5jiqiJQ9cyFeYT6CjgPmMBmAKrVLOXVwLgnpY7-qrlTBeYplWYV3LGiI6oyGAUyq8EDc82hKehY7wVuLtbq6O7K12pYsbbrp2KOnXnG4vOwzvvLNlj_nHLt1DNvnGpeywuB87pt0qO923wbyndA2wHVzsoRMiKlymXT_IkdGQ8-LdDh77CV4LFYoYY6awOUlAUsApfrICYW5dQ2yXJrRqRXpLcqSYG5CZ8919NR1NugxPYW9zQnWMSqZhYij-QqQMD9nFSw1_ub8ykXBD1NxK8CrztM9vTypWqEHQ=w361-h300-no";
    String urlnukchupetes7 = "https://lh3.googleusercontent.com/G1aT7mJbPf1O5skWnM-_rpI7IjN5wCvneUyR9oDzM_jXIq-qgdHzuNEuDLvnJpO30b7DyQ2zpxPBlgCLKkZiZ4EpYp1pegwtCUUPWEKEpkFjdV-Np1r735Wkb2kPwxdAGK8ou7Wkd061kql_AmH8glKT6F5LHdkNnbsM0phvb0vNqOTqkm2Nzvt_gRvhZ8KtZ-Q67YWN7qVb0-q6neD27YUO94IX0DsJ5m7gp9rqfOf60gb5BcoPEsHShb9Es9aLjKr1-8q5yXhEFcYnYRq2eEkyT3Z-nFbr8XKSzzcF1eimjEw9woJJo87M5XMWVOjX3ev9Ywgosw_OA04J0qY0J1DMSno3wKcv9kA-2ZeY6FA64H05eXkpsC110vSN_RRpdAHitoJ5oyKHsZeR7G4RPU9SSs6tnx1JNibJPN5lByuOw_g_vaRwQxJGiOacY2Y5nmgBUOEe4bVAy08yyK0k-ilTFuhRb8pe7bLsXc8vp7va3zS_O8RSde1LJfZtz2qpu5dnmCVHcuKNVkd9I6YJPgHQgr6pTKJKOh4Tk4fUefS1nCERKo4IYNseMPtTwEAtzOUD3r8hEcAD-xOM681C8VqCJZd2MnwFe5Eo8Qhjmpv7sc4XPw=w331-h300-no";
    String urlnukchupetes77 = "https://lh3.googleusercontent.com/o_ycjjF80Jm4ih5q-8_exauYpkavNxheNRHcUq1_ebZ1obyBK-GxGY0unMoKRFNScY7RRl-XHFILP2J5GsfmereB3XsBN8QVbkIWaxcZUGWfqQ_mNnhVhwbuacLagco-E5nqjlCdd9zHFrNi8cSOy_MT7rjdga2Vi09tJ_1TCBDRqz8jh7qVNjVM45nOQzSP1GCb5Xdg4ha5kdOBSlvs5PsjQB8GZpBRMIoY5BF_Db6bCSY26Vcn6CnOi9_xqCS7OrCh5HbI9kTwoXQNgPQX0TG_aC9b28-h8lh9r7GSHMu5gzWhN8P_3Fp5cWtrkNsp3ajtuoOuaGccKesVtQEDgStc1DrJ0mVOnBx2uSFWa9FdtdGscVkyJ5NFIN5uGJQIVx_TmktseYOUeeUzM7tpzEI7UlmtROamp_JyYF5fA6e96pFvusgafIq4t37F0Zif3-VCXQwlC5srJsXXchQrg0rFp3QqFZcwj6nH2OIqIvp27qxufrWPSTXkfKJtNcPKLQgxXTtfYW8GHCxM4rvOPR6zUv6v3MS8cqCp0o_1eV8ZlasY6JOszq1POwLmleFu_jsVlL0d9m-6jBsNxHYy0WLUCcnKVjsAM_bbJOkhJUJtADx06Q=w331-h300-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukchupetes6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukchupetes6.this,marcas.class);
                startActivity(marca);
            }
        });

        txtnukchupetes6 = (TextView)findViewById(R.id.txtnukchupetes6);
        final String stconsulta = txtnukchupetes6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukchupetes6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukchupetes6.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranukchupetes6 = (Button)findViewById(R.id.btncompranukchupetes6);
        btncompranukchupetes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncompranukchupetes6 = new Intent(nukchupetes6.this, webview.class);
                btncompranukchupetes6.putExtra("string", urlcombo);
                startActivity(btncompranukchupetes6);
            }
        });

        nukchupetes6 = (ImageView)findViewById(R.id.nukchupetes6);
        Picasso.with(this).load(urlnukchupetes6).into(nukchupetes6);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes6.setVisibility(View.VISIBLE);
                nukchupetes66.setVisibility(View.GONE);
                nukchupetes7.setVisibility(View.GONE);
                nukchupetes77.setVisibility(View.GONE);
            }
        });

        nukchupetes66 = (ImageView)findViewById(R.id.nukchupetes66);
        Picasso.with(this).load(urlnukchupetes66).into(nukchupetes66);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes66.setVisibility(View.VISIBLE);
                nukchupetes6.setVisibility(View.INVISIBLE);
                nukchupetes7.setVisibility(View.GONE);
                nukchupetes77.setVisibility(View.GONE);
            }
        });

        nukchupetes7 = (ImageView)findViewById(R.id.nukchupetes7);
        Picasso.with(this).load(urlnukchupetes7).into(nukchupetes7);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes66.setVisibility(View.GONE);
                nukchupetes6.setVisibility(View.INVISIBLE);
                nukchupetes7.setVisibility(View.VISIBLE);
                nukchupetes77.setVisibility(View.GONE);
            }
        });

        nukchupetes77 = (ImageView)findViewById(R.id.nukchupetes77);
        Picasso.with(this).load(urlnukchupetes77).into(nukchupetes77);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nukchupetes66.setVisibility(View.GONE);
                nukchupetes6.setVisibility(View.INVISIBLE);
                nukchupetes7.setVisibility(View.GONE);
                nukchupetes77.setVisibility(View.VISIBLE);
            }
        });

    }
}
