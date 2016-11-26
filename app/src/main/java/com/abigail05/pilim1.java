package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class pilim1 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncomprapilim1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=f9b9d9993ff842ef4c9292c5103427a3";
    ImageView pilim1;
    String urlpilim1 = "https://lh3.googleusercontent.com/hqtoV3EVr8wjVKB3YLvmA1k-QfmdWTWhrVD-ukEunBx_KTxZ-j-2zpIz1AwdziXyjFqA7E8X9aKDngMvEyOEZ1q0AFw8OLgC4XCWqdJx48TJbRdlOyfyOLVQziwGKXx2KeL9ymUUpZ66EkFJhmQncKfm9YNrWZWKxBMTJp_9zcJR5iauGZue22nIS6SFeQOmmLiAxz7b8BaEnFD37belOev3jtQ5GbysZnH5uqEvCh3OdVyA3HvPL8gzk408bwuRC-QIoppRKTp1RSIlW6fc13yjOXEJnoxfLgETu13WIF48Ne1c9b_ECnHG57xzGlB0TZq250TovCdcPs8HAXHZDB25GbjxG8DwEZjkTQQyADB2WuXKsAb2sOVJDa_7FTvkh5k5ES1EOmJiVIFya9zF1iCk850wcADX44-sMEYUWAmsOWgrg8IxbUPZFCDqXOM24nHSbp5SmMvVXxo_KLhB4K7BjSYAPtnEzIpZluewOjqbWXdRgilHCkYLi5uwgZ1ZeMuWBitv2Pj_KgDcBL__j3BfApEFldAmZfWSsRfCSVy1GgFPh-saejzItlnqEiv4cHMU5LV0sR8S5E92LnESd0LauLvr1Nbk52sdIY3EVpJt_Vp9hQ=w402-h296-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilim1);

        pilim1 = (ImageView)findViewById(R.id.pilim1);
        Picasso.with(this).load(urlpilim1).into(pilim1);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(pilim1.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(pilim1.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncomprapilim1 = (Button)findViewById(R.id.btncomprapilim1);
        btncomprapilim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncomprapilim1 = new Intent(pilim1.this,webview.class);
                btncomprapilim1.putExtra("string", urlcombo);
                startActivity(btncomprapilim1);
            }
        });

    }

}
