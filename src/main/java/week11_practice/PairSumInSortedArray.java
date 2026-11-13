import java.util.Scanner;

public class PairSumInSortedArray {
    static String pairSumSorted(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            long sum = (long) nums[left] + nums[right];
            if (sum == target) return "(" + nums[left] + ", " + nums[right] + ")";
            if (sum < target) left++;
            else right--;
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(pairSumSorted(nums, sc.nextInt()));
    }
}