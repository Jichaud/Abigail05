package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class dhlenvio extends AppCompatActivity {

    TextView txtenvio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhlenvio);

        txtenvio = (TextView)findViewById(R.id.txtvolver);
        txtenvio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent txtenvio = new Intent(dhlenvio.this,contacto.class);
                startActivity(txtenvio);
            }
        });

    }
}
