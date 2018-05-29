package com.company;

public class Main {

    public static void main(String[] args) {

        // ints have a width of 32
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;
        int divideInt = (minInt/2);

        // byte has a width of 8
        byte minByte = -128;
        byte maxByte = 127;
        // By default, when making an assignment in an expression, Java converts it to an int.
        // Thus, you must cast the right side of the below assignment as a byte.
        byte divByte = (byte) (minByte/2);
        // Bytes take aboue 1/4 the memory of ints.

        // shorts have a width of 16
        short minShort = -32768;
        short maxShort = 32767;
        // Short is twice the space of a byte and half the space of an int.
        // Use casting during assignemtn.
        short divShort = (short) (maxShort/2);

        // Long has wdith of 64, double the width of an int. Long can hold 2 to the power of 63.
        long minLong = -9_223_372_036_854_775_808L; // You can use lower or upper case L, but upper case is best practice.
        long maxLong = 9_223_372_036_854_775_807L;
        // Cast as long
        long divLong = (maxLong/2);
    }
}
