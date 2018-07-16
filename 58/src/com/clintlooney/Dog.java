package com.clintlooney;

import javax.xml.bind.SchemaOutputResolver;

public class Dog extends Animal {
    // Unique characteristics
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Default constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        super.eat(); // Call the eat method of the super class (Animal)
    }

    public void walk() {
        System.out.println("dog.walk() called");
        move(4);
    }

    public void run() {
        System.out.println("dog.run() called");
        move(10);
    }

    private void moveLegs (int speed) {
        System.out.println("dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
