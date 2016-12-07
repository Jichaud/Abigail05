package com.abigail05.Chicco;

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

public class chiccohigiene extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnchiccohigiene1;
    Button btnchiccohigiene2;
    Button btnchiccohigiene3;
    Button btnchiccohigiene4;
    Button btnchiccohigiene5;
    Button btnchiccohigiene6;
    Button btnchiccohigiene7;
    Button btnchiccohigiene8;
    Button btnchiccohigiene9;
    TextView preciochiccohigiene1;
    TextView preciochiccohigiene2;
    TextView preciochiccohigiene3;
    TextView preciochiccohigiene4;
    TextView preciochiccohigiene5;
    TextView preciochiccohigiene6;
    TextView preciochiccohigiene7;
    TextView preciochiccohigiene8;
    TextView preciochiccohigiene9;
    ImageView chiccohigiene1;
    String urlchiccohigiene1 = "https://lh3.googleusercontent.com/UXbzABgDZOupwdj3TwkLuEI_3zYK7pbRwGd2grAw4fEXVp5WIrqoFwI15-3GOHl4EUQOu7f0pIHSx8LC1H3I0KkaDUIsblw9a29GB14u8sK3URhzXB4W-jjbSxyIh-HEfRmY0ZiBFQXXukAZ0QG8uPWLL0Gmeqz6uYSz6iWHSs2ZaOfi7pMUSUHlPc4MZ9Q7inY-KXMszzXo3aJP9hWSFeslXNYpJ6wBQkmYbvijkMCUqJ5iMj8KuYBaj2mdnAahjZRAwVewZ89CVkz1wbEhbP7j8Oeg2s9hZ-ML6YEFLce5oCzdSTsLTmPTleEJR1vBSemYARUGEGJQZFuFrxktA0IEYYRngIDG1SI3S9RWRi8RNEy0kEJLW6df1HUMaRKupZi_R80pTjbDAThe5rgR4c8y-4xtUqC9wa2G_IMlkj0SVsNzNVDHhR2oBNtjZ5lTppsDyIEKhEJLiEZIjPMDj3nJD4kT6Mr3zq3JmFoVLrpQRXctX5JGKOm3Os4_bJmheCkgNwQqbabrcL_-SA2dCa9ZfxSyz4tXHoEe4l0_6ppvDye0CjykuUY8vy8ggh2W6tp5rguPc0_0K6fSOG2CXUvaHC_zqPJcXH8nDtvj8BiudaaAdQ=w452-h450-no";
    ImageView chiccohigiene2;
    String urlchiccohigiene2 = "https://lh3.googleusercontent.com/ojpzZPwu77C7_k4MhzUevHzwPoaYChgrhDjjznOlnZ2lUB8JBOuY7CAVbIh0SjZayhqFZpPXUIcj9H1Ekh-6T7brByIH_alWQ1tuMgnvO8kXg373tFku7tRNuj2AccYgAqg_tNpBEyHXMI7Q2IDbTOxSTWniLnpOdQVpJh3uZlN1jXZ9vF_j9enWdpDj_qwcAhOCzBvqQjlD-xzthc1K3xqOFq7dApqqDJ5EAjW_BzvHZpZWGX-C9Ia7ekVBJEWTQ0Bn1P9CAKnC-JmUstiHyBEHTN9MSrqo1WwkknTmRbnSYZZ_Y7MdXuQDULzYT5AWifAjyHZwSFBnmA0-neKVM-umCMO3Wy4eCH6j2dLg9vKi4M9FKWVIQtssNDVguXcys4DFQiONny20Yf-DoQmc8VlqL4DJf6B1k8qpS-pEnZFiL0NtVGUv10ezKBzDWVt4_JEBvZ0QJRx55tmNVk5yRZxxNeXPEPXYhbsRbaXiVvLwtBieu6tSDQLx3YjA0_kTcG6fTNDgl1sNMafSoIeJ-TamPBzAfFr9wyEZqXrpiDbZfVpqNaF4JjkvcJSBNQVKIowfFUmE4j0qEMl1wL1I3mAhFv4-p1SdBxc__E_O5Pg3X4CjMA=w451-h450-no";
    ImageView chiccohigiene3;
    String urlchiccohigiene3 = "https://lh3.googleusercontent.com/ww279fIwFzvC_4vneh7x9bfeJTsiYBFyCXEbrQK9MKroFWOmjOgASGUaAaQmMaFU1qYC93dhqTDd6Zp8Sf-LcK-bK3xw6wAsN7Jmf8pXsNxpZ9u5Y6DMpXIg_QPOnPDzx2SOxAutX6yANp6KEiPjcad5lMJZqxvFBAi4ApRJaob36hTdQ9xmGu4zCR6A1H-b9EsmhwuSB4DnZCeAOoUKlyrCZWmP2YQD4mjT6e3SugiZSZQwbyp0vo95dgJ6KRlEnCX1UvY-i9Yt8lew98cYD938CdvO1hM5QJNLnwTAPS6RH6bBVZgtNn97Mun7GHRZGrsxhJwu-3bHMWhrL9Gsx_p0-2gjRa3UJEIfAbiqrSbXQnWbl_HIfqCuXvk6U_xaC30kT5yQdShj_r5CugXSjTNQUhiu6Ib6Vm0fxySH-8SfNQ2tPLY9E-ExFT56X5zprLBXVs4P_vWWUIF5ReLgyIJgsdNiTvdnqjhhmfYYNzO0dfpFXxgy32lCCQeExKKrn_sIFut29ZPgN416koQd32hlUjC7LQtw-D7uwvnW5xc5v0oOLlaPXH6mg6cvvk6Rh6EvDIr3DSn2Z_iwHSQajgDm_vX7odsDTyo9EiC7_JZ0jTE4ow=w398-h400-no";
    ImageView chiccohigiene4;
    String urlchiccohigiene4 = "https://lh3.googleusercontent.com/4EY9mUy_Wgtn2d4Tekj7b5wH65ptqMdMZ-s0qeVMt3RpPkNDJ6JabrpTBQ2vXtAbVPe3bETNHIGzT2VwMtaJI9q4TsNZ_Yv1zgbiQSu29OexarRJ4tam7wcs7pZFhVVdEqVOk8vTKXvefnCWmAE_CL7KG6m2Kvx0r5S1ARwCRYIs-CzKr4_JvIPSUnOSi6LaDXZKToOr3WiJBKkYlN4Ti1Smf89EPTXj6qIlIABG6kDR3H30q0Q5DdTFddUYNFdZMaFQEW5dFE6EYYmJs26-wOrtsr6Y9W5nOe___Qyro5qMuuQh0mLs-iwJ7DzYXj34W1wmgJRFoZTz_86o8JW-HQ6TiPZXxeaxTGTuL0ceBNpHRPCKNZaOHoMO8F04Ts075e2OkXJP1YKKl6CB4C2oiO06MgyL2BHMInpsdv3KQMtxxsY5mCdWySBVE0iS75wdujXS9aQhNT4JrrMFRh6UygmFQDHBXj_5xgg1YXhpTFI8pTWq5vhVfbrjgNrKCJE0HfTMPnRrXKdF6NqtieLH33kx7bU65idMT_u7RsdSyRrPy5k8rSbphxFQulDz5cBdnGNkSinPWbRgi-PCilyAKow8H48ISC1X_HPdv-EBPody4rpvKw=s400-no";
    ImageView chiccohigiene5;
    String urlchiccohigiene5 = "https://lh3.googleusercontent.com/hdzskEzSietknqNgaKYoBDNVufjY5zZaqTY80U-RTThlXvMZnd_hg6ozqsz5MkzOqSTle-dksKaR2OPHycfHVGIlGdhML7pduBF8COOwCr50ge2oQJdHK-FFIHgAEcMytzYnSlyLvZ_OqpJs2sWAcnobF80EvEck4wWMUy9suUWLVgPOOJvNDszNaJm_nty0qhP-8hYZrUB81ENGP-_hpCzwKop_oLKCz6oTAtOEGYOwtHqhFlwsFq8QEAbwaPNk6BeJSEzM_GxMfDWhkbgzgHfahjlianfhZIW8zYzsKgbEjW9F5xD0W23GiSaJf0-53fTVQvQnGSVR30uRMUh6VQUXE4t7zVJM8PU_Xvw23_QQ98182q7J-Pdh7fDG-_8An4K5RqPYnXkaLWbt26iNRsF3K-cOCC5yQnjdlY_JMMh7ULPdkaIa0tZqoaYNPyQTWo6zJPqdzeJNZrvI2eMt08pZOBsGg3k6JzWcj8KXkgXLFFhNgLZf3DWVlrqwu6evlZEdUHIqaUGjEQtsDVrV1ULipwLBejcMuYKtkcj38IbxBKdIyFSNTg7RF6T1ff28oyPhMPOP6nu1DodOF-kQXYy2k4SCavOQmuB4g3v5c8TvmFM7-Q=s400-no";
    ImageView chiccohigiene6;
    String urlchiccohigiene6 = "https://lh3.googleusercontent.com/C_bStLWc7EXwhNC9ztQNVo60vAm3Pe9jcOWNGXGt5MVvb40c3jFCB92klxkfCIVQB6kz2qzgV1JTQjGSufd_S8grQiFLD6bSjZ-b0JsyjQglbx0Xiz-Y_s3r7vnWrFnaeXg3QeoQPGOVGHGYTND2MELHsy9lET5DUQHn1i6E7T3Jn_X1rKzqn-phQ7-LneZHs9T8MRsHjpB9_dGe9nlIvZLmJd-VrhS7rm0tzuvP8UFXJzS2r0E6skaNChVIJOh6HpmX_E67SkSosmFN2xKVUatVp9ux8SJU2L1GibW7JacFsfTBTJJANxEdvcOfGu_eSIIT-BTszN_ABUcWDsNqc5PDHl-g5NgwOrwP5sp3ztOxrFs6Y5jQTAlYxLyOWSK-CJcb9teSjN3luomXbAD4CyNAU96_oMOei9yBbwapH8G_OtvVY0ezXWFu_cp1qY7oTVjBfihaf2wx2YNIIRmECUxP-IIBF9P5geOIEJ_rRc-L6PFELzYw6X6dJoyjbPFIaC_beZHhBlmTVq0Qj-RQPqx9vdG1M-muxWR5plM7VySPsdR1pd3HTUQu0V4C1oyxkkyf8KhoQj68tc8cO8E4g6z38td6RPTkeyyFW0T47Ko7f_lWzA=s400-no";
    ImageView chiccohigiene7;
    String urlchiccohigiene7 = "https://lh3.googleusercontent.com/r_ytu9i1UX3GcUl7fjI1OPrqWUjxN8ib98unlS97t755k54tjicrAcsELj2XDE_OAECno3vW359HDznuZ2PL-MyyHdaj3FjdGhWPZo9o_W1nhXyXEvTWvVDOzuSp6UuOMM5out6dEp0S1KGssLzFTL0k4Whe0zXD6FdMG6bf002gK1xWItxnzPykcByNqIulRgQ5KMi9qjc-W2PUj7aIZ1KxGFBiectY-ifDSnw6PLWzwndreJsOEyw6mBUq6Zqykw-I9ZMZz64_22EQHM2jnuAU6Wl8lT1BebbCfuzV-N4pb_q0nz0-_1OyMSE5g35JYHMkbXG8TuUNVpMCfH-MFaWyYcV56endn9BGPazzBybExlMh0pUC-IG2L-eGr2Qoebi65Z7bqqlPPnPO48owS98lUtokhRAuR5EObRtFvjqxUjcvKhCcKdccTFc5CaJ7BXZNsr4tiQmv6vne1IGIG5rYTkbzq6x7N0uJjb8N-dMWqXz0Y1G9hvtSux8yRddCpKiXpFk_fB-m2W7CmHrg2x6wWKq8MVSXkd0j8OddK1mHcUOXbaXbLlks6j9bD0nUhfelwFUVktv_BlOLC7dkMMfJYmygWDYGKILxIDFuE8qU_NvDRg=w398-h400-no";
    ImageView chiccohigiene8;
    String urlchiccohigiene8 = "https://lh3.googleusercontent.com/6Pnp70_uMO8-tqcbQignSh_Y_GLu8ODWXHXGziuxutvywdpHYvKoLY7vJPfFIUbePnSw2AeFjWQpxuzm8MIDJ7BgDWNAJmT7Hlui1b0KMCsAkiD3ZpiE1M2vePxoZN6bUkob4auduR7dhLFmuqrBt8CKdiQrRk7zblqbvVp09-M0kZAB3dIHhZilR1vHyWg3kOgl0aQ1nEkdExSvLQHNjGMFTzXavXRg7hKHPKp9Fg6Et7qeJs5vjtwTRC8nUcYdYhzJefvXjP_OVsl3VV9W2BWkBRRHp8F4a1jvEVCx1g5GsGJM1aztC7ao9pISXQhZ0JgwMgJF8MVKvz8B_GbtsgmR4gGBE2CYJr-exVZZnuuSnKw-bdBXdk16Gpwxld9qFCxqEemaEGEi37MoF4MR3ccTEOwKa9IHYtkbMygrRN91Gs9xMoWvLkDzkCa7SB9H1bhkUFMTLhEcuyPQ3eVxLsNP2HOMMtl1umM1uZmGTCc-Kxl_r_z5nBzYEKHhH8nwA8xQUCEXYOta27fWT5RQfLkBWSK68fAYzUEDoePCI8w0CZUZvE2EjRvmbC9l2rbzQoQ3YeBLWgyW0SWheQ-hOH4TFBG1NzJss6XeIGWzSu4EdnHkEA=s400-no";
    ImageView chiccohigiene9;
    String urlchiccohigiene9 = "https://lh3.googleusercontent.com/L8J6Ug-MoWXGPwB8uBmIGKBGj84wZhZBPC1SrqkwLCrl5zx39MrBnHnPmmZXK-CXPektrJQqileVQFNHM-GYFTFbkUG5HktAf7-S8XUQj7hqatcgLYyuNi47KLP0VCy01gKLIzTYxhSfzuHSax11aYokoqJleCcjZ7zATCYB8AMzo0znv2Wz_3giV2-umFZfY09DeAWkjzLzykVoqI61JtWA3jiothq-Zk6ckqbqJ0keYtkbg8thj6BItt0idoKJikiwNBAeRej6EVrrXXjYeiZqZq88CtdZ6MoqiPD-SvimXEOzReGRmtPQ1aK36vlqVjXo_CRaT583FNFqcTV9dzwn05Gy1TtFa8u_CPW1pp6zqRVCBKE1GtJYZIXXjlIrDzzu9g5eJYRmCUUDcbMJqd0aP3ciieNTvEEsFjNMCj8my7A6NssRhKayl_Fdpime2BqpGu5Jxop19jrDMt5xyPENicLGYyPA4QYhvv5JrpetQ7wjIMXjYzGMb3zwcjdOtYkSGOVeWHh0SJiQEir8aFKclS_59YMIrM2eHdhfpDREByLEBPjyqnazMfwreJqmmF6M-XCaAgf7tMgh1_ABZ5AEezhDnnsuVUqMFmC9WUQdt6VbGm5TruC04zdKzjUcU8rh_FhwB1iZCoUQcLdyfTKdlo8V4KT_B_zqabT5jHA=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene);

        new preciochiccohigieneAsync().execute();

        preciochiccohigiene1 = (TextView)findViewById(R.id.preciochiccohigiene1);
        preciochiccohigiene2 = (TextView)findViewById(R.id.preciochiccohigiene2);
        preciochiccohigiene3 = (TextView)findViewById(R.id.preciochiccohigiene3);
        preciochiccohigiene4 = (TextView)findViewById(R.id.preciochiccohigiene4);
        preciochiccohigiene5 = (TextView)findViewById(R.id.preciochiccohigiene5);
        preciochiccohigiene6 = (TextView)findViewById(R.id.preciochiccohigiene6);
        preciochiccohigiene7 = (TextView)findViewById(R.id.preciochiccohigiene7);
        preciochiccohigiene8 = (TextView)findViewById(R.id.preciochiccohigiene8);
        preciochiccohigiene9 = (TextView)findViewById(R.id.preciochiccohigiene9);

        chiccohigiene1 = (ImageView)findViewById(R.id.chiccohigiene1);
        Picasso.with(this).load(urlchiccohigiene1).into(chiccohigiene1);

        chiccohigiene2 = (ImageView)findViewById(R.id.chiccohigiene2);
        Picasso.with(this).load(urlchiccohigiene2).into(chiccohigiene2);

        chiccohigiene3 = (ImageView)findViewById(R.id.chiccohigiene3);
        Picasso.with(this).load(urlchiccohigiene3).into(chiccohigiene3);

        chiccohigiene4 = (ImageView)findViewById(R.id.chiccohigiene4);
        Picasso.with(this).load(urlchiccohigiene4).into(chiccohigiene4);

        chiccohigiene5 = (ImageView)findViewById(R.id.chiccohigiene5);
        Picasso.with(this).load(urlchiccohigiene5).into(chiccohigiene5);

        chiccohigiene6 = (ImageView)findViewById(R.id.chiccohigiene6);
        Picasso.with(this).load(urlchiccohigiene6).into(chiccohigiene6);

        chiccohigiene7 = (ImageView)findViewById(R.id.chiccohigiene7);
        Picasso.with(this).load(urlchiccohigiene7).into(chiccohigiene7);

        chiccohigiene8 = (ImageView)findViewById(R.id.chiccohigiene8);
        Picasso.with(this).load(urlchiccohigiene8).into(chiccohigiene8);

        chiccohigiene9 = (ImageView)findViewById(R.id.chiccohigiene9);
        Picasso.with(this).load(urlchiccohigiene9).into(chiccohigiene9);

        btnchiccohigiene1 = (Button)findViewById(R.id.btnchiccohigiene1);
        btnchiccohigiene1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene1 = new Intent(chiccohigiene.this, chiccohigiene1.class);
                startActivity(btnchiccohigiene1);
            }
        });

        btnchiccohigiene2 = (Button)findViewById(R.id.btnchiccohigiene2);
        btnchiccohigiene2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene2 = new Intent(chiccohigiene.this, chiccohigiene2.class);
                startActivity(btnchiccohigiene2);
            }
        });

        btnchiccohigiene3 = (Button)findViewById(R.id.btnchiccohigiene3);
        btnchiccohigiene3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene3 = new Intent(chiccohigiene.this, chiccohigiene3.class);
                startActivity(btnchiccohigiene3);
            }
        });

        btnchiccohigiene4 = (Button)findViewById(R.id.btnchiccohigiene4);
        btnchiccohigiene4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene4 = new Intent(chiccohigiene.this, chiccohigiene4.class);
                startActivity(btnchiccohigiene4);
            }
        });

        btnchiccohigiene5 = (Button)findViewById(R.id.btnchiccohigiene5);
        btnchiccohigiene5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene5 = new Intent(chiccohigiene.this, chiccohigiene5.class);
                startActivity(btnchiccohigiene5);
            }
        });

        btnchiccohigiene6 = (Button)findViewById(R.id.btnchiccohigiene6);
        btnchiccohigiene6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene6 = new Intent(chiccohigiene.this, chiccohigiene6.class);
                startActivity(btnchiccohigiene6);
            }
        });

        btnchiccohigiene7 = (Button)findViewById(R.id.btnchiccohigiene7);
        btnchiccohigiene7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene7 = new Intent(chiccohigiene.this, chiccohigiene7.class);
                startActivity(btnchiccohigiene7);
            }
        });

        btnchiccohigiene8 = (Button)findViewById(R.id.btnchiccohigiene8);
        btnchiccohigiene8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene8 = new Intent(chiccohigiene.this, chiccohigiene8.class);
                startActivity(btnchiccohigiene8);
            }
        });

        btnchiccohigiene9 = (Button)findViewById(R.id.btnchiccohigiene9);
        btnchiccohigiene9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene9 = new Intent(chiccohigiene.this, chiccohigiene9.class);
                startActivity(btnchiccohigiene9);
            }
        });

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene.this, MainActivity.class);
                startActivity(home);
            }
        });

    }

    public class preciochiccohigieneAsync extends AsyncTask<Void, Void, Void> {

        String urlprecio1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b54ded66a635d87b4eb63d40a195b544";
        String preciochiccohigiene1st;
        String urlprecio2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=184d681d0f64a195f3978547abbe52b1";
        String preciochiccohigiene2st;
        String urlprecio3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dcb12f38229572425a063c4f924d0305";
        String preciochiccohigiene3st;
        String urlprecio4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f7e5018b467f5c3f192c5a97162ec6f7";
        String preciochiccohigiene4st;
        String urlprecio5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=65369040306504561b17d740ecc9f828";
        String preciochiccohigiene5st;
        String urlprecio6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=97301b9aaa2ac095eec9c691e5016fc0";
        String preciochiccohigiene6st;
        String urlprecio7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9590c74d2e4b915b1613bfd36facc1d8";
        String preciochiccohigiene7st;
        String urlprecio8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b1ec3ee72a45f428369e699405ea2283";
        String preciochiccohigiene8st;
        String urlprecio9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4202397a2086515e55faaa5ce999ad67#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccohigiene9st;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc1 = Jsoup.connect(urlprecio1).get();
                Elements metapropoerty1 = doc1.select("meta[property=\"og:description\"]");
                preciochiccohigiene1st = metapropoerty1.attr("content");

                Document doc2 = Jsoup.connect(urlprecio2).get();
                Elements metapropoerty2 = doc2.select("meta[property=\"og:description\"]");
                preciochiccohigiene2st = metapropoerty2.attr("content");

                Document doc3 = Jsoup.connect(urlprecio3).get();
                Elements metapropoerty3 = doc3.select("meta[property=\"og:description\"]");
                preciochiccohigiene3st = metapropoerty3.attr("content");

                Document doc4 = Jsoup.connect(urlprecio4).get();
                Elements metapropoerty4 = doc4.select("meta[property=\"og:description\"]");
                preciochiccohigiene4st = metapropoerty4.attr("content");

                Document doc5 = Jsoup.connect(urlprecio5).get();
                Elements metapropoerty5 = doc5.select("meta[property=\"og:description\"]");
                preciochiccohigiene5st = metapropoerty5.attr("content");

                Document doc6 = Jsoup.connect(urlprecio6).get();
                Elements metapropoerty6 = doc6.select("meta[property=\"og:description\"]");
                preciochiccohigiene6st = metapropoerty6.attr("content");

                Document doc7 = Jsoup.connect(urlprecio7).get();
                Elements metapropoerty7 = doc7.select("meta[property=\"og:description\"]");
                preciochiccohigiene7st = metapropoerty7.attr("content");

                Document doc8 = Jsoup.connect(urlprecio8).get();
                Elements metapropoerty8 = doc8.select("meta[property=\"og:description\"]");
                preciochiccohigiene8st = metapropoerty8.attr("content");

                Document doc9 = Jsoup.connect(urlprecio9).get();
                Elements metapropoerty9 = doc9.select("meta[property=\"og:description\"]");
                preciochiccohigiene9st = metapropoerty9.attr("content");

            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            preciochiccohigiene1.setText(preciochiccohigiene1st);
            preciochiccohigiene2.setText(preciochiccohigiene2st);
            preciochiccohigiene3.setText(preciochiccohigiene3st);
            preciochiccohigiene4.setText(preciochiccohigiene4st);
            preciochiccohigiene5.setText(preciochiccohigiene5st);
            preciochiccohigiene6.setText(preciochiccohigiene6st);
            preciochiccohigiene7.setText(preciochiccohigiene7st);
            preciochiccohigiene8.setText(preciochiccohigiene8st);
            preciochiccohigiene9.setText(preciochiccohigiene9st);
        }

    }
}
