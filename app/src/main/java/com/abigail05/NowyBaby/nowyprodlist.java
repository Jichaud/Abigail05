package com.abigail05.NowyBaby;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

public class nowyprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnowybutacas;
    ImageView nowybutacas;
    String urlnowybutacas = "https://lh3.googleusercontent.com/91MnOYXFgx10py1JD1z2iCtIa8URs5xVlnT37tsmEGUFEEaOU7fz856-yYcNAAir42xob9OcyY46IGH7C4HhA0k9Z9Qqtooezd_NqqJquJ3Bq7B8gjm6EpDUkIP-MCrXiX3XMiEvPsAVZZZRsPyai_xOqwrk2G0jstjNiqeUWNcFJvTESiWz46P-cmtQhRQwdd8p2XAemW4O9yDRbjPagCIfhj_5k-yJJisawNvf6cg-DXY4EmSH3rb1sbhYc8M5iR9FrrPFpg-R6TNv-uzmyjIz95gUoM5qzDIakDg8hhox06ZpCLEVt5fMQvTtvRXWjiz3BPuweEkV3zd-T0Igh7L5gyCpW4uR2VWrQuvkn5hdvKAv_vOeyYr0heMoc5RqzeydAEDt8S-UGfrttLb2h-KrtcA7tWLvQHs26SwtLOSZW2BWaJjzXH2zC9kinXFRKJPgh0AF5dwVdkVWmpHKD7IRUzRdS8mH0eeSX3j4IvBeoUH2xcAxhhi0wTNm04cLxQIHOdLWQFASmlwvc_lEfdFsEqC2w3rXnf1Bdk1tHAGMxTie2mM75X5CF9QjosqRWQErAvsrbEUAmfBrVqwAdiGySMQHYPybZjGm2DxIFGSUDdEKhw=w360-h480-no";
    Button btnnowysillas;
    ImageView nowysillas;
    String urlnowysillas = "https://lh3.googleusercontent.com/12Lei0EJBMdRKpms5AS_bYpCfXPHBgD4GSEjby8_tp4d9W-e97plNoQ61DWaNO9UoWNdns2tKruIEqR1WtZTNRdnuSzo-IY5ZfU5zfaMZwxEVof10IzfY1u4bWAQYajFhx-s5IbFy1FZpnRu6AHReM5DMYHa9C7C_1PDIyy0u3Q9vM6ru_fPD4uc70kTGVn4XijFZIaNP4G7YDUmvyj7yUCl8M45Ovlww376-4igvYbfG2XMwWZhVNZBLSsSYRbS8iVEkMSeuCid_ubceEY0OzRn7VOOACVpR2myfEjXJg6KmcasiF8eMgaC_SRzYY1rw1uNPEZGBUX8neMutf-ySG8G8U4XqvLcwlBvNWteuX5Pae3f9v9zlvBbS1Lm1Iclx068pmppx6mZ_OQuiL6VmsxEUZZ1GYaGclbY-ONoAIzLO3DhgGL0a7022uccmRJP5WlXenLcAigSXZ3QWCpX9svFSQ2bvtGzNTk46Nd91u3ZrXmtOOsALyqH6F0eIiuldj6w1EeLXnjAYdZySm8GCo_1WmMiT_tMP2TP2S3CKN02P6d8m0SyaLPpGEIXSPoa-2OgaHCAZsczGd2dXudW-QtdSS-Qk8pIbVwelv_gP9NPu_8iPw=w492-h696-no";
    Button btnnowybaneras;
    ImageView nowybaneras;
    String urlnowybaneras = "https://lh3.googleusercontent.com/JK1OUnwKY8p_TtNf_fIJqE6I9742gYSUm0cFXXLeo9hpcKPVT8x8fq5-3XYP8TcNYd9BwQ02vYjQyxnpvn8lhvRoblMiG465iQZABkvH4HYz9X3213myqUjiKQc9IbvrRAKAOXQ2SGMOP-O-DVmuQYhYlFLlM6EK7u-unCrZfb-lc5OuCHmesYvIGO3OpkAZwza4DCSoF0FlHQsOAasSlrg5xd1Qj2WMK----h5rxUwX_EKu-B6xnECPd97MDkbnXEDlLA1eQpBewhCbGGQoGMOnlShjxAOEIsqQKmkK--E1vrNYD_xG9YbCvUlZId6_uURbGJSLX3H6K10lSnIsAQlDsihdU6fDyYejaEYygTzdMIpMQy4Q0l3m32ZnMT4Jc62BNd3WAxPlUESbfcr9IcDRE97IVWqoPiSi1z8aAA0qEFP-SIf1AFCb_t4tCpYFbfPE1DJTPJ4i7FQ1LmKG06otws93S4xj8Ho7Aa-TnWqaukPFsE77r9Vnb3hWOiJM3fztB_hL0pqJOzVRzziEHarTOduqg5dvP2XIri9FqLpTGWGLwFcXK1b02mUC5BQGQWoBUP4PApkCTsN6k-0RMu2USwyi0D34yAUlFAmz6EwSx4Mr3w=w500-h317-no";
    Button btnnowymobiliario;
    ImageView nowymobiliario;
    String urlnowymobiliario = "https://lh3.googleusercontent.com/vcS6J_yWwPa51HJ8KyxSJ4F4xcrigVpY704Jm2Z2Ckzc-Gc7cc0bHE5DY6lzmuK5hNq7zEyuJNVEvRET1fjLjWw-c3FuHZLDS9zs42BCsdk1E949oraz_TbPMG7bST-WFnQ_MMpbGK5mvTYvPKjf5ah8L2iTAkj6LbVfbVHGPX7JlGx6g73dLMJOHbJnzzfyLA9STzXpH2JrDN5pCrE_I6WFWaQeabjYDYY6_3EYmMzQD7Y53HPhtyhdw7Gb7Sd9Quctf1kp07H_7wXFoq-FayKjo-dJZU_Wg5mzXEVCuRYgSijcRPpj0mDwsdDjXGaaYE_wROAEbwwq9Mf6DSPGZvMk055isbyICsFQS1PRo7z7LLeWxZmgaoofEZJ6Mdri6VtmiYqtJ-WaHpieJzYcT5XKqCTb1tA2RuU0RKkpI_1MQezxYFUsU6tFBuB2siHia47LFEZ97pbaJJ85DIsP70YdnwEowotIA8c_1rmw6soyUFDTMfMUdfxTLe5765IiqXMsfBSFNy1n7Fu4QvZH88m0heg1sXqrC8cpPR7ZCJqQR7caJxtOKr9RIInfZDurAMEOkflpOUHOYBHcYWztSNoHSIctEh4BMIpN5qIs1aYwcpBh2g=w342-h725-no";
    Button btnnowycoches;
    ImageView nowycoches;
    String urlnowycoches = "https://lh3.googleusercontent.com/7MFw1q2awt5ROGslr2NO1UFJsiYal2_05WuBGE8K3Kgyp6mxVzKeOOuL6Q_2-s7tDGDnYHm6o6mhmdGfRORGgqcI4OEzbgiA-fbLu4Jfymbzs_ArYdz2lXLLgImmnkrxQxHvxHNPPcKKwiMO5_pFFKrd2yx7Fh6ZFY3MCYuS5mQsKf_bqjI6OHkake0SHRq46m6nRzoJWdt0G_sDSY8zeVVQJdR89D09AFr0c3lGHu9Ng1kdgBz_xIle5AI6NhRHTtQkJZgSTliCJeGqqN9DD2gjW9dPDiJUqs_KR20mE1yqHZ5hoONb3Wy2CR7Q85gFYaw8d6uoRTtNUds-KRVAqNKI2xn8hEg0OkpLCUoZhOBVg8p51GF6EO977nUM3JdxHsbxBO-NDRCTX4wOGnLzktGMwjqEF7oPd0dV2lTIQxiRbUOBT_3aUhUPa14nSlfWzjS7T_W-TCXUfm6IVrwmaiOXOlNNINGm2h5uNxT1ilv6FK-tiZXiyHjVN99L3ykt5V_py4mJ21cOJmTG0FYCCcmiQLuheEVi5_FpvxYoSDnYTx3d0n1DLD03dMqyFDaW-FqN-d1q691J8s1warG_VIf7I87LaxE24oGyfVXamNGrLuy-1A=w600-h657-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowyprodlist);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowyprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowyprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        nowybutacas = (ImageView)findViewById(R.id.nowybutacas);
        Picasso.with(this).load(urlnowybutacas).into(nowybutacas);

        btnnowybutacas = (Button)findViewById(R.id.btnnowybutacas);
        btnnowybutacas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowybutacas = new Intent(nowyprodlist.this, nowybutacas.class);
                startActivity(btnnowybutacas);
            }
        });

        nowysillas = (ImageView)findViewById(R.id.nowysillas);
        Picasso.with(this).load(urlnowysillas).into(nowysillas);

        btnnowysillas = (Button)findViewById(R.id.btnnowysillas);
        btnnowysillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowysillas = new Intent(nowyprodlist.this, nowysillas.class);
                startActivity(btnnowysillas);
            }
        });

        nowybaneras = (ImageView)findViewById(R.id.nowybaneras);
        Picasso.with(this).load(urlnowybaneras).into(nowybaneras);

        btnnowybaneras = (Button)findViewById(R.id.btnnowybaneras);
        btnnowybaneras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowybaneras = new Intent(nowyprodlist.this, nowybaneras.class);
                startActivity(btnnowybaneras);
            }
        });

        nowymobiliario = (ImageView)findViewById(R.id.nowymobiliario);
        Picasso.with(this).load(urlnowymobiliario).into(nowymobiliario);

        btnnowymobiliario = (Button)findViewById(R.id.btnnowymobiliario);
        btnnowymobiliario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowymobiliario = new Intent(nowyprodlist.this, nowymobiliario.class);
                startActivity(btnnowymobiliario);
            }
        });

        nowycoches = (ImageView)findViewById(R.id.nowycoches);
        Picasso.with(this).load(urlnowycoches).into(nowycoches);

        btnnowycoches = (Button)findViewById(R.id.btnnowycoches);
        btnnowycoches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnowycoches = new Intent(nowyprodlist.this, nowycoches.class);
                startActivity(btnnowycoches);
            }
        });

    }
}
