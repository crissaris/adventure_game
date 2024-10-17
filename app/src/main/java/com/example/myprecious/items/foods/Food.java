package com.example.myprecious.items.foods;

import com.example.myprecious.R;
import com.example.myprecious.items.Item;

public class Food extends Item {

    private int calories;

    public Food(String description, int amount, int image, int calories) {
        super(description, amount, image);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    // foods..
    public static class  Cram extends Food{
        public Cram() {
            super("cram", 1, R.drawable.cram,20);
        }
    }
    public static class PettyDwarfRoot extends Food {
        public PettyDwarfRoot() {
            super("petty dwarf meal", 1, R.drawable.dwarf_meal, 60);
        }
    }
    public static class HoneyCake extends Food {
        public HoneyCake() {
            super("honey cake", 1, R.drawable.honey_cake, 35);
        }
    }
    public static class Lembas extends Food {
        public Lembas() {
            super("lembas bread", 2, R.drawable.lembas_bread,40);
        }
    }
    public static class Potato extends Food {
        public Potato(){
            super("potato", 1, R.drawable.potato,15);
        }
    }
    public static class Rabbit extends Food {
        public Rabbit(){
            super("rabbit", 1, R.drawable.rabbit_cooked,80);
        }
    }
}
