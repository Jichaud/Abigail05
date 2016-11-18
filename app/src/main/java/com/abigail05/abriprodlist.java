package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abriprodlist extends AppCompatActivity {

    Button vercombo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abriprodlist);

        vercombo1 = (Button)findViewById(R.id.btncombo1);
        vercombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vercombo1 = new Intent(abriprodlist.this,combo1.class);
                startActivity(vercombo1);
            }
        });
    }
}
