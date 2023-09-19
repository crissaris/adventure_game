package com.example.myprecious.utilities;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;

import com.example.myprecious.R;

public class GameUtilities {

    private static GameUtilities instance;

    public static Handler handler = new Handler();

    public static GameUtilities getInstance(){
        if(instance == null){
            instance = new GameUtilities();
        }
        return instance;
    }

    public void openNewActivity(Activity activity, Class clash){
        Intent intent = new Intent(activity, clash);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }
    public static void setImage(RelativeLayout layout, int image){
        layout.setBackgroundResource(image);
    }
    public void exitTheGame(Activity activity){
        new AlertDialog.Builder(activity)
                .setIcon(R.drawable.exit_icon)
                .setTitle("Exit Game.")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    activity.finish();
                    System.exit(0);
                })
                .setNegativeButton("No", null).show();
    }
    public void showButton(Button button, long mils) {
        handler.postDelayed(() -> button.setVisibility(View.VISIBLE), mils);
    }
    public void hideButton(Button button, long mils){
        handler.postDelayed(()-> button.setVisibility(View.GONE), mils);
    }

}
