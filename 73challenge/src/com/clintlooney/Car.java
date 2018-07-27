package com.clintlooney;

import javax.xml.bind.SchemaOutputResolver;

public class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car() { // Default constructor
        this("Unknown name", 6);
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() called");
        System.out.println("Engine is running");
    }

    public void accelerate() {
        System.out.println("Car.accelerate() called");
        System.out.println("Speeding up");
    }

    public void brake() {
        System.out.println("Car.brake() called");
        System.out.println("Stopped");
    }
}

class SmartCar extends Car {
    public SmartCar() {
        super("Smart car",2);
    }

    @Override
    public void accelerate() {
        System.out.println("SmartCar.accelerate() called");
        System.out.println("Speeding up");
    }
}

class Pickup extends Car{
    public Pickup() {
        super("Pickup truck",8);
    }

    @Override
    public void brake() {
        System.out.println("Pickup.brake() called");
        System.out.println("Braking the truck");
    }
}

class Prius extends Car {
    public Prius() {
        super("Prius",6);
    }

    @Override
    public void accelerate() {
        System.out.println("Prius.accelerate() called");
        System.out.println("Speeding up the Prius");
    }
}

//public class Prius extends Car {
//
//}
//
//class Jaws extends Movie {
//    public Jaws() {
//        super("Jaws");
//    }
//
//    @Override
//    public String plot() {
//        return "People flee a shark";
//    }
//}