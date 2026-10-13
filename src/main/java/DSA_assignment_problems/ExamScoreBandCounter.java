import java.util.*;

public class ExamScoreBandCounter {
    // lowerBound: first index with value >= target.
    static int lowerBound(int[] a, int target) {
        int left = 0, right = a.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    // upperBound: first index with value > target.
    static int upperBound(int[] a, int target) {
        int left = 0, right = a.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] > target) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    // Time O(log n), extra space O(1); a linear scan is O(n).
    static int countInBand(int[] scores, int low, int high) {
        return upperBound(scores, high) - lowerBound(scores, low);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();
        int low = sc.nextInt(), high = sc.nextInt();
        System.out.println(countInBand(scores, low, high));
    }
}