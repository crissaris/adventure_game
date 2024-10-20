package com.example.myprecious.items;

import com.example.myprecious.R;

public class MagicalItem extends Item {
    private String description;
    private int magical_power;

    public MagicalItem(String description, int amount, int image, String description1, int magical_power) {
        super(description, amount, image);
        this.description = description1;
        this.magical_power = magical_power;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public int getMagical_power() {
        return magical_power;
    }

    public void setMagical_power(int magical_power) {
        this.magical_power = magical_power;
    }
    // rings...
    // galadriel...
    public static class Nenya extends MagicalItem {
        public Nenya() {
            super("Nenya", 1, R.drawable.nenya, "the Ring of Adamant", 200);
        }
    }
    // gandalf...
    public static class Narya extends MagicalItem {
        public Narya() {
            super("Narya", 1, R.drawable.narya, " the Ring of Fire", 200);
        }
    }
    // elrond...
    public static class Vilya extends MagicalItem {
        public Vilya() {
            super("Vilya", 1, R.drawable.vylia, "the Ring of Air", 200);
        }
    }
    // aragorn
    public static class RingOfBarahir extends MagicalItem {
        public RingOfBarahir() {
            super("ring of Barahir", 1, R.drawable.ring_of_barahir, "ring of Barahir", 50);
        }
    }
    //frodo
    public static class OneRing extends MagicalItem {
        public OneRing() {
            super("precious", 1, R.drawable.one_ring, "the one Ring", 600);
        }
    }
    // legolas
    public static class ArrowRing extends MagicalItem {
        public ArrowRing() {
            super("arrow ring", 1, R.drawable.arrow_ring, "arrow ring", 100);
        }
    }
}
