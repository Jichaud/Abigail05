package com.abigail05.Nuby;

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

public class nubyaccesorios8 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios8;
    Button btnconsulta;
    TextView txtnubyaccesorios8;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=7d71006b25a088eec5c8efa57005351b";
    ImageView nubyaccesorios8;
    String urlnubyaccesorios8 = "https://lh3.googleusercontent.com/vjK-YwV9-GTSM4BHNeqafBSjpJJ5-ek9okowQoPBKmS-03Y0B4OrFmhK6f9iw38dYmDHNkQeCUePG-5-dXFCdyNkOzRZ795qEDEBafw_kpASO7VrL6w343NyVVAsUUmcSoNfqbaVxm1mNUCAndFAcOU8sFoy_QIwNrJ6mUl7hzqHb6h8WWGNkF1dPd51o4UcLmMju_kd5RZ_EzVBZmZ3X3nB4WS6xF4B6cJF2J4mdeGj9y9epJb2wTL2X17qvkvf32xov5t1Sdxs-YU7b9UQgOxMsBS1NJ4JKu7jJHGKc4AxV7SsLDShAls3QvI9D3f7FbBGTnHZGZgqfIrezkso203G29TGAlcYYUJ5rTpscI8VMZpPpWUJ1TOhQ9XBH1lE5KozXOh9zgYihT21W4oFia7HB4GagyQ20gMTUevKMf8e1FLaSUnETLMuaWQugbK8yr39XWPAySxTUoBq8ml6JGDQVaLjX7nupWGcMefocmCFoadWcSyrmOClLhk3dTJ2W0vKU8E0xWy8VBfhky8LuQyq5zud8ij7NjJgFQ7NMo_Qq97CuAaUZnuljxWpAEGxVTNoJE_Dc17jlDW43VcQfyDgXkzKbeJM6Spqg-wATnpEHLB2MA=w500-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios8);

        nubyaccesorios8 = (ImageView)findViewById(R.id.nubyaccesorios8);
        Picasso.with(this).load(urlnubyaccesorios8).into(nubyaccesorios8);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios8.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios8.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios8 = (TextView)findViewById(R.id.txtnubyaccesorios8);
        final String stconsulta = txtnubyaccesorios8.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios8.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios8 = (Button)findViewById(R.id.btncompranubyaccesorios8);
        btncompranubyaccesorios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios8 = new Intent(nubyaccesorios8.this,webview.class);
                btncompranubyaccesorios8.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios8);
            }
        });

    }
}
