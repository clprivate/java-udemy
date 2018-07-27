package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic", "white bread","sausage",3.56);

        hamburger.addAddition1("tomato", 0.27);
        hamburger.addAddition2("lettuce",0.75);
        hamburger.addAddition3("cheese",1.13);
        System.out.println("Total price: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("bacon",5.67);
        healthyBurger.addHealthyAddition1("egg",5.43);
        healthyBurger.addHealthyAddition2("lentils",3.41);
        healthyBurger.itemizeHamburger();

    }
}
