package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class DeleteSellerAdd {
    private ArrayList<advertisementDelete>advertisementDelete;

    public ArrayList<com.thilandanidu.android.ebsy.Model.advertisementDelete> getAdvertisementDelete() {
        return advertisementDelete;
    }

    public void setAdvertisementDelete(ArrayList<com.thilandanidu.android.ebsy.Model.advertisementDelete> advertisementDelete) {
        this.advertisementDelete = advertisementDelete;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
