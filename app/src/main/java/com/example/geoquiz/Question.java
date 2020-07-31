package com.example.geoquiz;

import android.widget.Button;
import android.widget.TextView;

public class Question {
        private int mTextResId;
        private boolean mAnswerTrue;
        private Button mNextButton;
        private TextView mQuestionTextView;


        public Question(int textResId, boolean answerTrue){
            mTextResId = textResId;
            mAnswerTrue = answerTrue;
        }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
