package com.example.myprecious.items.weapons;

import com.example.myprecious.R;
import com.example.myprecious.items.Item;

public class DefenceWeapon extends Item {
    private int defence_power;

    public DefenceWeapon(String description, int amount, int image, int defence_power) {
        super(description, amount, image);
        this.defence_power = defence_power;
    }

    public int getDefence_power() {
        return defence_power;
    }

    public void setDefence_power(int defence_power) {
        this.defence_power = defence_power;
    }
    // defence weapon...
    public static class BoromirShield extends DefenceWeapon {
        public BoromirShield() {
            super("shield", 1, R.drawable.boromirs_shield, 150);
        }
    }
}
