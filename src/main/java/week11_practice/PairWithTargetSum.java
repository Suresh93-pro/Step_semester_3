import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairWithTargetSum {
    static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (seen.contains(target - x)) return true;
            seen.add(x);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), target;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        target = sc.nextInt();
        System.out.println(hasPairWithSum(nums, target));
    }
}