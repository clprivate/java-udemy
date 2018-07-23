package com.clintlooney;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");
        Ceiling ceiling = new Ceiling(8,"blue");
        Bed clintsBed = new Bed("sturdy",4,2,2,1);
        Lamp lamp = new Lamp("modern",false,14);
        Bedroom bedroom = new Bedroom("Clint's room",wall1,wall2,wall3,wall4,ceiling,clintsBed,lamp);

        // By variable
        bedroom.makeBed();

        // By getter
        bedroom.getLamp().turnOn();

    }
}
