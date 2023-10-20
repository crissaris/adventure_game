package com.example.myprecious;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myprecious.episodes.Episode;
import com.example.myprecious.utilities.DataUtilities;
import com.example.myprecious.utilities.DelayUtility;
import com.example.myprecious.utilities.GameUtilities;
import com.example.myprecious.utilities.ProcessStory;

public class GameActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView textView;
    ImageView imageView;
    EditText editText;
    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);

        nameTextView = findViewById(R.id.textView_actor);
        textView = findViewById(R.id.game_textView);
        imageView = findViewById(R.id.game_imageView);
        editText = findViewById(R.id.editTextMultiLine);
        continueButton = findViewById(R.id.button_continue);

        if(savedInstanceState == null){
            Episode episode = DataUtilities.getInstance().getEpisodeArrayList().get(0);
            if(episode != null) {
                startTheGame(DataUtilities.getInstance().getEpisodeArrayList().get(0));
            }
            else{
                Toast.makeText(this, "Try to start the game again!!!", Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(this, "There is nothing to start!!!", Toast.LENGTH_LONG).show();
        }

        continueButton.setOnClickListener(v-> {
            // save and work editText command
        });

    }

    private void startTheGame(Episode episode) {
        if(episode.isIfPrologue() == false){
            displayPrologue(episode, 0, episode.getPrologue().getStory().size());
        }
        else{
            // start game...
        }
    }

    private void displayPrologue(Episode episode, int start, int stop) {
        nameTextView.setText(episode.getPrologue().getActor().getName());
        if(start < stop) {
            if (start == 0){
                ProcessStory.getInstance().displayStory(textView, nameTextView, imageView,
                        episode.getPrologue().getStory().get(start), episode.getPrologue().getActor().getName(),
                        episode.getPrologue().getImages().get(start));
                displayPrologue(episode, start+1, stop);
            }
            else {
                DelayUtility.delay(episode.getPrologue().getStory().get(start-1).length(), () -> {
                    clearText(textView);
                    ProcessStory.getInstance().displayStory(textView, nameTextView, imageView,
                            episode.getPrologue().getStory().get(start), episode.getPrologue().getActor().getName(),
                            episode.getPrologue().getImages().get(start));
                    displayPrologue(episode, start+1, stop);
                });
            }
        }
        episode.setIfPrologue(true);
    }

    private void clearText(TextView textView) {
        textView.setText("");
    }

    @Override
    public void onBackPressed(){
        GameUtilities.getInstance().exitTheGame(this);
    }
}