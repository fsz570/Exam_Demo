package com.fsz570.exam_demo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.fsz570.exam_demo.topics.TopicThreeQ01Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ02Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ03Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ04Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ05Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ06Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ07Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ08Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ09Fragment;
import com.fsz570.exam_demo.topics.TopicThreeQ10Fragment;
import com.fsz570.exam_demo.topics.TopicThreeResultFragment;


public class TopicThreePagerAdapter extends FragmentStatePagerAdapter {

    private static final String TAG = "TopicThreePagerAdapter";

    private int numPages = 11;

    private TopicThreeQ01Fragment TopicThreeQ01Fragment;
    private TopicThreeQ02Fragment TopicThreeQ02Fragment;
    private TopicThreeQ03Fragment TopicThreeQ03Fragment;
    private TopicThreeQ04Fragment TopicThreeQ04Fragment;
    private TopicThreeQ05Fragment TopicThreeQ05Fragment;
    private TopicThreeQ06Fragment TopicThreeQ06Fragment;
    private TopicThreeQ07Fragment TopicThreeQ07Fragment;
    private TopicThreeQ08Fragment TopicThreeQ08Fragment;
    private TopicThreeQ09Fragment TopicThreeQ09Fragment;
    private TopicThreeQ10Fragment TopicThreeQ10Fragment;
    private TopicThreeResultFragment resultFragment;

    public TopicThreePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Log.d(TAG, "position : " + position);

        switch (position){
            case 0 :
                if(TopicThreeQ01Fragment==null){
                    TopicThreeQ01Fragment = new TopicThreeQ01Fragment();
                }
                return TopicThreeQ01Fragment;
            case 1 :
                if(TopicThreeQ02Fragment==null){
                    TopicThreeQ02Fragment = new TopicThreeQ02Fragment();
                }
                return TopicThreeQ02Fragment;
            case 2 :
                if(TopicThreeQ03Fragment==null){
                    TopicThreeQ03Fragment = new TopicThreeQ03Fragment();
                }
                return TopicThreeQ03Fragment;
            case 3 :
                if(TopicThreeQ04Fragment==null){
                    TopicThreeQ04Fragment = new TopicThreeQ04Fragment();
                }
                return TopicThreeQ04Fragment;
            case 4 :
                if(TopicThreeQ05Fragment==null){
                    TopicThreeQ05Fragment = new TopicThreeQ05Fragment();
                }
                return TopicThreeQ05Fragment;
            case 5 :
                if(TopicThreeQ06Fragment==null){
                    TopicThreeQ06Fragment = new TopicThreeQ06Fragment();
                }
                return TopicThreeQ06Fragment;
            case 6 :
                if(TopicThreeQ07Fragment==null){
                    TopicThreeQ07Fragment = new TopicThreeQ07Fragment();
                }
                return TopicThreeQ07Fragment;
            case 7 :
                if(TopicThreeQ08Fragment==null){
                    TopicThreeQ08Fragment = new TopicThreeQ08Fragment();
                }
                return TopicThreeQ08Fragment;
            case 8 :
                if(TopicThreeQ09Fragment==null){
                    TopicThreeQ09Fragment = new TopicThreeQ09Fragment();
                }
                return TopicThreeQ09Fragment;
            case 9 :
                if(TopicThreeQ10Fragment==null){
                    TopicThreeQ10Fragment = new TopicThreeQ10Fragment();
                }
                return TopicThreeQ10Fragment;
            case 10 :
                if(resultFragment==null){
                    resultFragment = new TopicThreeResultFragment();
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
