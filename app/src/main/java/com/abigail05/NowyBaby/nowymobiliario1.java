package com.abigail05.NowyBaby;

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

public class nowymobiliario1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranowymobiliario1;
    Button btnconsulta;
    TextView txtnowymobiliario1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3fad8cc6d03112eea304f40df50f8007";
    ImageView nowymobiliario1;
    String urlnowymobiliario1 = "https://lh3.googleusercontent.com/vcS6J_yWwPa51HJ8KyxSJ4F4xcrigVpY704Jm2Z2Ckzc-Gc7cc0bHE5DY6lzmuK5hNq7zEyuJNVEvRET1fjLjWw-c3FuHZLDS9zs42BCsdk1E949oraz_TbPMG7bST-WFnQ_MMpbGK5mvTYvPKjf5ah8L2iTAkj6LbVfbVHGPX7JlGx6g73dLMJOHbJnzzfyLA9STzXpH2JrDN5pCrE_I6WFWaQeabjYDYY6_3EYmMzQD7Y53HPhtyhdw7Gb7Sd9Quctf1kp07H_7wXFoq-FayKjo-dJZU_Wg5mzXEVCuRYgSijcRPpj0mDwsdDjXGaaYE_wROAEbwwq9Mf6DSPGZvMk055isbyICsFQS1PRo7z7LLeWxZmgaoofEZJ6Mdri6VtmiYqtJ-WaHpieJzYcT5XKqCTb1tA2RuU0RKkpI_1MQezxYFUsU6tFBuB2siHia47LFEZ97pbaJJ85DIsP70YdnwEowotIA8c_1rmw6soyUFDTMfMUdfxTLe5765IiqXMsfBSFNy1n7Fu4QvZH88m0heg1sXqrC8cpPR7ZCJqQR7caJxtOKr9RIInfZDurAMEOkflpOUHOYBHcYWztSNoHSIctEh4BMIpN5qIs1aYwcpBh2g=w342-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowymobiliario1);

        nowymobiliario1 = (ImageView)findViewById(R.id.nowymobiliario1);
        Picasso.with(this).load(urlnowymobiliario1).into(nowymobiliario1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nowymobiliario1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nowymobiliario1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnowymobiliario1 = (TextView)findViewById(R.id.txtnowymobiliario1);
        final String stconsulta = txtnowymobiliario1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nowymobiliario1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranowymobiliario1 = (Button)findViewById(R.id.btncompranowymobiliario1);
        btncompranowymobiliario1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranowymobiliario1 = new Intent(nowymobiliario1.this,webview.class);
                btncompranowymobiliario1.putExtra("string", urlcombo);
                startActivity(btncompranowymobiliario1);
            }
        });

    }
}
