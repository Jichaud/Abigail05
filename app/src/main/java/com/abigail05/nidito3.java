package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class nidito3 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompranidito3;
    TextView txtmodelo1;
    TextView txtmodelo2;
    ImageView imgmodelo3;
    ImageView imgmodelo4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=00adb14c0a2fb5329a19dd28a3d78a6b";
    String urlnidito4img = "https://lh3.googleusercontent.com/VBvrSY2xaYeQcMceryK-oubCrMfuFnh3HrbqXOofoIfpltJ2Np5FGQnrKAn6yJf7JacE32cxO0qHSPQq8h5S6IR6vhfDjUv8HT2VW_3TqtLZQIfJQS9aAEnEbBXu95RMEhsO-ojutkb0LJpU9sLQ_fxd891gjV95445yNmLIceh6iOLSzsnRz750poqDmjovrqAq8yOxN8UewgLMbwulUuzAww0y8UZkSK5m1lkNQodXO3t2HoCUJR0_YXNrq7vsxj4iCjXKYjZe5dp5GakQlmhVRshmUPu7oIhO8IKABhp6KHDlj7r7ozl1_ogcBeiCY1YcNscw0eui0HJ1gJz-ovaQkzoGQiV7hWLoT9N-p_cWll_m5_l-vd50OrBA7jfGaZZcSSwK8ro3_PD3tLoryEJRP4lzkqwBiCxyK6cd_R0eGwjxDUmmfG6Guhx4RTyFujP336nHNrlQXYJVqt90UNUDQ7z3SLKIVLNPEq9FKLWcgazhtt_KI2LY3eafwXljWa0O3CYda3DaQf489z0wHoT_y9rqjKTDUexAPQ1bNDWA68K3EbHToYUzeBJQCS5mAdqQsp4acuQoYzih9wDw8Sr6QlPCW4XwJj9ZkBVUhee5zUsb5A=s541-no";
    String urlnidito3img = "https://lh3.googleusercontent.com/SCVHgQ2GE5eELeBMQ86Fm-3GYIeVfHo4gZcnwNykzDGnADuUHSTUMoz1BeEe9TqpFSLuRqUBoWIpBm2EZUFX7a16IYWj5b4IMyhWb5u8_mrQ50H_fCQv2m3hJekra--TZGj3CU73hFNw6ZICAdj7V_maSbm7TS6T6ask5d0_Phizhtvyu6gWRkavpahQfsti0eWmnEeHtSq-aUm1RF7M8i_5gKvoPKkiK6Dvl85VrCwL3bUQ2OoorJ7XR_rRmSwij5fAjopvBK7jiZLLMju5FvcvrkKVjC4acZlWoMLJip_1l0trJoBgNcHfgNWwlOWIIrAOE5DC5RPPTt1cBJ5oaQqCULFk_Lz8vgRp4E21ijz7WcWp0qkHffSaATUOiTR4CLJGSIMJSl7T0R2G4BAn7FBdM6RiSR4ykJ7qjUPJUfYznv6RKbQbBonFVlNZsd2_xtdukIqyEHT_sAQdx_kij6LcSmD9JLT_pXB5ly_f_mHV-ItJMMIsr_sRieX-5pwgk94y6vgr3Gsd4NrSxL85gpO7-fjvmUarT1iLTICTN4hcjjoxhWVGcXjwcdpwunZe4t8YzCH0i6VETFu8msOYLSb5AcEWf81imyMeCUPzUe_LH0sgnQ=s541-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nidito3);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nidito3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nidito3.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompranidito3 = (Button)findViewById(R.id.btncompranidito3);
        btncompranidito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent compranidito3 = new Intent(nidito3.this, webview.class);
                compranidito3.putExtra("string", urlcombo);
                startActivity(compranidito3);
            }
        });

        txtmodelo1 = (TextView)findViewById(R.id.modelo1);
        txtmodelo2 = (TextView)findViewById(R.id.modelo2);
        imgmodelo3 = (ImageView)findViewById(R.id.nidito3img);
        Picasso.with(this).load(urlnidito3img).into(imgmodelo3);
        imgmodelo4 = (ImageView)findViewById(R.id.nidito4img);
        Picasso.with(this).load(urlnidito4img).into(imgmodelo4);

        txtmodelo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo3.setVisibility(View.VISIBLE);
                imgmodelo4.setVisibility(View.GONE);
            }
        });

        txtmodelo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgmodelo3.setVisibility(View.INVISIBLE);
                imgmodelo4.setVisibility(View.VISIBLE);
            }
        });

    }
}
