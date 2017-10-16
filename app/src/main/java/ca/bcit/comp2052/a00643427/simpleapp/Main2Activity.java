package ca.bcit.comp2052.a00643427.simpleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button buttonNext = (Button) findViewById(R.id.button3);
        buttonNext.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
               // startActivity(new Intent(MainActivity.this, Main2Activity.class));
                //startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });

        WebView webView1 = (WebView) findViewById(R.id.WebView1);
        webView1.setWebChromeClient(new WebChromeClient());
        webView1.loadUrl("http://developer.android.com");
    }
}
