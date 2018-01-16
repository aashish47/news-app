package com.example.hp.techie.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.hp.techie.R;
import com.example.hp.techie.classes.OurViewClient;


public class webViewActivity extends AppCompatActivity {

    WebView webView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new OurViewClient());
        String URL = getIntent().getStringExtra("URL");
        ((WebView)(findViewById(R.id.webView))).loadUrl(URL);
    }
}
