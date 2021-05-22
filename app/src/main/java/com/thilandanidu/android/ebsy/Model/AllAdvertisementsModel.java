package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class AllAdvertisementsModel {

    private String message;

    public ArrayList<com.thilandanidu.android.ebsy.Model.advertisements> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(ArrayList<com.thilandanidu.android.ebsy.Model.advertisements> advertisements) {
        this.advertisements = advertisements;
    }

    private ArrayList<advertisements>advertisements;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
