package com.fsz570.exam_demo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.fsz570.exam_demo.topics.TopicOneResultFragment;
import com.fsz570.exam_demo.topics.TopicOneQ01Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ02Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ03Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ04Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ05Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ06Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ07Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ08Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ09Fragment;
import com.fsz570.exam_demo.topics.TopicOneQ10Fragment;


public class TopicOnePagerAdapter  extends FragmentStatePagerAdapter {

    private static final String TAG = "TopicOnePagerAdapter";

    private int numPages = 11;

    private TopicOneQ01Fragment topicOneQ01Fragment;
    private TopicOneQ02Fragment topicOneQ02Fragment;
    private TopicOneQ03Fragment topicOneQ03Fragment;
    private TopicOneQ04Fragment topicOneQ04Fragment;
    private TopicOneQ05Fragment topicOneQ05Fragment;
    private TopicOneQ06Fragment topicOneQ06Fragment;
    private TopicOneQ07Fragment topicOneQ07Fragment;
    private TopicOneQ08Fragment topicOneQ08Fragment;
    private TopicOneQ09Fragment topicOneQ09Fragment;
    private TopicOneQ10Fragment topicOneQ10Fragment;
    private TopicOneResultFragment resultFragment;

    public TopicOnePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Log.d(TAG, "position : " + position);

        switch (position){
            case 0 :
                if(topicOneQ01Fragment==null){
                    topicOneQ01Fragment = new TopicOneQ01Fragment();
                }
                return topicOneQ01Fragment;
            case 1 :
                if(topicOneQ02Fragment==null){
                    topicOneQ02Fragment = new TopicOneQ02Fragment();
                }
                return topicOneQ02Fragment;
            case 2 :
                if(topicOneQ03Fragment==null){
                    topicOneQ03Fragment = new TopicOneQ03Fragment();
                }
                return topicOneQ03Fragment;
            case 3 :
                if(topicOneQ04Fragment==null){
                    topicOneQ04Fragment = new TopicOneQ04Fragment();
                }
                return topicOneQ04Fragment;
            case 4 :
                if(topicOneQ05Fragment==null){
                    topicOneQ05Fragment = new TopicOneQ05Fragment();
                }
                return topicOneQ05Fragment;
            case 5 :
                if(topicOneQ06Fragment==null){
                    topicOneQ06Fragment = new TopicOneQ06Fragment();
                }
                return topicOneQ06Fragment;
            case 6 :
                if(topicOneQ07Fragment==null){
                    topicOneQ07Fragment = new TopicOneQ07Fragment();
                }
                return topicOneQ07Fragment;
            case 7 :
                if(topicOneQ08Fragment==null){
                    topicOneQ08Fragment = new TopicOneQ08Fragment();
                }
                return topicOneQ08Fragment;
            case 8 :
                if(topicOneQ09Fragment==null){
                    topicOneQ09Fragment = new TopicOneQ09Fragment();
                }
                return topicOneQ09Fragment;
            case 9 :
                if(topicOneQ10Fragment==null){
                    topicOneQ10Fragment = new TopicOneQ10Fragment();
                }
                return topicOneQ10Fragment;
            case 10 :
                if(resultFragment==null){
                    resultFragment = new TopicOneResultFragment();
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
