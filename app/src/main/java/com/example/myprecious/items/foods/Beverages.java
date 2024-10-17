package com.example.myprecious.items.foods;

import com.example.myprecious.R;
import com.example.myprecious.items.Item;

public class Beverages extends Item {

    private int calories;

    public Beverages(String description, int amount, int image, int calories) {
        super(description, amount, image);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    // beverages...
    public class EntDraught extends Beverages {
        public EntDraught() {
            super("ent draught", 1, R.drawable.ent_draught, 10);
        }
    }
    public class Miruvor extends Beverages {
        public Miruvor() {
            super("miruvor", 1, R.drawable.miruvor,30);
        }
    }
    public class Water extends Beverages {
        public Water() {
            super("water", 1, R.drawable.water_flask,5);
        }
    }
}
