package com.example.myprecious.items;

import com.example.myprecious.R;

import java.io.Serializable;

public class Item  {
    private String description;
    private int amount;
    private int image;

    public Item() {
    }

    public Item(String description, int amount, int image) {
        this.description = description;
        this.amount = amount;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    // items...
    public static class BookOfMazarbul extends Item{
        public BookOfMazarbul() {
            super("Book of Mazarbul", 1, R.drawable.book_of_mazarbul);
        }
    }
    public static class HornOfGondor extends Item{
        public HornOfGondor() {
            super("Horn of Gondor", 1, R.drawable.horn_of_gondor);
        }
    }
    public static class Pipe extends Item {
        public Pipe() {
            super("pipe", 1, R.drawable.pipe);
        }
    }
    public static class Smoke extends Item {
        public Smoke() {
            super("smoke pouch", 10, R.drawable.smoke_pouch);
        }
    }
    public static class EaredilLight extends Item {
        public EaredilLight() {
            super("earedil light", 1, R.drawable.earedil_light);
        }
    }
}
