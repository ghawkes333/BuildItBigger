package com.example.displayjokes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    public static String JOKE_KEY = "joke";

    private static String TAG = DisplayJokesActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        if(getIntent() != null){
            if(getIntent().getStringExtra(JOKE_KEY) != null){
                TextView jokeTextView = findViewById(R.id.display_joke_tv);
                jokeTextView.setText(getIntent().getStringExtra(JOKE_KEY));
            } else Log.e(TAG, "Did not pass in a joke");
        } else {
            Log.e(TAG, "Intent was null");
        }
    }
}