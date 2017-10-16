package ca.bcit.comp2052.a00643427.simpleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSON;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //JASON.paser("{\"username\": \"danny\"}");
        JSON.parse("{\"username\": \"danny\"}");


        Button buttonNext = (Button) findViewById(R.id.button2);
        buttonNext.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
