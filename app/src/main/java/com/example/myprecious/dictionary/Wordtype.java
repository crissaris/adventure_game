package com.example.myprecious.dictionary;

public class Wordtype {
    private String string;
    private Category category;

    public Wordtype(String string, Category category) {
        this.string = string;
        this.category = category;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
