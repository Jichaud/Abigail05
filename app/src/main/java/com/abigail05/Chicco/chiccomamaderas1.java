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

public class chiccomamaderas1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas1;
    Button btnconsulta;
    TextView txtchiccomamaderas1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=42aa73e7d9cacea2cd18b1a7c7ed1fca";
    ImageView chiccomamaderas1;
    String urlchiccomamaderas1 = "https://lh3.googleusercontent.com/6v3Wo6gv__psB2pWhyVcBn-y0DO3RYhmgCRCsUyzb7zAwXBXaipEo9bB3zB6jPt-FlFddppHCy4ZWbNrN0NgRJqM7QuIgfxaJbYQQoiQGgL_CBCceE_fytLRb1m4Qf6J_ZHn43swazGB9maeBfZPFpf00-fIYGDpDO-VPglsnRTR9mB-gpM2ySj4VwvkwF2WyISE18m5nsp7GmTqbYRjUfQJkuiuR9p_JXFoXtWL_nVQzSAKhc213dmlh3OBsymqXRMAAutdRMOkOTx3MdnhLBPDiXZHJC0k122z3G0y8dKVebDum9aJAiYo8sQU2u71ea3BzHnjVBghnkYqGhzh7lP2byHLT8gC3oroveGSfgSHbEqhiEzrCQ4QsKIr7_z36a7fYeqdi8do2fhSmHBQ1jj5dHOAGuOEbhntrZ8Yg7wGdi6Bs9y0Sh2u7p5CYPQXBRnwwQyR35TusUezLZToygu-ehHWz5Zfl9d8BVHjoiz0g6B9eD_-WVX6y2cHSCspn24sS_6w67zYS-MGKMuAqVZ5pKmyQk7XAfDjIPutyBL2yRabtCBk4YKNBypLfKP58nTGPhQ0eAUmVLGvmtt3iV1CPCFGD1N9gHQpGHjpOOokPdhnDg=w400-h399-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas1);

        chiccomamaderas1 = (ImageView)findViewById(R.id.chiccomamaderas1);
        Picasso.with(this).load(urlchiccomamaderas1).into(chiccomamaderas1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas1 = (TextView)findViewById(R.id.txtchiccomamaderas1);
        final String stconsulta = txtchiccomamaderas1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas1 = (Button)findViewById(R.id.btncomprachiccomamaderas1);
        btncomprachiccomamaderas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas1 = new Intent(chiccomamaderas1.this,webview.class);
                btncomprachiccomamaderas1.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas1);
            }
        });

    }
}
