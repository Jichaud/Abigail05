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

public class chiccojuguetes15 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes15;
    Button btnconsulta;
    TextView txtchiccojuguetes15;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=d80acfc820299912861725f50e55cfcb#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes15;
    String urlchiccojuguetes15 = "https://lh3.googleusercontent.com/fLZbBC9FfY9G51j9Zccf2TitWuJbi25gHU6skQ9A0tnVKwCLiwJKYSw5M7-KbKOeO9L91bNqF1jc53Etlg_IvyCoZA9OOt4G0qgyHkIROmY2LpUBJbkeXAF1_ZwgFtNKZGbEQRrhpU3rBF06hcLgdFMC38kR9DOI8pQxjs_OAZcCe672ihbjnZ0XpcLV0ZuKpT41e9QPKeKyrRnFu7_QRaQ-8s9eKUXd0VwqBekEeKSxIkToPSPafNt1I3n_e1BKzvPIE6TfWpGdHqLXJdGBPUKRCMyj4i1iFYo7MBvMou9BWrHmUmxDewHjHB-bJ23lMzfHL4G4l9fmej6Ze0Xw99sQCn-u1QxS4GNaVCiniSEXkDrmY0iC2Ka4AeYYEsaIz9_ZUnSOkhGEl6IcHiaUaMLcE-E38DQuJBr1dv2URy3JkIvdZ1i5qhUbuUVVVfSfKCo7l3oZfun4gsIos3Xr5KW6fYEhVn1P_hrwuoXh2bVhSn7q-bJoWH3uh7YoXVNZ0P2cDC5dFLUuC-vefz21E2nKW3_IiLfPOpa6vB4p3vmEAtODOgUm5KVics_QnOQIOq4Wkpw9ornM5Pn6hQOJ1_OjaI_lmg3nZ0vflL85gLKGgDTW3puQK9zr3FcX1PeIkNx9yvCZvd4f7cZKsJcATL_Ougr7hCVIOJ13he0U2QY=w396-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes15);

        chiccojuguetes15 = (ImageView)findViewById(R.id.chiccojuguetes15);
        Picasso.with(this).load(urlchiccojuguetes15).into(chiccojuguetes15);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes15.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes15.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes15 = (TextView)findViewById(R.id.txtchiccojuguetes15);
        final String stconsulta = txtchiccojuguetes15.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes15.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes15 = (Button)findViewById(R.id.btncomprachiccojuguetes15);
        btncomprachiccojuguetes15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes15 = new Intent(chiccojuguetes15.this,webview.class);
                btncomprachiccojuguetes15.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes15);
            }
        });

    }
}
