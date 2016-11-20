package com.abigail05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button vermasAbi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vermasAbi = (Button)findViewById(R.id.abibtn);

        vermasAbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vermasAbi = new Intent(MainActivity.this, almohadones.class);
                startActivity(vermasAbi);
            }
        });
    }


}
