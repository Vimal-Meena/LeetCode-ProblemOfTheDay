// #LeetCode:2373
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int ans[][] = new int[n - 2][n - 2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int max = grid[i][j];

                if ((i - 1 >= 0 && j - 1 >= 0) && (j + 1 < n && i + 1 < n)) {
                    max = Math.max(max, grid[i - 1][j - 1]);
                    max = Math.max(max, grid[i][j - 1]);
                    max = Math.max(max, grid[i + 1][j - 1]);
                    max = Math.max(max, grid[i - 1][j]);
                    max = Math.max(max, grid[i + 1][j]);
                    max = Math.max(max, grid[i - 1][j + 1]);
                    max = Math.max(max, grid[i][j + 1]);
                    max = Math.max(max, grid[i + 1][j + 1]);
                    ans[i - 1][j - 1] = max;
                }

            }

        }
        return ans;
    }
    public static void main(String args[]){
        int grid[][] = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };
        int n = grid.length;
        int ans[][] = new int[n - 2][n - 2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}