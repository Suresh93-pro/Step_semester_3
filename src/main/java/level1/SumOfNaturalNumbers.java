package org.example.assignment.category.problemsC1.level1;

public class SumOfNaturalNumbers {

    static void sumOfNaturalNumbers(int n) {

        int counter = 1;
        int sum = 0;

        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }

        System.out.println("Sum of numbers from 1 to "
                + n + " = " + sum);
    }

    public static void main(String[] args) {

        sumOfNaturalNumbers(5);
    }





}
