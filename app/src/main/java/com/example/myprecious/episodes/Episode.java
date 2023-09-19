package com.example.myprecious.episodes;

import com.example.myprecious.scenes.Scene;

import java.io.Serializable;

public class Episode implements Serializable {

    private String title;
    private int image;
    private Scene prologue;
    private boolean ifPrologue;


    public Episode(String narrator) {

    }

    public Episode(String title, int image, Scene scene, boolean ifPrologue) {
        this.title = title;
        this.image = image;
        this.prologue = scene;
        this.ifPrologue = ifPrologue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setIfPrologue(boolean ifPrologue) {
        this.ifPrologue = ifPrologue;
    }
    public boolean isIfPrologue() {
        return ifPrologue;
    }


    public Scene getPrologue() {
        return prologue;
    }

    public void setPrologue(Scene prologue) {
        this.prologue = prologue;
    }
}
