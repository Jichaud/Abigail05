package com.abigail05.mibes;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class mibesaccesorios extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnmibesaccesorios1;
    Button btnmibesaccesorios2;
    Button btnmibesaccesorios3;
    Button btnmibesaccesorios4;
    Button btnmibesaccesorios5;
    Button btnmibesaccesorios6;
    TextView preciomibesaccesorios1;
    TextView preciomibesaccesorios2;
    TextView preciomibesaccesorios3;
    TextView preciomibesaccesorios4;
    TextView preciomibesaccesorios5;
    TextView preciomibesaccesorios6;
    ImageView mibesaccesorios1;
    String urlmibesaccesorios1 = "https://lh3.googleusercontent.com/ikp4rjk4vJWC9vv5cJ07u6vnGjgy2fr9_FKSzE-C7Egc2rMX4u3k0HiHTJMsOnwpbmU0FCD0RSr4QMUFFLWS6fOkw3Y5dgdmrYwK3CqW5HKabin82ZzSTPvCr5cz8apNCl4qr4Gr2DsSuscOYnTpMRqepLjjdKQuxn4amA4j0aeF3Nw1EwuCFQx1L1hHPuxtlWnWkdXQBbj6U_vIkotjmMChRFFtFu-TVGpYNar4QDvDsFFoLkrlju28W4VTxNV5_SmjvOYQutocYW_fHAaC-ntsQR259JUFcYDl5vq0b3D593Eyp-JPj_tGA1WxbNU5hDswcxiOKQWhX2UVUHz-Z1DFrsJ0_vELJ8MZwrBkMAwfCEaHxEYgt1euMC_v9nEgpmpdMeHkUCYqkL_DKDLPJ4r0opERGsPJEzXDizKlpFKRGY9MyeOsGPLUkv-iNjhHYuY11RdmdcXLm1aXwc0_STwiHKSc8KqSdXeUdJSWfMgAGZrpU7h_GhoYdRo-JFIvm-lMrNVFbA_44l1bVPEE8zPQO-u2-au9BOHTVIifI4ytU1sP3uaLgtoludUGCZyVXbNaTuQqQ3u0Diwx1RQi0PkrtGBj7-JjwlQrI_eoaP_FBAU3N9tuxiUPoPBS2IaxTzRGRtEnCzhvJ8NHQgdf3t0-_deSNdXMEkxr0FghmUs=s725-no";
    ImageView mibesaccesorios2;
    String urlmibesaccesorios2 = "https://lh3.googleusercontent.com/ohW0zf6gbTXRh02BFlvx6oH0vHOFxWNaVYOQk5w0NDE9GV20v0Xan304ai3JsDefw0yfVE8hHe-nFJfYLLzgVf5RY6NvzdcXNUS58tSDja5YYL9C3qv9Z4XvbX7IFjwkO81usv7f43FzICQ1709Y0R4hFRDNbgq17_HHkhVsCiip2q2fhWg-VQO_1RRxo8HzDM-9i9br5oMm90SJM-1PWlbF8nSNMhWZhc57pVl9j-Jb6glEz9ajZrXZ9IB3ZKrRzPvcJ-S9o0_CtuprucEnP96nIV5pl6W1OeIx_yj57-vPIez_XkglDfJvLOde-r_Jslt0Ux-fZ17CdzJOkCOGhZMMwdDNLyRKxQKYbbZRpuEVytvfiGchO93fQkiq-FM3jw9c_Z_vh5I4zUnJOMQ--4O_mdb2PPB7DCTWUU2Iwa1Iu_bAd1G1fDMO-GV1BFYjnw7Veiaq_SErvRMGL2EAOiszzQRe0fIcfisN7k0hEn_1PYMkOAcazA_EoV7EFj-PNHN8sU0st_IcyEWh3LSSXevvMANf9y6cFeLtdfKgqW3AM1rOclU6d29sYWSF_Bqjo6jQaIOtuouXzIvPDGA-6V0KTpVfWI3iEK97SQAJuwrx2LBrxj7m7k22OV06gKZRoGseHxyZRShUOefhJRkZTNYdswp0YtcXl6dYtSf6Bpw=w967-h725-no";
    ImageView mibesaccesorios3;
    String urlmibesaccesorios3 = "https://lh3.googleusercontent.com/tTp2uDLQkhMigTu39KQWGnAB8CL9QqwX4lDdrfO2UwXAgHBO3d0umFd8pL6F0Pba7MCK34gpGCoYWdwuG93WEzV8HbesyyR2OLYiQYAPuCupWE9KCIw4zBrzRQlbPQ2jsjCuukLtQs2mv543eAAYsviEWgbPTdBsIOViPu4ByGT4pmDCXW8vxWCPUHMxMfLOgsbqkXfxeLid0Fds760mE7LsdiMauR79inKi_dvCL3p1ErE-EV7Ekpf4GJL9qCapFkfd3rJaqZkdI6JiRBtaQvVsWeC9KocIm4ULRebMqsFPiak0p1ZBmvqsBdnd-tPYCIthlOfAxu_ObS0PdmOBGijITO2QCJ7IvpJXhgHTvpG7C8y-h9QQrl1VFpIl_fAQmzpF4kIiI5MzcvBfRxl_naqkOtI9TGGqWLCzFTdpyItmZlaF0oL1iHAi-Aty_gv381ykJuTFCtMURE-TUDMuiHLrDzmI2vX56u3mHYp8BGLnmSQN-BcdTOAg6ECt4cCWb9snfdSgVPXPrx44q30xWo4W8n2Z71HBSY7VFljQ-Lq-U4NgOWrK3XZNvRLpGUzsQVESRd9TOD3eXhF49XUcAAVCsFKcBD8eI2D0CKtagTdbMExG3fimN1uMeiz1Of48o2hfdQRKZ-s422gZdfop5hP6BfPBPLM-vY1kg4p3wH8=w726-h725-no";
    ImageView mibesaccesorios4;
    String urlmibesaccesorios4 = "https://lh3.googleusercontent.com/hqneVFnTMqQt7PB8dwGcDz188EuSJMGb36xl2Pm_WhSAB0GQ_F1bAmuLg12PCTVKlshXn6md8WuLqVIz5Fwfl14oSsWR5Mlhy4e6xx-Vgt1ND_09wa3SWQBAfH27zXrQM67an9YeE7J298UqCtzpX3d5_O2VaPKtDlE-DaLuBc-1Gc7fusce3-OwmFJ5rIQF_AamEzqudPwEuxoW68741twoy0UvP7rIIm9XYaGr62ANSMkR-zZMBbClCIHCkp9OcBWFyDQFabEAi3zxnjqywgTyou5TwZ_Kdt8ZUPUXi6cHAMSnoCy7Zb9GaVEB42fSF0yap4oLOj0G1ms1lwFLfQLkv0N2ypd3CWaBVLlk0ax64BS47IU780OZStDZwJydgVkke0wLX7nqcjP5yulzSdFnubkmnzM0aJGydjm94rabscu3tXBC_DLvLNmkNw_pEjxVFCSd_jBLaiaXDJVrOUDKshrw0lwHfz2BxYDx7mxyKL3sXq7b5TMZHYtzxW42pK_E20RJoLGoMl60GC-CF7qspX-l_IDO4fu42BOPDYLsbyMJF55YjKyQBarmCZsH2GA6uV-y3LjLmXHNx0W3girGvdeQJ0SHE24dSCPwcgTcLZT-GP09cRYu1m3aIj2-4YOVeK7LMsJnUev2W9lJdJukgWy-1SpaNC6YNQ1rSB4=w967-h725-no";
    ImageView mibesaccesorios5;
    String urlmibesaccesorios5 = "https://lh3.googleusercontent.com/d8_jCOJf7o4vQ8Oacq-DufpGKwT7J0os09z83YUEYC1MiJEGdHEJWimTFHqglMto0b6QtyhW-3AWdZRjPkuITxxxBgFS2JPUJ4AjNC00q0k7uzJ8i6PYZTEpkEmQQOWAHA-xR2JlaUXodnQinICgf2vd6vEcvmJDXt4XiOc3AIxc0qPZbgh_L0umJAqDAB0lidkXf19UjaKMiiK62FI9YSQ370Sjm6ptLOJOCMKdgFq04wngEbqpitWFWox24nqyAsXgXrkGamS_Usxp-jtQTws5WUB76WzLk_S2BQtK2IdLEaFUx0-LVrgySbv5LHwXZ9pkoIVgtmj2sJ-qOIx7ZpGEBR36N_gtkDDcRX69YfAzwjRZwC3i2d06qaRBH6FR5jgRDt18iyVJuZ7CGFPhs-fDfVv3XPbS2aHOV5fq3EOuen0YB3pH3CzqSrv-gho3CP_OUR2jk1E44469RWxD1l3I4iKSOA-cJDbVb21pVXGmvh9CzfCfQMMebllhNP1pcsuftZ6F-900FfDBfBqZYrHoFM3zIS7McnCijSasa10T9FW2B-jkEv4bwAg2j3n3imEiRiRZGpTAGMGHZBv-0qEeilLa8vwLgDzQUx7H7sPfvJUyKpUB4tVCLYB4YwVVUtEwPawNk3UNWpQkT0zSoBcX_WQdkfYI3NPu84Iod7E=s725-no";
    ImageView mibesaccesorios6;
    String urlmibesaccesorios6 = "https://lh3.googleusercontent.com/JMEEZYkZP6qKWW0zU-auHONw5rHGCCPZRpM9r9QWHGJb7eWmIonteECdnn0D3u_ekmKziQbb9-_99Zzy7FiGplZiQAe_JuxiXMfuiJPTshHA441oz_O6BUb4cZkO_x5pbVmjXgf1QEbEwpJ0cMj0fhm1NnNCk3DS0yEJ2rmJxMY5K6WXXzBKObnitrybunxmpYFypF7aczAKEQ0-VSywAOIn6AWZNasHCY4DU-ZgnvYJIrxY7RRiIgvGOv7SgJuUl054cylfVuDZOoCK6P3a-gcMFnjjA2iInvXFy7wBuVQdCefZSDRbjXV_FLcs0qUaLDP4RjKi7V3uW1EGvfQwxkCAANvE7qplZw3dyiCQlux0N04ACu2Rn0RjSlKWf3yH6PgQCK-KCsJQOpWFsjBM3ITiEUQ1W1W9qvs8HPm9IRlGl-TjnA_tMQmRxcNRmX7CKH9F9C7Gd9u_Sg3hFwFGdVTXWo_NyTigmIbCFyG6z85lWfCGB7cKaefsE_0cWqJLu54Jk_EnniPpIOX9AfE2hIKb_LclsuFM_6uwPSSlLmnFNztpGi2SOqrzlBC0DAIG4J5YLsE20qz_pM2KR3ug5F0y3uARY0wiEBXK042HIuMdAo4nwUvfkUOjDvU5IhJdoA61nYueNAr6e0SoPJzcyVmM5Tv93pzSsNa4GuMCJ9A=w811-h619-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesaccesorios);

        new preciomibesaccesoriosAsync().execute();

        preciomibesaccesorios1 = (TextView)findViewById(R.id.preciomibesaccesorios1);
        preciomibesaccesorios2 = (TextView)findViewById(R.id.preciomibesaccesorios2);
        preciomibesaccesorios3 = (TextView)findViewById(R.id.preciomibesaccesorios3);
        preciomibesaccesorios4 = (TextView)findViewById(R.id.preciomibesaccesorios4);
        preciomibesaccesorios5 = (TextView)findViewById(R.id.preciomibesaccesorios5);
        preciomibesaccesorios6 = (TextView)findViewById(R.id.preciomibesaccesorios6);

        mibesaccesorios1 = (ImageView)findViewById(R.id.mibesaccesorios1);
        Picasso.with(this).load(urlmibesaccesorios1).into(mibesaccesorios1);

        mibesaccesorios2 = (ImageView)findViewById(R.id.mibesaccesorios2);
        Picasso.with(this).load(urlmibesaccesorios2).into(mibesaccesorios2);

        mibesaccesorios3 = (ImageView)findViewById(R.id.mibesaccesorios3);
        Picasso.with(this).load(urlmibesaccesorios3).into(mibesaccesorios3);

        mibesaccesorios4 = (ImageView)findViewById(R.id.mibesaccesorios4);
        Picasso.with(this).load(urlmibesaccesorios4).into(mibesaccesorios4);

        mibesaccesorios5 = (ImageView)findViewById(R.id.mibesaccesorios5);
        Picasso.with(this).load(urlmibesaccesorios5).into(mibesaccesorios5);

        mibesaccesorios6 = (ImageView)findViewById(R.id.mibesaccesorios6);
        Picasso.with(this).load(urlmibesaccesorios6).into(mibesaccesorios6);

        btnmibesaccesorios1 = (Button)findViewById(R.id.btnmibesaccesorios1);
        btnmibesaccesorios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesaccesorios1 = new Intent(mibesaccesorios.this, mibesaccesorios1.class);
                startActivity(btnmibesaccesorios1);
            }
        });

        btnmibesaccesorios2 = (Button)findViewById(R.id.btnmibesaccesorios2);
        btnmibesaccesorios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesaccesorios2 = new Intent(mibesaccesorios.this, mibesaccesorios2.class);
                startActivity(btnmibesaccesorios2);
            }
        });

        btnmibesaccesorios3 = (Button)findViewById(R.id.btnmibesaccesorios3);
        btnmibesaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesaccesorios3 = new Intent(mibesaccesorios.this, mibesaccesorios3.class);
                startActivity(btnmibesaccesorios3);
            }
        });

        btnmibesaccesorios4 = (Button)findViewById(R.id.btnmibesaccesorios4);
        btnmibesaccesorios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesaccesorios4 = new Intent(mibesaccesorios.this, mibesaccesorios4.class);
                startActivity(btnmibesaccesorios4);
            }
        });

        btnmibesaccesorios5 = (Button)findViewById(R.id.btnmibesaccesorios5);
        btnmibesaccesorios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesaccesorios5 = new Intent(mibesaccesorios.this, mibesaccesorios5.class);
                startActivity(btnmibesaccesorios5);
            }
        });

        btnmibesaccesorios6 = (Button)findViewById(R.id.btnmibesaccesorios6);
        btnmibesaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesaccesorios6 = new Intent(mibesaccesorios.this, mibesaccesorios6.class);
                startActivity(btnmibesaccesorios6);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesaccesorios.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesaccesorios.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciomibesaccesoriosAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d193f559b858344536fae6bcb86161cd";
        String preciomibesaccesorios1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3b36ebbb42c777b786680a9fff6861b4";
        String preciomibesaccesorios2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=330fc910dbf6ad22eb427ed901a897ed";
        String preciomibesaccesorios3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=45f1077793d8fb52f9510a4e511a2db9";
        String preciomibesaccesorios4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d4f6aea9441e7a91370be20b4f984106";
        String preciomibesaccesorios5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=95109edaa2b2f3958ea85923e379344a";
        String preciomibesaccesorios6st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciomibesaccesorios1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciomibesaccesorios2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciomibesaccesorios3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciomibesaccesorios4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciomibesaccesorios5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciomibesaccesorios6st = metapropoerty6.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciomibesaccesorios1.setText(preciomibesaccesorios1st);
            preciomibesaccesorios2.setText(preciomibesaccesorios2st);
            preciomibesaccesorios3.setText(preciomibesaccesorios3st);
            preciomibesaccesorios4.setText(preciomibesaccesorios4st);
            preciomibesaccesorios5.setText(preciomibesaccesorios5st);
            preciomibesaccesorios6.setText(preciomibesaccesorios6st);
        }

    }
}
