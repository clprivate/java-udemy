package com.clintlooney;

public class Vehicle {
    // State
    private String name;
    private String size;

    int currentVelocity;
    int currentDirection;

    // Behavior
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering to " + currentDirection + " degrees.");
    }

    public void move(int velocity, int currentDirection) {
        System.out.println("Vehicle.move(): Moving toward " + currentDirection + " degrees at " + currentVelocity + " degrees.");
    }

    public void stop() {
        this.currentVelocity = 0;
        System.out.println("Vehicle.stop() called - speed reduced t0 " + currentVelocity);
    }
    // Constructor
    public Vehicle(String name,String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}
