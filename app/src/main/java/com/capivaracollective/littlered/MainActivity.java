package com.capivaracollective.littlered;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient()); // keeps navigation inside the app
        webView.getSettings().setJavaScriptEnabled(true); // needed for your HTML's search/dark mode
        webView.loadUrl("file:///android_asset/little_red.html");
    }
}