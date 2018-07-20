package com.clintlooney;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase,Monitor theMonitor,Motherboard theMotherboard) {
        // Observe composition at work. Each PC isntance has a base, monitor and motherboard class.
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
