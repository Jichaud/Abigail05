package com.abigail05.Chicco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class chiccohigiene10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene10;
    Button btnconsulta;
    TextView txtchiccohigiene10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=95eaf2695872226cfa88a609f7ce481c#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccohigiene10;
    String urlchiccohigiene10 = "https://lh3.googleusercontent.com/O4naYXzC28s_0PaA7c2fDq3Seyp_Xgb0uIUJ1o6qtmMfH66eVJvpboicm1_ffnqN_LajjuqSyzJHFYqELvid4ruiXReGN0CIwoiE8Bj3XjAv01L0W4071z4yM45uExx5ZTY1BwAebFs7C45CRgxNtybeVcTNFq3F-F4rdiPuvdFNUjdAlDGRGcQRHKesIMI3DtcUKlDHDgdXLSw1vlxaltnk_BdOMfV_Yp5nq5oZq-2RoFtyXgskvLDZCy7v4_1xUltNMTjKn1fgq5-TzyTiiqc0k5PCHBX3w-noaHaN5-T8qWNfRZPidtPIgQLUjdas5HhhVQp0EoXpFGCpZNQBBV2gU9s6YHL8aNzBeNhjY4aoykHO8dUMpiS_nZHLgUbFX4QQfX7qCBhri5sykNzF1nFqsuk1H3DDtbPmKUwZaNxK5_jPey7vHEl5thI3vUUNHf0WJUp6n8Mn-e3chUTJRIZMRoHzqjnDxaUzrtr2qfi0KAhYQt6QdPI5R4NWW8uCrNNAc7ZtVEzqVij-mq8A9t5TxpuFzuvkPW1uR6rtJh0HLPuWPtqbnku4zXxexoCRywZw7amp5tQdafTkjw9_Sqe9DMrHbnSGDQZG6Wbtl0akxz00k3r5px4KEV5pcAY_Hfo9oZ9C4iDt4qHqt_UpduiqjyJALsmKvPCggBMQI48=s725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene10);

        chiccohigiene10 = (ImageView)findViewById(R.id.chiccohigiene10);
        Picasso.with(this).load(urlchiccohigiene10).into(chiccohigiene10);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene10 = (TextView)findViewById(R.id.txtchiccohigiene10);
        final String stconsulta = txtchiccohigiene10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene10 = (Button)findViewById(R.id.btncomprachiccohigiene10);
        btncomprachiccohigiene10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene10 = new Intent(chiccohigiene10.this,webview.class);
                btncomprachiccohigiene10.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene10);
            }
        });

    }
}
