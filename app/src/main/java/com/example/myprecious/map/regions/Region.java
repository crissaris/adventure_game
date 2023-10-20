package com.example.myprecious.map.regions;


import com.example.myprecious.R;
import com.example.myprecious.map.areas.Area;
import com.example.myprecious.map.areas.NoArea;
import com.example.myprecious.map.areas.hobittons.Budgeford;
import com.example.myprecious.map.areas.hobittons.Frogmorton;
import com.example.myprecious.map.areas.hobittons.Hobbiton;
import com.example.myprecious.map.areas.hobittons.LittleDelving;
import com.example.myprecious.map.areas.hobittons.MichelDelving;
import com.example.myprecious.map.areas.hobittons.Overhill;
import com.example.myprecious.map.areas.hobittons.Stock;
import com.example.myprecious.map.areas.hobittons.TheHill;
import com.example.myprecious.map.areas.hobittons.Tuckborough;


import java.io.Serializable;

public class Region implements Serializable {
    private String name;
    private String description;
    private Integer image;
    Region northRegion;
    Region southRegion;
    Region westRegion;
    Region eastRegion;

    public Region() {
    }

    public Region(String name, String description, Integer image) {
        this.name = name;
        this.description = description;
        this.image = image;
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

    public void setNorthRegion(Region northRegion) {
        this.northRegion = northRegion;
        northRegion.southRegion = this;
    }

    public void setSouthRegion(Region southRegion) {
        this.southRegion = southRegion;
        southRegion.northRegion = this;
    }

    public void setWestRegion(Region westRegion) {
        this.westRegion = westRegion;
        westRegion.eastRegion = this;
    }

    public void setEastRegion(Region eastRegion) {
        this.eastRegion = eastRegion;
        eastRegion.westRegion = this;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }


}

