package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class CustomerRegisterModel {

    private ArrayList<register> register;

    public ArrayList<com.thilandanidu.android.ebsy.Model.register> getRegister() {
        return register;
    }

    public void setRegister(ArrayList<com.thilandanidu.android.ebsy.Model.register> register) {
        this.register = register;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
