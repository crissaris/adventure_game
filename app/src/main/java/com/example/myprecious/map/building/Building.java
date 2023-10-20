package com.example.myprecious.map.building;

import java.io.Serializable;

public class Building implements Serializable {

    private String name;
    private String description;
    Building northBuilding;
    Building southBuilding;
    Building westBuilding;
    Building eastBuilding;

    public Building() {
    }

    public Building(String name, String description) {
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

    public Building getNorthBuilding() {
        return northBuilding;
    }

    public void setNorthBuilding(Building northBuilding) {
        this.northBuilding = northBuilding;
        northBuilding.southBuilding = this;
    }

    public Building getSouthBuilding() {
        return southBuilding;
    }

    public void setSouthBuilding(Building southBuilding) {
        this.southBuilding = southBuilding;
        southBuilding.northBuilding = this;
    }

    public Building getWestBuilding() {
        return westBuilding;
    }

    public void setWestBuilding(Building westBuilding) {
        this.westBuilding = westBuilding;
        westBuilding.eastBuilding = this;
    }

    public Building getEastBuilding() {
        return eastBuilding;
    }

    public void setEastBuilding(Building eastBuilding) {
        this.eastBuilding = eastBuilding;
        eastBuilding.westBuilding = this;
    }
}
