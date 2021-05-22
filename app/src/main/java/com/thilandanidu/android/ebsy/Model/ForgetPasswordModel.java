package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class ForgetPasswordModel {

    private ArrayList<passwordResetEmail>passwordResetEmail;

    public ArrayList<com.thilandanidu.android.ebsy.Model.passwordResetEmail> getPasswordResetEmail() {
        return passwordResetEmail;
    }

    public void setPasswordResetEmail(ArrayList<com.thilandanidu.android.ebsy.Model.passwordResetEmail> passwordResetEmail) {
        this.passwordResetEmail = passwordResetEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
