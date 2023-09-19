package com.example.myprecious.actors;

import java.io.Serializable;

public class Actor implements Serializable {

    private String name;
    private String lastname;
    private String alias;
    private String race;
    private Integer image;
    private int health;
    private int power;

    public Actor() {
    }

    public Actor(String name, String lastname, String alias, String race, Integer image, int health, int power) {
        this.name = name;
        this.lastname = lastname;
        this.alias = alias;
        this.race = race;
        this.image = image;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
