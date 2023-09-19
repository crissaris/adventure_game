package com.example.myprecious.utilities;

import static com.example.myprecious.utilities.GameUtilities.handler;

import android.os.Handler;
import android.widget.TextView;

public class DelayUtility {

    public interface DelayCallback{
        void afterDelay();

    }

    public static void delay(int secs, final DelayCallback delayCallback){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                delayCallback.afterDelay();
            }
        }, secs * 70); // afterDelay will be executed after (secs*1000) milliseconds.
    }

    public static void displayTextWithDelay(String str, int textSize, long mils, TextView textView){
        int i = 0;
        textView.setTextSize(textSize);

        for(char ch : str.toCharArray()) {
            handler.postDelayed((Runnable) () -> {
                String string = textView.getText().toString();
                textView.setText(string + ch);
            }, mils * i);
            i++;
        }
    }
}
