package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class createOrder {

    private ArrayList<orderCreate>orderCreate;

    public ArrayList<com.thilandanidu.android.ebsy.Model.orderCreate> getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(ArrayList<com.thilandanidu.android.ebsy.Model.orderCreate> orderCreate) {
        this.orderCreate = orderCreate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
