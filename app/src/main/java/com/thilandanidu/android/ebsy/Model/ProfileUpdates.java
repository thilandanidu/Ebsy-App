package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class ProfileUpdates {

    private ArrayList<profileUpdate>profileUpdate;

    public ArrayList<com.thilandanidu.android.ebsy.Model.profileUpdate> getProfileUpdate() {
        return profileUpdate;
    }

    public void setProfileUpdate(ArrayList<com.thilandanidu.android.ebsy.Model.profileUpdate> profileUpdate) {
        this.profileUpdate = profileUpdate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
