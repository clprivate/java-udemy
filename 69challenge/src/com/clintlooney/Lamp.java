package com.clintlooney;

public class Lamp {
    private String style;
    private Boolean battery;
    private int globeRating;

    public Lamp(String style, Boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public void turnOn() {
        System.out.println("lamp -> turning on.");
    }

    public String getStyle() {
        return style;
    }

    public Boolean getBattery() {
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}
