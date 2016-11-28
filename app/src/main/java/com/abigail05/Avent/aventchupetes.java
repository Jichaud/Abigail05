package com.abigail05.Avent;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class aventchupetes extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnaventchupete1;
    Button btnaventchupete2;
    Button btnaventchupete3;
    Button btnaventchupete4;
    Button btnaventchupete5;
    Button btnaventchupete6;
    Button btnaventchupete7;
    Button btnaventchupete8;
    Button btnaventchupete9;
    Button btnaventchupete10;
    Button btnaventchupete11;
    TextView precioaventchupete1;
    TextView precioaventchupete2;
    TextView precioaventchupete3;
    TextView precioaventchupete4;
    TextView precioaventchupete5;
    TextView precioaventchupete6;
    TextView precioaventchupete7;
    TextView precioaventchupete8;
    TextView precioaventchupete9;
    TextView precioaventchupete10;
    TextView precioaventchupete11;
    ImageView aventchupete1;
    String urlaventchupete1 = "https://lh3.googleusercontent.com/WoWMsQPEc4nwe5k1ar0Mn5IsUIlKhhnfrY66YgiOY1E2TxljD8EcfTiBcLeYW5qOh3hLfFdCFziIHhcZ06-6bCZ3CcfaD9C1b1E2-X7x_sqZWc-fEzNN-myg5JGZqK0R6SKVFF33p0XN0IZB5DEyCpPq5Ed6tURhba7EALBGDuweoZUFme2swlYHVCbkVC48F3svNhmPPEk47AS3KhD1mZcq10teTo26N_FrndBdzCx9YkDEBisieVNuLWU1b9Ov2TxA-8PG0Maalr2iM-BKZgONUPJbGny61SDCCbwOX9SQiM1Qj-uu6y-X_7FZqp_B2T7TfVB7HO81AXFTWOp6bAWC2yJ2w6rz7IaSwOtnPEwrDre932TiGlzTukAZOypz3x7DZebuCGmtK270kakMxz7sWyuoYHvv7_YRGvNPrb9dN_da8FAlfpEvX9n2jP_Ef1B30pqStmhXrJqwaZERAtl26h6w2UAz0bweiotRBbYmQ7tYsJ6QsLlRe0r0HaLlMT9jHmWTGFw6HAHkCxjWpoiKTWG5Lc8RAZdK_BpoWAzhNgmx4jGkI5nM_53ISr-O1pdOcsOUDMDxb5Jhl4Pp-_L8Eblss8IEYkw5Ft-gSTCXY27aTg=w494-h435-no";
    ImageView aventchupete2;
    String urlaventchupete2 = "https://lh3.googleusercontent.com/Wb7X0c16lsjSrAXvGfWfcGwr2bm61lX-x0vPa9R5hwCYPF1MEAULxTuHCviJ8aKw1uCPss2-t3lrXcT866tuPBWWqjW6AH0TrnB4xuxHcIT7gU5WQUnCQ89ao37Pf88Oc3IFUJzGXqPUCMI5kEKjDOLdEGoZfQlhiZtDD2pZCT3wZp3z_p8azNLPjlQQ9Z-TmN4HKDtbryu2jXUL-_SVquEb2Xk_I-r5CBju3Ar7ZDfsUf8ebBiAtsbUqIlYRPhUPGEuTnsx6pJyX66V-5siOHscmrD5srI_tiK5oggsDrOBBCLVK7SVpktSeFnEFase1Mbk57hpJFGlhHWoY_0tSmtoW0XuvvkOGp1W9pM5IMTr1rrby0awjl5vTR-49ZlGSnIrGbCysVAMrCtFckIfD0Yq4hx4t62EqQ2zzjgRnUgRYnoF9030jEExzH0W74IArubV1zozFSQNqf-71Cvx3FD-5r9zlX6saYnzXFr1zct2_yU5k8OuUGekH9PXFsqdBHecCln0-IJWLeuc2GByXIuMmhJsEzPraK2X91S_yZkvaQzPNKwH8SmCxK50eyIhbMhZGpNK7bDnG3tOPxKrWjbHvPWLuqqwAy9Q6CmTaM7M3SC5Tw=w494-h435-no";
    ImageView aventchupete3;
    String urlaventchupete3 = "https://lh3.googleusercontent.com/68262NbSeGvqcINBSUKsAssSG0xGhRyfj9Ns2gBKksALSOg0jTluCvxziWZ7vrtXkEPDOKLmpezK-XeP-E-7lZ8Cmgo8K8NcMQwzPhurxFfU9A2hC9Z9t08K-aE2oc7HhsTq14yboh18CY7hisTjZG8jaS-jqoJlF6f5RBzOcZaRMwI6FclnOn6pVtY3hUV5RsEughUo_b98aZOCoD1RBdsXnJIMayPc7ONRfCSJwnILb2MXs9D2aZB6MfMw9M5k3lWPU8dAOyy5xL3EUEyKoAPI8jdf8hRy1Rhoh3m2rSaxSvCWNNBgfBGr-pHnVPEX3PmydSnpnwim7jFyOnklrC2AmXARseCVq72mvr-D7pQkRLHX9U_Sdd1KZSQf5JbZlvADLZGJ4GVOUpSzsWV6115aOPVG5hH6qnR2XMgJLKwXKmDYdi2L2qQpxZGtvATq5Oywgo_AaUCqpwNValdAldWfN_kzuq4YhsX9HLYDgSyFD-YJYY5yYCPou-HfBrWWI-DB4cn9VbR3CI4ckQk0sTDqM6aRg0Bg7OncR3i8rvH-5MnODP6AK86vSoKWZ8vJ45jKOFpaIoTDrd3yj8CJQKVop3h2pDyWe_ss7cridldqVZyedg=w494-h435-no";
    ImageView aventchupete4;
    String urlaventchupete4 = "https://lh3.googleusercontent.com/O7Hj0VVQ4gAh4Ht5UrRj1GRV3A1y7prgjq8qCiiROWqKgm4EP_AV9RU_axO5Ju6Evz3-1MnjBdXEQ5AuZyO-0o79-gDOpn0fFWoJxuZOCmdkOP9yiyr5_BukLDbM6JGDrNTc4Rkqc6zclT_ammKzOw-wJedDeEhCzRY-uCnuXbLSA2gm8b_-j2dalBOJS1EAw7OzfxyZh8pKg2pEFR2hK0sZrcUwzNHHr4Ga57MyjVw4OzvL80xpYbXgndMtocOn_9Yxlim8sZYxPfnSbQPlyMCiluOcHfK2CXhAEe7ewgW2AeEmJzojr8n4QFdI2JOAyTNGb9VAP8nuwX3R9vkdRvC8-aB1-FjJfaDxMcnKb4IaPTESXcSvm1890vM7fdPrVY2K8AaDzCBELPgmNM5LfPy18viHS7pnJpHj98PSZEFD6B9OBtxVY5hv8AKHf8wjjEjRnPo9Z200QFYS6pAR8BcFYyUszWIZ02yLD2qAkiQhOEtvl0YlwXGspjb4CkHJTsKp6wRGuRIEEjQfNK_5Vu_I1q83I_AEMTAGKChT5eop-oe6PyMhJP_DF6aFT4GUWMdQB9ZI3vHMuAD3jPherESoM6eyYO9chuY6fVukeDyjawkraA=w494-h435-no";
    ImageView aventchupete5;
    String urlaventchupete5 = "https://lh3.googleusercontent.com/pkvf8oiasvSa8EiJ2FCP9xcC3t7ZaHfFKHQO5b1yi_Ea8rCqIdrbkNH2tS6d4Obv_6GOMeUhc-gjRFbVsG9y2vZupRSlUgFN36cV9-haNz186h6Ksah3XCtY1f229D5e4GSz1vSYKO3CQ-6hUKgDH5hGVmIwW8nVK2iYz8QNhJlro8C13T6O8tOooTYoFE5tn96NkPXNugcGMxgXfcvbmbUKSkcSgzx-CH02-0ztZFr0zoOaGN8CnqWUnGOJVgJDlneevvCWNgN_74Lt3jcaOEgahlPPVcirpEsGzXOuphf3gXNU856J7i0lEoPWLVVSAM3nCB_crUgG8gG0bV-jlL_Q27K7DBZuIsRyqfn_CbJq0aPqs5JCfFqyGi_BEeUE4s08MP7XoZHx_eA83IZSDxVby5zMh4DMTmeB-LWfjPCnuiUb3pfVDsm63h5rvmxXwIbDhyBl8BvGD5WT68JKZlCviDCREAdAhwOPDYw5ruw_8N-kh_BrjHIm65sCrX3bcDeBDqoxZtL17Rjvg4ZeDvZ46jI5M8b7x6No3Wzl2b46YoBbVZd0vX5a9PWPIvYULXtDZaHa_GpOzdXJl2NgnGrpqMXupJCP5PoAtjsUjZWl41QZjw=w494-h435-no";
    ImageView aventchupete6;
    String urlaventchupete6 = "https://lh3.googleusercontent.com/sFRKepQH1CoKHXov2vD2YG61d1ODA4jWEhNybbVZfKTe5kIvWNfrC4orSn7XAoBJIVsGQhnm3WrIyqskjPjuRx89QDlYspiDVgTUpD-pfrgGEJLRNMcsbZcl6IvKWwnUNm7bRA-QzDNF8465b4z_-G3ekCkLGU6MxPkYOkl55YDBFCb-T7PWaptWzcd9d0Iv27HBDf-sY13n3-ISCwOfiQ6Fycf5mRyLXaq2RuUUeck1hjl6B9JHbGKjD1qTbfyZgWhQ_jtYLisr3HNBCepNflFLQYod3V4yK5lDZSLhFHM9Pztc7H_9ShRotkTzMWF4VaN9MenuVnpZn0fVCQQJkKfI9idggSMfeuD0bTUxz0HWrk98XuBdKlG_k_w-uslVWFqbbJfk1Le8WHpUvsOPtejaAl-YzHQ7gyp-iR1sA4PLIY0zF5qWKHpaRQyzSPrs5L1ShttRZ2RmXx7H21t-_jVQtkl08LTIdJ7-FZRJb3FrL4lCJCbnLV1f8C8SsoCqaHNYpUk0Rn2xMAMwFURb6uaJHsQbMSyjRleaFAHuov0-OeGlXeQgLPcZ_ptZFi-Man70FqOblpLnz0GJFuG-VwAOz08KSiAbp-Ewf2lgW9PdQW41Ug=w494-h435-no";
    ImageView aventchupete7;
    String urlaventchupete7 = "https://lh3.googleusercontent.com/jg2HAiro_zIHXxx6mQxTbXznVLfGeYXXD3e2ualOG6QFZqpdZA0SEPrbmGf4rNK7n7UkzBt_QTEGR8yA4TTE99Q2fHM6zu1ZFEZcbwLNrQSCBUZpT4xh1kFQDwdJhqcHlW0H8doQUrQQ6HBh3x-b2cvF1i60jaUhlnRnwGfP_KRlDEEg7THPp3_qOD7Ztn30VVaACqgo1iw9H-IzqPpoabNAw8e97KtAVfOXoHc3me_beQBNW-iopIYPaZdByeDLIGGDDrvmQ25zaY5GxhJwH2uONbIN3b68Nz42XcYVh5amaUifoLzbWcVk2Nedko0f4_GsafHeO_oMLHBpyS-f0wqsBB_XpSVVN85Deh8OHUjNVxLGXiWy_WDv7us2Kx7ITKNhs1SwiCpHUbYUKC-Lmbj90EFIbdx63nmaUu5Nxjafxgi2TRBoWmk3bF3oA55qjoZTtclSLwEdsY9CY5hmQMT-h8NtrLqddq1xG_DwOICo2_1gdnU9AalvhVN93NO4Jk8cTYoyVQCwpF5NotsG-YVP83PVYKkvhwd4NgMVrRLbtrcIgoTYa_fy5o96lTUm4rltXekqCpDfXyFkMvuqAYeD5oiVgnRyAOrckDSe4Snge1wjcw=w494-h435-no";
    ImageView aventchupete8;
    String urlaventchupete8 = "https://lh3.googleusercontent.com/aSKiLk08N6OLkpkBXqO2tTm6zEWUO9XsiNscFfDlsYN-JLQeBac5Pmc5cl9Pg6XL71_dmQ3s8dDm5pQgUfx1wITG_TcejdWzwiW7dteXlQIaHsZbz8aDvxeYxBZbkXwg52gM4mcf270uiElB4gMg48m1mqhFOXUrh2eus7BM9Bg-jInXajhB7E67ExrIBnJzv5aWLTN8-S5jyKRWzdieO78E9EB_qjLMVX2rTaRG6hnPAPli_odd63yFrYgbJsKBWnM6gm6UheXqyZN8_D0SWMq1Z5kJalB3yBqPB7LokNNT_gA7r2wUTw3_Rmi7JakEWVwf1lLEjg_qzU-6KONxK1SgdZqiIWgGYMvHWdaz2lBldgS3pf11qan-uWEUUyFVjPGvUkhtqEUc0z0ckCM7tMSR0Ckjhgfj9aZVST0j1XVk4Cv-kANNH8B5gL_UXuAHuWsqGzPUssEHtxPx779ULgIkQ19dk4AqdUvwWD8qlrNDvi2banJG7gmd4Tr7ILEymyoKrH0vdP16oOnqRPcjxRc16FbqN1r_CgYLipRdijJGSRnag9zc6o09G-65dDRd_2sJmFOhAtXuQ22aTJwOyoXSva7w_CWIrd7GY_4GUB58jbz1mA=w494-h435-no";
    ImageView aventchupete9;
    String urlaventchupete9 = "https://lh3.googleusercontent.com/e1uiwWvmMo1RVzFy_iMrdAo1Gfnbaxrq_R5wSM5f6Jbxf0wSxXJ6_JIo_eCcgeWGr1tI06LdDr4zueaXw391Isg4c9jYWxljxLMgaKVsqBLuj2dajHUf8cw48We-hRcrg9qe0bXEDKQlMr70tLCB3s3J8rhRYs6TbGoQRbZK0MusNDJWnBuVwu1KvhGTLCg2oFltu4MhxapNSl_CEUvV2X8tl4wywgBvat9Qynr-8bGHPTNK4WxzRRSfXV338XbrganMpnW6980YYzxQsh0PJTv89OuYvGvQicbBmuGtQAWSkBX0wAXiMxQcyAgbUOPTEP2z5DP0MHzc-nCx0zx4oP4haJ19QcVb5sleL7gXwa4DuMzoBzHU3BE0HFIJTS4EsUE13U5Yn4fB72Ua8ioSU1RvVl0twH4o96zoifskqAxlVUyQOOx8jsG2cWFhn_Uc7QpfMTgu5Lt1Wr-yvzK-1sPk7KOm0iCh4jgSGv6CCqI17HP-zpNaOJTxylO_6DAFZ0729vcB8IS0x4LXbhAa-3FG5A-fCnFVXGFLlSGlhwmk3U1hras5Dz4vLZiZF250soBOp7EVnqN_629mu_j1Bcwk8_OrV403ekzfmZ5fG_cWULyk8A=w494-h435-no";
    ImageView aventchupete10;
    String urlaventchupete10 = "https://lh3.googleusercontent.com/vEWFPgVE-5gNbzMFWDih4WrRAbHOnkUDeJGlBAYfIgrZX9SyR6Qq5kGq8kw-1KCFihwL9rvFh6hgvW1QBi1xqu0d7eFxpvGPFwmstHnN49L7EwmG60f6jF3XRFGSGIwXt3hR2vOqbppQ5YONxfkvKVAqg3DquvL1EZxiqg2d0306Ef-CvxHcCvmrkHq9dBtFKmUjJ-hjzA_bJlEG6o8A6wR6MQcidspYl4UEI2pKiGRqjTuN-NNV3zGDDdRxk1mUxgKCaPVnlErYn08Eg5nvtuJWh9UfGIJwVtDS66_oDIeSDpdUSmoUR9HssLXVVIPKfb5XtdMs6579vcRNcFDGjDU5lw2Ibf6vaXUtSWYk3ah6OOeuYTAZ1wdQY6mbMc8p0k5ZLyyXys35nmL0-6tUeD5o0MbEx7tBvOw8ez8w317fONkOwxTJU_TlhkybSCwbIR7JIYW-JGYXhzGgrqqKrexsx31w_3Yjc9bBu7YwKq9sVmzoHoWr3e8YJXPoXCBQSBSmBfuhHNrA1cdpyHdmpllbEkPaukyXccaZEty77RrEt3BM2DQ4Y9Ljf-9r2eWpegAUhbipOpwI_mJrpUtrzuW59-KL4Zd8DSrw-reRcLMAugkbrA=w494-h435-no";
    ImageView aventchupete11;
    String urlaventchupete11 = "https://lh3.googleusercontent.com/jg2HAiro_zIHXxx6mQxTbXznVLfGeYXXD3e2ualOG6QFZqpdZA0SEPrbmGf4rNK7n7UkzBt_QTEGR8yA4TTE99Q2fHM6zu1ZFEZcbwLNrQSCBUZpT4xh1kFQDwdJhqcHlW0H8doQUrQQ6HBh3x-b2cvF1i60jaUhlnRnwGfP_KRlDEEg7THPp3_qOD7Ztn30VVaACqgo1iw9H-IzqPpoabNAw8e97KtAVfOXoHc3me_beQBNW-iopIYPaZdByeDLIGGDDrvmQ25zaY5GxhJwH2uONbIN3b68Nz42XcYVh5amaUifoLzbWcVk2Nedko0f4_GsafHeO_oMLHBpyS-f0wqsBB_XpSVVN85Deh8OHUjNVxLGXiWy_WDv7us2Kx7ITKNhs1SwiCpHUbYUKC-Lmbj90EFIbdx63nmaUu5Nxjafxgi2TRBoWmk3bF3oA55qjoZTtclSLwEdsY9CY5hmQMT-h8NtrLqddq1xG_DwOICo2_1gdnU9AalvhVN93NO4Jk8cTYoyVQCwpF5NotsG-YVP83PVYKkvhwd4NgMVrRLbtrcIgoTYa_fy5o96lTUm4rltXekqCpDfXyFkMvuqAYeD5oiVgnRyAOrckDSe4Snge1wjcw=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventchupetes);

        new precioaventchupetesAsync().execute();
        
        precioaventchupete1 = (TextView)findViewById(R.id.precioaventchupete1);
        precioaventchupete2 = (TextView)findViewById(R.id.precioaventchupete2);
        precioaventchupete3 = (TextView)findViewById(R.id.precioaventchupete3);
        precioaventchupete4 = (TextView)findViewById(R.id.precioaventchupete4);
        precioaventchupete5 = (TextView)findViewById(R.id.precioaventchupete5);
        precioaventchupete6 = (TextView)findViewById(R.id.precioaventchupete6);
        precioaventchupete7 = (TextView)findViewById(R.id.precioaventchupete7);
        precioaventchupete8 = (TextView)findViewById(R.id.precioaventchupete8);
        precioaventchupete9 = (TextView)findViewById(R.id.precioaventchupete9);
        precioaventchupete10 = (TextView)findViewById(R.id.precioaventchupete10);
        precioaventchupete11 = (TextView)findViewById(R.id.precioaventchupete11);

        aventchupete1 = (ImageView)findViewById(R.id.aventchupete1);
        Picasso.with(this).load(urlaventchupete1).into(aventchupete1);

        aventchupete2 = (ImageView)findViewById(R.id.aventchupete2);
        Picasso.with(this).load(urlaventchupete2).into(aventchupete2);

        aventchupete3 = (ImageView)findViewById(R.id.aventchupete3);
        Picasso.with(this).load(urlaventchupete3).into(aventchupete3);

        aventchupete4 = (ImageView)findViewById(R.id.aventchupete4);
        Picasso.with(this).load(urlaventchupete4).into(aventchupete4);

        aventchupete5 = (ImageView)findViewById(R.id.aventchupete5);
        Picasso.with(this).load(urlaventchupete5).into(aventchupete5);

        aventchupete6 = (ImageView)findViewById(R.id.aventchupete6);
        Picasso.with(this).load(urlaventchupete6).into(aventchupete6);

        aventchupete7 = (ImageView)findViewById(R.id.aventchupete7);
        Picasso.with(this).load(urlaventchupete7).into(aventchupete7);

        aventchupete8 = (ImageView)findViewById(R.id.aventchupete8);
        Picasso.with(this).load(urlaventchupete8).into(aventchupete8);

        aventchupete9 = (ImageView)findViewById(R.id.aventchupete9);
        Picasso.with(this).load(urlaventchupete9).into(aventchupete9);

        aventchupete10 = (ImageView)findViewById(R.id.aventchupete10);
        Picasso.with(this).load(urlaventchupete10).into(aventchupete10);

        aventchupete11 = (ImageView)findViewById(R.id.aventchupete11);
        Picasso.with(this).load(urlaventchupete11).into(aventchupete11);

        btnaventchupete1 = (Button)findViewById(R.id.btnaventchupete1);
        btnaventchupete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete1 = new Intent(aventchupetes.this, aventchupete1.class);
                startActivity(btnaventchupete1);
            }
        });

        btnaventchupete2 = (Button)findViewById(R.id.btnaventchupete2);
        btnaventchupete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete2 = new Intent(aventchupetes.this, aventchupete2.class);
                startActivity(btnaventchupete2);
            }
        });

        btnaventchupete3 = (Button)findViewById(R.id.btnaventchupete3);
        btnaventchupete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete3 = new Intent(aventchupetes.this, aventchupete3.class);
                startActivity(btnaventchupete3);
            }
        });

        btnaventchupete4 = (Button)findViewById(R.id.btnaventchupete4);
        btnaventchupete4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete4 = new Intent(aventchupetes.this, aventchupete4.class);
                startActivity(btnaventchupete4);
            }
        });

        btnaventchupete5 = (Button)findViewById(R.id.btnaventchupete5);
        btnaventchupete5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete5 = new Intent(aventchupetes.this, aventchupete5.class);
                startActivity(btnaventchupete5);
            }
        });

        btnaventchupete6 = (Button)findViewById(R.id.btnaventchupete6);
        btnaventchupete6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete6 = new Intent(aventchupetes.this, aventchupete6.class);
                startActivity(btnaventchupete6);
            }
        });

        btnaventchupete7 = (Button)findViewById(R.id.btnaventchupete7);
        btnaventchupete7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete7 = new Intent(aventchupetes.this, aventchupete7.class);
                startActivity(btnaventchupete7);
            }
        });

        btnaventchupete8 = (Button)findViewById(R.id.btnaventchupete8);
        btnaventchupete8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete8 = new Intent(aventchupetes.this, aventchupete8.class);
                startActivity(btnaventchupete8);
            }
        });

        btnaventchupete9 = (Button)findViewById(R.id.btnaventchupete9);
        btnaventchupete9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete9 = new Intent(aventchupetes.this, aventchupete9.class);
                startActivity(btnaventchupete9);
            }
        });

        btnaventchupete10 = (Button)findViewById(R.id.btnaventchupete10);
        btnaventchupete10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete10 = new Intent(aventchupetes.this, aventchupete10.class);
                startActivity(btnaventchupete10);
            }
        });

        btnaventchupete11 = (Button)findViewById(R.id.btnaventchupete11);
        btnaventchupete11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnaventchupete11 = new Intent(aventchupetes.this, aventchupete11.class);
                startActivity(btnaventchupete11);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventchupetes.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventchupetes.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precioaventchupetesAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3f271b615c2e60d8d4b074aee3471f51";
        String precioaventchupete1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=405f187e2fd7622b6190d480b76395df";
        String precioaventchupete2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a97aa0c1a059bb2ab2b08129d63a0e80";
        String precioaventchupete3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7a5a1dc83b2b13daf4c801fd89a5c6f5";
        String precioaventchupete4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=58ad042793df5294ad796161b21c0b72";
        String precioaventchupete5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=2552fe124cf4710a065eee02ad8cc626";
        String precioaventchupete6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d751a7089206e4c7181c3971a791cbd3";
        String precioaventchupete7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d9c71982576a16266a05e48abdb20e3c";
        String precioaventchupete8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d2cc25012bc80232e01d3693ec066b86";
        String precioaventchupete9st;
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf482d550c63d982dc7a663836d9eda8";
        String precioaventchupete10st;
        String urlprecio11 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f115f600618b5c3ccde7ac1205a3ec7e";
        String precioaventchupete11st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precioaventchupete1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precioaventchupete2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precioaventchupete3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precioaventchupete4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precioaventchupete5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precioaventchupete6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precioaventchupete7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                precioaventchupete8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                precioaventchupete9st = metapropoerty9.attr("content");

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                precioaventchupete10st = metapropoerty10.attr("content");

                Document doc11 = Jsoup.connect(urlprecio11).get();
                Elements metapropoerty11 = doc11.select("meta[property=\"og:description\"]");
                precioaventchupete11st = metapropoerty11.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precioaventchupete1.setText(precioaventchupete1st);
            precioaventchupete2.setText(precioaventchupete2st);
            precioaventchupete3.setText(precioaventchupete3st);
            precioaventchupete4.setText(precioaventchupete4st);
            precioaventchupete5.setText(precioaventchupete5st);
            precioaventchupete6.setText(precioaventchupete6st);
            precioaventchupete7.setText(precioaventchupete7st);
            precioaventchupete8.setText(precioaventchupete8st);
            precioaventchupete9.setText(precioaventchupete9st);
            precioaventchupete10.setText(precioaventchupete10st);
            precioaventchupete11.setText(precioaventchupete11st);
        }

    }
}
