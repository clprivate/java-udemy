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

    public void powerUP() {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        System.out.println("drawlogo() called.");
        // You can use a getter
//        getTheMonitor().drawPixelAt(3,15,"red");
        // OR access it directly
         theMonitor.drawPixelAt(3,15,"red");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }

    private Motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
