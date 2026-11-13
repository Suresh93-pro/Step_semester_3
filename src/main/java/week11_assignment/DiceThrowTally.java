import java.util.Scanner;

public class DiceThrowTally {
    static void diceSort(int[] rolls) {
        int[] count = new int[7];
        for (int roll : rolls) count[roll]++;
        System.out.print("Counts: ");
        for (int i = 1; i <= 6; i++)
            System.out.print(i + ":" + count[i] + (i == 6 ? "\n" : " "));
        System.out.print("Sorted: ");
        boolean first = true;
        for (int i = 1; i <= 6; i++)
            for (int j = 0; j < count[i]; j++) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rolls = new int[n];
        for (int i = 0; i < n; i++) rolls[i] = sc.nextInt();
        diceSort(rolls);
    }
}