package com.example.mostafadavodi.myapplication.model;

/**
 * Created by mostafadavodi on 8/13/16 AD.
 */
public class Choice {

    int nextStory;
    String buttonText;

    public Choice(int nextStory, String buttonText) {
        this.nextStory = nextStory;
        this.buttonText = buttonText;
    }

    public int getNextStory() {
        return nextStory;
    }

    public String getButtonText() {
        return buttonText;
    }
}
