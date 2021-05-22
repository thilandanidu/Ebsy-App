package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class OrderUpdates {

    private ArrayList<orderUpdate>orderUpdate;

    public ArrayList<com.thilandanidu.android.ebsy.Model.orderUpdate> getOrderUpdate() {
        return orderUpdate;
    }

    public void setOrderUpdate(ArrayList<com.thilandanidu.android.ebsy.Model.orderUpdate> orderUpdate) {
        this.orderUpdate = orderUpdate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
