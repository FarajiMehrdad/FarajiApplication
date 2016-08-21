package com.example.mostafadavodi.myapplication.model;

import com.example.mostafadavodi.myapplication.R;

import java.util.ArrayList;

/**
 * Created by mostafadavodi on 8/13/16 AD.
 */
public class Story {

    ArrayList<Page> pages = new ArrayList<>();

    public Story() {

        pages.add(new Page(R.drawable.page0 , R.string.story_page0 , new Choice(1 , "Explore the cave") , new Choice(5 , "Explore the Rover") ));
        pages.add(new Page(R.drawable.page1 , R.string.story_page1 , new Choice(2 , "Contnitu toward the faint light") , new Choice(5, "Refill at ship and expolore") ));
        pages.add(new Page(R.drawable.page2 , R.string.story_page2 , new Choice(0 , "Explore the cave") , new Choice(0 , "Explore the Rover") ));
        pages.add(new Page(R.drawable.page3 , R.string.story_page3 , new Choice(0 , "Explore the cave") , new Choice(0 , "Explore the Rover") ));
        pages.add(new Page(R.drawable.page4 , R.string.story_page4 , new Choice(0 , "Explore the cave") , new Choice(0 , "Explore the Rover") ));
        pages.add(new Page(R.drawable.page5 , R.string.story_page5 , new Choice(0 , "Explore the cave") , new Choice(0 , "Explore the Rover") ));
        pages.add(new Page(R.drawable.page6 , R.string.story_page6 , new Choice(0 , "Explore the cave") , new Choice(0 , "Explore the Rover") ));

    }


    public ArrayList<Page> getPages() {
        return pages;
    }
}
