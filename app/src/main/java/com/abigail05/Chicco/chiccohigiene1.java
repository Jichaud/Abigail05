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

public class chiccohigiene1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene1;
    Button btnconsulta;
    TextView txtchiccohigiene1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b54ded66a635d87b4eb63d40a195b544";
    ImageView chiccohigiene1;
    String urlchiccohigiene1 = "https://lh3.googleusercontent.com/UXbzABgDZOupwdj3TwkLuEI_3zYK7pbRwGd2grAw4fEXVp5WIrqoFwI15-3GOHl4EUQOu7f0pIHSx8LC1H3I0KkaDUIsblw9a29GB14u8sK3URhzXB4W-jjbSxyIh-HEfRmY0ZiBFQXXukAZ0QG8uPWLL0Gmeqz6uYSz6iWHSs2ZaOfi7pMUSUHlPc4MZ9Q7inY-KXMszzXo3aJP9hWSFeslXNYpJ6wBQkmYbvijkMCUqJ5iMj8KuYBaj2mdnAahjZRAwVewZ89CVkz1wbEhbP7j8Oeg2s9hZ-ML6YEFLce5oCzdSTsLTmPTleEJR1vBSemYARUGEGJQZFuFrxktA0IEYYRngIDG1SI3S9RWRi8RNEy0kEJLW6df1HUMaRKupZi_R80pTjbDAThe5rgR4c8y-4xtUqC9wa2G_IMlkj0SVsNzNVDHhR2oBNtjZ5lTppsDyIEKhEJLiEZIjPMDj3nJD4kT6Mr3zq3JmFoVLrpQRXctX5JGKOm3Os4_bJmheCkgNwQqbabrcL_-SA2dCa9ZfxSyz4tXHoEe4l0_6ppvDye0CjykuUY8vy8ggh2W6tp5rguPc0_0K6fSOG2CXUvaHC_zqPJcXH8nDtvj8BiudaaAdQ=w452-h450-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene1);

        chiccohigiene1 = (ImageView)findViewById(R.id.chiccohigiene1);
        Picasso.with(this).load(urlchiccohigiene1).into(chiccohigiene1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene1 = (TextView)findViewById(R.id.txtchiccohigiene1);
        final String stconsulta = txtchiccohigiene1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene1 = (Button)findViewById(R.id.btncomprachiccohigiene1);
        btncomprachiccohigiene1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene1 = new Intent(chiccohigiene1.this,webview.class);
                btncomprachiccohigiene1.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene1);
            }
        });

    }
}
