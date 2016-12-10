package com.abigail05.BabyInnovation;

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

public class babyinvarios10 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncomprababyinvarios10;
    Button btnconsulta;
    TextView txtbabyinvarios10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=dbafe8bf743780e4b08a94e2d5635d6d#utm_source=28428&utm_medium=boton_de_pago&utm_campaign=web";
    ImageView babyinvarios10;
    String urlbabyinvarios10 = "https://lh3.googleusercontent.com/wJ2SL3pD5xW1svQjdLvquuYSVc_kWxw8nVVMR7Q4T6x1FpxrIcZCJ2O6E3Y_apvwjORImbgg4UPWc1i1th8xCGb0vqiDwMLEYrm01U88flAizpIloewRzo1u3kJhiJFrVRZYT7oQMfbWS-rtYr7L_I8hM8z6wLC74WXTiZZ7zG7-BNGUuf_5NjgQ6zYenunoJSaR6N_u-VtMCU5iLfHxng9Ompe3_D8jV4ZxQp3CfER9Gh24grCaZaXCJ7Hn6Bf5lFJtpsHSsNL9Zl5OfuRhtzp0tA1SPGjOgDZ7bfTaJrllGqEB1iP5eVDzn5JFJrOGQoAPmWhIgqME7xkiaSNIVgfu-7mIRwuK0NqUqG46BRobhS_bvVppQvTb2Fjb6HxtTySv1-XXMzYi2p1-j1RgVp66i5tfJbWL0G8Z6e2KDrgQoHx-bucohg6rMHHOJkNaHYGCPYN5OtIlmyxB-h3NcKKwXs73XZ5EPuu4bsKh34tlYee0kqLe0cu8AEYhq3zeNR8G6Xau7MWaa51GwsoUPMmZ7oB2MsG_KeqvoUIwf-MxIYv-F56r6YCABWtad0c8T3qgCPkAkfto7-SHlvVeelwijQrhuxdty7N4IiWtRLLNAjSy0KZ1NrzjCSpslecaqWR0VdgdBZdL9oKa-gkn9dxaYVFcZE_PQREeDXERnPo=w328-h332-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyinvarios10);

        babyinvarios10 = (ImageView)findViewById(R.id.babyinvarios10);
        Picasso.with(this).load(urlbabyinvarios10).into(babyinvarios10);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(babyinvarios10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(babyinvarios10.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtbabyinvarios10 = (TextView)findViewById(R.id.txtbabyinvarios10);
        final String stconsulta = txtbabyinvarios10.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(babyinvarios10.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncomprababyinvarios10 = (Button)findViewById(R.id.btncomprababyinvarios10);
        btncomprababyinvarios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprababyinvarios10 = new Intent(babyinvarios10.this,webview.class);
                btncomprababyinvarios10.putExtra("string", urlcombo);
                startActivity(btncomprababyinvarios10);
            }
        });

    }
}
