package main.java.com.ter.service;

import java.util.ArrayList;
import java.util.List;

public class AnswerSolution {


    List<String> solution = new ArrayList<>();
    private final String explanation = "1. A, B, E. Option A is valid because you can use the dollar sign in identifiers. Option B is valid because you can use an underscore in identifiers. Option C is not a valid identifier because true is a Java reserved word. Option D is not valid because the dot (.) is not allowed in identifiers. Option E is valid because Java is case sensitive, so Public is not a reserved word and therefore a valid identifier. Option F is not valid because the first character is not a letter, $, or _.";

    public AnswerSolution() {
        solution.add("A");
        solution.add("B");
        solution.add("E");
    }

    public List<String> getSolution() {
        return solution;
    }

    public String getExplanation() {
        return explanation;
    }
}
