package com.beejavalearning;

public class Messages {
    final String wrongAnswer = "Seriously? NO!";
    final String correctAnswer = "YES! You are correct";
    final String newTurn = "--- NEW TURN ---";
    final String gameOver = "--- GAME OVER ---";
    final String goodBye = "--- GOOD BYE! ---";
    protected String printoutMessage = "";

    public void generateMessage() {
        System.out.println("--- NEW GAME ---");
    }

    public void generateMessage(String message){
        printoutMessage = message == "new turn"? newTurn : gameOver + "\n" + goodBye;
        System.out.println(printoutMessage);
    }

    public void generateMessage(String player, String message) {
        printoutMessage = message == "correct"? correctAnswer : wrongAnswer;
        System.out.println(printoutMessage);
    }

    public void generateMessage(String firstPlayer, int firstLive, String secondPlayer, int secondLive) {
        System.out.println(firstPlayer + " wins with a score of " + firstLive + " / " +
                secondPlayer + " with a score of " + secondLive);
    }

    public void generateMessage(String firstPlayer, int firstLive, String secondPlayer, int secondLive, int initialLive) {
        System.out.println(firstPlayer + ": " + firstLive + " / " + initialLive + " VS " +
                            secondPlayer + ": " + secondLive + " / " + initialLive + "\n\n***************************\n");
    }
}