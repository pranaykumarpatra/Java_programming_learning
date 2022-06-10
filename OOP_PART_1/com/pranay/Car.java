package com.pranay;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    /*all the private objects only can be access inside this class car you can't call them outside the class */


    // here we are creating an access modifier to access them outside the class in main class
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else {
            this.model = "unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
