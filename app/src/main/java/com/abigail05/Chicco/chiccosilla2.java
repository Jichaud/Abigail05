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

public class chiccosilla2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccosilla2;
    Button btnconsulta;
    TextView txtchiccosilla2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=665704c02c1c8de8f4bc63449bc514eb";
    ImageView chiccosilla2;
    String urlchiccosilla2 = "https://lh3.googleusercontent.com/2QZ44SS2xHspmqhNfGY7q56SVoLk0hK4zWeKsEb-txlVnRp_og3obE_yxoOMFf0PQDtCm70yENhg53jSeU9dndl59Ss8HaXuFXU8zN3F6OiSOLx6S8_UY_TDu0DNJ5TIMEt6Jg0vlElTaTIGcrNEmQFNhWmwYoMVxTzgrGXi2VhKJ1RqyiUNJTZGeaiW2zwpfoQ8CnG3-EjOEwSBbHI7GBKFS62AEVchIrB157sZMWSB8T_Y8AXWTP5hBC2yYgL1enAiLtvpvvep8OuD7iKqNBO9wuZ81BIoUo7QZSqAqJyI2U0GTGtQGslwJIEkv1GunBDWQkr5ODys907RwrJcT1c2Kw9bF3m0RXO2pmgcezJ8T4SiiJtnpfL7cWHJsQdV6wz0cBuTv5xRT2aDNWizOusF66cqu1ga7BCF-ehTq660bXaJlLl4kQYXlFvgtXmCaILr0T98YjS7O4-pkYhaJiN9wOsfRxNZTFVSL6JKcBJPDZk3sNUKvPFkKWWwN9dbv5gYci-1I2somkTgRf09H-xR5uNmbc-PXsITZ8Xwu9ZtnsirybcAk-ORQsBQWahVpVdUpLRAuQiZXmpr_B_aaJvKe7j_4hBKnSTL6sX57_1pVTsssw=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccosilla2);

        chiccosilla2 = (ImageView)findViewById(R.id.chiccosilla2);
        Picasso.with(this).load(urlchiccosilla2).into(chiccosilla2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccosilla2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccosilla2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccosilla2 = (TextView)findViewById(R.id.txtchiccosilla2);
        final String stconsulta = txtchiccosilla2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccosilla2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccosilla2 = (Button)findViewById(R.id.btncomprachiccosilla2);
        btncomprachiccosilla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccosilla2 = new Intent(chiccosilla2.this,webview.class);
                btncomprachiccosilla2.putExtra("string", urlcombo);
                startActivity(btncomprachiccosilla2);
            }
        });

    }
}
