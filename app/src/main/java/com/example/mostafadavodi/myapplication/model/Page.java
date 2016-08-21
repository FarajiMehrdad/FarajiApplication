package com.example.mostafadavodi.myapplication.model;

/**
 * Created by mostafadavodi on 8/13/16 AD.
 */
public class Page {

    int coverImageDrawbale;
    int storyContent;
    Choice choice1;
    Choice choice2;

    public Page(int coverImageDrawbale, int storyContent) {
        this.coverImageDrawbale = coverImageDrawbale;
        this.storyContent = storyContent;
    }

    public Page(int coverImageDrawbale, int storyContent, Choice choice1, Choice choice2) {
        this.coverImageDrawbale = coverImageDrawbale;
        this.storyContent = storyContent;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public int getCoverImageDrawbale() {
        return coverImageDrawbale;
    }

    public int getStoryContent() {
        return storyContent;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }
}
