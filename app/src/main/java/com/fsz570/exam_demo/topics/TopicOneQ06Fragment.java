package com.fsz570.exam_demo.topics;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fsz570.exam_demo.R;

public class TopicOneQ06Fragment extends TopicTemplateFragment {

    public TopicOneQ06Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_topic_one_q06, container, false);

        this.rootView = rootView;

        return rootView;
    }
}
