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

public class mibescatres2 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres2;
    Button btnconsulta;
    TextView txtmibescatres2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=e82c9245bcb4cb22ebe293a7aec29015#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres2;
    String urlmibescatres2 = "https://lh3.googleusercontent.com/H8YWXoMDcufm-Mv2FVRcE2jShsxHXfU2FhdLPz-4LDShp5k4EQWXzfarNrV6qksIfex1sOF9xHDjDb4uzJhSYpl38gK-gQzVvOBPCf3eliAY60nPTncnpWv13lIi2n_D_6uUL2fwWl_ECxV0YEXv9FlwYuUL3IjURQt6PmCb0NIT4fWt1dBXbmEFmW77a7v7hkQBXp2AQc2ywhV3d3AH9rn0wfYYoOMOQpfYSVEHhBGGk_FYYecCMrY5hRhGWp0-JfMYp4_GueuOAw8YaexSYvlV0eqWyM8xKjwBHGwF9F4OeYCoepkn8Dqf-YjbDaafXCMsfENUjAjB27JJ68zQ-4qBdppp00SX09VDGdvBAYpn3JYMMBrS3UpukPm8DjFcpFJ_AuFqU1UVS1scA5jC8iaudiBOWn0QtDlAtIhM7usuBuGQjVJBlahCnGKFmOhnRo0yCbl5A0YVYiEmceTOrc3rEFzkp6qhcckmQfB50iIe1Xo4PFcjd5X7AALGcYbBf0uET0iTDGzkjLTIXf_mSrBN6dgcesBrVkEHaPu_BIHV_8u_jTi-iANOU4COC8P8Fw4pCrMzeQhfBoIdB8hw_G22VSfDy6pqei7KCJJlyu8UVh5Kgyjnt_O1AjXvb3Rqk5-1K5w0PUg2Usjzmsig-TlFSrgAwKyZr1n1ejWPBDw=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres2);

        mibescatres2 = (ImageView)findViewById(R.id.mibescatres2);
        Picasso.with(this).load(urlmibescatres2).into(mibescatres2);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres2.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres2 = (TextView)findViewById(R.id.txtmibescatres2);
        final String stconsulta = txtmibescatres2.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres2.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres2 = (Button)findViewById(R.id.btncompramibescatres2);
        btncompramibescatres2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres2 = new Intent(mibescatres2.this,webview.class);
                btncompramibescatres2.putExtra("string", urlcombo);
                startActivity(btncompramibescatres2);
            }
        });

    }
}
