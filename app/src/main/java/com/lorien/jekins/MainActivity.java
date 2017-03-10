package com.lorien.jekins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_USERNAME = "USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {

        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra(KEY_USERNAME, "lorienzhang");
        Log.d("TAG", "for testt");
        startActivity(intent);
    }
}
