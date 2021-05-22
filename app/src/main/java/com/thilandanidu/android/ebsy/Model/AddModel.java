package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class AddModel {

    private ArrayList<advertisementCreate>advertisementCreate;

    public ArrayList<com.thilandanidu.android.ebsy.Model.advertisementCreate> getAdvertisementCreate() {
        return advertisementCreate;
    }

    public void setAdvertisementCreate(ArrayList<com.thilandanidu.android.ebsy.Model.advertisementCreate> advertisementCreate) {
        this.advertisementCreate = advertisementCreate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
