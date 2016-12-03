package com.abigail05.Nuby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class nubyaccesorios3 extends AppCompatActivity {

    Button home;
    Button marca;
    Button btncompranubyaccesorios3;
    Button btnconsulta;
    TextView txtnubyaccesorios3;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=3750122915013bb5c688a57cfce01cc0";
    ImageView nubyaccesorios3;
    String urlnubyaccesorios3 = "https://lh3.googleusercontent.com/EWea6oAo24XgoBSdbawlnXAoRvUQNJy8LhanxsLibU3ubdEW8AS6bcxxYfHtSZyhXqAzASXkeyzNcNjfiYFiIi4MbJt8hYfRsofLzVtJJViU2dCQrJw7y9CdR6kZnk4v9cK62Pnt8kUpARtWn9eTzVqXPFNQc7xdzBWBvbIJmhGfjxRJPlTDs1ATi-4r8JmdofqYAQpYBo2JP_bmlT89ioFUTeGlwzgcu8ZR_soGaNqpYnFTvc-BKjQ98lc0zNVba8Eys_YCrwGGUiRZydxmJZBCibhCysaygbf5s6fXArD3jIFupAKbSwZhHUHdGgc_BgXxfHxGA6fuBhn36GNfeYfqybN-yGJqT-VxYGsc2pb-DvCHp6rjRcNISKE1dafDf-wqh5gH3wlv3PScuac6LnrQ8W7YMPCJa5FtFi1xBYPTfHFmI87ABSIGT4_4LDG4FgUI6wShhvl1YnbURBPg7YKNftZq9i-tXNiH3EggbzUiYM_Fw379xk9pAjX-PJMexwZ55wm_pxPWPAZlbCIKhnbwqRg-PZoSmXpxkvCTFOWvRSGfOjvIS7OjswB0OtKWPXP-lNit1RsEk8GjT2gf0l7_-yx6yZ1hO3HnVefSLQMk_4IceA=w500-h320-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nubyaccesorios3);

        nubyaccesorios3 = (ImageView)findViewById(R.id.nubyaccesorios3);
        Picasso.with(this).load(urlnubyaccesorios3).into(nubyaccesorios3);

        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(nubyaccesorios3.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(nubyaccesorios3.this, MainActivity.class);
                startActivity(home);
            }
        });

        txtnubyaccesorios3 = (TextView)findViewById(R.id.txtnubyaccesorios3);
        final String stconsulta = txtnubyaccesorios3.getText().toString();
        btnconsulta = (Button)findViewById(R.id.btnconsulta);
        btnconsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnconsulta = new Intent(nubyaccesorios3.this,contacto.class);
                btnconsulta.putExtra("consulta", stconsulta);
                startActivity(btnconsulta);
            }
        });


        btncompranubyaccesorios3 = (Button)findViewById(R.id.btncompranubyaccesorios3);
        btncompranubyaccesorios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompranubyaccesorios3 = new Intent(nubyaccesorios3.this,webview.class);
                btncompranubyaccesorios3.putExtra("string", urlcombo);
                startActivity(btncompranubyaccesorios3);
            }
        });

    }
}
