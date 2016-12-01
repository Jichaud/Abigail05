package com.abigail05.NUK;

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

public class nukchupetes extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnnukchupetes1;
    Button btnnukchupetes2;
    Button btnnukchupetes3;
    Button btnnukchupetes4;
    Button btnnukchupetes5;
    Button btnnukchupetes6;
    Button btnnukchupetes7;
    TextView precionukchupetes1;
    TextView precionukchupetes2;
    TextView precionukchupetes3;
    TextView precionukchupetes4;
    TextView precionukchupetes5;
    TextView precionukchupetes6;
    TextView precionukchupetes7;
    ImageView nukchupetes1;
    String urlnukchupetes1 = "https://lh3.googleusercontent.com/tKF3N6OSVIP9QIVZwswRNEg6LIi6uDhUF1961JrbU9mEnWApgnnQuOZAXiVn7VODxxET0B7wQROp6C9dLqboXiFk23Y8ZM4Lp1z8nyHDEWA0J0to47744u1hocw_oJ2Z26Gca8ylz78iPMje_uAc0apD9FpU0cflVnScPaaUQ1OwQeoZcDy8uJ3A750sZAuWhFOgINUO00nETJS0M9DTMHoFXR2TuulHo1iD8bHikBNjWJytUWsgB9_nicoPdPU-GPGXIjyZ5mzKr0zBI8OGOf4BZSDkzBOPtkQfTKOeKHWfZa3jiRuxXFnLP-JWN_nbqfX-7GUNFQMfU5j3LhV8G6QgdLc-tK_HsWfcuBURrSjzMjBsg8GGQqLZ6NzB7qLsBlCMF4k-lPb6hRA50q49YJS8EP5pP3QOgbpeJlCggYVDLprSasYsVL4lb_qZ1RQtjw8fLhP3zB3srcuj0PmHVb8QqGbt03Wr3xNI4mPR3wO5zfwy6SMnLndWU-1MyQS5_4kxihPuZXouAG_ck2NpBaUWRLOvEx01wVk84qOnhtPZM8T48JS_lv6QTQMbH3r0F4o3V7Dsn8fl81IhSNCsLgXj-x3DjTlXnNlOD4xhTLD0jnTPTw=w346-h340-no";
    ImageView nukchupetes2;
    String urlnukchupetes2 = "https://lh3.googleusercontent.com/qCDXTMR55jUYMRZ8lUsm06YIZGLKDnqTL_RDVYoLYmsXz1QhqGj_2YIkZSsiKR9PKF2A2ckIuwbWsSfkmEz2v6DppCC4ztXKpY1C7ZoBfjjiQaWt7jt4J73IAtihU_RCOyNmKCQgthkJc2H36rBHg4Kjo9akvn6RVMzzfiP05OE2iHcsLaneYsw_nOFsdG5wxXXmhi0usNjTQ6DnQl408D9y_bau-URWytLKY9aqxiR8SAKcQhJMx0wMNDRRgrPoXpBXQRj8Wu51SfRaHU5LZRwMvootwZsQn-VEuFWRJ8x1Fnz9B74mcDqCUTuknjUzsNRM6-9vid_4adQLEsdoeNjF2GkGPzOaFMrmgm5vYWUQqEGP_fVZcXyWqJ53chBYmEQq-yZ_Uk281QX84f2VI5ToGsx8QlOAKptjHr50yAbl9xAkw05xX6bYI4tb-LZYnbopZBQg_aRQtjrJoj21sAs2ErP_YyEOUVQyu78o7-8Jx8Jr0kPZhVeU14pg4yst2ncbA2zuMCrNbdNR5nvqrYuMgUdF5sfJKZZAhtxPl4oKfVydwhJ9ro4ZpB4SP_FI8ZYKAamlCkBXEyDtKyrBq7yELHo_v4htwbC3k1F2A4RyX8L69A=w409-h340-no";
    ImageView nukchupetes3;
    String urlnukchupetes3 = "https://lh3.googleusercontent.com/yO3ooeIqIES1TIh6WRLftDjtQHDMBi58cBuIpQrMQhN4i8PHjbZTRbJlx_Sh7PB7ypTQsa80Yn18oJ1_r-sxIXdTsHavrG9dzBOMa1cEqTqrwWITGV8Lc94tWgUgN0r-bw_4qwzu7ztucgWsV6blUfBZLJVMb2pi_e6Eg8QURn9TL647RWzLSVnh6vQ0QLVNotFMLkBCdAYaB2P4DhxLtLO95FsNlZZPFW0AN657-P6yGh6kwOABwbTNAgBWdryg1yj7M3gXQU0NCGbPQbREKG1JhrXAXT5u9FtDx4ZKIIqiN65arVW9kPefc-KoPFVZHfd3n-qnjTe4Tqe-rd4lZHAu0eaDAjL-upuxx8aJpxeXThO3AVLTiehdYGMDu3x6OJC7Ey0pOxqQfgT6lDoZnys5aAuvhJ37eGu2rZoiHrblS5AIOJVFLZ8U7nCAmDyN76uRakE9oBoO5i3OMKVDaSsBH2VU87ZI5EdIzsrAdJdae3CUJL5S7xyVQXKbzTOE4l_r6s7kCwFp9SXPZzEBhs5JGxxUSMvkSCVLo9Y775pPLxpChc2QJc5osyQRxgx9-qVak8uAb7Gn6DC3zqKBIsjtJ6WRfBNNGuBHcEOqeDo3cfSyMA=w417-h340-no";
    ImageView nukchupetes4;
    String urlnukchupetes4 = "https://lh3.googleusercontent.com/AmTCEGTvq84oNkVqVcMYo2R0yuGNU3zoKzQFgysqOaUL-1MD4mFLvAK7kLSy8400iRXXmIZZf0nPzpjNUjDCTCn-gqA47D2ncJb6xKUVVPnj9wlAq-HQKIs6gL7bfJlrYhPedTkfhx8wiGpBB_90BkcsupQhCYS8LcoVXw2k7oT9AX456Axq2p02OOy-lQ2-rwIKaRuiwPFsENYfqMNEUyWBBSlgDZk3r7JhY81ioRmsa6efo5cM9_hyyt6ZUfDMP3K3jHgrDfdITjNcZYvq048Awtp8_U6goY-mCZJwo8eXLTQzH36m1wp6OH45YQcGf-O9-ts4R3FSO5jk4iDZ4H4fv2WsHMPrAbmNRhnqdmIi2ixK9ZDS8TkYqMuSYKIZ6eDNAts8H7WVFzk6QTpjsti5KZxh1UyqtVliJwYAAolf3i5MZ8Rw-kdKa3Pa-w_EucZq6NEE_bolNgpmWhwvIrJCH4qY2H41bAK0d6Amhw28PkaoPFBadwutGDQr6ID6kceGNR4R1jZXTD7Z_ZLRm6zSe4-JnIj-h1DycpImHZULYICKjRoDiN11KVJ2lkjJxVk4jVE-f1DAMgOaBxtkLMosvLJOT8JLt9IVptIgh4l4U7rNfw=w361-h300-no";
    ImageView nukchupetes5;
    String urlnukchupetes5 = "https://lh3.googleusercontent.com/Gfzs8yr8NcceJ4zKtc1pXL9lo0BCApPiPh9FGl94d6HecIIHStOyikVuHoAzKYALAtRt3qiRgrP3Q-Zh4YtbbSveJvMS5zvjL87woyKcILBDSR2Gwv6_fzfch3WiHXQLfxW7FotUqn0-fVjgYtcntFUhZdLIks0_CaZl8bOzgH38FdwlTK_HhlaBDDM2x_oQetLN-pC_qOXr3MpQqKOoOKEBwCaBM00SozcO3XdXeI0k4B_JcFmF_Jy0v6kOBUpfmcx3pUCZcc9vvMvtsgPTiggYWCJoVG9iYwzRn7a1iYJcQVX12NitR3xzZjxxFN9ouqVRPRWrPpeuhcycWu3uMzp6r7KTmy8viza50CQssbmrk-UUHpAUk-cjJZBpqiFqLecWfvj3X4YbSwF8ZW3Jo7bwW1jU-kg1WSQlK007izHVt6aR27x9XO4tmpxynay9TKFO6b7xm_Fyoi6Gl8BXKiRgrDRcEkNxEfqXrX_f8OtrJBnlN8pbRSd1zbCZhNCLk61bHaS24Ya4iXVt1J4r2iXoEmJt-i2oRdSASQxVR6AjtLKEK4TUcq6D1_LUXNZmQuyaOTo5Ksux27pZCACARNdnZbi0_5otnZicDCRS0C6cBvLzxw=w361-h300-no";
    ImageView nukchupetes6;
    String urlnukchupetes6 = "https://lh3.googleusercontent.com/GNcJ7UipWcH7fMcoSTk1FkAsxQESFgNMRYhie_S699XQNhNIL532SQztmB7g2O0-LX-tBxdV0R35mnrfTZ0RCc6b1-R5DvTVVpBlpP2Svp49563yogH-OuVicQl2Fp19E5FiIhQzKrBLjs4BAbT5UylxtlppIsnvpyt9CLi6BoswxVAooWK-MByzSfLv89mk7cBbM4cCIVMDZ9Ro9xytAbsdWWDXtqKcRnFiUsYQyaxhOxyDcF0-gDc1LOg5U90WXtJhiGt5VPJNrgLRjTNNelBVObqRFeDiXsFJLx1jfRFtalGahe-B34NDt4EWhXqqhhVrGObSfXQ2RdijscfgHq3UmAzM6b_VQ8hj1J1w8Dmb3gZ7qnrNuBYqSW3NkSB2VdjW6FMoo9sp_COmYfVkKuHq4nMRO3V_2RvpYS25wfkhpx-3RfLWcUSHyDeICHUs6oi_a70fMQxc_7zJksRsjSgsFATz8KFmhCMTNZvGkOxTRHt7Zk29oTuqlwNlCiZfszn7A_v8dd2RUQ_vdKZcyzk-9jK2TsdYOOhL2tyLtkod5sSzqx6PCm-vvSnSax3HwlYK9Pr9ebh08FQAMrnvVSgkKWh5bC2UmQ4YB-zjDnr-thszUA=w361-h300-no";
    ImageView nukchupetes7;
    String urlnukchupetes7 = "https://lh3.googleusercontent.com/aq5D4rl2cSc_TnNlu4dWOQ64oIbdXvzBvYAk_TxQfesUFBg9KKG9k8JZXLDRfev7p37aPxAfGfqoKpRgPuSgod5RAhNucwKdi5gbWVM_0lbn3-pL9BxxSZcBD-mJycnE2HB3brZeB32hYM0k_-UiNLZ6j5YUgkjUcj5dnR617oujsynd8tqixxzH8Pp1EkUqrQRRZJe-8GaLPf9xFMhGoSuDSrHjZ_h1NEaOprFvTe02h0DccQe7U6deUbSKI8-Wy0hHdzstXT9nlTAhhW4tgUPsDlN8AckSJZ8OsOBE4Pc6xD4RXZ-GRP0BYnypxtLR-awL11tBi4dUZwUiW4kgLXbV8Cj9p5jeRS238bTZtBhmnq_gGcdNTchblhInba8g0thMIRo1n8OY2nLoknK3RqDpGhYFWcM-odbox8wtet7xWRcayTCbEP3eahPqL703pgnSfN8bj8e3lDeFztPsERs8agAx2f5DoyWinas_CATyt4BAKDfLodM4aXeyWO4OtXJDoAV3eM8HlzfcLmbbO5bIIvkfd9OPlDVEwiMsC3k29rLcwFsgxc4lK5-jSVFCrWanHWDKMCEXabVNWlpPXKpKoLuvqg0NK2w1s_7cwSLiVONlUA=w374-h292-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukchupetes);

        new nukchupetes.precionukchupetesAsync().execute();

        precionukchupetes1 = (TextView)findViewById(R.id.precionukchupetes1);
        precionukchupetes2 = (TextView)findViewById(R.id.precionukchupetes2);
        precionukchupetes3 = (TextView)findViewById(R.id.precionukchupetes3);
        precionukchupetes4 = (TextView)findViewById(R.id.precionukchupetes4);
        precionukchupetes5 = (TextView)findViewById(R.id.precionukchupetes5);
        precionukchupetes6 = (TextView)findViewById(R.id.precionukchupetes6);
        precionukchupetes7 = (TextView)findViewById(R.id.precionukchupetes7);

        nukchupetes1 = (ImageView)findViewById(R.id.nukchupetes1);
        Picasso.with(this).load(urlnukchupetes1).into(nukchupetes1);

        nukchupetes2 = (ImageView)findViewById(R.id.nukchupetes2);
        Picasso.with(this).load(urlnukchupetes2).into(nukchupetes2);

        nukchupetes3 = (ImageView)findViewById(R.id.nukchupetes3);
        Picasso.with(this).load(urlnukchupetes3).into(nukchupetes3);

        nukchupetes4 = (ImageView)findViewById(R.id.nukchupetes4);
        Picasso.with(this).load(urlnukchupetes4).into(nukchupetes4);

        nukchupetes5 = (ImageView)findViewById(R.id.nukchupetes5);
        Picasso.with(this).load(urlnukchupetes5).into(nukchupetes5);

        nukchupetes6 = (ImageView)findViewById(R.id.nukchupetes6);
        Picasso.with(this).load(urlnukchupetes6).into(nukchupetes6);

        nukchupetes7 = (ImageView)findViewById(R.id.nukchupetes7);
        Picasso.with(this).load(urlnukchupetes7).into(nukchupetes7);

        btnnukchupetes1 = (Button)findViewById(R.id.btnnukchupetes1);
        btnnukchupetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukchupetes1 = new Intent(nukchupetes.this, nukchupetes1.class);
                startActivity(btnnukchupetes1);
            }
        });

        btnnukchupetes2 = (Button)findViewById(R.id.btnnukchupetes2);
        btnnukchupetes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukchupetes2 = new Intent(nukchupetes.this, nukchupetes2.class);
                startActivity(btnnukchupetes2);
            }
        });

        btnnukchupetes3 = (Button)findViewById(R.id.btnnukchupetes3);
        btnnukchupetes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukchupetes3 = new Intent(nukchupetes.this, nukchupetes3.class);
                startActivity(btnnukchupetes3);
            }
        });

        btnnukchupetes4 = (Button)findViewById(R.id.btnnukchupetes4);
        btnnukchupetes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukchupetes4 = new Intent(nukchupetes.this, nukchupetes4.class);
                startActivity(btnnukchupetes4);
            }
        });

        btnnukchupetes5 = (Button)findViewById(R.id.btnnukchupetes5);
        btnnukchupetes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukchupetes5 = new Intent(nukchupetes.this, nukchupetes5.class);
                startActivity(btnnukchupetes5);
            }
        });

        btnnukchupetes6 = (Button)findViewById(R.id.btnnukchupetes6);
        btnnukchupetes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukchupetes6 = new Intent(nukchupetes.this, nukchupetes6.class);
                startActivity(btnnukchupetes6);
            }
        });

        btnnukchupetes7 = (Button)findViewById(R.id.btnnukchupetes7);
        btnnukchupetes7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnnukchupetes7 = new Intent(nukchupetes.this, nukchupetes7.class);
                startActivity(btnnukchupetes7);
            }
        });


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukchupetes.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukchupetes.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class precionukchupetesAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f9b26ef70d86f2175addebb297ff8e19";
        String precionukchupetes1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=48e7e0e0d0d2a580461a00f22b2ed145";
        String precionukchupetes2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7b14fef3b1db3423237daa8f2316ef79";
        String precionukchupetes3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a9c80c79f446efda9701fb7e22247f4";
        String precionukchupetes4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b945e13a231bd9ae1929f3aa32a14f50";
        String precionukchupetes5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=0c8431f26da0910eee7b1264f317ae62";
        String precionukchupetes6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=c69698ba1a364bfd436df74b2165788d";
        String precionukchupetes7st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                precionukchupetes1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                precionukchupetes2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                precionukchupetes3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                precionukchupetes4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                precionukchupetes5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                precionukchupetes6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                precionukchupetes7st = metapropoerty7.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            precionukchupetes1.setText(precionukchupetes1st);
            precionukchupetes2.setText(precionukchupetes2st);
            precionukchupetes3.setText(precionukchupetes3st);
            precionukchupetes4.setText(precionukchupetes4st);
            precionukchupetes5.setText(precionukchupetes5st);
            precionukchupetes6.setText(precionukchupetes6st);
            precionukchupetes7.setText(precionukchupetes7st);
        }

    }
}