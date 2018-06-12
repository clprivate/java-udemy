package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Score between 5k and 1k.");
        } else if (score < 1000) {
            System.out.println("Score beneath 1k.");
        } else {
            System.out.println("Default display");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score = " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (score < 5000 && score > 1000) {
            System.out.println("Score between 5k and 1k.");
        } else if (score < 1000) {
            System.out.println("Score beneath 1k.");
        } else {
            System.out.println("Default display");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score = " + finalScore);
        }

    }
}
