package com.example.mostafadavodi.myapplication.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mostafadavodi.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText storyNameEditText = (EditText) findViewById(R.id.story_name_edit_text);
        Button startAdvantureBtn = (Button) findViewById(R.id.start_advanture_btn);


        startAdvantureBtn.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(getApplicationContext() , StoryActivity.class);
        startActivity(intent);

    }
}
