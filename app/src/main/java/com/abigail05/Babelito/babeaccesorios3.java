package com.abigail05.Babelito;

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

public class babeaccesorios3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababeaccesorios3;
    Button btnconsulta;
    TextView txtbabeaccesorios3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=49514b0fc75de6793a49c165e72d3b40";
    ImageView babeaccesorios3;
    String urlbabeaccesorios3 = "https://lh3.googleusercontent.com/DFxbG88Omg7oxOxZpgDFkuU9NFLlCuv9-jzUJ9hr-ADoGKI36YnYOp8in4-3b2LIXJgR-ExHVAvA61PeE2ieIuF4_5Ttu6e3pQ3pGgUWfUJjZzo520cFWyTEe_enTmSmSuMaCJackT04ikAtYwkjf3ceF0kOwy9_KlPr5Ms-SeuViCFYMPWGVAiWKjgshJ1jUJ9RI1LTrfr6WPsbmm_Tu-twZTAprE73x3TOMBcVjxzlEqPSpArFj0-5iGjFu-FTPenpdnAO1409PdBslx_atfDLkpM0pED-ptR5tI4GUQdpBnN1OTUT7xusrQriR7uPU1BE-tGLCAPhgF4Cr7RMqWr875r2ug9djBl7VugmDtPg7scyi1XncF9QuaAwLvpes8857TqMZJJ8PZco3idRkNprVjd8jEfNgeGab_twQperJ0Pjkhfj1Q0rhUKkSYY-SWQ2DpVkmb6UMMk36tBfHxWISAgw2vUTQEDX1YHIMf3k-ysOl2Y0XQP9j_UNzBOlniyxSNrUvKc--EkgqpTGMYbnaUBXvia1aaF0kuKMb8Om9r_ots8ZZ9jQAytMAxDaZl1Vo5Bjiqvsxlcd2a9sflegs0U1MOAwtCVWQSrNvdVw12IgOg=w368-h364-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babeaccesorios3);

        babeaccesorios3 = (ImageView)findViewById(R.id.babeaccesorios3);
        Picasso.with(this).load(urlbabeaccesorios3).into(babeaccesorios3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babeaccesorios3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babeaccesorios3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabeaccesorios3 = (TextView)findViewById(R.id.txtbabeaccesorios3);
        final String stconsulta = txtbabeaccesorios3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babeaccesorios3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababeaccesorios3 = (Button)findViewById(R.id.btncomprababeaccesorios3);
        btncomprababeaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababeaccesorios3 = new Intent(babeaccesorios3.this,webview.class);
                btncomprababeaccesorios3.putExtra("string", urlcombo);
                startActivity(btncomprababeaccesorios3);
            }
        });

    }
}
