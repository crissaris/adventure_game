package com.example.myprecious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.myprecious.utilities.GameUtility;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameUtility.getInstance().setTheActivity(this);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            loadFragment(new SplashFragment(new MainFragment(), R.drawable.splash_wallpaper));
        }


    }
    public void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment,
                        fragment.getClass().getSimpleName()).addToBackStack(null).commit();
    }

    @Override
    public void onBackPressed(){
        loadFragment(new MainFragment());
    }
}