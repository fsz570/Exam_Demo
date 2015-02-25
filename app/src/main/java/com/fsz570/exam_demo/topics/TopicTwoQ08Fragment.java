package com.fsz570.exam_demo.topics;


import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fsz570.exam_demo.R;

public class TopicTwoQ08Fragment extends TopicTemplateFragment {

    TextView textView;
    public TopicTwoQ08Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_topic_two_q08, container, false);

        this.rootView = rootView;

        return rootView;
    }

    @Override
    public void onResume(){
        super.onResume();

        initUi();
    }

    private void initUi(){
        textView = (TextView)rootView.findViewById(R.id.question);

        SpannableStringBuilder builder = new SpannableStringBuilder();
        builder.append(getActivity().getResources().getString(R.string.topic_two_q08a)).append(" ");
        builder.setSpan(new ImageSpan(getActivity(), R.drawable.water_sign),
                builder.length() - 1, builder.length(), 0);
        builder.append(" ").append(getActivity().getResources().getString(R.string.topic_two_q08b));

        textView.setText(builder);
    }
}
