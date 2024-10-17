package com.example.myprecious.items.weapons;

import com.example.myprecious.R;

public class MagicalWeapon extends Weapon {
    private int magical_power;

    public MagicalWeapon(String description, int amount, int image, int power, int magical_power) {
        super(description, amount, image, power);
        this.magical_power = magical_power;
    }

    public int getMagical_power() {
        return magical_power;
    }

    public void setMagical_power(int magical_power) {
        this.magical_power = magical_power;
    }
    // magical weapons...
    //Gadalf
    public static class Tharkûn extends MagicalWeapon {
        public Tharkûn() {
            super("Tharkûn", 1, R.drawable.tarkun,150,  250);
        }
    }
    // Saruman
    public static class Tarindor extends MagicalWeapon {
        public Tarindor() {
            super("Tarindor", 1, R.drawable.taridor, 200, 350);
        }
    }

}
