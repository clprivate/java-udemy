package com.clintlooney;

public class Car extends Vehicle{
    private int doors;
    private String engineCapacity;

    public Car(String name,int doors,String engineCapacity){
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

}
