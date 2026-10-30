You are given an m x n matrix grid and a positive integer k. An island is a group of positive integers (representing land) that are 4-directionally connected (horizontally or vertically).

The total value of an island is the sum of the values of all cells in the island.

Return the number of islands with a total value divisible by k.







class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-30-10                                               #
        #                                                                       #
        #########################################################################
        */
        int n, m;
    public int countIslands(int[][] grid, int k) {
        int ans = 0;
        n = grid.length;
        m = grid[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] > 0) {
                    long tot = dfs (grid, i, j);
                    if (tot % k == 0)
                        ans += 1;
                }
        return ans;
    }
    public long dfs (int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0)
            return 0;
        long sum = grid[i][j];
        grid[i][j] = 0; //updating the visited path
        sum += dfs(grid, i + 1, j);
        sum += dfs(grid, i - 1, j);
        sum += dfs(grid, i, j + 1);
        sum += dfs(grid, i, j - 1);
        return sum;
    }
}
