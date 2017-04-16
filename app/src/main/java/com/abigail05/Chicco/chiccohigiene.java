package com.abigail05.Chicco;

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

public class chiccohigiene extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene1;
    Button btnconsultaa1;
    TextView txtchiccohigiene1a1;
    String urlcomboa1 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b54ded66a635d87b4eb63d40a195b544";
    ImageView chiccohigiene1a1;
    Button btncomprachiccohigiene2;
    Button btnconsultaa2;
    TextView txtchiccohigiene2a2;
    String urlcomboa2 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=184d681d0f64a195f3978547abbe52b1";
    ImageView chiccohigiene2a2;
    Button btncomprachiccohigiene3;
    Button btnconsultaa3;
    TextView txtchiccohigiene3a3;
    String urlcomboa3 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dcb12f38229572425a063c4f924d0305";
    ImageView chiccohigiene3a3;
    Button btncomprachiccohigiene4;
    Button btnconsultaa4;
    TextView txtchiccohigiene4a4;
    String urlcomboa4 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f7e5018b467f5c3f192c5a97162ec6f7";
    ImageView chiccohigiene4a4;
    Button btncomprachiccohigiene5;
    Button btnconsultaa5;
    TextView txtchiccohigiene5a5;
    String urlcomboa5 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=65369040306504561b17d740ecc9f828";
    ImageView chiccohigiene5a5;
    Button btncomprachiccohigiene6;
    Button btnconsultaa6;
    TextView txtchiccohigiene6a6;
    String urlcomboa6 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=97301b9aaa2ac095eec9c691e5016fc0";
    ImageView chiccohigiene6a6;
    Button btncomprachiccohigiene7;
    Button btnconsultaa7;
    TextView txtchiccohigiene7a7;
    String urlcomboa7 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=9590c74d2e4b915b1613bfd36facc1d8";
    ImageView chiccohigiene7a7;
    Button btncomprachiccohigiene8;
    Button btnconsultaa8;
    TextView txtchiccohigiene8a8;
    String urlcomboa8 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b1ec3ee72a45f428369e699405ea2283";
    ImageView chiccohigiene8a8;
    Button btncomprachiccohigiene9;
    Button btnconsultaa9;
    TextView txtchiccohigiene9a9;
    String urlcomboa9 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=4202397a2086515e55faaa5ce999ad67#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccohigiene9a9;
    Button btncomprachiccohigiene10;
    Button btnconsultaa10;
    TextView txtchiccohigiene10a10;
    String urlcomboa10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=95eaf2695872226cfa88a609f7ce481c#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccohigiene10a10;
    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    LinearLayout lineara1;
    LinearLayout lineara2;
    LinearLayout lineara3;
    LinearLayout lineara4;
    LinearLayout lineara5;
    LinearLayout lineara6;
    LinearLayout lineara7;
    LinearLayout lineara8;
    LinearLayout lineara9;
    LinearLayout lineara10;
    TextView preciochiccohigiene1;
    TextView preciochiccohigiene2;
    TextView preciochiccohigiene3;
    TextView preciochiccohigiene4;
    TextView preciochiccohigiene5;
    TextView preciochiccohigiene6;
    TextView preciochiccohigiene7;
    TextView preciochiccohigiene8;
    TextView preciochiccohigiene9;
    TextView preciochiccohigiene10;
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
    ImageView chiccohigiene10;
    String urlchiccohigiene10 = "https://lh3.googleusercontent.com/O4naYXzC28s_0PaA7c2fDq3Seyp_Xgb0uIUJ1o6qtmMfH66eVJvpboicm1_ffnqN_LajjuqSyzJHFYqELvid4ruiXReGN0CIwoiE8Bj3XjAv01L0W4071z4yM45uExx5ZTY1BwAebFs7C45CRgxNtybeVcTNFq3F-F4rdiPuvdFNUjdAlDGRGcQRHKesIMI3DtcUKlDHDgdXLSw1vlxaltnk_BdOMfV_Yp5nq5oZq-2RoFtyXgskvLDZCy7v4_1xUltNMTjKn1fgq5-TzyTiiqc0k5PCHBX3w-noaHaN5-T8qWNfRZPidtPIgQLUjdas5HhhVQp0EoXpFGCpZNQBBV2gU9s6YHL8aNzBeNhjY4aoykHO8dUMpiS_nZHLgUbFX4QQfX7qCBhri5sykNzF1nFqsuk1H3DDtbPmKUwZaNxK5_jPey7vHEl5thI3vUUNHf0WJUp6n8Mn-e3chUTJRIZMRoHzqjnDxaUzrtr2qfi0KAhYQt6QdPI5R4NWW8uCrNNAc7ZtVEzqVij-mq8A9t5TxpuFzuvkPW1uR6rtJh0HLPuWPtqbnku4zXxexoCRywZw7amp5tQdafTkjw9_Sqe9DMrHbnSGDQZG6Wbtl0akxz00k3r5px4KEV5pcAY_Hfo9oZ9C4iDt4qHqt_UpduiqjyJALsmKvPCggBMQI48=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene);

        new preciochiccohigieneAsync().execute();

        /* chicco higiene 1 */

        chiccohigiene1a1 = (ImageView)findViewById(R.id.chiccohigiene1a1);
        Picasso.with(this).load(urlchiccohigiene1).into(chiccohigiene1a1);

        txtchiccohigiene1a1 = (TextView)findViewById(R.id.txtchiccohigiene1a1);
        final String stconsultaa1 = txtchiccohigiene1a1.getText().toString();
        btnconsultaa1 = (Button)findViewById(R.id.btnconsultaa1);
        btnconsultaa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa1 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa1.putExtra("consulta", stconsultaa1);
                startActivity(btnconsultaa1);
            }
        });


        btncomprachiccohigiene1 = (Button)findViewById(R.id.btncomprachiccohigiene1);
        btncomprachiccohigiene1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene1 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene1.putExtra("string", urlcomboa1);
                startActivity(btncomprachiccohigiene1);
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

        /* chicco higiene 2 */

        chiccohigiene2a2 = (ImageView)findViewById(R.id.chiccohigiene2a2);
        Picasso.with(this).load(urlchiccohigiene2).into(chiccohigiene2a2);

        txtchiccohigiene2a2 = (TextView)findViewById(R.id.txtchiccohigiene2a2);
        final String stconsultaa2 = txtchiccohigiene2a2.getText().toString();
        btnconsultaa2 = (Button)findViewById(R.id.btnconsultaa2);
        btnconsultaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa2 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa2.putExtra("consulta", stconsultaa2);
                startActivity(btnconsultaa2);
            }
        });


        btncomprachiccohigiene2 = (Button)findViewById(R.id.btncomprachiccohigiene2);
        btncomprachiccohigiene2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene2 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene2.putExtra("string", urlcomboa2);
                startActivity(btncomprachiccohigiene2);
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

        /* chicco higiene 3 */

        chiccohigiene3a3 = (ImageView)findViewById(R.id.chiccohigiene3a3);
        Picasso.with(this).load(urlchiccohigiene3).into(chiccohigiene3a3);

        txtchiccohigiene3a3 = (TextView)findViewById(R.id.txtchiccohigiene3a3);
        final String stconsultaa3 = txtchiccohigiene3a3.getText().toString();
        btnconsultaa3 = (Button)findViewById(R.id.btnconsultaa3);
        btnconsultaa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa3 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa3.putExtra("consulta", stconsultaa3);
                startActivity(btnconsultaa3);
            }
        });


        btncomprachiccohigiene3 = (Button)findViewById(R.id.btncomprachiccohigiene3);
        btncomprachiccohigiene3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene3 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene3.putExtra("string", urlcomboa3);
                startActivity(btncomprachiccohigiene3);
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

        /* chicco higiene 4 */

        chiccohigiene4a4 = (ImageView)findViewById(R.id.chiccohigiene4a4);
        Picasso.with(this).load(urlchiccohigiene4).into(chiccohigiene4a4);

        txtchiccohigiene4a4 = (TextView)findViewById(R.id.txtchiccohigiene4a4);
        final String stconsultaa4 = txtchiccohigiene4a4.getText().toString();
        btnconsultaa4 = (Button)findViewById(R.id.btnconsultaa4);
        btnconsultaa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa4 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa4.putExtra("consulta", stconsultaa4);
                startActivity(btnconsultaa4);
            }
        });


        btncomprachiccohigiene4 = (Button)findViewById(R.id.btncomprachiccohigiene4);
        btncomprachiccohigiene4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene4 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene4.putExtra("string", urlcomboa4);
                startActivity(btncomprachiccohigiene4);
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

        /* chicco higiene 5 */

        chiccohigiene5a5 = (ImageView)findViewById(R.id.chiccohigiene5a5);
        Picasso.with(this).load(urlchiccohigiene5).into(chiccohigiene5a5);

        txtchiccohigiene5a5 = (TextView)findViewById(R.id.txtchiccohigiene5a5);
        final String stconsultaa5 = txtchiccohigiene5a5.getText().toString();
        btnconsultaa5 = (Button)findViewById(R.id.btnconsultaa5);
        btnconsultaa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa5 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa5.putExtra("consulta", stconsultaa5);
                startActivity(btnconsultaa5);
            }
        });


        btncomprachiccohigiene5 = (Button)findViewById(R.id.btncomprachiccohigiene5);
        btncomprachiccohigiene5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene5 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene5.putExtra("string", urlcomboa5);
                startActivity(btncomprachiccohigiene5);
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

        /* chicco higiene 6 */

        chiccohigiene6a6 = (ImageView)findViewById(R.id.chiccohigiene6a6);
        Picasso.with(this).load(urlchiccohigiene6).into(chiccohigiene6a6);

        txtchiccohigiene6a6 = (TextView)findViewById(R.id.txtchiccohigiene6a6);
        final String stconsultaa6 = txtchiccohigiene6a6.getText().toString();
        btnconsultaa6 = (Button)findViewById(R.id.btnconsultaa6);
        btnconsultaa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa6 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa6.putExtra("consulta", stconsultaa6);
                startActivity(btnconsultaa6);
            }
        });


        btncomprachiccohigiene6 = (Button)findViewById(R.id.btncomprachiccohigiene6);
        btncomprachiccohigiene6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene6 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene6.putExtra("string", urlcomboa6);
                startActivity(btncomprachiccohigiene6);
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

        /* chicco higiene 7 */

        chiccohigiene7a7 = (ImageView)findViewById(R.id.chiccohigiene7a7);
        Picasso.with(this).load(urlchiccohigiene7).into(chiccohigiene7a7);

        txtchiccohigiene7a7 = (TextView)findViewById(R.id.txtchiccohigiene7a7);
        final String stconsultaa7 = txtchiccohigiene7a7.getText().toString();
        btnconsultaa7 = (Button)findViewById(R.id.btnconsultaa7);
        btnconsultaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa7 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa7.putExtra("consulta", stconsultaa7);
                startActivity(btnconsultaa7);
            }
        });


        btncomprachiccohigiene7 = (Button)findViewById(R.id.btncomprachiccohigiene7);
        btncomprachiccohigiene7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene7 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene7.putExtra("string", urlcomboa7);
                startActivity(btncomprachiccohigiene7);
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

        /* chicco higiene 8 */

        chiccohigiene8a8 = (ImageView)findViewById(R.id.chiccohigiene8a8);
        Picasso.with(this).load(urlchiccohigiene8).into(chiccohigiene8a8);

        txtchiccohigiene8a8 = (TextView)findViewById(R.id.txtchiccohigiene8a8);
        final String stconsultaa8 = txtchiccohigiene8a8.getText().toString();
        btnconsultaa8 = (Button)findViewById(R.id.btnconsultaa8);
        btnconsultaa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa8 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa8.putExtra("consulta", stconsultaa8);
                startActivity(btnconsultaa8);
            }
        });


        btncomprachiccohigiene8 = (Button)findViewById(R.id.btncomprachiccohigiene8);
        btncomprachiccohigiene8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene8 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene8.putExtra("string", urlcomboa8);
                startActivity(btncomprachiccohigiene8);
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

        /* chicco higiene 9 */

        chiccohigiene9a9 = (ImageView)findViewById(R.id.chiccohigiene9a9);
        Picasso.with(this).load(urlchiccohigiene9).into(chiccohigiene9a9);

        txtchiccohigiene9a9 = (TextView)findViewById(R.id.txtchiccohigiene9a9);
        final String stconsultaa9 = txtchiccohigiene9a9.getText().toString();
        btnconsultaa9 = (Button)findViewById(R.id.btnconsultaa9);
        btnconsultaa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa9 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa9.putExtra("consulta", stconsultaa9);
                startActivity(btnconsultaa9);
            }
        });


        btncomprachiccohigiene9 = (Button)findViewById(R.id.btncomprachiccohigiene9);
        btncomprachiccohigiene9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene9 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene9.putExtra("string", urlcomboa9);
                startActivity(btncomprachiccohigiene9);
            }
        });

        lineara9 = (LinearLayout)findViewById(R.id.lineara9);

        switch9 = (Switch)findViewById(R.id.switch9);
        switch9.setChecked(false);
        switch9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch9.isChecked()) {
                    lineara9.setVisibility(View.VISIBLE);
                } else {
                    lineara9.setVisibility(View.GONE);
                }

            }
        });

        /* chicco higiene 10 */

        chiccohigiene10a10 = (ImageView)findViewById(R.id.chiccohigiene10a10);
        Picasso.with(this).load(urlchiccohigiene10).into(chiccohigiene10a10);

        txtchiccohigiene10a10 = (TextView)findViewById(R.id.txtchiccohigiene10a10);
        final String stconsultaa10 = txtchiccohigiene10a10.getText().toString();
        btnconsultaa10 = (Button)findViewById(R.id.btnconsultaa10);
        btnconsultaa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsultaa10 = new Intent(chiccohigiene.this,contacto.class);
                btnconsultaa10.putExtra("consulta", stconsultaa10);
                startActivity(btnconsultaa10);
            }
        });


        btncomprachiccohigiene10 = (Button)findViewById(R.id.btncomprachiccohigiene10);
        btncomprachiccohigiene10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene10 = new Intent(chiccohigiene.this,webview.class);
                btncomprachiccohigiene10.putExtra("string", urlcomboa10);
                startActivity(btncomprachiccohigiene10);
            }
        });

        lineara10 = (LinearLayout)findViewById(R.id.lineara10);

        switch10 = (Switch)findViewById(R.id.switch10);
        switch10.setChecked(false);
        switch10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switch10.isChecked()) {
                    lineara10.setVisibility(View.VISIBLE);
                } else {
                    lineara10.setVisibility(View.GONE);
                }

            }
        });

        preciochiccohigiene1 = (TextView)findViewById(R.id.preciochiccohigiene1);
        preciochiccohigiene2 = (TextView)findViewById(R.id.preciochiccohigiene2);
        preciochiccohigiene3 = (TextView)findViewById(R.id.preciochiccohigiene3);
        preciochiccohigiene4 = (TextView)findViewById(R.id.preciochiccohigiene4);
        preciochiccohigiene5 = (TextView)findViewById(R.id.preciochiccohigiene5);
        preciochiccohigiene6 = (TextView)findViewById(R.id.preciochiccohigiene6);
        preciochiccohigiene7 = (TextView)findViewById(R.id.preciochiccohigiene7);
        preciochiccohigiene8 = (TextView)findViewById(R.id.preciochiccohigiene8);
        preciochiccohigiene9 = (TextView)findViewById(R.id.preciochiccohigiene9);
        preciochiccohigiene10 = (TextView)findViewById(R.id.preciochiccohigiene10);

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

        chiccohigiene10 = (ImageView)findViewById(R.id.chiccohigiene10);
        Picasso.with(this).load(urlchiccohigiene10).into(chiccohigiene10);

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
        String urlprecio10 = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=95eaf2695872226cfa88a609f7ce481c#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
        String preciochiccohigiene10st;

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

                Document doc10 = Jsoup.connect(urlprecio10).get();
                Elements metapropoerty10 = doc10.select("meta[property=\"og:description\"]");
                preciochiccohigiene10st = metapropoerty10.attr("content");

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
            preciochiccohigiene10.setText(preciochiccohigiene10st);
        }

    }
}
