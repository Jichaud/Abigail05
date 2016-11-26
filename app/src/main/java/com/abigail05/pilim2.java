package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class pilim2 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncomprapilim2;
    TextView txtmodelo1;
    TextView txtmodelo2;
    TextView txtmodelo3;
    TextView txtmodelo4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7988d79ef48ac53ea98c5ab6a6975735";
    ImageView pilim2;
    String urlpilim2 = "https://lh3.googleusercontent.com/wfM_F43ccHd5K3_oy41urV8wcb1R0O1r9m_5n8YPd32D9JeigN7xSa12v67IR40iEFBjlIH7tyDzDl-VeVZB5vFCkFoU5cEgt-VRuE7ohUj_TShm7vQ9g47kk_GbGgOoCHFnM3FVAPyMpufa6pvqIJOD_QjSsC8kxjnJmMQE8WAA8adErT1XxXe15y9iaGIFW5BF6EIYJaEuzxGS96GUHcpd7TaRW_V3MiD3tfePGgy9z2J9R7N2pWxL42ViQkW5vwphkMTvGsePJrXIJoYJ7dSQRvKT3tViFw0-uY6Z3uEKFWXNTMETb899DM30G8jORKH06C9HvVuhJu-c1TpsYXyRZR9kbxrAq4RijSVxXIxFszmwP6Et-WbfezXMRv3Ym47MOqvNQUPN3juC_z_6nHbX7mT6y_XU8_meYfkerhrB442m00KQzOMplvni4g4JeSDPwVRqnNOAhGDPbotr7OqtXrVWaLicTQXMDvABXrFbI1m-gOcfx3Y6SHKPRIz0VoDrLS0M9XVayE4KGhpyQEnYe9YXLh4Ay987XtXnuRyv7juuHEr5M7EcKSBS36BJMfvRIT2Tc42yFdlIqrrBRoHj5Qh2oW9QTBoeX22c_o3CAbQFwg=w296-h324-no";
    ImageView pilim3;
    String urlpilim3 = "https://lh3.googleusercontent.com/jACsdod73mn9yCkjxUBxYopbo6loECIJU8vu__W2zB5F-agihpTfrJu3E7GgAqHbfwx8EdL7caZDGybP2p6MOaa2zuc24eLHvFp5egNIgFnFbvhKrdp6Ysd-lYWWu4lnCr_OMomIkIZWeYncCkxnbuPymppsSJz4mxAjzn9FBaRi-fOi7E4lZ00-OhQzVsJU_DYt91X9a6xaJ-Kf4zdkVAzpGyyEHljP_j3J7UJARnoh0bwqd23t53a5lDXYIQPqut6wAuHBXrXqDerMM9XVjfHMzyFi3biai5NpIROkUJz_PLiDhndMYlUZfK9FR3ioebnkWwDJBJvskEelE6ENr3y1qpouU2hCDEcrireDUrSCxR2PdNTRPx2B8Ugw1nTey-2DU4oBWiz60at_RpNjQey2igEDk2avY20IxuCMmk0EYDFkE-873yGxKi9OWWSBDiStzK_v3gZzHa5L6RMzWhT1jwAoJcH76a7fYDe9PhZphcxueAuidcwVpZUAC_AG9WV3OzN7xULBW91iY4qMa47w0vF6idcp3tKSnLhGEcZ4tA2to8WfBR0ZXmPOfv-NY5NRZJIkjH_BFsJkHcVnYrTIwUIOSuSvJM-LWd3URj2WFiT9iQ=w308-h324-no";
    ImageView pilim4;
    String urlpilim4 = "https://lh3.googleusercontent.com/AWd5N8cbPsqC_7jkfBZzG_bjglz6k7xi7Z4m1OUOT7bf0St6ixvEClKwa1gml2USNjRh2iXUtSRruMFnQRHbzNaV9BXeg6EfRlGyI64AqRaKMhx99nNSBPO01GX4Gd-XpgjP_2_KTEGPKsms3-1ezLUS0wL0qcKr-2JusMo5Unn3E0eSEScF216gJqqR5Jwm1r13DGlaoqDL0ETXAS7kPvxoCVn5oJosevuPQsd_vugd_-UgB_njmLJBOEDi7KZfI_2F8nadKiZEI8acSIiXVbQer6Ci73hZ_gmxDZiIPecVHkq0cXTQEeJN7u9bfFxxd88Vw2KqmaQ0SbMcNRbXP8GG-m1w-uB9zEXz6RYfTPVaEb4UVUWQkmfuaz8Vj_OZvFGAiMXIuCQdDA92gAnhWn2vFgUoQU_2u6EzCTbQX1AP7-N43vYrZeLkOkpsWHutSDHBOKY7qwyK2e6nyJeAEsOQFpvjKsmZrv5eBvckx4w0nDLLQYXXgF2jSOAUv8L5RIaskjwvvibVc3wnAjyFsUwt2KO4HNFVP4GfgPppy1-etsbVd_km1I1tPfh1elW31pAH-6xmRtXKl1ehVtmGf5BR1DJsNA8qyJW0La1tkhhpb1Fr9g=w337-h321-no";
    ImageView pilim5;
    String urlpilim5 = "https://lh3.googleusercontent.com/2WYfVvfsExDaoQ5hVxDAnsO4AVpfs9iet-iD0cC1xiUcAUWLaaPkZaq4uqbwBXCdkkpIowALDoiV0hlWhDZen-wGyvTxroPYSa8ADsA-dPXvdODYHyUUAzeSHXCsSxDx-JSUjkKy9m6jZ-2utJLvp4BGVIbn2N4socMcWg5clY8asZrEExs6-n3hh-Q-sQLzJZLK4jPRtXAmtbEW3pk91NaVjkQxjv47pJnDf3uVmPLRaDa7y9P9O7vFBu6hQuJpq_-sUyLKwfsa3fMq_dv0piqJen58rGYwJAnItdv6GrTP90ybKd1YnsbEF_rBYhNuSwJc9dDUeBVV-jNWIWbR1ndFzBDVJzJkb3SLD00pYtjq0YwH35gy6dgrmwaFM9ct3_iV99ieNUH9b9SP6e2WoOCzScXcp02t9DUM7Axty7m7rOROna-ptm1MlVv9iMpTguZFoed4ecNYN8Rwg57Mm6R40Wp46rfWRQuGWa5uixqRJLY8xDlyZX_x91iqk8njSrok8-aKb4jWjL6Ds-vNmMGZtBBx4jjamcP6R_kaM3DQI4ccbviq5Jo8H2X1yzCqdyKdhyJ82Jbx_l57596Ykx1haIU1nj3rklv6nT5Kce9N6Q2sXw=w322-h321-no";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilim2);

        pilim2 = (ImageView)findViewById(R.id.pilim2);
        Picasso.with(this).load(urlpilim2).into(pilim2);
        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim2.setVisibility(View.VISIBLE);
                pilim3.setVisibility(View.GONE);
                pilim4.setVisibility(View.GONE);
                pilim5.setVisibility(View.GONE);
            }
        });

        pilim3 = (ImageView)findViewById(R.id.pilim3);
        Picasso.with(this).load(urlpilim3).into(pilim3);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim2.setVisibility(View.INVISIBLE);
                pilim3.setVisibility(View.VISIBLE);
                pilim4.setVisibility(View.GONE);
                pilim5.setVisibility(View.GONE);
            }
        });

        pilim4 = (ImageView)findViewById(R.id.pilim4);
        Picasso.with(this).load(urlpilim4).into(pilim4);
        txtmodelo3 = (TextView)findViewById(R.id.modelo3);
        txtmodelo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim2.setVisibility(View.INVISIBLE);
                pilim3.setVisibility(View.GONE);
                pilim4.setVisibility(View.VISIBLE);
                pilim5.setVisibility(View.GONE);
            }
        });

        pilim5 = (ImageView)findViewById(R.id.pilim5);
        Picasso.with(this).load(urlpilim5).into(pilim5);
        txtmodelo4 = (TextView)findViewById(R.id.modelo4);
        txtmodelo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilim2.setVisibility(View.INVISIBLE);
                pilim3.setVisibility(View.GONE);
                pilim4.setVisibility(View.GONE);
                pilim5.setVisibility(View.VISIBLE);
            }
        });

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(pilim2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncomprapilim2 = (Button)findViewById(R.id.btncomprapilim2);
        btncomprapilim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprapilim2 = new Intent(pilim2.this,webview.class);
                btncomprapilim2.putExtra("string", urlcombo);
                startActivity(btncomprapilim2);
            }
        });

    }
}
