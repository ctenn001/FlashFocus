package com.example.christian.flashfocus;

/**
 * Created by Christian on 7/17/2015.
 */
public class Card {

    private String mQuestion;
    private String mAnswer;

    Card(String q, String a)
    {
        mQuestion = q;
        mAnswer = a;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String answer) {
        mAnswer = answer;
    }
}
