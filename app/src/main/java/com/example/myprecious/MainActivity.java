package com.example.myprecious;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myprecious.episodes.TheFellowshipOfTheRing;
import com.example.myprecious.utilities.DataUtilities;
import com.example.myprecious.utilities.GameUtilities;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button newGameButton, loadGameButton, exitGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newGameButton = findViewById(R.id.new_game_button);
        loadGameButton = findViewById(R.id.load_game_button);
        exitGameButton = findViewById(R.id.exit_game_button);

        newGameButton.setOnClickListener(this);
        loadGameButton.setOnClickListener(this);
        exitGameButton.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.exit_game_button:
                //save game first...
                onBackPressed();
                break;
            case R.id.load_game_button:

                break;
            case R.id.new_game_button:
                startNewGame();
                break;

        }
    }

    private void startNewGame() {
        DataUtilities.getInstance().setEpisodeArrayList(DataUtilities.getInstance().setEpisodeInArrayList(new TheFellowshipOfTheRing()));
        GameUtilities.getInstance().openNewActivity(this, DisplayActivity.class);
    }

    @Override
    public void onBackPressed(){
        GameUtilities.getInstance().exitTheGame(this);
    }
}