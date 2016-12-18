package com.abigail05.mibes;

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

public class mibescatres7 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres7;
    Button btnconsulta;
    TextView txtmibescatres7;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8bd801d78b4a57f6137e70d9f52ad545#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres7;
    String urlmibescatres7 = "https://lh3.googleusercontent.com/zirgXK8F9B1jm15R2HccBVw8EEoeqxEg9NIvUR2FjI_cu4amSYrUosZblZ2mmrwbopFiH7j2hCAw9MJCNba939iyf4vuUIdrqkIYOVjcI-5xEkc0NynDV-761TRvLksPzYmofVODmy7uVvP1BLXj5kLp7A_zadhdZMwFD0C-JcKfUeukJSF7_YeKeZQ7Zc9Z0SmuROWhHiyacdT8fwSKaGYWfu2fwBa6T-hn0Off_IuIRdF7W5SWbRspwYhRq6Px1GdDst540dekZW3nOounN2hPfq7wf3bfGv1Hj9OC2AsehypdNdrAGfDtnt5VP_CJIJwyd1Kbq5cRMOm70M24IOetuPFB2vJ8zD04lGAUiGQMCWxRsM-Q3aOnAUM4DcC9a_Bm5eUx1S86QGyDXuU8d3qVNori_G1oUg4rJDlnh29lkbzvW377FqlyELH_fbX1G3leo6Azu31KDHe3tKFymT7RBfT2u6DPwzlCOrjqc8OOcVups90dV333QCmnmIconMGszd82f91l9WV24FCunDcqJS4GRL2SlhtURt1-vIQ5blaJyugH5Ac5_Y3pKmUfy-y9ry9bGzYYJCiKVqPRgDnN0JfJTrOKaZkIX1fOQPhjHP5An_leT5jd7UXXqFgGoUs0ZPt8SWoBnD4XZILDoxhrzj8ZBY6INkFKcTA0xlA=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres7);

        mibescatres7 = (ImageView)findViewById(R.id.mibescatres7);
        Picasso.with(this).load(urlmibescatres7).into(mibescatres7);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres7.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres7.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres7 = (TextView)findViewById(R.id.txtmibescatres7);
        final String stconsulta = txtmibescatres7.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres7.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres7 = (Button)findViewById(R.id.btncompramibescatres7);
        btncompramibescatres7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres7 = new Intent(mibescatres7.this,webview.class);
                btncompramibescatres7.putExtra("string", urlcombo);
                startActivity(btncompramibescatres7);
            }
        });

    }
}
