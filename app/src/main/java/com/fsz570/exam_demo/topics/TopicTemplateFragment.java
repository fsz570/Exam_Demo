package com.fsz570.exam_demo.topics;


import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.fsz570.exam_demo.R;

public abstract class TopicTemplateFragment extends Fragment {

    private static final String TAG = "TopicTemplateFragment";
    protected ViewGroup rootView;

    public TopicTemplateFragment() {
        // Required empty public constructor
    }


    public int getAnswer(){
        int answer = 0;

        if(isAns1Checked()){
            return 1;
        }else if(isAns2Checked()){
            return 2;
        }else if(isAns3Checked()){
            return 3;
        }

        return answer;
    }

    protected boolean isAns1Checked() {
        return ((RadioButton) rootView.findViewById(R.id.ans1)).isChecked();
    }

    protected boolean isAns2Checked() {
        return ((RadioButton) rootView.findViewById(R.id.ans2)).isChecked();
    }

    protected boolean isAns3Checked() {
        return ((RadioButton) rootView.findViewById(R.id.ans3)).isChecked();
    }
}
