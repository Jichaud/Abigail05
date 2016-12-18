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

public class chiccoduotrio4 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccoduotrio4;
    Button btnconsulta;
    TextView txtchiccoduotrio4;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=faeb1b3afa9d330cbedc7200a8a47e04";
    ImageView chiccoduotrio4;
    String urlchiccoduotrio4 = "https://lh3.googleusercontent.com/7C5p46FPe0UL5jV0sb5wVPWA8wg1UB_wBpXBFZwYDEijYUDNAertxkzYMAPo08Rkku5Y1KlMbIsPyftIb_TTa7liCPMHzlSLveGNocjVCtROKKP85QqpMspEGsEZagLlRG9XgCFGpBeKDvNMEBc4MSjeDjt6gmPKYc2g_2j_A6AZ44a1o3s9ot1HFFXD3nekCK7Dbv2guo9pycwdaeNGMk5Yp-GdOCi1IqgIbsmyAmwvOAu3uYfgUuzQ1gTZh0jh_y-D1x6Zr4Tu5MB5zXscCJzZAbQw3yjv3rDiu35ccxnmzM-xj7hoy4PWrBUfFUep1FhdLS5N--NQzm2g842eJfZ6nbI-OmXX8ilkPJ2vTT4bqhlgUMw0arx609-lu497j3xfqIwGtF9AmEvnsbi0YW9lizLh4nrwm0vXuvWhkcjU9goRDz7cyeSTymagCOPBfMjHryocJeTuMKvJY2uFjTD9J28q8HUhnweGDBmKze4-q-d_Sl3Z7nn2s4q7r-NcP5b-FoeHxeRAy-bCaK-i-rME9QAhfQWsBxfafDk115OunQFXCNB6D0L_kJsjHbzTnlHyCv1zweLgiD6l8c-YmoQfmAHV50HwgTlK222-luP5r1fHkQc4lV1HMOMqZa2wqYMdB8UcbxZlx6ARZ7rJvLUrRaP4b4sMjeV_DAoRSiM=s726-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccoduotrio4);

        chiccoduotrio4 = (ImageView)findViewById(R.id.chiccoduotrio4);
        Picasso.with(this).load(urlchiccoduotrio4).into(chiccoduotrio4);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccoduotrio4.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccoduotrio4.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccoduotrio4 = (TextView)findViewById(R.id.txtchiccoduotrio4);
        final String stconsulta = txtchiccoduotrio4.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccoduotrio4.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccoduotrio4 = (Button)findViewById(R.id.btncomprachiccoduotrio4);
        btncomprachiccoduotrio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccoduotrio4 = new Intent(chiccoduotrio4.this,webview.class);
                btncomprachiccoduotrio4.putExtra("string", urlcombo);
                startActivity(btncomprachiccoduotrio4);
            }
        });

    }
}
