package com.clintlooney;

public class Prius extends Car {
    private int roadServiceMonths;

    public Prius(int roadServiceMonths) {
        super("Prius", "4WD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            shiftGears(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            shiftGears(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            shiftGears(3);
        } else {
            shiftGears(4);
        }

        if(newVelocity > 9) {
            changeVelocity(newVelocity, );
        }
    }
}
