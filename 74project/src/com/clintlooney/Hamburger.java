package com.clintlooney;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private double basePrice;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addAddition1(String name,double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addAddition2(String name,double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addAddition3(String name,double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addAddition4(String name,double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name + " on a " + this.rollType + ", starting price " + this.basePrice);
        if (this.addition1Name != null) {
            System.out.println("Adding $" + addition1Price + " worth of " + addition1Name);
            hamburgerPrice += addition1Price;
        }
        if (this.addition2Name != null) {
            System.out.println("Adding $" + addition2Price + " worth of " + addition2Name);
            hamburgerPrice += addition2Price;
        }
        if (this.addition3Name != null) {
            System.out.println("Adding $" + addition3Price + " worth of " + addition3Name);
            hamburgerPrice += addition3Price;
        }
        if (this.addition4Name != null) {
            System.out.println("Adding $" + addition4Price + " worth of " + addition4Name);
            hamburgerPrice += addition4Price;
        }
        System.out.println("Total burger brice: $" + hamburgerPrice);
        return hamburgerPrice;
    }

    public Hamburger(String name,String rollType, String meat,double basePrice) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }
}
