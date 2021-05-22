package com.thilandanidu.android.ebsy.Model;

import java.util.ArrayList;

public class VehicleTypeModel {

   private ArrayList<vehicleTypes>vehicleTypes;

    public ArrayList<com.thilandanidu.android.ebsy.Model.vehicleTypes> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(ArrayList<com.thilandanidu.android.ebsy.Model.vehicleTypes> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
