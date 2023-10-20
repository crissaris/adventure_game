package com.example.myprecious.map.areas.hobittons;

import com.example.myprecious.map.areas.*;
import com.example.myprecious.map.building.*;
import com.example.myprecious.map.building.hobbiton_buildings.*;


public class Hobbiton extends Area {
    private static Building bagEnd  = new BagEnd();
    private static Building oldMill = new OldMill();
    private static Building greenDragon = new GreenDragon();
    private static Building partyTree = new PartyTree();
    public Hobbiton() {
        super("Hobbiton", "The home of many illustrious Hobbits." +
                "Notable locations in Hobbiton included the Old Mill and Bag End.");

        greenDragon.setNorthBuilding(oldMill);
        greenDragon.setSouthBuilding(new NoBuilding());
        greenDragon.setWestBuilding(new NoBuilding());
        greenDragon.setEastBuilding(new NoBuilding());
        oldMill.setSouthBuilding(new NoBuilding());
        oldMill.setEastBuilding(partyTree);
        oldMill.setWestBuilding(new NoBuilding());
        partyTree.setNorthBuilding(bagEnd);
        partyTree.setSouthBuilding(new NoBuilding());
        partyTree.setEastBuilding(new NoBuilding());
        bagEnd.setNorthBuilding(new NoBuilding());
        bagEnd.setEastBuilding(new NoBuilding());
        bagEnd.setWestBuilding(new NoBuilding());
    }

}
