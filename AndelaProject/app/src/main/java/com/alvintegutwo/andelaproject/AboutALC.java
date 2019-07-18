package com.alvintegutwo.andelaproject;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
public class AboutALC extends AppCompatActivity {
       private WebView web;

private class ssl extends WebViewClient{
    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed();
    }
}


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);


        web=findViewById(R.id.web1);
        web.setWebViewClient(new ssl());
        web.loadUrl("https://andela.com/alc/");

    }


}
