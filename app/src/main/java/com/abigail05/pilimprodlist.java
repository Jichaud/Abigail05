package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class pilimprodlist extends AppCompatActivity {

    ImageView pilim1;
    String urlpilim1 = "https://lh3.googleusercontent.com/hqtoV3EVr8wjVKB3YLvmA1k-QfmdWTWhrVD-ukEunBx_KTxZ-j-2zpIz1AwdziXyjFqA7E8X9aKDngMvEyOEZ1q0AFw8OLgC4XCWqdJx48TJbRdlOyfyOLVQziwGKXx2KeL9ymUUpZ66EkFJhmQncKfm9YNrWZWKxBMTJp_9zcJR5iauGZue22nIS6SFeQOmmLiAxz7b8BaEnFD37belOev3jtQ5GbysZnH5uqEvCh3OdVyA3HvPL8gzk408bwuRC-QIoppRKTp1RSIlW6fc13yjOXEJnoxfLgETu13WIF48Ne1c9b_ECnHG57xzGlB0TZq250TovCdcPs8HAXHZDB25GbjxG8DwEZjkTQQyADB2WuXKsAb2sOVJDa_7FTvkh5k5ES1EOmJiVIFya9zF1iCk850wcADX44-sMEYUWAmsOWgrg8IxbUPZFCDqXOM24nHSbp5SmMvVXxo_KLhB4K7BjSYAPtnEzIpZluewOjqbWXdRgilHCkYLi5uwgZ1ZeMuWBitv2Pj_KgDcBL__j3BfApEFldAmZfWSsRfCSVy1GgFPh-saejzItlnqEiv4cHMU5LV0sR8S5E92LnESd0LauLvr1Nbk52sdIY3EVpJt_Vp9hQ=w402-h296-no";
    Button btnpilim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilimprodlist);

        pilim1 = (ImageView)findViewById(R.id.pilim1);
        Picasso.with(this).load(urlpilim1).into(pilim1);

        btnpilim1 = (Button)findViewById(R.id.btnpilim1);
        btnpilim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnpilim1 = new Intent(pilimprodlist.this, pilim1.class);
                startActivity(btnpilim1);
            }
        });
    }
}
