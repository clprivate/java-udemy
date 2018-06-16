 package com.company;

public class Main {

    public static void main(String[] args) {
        // Just running the method:
        // calculateScore("Clint", 500);
        // Storing method's return value in an int for later use:
        // int newScore = calculateScore("Clint", 1000);
        // System.out.println(newScore);
        // Calling with single parameter:
        // calculateScore(75);
        // Calling without parameters:
        calculateScore();

    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player: " + playerName + "\nScore: " + score);
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed player" + "\nScore: " + score);
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player name or score entered.");
        return 0;
    }
}
