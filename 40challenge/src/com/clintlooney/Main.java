package com.clintlooney;

import javax.sql.rowset.BaseRowSet;

public class Main {

    public static void main(String[] args) {
        char char1 = 'g';
        switch (char1) {
            case 'a':
                System.out.println("Value a");
                break;
            case 'b':
                System.out.println("Value b");
                break;
            case 'c':
                System.out.println("Value c");
                break;
            case 'd':
                System.out.println("Value d");
                break;
            case 'e':
                System.out.println("Value e");
                break;
            default:
                System.out.println("Value not found");
                break;
        }
        String month = "JanUAry";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Unsupported month");
                break;
        }
    }
}
