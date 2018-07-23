package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);
        Monitor theMonitor = new Monitor("27inM","Acer",27,new Resolution(2540,1440)); // Use the 'new' keyword to create an instance of a class without using a variable.
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        // Access the methods of subclasses:
//        thePC.getTheMonitor().drawPixelAt(22,301,"purple");
//        thePC.getTheMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUP();
    }
}
