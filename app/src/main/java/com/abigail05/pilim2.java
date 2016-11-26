package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class pilim2 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncomprapilim2;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7988d79ef48ac53ea98c5ab6a6975735";
    ImageView pilim2;
    String urlpilim2 = "https://lh3.googleusercontent.com/2p2F4LiVF8OlAhcj5OkdpYe2G9fcoUa5LZQJL-dSD3oTBYJzYfHgDXZPbxFOAbACdlPzxmVRofTWGaxpZw2HYTeoy6GRs44bg864MOQW1uYGOOjrynPUdccPcxmyjtYNktrEewNVKzwR1_Ud3kwqb-9JUlhZOhX0x8Y8c1pyaxzsp-NHXaaM5FW1HMQWSpylvmzUGPv0Il9agRBeWcl_qZWqwd8Sl3hq23lftP56CgCVfctUqe6uu91u4WdlEHO23QZPKPmyuOAvxs_zK1xVt54I2J3GYWEF-vKunbxfYxDQIyIG-BQyyqKTb7_Rut9NB4_noGp9F9lcSeVHSYIWkTvc6zqLXQnc5cKQOhNKAqXbwVpdJgLztTD1y9WbaM1qdkKA9UtzOt07xZi_1u06OYyz7YtGxx0eJLNhW0NT-9_bVhwObA6UB0oAZWfrTdFKIDnHTkjcyKlpMjVRKA46ueQ9oTeQkRC0ZAPgL1ItAh-_uwTdFbU4v3-w04ZXZEgCcEFo1Ko9au-CWhFh2QwS8ijvcM8w5GAnvzq_aP7Rx6E5JgsCjvyL04JltQLo0FeaLxVwYNoufwqLNBlFrZwZWloPm1EYnclVdAluUGWI96iRnAVeOg=w296-h324-no";
    ImageView pilim3;
    String urlpilim3 = "https://lh3.googleusercontent.com/g6IZiOUw8Ao1Run2geOBZFneh22tnSHurwFtqhcpL_BMFQ8OPwx1ND_dzJ7-fxE0qp_yRilyMqarYgTuVzeYGnwvpJ0357sj-FPTxl3iQykyGw1yjiXf127m4M7QsaBmbUnRF3MrsAI79qFtiI54HqseKYAqrreUQ6TrsSPkfU4gOA_3CEwhM8pVejdU6JtHWvbq-huqOZ0SQNNWzanrj8VhyhWfqT2wrahQ8WmttpcZN7uzZLLNhvRXtCdqDrn5FxNWu6WetBP3Y11S1YNs1i5rw7TXeLzQpgdM7Uf8zMV9eU1H2-BDwiBgjlxP327_4QWjztejl-N2bfJ6JodbyGR1-4dBIb9NAgXw2MymsGH9LpBJS__cDjNWzREPhtHtHsoApJ7ZZf8oTS05-K-wO_J0IdH2NtAmn1bZDBQdEdlRR_fTnhDmr-fU6fxC4yWEAay1uLylPbyNlEiL5jbs2GsowPDx3wBPZoRs6fBOGCfWtgnZHVTPZRxXPDyxayI1FFM4lYxw1ZHvTLNPPrsIN0J-v0Uk9TCpdU0aemQRZui4l4IWXgVh6DusxeyKOY4F-i5N_Bo2c_e2H-03B42_q6LlaTlFjPF7AgSNI3-t-T705Y0JAg=w308-h324-no";
    ImageView pilim4;
    String urlpilim4 = "https://lh3.googleusercontent.com/HYGTZ0n6Gp41t1kYjDc-uaTNAwrj_t6fBsXf0JgmlcD0IZSZrBqwkFbgIA5Zb-Z5lvcTZDj3HPjY9-hRhRPn1gUbUnHFWSGuJOUdHDltXQ5fRXNfXQi2hlDb0o7hWp2Fz-rPQXDaEkQaRU8XMfs9xPIULQyGk6AChsokD2fJGYefdklEPAR3rSGDZymAKpcKUF9wuI-8aS37_8OT0XLGG9A8q6gKjgQJZSnPKSHs9YxkGTYThUsuR7tlRx9krWTlsZ_pV19nwCw1LGZX5azOoVA7e3yyeVgfSuBNPN5AgrL8C35BW4ed9Fg7hOv0mUDPZ5DJJkUvZuC41CnkuA73QNcdOQKYn3tzC-nvgWUof_SXijom_CYylujN14R1gd-SbJ8AVEF4ifSZxW5q2xetw_ZcWvtEqdlZ_od7w-9zfwsW23tCV8QD2cuw3azgrmmq8m6rhtg_T609QlAPX58avZFdOue6djcznpcl3b-Gx4U_JUYp6LGgbS3D0eBFoo-kCwqxd5M71kWg4Vy8Izo0UpmL5r9drzJHmzE9HshxJ7FTL8ZlIW7ZW9Kl9uRBjK3IND37ZHNZ46L1fyPpbwd31VZ1HHsNvzfEjYFByVr2XckmmcPkoQ=w337-h321-no";
    ImageView pilim5;
    String urlpilim5 = "https://lh3.googleusercontent.com/ut-XICqsYOUyjb1y6Hj-P7bNHcaxWL3Aft-gTj-OCp7m151OrG-PPtrSM-T8ox6VY-cvvHZfmXCAOLCiomoWJm9iEJ9-tU8pov-fUg7IJkXDxHZTK1mebjQTOWin2sPfawHwb9RQwJQtw57klicbzLEFEmsa8dD2Of9upBySubdupLJcS1HjX43_krgpFduXe1SI3OPL2eucHJL2mNcPFtatBfrEU_aEnfwLmHcFX7nAuWG8u9-apu1jyCok1b7as6jHqEr17asw2DDytWvQkf9n-aRlhylu1iO6bLrCzMfWf2tK5K4JIOxMHr8sDK3PZj7Mx6ci93oLcWLx35Pn2CnPTgI1Eig2Ti2mTVhbdpnOpOSiZDQwgaf4O34M2Xa3_ym-xz0pB6JHbWLiRhszzh4OQwdYGtAPnm9Stu6XDOfzrBS48U59UuDX5OP8I6JBM-35RXzDzputAjb_SNDT6U9uy7iitNEI-tzeRB3poxyUe-NaIuFc0bok3WpfkozloUN274lfH0l3x04qPA0kBcdKmK55bhKHbPBqrU2mfEOEyz9wKueT-x7NZzVMFlcOlOFfZwgy6SH0Lw_4KOG8cCWjbyqDuUm0KDdhp5EM42RbMBYo1A=w322-h321-no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilim2);

        pilim2 = (ImageView)findViewById(R.id.pilim2);
        Picasso.with(this).load(urlpilim2).into(pilim2);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim2.setVisibility(View.VISIBLE);
                pilim3.setVisibility(View.GONE);
                pilim4.setVisibility(View.GONE);
                pilim5.setVisibility(View.GONE);
            }
        });

        pilim3 = (ImageView)findViewById(R.id.pilim3);
        Picasso.with(this).load(urlpilim3).into(pilim3);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim2.setVisibility(View.INVISIBLE);
                pilim3.setVisibility(View.VISIBLE);
                pilim4.setVisibility(View.GONE);
                pilim5.setVisibility(View.GONE);
            }
        });

        pilim4 = (ImageView)findViewById(R.id.pilim4);
        Picasso.with(this).load(urlpilim4).into(pilim4);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim2.setVisibility(View.INVISIBLE);
                pilim3.setVisibility(View.GONE);
                pilim4.setVisibility(View.VISIBLE);
                pilim5.setVisibility(View.GONE);
            }
        });

        pilim5 = (ImageView)findViewById(R.id.pilim5);
        Picasso.with(this).load(urlpilim5).into(pilim5);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim2.setVisibility(View.INVISIBLE);
                pilim3.setVisibility(View.GONE);
                pilim4.setVisibility(View.GONE);
                pilim5.setVisibility(View.VISIBLE);
            }
        });

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(pilim2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncomprapilim2 = (Button)findViewById(R.id.btncomprapilim2);
        btncomprapilim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprapilim2 = new Intent(pilim2.this,webview.class);
                btncomprapilim2.putExtra("string", urlcombo);
                startActivity(btncomprapilim2);
            }
        });

    }
}
