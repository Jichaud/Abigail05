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

public class nukaccesoriosm1 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesoriosm1;
    Button btnconsulta;
    TextView txtnukaccesoriosm1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cfe13bb92cca9cb7db35f928eec0ff09";
    ImageView nukaccesoriosm1;
    String urlnukaccesoriosm1 = "https://lh3.googleusercontent.com/wOF3VCqvDgKGL7230MKgLFd_WTatC0HYldbkJD7dtoNlES4DSGpuCysMwWLHJ32GvEJi18yPOUH56nMDTFfYfqlyi_WoI7OjEf8Oe6cwDEfnPCPLIR_sEbUOqUZcIZGqVPCfGMUZmmwynFLSMgVFBRe4GjCBnsMbdCspeR7b14d8rzYS7m_weiFNGyW_d3RU0EzUTBE_OOoCLsx6vwkOM2me0aAg0L-pXL2rxsn7wOMBimj2Ov4lmHAJoZ5mJ07xnz48h7XiSuAVFRNrb0vVpqobKfeadTJRn6uKumEujNtF0ubJ_i4TJ11MmUSOsrijUTD60o1BQU7ItDOKm2srN6ZP0x1LRV2eca4Jm3pn7Ynd47UUZfG34ihraTQDmsFVQpjlEDPvc0QxjPRHYXxfPvxyigNhVwlBCFK4Y_cdsdJPleGfrbQkCNden-pRsOd1EFQg_oGZLqhe8-l_6EBkff0_lRlAE5vikzBfTwl0CJYhqT7zxvyjkfNHe8i0vQfdKdbNGrSBRvNMJtKUiilRGnX4wQ1Gsb5XZX39jZ93uN0WoKNa8Ow2z_aMl3EAxeN0gbq0POIMVisdMcWLkKaVX92WJ1XByxJChI-2oNfqXheGZSd_TQ=w302-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesoriosm1);

        nukaccesoriosm1 = (ImageView)findViewById(R.id.nukaccesoriosm1);
        Picasso.with(this).load(urlnukaccesoriosm1).into(nukaccesoriosm1);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesoriosm1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesoriosm1.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesoriosm1 = (TextView)findViewById(R.id.txtnukaccesoriosm1);
        final String stconsulta = txtnukaccesoriosm1.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesoriosm1.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesoriosm1 = (Button)findViewById(R.id.btncompranukaccesoriosm1);
        btncompranukaccesoriosm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesoriosm1 = new Intent(nukaccesoriosm1.this,webview.class);
                btncompranukaccesoriosm1.putExtra("string", urlcombo);
                startActivity(btncompranukaccesoriosm1);
            }
        });

    }
}
