package com.beejavalearning;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;

abstract class QuestionsAnswers {
    public abstract String generateQuestion();
    public abstract double generateAnswer();
}

class MathQuestions extends QuestionsAnswers {
    Random random = new Random();
    int val1 = random.nextInt(20) + 1;
    int val2 = random.nextInt(20) + 1;
    String[] operands = {"+", "-", "*", "/"};
    int currentIndex = random.nextInt(4);
    String currentOperand = operands[currentIndex];

    public String generateQuestion() {
        String question = "What does " + val1 + " " + currentOperand + " " + val2 + " equal?";
        return question;
    }

    public double generateAnswer() {
        double answer = 0d;
        switch (currentOperand) {
            case "+":
                answer = val1 + val2;
                break;
            case "-":
                answer = val1 - val2;
                break;
            case "*":
                answer = val1 * val2;
                break;
            case "/":
                answer = (double)val1 / val2;
        }
        BigDecimal bigdecimal = new BigDecimal(answer);
        MathContext mc = new MathContext(3);
        BigDecimal roundedBigDecimal = bigdecimal.round(mc);
        double roundedAnswer = roundedBigDecimal.doubleValue();
        return roundedAnswer;
    }
}
