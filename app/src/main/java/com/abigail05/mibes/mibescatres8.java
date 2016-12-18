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

public class mibescatres8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompramibescatres8;
    Button btnconsulta;
    TextView txtmibescatres8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=1266dc5e3187b4b8af7975f693feb129#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView mibescatres8;
    String urlmibescatres8 = "https://lh3.googleusercontent.com/4yap3tDF4uJp87DD8yZMoF5_tF4Iy4N0TbUM2WWeudNRVtamWpqFthuxBZT93WHDqJmQJonW2OSsEYrOIl33h21FJPYROjsREUneKinvEsjYsdy5-owNYxvQBVM5DkY_vFnPaFsoLLe5svruY9OvX2YXcnmE5RgdCtYulI73UoYYSVc8hkZtWLu8F0E9lI3mxBYBH97mGIJ7RO6KyrLqRqsyZPLH3s5ll1c4EuhSSq2gGCuHJX7NGmDILKY7Pt__yCXeGoLpj4FgCSCUt4ZRUpp0Kv0ass59keLbDrybj6uh3eedZ1bPjRPVcIjQ0Jqog4WxaZ9u7hGvxlABI6nv92EZ_V07GhnpQeCSS0IouL2ZxrX8rQkIFHLGbalywoJuCuXPY_Poyy5kh6lr-PcuogjW0dpxzCWHEJSCnj-Py3z0rynopnA0OT3fepXL4wxI_0VQv-YLD6XS04LZP6fXWw6TVvJeFPQguUJjDjhtr12adx0dPtV4NzDCWyBMSdD7HFPi9ZggtxUlxOuAtH2AZuBLAePtYedypE9xy4RqCAdc7Zi8SY27L-1m0RBiEVazgEikFYZFBAdH-V3lyiI4uQ0oLY3plz06dB3bVCRc_Ny3yUKQgMHs9kf11ttCwtYdLR_dnOm39VFUJ0WA3yI7h1nqtrHozlGQJImY4GtX7yI=w967-h725-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mibescatres8);

        mibescatres8 = (ImageView)findViewById(R.id.mibescatres8);
        Picasso.with(this).load(urlmibescatres8).into(mibescatres8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(mibescatres8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(mibescatres8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtmibescatres8 = (TextView)findViewById(R.id.txtmibescatres8);
        final String stconsulta = txtmibescatres8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(mibescatres8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompramibescatres8 = (Button)findViewById(R.id.btncompramibescatres8);
        btncompramibescatres8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompramibescatres8 = new Intent(mibescatres8.this,webview.class);
                btncompramibescatres8.putExtra("string", urlcombo);
                startActivity(btncompramibescatres8);
            }
        });

    }
}
