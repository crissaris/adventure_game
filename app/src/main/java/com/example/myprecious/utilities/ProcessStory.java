package com.example.myprecious.utilities;

import android.widget.ImageView;
import android.widget.TextView;

public class ProcessStory {

    private static ProcessStory instance;

    public static ProcessStory getInstance(){
        if (instance == null){
            instance = new ProcessStory();
        }
        return instance;
    }

    public void displayStory(TextView storyText, TextView actorName, ImageView storyImage, String story, String name, Integer image){
        actorName.setText(name);
        DelayUtility.displayTextWithDelay(story, 23, 50, storyText);
        storyImage.setImageResource(image);
    }
}
