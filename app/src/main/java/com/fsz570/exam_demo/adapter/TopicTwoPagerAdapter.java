package com.fsz570.exam_demo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.fsz570.exam_demo.topics.TopicTwoQ01Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ02Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ03Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ04Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ05Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ06Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ07Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ08Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ09Fragment;
import com.fsz570.exam_demo.topics.TopicTwoQ10Fragment;
import com.fsz570.exam_demo.topics.TopicTwoResultFragment;


public class TopicTwoPagerAdapter extends FragmentStatePagerAdapter {

    private static final String TAG = "TopicTwoPagerAdapter";

    private int numPages = 11;

    private TopicTwoQ01Fragment TopicTwoQ01Fragment;
    private TopicTwoQ02Fragment TopicTwoQ02Fragment;
    private TopicTwoQ03Fragment TopicTwoQ03Fragment;
    private TopicTwoQ04Fragment TopicTwoQ04Fragment;
    private TopicTwoQ05Fragment TopicTwoQ05Fragment;
    private TopicTwoQ06Fragment TopicTwoQ06Fragment;
    private TopicTwoQ07Fragment TopicTwoQ07Fragment;
    private TopicTwoQ08Fragment TopicTwoQ08Fragment;
    private TopicTwoQ09Fragment TopicTwoQ09Fragment;
    private TopicTwoQ10Fragment TopicTwoQ10Fragment;
    private TopicTwoResultFragment resultFragment;

    public TopicTwoPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Log.d(TAG, "position : " + position);

        switch (position){
            case 0 :
                if(TopicTwoQ01Fragment==null){
                    TopicTwoQ01Fragment = new TopicTwoQ01Fragment();
                }
                return TopicTwoQ01Fragment;
            case 1 :
                if(TopicTwoQ02Fragment==null){
                    TopicTwoQ02Fragment = new TopicTwoQ02Fragment();
                }
                return TopicTwoQ02Fragment;
            case 2 :
                if(TopicTwoQ03Fragment==null){
                    TopicTwoQ03Fragment = new TopicTwoQ03Fragment();
                }
                return TopicTwoQ03Fragment;
            case 3 :
                if(TopicTwoQ04Fragment==null){
                    TopicTwoQ04Fragment = new TopicTwoQ04Fragment();
                }
                return TopicTwoQ04Fragment;
            case 4 :
                if(TopicTwoQ05Fragment==null){
                    TopicTwoQ05Fragment = new TopicTwoQ05Fragment();
                }
                return TopicTwoQ05Fragment;
            case 5 :
                if(TopicTwoQ06Fragment==null){
                    TopicTwoQ06Fragment = new TopicTwoQ06Fragment();
                }
                return TopicTwoQ06Fragment;
            case 6 :
                if(TopicTwoQ07Fragment==null){
                    TopicTwoQ07Fragment = new TopicTwoQ07Fragment();
                }
                return TopicTwoQ07Fragment;
            case 7 :
                if(TopicTwoQ08Fragment==null){
                    TopicTwoQ08Fragment = new TopicTwoQ08Fragment();
                }
                return TopicTwoQ08Fragment;
            case 8 :
                if(TopicTwoQ09Fragment==null){
                    TopicTwoQ09Fragment = new TopicTwoQ09Fragment();
                }
                return TopicTwoQ09Fragment;
            case 9 :
                if(TopicTwoQ10Fragment==null){
                    TopicTwoQ10Fragment = new TopicTwoQ10Fragment();
                }
                return TopicTwoQ10Fragment;
            case 10 :
                if(resultFragment==null){
                    resultFragment = new TopicTwoResultFragment();
                }
                return resultFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
