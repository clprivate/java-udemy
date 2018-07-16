package com.clintlooney;

public class Animal {
    private String name;
    private int brain;
    private int brody;
    private int size;
    private int weight;

    public Animal(String name, int brain, int brody, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.brody = brody;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("animal.eat() called");
        System.out.println(this.name + " has eatern\n");
    }

    public void move(int speed) {
        System.out.println("animal.move() called");
        System.out.println(this.name + " is moving at " + speed + " miles per hour\n");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBrody() {
        return brody;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
