package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button vermasAbi;
    TextView txtprueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtprueba = (TextView)findViewById(R.id.pruebatexto);
        vermasAbi = (Button)findViewById(R.id.abibtn);
        vermasAbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vermasAbi = new Intent(MainActivity.this, abriprodlist.class);
                startActivity(vermasAbi);
            }
        });

    }


}
