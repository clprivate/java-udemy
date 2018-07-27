package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Car1",13);
        car.accelerate();
        car.startEngine();
        car.brake();

        SmartCar euroCab = new SmartCar();
        euroCab.accelerate();
        euroCab.brake();
        System.out.println(euroCab.getCylinders());

        Pickup pickup = new Pickup();
        pickup.accelerate();
        pickup.brake();
        pickup.startEngine();
        System.out.println(pickup.getName());
        System.out.println(pickup.getCylinders());

    }
}
