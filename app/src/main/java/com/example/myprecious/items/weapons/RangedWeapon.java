package com.example.myprecious.items.weapons;

import com.example.myprecious.R;

public class RangedWeapon extends Weapon{
    private int arrows_amount;


    public RangedWeapon(String description, int amount, int image, int power, int arrows_amount) {
        super(description, amount, image, power);
        this.arrows_amount = arrows_amount;
    }

    public int getArrows_amount() {
        return arrows_amount;
    }

    public void setArrows_amount(int arrows_amount) {
        this.arrows_amount = arrows_amount;
    }
    // bow's...
    // legolas
    public static class BowOfGaladhrim extends RangedWeapon {
        public BowOfGaladhrim() {
            super("Bow of the Galadhrim", 1, R.drawable.bow_of_the_galadhrim,250, 21);
        }
    }
    //aragorn
    public static class RangerBow extends RangedWeapon {
        public RangerBow(){
            super("ranger bow", 1, R.drawable.ranger_bow, 150, 21);
        }
    }
    //men...
    public static class GondorianBow extends RangedWeapon {
        public GondorianBow() {
            super("Gondorian bow", 1, R.drawable.bow_of_gondor,150, 16);
        }
    }
    //orc...
    public static class OrcBow extends RangedWeapon {
        public OrcBow() {
            super("orkish bow", 1, R.drawable.orcish_bow,100, 11);
        }
    }
    // elf
    public static class LongRangeBow extends RangedWeapon {
        public LongRangeBow() {
            super("long range bow", 1, R.drawable.elven_long_range_bow,180, 21);
        }
    }
}
