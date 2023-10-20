package com.example.myprecious.command;

import com.example.myprecious.actors.Hero;
import com.example.myprecious.map.areas.Area;
import com.example.myprecious.map.regions.Region;

public class GO implements Command{

    static Hero hero;
    static String direction;

    @Override
    public String execute() {
        switch (direction){
            case "north":
                return setLocation(hero.getLocation().getNorthArea());
            case "south":
                return setLocation(hero.getLocation().getSouthArea());
            case "west":
                return setLocation(hero.getLocation().getWestArea());
            case "east":
                return setLocation(hero.getLocation().getEastArea());
            default:
                return "The "+direction+" is not a direction";
        }
    }

    private String setLocation(Area area) {
        hero.setLocation(area);
        return "You are in "+hero.getRegion()+",\n"+
                "the "+hero.getLocation()+" area.\n";
    }

}
