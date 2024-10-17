package com.example.myprecious.containers;

import android.content.ClipData;

import com.example.myprecious.dictionary.Category;
import com.example.myprecious.items.Item;

import java.io.Serializable;
import java.util.HashMap;

public class Container  {

    private String description;
    private int tonnage;
    private HashMap<Item, Category> container;

    public Container() {
    }

    public Container(String description, int tonnage, HashMap<Item, Category> container) {
        this.description = description;
        this.tonnage = tonnage;
        this.container = container;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTonnage() {
        return tonnage;
    }


    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public HashMap<Item, Category> getContainer() {
        return container;
    }

    public void setContainer(HashMap<Item, Category> container) {
        this.container = container;
    }
}
