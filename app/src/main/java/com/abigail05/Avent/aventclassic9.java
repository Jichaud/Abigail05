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

public class aventclassic9 extends AppCompatActivity {

    Button home;
    Button producto;
    Button marca;
    Button btncompraaventclassic9;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=b771ecb66a204e58514e2c94f17850f9";
    ImageView aventclassic9;
    String urlaventclassic9 = "https://lh3.googleusercontent.com/h2etJ5aTn6RY6cjCnxydQaIXR-SmJVwb0DeOLrW6By_77hmZMh3yMWOdRn721INfE94qbf8VPUNXdZeEIxYOabMGAQWYFWYE3x6i7ce4TpnrPi5M5QTuCyOil7DrubL_XSbJYfHH_DEO-wICyTCM5dK3O7rNYETFTqDdkzatXOYfQWeS6u4-rde3tixWtCIlz63c80kW9EcMMAPLUSMZyLXhnrY7frvmriUXoYbS0fIeADONeUhzip8fX2VercwNvJhhjQfABBAuIgcLCFvmaOQ0nPWBtmIF8rurnTzGPu18rUHtrLCi01avY4iohX2r9Jg3If2diE-6bXcQ58mqxcx22w-YBJyJgiyyCkxyWMa3PPQPA2qFndfIofSLcPdWbjzyId6bDPXMxY_jHshX0iKyr20OREIjUyavcVgU340id4UNSO3rZirsMV-1CUIHO-IXzonz575ZO-dC7cKWJU6vjWoo_LGblkdOqNeEqA5tQt5ob2rkdQS3TDc7GPfTkduc33dChnVcqZWEXwuePjX7wzjOw2PVE_VIKlH_tSgzB29l3QiY3q6V1EpTOuvF0DTFU3ET1S_ih-cPkv3EB8pMwxCsygcOgD9zrf9TWJsHoU3mcw=w448-h352-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventclassic9);

        aventclassic9 = (ImageView)findViewById(R.id.aventclassic9);
        Picasso.with(this).load(urlaventclassic9).into(aventclassic9);

        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventclassic9.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventclassic9.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventclassic9 = (Button)findViewById(R.id.btncompraaventclassic9);
        btncompraaventclassic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventclassic9 = new Intent(aventclassic9.this,webview.class);
                btncompraaventclassic9.putExtra("string", urlcombo);
                startActivity(btncompraaventclassic9);
            }
        });

    }
}
