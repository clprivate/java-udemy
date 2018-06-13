package com.clintlooney;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        String salName = "Sal";
        int salScore = 1500;
        int salPosition = calculateHighScore(salScore);
        displayHighScorePosition(salName, salPosition);

        String mayaName = "Maya";
        int mayaScore = 900;
        int mayaPosition = calculateHighScore(mayaScore);
        displayHighScorePosition(mayaName, mayaPosition);


        String zeroName = "Zero";
        int zeroScore = 400;
        int zeroPosition = calculateHighScore(zeroScore);
        displayHighScorePosition(zeroName, zeroPosition);

        String axtonName = "Axton";
        int axtonScore = 50;
        int axtonPosition = calculateHighScore(axtonScore);
        displayHighScorePosition(axtonName, axtonPosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            return score + (levelCompleted * bonus);
        } else {
            return -1;
        }

    }

    private static int calculateHighScore (int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        // You don't kneed an else. You can just have the else condition be the return listed below, thus:
//        return 4;

        int position = 4; // We assume position 4 will be returned.
        if (score >= 1000) {
            position = 1;
        } else if (score >=500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;


    }

    public static void displayHighScorePosition (String playerName, int highScorePosition) {
        System.out.println(playerName + " reached high score position " + highScorePosition + ".");

    }
}

