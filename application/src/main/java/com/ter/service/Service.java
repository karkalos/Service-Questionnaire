package main.java.com.ter.service;

import java.util.Scanner;

public class Service {

    Answer answer = new Answer();
    AnswerSolution answerSolution = new AnswerSolution();
    Question question = new Question();
    String customerAnswer;


    public void showQuestion() {
        System.out.println(question.getQuestion());
        System.out.println(answer.getAnswer());
        System.out.println(answer.getChoice());
        Scanner scanner = new Scanner(System.in);
        customerAnswer = scanner.nextLine();
        reviewAnswers();

    }


    public void reviewAnswers() {
        if (customerAnswer.equals(answerSolution.getSolution().get(1))) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong, correct answer is: " + answerSolution.getExplanation());
        }
    }


}
