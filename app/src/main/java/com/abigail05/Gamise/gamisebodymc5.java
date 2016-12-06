package com.abigail05.Gamise;

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

public class gamisebodymc5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodymc5;
    Button btnconsulta;
    TextView txtgamisebodymc5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
    ImageView gamisebodymc5;
    String urlgamisebodymc5 = "https://lh3.googleusercontent.com/mXzCesPhlmJ8sjY0tTZdro8uBzsvLZnfA4J7KFtCgP0kgdTrBsxxmfKXdvBEJulZFnwJWIKnTwCppF6n9djbGu2LzCW2SpT0GqUmtUgv9f9_B-Hfz8Ow_LhSt5_zqhaqqY5XRx0yairbctua8gsTW5a6kLR4Valabx9Ha_Mjxy2En5T1KqSS783FJ6apiUxRdWHGMJj_Exa539jgFo2enLrytVfLsc_NzcaS24tPNpdLL2mMGjbATG8_9qDiYo7nyS2Mn3wf05xgHV28ZvMR1K7UROcHGpf_cLhunMo5J8kxLlq9ddJOliVY-bITyfoWZjRrjGcDY4TOEnbamKurc_LHFrSYCYzotgQOqTZa4Z24rwFhyZSt0GLlV0b0XYkVODlF4z72YGiu4SUIpX1DXzlc-ue81_VmDDbaQq_Ervp570oOgHvFNt7FGaVTQgR8SuGu-1DE5ai7p3fAkGBIz3_dH0kifkKHUBDRFNedTrauP1xwogZc_0Hn18lqdOEl6Hk7KB2JfyV3GRn1T5qNLky5KRUs43rEIFIpKpna7Pjvh13R9sjwuy_hp809ZnN30EXROgmKsn8bsYulJ48-2-kgZxgggwWwJPyASSeFApuDMA7_k0uvNuaxonZ0WeTjyTQ3F4TZtepQt9uqudKIaufJPhoai4EgsKkZ85Qgq0U=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodymc5);

        gamisebodymc5 = (ImageView)findViewById(R.id.gamisebodymc5);
        Picasso.with(this).load(urlgamisebodymc5).into(gamisebodymc5);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodymc5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodymc5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodymc5 = (TextView)findViewById(R.id.txtgamisebodymc5);
        final String stconsulta = txtgamisebodymc5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodymc5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodymc5 = (Button)findViewById(R.id.btncompragamisebodymc5);
        btncompragamisebodymc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodymc5 = new Intent(gamisebodymc5.this,webview.class);
                btncompragamisebodymc5.putExtra("string", urlcombo);
                startActivity(btncompragamisebodymc5);
            }
        });

    }
}
