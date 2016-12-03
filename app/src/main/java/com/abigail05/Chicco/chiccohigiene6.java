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

public class chiccohigiene6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccohigiene6;
    Button btnconsulta;
    TextView txtchiccohigiene6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=97301b9aaa2ac095eec9c691e5016fc0";
    ImageView chiccohigiene6;
    String urlchiccohigiene6 = "https://lh3.googleusercontent.com/C_bStLWc7EXwhNC9ztQNVo60vAm3Pe9jcOWNGXGt5MVvb40c3jFCB92klxkfCIVQB6kz2qzgV1JTQjGSufd_S8grQiFLD6bSjZ-b0JsyjQglbx0Xiz-Y_s3r7vnWrFnaeXg3QeoQPGOVGHGYTND2MELHsy9lET5DUQHn1i6E7T3Jn_X1rKzqn-phQ7-LneZHs9T8MRsHjpB9_dGe9nlIvZLmJd-VrhS7rm0tzuvP8UFXJzS2r0E6skaNChVIJOh6HpmX_E67SkSosmFN2xKVUatVp9ux8SJU2L1GibW7JacFsfTBTJJANxEdvcOfGu_eSIIT-BTszN_ABUcWDsNqc5PDHl-g5NgwOrwP5sp3ztOxrFs6Y5jQTAlYxLyOWSK-CJcb9teSjN3luomXbAD4CyNAU96_oMOei9yBbwapH8G_OtvVY0ezXWFu_cp1qY7oTVjBfihaf2wx2YNIIRmECUxP-IIBF9P5geOIEJ_rRc-L6PFELzYw6X6dJoyjbPFIaC_beZHhBlmTVq0Qj-RQPqx9vdG1M-muxWR5plM7VySPsdR1pd3HTUQu0V4C1oyxkkyf8KhoQj68tc8cO8E4g6z38td6RPTkeyyFW0T47Ko7f_lWzA=s400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccohigiene6);

        chiccohigiene6 = (ImageView)findViewById(R.id.chiccohigiene6);
        Picasso.with(this).load(urlchiccohigiene6).into(chiccohigiene6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccohigiene6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccohigiene6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccohigiene6 = (TextView)findViewById(R.id.txtchiccohigiene6);
        final String stconsulta = txtchiccohigiene6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccohigiene6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccohigiene6 = (Button)findViewById(R.id.btncomprachiccohigiene6);
        btncomprachiccohigiene6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccohigiene6 = new Intent(chiccohigiene6.this,webview.class);
                btncomprachiccohigiene6.putExtra("string", urlcombo);
                startActivity(btncomprachiccohigiene6);
            }
        });

    }
}
