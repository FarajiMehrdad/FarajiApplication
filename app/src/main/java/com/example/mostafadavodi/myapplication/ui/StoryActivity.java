package com.example.mostafadavodi.myapplication.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mostafadavodi.myapplication.R;
import com.example.mostafadavodi.myapplication.model.Page;
import com.example.mostafadavodi.myapplication.model.Story;

/**
 * Created by mostafadavodi on 8/13/16 AD.
 */
public class StoryActivity extends AppCompatActivity implements View.OnClickListener{


    ImageView coverImageView;
    TextView contentTextView;
    Button nextChoice1Btn;
    Button nextChoice2Btn;

    Story story;
    Page page;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        coverImageView = (ImageView) findViewById(R.id.story_cover_image);
        contentTextView = (TextView) findViewById(R.id.story_content);
        nextChoice1Btn = (Button) findViewById(R.id.choice1_btn);
        nextChoice2Btn = (Button) findViewById(R.id.choice2_btn);

        nextChoice1Btn.setOnClickListener(this);


        story = new Story();
        fillUiContent(0);





    }


    void fillUiContent(int index){

        page = story.getPages().get(index);
        coverImageView.setImageResource(page.getCoverImageDrawbale());
        contentTextView.setText(page.getStoryContent());
        nextChoice1Btn.setText(page.getChoice1().getButtonText());
        nextChoice2Btn.setText(page.getChoice2().getButtonText());
    }

    @Override
    public void onClick(View view) {

        Log.d("StoryActivity" , "onClick on button is call");

        if (view.getId()== R.id.choice1_btn){

            fillUiContent(page.getChoice1().getNextStory());

        } else if (view.getId() == R.id.choice2_btn){

        }

    }
}
