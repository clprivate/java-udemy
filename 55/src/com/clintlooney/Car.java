package com.clintlooney;

public class Car {
    // State
    private int doord;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Behavior
    // Setters
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unspecified";
        }

    }
    // Getters
    public String getModel() {
        return this.model; // IntelliJ's popup suggestions put an f next to this.model to indicate it's a field. The padlock indicates it's a private method. The open padlock indicates a public method, meaning the method is accessible to other classes.
    }

}
