import java.util.Scanner;

public class WarehouseBinGridScan {
    static int[] warehouseSummary(int[][] grid) {
        int total = 0, max = -1, maxRow = 0, maxCol = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];
                if (grid[i][j] > max) {
                    max = grid[i][j]; maxRow = i; maxCol = j;
                }
            }
        return new int[]{total, maxRow, maxCol};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) grid[i][j] = sc.nextInt();
        int[] ans = warehouseSummary(grid);
        System.out.println("total = " + ans[0] + ", maxCoordinate = (" + ans[1] + ", " + ans[2] + ")");
    }
}