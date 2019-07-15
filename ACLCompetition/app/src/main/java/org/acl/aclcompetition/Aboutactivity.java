package org.acl.aclcompetition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Aboutactivity extends AppCompatActivity {

    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutactivity);
        webView  = (WebView) findViewById(R.id.webviewabout);
        webView.loadUrl("https://andela.com/");

    }
}
