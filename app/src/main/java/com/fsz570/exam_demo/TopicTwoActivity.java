package com.fsz570.exam_demo;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fsz570.exam_demo.adapter.TopicTwoPagerAdapter;
import com.fsz570.exam_demo.topics.TopicTemplateFragment;
import com.fsz570.exam_demo.topics.TopicTwoResultFragment;
import com.fsz570.exam_demo.utils.FixedSpeedScroller;
import com.fsz570.exam_demo.utils.ZoomOutPageTransformer;

import java.lang.reflect.Field;

public class TopicTwoActivity extends FragmentActivity {

    private static final String TAG = "TopicTwoActivity";

    private ViewPager mPager;
    private TextView mQuestionTitle;
    private RelativeLayout background;
    private TopicTwoPagerAdapter mPagerAdapter;

    private static final int[] correctAnswers = {2,2,1,1,3,1,1,3,2,2};

    private static final int NUM_PAGES = correctAnswers.length+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_two);

        initUi();
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    private void initUi(){
        mQuestionTitle = (TextView)findViewById(R.id.tv_title);
        background = (RelativeLayout)findViewById(R.id.background);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new TopicTwoPagerAdapter(getSupportFragmentManager());
        mPagerAdapter.setNumPages(NUM_PAGES);
        mPager.setAdapter(mPagerAdapter);
        mPager.setPageTransformer(true, new ZoomOutPageTransformer());

        mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override public void onPageScrollStateChanged(    int arg0){
            }
            @Override public void onPageScrolled(    int arg0,    float arg1,    int arg2){
            }
            @Override public void onPageSelected(    int position){
                if(position<correctAnswers.length) {
                    mQuestionTitle.setText((position + 1) + "/" + correctAnswers.length);
                    background.setBackgroundColor(getResources().getColor(R.color.exam_background));
                }else{
                    mQuestionTitle.setText(getResources().getString(R.string.empty));
                    ((TopicTwoResultFragment)mPagerAdapter.getItem(position)).setScore();

                    setResultBackground();
                }

            }
        });

        try {
            Field mScroller;
            Interpolator sInterpolator = new DecelerateInterpolator();
            mScroller = ViewPager.class.getDeclaredField("mScroller");
            mScroller.setAccessible(true);
            FixedSpeedScroller scroller = new FixedSpeedScroller(mPager.getContext(), sInterpolator);
            mScroller.set(mPager, scroller);
        } catch (NoSuchFieldException e) {
        } catch (IllegalArgumentException e) {
        } catch (IllegalAccessException e) {
        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN) @SuppressWarnings("deprecation")
    private void setResultBackground(){
        int sdk = android.os.Build.VERSION.SDK_INT;
        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            background.setBackgroundDrawable(getResources().getDrawable(R.drawable.result_two));
        } else {
            background.setBackground(getResources().getDrawable(R.drawable.result_two));
        }
    }

    public int calcScore(){
        Log.d(TAG, "calcScore()");

        TopicTemplateFragment fragment;

        int score = 0;
        for(int i=0;i<correctAnswers.length;i++){
            fragment = (TopicTemplateFragment)mPagerAdapter.getItem(i);

            if(fragment.getAnswer()==correctAnswers[i]){
                score++;
            }
        }

        return score;
    }

    public void clickAnswer(View v){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                mPager.setCurrentItem(mPager.getCurrentItem() + 1, true);
            }
        }, 500);
    }
}
