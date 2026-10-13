import java.util.*;

public class ClassAttendanceTracker {
    // Time O(n), extra space O(1); both results are found in one pass.
    static int[] attendanceSummary(int[] days) {
        int present = 0, streak = 0, longest = 0;
        for (int day : days) {
            if (day == 1) {
                present++;
                streak++;
                longest = Math.max(longest, streak);
            } else {
                streak = 0;
            }
        }
        return new int[]{present, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] days = new int[n];
        for (int i = 0; i < n; i++) days[i] = sc.nextInt();
        int[] result = attendanceSummary(days);
        System.out.printf("Present: %d, Longest streak: %d%n", result[0], result[1]);
    }
}