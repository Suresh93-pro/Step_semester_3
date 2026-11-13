import java.util.Scanner;

public class BestSingleTradeProfit {
    static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, best = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            best = Math.max(best, price - min);
        }
        return best;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int[] prices = new int[n];
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();
        System.out.println(maxProfit(prices));
    }
}