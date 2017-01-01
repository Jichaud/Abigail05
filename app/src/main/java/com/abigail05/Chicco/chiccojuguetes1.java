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

public class chiccojuguetes1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccojuguetes1;
    Button btnconsulta;
    TextView txtchiccojuguetes1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f11f905a81410a416d3239aaef4ebb06#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView chiccojuguetes1;
    String urlchiccojuguetes1 = "https://lh3.googleusercontent.com/BO_bcxxTZW_RPK4qKwmvWnYKxUkCAC4X6zXR_oDFw3cD5KaoGdeEsdmxJOtMPZUDlEL9AOQkAWwzP2kcuiGnpG5JSurinXL7nuregOuDybplwNCZbmmKsGQkhKVwvm_XG1JlIkOZM68pCg-xPqClWMSCGCZQGpvPKPUVKRR7WiClGYnBp_QoF-6AQe-l0H60peY1KO-MCN5QUvxfSfA8GymvIHciws47G3YMQ_CvNret66FZfkPsmOFkQjsQJ4aqR4LcmIPQHnHvOl1qYIu7z93axJAgtbLxT7LtdjUF7qdAbzCvcMsF_3HDkHL3rclVTPsA3fFYMKGhQ0aYBy4Ywo1Zw6ByUxQm0gYg6UrixRmQb57p2QHpHFx_Z5K3RFJrX-NuP8HVwuKrGtorCCZK6dP8FX-NGSBTyWPC1WUOrEzYyJw_rYzAZqF6I5zr8XHtDgR06Rm3feKHuT3B4G5263nUkfH3TnRXB2lnwAa-Imb7gBIK35paMO_lKKZhm7Cy0XKv8Pahuw3EN3MBX7BFmeYBaRD0SeT56WYY6AIRu5KhQ3dZL_x_ycm3ZyK_QmZvHsNvWGtgBRytfFAwnyVRMJmrt25AdiguoJgX-JLQeTLVWzWTtTRCq_SrdX6ag4m_uVabZDu4Nixhq_S1oN9AQqdJHyqm5NYNTVGCgTW1v94=w452-h451-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccojuguetes1);

        chiccojuguetes1 = (ImageView)findViewById(R.id.chiccojuguetes1);
        Picasso.with(this).load(urlchiccojuguetes1).into(chiccojuguetes1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccojuguetes1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccojuguetes1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccojuguetes1 = (TextView)findViewById(R.id.txtchiccojuguetes1);
        final String stconsulta = txtchiccojuguetes1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccojuguetes1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccojuguetes1 = (Button)findViewById(R.id.btncomprachiccojuguetes1);
        btncomprachiccojuguetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccojuguetes1 = new Intent(chiccojuguetes1.this,webview.class);
                btncomprachiccojuguetes1.putExtra("string", urlcombo);
                startActivity(btncomprachiccojuguetes1);
            }
        });

    }
}
