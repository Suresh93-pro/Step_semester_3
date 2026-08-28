package org.example.assignment.category.problemsC1.level1;

public class VotingEligibilityChecker {


    static void checkVotingEligibility(int age) {

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {

        checkVotingEligibility(20);
        checkVotingEligibility(16);
    }
}
