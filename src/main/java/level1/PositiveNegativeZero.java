package org.example.assignment.category.problemsC1.level1;

public class PositiveNegativeZero {

    static void classifyNumber(int number) {

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {

        classifyNumber(15);
        classifyNumber(-4);
        classifyNumber(0);
    }
}
