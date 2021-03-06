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

public class nukaccesorios8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranukaccesorios8;
    Button btnconsulta;
    TextView txtnukaccesorios8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=a919c107cd9a69d009fb8f327246bad8";
    ImageView nukaccesorios8;
    String urlnukaccesorios8 = "https://lh3.googleusercontent.com/xNekdBvjQNEfALLYlrA1T4qKyvIQZNaSzoOn9hth3y_71wWR4_abHqcmI3VtRwPrGVrZiBgNT9B5H43waIKwabFFbh74Gj6xLVPKfcRSa7V0v9j4dICSiDM5VSxeeBo1dg0O4FunEPa_iC8c1oq9C2cr4xcyPcHKZ7NxR6_259SMS-QR_xv4eSo9gtLwurziUFePBGckV8siiwruuAwM6YlbBsXrsvG0Dv6MMKbxgldZvwkVsctNJauj3t_WTAim7uPUsh69NmZsalcwiP3nQPKBS0EyWvguD65pUqs5_19emgykYe4gdT8SIYKGb4vaCwF4zDETJuB76CJW0zjdihHfAfvaXw3-hTbx3fqwxJpHVf5sAgKTUe7S2kF2oeEPmnXPZsxG_kejZRDEW4lmLO1qyZjaBxQZZ0q-CnYGfHoAp-Yg-GSQgWkRQLaCWYeyZeYDNovrExFrTmvvP1ROo4eU88VkE_Mx-VbUJjKZ73_WOoFiDZpojSKTdYoldP_swvBjK_cl9DI0oSNKb3ttqGPjaaoDJ3TOawmVzlk8k2p_p8geieLgDOU1QC32JPXT8TWPyR8-hOm5IAnTONQHa233_5f1HCZhX9Xwie86RjCH6JyCuA=w304-h365-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nukaccesorios8);

        nukaccesorios8 = (ImageView)findViewById(R.id.nukaccesorios8);
        Picasso.with(this).load(urlnukaccesorios8).into(nukaccesorios8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nukaccesorios8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nukaccesorios8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnukaccesorios8 = (TextView)findViewById(R.id.txtnukaccesorios8);
        final String stconsulta = txtnukaccesorios8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nukaccesorios8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranukaccesorios8 = (Button)findViewById(R.id.btncompranukaccesorios8);
        btncompranukaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranukaccesorios8 = new Intent(nukaccesorios8.this,webview.class);
                btncompranukaccesorios8.putExtra("string", urlcombo);
                startActivity(btncompranukaccesorios8);
            }
        });

    }
}
