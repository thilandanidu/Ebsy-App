package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class CategoryListModel {

    private ArrayList<categories>categories;

    public ArrayList<com.thilandanidu.android.ebsy.Model.categories> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<com.thilandanidu.android.ebsy.Model.categories> categories) {
        this.categories = categories;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;


}
