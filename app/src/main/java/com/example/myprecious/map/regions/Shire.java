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

public class Shire extends Region {

    private static Area hobbiton = new Hobbiton();
    private static Area overhill = new Overhill();
    private static Area tuckborough = new Tuckborough();
    private static Area frogmorton = new Frogmorton();
    private static Area theHill = new TheHill();
    private static Area budgeford = new Budgeford();
    private static Area stock = new Stock();
    private static Area michelDelving = new MichelDelving();
    private static Area littleDelving = new LittleDelving();


    public Shire() {
        super("Shire", "The country of the Shire is a land of peace and pastoral beauty," +
                "where hobbits dwell in seclusion from the world at large. ", R.drawable.shire);

        hobbiton.setNorthArea(theHill);
        hobbiton.setSouthArea(tuckborough);
        hobbiton.setWestArea(littleDelving);
        hobbiton.setEastArea(frogmorton);
        theHill.setNorthArea(overhill);
        theHill.setEastArea(new NoArea());
        theHill.setWestArea(new NoArea());
        overhill.setEastArea(new NoArea());
        overhill.setWestArea(new NoArea());
        overhill.setEastArea(new NoArea());
        tuckborough.setEastArea(new NoArea());
        tuckborough.setSouthArea(new NoArea());
        tuckborough.setWestArea(michelDelving);
        littleDelving.setNorthArea(new NoArea());
        littleDelving.setSouthArea(michelDelving);
        littleDelving.setWestArea(new NoArea());
        frogmorton.setNorthArea(new NoArea());
        frogmorton.setSouthArea(new NoArea());
        frogmorton.setEastArea(budgeford);
        michelDelving.setSouthArea(new NoArea());
        michelDelving.setWestArea(new NoArea());
        budgeford.setNorthArea(new NoArea());
        budgeford.setSouthArea(new NoArea());
        budgeford.setEastArea(stock);
        stock.setNorthArea(new NoArea());
        stock.setSouthArea(new NoArea());
        stock.setEastArea(new NoArea());

    }
}
