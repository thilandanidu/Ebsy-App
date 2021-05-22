package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class OrderList {

    private ArrayList<orders>orders;

    public ArrayList<com.thilandanidu.android.ebsy.Model.orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<com.thilandanidu.android.ebsy.Model.orders> orders) {
        this.orders = orders;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
