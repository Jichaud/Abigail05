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

public class chiccojuguetes24 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes24;
    Button btnconsulta;
    TextView txtchiccojuguetes24;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1a09716809958c11723ba49f91d6ff02#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes24;
    String urlchiccojuguetes24 = "https://lh3.googleusercontent.com/ISfQmi9kW8hB0NWQe-uYh1Ex3513blImcCfWOj2mqGUj1-derj-OyYvITO2x03ta1Gm-VgO2EJ1xsEQmdcL_7bAycJUDvz4mpuMIouKkI8BGseg0zgmiKqSWK6rlOFgTHdPljk5e1LM04o_AifrNKAnlhqG6CQ0z1L6uNXC_HXpKf00UKxBxQmM0Wsa0XWIoyRG_YcGr-Y9775GwtUFR5FihAzY0GPp4jrc_qUhEXp1vWUs_y8ox9XFNHF2hA19MASOOfSDcvY9GRvTXdNAROmALCTMUCyyboblBi5yDEgY7sdHz6H7cTupmQ54faan4qTshEhIKrGlMUv_nU07z-X_OCMSUCloAIGVXwrbVu8cpcRNN97o-vO3wE2AQU6JVxDhwWDfUKAGoLRLe3qnYdbuzQhQz9ed-I5SG_HjfIEyw2sRmkWnx9g_5c9CsRUxbS80HeJlPgcxF2E0O9zOBO4EVQlaXou5M96B8L8HmiibMILDjp8GpnrFitEXB-ozbMKWlqzEWdlnPjqMmDCWrz2xQiBeWYZ7j6e_vvpHFj0FhPO_JDW_sUei5-7po5GbA23KyexiM8h8NoYiDLARJWYnzDi6xAlkcBlUIHiHq1TNwumPXJZl_OYM_9tTdSn11Q3Qf8gMij846BOcT_eSrjGlKOwpRweukviUzPGM6BPs=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes24);

        chiccojuguetes24 = (ImageView)findViewById(R.id.chiccojuguetes24);
        Picasso.with(this).load(urlchiccojuguetes24).into(chiccojuguetes24);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes24.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes24.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes24 = (TextView)findViewById(R.id.txtchiccojuguetes24);
        final String stconsulta = txtchiccojuguetes24.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes24.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes24 = (Button)findViewById(R.id.btncomprachiccojuguetes24);
        btncomprachiccojuguetes24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes24 = new Intent(chiccojuguetes24.this,webview.class);
                btncomprachiccojuguetes24.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes24);
            }
        });

    }
}
