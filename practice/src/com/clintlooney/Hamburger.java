package com.clintlooney;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private int basePrice;
//    private Addition addition1;
//    private Addition addition2;
//    private Addition addition3;
//    private Addition addition4;

    public Hamburger() {
        this("white bun","beef");
    }

    public Hamburger(String rollType, String meat) {
        this.name = "Classic Burger";
        this.basePrice = 5.50
        this.rollType = rollType;
        this.meat = meat;
    }


}
