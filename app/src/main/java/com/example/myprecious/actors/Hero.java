package com.example.myprecious.actors;

import com.example.myprecious.map.areas.Area;
import com.example.myprecious.map.regions.Region;

import java.io.Serializable;

public class Hero implements Serializable {
    private Region region;
    private Area location;
    private Actor actor;

    public Hero(){

    }

    public Hero(Region region, Area location, Actor actor) {
        this.region = region;
        this.location = location;
        this.actor = actor;
    }

    public Area getLocation() {
        return location;
    }

    public void setLocation(Area location) {
        this.location = location;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
