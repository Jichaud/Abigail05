package com.abigail05.Babelito;

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

public class babelitoprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnbabemamaderas;
    ImageView babemamaderas;
    String urlbabemamaderas = "https://lh3.googleusercontent.com/NEHIsZfkuthOLccApRfs_Kg3EWXK2J3rOeseQ9-4WFDaPuOaA7XxjQPgvVKxpWMBiNeQONpi6jBq3GtzGNltifBmPQquUlppvyvBki-33_p3sK9l9w9Vkq5frpOS6i6iS5L2PyTsGgOqwhc7JPMK_oA-d0wMYpXzLKb20lOKfdabb10hcKTKPp8AhWR3doiPgBDPbqlD6eobY3nIb74c0MYX7Ft7uLYNtJtfS0DY9tFa2dgaBEPsSjiozUlsOQ18MoD0A57r_YlFaA17TiVvlmJqh8S7s6cp4GHoHWxeGMLB-JA6VG782oLGDmX4mxqbK75F4jOk4inZRf3DbLLFg0u3lCjjlRq4KUJlBbBgQsaUFE9kiliFPt2UcwAPIaarhHHysx3hXd7Bd1qdAa-iaKC5gffGfvDoZ7rOqJL0mVQxhe99id2w9bDMBnJ8Obe4dm2W4kyoeSdYiXI4WD5aBqbwmYk_HPUC70dbZbfeyq9g7vT19qYKbYd2hriOEomxDEshbpMVE49fEssNN-IVFveqKeh9vKOef4nt4xGzNYnaDbeKo79GrAbBdQd32lLCnVmm3LrVse60PMink80iAi6NOgK5cKu08eoFXctpR5b23WknUA=s368-no";
    Button btnbabeaccesorios;
    ImageView babeaccesorios;
    String urlbabeaccesorios = "https://lh3.googleusercontent.com/uZ65Oqfhq_f5fAjabsZW195OelLjUYRNoBQ8FZt8T7bOVom7PxK_lGKPS8PkcoU4QDeucnWjoGd5E46-atE9bpDoBH7mcZLF1UO8iNoyveXD1zs4fisGAu7lpJa66ZNEKscF4jmSmxsd8oHNLGqrYCdXDlr9stJVjwlJwnveHOZ8bc0NRC8DKncCoUxJ073RMnRQn8djwYbETJ2qSGcKO3orphbWnc7ytmNBTQNdrvPHkoKymfXG7qygiKKftHFEdCuZghc6o0ubn1ed7r9GL4Es6kWnjvc8A9KRYQB-AXkI9R30sBxXjAuwx_gxR3-XB0oCH9nv0RJ6qsvb5YeIL6P3lfxQNua_RM6PCgZYien_QlfPONF8ocSqZTDrdLIbNpJfv2BSzGDIo9HR3Z_ISQFa8BSkIKg0qrOZXGlejO2pAag9HlngC8N52W9qJE8wEVvj_IV3Wxn8yApoKVgjdgHjT0iftmjDQ7MxXKI1SsEKMv7rndNnSsX-CcTMOLbF0iXNiZJaMoAkZFDnRk0NYleXEzPiVd7dr1ReDX6LPNnE6Knslr7430xhq_4eu15GegPrHSFCfQp7lb8Xo7T75SboUxo4TywnWSXtVICUwXceLcySkg=w360-h356-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babelitoprodlist);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babelitoprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babelitoprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        babemamaderas = (ImageView)findViewById(R.id.babemamaderas);
        Picasso.with(this).load(urlbabemamaderas).into(babemamaderas);

        btnbabemamaderas = (Button)findViewById(R.id.btnbabemamaderas);
        btnbabemamaderas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabemamaderas = new Intent(babelitoprodlist.this, babemamaderas.class);
                startActivity(btnbabemamaderas);
            }
        });

        babeaccesorios = (ImageView)findViewById(R.id.babeaccesorios);
        Picasso.with(this).load(urlbabeaccesorios).into(babeaccesorios);

        btnbabeaccesorios = (Button)findViewById(R.id.btnbabeaccesorios);
        btnbabeaccesorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbabeaccesorios = new Intent(babelitoprodlist.this, babeaccesorios.class);
                startActivity(btnbabeaccesorios);
            }
        });

    }
}
