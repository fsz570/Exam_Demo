package com.fsz570.exam_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class EntryActivity extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(getBaseContext(),TopicActivity.class);

                EntryActivity.this.startActivity(mainIntent);
                EntryActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}
