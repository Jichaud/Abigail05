package com.abigail05.Chicco;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class chiccomamaderas3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas3;
    Button btnconsulta;
    TextView txtchiccomamaderas3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de5886502a538d82275e2532ecd73251";
    ImageView chiccomamaderas3;
    String urlchiccomamaderas3 = "https://lh3.googleusercontent.com/zOmQFqJ9eXQCu-g8RFslDM0g6cslxk8mkvdDt8yon5BNEuWfdPpGVQWgCNU3CKQnClBx04Ne5f--rH3aJjXhmhaXU-E8GT5Vz2sgfFys7La7Jib-q-SER03R-RT4r7L2LuVobu6cvrnYSM7j_vDhKzCO13Dm4fkKXVCE7OwMCRe-n1i1QMi6u_BOtSPtyx39FyPNG24q7M8zrzTofwbJcX3A9v2KtiRm0Zn0V_7e_dPEgNMr0SN_obWhsXr100Mq6kl9VFaYfOzkm7Xmklww9H3lNlgaUmQMftbBkdCA-g6AEJDJVKemKNBmELw34EvZJKuQP7qRwRItO1k1aHiI1sV-Iav1On_sNtpsd4JER8bBeAIUoqAXdWRyiEUXeL0DHMXzZkChB3mTd-4oDLS0qdANjSWJxUw4sn48uHqhdjP9OH2M_wIivg1o1wT8nlzcIHGG6RQwMlYTvMnmsw4cJezIbnqkR5jLfWd1-J2HjMyl6hDHGdlt0Po_xdEjM8azN16cBDHNGzbw-OTQTyem_eaz8hZYq_r87TzxMvPiCh3s7XoMfslCKn4g8VMl0f3SlqcBT1LDSJpTa35Evfj6AsQbVpuXHUZt7KtQfcxpWowDux-p3g=w396-h399-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas3);

        chiccomamaderas3 = (ImageView)findViewById(R.id.chiccomamaderas3);
        Picasso.with(this).load(urlchiccomamaderas3).into(chiccomamaderas3);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas3 = (TextView)findViewById(R.id.txtchiccomamaderas3);
        final String stconsulta = txtchiccomamaderas3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas3 = (Button)findViewById(R.id.btncomprachiccomamaderas3);
        btncomprachiccomamaderas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas3 = new Intent(chiccomamaderas3.this,webview.class);
                btncomprachiccomamaderas3.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas3);
            }
        });

    }
}
