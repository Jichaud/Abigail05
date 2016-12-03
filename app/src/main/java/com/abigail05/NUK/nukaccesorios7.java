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

public class nukaccesorios7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesorios7;
    Button btnconsulta;
    TextView txtnukaccesorios7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=152e52e34ab7c191c9660c81b1d1a05b";
    ImageView nukaccesorios7;
    String urlnukaccesorios7 = "https://lh3.googleusercontent.com/x7TkQFzUpgnzUPLmx009lzk55gIMWRZWBW-jLfb4lyLvofMLNz3VFt_I6VFfoYeWXanQtIcQpUnDUkVka-TBMQVBle95uf9yqBlNqTD9etg_G9kaUIKq3WkDVJnhfuTDFApQb0oYVdKWeAovoiiDr8AX3SprdlPdPBhnTqSScGAYzH0WXrrOdfZHCjeByBIEQDu4U0-4imaBqvbgHgjhuS7XQJkWmknGWUn_SzUTHneLlWGUxMbVUdJ2TkKKFlDTWVnKrCYW35BkCeTBB6KPZQZWWjStdhxjsvDWDGRNXQD5DEDJnQQs1jzP-Njq1b90CCGw0LcJXvmFteX3xMG54E2XmRSBjvajgbrxJ0LOcxshY5n8ZWGg2yHamD1smQ1-A5vXtvhrtzthC48kJcNnGnisRXEIoYsO60VVO8lh2VFDKHG05-aZ1RLmmBikI0fkFoEr-siH28cZtFuxpPcyNEeg80reEAKpmbGIaWd2NGKFINEix5N1on214Ia9pZVSuhpIdtfjx-pz6weaWr9RoSApyz6tAUgVJzztuDDqEduLbLhulUIfwn5ARSSQFG-VFVxRzGbGubZEz69bhVi2JnbP21H2kSgBFgY-olwdD-v6LIkLKg=w329-h365-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios7);

        nukaccesorios7 = (ImageView)findViewById(R.id.nukaccesorios7);
        Picasso.with(this).load(urlnukaccesorios7).into(nukaccesorios7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesorios7 = (TextView)findViewById(R.id.txtnukaccesorios7);
        final String stconsulta = txtnukaccesorios7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesorios7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesorios7 = (Button)findViewById(R.id.btncompranukaccesorios7);
        btncompranukaccesorios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesorios7 = new Intent(nukaccesorios7.this,webview.class);
                btncompranukaccesorios7.putExtra("string", urlcombo);
                startActivity(btncompranukaccesorios7);
            }
        });

    }
}
