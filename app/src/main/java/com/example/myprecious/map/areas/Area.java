package com.example.myprecious.map.areas;

import java.io.Serializable;

public class Area implements Serializable {
    private String name;
    private String description;
    Area northArea;
    Area southArea;
    Area westArea;
    Area eastArea;

    public Area() {
    }

    public Area(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNorthArea(Area northArea) {
        this.northArea = northArea;
        northArea.southArea = this;
    }

    public void setSouthArea(Area southArea) {
        this.southArea = southArea;
        southArea.northArea = this;
    }

    public void setWestArea(Area westArea) {
        this.westArea = westArea;
        westArea.eastArea = this;
    }

    public void setEastArea(Area eastArea) {
        this.eastArea = eastArea;
        eastArea.westArea = this;
    }
}
