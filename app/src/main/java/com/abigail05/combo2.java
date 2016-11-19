package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class combo2 extends AppCompatActivity {

    Button comprarcombo1;
    String urlcombo = "https://forms.todopago.com.ar/formulario/commands?command=formulario&m=cf7f1d016665bcbe9255dc04fdb2265f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo2);

        comprarcombo1 = (Button)findViewById(R.id.btncompracombo2);

        comprarcombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comprarcombo1 = new Intent(combo2.this, webview.class);
                comprarcombo1.putExtra("string", urlcombo);
                startActivity(comprarcombo1);
            }
        });

    }
}
