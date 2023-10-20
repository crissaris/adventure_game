package com.example.myprecious;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.myprecious.episodes.Episode;
import com.example.myprecious.utilities.DataUtilities;
import com.example.myprecious.utilities.DelayUtility;
import com.example.myprecious.utilities.GameUtilities;

public class DisplayActivity extends AppCompatActivity {

    TextView episodeTextView;

    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        episodeTextView = findViewById(R.id.episode_textView);
        nextButton = findViewById(R.id.next_button);
        RelativeLayout relativeLayout = findViewById(R.id.displayLayout);

        if (savedInstanceState == null) {
            showUp(DataUtilities.getInstance().getEpisodeArrayList().get(0), relativeLayout);

        }

        nextButton.setOnClickListener(v -> {
            DataUtilities.getInstance().setEpisodeArrayList(DataUtilities.getInstance().
                    setEpisodeInArrayList(DataUtilities.getInstance().getEpisodeArrayList().get(0)));
            GameUtilities.getInstance().openNewActivity(this, GameActivity.class);
            this.finish();
        });


    }
    private void showUp(Episode episode, RelativeLayout relativeLayout) {
        relativeLayout.setBackgroundResource(episode.getImage());
        DelayUtility.displayTextWithDelay(episode.getTitle(), 35, 100, episodeTextView);
        GameUtilities.getInstance().showButton(nextButton, 4000);
    }

    @Override
    public void onBackPressed(){
        GameUtilities.getInstance().exitTheGame(this);
    }

}