package com.example.myprecious.map;

public class Map {
    private String description;
    private Integer map;


    public Map() {
    }

    public Map(String description, Integer map) {
        this.description = description;
        this.map = map;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMap() {
        return map;
    }

    public void setMap(Integer map) {
        this.map = map;
    }
}
