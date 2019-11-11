package com.example.webview;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    //This is for the function for back pressing
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        } else {
            super.onBackPressed();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.wv1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
