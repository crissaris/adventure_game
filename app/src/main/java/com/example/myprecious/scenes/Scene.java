package com.example.myprecious.scenes;

import com.example.myprecious.actors.Actor;

import java.io.Serializable;
import java.util.ArrayList;

public class Scene implements Serializable {

    private Actor actor;
    private ArrayList<String> story;
    private ArrayList<Integer> images;

    public Scene() {
    }

    public Scene(Actor actor, ArrayList<String> story, ArrayList<Integer> images) {
        this.actor = actor;
        this.story = story;
        this.images = images;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public ArrayList<String> getStory() {
        return story;
    }

    public void setStory(ArrayList<String> story) {
        this.story = story;
    }

    public ArrayList<Integer> getImages() {
        return images;
    }

    public void setImages(ArrayList<Integer> images) {
        this.images = images;
    }
}
