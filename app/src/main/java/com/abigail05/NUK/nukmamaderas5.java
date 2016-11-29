package com.abigail05.NUK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventclassic5;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class nukmamaderas5 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukmamaderas5;
    Button btnconsulta;
    TextView txtnukmamaderas5;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=bd1ffa973914bfe7041bb0a01cc3aa24";
    ImageView nukmamaderas5;
    String urlnukmamaderas5 = "https://lh3.googleusercontent.com/O-YHKrzOnuQTMJZe94rYCODbjBQCIdel9Jz-Vf73yBWaWtZfYLN8e6k1ZtQ3WEaP36ibbr5QJcRquWqr8l7cqCzWgrVeBfeDNb8ZDHJ6VcGNETREd-RCu_H896ifnA-pWSzOw8sG4Islq-wwor--yYxLn-iAod5pB9wj3c28xEEoGvzPzAezX0tbiCEcqfymLjOqjwsQOdl4DJYRp0pru__5DlX-sAsCT43IGCkiSggoloQNXWFNjxK328DQN965eK4EGE_E0lXSduz6YACIkxA5YLx8fpv2g9fnxC6wuZfKHdTVrPvSyDP6KeYlVXk4oAFon5T7K_qakbiAx1ASJOpIdkXIYyGqBic4-wEdzHuZ_CaXFO-UcyVJlxlh4IeRYeQcJy9p7CWS5W_FFSWyyPxhf13b3NRLOkCTOnnh3x7LL3evJHUOufrEBI8it4Ct-Wr5eELMaiZNV10_HCvrCXt3BXdDPL4yPJLYVg3mu3Kx3jXUv7E48drYZcAkk2EqpF8g-deir92LR1JgC84lBqanTwImNCLGTsztcJqkRIB4q1LHremqOYhi3DRHArHIYm_V5-6kqpzMKuaJ9GI2xgKwTCxhcVKawhSKM5GR0y5i-4D6pg=w191-h340-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukmamaderas5);

        nukmamaderas5 = (ImageView)findViewById(R.id.nukmamaderas5);
        Picasso.with(this).load(urlnukmamaderas5).into(nukmamaderas5);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukmamaderas5.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukmamaderas5.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukmamaderas5 = (TextView)findViewById(R.id.txtnukmamaderas5);
        final String stconsulta = txtnukmamaderas5.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukmamaderas5.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukmamaderas5 = (Button)findViewById(R.id.btncompranukmamaderas5);
        btncompranukmamaderas5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukmamaderas5 = new Intent(nukmamaderas5.this,webview.class);
                btncompranukmamaderas5.putExtra("string", urlcombo);
                startActivity(btncompranukmamaderas5);
            }
        });

    }
}
