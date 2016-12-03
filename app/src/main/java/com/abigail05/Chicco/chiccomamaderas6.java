package com.abigail05.Chicco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.abigail05.Avent.aventaccesorios6;
import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.contacto;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class chiccomamaderas6 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprachiccomamaderas6;
    Button btnconsulta;
    TextView txtchiccomamaderas6;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=962569427313ba6d0d9902effbc4a31c";
    ImageView chiccomamaderas6;
    String urlchiccomamaderas6 = "https://lh3.googleusercontent.com/TfMAzh6QmbVGFwiw9gEbpyrB6w0d1vRUg4Tq8WabS0TYliiXEclnzeBSh6JKjpVTgX-oGrY_ov4LeYZgW51c9uozyIOPKAJD4YBqbCSp7fnqLlBB8Xty7yc4F5D86a4jjyGvlmyQmmTcLwEH7t3ykB57cXWkrn-IoJQy-Pig-nYrfj4Gn3UgMNu4fc7LsgIR9c4x37XyrAHtJEq5Zopf_1GQOsl2fVS4gXQXMafifPkHN1SnZBVOxM4qOQFYgTU14CrRyeil447uvWx_tPkZSYphof6CXV1g121kgAhNlwv3x5WpsCqwElN9HRjJuGhGahzkiPe-y_c9Kd5OC6Z0AMx5wbbl5oiiDBi3W841tn4Wlmq8qtcHenVlRKZ39ReH511q3EZ3aizyICscwyXWqwFtJKGVx2HtU8RNy4prJTWTtzrzegV5tgkz8L9StYjv14Yq_i9-sf1OftenIbb1qnA0YpiKkKYP9gotFRrgZ_MEQRoT4MWLkE_1_eCMceQvxuzUIhO1OwNBit0J5iYdk-3WgivdWDzYkk8RD-J0F2QbxYlFXTreLAL6-B7MEWm0P3BvnRQ3S_9ff4fjyglB9Whgu4oX7tg9Dlm3LIlc8WN5-lwlpw=w247-h400-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiccomamaderas6);

        chiccomamaderas6 = (ImageView)findViewById(R.id.chiccomamaderas6);
        Picasso.with(this).load(urlchiccomamaderas6).into(chiccomamaderas6);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(chiccomamaderas6.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(chiccomamaderas6.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtchiccomamaderas6 = (TextView)findViewById(R.id.txtchiccomamaderas6);
        final String stconsulta = txtchiccomamaderas6.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(chiccomamaderas6.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprachiccomamaderas6 = (Button)findViewById(R.id.btncomprachiccomamaderas6);
        btncomprachiccomamaderas6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprachiccomamaderas6 = new Intent(chiccomamaderas6.this,webview.class);
                btncomprachiccomamaderas6.putExtra("string", urlcombo);
                startActivity(btncomprachiccomamaderas6);
            }
        });

    }
}
