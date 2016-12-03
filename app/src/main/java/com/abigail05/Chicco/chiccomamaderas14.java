package com.abigail05.Chicco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class chiccomamaderas14 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas14;
    Button btnconsulta;
    TextView txtchiccomamaderas14;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8bf0b3d4d7d04fd871c93fb71dbb57a4";
    ImageView chiccomamaderas14;
    String urlchiccomamaderas14 = "https://lh3.googleusercontent.com/qAPdiMO2kurpR5sTuA3CunMaucdVraFeLS8gp2_lJWY2qv2yr_tZAi9yTWl1MQV3lhH_VUcUnF1VLPmee5Y0TpmGhotJX5SZu5l1bd3OQBx4Ei1IbYXHKtPv_gOCWWlISeIjwYSHhUXhEEHFB2-vxHHHjHFXtDVXYkOC-cPQtlP6OhTBz67jHphwHyiyP6VkZowqlVap7lD2goLxW1u35GZmQ5OxhsiwxoXCN2_VjKQIYoHtQw3PY2ZRNdYgq53YvrUwop5VR7_iW-c93Vw8rBfu8_sTPSxWReflkU7ncYVTgePl9DrBWw8bWgEBFyQQPNL_f37ZC8vXcIg5-chrb-llZ_X3tc34D93Qi1lc2osl2YObXUHFfmWWYFTJIDz1vL3t88bVE2q8jfL5XiUNb_4UbZxL1zmitUasuedb31teQnBC9EKn1I3tc7jUKrWsrVr_d2EW8Yavy9p6Lhs1XRSlHYrWRgKHu9gD9VJu6ftR-CPJQM_ux0ga1aEQkF1yjCc8NOI29YDwQ0gtHa8R7ZRNUeMjmBp1fmO8IDJU3kBfH8Z3QwipWciBt8PoU6J7rg1s0GrWXCv_VVQ-t1LlhV8zLfvgokvNPAxMXgBnkjizjk7ztQ=w428-h460-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas14);

        chiccomamaderas14 = (ImageView)findViewById(R.id.chiccomamaderas14);
        Picasso.with(this).load(urlchiccomamaderas14).into(chiccomamaderas14);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas14.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas14.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas14 = (TextView)findViewById(R.id.txtchiccomamaderas14);
        final String stconsulta = txtchiccomamaderas14.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas14.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas14 = (Button)findViewById(R.id.btncomprachiccomamaderas14);
        btncomprachiccomamaderas14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas14 = new Intent(chiccomamaderas14.this,webview.class);
                btncomprachiccomamaderas14.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas14);
            }
        });

    }
}
