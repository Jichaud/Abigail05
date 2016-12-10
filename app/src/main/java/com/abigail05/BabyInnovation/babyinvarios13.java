package com.abigail05.BabyInnovation;

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

public class babyinvarios13 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios13;
    Button btnconsulta;
    TextView txtbabyinvarios13;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=af66fa25ae89d7cf5987895121c57960#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios13;
    String urlbabyinvarios13 = "https://lh3.googleusercontent.com/zuh3zreyVxY9ZHh0aXMnftuFxzQGsk09rVlRff3AdC6YD3pUbIrkbe1Jc5JCm5M8owSuqMZTepUBrGApSeJGw_gLf8gkBPW1opn4LmRKUIwbadNHlWZ090WrQtuDnndZcBZ64DXsFDbyV6JeAurYKPXq5qEvqJbYs-Cd6xFhhMW6OoM-qSHrbVcnKPsnKbP6dvAQeHLHkIOmVe9iDnxcbxw8Dg0gKjoT1z9FlNxqcqU0ed2kyhgdOF0Iilp66-7FybtaHOqfJD7xETMMOgknAIR9703RSFRAuzTqaIXBc5RT1CqWhwzNeBwAA265n7JZO52vJAoHY6IRbqw0oCSorRy-IMluzUVK1-2l47sI2riho5gA0to43MYxd_vlMNQvckH5gEiZKZ-Bmmu8RdellQnGf-qBy05lTflUlI__n3d0WBS3K9_oQyX6zBp5dOUgdTN7gL3FTDIga2_21tk1zzPsfNaIedf9Y45xqSBh2hvQVvfVlByqm9FMeRXaTr8yde_Gjcj4cuONTSOXWhzb3qL7IKtA0mtb1_IYEH_0pmdIdbvL8FKfOf1A3j42sDQr-0MOXxgtVcLXZpUL40ue7ncNFztpb5mL1rUdeMSxvZRJebM9oBXq3EKkFDvS6wbppc0hVpw8JaYNaW6DsMXrtKZdY-mHH9xVKvSAiYxWdz4=w328-h332-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios13);

        babyinvarios13 = (ImageView)findViewById(R.id.babyinvarios13);
        Picasso.with(this).load(urlbabyinvarios13).into(babyinvarios13);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios13.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios13.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios13 = (TextView)findViewById(R.id.txtbabyinvarios13);
        final String stconsulta = txtbabyinvarios13.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios13.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios13 = (Button)findViewById(R.id.btncomprababyinvarios13);
        btncomprababyinvarios13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios13 = new Intent(babyinvarios13.this,webview.class);
                btncomprababyinvarios13.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios13);
            }
        });

    }
}
