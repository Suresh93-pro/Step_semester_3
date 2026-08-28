package org.example.assignment.category.problemsC1.level3;

public class ATM_PINRetry {

    static void atmPinRetry(String correctPin, String[] attempts) {

        int attempt = 0;
        boolean success = false;

        while (attempt < attempts.length && attempt < 3 && !success) {

            if (attempts[attempt].equals(correctPin)) {

                success = true;
                System.out.println("PIN accepted");
                break;
            }

            attempt++;
        }

        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {

        String[] attempts1 = {"1111", "4821"};

        atmPinRetry("4821", attempts1);

        String[] attempts2 = {"1111", "2222", "3333"};

        atmPinRetry("4821", attempts2);
    }

}
