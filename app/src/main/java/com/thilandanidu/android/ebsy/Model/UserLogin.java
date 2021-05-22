package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class UserLogin {

    private ArrayList<login>login;

    public ArrayList<com.thilandanidu.android.ebsy.Model.login> getLogin() {
        return login;
    }

    public void setLogin(ArrayList<com.thilandanidu.android.ebsy.Model.login> login) {
        this.login = login;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
