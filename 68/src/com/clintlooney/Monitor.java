package com.clintlooney;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution; // Resolution class is part of the monitor class. A monitor is not a resolution, but a monitor has a resolution. This is composition at work.

    public Monitor(String model,String manufacturer,int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing " + color + " pixel at " + x + " horizontal and " + y + " vertical");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
