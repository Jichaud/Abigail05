package com.abigail05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class webview extends AppCompatActivity {

    private WebView webView;

    Button home;
    Button producto;
    Button marca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        String url = getIntent().getStringExtra("string");
        webView = (WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

        home = (Button)findViewById(R.id.btnhome);
        producto = (Button)findViewById(R.id.btnvprod);
        marca = (Button)findViewById(R.id.btnvmarca);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(webview.this, MainActivity.class);
                startActivity(home);
            }
        });


    }


}
