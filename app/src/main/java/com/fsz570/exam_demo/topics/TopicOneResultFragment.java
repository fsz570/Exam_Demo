package com.fsz570.exam_demo.topics;


import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;

import com.fsz570.exam_demo.R;
import com.fsz570.exam_demo.TopicOneActivity;

public class TopicOneResultFragment extends Fragment {

    private RatingBar ratingBar1, ratingBar2;
    private TopicOneActivity parentActivity;
    private ViewGroup rootView;
    private Button btnFinish;

    public TopicOneResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(
                R.layout.result, container, false);
        return rootView;
    }

    @Override
    public void onResume(){
        super.onResume();

        initUi();
    }

    private void initUi(){
        ratingBar1 = (RatingBar) rootView.findViewById(R.id.rating_bar1);
        ratingBar2 = (RatingBar) rootView.findViewById(R.id.rating_bar2);

        ((LayerDrawable) ratingBar1.getProgressDrawable()).getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
        ((LayerDrawable) ratingBar2.getProgressDrawable()).getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

        btnFinish = (Button)rootView.findViewById(R.id.btn_finish);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_finish:
                        getActivity().finish();
                }
            }
        });
    }

    public void setScore(){
        parentActivity = (TopicOneActivity)getActivity();
        int score = parentActivity.calcScore();

        ratingBar1.setRating(score >=5?5:score);
        ratingBar2.setRating(score >=5?score-5:0);
    }
}
