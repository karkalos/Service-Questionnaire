package main.java.com.ter.service;

public class Answer {
    private final String answer = "1. Which of the following are valid Java identifiers? (Choose all that apply)";
    private Choice choice = new Choice();

    public String getAnswer() {
        return answer;
    }

    public Choice getChoice() {
        return choice;
    }
}
