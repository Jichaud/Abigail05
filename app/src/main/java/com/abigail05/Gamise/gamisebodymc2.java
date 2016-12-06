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

public class gamisebodymc2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompragamisebodymc2;
    Button btnconsulta;
    TextView txtgamisebodymc2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=de6eca41c8f73e60eda52472b73eae20";
    ImageView gamisebodymc2;
    String urlgamisebodymc2 = "https://lh3.googleusercontent.com/W3ssHVXSoY4Ej0Vl7YMci4ag-tit8ScxGVac6id4U1k9msvVr5AKD2d7IvvOUegsi50LiwI_KSAiccnb8rKRTGGX6_ufEh085a-GiaF8PdllkmwJ5t88YQeEVi0X1gl24yihyPti0-jkgt7s7fB5mCFoq3Ehj4nTudhZWa3TPq98Kwy-q9wS0AcKnTExu98mgn4IK-QR5TOyN7d0yMqQsITD3fg92UAdZ1xSjfJdJ3bAQIOK6jl0c2HJmqqlGUD9LyBZzX13tiNkZGzRbsAIYxYLrU2S_TvfOI9sM_KN8glvmyK1ud_ZRy65nJprXAPQ8l0VCZz7Ka7tJ8nEzxQIqk7ZVA6OdnipcCT63H2OCQed18ykW--b62Hijos_RYzCFRtpiWquUSOK4L3lXvCLM071wvij8PbK1CiMXHqzYEpG3rXAgMuXR4Owc8gDRblGMgNJfcbvcF6yS2cUCSYq0VQpcUaOIZSfjmCFxwwnWwGj_mgfBWcCFQ_Kzhe7UcUTLOKLDH1uIyM45tLvzHGmHnGq6jn_iCjMCsfpaD_Fe77ORH12HTI8yvO7RKV6J5uV8YynyEs52dPH8zCyXmbZdWcP3MlQUKjHPQPQw1P4T4-M-XlbcARmX7_bcj_YBLt32Hg9_n6FGV-gm0zH4UqZVJX8qP8dfQA_bE8-szWTlY8=w400-h386-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamisebodymc2);

        gamisebodymc2 = (ImageView)findViewById(R.id.gamisebodymc2);
        Picasso.with(this).load(urlgamisebodymc2).into(gamisebodymc2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(gamisebodymc2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(gamisebodymc2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtgamisebodymc2 = (TextView)findViewById(R.id.txtgamisebodymc2);
        final String stconsulta = txtgamisebodymc2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(gamisebodymc2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompragamisebodymc2 = (Button)findViewById(R.id.btncompragamisebodymc2);
        btncompragamisebodymc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompragamisebodymc2 = new Intent(gamisebodymc2.this,webview.class);
                btncompragamisebodymc2.putExtra("string", urlcombo);
                startActivity(btncompragamisebodymc2);
            }
        });

    }
}
