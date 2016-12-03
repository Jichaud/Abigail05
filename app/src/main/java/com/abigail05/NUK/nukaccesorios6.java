package com.abigail05.NUK;

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

public class nukaccesorios6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesorios6;
    Button btnconsulta;
    TextView txtnukaccesorios6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=6d93e726b1843b2b390197dc8011e650";
    ImageView nukaccesorios6;
    String urlnukaccesorios6 = "https://lh3.googleusercontent.com/x7TkQFzUpgnzUPLmx009lzk55gIMWRZWBW-jLfb4lyLvofMLNz3VFt_I6VFfoYeWXanQtIcQpUnDUkVka-TBMQVBle95uf9yqBlNqTD9etg_G9kaUIKq3WkDVJnhfuTDFApQb0oYVdKWeAovoiiDr8AX3SprdlPdPBhnTqSScGAYzH0WXrrOdfZHCjeByBIEQDu4U0-4imaBqvbgHgjhuS7XQJkWmknGWUn_SzUTHneLlWGUxMbVUdJ2TkKKFlDTWVnKrCYW35BkCeTBB6KPZQZWWjStdhxjsvDWDGRNXQD5DEDJnQQs1jzP-Njq1b90CCGw0LcJXvmFteX3xMG54E2XmRSBjvajgbrxJ0LOcxshY5n8ZWGg2yHamD1smQ1-A5vXtvhrtzthC48kJcNnGnisRXEIoYsO60VVO8lh2VFDKHG05-aZ1RLmmBikI0fkFoEr-siH28cZtFuxpPcyNEeg80reEAKpmbGIaWd2NGKFINEix5N1on214Ia9pZVSuhpIdtfjx-pz6weaWr9RoSApyz6tAUgVJzztuDDqEduLbLhulUIfwn5ARSSQFG-VFVxRzGbGubZEz69bhVi2JnbP21H2kSgBFgY-olwdD-v6LIkLKg=w329-h365-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios6);

        nukaccesorios6 = (ImageView)findViewById(R.id.nukaccesorios6);
        Picasso.with(this).load(urlnukaccesorios6).into(nukaccesorios6);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesorios6 = (TextView)findViewById(R.id.txtnukaccesorios6);
        final String stconsulta = txtnukaccesorios6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesorios6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesorios6 = (Button)findViewById(R.id.btncompranukaccesorios6);
        btncompranukaccesorios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesorios6 = new Intent(nukaccesorios6.this,webview.class);
                btncompranukaccesorios6.putExtra("string", urlcombo);
                startActivity(btncompranukaccesorios6);
            }
        });

    }
}
