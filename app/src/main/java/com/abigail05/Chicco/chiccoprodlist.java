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
    Button btnchiccoduotrio;
    ImageView chiccoduotrio;
    String urlchiccoduotrio = "https://lh3.googleusercontent.com/5TH1LyOdBkBVjlHhpCAggeT-mCeZw4j2MDbB0sYhwC5K1n-FSjdoG5S4bRPA61pT583WfaKZoqIW7vVWaFILYY16vpj9Wyv4oNGKPFC1Mdg0tdDtjYtkHlDibBE-myUsTrbHI8uT6N77i7KLyJziOuICjXhPP65LkqMptB8sq2FHBvGjwwFW8FbV25az1et7zcUADnxUAk82u0Hmov_XkWFTsNtnHf68AVPrfGaICJrueaCI-sVLka1yNmTnWzb1X_XHABPcEnrbH1gMka67ZilpI2Gau3LxC1PB_3FMtNnSqKqeWmPDvk6lsyWfxC-tbEfJ_zyTeXG8bfx8yJbcV-KqsuCMoram5fN_Gyv4RSkRQFrqOPixZ7olw-dZej79W1Tc-gZ4jPhvvr4V_CZZ0O10JXKiA5LTBzUNK7Ou-HVQq_kuEs2653xIlhp4qF7ErqTubHjh_WuotFFrGPZnioea_VhcJYDEV6RLGjW6El57Q49SHtJhAwNNwkCrHucFQ2ndObTT6T5DXRNXoOniT4337MDNUAhgAsqrOiwwYFTFiP7vpSyBAUGeCU5U1a77ORx5tYq-sJfHuUSiAq9Eajt60JG2dJEHjyeZoxP3jj6Y82gUdO2i7qj74tpQ15qF-jVPlt8nZoM9QkCzj6sRMN6ot6auBjobwLrZx3SuFC0=s725-no";
    Button btnchiccoultra;
    ImageView chiccoultra;
    String urlchiccoultra = "https://lh3.googleusercontent.com/1JPNzcdcWhNlRquVDIkIDTQrpFjO2y9SCfuuhF33UeBwVnPm-m9E3opwwMw_OToWHIyvtELD5K2Xphdx1_nJg0W_mkxsg361Yqb_p7977SLW3TXG_vRhZpSoCp1tEDQfVdDKYF1gVlLRAq_Ncv5eHI2xL5g8RMnuycXi42voFR-cKaNnu1rKm7DitMuV638bpWcarICmHKcDLPO3dMWJTVC4sidj8JijCvlxJtx3MuwBUvqy6F4RwqtIXYl7s_utIdCfNj1gkLiidMjiTrB9i9VqRdCukfllWJo-5I8xtxe4OwhId3D4boc2_QdXUGSTePyZEW3dP5NmQd6jWE4BbZNBMElUytqWMjRlvO1zhRW-TLUxYrjcp77AKl2osZI7ULBQiWWfuDfWD4EjOiB2WuGKhqOnjEAuv9_hYyrkWJRf6gHopIr9JQBpzc8qKlOubV3XF_CutPjo2rI3X51RUeIAi-fFVwMiNGqLol6PvWI51hXM6bDvDSfNqjxB7ACwqd7SFNP4fDb0D4bZl1kyLaOX4u__ZM6OoCfp-xBwftj-HY_BJXJ4ewfbExzhFxFQut2hyb_FsUmhqx7Nnuv_fXM0YIQtcrWkuIaJURQeIkcF6dtqLc1CtogCSplGQO5AmtSo-3cgHLhZ2iXVoeNFEsWDecJ3p3mk_myXs_-JNVg=s725-no";
    Button btnchiccotwin;
    ImageView chiccotwin;
    String urlchiccotwin = "https://lh3.googleusercontent.com/M90hahCRCSuA9EL5m_1MhmyBTBzIYZOMftgENanT8a-u7rDPcYMX-09SmaX-cJk2nbzIRFyB8tS6h7kH_8Io2cUc0qPXiBXMzGKdh5Nidd-4N1RBT1EuuoDJu3welvonIZz5I8ztu38VwG7UTJ4AYe3gUT9G9QvXd9McfzV-gHDsdxcyANTPby0eWQ8IodKw291Ng6DccHHE9c5rJwBIUww-MjogFtIMJPt2MeMZXIcM5RlgFOAkt3Iq8uAedOW4cpXd9rpE64v5X2XEqeqPG0JTxPFFhvDmaKdesCdeCpVS0_Ye7AVnYdoXxLgP3PPsozIL0ndCVXiNHtSM4ObSr-b6OsFfRGvjcV4oRDVIKgeMVMvbE9NMM8_tljCOsOOs1z4EX6V22VhVP1bMVON38pKvxjwLAwTHC1R7TV23uyIt8078KsQ5YeWYHufu_K-I8jWrnSZ89OI7soqnjCsLPrZAOg251miwLI4PG-9yWj5_0-rlooLaVNusdipPLTbVB1wX1LWqFdBc88ptXr9qEl7beHd0CbUpGxopuPeA_qHGNc78LvD43GO3qUEg5j6C_-lu84aY6vpXH4e4IsGPiyjeqEmdAvJpMnMSNaDTEnHeR1zSpww2JgEOVZDtmGeBzYDzH2gH5PIVvsNg7X_1AQNC6FoKZFpdasUPueV4o1s=s725-no";
    Button btnchiccobutacas;
    ImageView chiccobutacas;
    String urlchiccobutacas = "https://lh3.googleusercontent.com/lcadj4raCW8tpzz3MjJglrAiv7rrFR1htf6KFtoqJMKPcSZvp9NGvpafBXLfOzhpmZIyh83sa6M6fbHbRrCZ00iGSs7p5qO5cHa93XBJ_jmYp83A7jx_VuRlcNXn-10xX_1d6K3NespIJ6TdqjOHa-vrmlsqvkUkpkEUXMkozpv4p_B132OPlrnYXbSGRGs4EwbZFo4Z01ZPsZZL1Cd8yQEOWSwgzuZAJcNv0IdQmj_kq0S3A1R4s3mCkFrz_zzx8h-Y6kqPBvLvB-oCjV8571BM2x9UfbZzfSKMjP2LJ5c-T88x8BEmNf8h1y1SBpHhDqtok9v79PZPXmAA3jbEACKlhh5ZbrIGIC6upPDitCAmApnwU_TBYQ2n9JUSXqhxuTV0lE-sVKC_YxVuv9RB63yUgpxu2Xbe4IxJWmH8x8IENusQIJomc4ZxQaKgwg1Wn5lxf_RoLQ3ThrfOj_hTbNIxRReUaRWLOkjOeRwPIT7oACRzlzyQCE2tQJa4ZY21RY2iLXsHPSPuYR734jLcTWb30wWphx0Ba8UBN3QoDm4Cw-LI5MalceonDpt7WSYE16OGss-6lRKwkR00NcCfsuu-0KWyHsOE-MbRppbulynWfPCrzTOQy4kH2nTTDs5X8aTS31vMBP5vA81cBVyMwxjTOyU5DmMwXW4PXq6B_eU=s725-no";
    Button btnchiccojuguetes;
    ImageView chiccojuguetes;
    String urlchiccojuguetes = "https://lh3.googleusercontent.com/k2TZblnazO1dn-3fp3R49eUbcO2NUohgO8E5SQ8G6fYihjyNVeWFiT_Es9RuuVXCUVztIMy-VAwjwV3vKhwdtG1Yyp1CSC6nSE5w5SazfJRMK0DTABsB6NzCmweTTuO9BGWQaLvEMqHYCtgoYMvmOidEwHnh2R9E8Tn3ASQiIjn9a48riCS2Mmz9weaTnlTemTaAfu2zBXYRxTgWuVzNneddr496Oofac9sw0Ng8z-ObSZBfSnJbncfNDHhL_WWUWRDd6TaNjyoi8Fh3vBvT3tj8hqR4XDDfPP512Y9n2Id73K6NYH_VLt5TsMAWC9lN09weJ0JB5PreuGPRyaonkkh7f4lX_-fRdwCNU7Phn9KhLVHlJVv-C9cymAcl2RfNDvK0U46oXqcNFID2NW6rBnTTKCxxwwZldi2hSOyA4fXD0gkkQopqoh_RR6sCT9CxEv3isVJXEaJTaQA2EzN_Eqh9EFCRHUhni1zC2KF3D6xwLCoa9viuLcjj7SgU3mxcgJguwm4cilcUSSrZ--UaVz0OVEQAxfFExsJQe9fupfg0wxZDOFnbk49Eb_9m216Q11XVUUwdaT3sG4FrNe215MMrcsKrQ_l1xqZRHjaP8ekjxFc3Onja8rZht6qgJvIQlh1IUopnOzOw8GdxcGRHchLyLcZsDzhb9WCwcUtCZSk=w396-h400-no";

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

        chiccoduotrio = (ImageView)findViewById(R.id.chiccoduotrio);
        Picasso.with(this).load(urlchiccoduotrio).into(chiccoduotrio);

        btnchiccoduotrio = (Button)findViewById(R.id.btnchiccoduotrio);
        btnchiccoduotrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoduotrio = new Intent(chiccoprodlist.this, chiccoduotrio.class);
                startActivity(btnchiccoduotrio);
            }
        });

        chiccoultra = (ImageView)findViewById(R.id.chiccoultra);
        Picasso.with(this).load(urlchiccoultra).into(chiccoultra);

        btnchiccoultra = (Button)findViewById(R.id.btnchiccoultra);
        btnchiccoultra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccoultra = new Intent(chiccoprodlist.this, chiccoultra.class);
                startActivity(btnchiccoultra);
            }
        });

        chiccotwin = (ImageView)findViewById(R.id.chiccotwin);
        Picasso.with(this).load(urlchiccotwin).into(chiccotwin);

        btnchiccotwin = (Button)findViewById(R.id.btnchiccotwin);
        btnchiccotwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccotwin = new Intent(chiccoprodlist.this, chiccotwin1.class);
                startActivity(btnchiccotwin);
            }
        });

        chiccobutacas = (ImageView)findViewById(R.id.chiccobutacas);
        Picasso.with(this).load(urlchiccobutacas).into(chiccobutacas);

        btnchiccobutacas = (Button)findViewById(R.id.btnchiccobutacas);
        btnchiccobutacas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccobutacas = new Intent(chiccoprodlist.this, chiccobutacas.class);
                startActivity(btnchiccobutacas);
            }
        });

        chiccojuguetes = (ImageView)findViewById(R.id.chiccojuguetes);
        Picasso.with(this).load(urlchiccojuguetes).into(chiccojuguetes);

        btnchiccojuguetes = (Button)findViewById(R.id.btnchiccojuguetes);
        btnchiccojuguetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnchiccojuguetes = new Intent(chiccoprodlist.this, chiccojuguetes.class);
                startActivity(btnchiccojuguetes);
            }
        });

    }
}
