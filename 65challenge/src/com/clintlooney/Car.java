package com.clintlooney;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    // Default constructor
    public Car() {
        this("No name entered","No size entered",4,4,4,false);
    }

    public Car(String name, String size, int wheels,int doors, int gears, boolean isManual) {
        super(name,size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; // This was removed from the parameters because we wish to set is as 1 rather than taking input
    }

    // Change gear
    public void shiftGears(int gear) {
        if(gear > gears) {
            System.out.println("Invalid gear entered");
        } else {
            this.currentGear = gear;
            System.out.println("Car.setCurrentGear -- changed to gear: " + currentGear);
        }
    }

    // Change velocity
    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() called - Direction = " + direction + ", speed = " + speed);
        move(speed, direction);
    }
}
