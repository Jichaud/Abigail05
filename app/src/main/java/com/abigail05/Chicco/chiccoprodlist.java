package com.abigail05.Chicco;

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

public class chiccoprodlist extends AppCompatActivity {

    Button home;
    Button marca;
    Button btnchiccomamaderas;
    ImageView chiccomamaderas;
    String urlchiccomamaderas = "https://lh3.googleusercontent.com/6v3Wo6gv__psB2pWhyVcBn-y0DO3RYhmgCRCsUyzb7zAwXBXaipEo9bB3zB6jPt-FlFddppHCy4ZWbNrN0NgRJqM7QuIgfxaJbYQQoiQGgL_CBCceE_fytLRb1m4Qf6J_ZHn43swazGB9maeBfZPFpf00-fIYGDpDO-VPglsnRTR9mB-gpM2ySj4VwvkwF2WyISE18m5nsp7GmTqbYRjUfQJkuiuR9p_JXFoXtWL_nVQzSAKhc213dmlh3OBsymqXRMAAutdRMOkOTx3MdnhLBPDiXZHJC0k122z3G0y8dKVebDum9aJAiYo8sQU2u71ea3BzHnjVBghnkYqGhzh7lP2byHLT8gC3oroveGSfgSHbEqhiEzrCQ4QsKIr7_z36a7fYeqdi8do2fhSmHBQ1jj5dHOAGuOEbhntrZ8Yg7wGdi6Bs9y0Sh2u7p5CYPQXBRnwwQyR35TusUezLZToygu-ehHWz5Zfl9d8BVHjoiz0g6B9eD_-WVX6y2cHSCspn24sS_6w67zYS-MGKMuAqVZ5pKmyQk7XAfDjIPutyBL2yRabtCBk4YKNBypLfKP58nTGPhQ0eAUmVLGvmtt3iV1CPCFGD1N9gHQpGHjpOOokPdhnDg=w400-h399-no";
    Button btnchiccohigiene;
    ImageView chiccohigiene;
    String urlchiccohigiene = "https://lh3.googleusercontent.com/UXbzABgDZOupwdj3TwkLuEI_3zYK7pbRwGd2grAw4fEXVp5WIrqoFwI15-3GOHl4EUQOu7f0pIHSx8LC1H3I0KkaDUIsblw9a29GB14u8sK3URhzXB4W-jjbSxyIh-HEfRmY0ZiBFQXXukAZ0QG8uPWLL0Gmeqz6uYSz6iWHSs2ZaOfi7pMUSUHlPc4MZ9Q7inY-KXMszzXo3aJP9hWSFeslXNYpJ6wBQkmYbvijkMCUqJ5iMj8KuYBaj2mdnAahjZRAwVewZ89CVkz1wbEhbP7j8Oeg2s9hZ-ML6YEFLce5oCzdSTsLTmPTleEJR1vBSemYARUGEGJQZFuFrxktA0IEYYRngIDG1SI3S9RWRi8RNEy0kEJLW6df1HUMaRKupZi_R80pTjbDAThe5rgR4c8y-4xtUqC9wa2G_IMlkj0SVsNzNVDHhR2oBNtjZ5lTppsDyIEKhEJLiEZIjPMDj3nJD4kT6Mr3zq3JmFoVLrpQRXctX5JGKOm3Os4_bJmheCkgNwQqbabrcL_-SA2dCa9ZfxSyz4tXHoEe4l0_6ppvDye0CjykuUY8vy8ggh2W6tp5rguPc0_0K6fSOG2CXUvaHC_zqPJcXH8nDtvj8BiudaaAdQ=w452-h450-no";
    Button btnchiccosilla;
    ImageView chiccosilla;
    String urlchiccosilla = "https://lh3.googleusercontent.com/mLJVb0kVJpgpxIS-kq9IdtGETI3BJ5DPlgMAqh34kfGWBhpKb44mF3NL6cl1OC1rubxmQdW-f-N2TYkRMO68ZaGYQhug-JDp_2N2m1kCSJ8w_ndoHs1qRoMYINvSXRq5oS48OSj4GvEH73ueltpp6njF1X-4HC7ql48hlOLaJ41kLZttaBnAOW8A6PrtQuK8C21O5All48_P27eaflXgkNBJaN5XZgefwcp5hEWjdY2UMYfLXJzxB6SzT_bYO0CwK6vg-ebu0Q3NzpYVcPLVpC_NOElJFY3MEmtwOOJKGcPOA0aWNJwXBH820fJnsHG1aFU2l5q45MonmkDQruziX5nwb6d8pcmKRt2-OYGC79scnSYoO3kVOwgmDyycGa3fmY4vR5z5AtCb7SrToOLuugImZJSHJrTvnEXbiNCGrVjyqPyhFqbZ1oyFb0KP-Oi2sBP9OLrGobfIm9e1td25MXw4x3144IdlaTCrpxStvQUlOc-Iq49U7PkAHj0Ws0roaV1Qu4E7JwESt0vBnmcFw8tqMPueMOQsc3kvovS5lTdXRcsuspDAVRHYyjxS8ZysSphZaZ334tlEKchn9E9UFhiJTndbhN2_CDMWlch2E76L74ctgg=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoprodlist);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoprodlist.this, marcas.class);
                startActivity(marca);
            }
        });

        home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoprodlist.this, MainActivity.class);
                startActivity(home);
            }
        });

        chiccomamaderas = (ImageView)findViewById(R.id.chiccomamaderas);
        Picasso.with(this).load(urlchiccomamaderas).into(chiccomamaderas);

        btnchiccomamaderas = (Button)findViewById(R.id.btnchiccomamaderas);
        btnchiccomamaderas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccomamaderas = new Intent(chiccoprodlist.this, chiccomamaderas.class);
                startActivity(btnchiccomamaderas);
            }
        });

        chiccohigiene = (ImageView)findViewById(R.id.chiccohigiene);
        Picasso.with(this).load(urlchiccohigiene).into(chiccohigiene);

        btnchiccohigiene = (Button)findViewById(R.id.btnchiccohigiene);
        btnchiccohigiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccohigiene = new Intent(chiccoprodlist.this, chiccohigiene.class);
                startActivity(btnchiccohigiene);
            }
        });

        chiccosilla = (ImageView)findViewById(R.id.chiccosilla);
        Picasso.with(this).load(urlchiccosilla).into(chiccosilla);

        btnchiccosilla = (Button)findViewById(R.id.btnchiccosilla);
        btnchiccosilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccosilla = new Intent(chiccoprodlist.this, chiccosilla.class);
                startActivity(btnchiccosilla);
            }
        });

    }
}
