package com.lorien.jekins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String user = intent.getStringExtra(MainActivity.KEY_USERNAME);

        TextView tv = new TextView(this);
        tv.setText("Welcome: " + user);
        tv.setTextSize(30);

        ((FrameLayout)findViewById(R.id.container)).addView(tv);
    }
}
