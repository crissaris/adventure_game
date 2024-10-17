package com.example.myprecious.utilities;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AlertDialog;

import com.example.myprecious.R;

public class GameUtility {

    private static GameUtility instance;

    public static Handler handler = new Handler();




    public static GameUtility getInstance(){
        if(instance == null){
            instance = new GameUtility();
        }
        return instance;
    }
    public static Handler getHandler(){
        if(handler == null){
            handler = new Handler();
        }
        return handler;
    }

    public void setTheActivity(Activity activity){
        View decorView = activity.getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
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



}
