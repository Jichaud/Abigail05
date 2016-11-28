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

public class aventnatural2 extends AppCompatActivity {

    Button home;

    Button marca;
    Button btncompraaventnatural2;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=8a44b5a1f392314f1234d0f5ceb43149";
    ImageView aventnatural2;
    String urlaventnatural2 = "https://lh3.googleusercontent.com/mWTh4Krv_JYq1-wPTdSFiDMyOanzvXHr8ZNXISmJDaoK2tJITUi8ZO6UK9s-2qYRnGZeOxB7x4h3tp--M8_M36Ikp3QR8XTgJvtpUooUQlbKGBVLj2gvfPAaEH886a6QH1johbdAT0AhuvVOhf782IA2vVV8McQptwwBwgYMMlNZoevsesdBPFyPNuC-cOoq3HnFkyTFNbAQFN9CZrPMWt6mthl0qTvzywDdi57mjSQlqy6U2bKxI5fRZq18k0zbKLIiVUQW72k5U3e6LTvpxIlu8nS4JpnsymEb6rsYja7zSxz59kUVDUSS7asisUF8hOWeJFxmavYLL0RNfdBVgf7LrmLedLxFwqgmyoVe_lq_6FyNE22zle6pPNs7uh-Z755aEFxtJFA5XS4ka9tcq61QNnSiIhoKOQD7thExncAXC6ChdNhpKonRTqtngGcXQb4jAq2EXEcDUYJqX-YDwwyOfNcEoWjYHVPnmeuZrDjtm_NSFeiTYlU80JAuqrdiIdeBSQSfx3_ZZLSX20_fmGaeMgr5RRRqQHsVW_2HGDbPaOGF9CcNRAhjMSeACKZn4hBPDmHApq7aBOtYDLa85g5TLtbv-98HDeqAbb86HCF7jzxjNA=w494-h435-no";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventnatural2);

        aventnatural2 = (ImageView)findViewById(R.id.aventnatural2);
        Picasso.with(this).load(urlaventnatural2).into(aventnatural2);


        marca = (Button) findViewById(R.id.btnvmarca);
        marca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marca = new Intent(aventnatural2.this,marcas.class);
                startActivity(marca);
            }
        });

        home = (Button)findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(aventnatural2.this, MainActivity.class);
                startActivity(home);
            }
        });

        btncompraaventnatural2 = (Button)findViewById(R.id.btncompraaventnatural2);
        btncompraaventnatural2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btncompraaventnatural2 = new Intent(aventnatural2.this,webview.class);
                btncompraaventnatural2.putExtra("string", urlcombo);
                startActivity(btncompraaventnatural2);
            }
        });

    }
}
