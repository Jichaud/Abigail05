package com.abigail05.mibes;

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

public class mibesprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnmibesaccesorios;
    ImageView mibesaccesorios;
    String urlmibesaccesorios = "https://lh3.googleusercontent.com/ikp4rjk4vJWC9vv5cJ07u6vnGjgy2fr9_FKSzE-C7Egc2rMX4u3k0HiHTJMsOnwpbmU0FCD0RSr4QMUFFLWS6fOkw3Y5dgdmrYwK3CqW5HKabin82ZzSTPvCr5cz8apNCl4qr4Gr2DsSuscOYnTpMRqepLjjdKQuxn4amA4j0aeF3Nw1EwuCFQx1L1hHPuxtlWnWkdXQBbj6U_vIkotjmMChRFFtFu-TVGpYNar4QDvDsFFoLkrlju28W4VTxNV5_SmjvOYQutocYW_fHAaC-ntsQR259JUFcYDl5vq0b3D593Eyp-JPj_tGA1WxbNU5hDswcxiOKQWhX2UVUHz-Z1DFrsJ0_vELJ8MZwrBkMAwfCEaHxEYgt1euMC_v9nEgpmpdMeHkUCYqkL_DKDLPJ4r0opERGsPJEzXDizKlpFKRGY9MyeOsGPLUkv-iNjhHYuY11RdmdcXLm1aXwc0_STwiHKSc8KqSdXeUdJSWfMgAGZrpU7h_GhoYdRo-JFIvm-lMrNVFbA_44l1bVPEE8zPQO-u2-au9BOHTVIifI4ytU1sP3uaLgtoludUGCZyVXbNaTuQqQ3u0Diwx1RQi0PkrtGBj7-JjwlQrI_eoaP_FBAU3N9tuxiUPoPBS2IaxTzRGRtEnCzhvJ8NHQgdf3t0-_deSNdXMEkxr0FghmUs=s725-no";
    Button btnmibesbaberos;
    ImageView mibesbaberos;
    String urlmibesbaberos = "https://lh3.googleusercontent.com/kfPmY0FEq9VJ7zHuq730SrBCxbNGaV03Ie-0bcVSfEOY5mYSQumfBZ22cJXAkgt47AcY3S4OyCmuWTKNRn5EObRRs4VxWspEZdLoJTKC3eyLxaMI04MeAOFrumbqqocDIIMdhmzE2BjSs2E1Wg5q4UEGBhsUcqfvSdYRk7e0TGuq5TAf3wEaLk7ZA10wc3V8iNtZbUjEmMPDTn9coD-GM0UAtTY6G_OE9IZdfJVJ-ir1_TfE4eTKoPx9BHwlId21krAjCLErJh1cXVB1BcG1ZoLzCq2B3kDQDzbogaM0_uS31Cj9EwIOLxtu3xm0qZ9-jzi0TEDr_sCmJZueaTVPpPGA1-S8TKsdYejlqAS0bfgE_HqSQsZj7UNXjEQRUsQcvjkKJYRKX1VUOFgCv2V_oyVmBFbjeVgtZz7AmysCMkuAme23xq0kfTGdxIvllHz33iylN4lrYVVy0ZBnHQ5pRSfsr95G7bv8RIncVeIkyMJRvu1RDRDInHn1FLT0KJmle_YDQM2w1HyogFJUWJjspy48J0C7sKkoWLzAl98KOa8OQru_UU3RZdCTZ1u7KJj5aEBk-0oOh54rpTiUBBpBIkvQ-s7rcHCFLadHtjOPay3kqHZo0_eSiHFJnpslOvMERLc4CJEf0k-EI06NURGifFJ1ukVOzSboqI5yPQMGZmA=s725-no";
    Button btnmibes1;
    ImageView mibes1;
    String urlmibes1 = "https://lh3.googleusercontent.com/-DSKLh-hHAGnzlAkWyO5lEf2DRTUw-YhhGU9IymbIourye2rYqTQfpfnhJeoqSehWFFBthXgOgk=w432-h360-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibesprodlist);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibesprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibesprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        mibesaccesorios = (ImageView)findViewById(R.id.mibesaccesorios);
        Picasso.with(this).load(urlmibesaccesorios).into(mibesaccesorios);

        btnmibesaccesorios = (Button)findViewById(R.id.btnmibesaccesorios);
        btnmibesaccesorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesaccesorios = new Intent(mibesprodlist.this, mibesaccesorios.class);
                startActivity(btnmibesaccesorios);
            }
        });

        mibesbaberos = (ImageView)findViewById(R.id.mibesbaberos);
        Picasso.with(this).load(urlmibesbaberos).into(mibesbaberos);

        btnmibesbaberos = (Button)findViewById(R.id.btnmibesbaberos);
        btnmibesbaberos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibesbaberos = new Intent(mibesprodlist.this, mibesbaberos.class);
                startActivity(btnmibesbaberos);
            }
        });

        mibes1 = (ImageView)findViewById(R.id.mibes1);
        Picasso.with(this).load(urlmibes1).into(mibes1);

        btnmibes1 = (Button)findViewById(R.id.btnmibes1);
        btnmibes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmibes1 = new Intent(mibesprodlist.this, mibesbolsos.class);
                startActivity(btnmibes1);
            }
        });

    }
}
