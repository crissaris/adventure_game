package com.example.myprecious.utilities;

import com.example.myprecious.episodes.Episode;

import java.util.ArrayList;

public class DataUtilities {

    private static DataUtilities instance;
    private ArrayList<Episode> arrayList;

    public static DataUtilities getInstance(){
        if(instance == null){
            instance = new DataUtilities();
        }
        return instance;
    }

    public ArrayList<Episode> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Episode> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Episode> setEpisodeInArrayList(Episode episode){
        ArrayList list = new ArrayList();
        list.add(episode);
        return list;
    }
}
