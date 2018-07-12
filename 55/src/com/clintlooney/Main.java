package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        // Calling the setMOdel method for the porsche object and updating its model field with the value carrera
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

    }
}
