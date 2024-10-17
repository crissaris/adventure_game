package com.example.myprecious.items.weapons;

import com.example.myprecious.R;
import com.example.myprecious.items.Item;

public class Weapon extends Item {
    private int power;

    public Weapon(String description, int amount, int image, int power) {
        super(description, amount, image);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    // swords
    // frodo
    public static class Sting extends Weapon{
        public Sting() {
            super("Sting", 1, R.drawable.sting,50);
        }
    }
    // galadriel
    public static class DaggerOfFinrod extends Weapon {
        public DaggerOfFinrod() {
            super("Finrod dagger", 1, R.drawable.finrod_dagger,100);
        }
    }
    // elf
    public static class Orcrist extends Weapon {
        public Orcrist() {
            super("orcrist", 1, R.drawable.orcrist,90);
        }
    }
    //gandalf
    public static class Glamdring extends Weapon {
        public Glamdring() {
            super("Glamdring", 1, R.drawable.glamdring, 350);
        }
    }
    //aragorn
    public static class Anduril extends Weapon {
        public Anduril(){
            super("Anduril", 1, R.drawable.anduril,300);
        }
    }
    public static class AragornsDagger extends Weapon {
        public AragornsDagger() {
            super("strider", 1, R.drawable.strider,80);
        }
    }
    // legolas
    public static class LongKnives extends Weapon {
        public LongKnives() {
            super("combat knives", 2, R.drawable.combat_knives,60);
        }
    }
    //men
    public static class GodorianSword extends Weapon {
        public GodorianSword() {
            super("Godorian sword", 1, R.drawable.godorian_sword,100);
        }
    }
    //gimli
    public static class DoubleAxe extends Weapon {
        public DoubleAxe() {
            super("double axe", 1, R.drawable.double_axe, 200);
        }
    }
    public static class BeardedAxe extends Weapon {
        public BeardedAxe() {
            super("bearded axe", 1, R.drawable.bearded_axe, 100);
        }
    }
    public static class WalkingAxe extends Weapon {
        public WalkingAxe(){
            super("walking axe", 1, R.drawable.walking_axe, 100);
        }
    }
}
