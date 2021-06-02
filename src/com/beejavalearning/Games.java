package com.beejavalearning;

import java.util.Scanner;

public class Games {
    Players player1 = new Players("Bee");
    Players player2 = new Players("Benj");
    String currentPlayer = player1.getName();
    Messages message = new Messages();

    public void playGame() {
        message.generateMessage();
        while (player1.getLives() > 0 && player2.getLives() > 0) {
            MathQuestions question = new MathQuestions();
            double correctAnswer = question.generateAnswer();
            Scanner input = new Scanner(System.in);
            System.out.println(currentPlayer + ": " + question.generateQuestion());
            double answer = input.nextDouble();
            if (correctAnswer == answer) {
                message.generateMessage(currentPlayer, "correct");
            } else {
                message.generateMessage(currentPlayer, "wrong");
                if (currentPlayer == player1.getName()) {
                    player2.setLives(player2.getLives()-1);
                } else {
                    player1.setLives(player1.getLives()-1);
                }
            }

            message.generateMessage(player1.getName(), player1.getLives(), player2.getName(), player2.getLives(), player1.initialLive);

            if (player1.getLives() > 0 && player2.getLives() > 0) {
                message.generateMessage("new turn");
            }

            currentPlayer = currentPlayer == player1.getName()? player2.getName() : player1.getName();

        }

        if (player1.getLives() > 0) {
            message.generateMessage(player1.getName(), player1.getLives(), player2.getName(), player2.getLives());
        } else {
            message.generateMessage(player2.getName(), player2.getLives(), player1.getName(), player1.getLives());
        }
        message.generateMessage("finish");
    }
}
