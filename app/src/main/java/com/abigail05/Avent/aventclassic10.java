package com.abigail05.Avent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.abigail05.MainActivity;
import com.abigail05.R;
import com.abigail05.marcas;
import com.abigail05.webview;
import com.squareup.picasso.Picasso;

public class aventclassic10 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraaventclassic10;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=87daecf23d49845cab835d24132e2210";
    ImageView aventclassic10;
    String urlaventclassic10 = "https://lh3.googleusercontent.com/c9AQjZBKHwpXCnT3pbgaK8Ijm1yHACW7Ni9WPrPoDN1F2p5VhhTRxvcMtwXg-SXFpossBJLkMmj1F8waPL3k16nMOxgXeXZ74xC0DuLSdxTxUgGhi3HtLY957qa3iChW7Chyz1T9RSEsJtGM5LJzIpCJXMAi4fUK9nxTiHMjpGEGyFAe_hPALGsYFdSLulnN42ke9dEpSY2VljGcQKPFuvXtTP5INmnX4K3rSp-Rw9ORG9xdoBC-BhVjB0th6l-WqNQ5nOy1Mfl_1fXo6lnLidtxnZEp_UoLtg5KZOfrv3l2xhpa4CmQy6DZ4VfwBNMR5olwZHpjSHojfq-42L-TngGlg8uLgyJKl-_kUxz2m-ez6u8-qJ0XbVF57GYYeME2LUI3XIAgqUPO9yPbkcu9x6k1qkBAvEAgDjNpgefmgls5jV5FBj0q84baL6UzF6EYgqxkmyfHnDRHV-NviAQyhOAqJPHe_t19HDkwbSSwfHbUu8s7O_QnW5n5FaH98G5MPfQsJFozmUWecOrFHiDehYMYsVs7D6IyH6WRN-j5fqZaq3GKcg3DvzzaIeMgPxMIO9AqaUf8-HFEsM-MImg3KKELOxIb7ZTMZuuJyhw8liW4Fp_nBA=w444-h352-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic10);

        aventclassic10 = (ImageView)findViewById(R.id.aventclassic10);
        Picasso.with(this).load(urlaventclassic10).into(aventclassic10);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic10.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic10.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic10 = (Button)findViewById(R.id.btncompraaventclassic10);
        btncompraaventclassic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic10 = new Intent(aventclassic10.this,webview.class);
                btncompraaventclassic10.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic10);
            }
        });

    }
}
