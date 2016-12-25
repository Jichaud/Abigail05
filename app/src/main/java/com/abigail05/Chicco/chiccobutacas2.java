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

public class chiccobutacas2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnconsulta;
    String urlchiccobutacas = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0a4daa1ab465e5e976d52e082e36beb9";
    Button comprarchiccobutacas2;
    TextView chiccobutacas2txtdesc;
    ImageView chiccobutacas1;
    ImageView chiccobutacas2;
    ImageView chiccobutacas3;
    ImageView chiccobutacas4;
    ImageView chiccobutacas5;
    ImageView chiccobutacas6;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    TextView txtmodelo5;
    TextView txtmodelo6;
    String urlchiccobutacas1 = "https://lh3.googleusercontent.com/1rrPX2OD2rjyci90_GF5LpJHNJvNddx47C90kifhiWO6kGcyC2ZTE2N0sgFoZAxLoq1I4hYNRFDgmMhPXJTZVicQfnC8k4ZzzEasQb-GupCJ5vZZdt23lOj_r2iFYx9vPd3QVUxKf9E14PG0AYPO0Df9NeD-b12K7v_0naR1i1ix3Udw1gnaxWMJXi3TZJcH4txLkkLmLv1brm8g5DCYwdaV_adRWmvlcBX_2jlRIW-wdzw_XsYtZSQdkhujbx9OB6R7_RDr94k_u9ZGWuFcncyZhBJ9daaSMAYPnKb7Znb96sp5HDG1XSPgPHzzvJObgekqBxj9xiy8TQQKEYohE4vYE-Fs1II38FUgNw4RjQxVJVZ1EZd9vDsxk6WbcUv2PKdzFwY-bskT3FD4X4FuQqd-ASFvpy9eoMcmpbFPk7tKHZZcHYwf79_g6TNQ3U5meK54kvO_2XpVbRnwTa4L4pnDJmCzdaK3OKYGvdmT2dpjHu-dBxqFvQc07zrZ6mHvm1alHYwR3WbrtARO3ILApcdeZxCBNVmPyg-B2dHhEKociylOUeox1Np20t28BynW-QJkRrGQzjGmUhMAZVKPR2g5XAnt134OUzip_1TZ4vbPU5S1sp3QeM9E1XlmAGfTtxZFtIqQhDKMAS4aYK3PEuve91dI4s6q0jf2_SrHYyk=s725-no";
    String urlchiccobutacas2 = "https://lh3.googleusercontent.com/Q--stX_mlO_rwp0ENfGoqyaci5MEmc4OE11-pNCbcjaW8a9JHmQetTScwKXiSOeXIhhRUou1IwP_0hvV4dpQ3y8XoCemAid8ORpDWiObcIAOmhkAmWpyGhiP-GaPud5E5IkyEU5_PsGTfWKLWNRL3YvzmAqlCMBWPuo7qUHXa4hehMIXoI1mof6XarBvuuCYYadxWozM7EaQ8DGVC7laKjdsgLC9MZXHdlBFNi41oMmwCzR44KPG94yE4YwJgD-Yb-IepLF9BiWPCqq6NVR5459CdieCD-DP0pQwMGFWM6f5UppxS4cPKPOe2ng-fy8_gpxIJ-5Ko5UpSPny9nQfE3q6aCnAJpUydh7TppgX3wZvy1CEaLhC9uAwcDDETZaTS_aFVbit0ICHXx-4zIGtOBsZ9QV3GdvYZxyQ6gm6UFefldXe475S-OqSB52m0mCHB1iyxV3Iiz3n4EcTajyu01HpJu66gy_bkCuW_05h1cIK8bl9dUkCVPFBdr4DEjbiWoDyI2IZi3jhKPeek2zGhM5mTlhsa76SpNWY21K-kw3oQz15fz8CO9mJo4teXrC7ZXDSI9RVYfcZq9b2Cpua-JDJxUIIvSZipzVfxBdSwJCCszxe_VPw0R8jcbXzSucLfApyMgpE_aoGg5Zj8FM-ZdU3VlO92VjH7P4PuQHXgcE=w740-h400-no";
    String urlchiccobutacas3 = "https://lh3.googleusercontent.com/YCljMiDs8IgGP7nJ6zCfFf8iXHC4ani90wE76I79PuUobXKaKBzinzRb7qPS99R7QXmFx4wIuT9vMvKJXXAEBr5bKffwVH7BGbxBjLb7W8V2GbRBIiI_DtaAzYdmjGWNJOBKIDDwZSfR54keW9OZX7C7JefIb3Fb-g0rmHIl4IURRPabgKMQ9hAVr5MHu4tPCbCaOF8QgOyUl7nMhmFW_0OtOWeTsBO-55UDzgpCsa74xSAnE7iTaYOh1-zhktUM3BY8hQKUqhkyGwiE-nWvN9xk3o11_tc0DdjQvWuSGjGdE6SZIQ_e4MdlbuhLhI7ukQfx_pDF2qkDG82JOEn12zD3NF2DwYB1Sx4OhjXNF7-6CCKx5s1QVIF1fHMLzIHbHJb9hQffDjt3yZAdRdywAcq_DnE_JjsA7kIuOFH2CpzoTANx79obh8wTM6YPG34KrDq_6envEvNEbHSBFMZcmJY1UmZ960Hom0KKNq5A5l_Jk8VRQYYK217b4JzDjIKuOi3Rm0bH9eLmw8PxCGj4LVBQ7vCilqH7z6XIFsxV6B_5Wuvyf7PwjWMx4ARwv_bGkPUq2VThrEkviAXLvALmbtuWiPMzUdd4QoglsABZ_cZaxHLsRcKYlZdM0mAea0WvV-ZZY-yfugSrYHmW9JrUWkhaHreo17-Le071b9HAWYs=w740-h400-no";
    String urlchiccobutacas4 = "https://lh3.googleusercontent.com/JFsSvtScyoZuvfPX8WyXVElGPpTvjL_wqJaAfJh7Fb7w6aKPqSxqv9T497ZmlhPUVlBWKYNU0IwtazF---xqTG-PYEVOLQhksQ_8PsqWW_9td-o4p5PTXjK5zCfWky8JhBfR3PuqPO4va28QmwE8utTLd705bByavKeIGJEqEHjqWTObWdSBkwvkR2_1P_q7o9P6rO8p84UomtsdPijwDsamp8_cTxoHmYr_fJ6hsHiLZlAVPXHcwm-ZwE_azzazme0Ta8ghfSlv9BMo2perHMEIteEXE2oKSrdCAVoEB3i1xmLlmgX9UtM-KSg5PT2SABNRbF5UBLI8VeyzAnrAAsjBSoHSifzbAj7lmbWrCyGJrJydZWGb4Ok1PQxd6cP8BcUvrkDfjdH_5ewCUc-mmvwtt3qvTEwUGLcgrDDXPUTWuudsPPSp3awNAI4WQLOFMpo_4ogwVoq0kHBEf5BgR5a9aJX9CKj1UR-SETJhHi6auId4OrSGjqYkNCVc2nFfFHyzCtcUHPIg_Jmj_thXzkWmkG6RX7OwUePUnJidCp7CR3XeG4m_DHCygea1vzqRm-TqZ3RYLqI-qQtUpPjKuiOSaHH0Mf5soKYpMWJ8kuv8Im3n__OHu2FQL5A3u7hU8Rkn7geFkeZtHPgSKJatYGTDwbIr3cAwoKLEC_Hrpzc=w740-h400-no";
    String urlchiccobutacas5 = "https://lh3.googleusercontent.com/SklEcQx1jj8f-G4OnMGz-5dotRUmx6_T0xpUIb6Y8TyrpHpxyoncH8NVL6sF9zTUHtAtDH1ZrBB9H-UezaLSJVaIRLTd3rXEpSOmhxS0Eny-0aJLJP2tvidsv0CEYLJkgOJiYIbezOhAFEohCCsCebf77eWjJ8H4gLVV9YA3fVoRF9NEDaAI_INRdejU_Os3oz6FB-C2MZadTB2Slp4O3rojgD1iVbaCDrwpI2JpsT0EgN9xOS9y7ztNuMFLdC8CzFylSQXVuQYAPlCwjF1VY_TdLQMIqQjCJ8mdguGH_jeC8xRivbuB9nY1Q36i_BjpVCiyu4vjJmAE6C1dDGdgt4boOfNNCuzMD6Cxy1IBwvSqfn-x8bq9emlEYAgkb33qlVV5NnutQtcQxldiE2KgWKYjk16DRm-B-vtUEsUb18jDI8PJDDX615nlVN39FHhHL_jlxLXnrk3-GBDZSojusoLOzCkifeOSD5NhBiJGqaViqhUb4H_ExZeliQXxswtOXmV3zXODWOCCcalB4LNFfgQTn2Zlu4Mik05N7Bp2c7A65uQHPtXst-fXWgwb1iZoF0CiWZ7raREDLYfX-g_2UDW23PCE7KP8z7O8MjpprtLh2tn9QAOcQ8qQIYz-zPxyvUTFYo6TBUINOgq9qogas4LklyV0XC3_3aZdsLbbPqE=w740-h400-no";
    String urlchiccobutacas6 = "https://lh3.googleusercontent.com/kDVMY1ca1ttDYosdFyZGeFrG__5XYRs5FIVlT3dx8MiurSkitnevuQVGMYr-Q7jpKWfrOxkGn4xDPOFPHrcvQrmDomeH0_Q070tW91PBySv-ktvrqoOFCjKvmuJTvnqwoRUhXC5Bot3QBRiyPTMn5M2nuUa5eXJzsv3-b1jkvJikbAXWBRG38Drje3l5gC5ItB-o97Jwdj3awlP3FwzjgcdWfz5B-BPG9I6bDo6VhBlc-4gPbM53m7nKPanZIU-eVz1NcINIgUz4usFk1xBgCfHNnAPboNADBEIA_HTph1Z8_5Xw4J3nt0ZrjBY9Siu7-ZMXhXcyPEEXi-oEfKjJ0Gp7ntYg7NULZ_aPZaZfpi4Ze5yuzBWDgAjGrvRs4k7pcCKzgizZwrBJZsutAk6Zc3Wkb7rbIiG6C4_M6jLE7D0TbYvGzzQbvc8PVJZM6__Zq8-fHpsBybJ2oovn2kFRS9WLrjrgKZWbrvbPc6AUoLwFvWxwKV_Gv0FDZMpk67ug0D5mIqmrAgkFfoLZmoittU1nU_r1_P62Y7RlUswihLKHx0O0Gte1AT2ofMASj_4TyHfjJOccIP-sn3CLob-LTp4ma5Jg1hVw8U4oFq-vetyVqUNeeWqaeoTGpGgmJkhjnlEkhHJG4t0LRLbZM0m5-QdEcUR-6NRHF24RxvpNk-M=w740-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccobutacas2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccobutacas2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccobutacas2.this, MainActivity.class);
                startActivity(home);
            }
        });

        chiccobutacas2txtdesc = (TextView)findViewById(R.id.txtchiccobutacas2);
        final String stconsulta = chiccobutacas2txtdesc.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccobutacas2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });

        comprarchiccobutacas2 = (Button)findViewById(R.id.btncomprachiccobutacas2);
        comprarchiccobutacas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarchiccobutacas2 = new Intent(chiccobutacas2.this, webview.class);
                comprarchiccobutacas2.putExtra("string", urlchiccobutacas);
                startActivity(comprarchiccobutacas2);
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
                chiccobutacas6.setVisibility(View.GONE);
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
                chiccobutacas6.setVisibility(View.GONE);
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
                chiccobutacas6.setVisibility(View.GONE);
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
                chiccobutacas6.setVisibility(View.GONE);
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
                chiccobutacas6.setVisibility(View.GONE);
            }
        });

        chiccobutacas6 = (ImageView)findViewById(R.id.chiccobutacas6);
        Picasso.with(this).load(urlchiccobutacas6).into(chiccobutacas6);
        txtmodelo6 = (TextView)findViewById(R.id.modelo6);
        txtmodelo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiccobutacas1.setVisibility(View.INVISIBLE);
                chiccobutacas2.setVisibility(View.GONE);
                chiccobutacas3.setVisibility(View.GONE);
                chiccobutacas4.setVisibility(View.GONE);
                chiccobutacas5.setVisibility(View.GONE);
                chiccobutacas6.setVisibility(View.VISIBLE);
            }
        });

    }
}
