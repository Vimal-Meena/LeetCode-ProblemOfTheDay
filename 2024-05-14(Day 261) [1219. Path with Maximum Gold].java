// #LeetCode 1219
class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxAns = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxAns = Math.max(maxAns, dfs(grid, i, j));
            }
        }
        return maxAns;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        int temp = grid[i][j];
        grid[i][j] = 0;
        int up = dfs(grid, i - 1, j);
        int down = dfs(grid, i + 1, j);
        int left = dfs(grid, i, j - 1);
        int right = dfs(grid, i, j + 1);
        grid[i][j] = temp;
        return temp + Math.max(Math.max(Math.max(up, down), left), right);
    }
}