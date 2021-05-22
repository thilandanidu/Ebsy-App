package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class categories {

    private int id;
    private String name;
    private ArrayList<images> images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<com.thilandanidu.android.ebsy.Model.images> getImages() {
        return images;
    }

    public void setImages(ArrayList<com.thilandanidu.android.ebsy.Model.images> images) {
        this.images = images;
    }


}
