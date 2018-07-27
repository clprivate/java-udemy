package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic", "white bread","chicken",3.56);

        hamburger.addAddition1("tomato", .11);
        hamburger.addAddition2("lettuce",.22);
        hamburger.addAddition3("onion",.33);
        hamburger.addAddition4("pickle",.44);
        double price = hamburger.itemizeHamburger();
    }
}
