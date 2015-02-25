package com.fsz570.exam_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class TopicActivity extends Activity {

    private static final int TOPIC_ONE_REQUEST_CODE = 1;
    private static final int TOPIC_TWO_REQUEST_CODE = 2;
    private static final int TOPIC_THREE_REQUEST_CODE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        initUi();
    }

    private void initUi(){

        (findViewById(R.id.topic_1)).setOnClickListener(clickListener);
        (findViewById(R.id.topic_2)).setOnClickListener(clickListener);
        (findViewById(R.id.topic_3)).setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent topicIntent;
            switch (v.getId()){
                case R.id.topic_1:
                    topicIntent = new Intent(getBaseContext(), TopicOneActivity.class);
                    startActivityForResult(topicIntent, TOPIC_ONE_REQUEST_CODE);
                    break;
                case R.id.topic_2:
                    topicIntent = new Intent(getBaseContext(), TopicTwoActivity.class);
                    startActivityForResult(topicIntent, TOPIC_TWO_REQUEST_CODE);
                    break;
                case R.id.topic_3:
                    topicIntent = new Intent(getBaseContext(), TopicThreeActivity.class);
                    startActivityForResult(topicIntent, TOPIC_THREE_REQUEST_CODE);
                    break;
            }
        }
    };
}
