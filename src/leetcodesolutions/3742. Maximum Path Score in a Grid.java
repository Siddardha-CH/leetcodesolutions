You are given an m x n grid where each cell contains one of the values 0, 1, or 2. You are also given an integer k.

You start from the top-left corner (0, 0) and want to reach the bottom-right corner (m - 1, n - 1) by moving only right or down.

Each cell contributes a specific score and incurs an associated cost, according to their cell values:

0: adds 0 to your score and costs 0.
1: adds 1 to your score and costs 1.
2: adds 2 to your score and costs 1. ​​​​​​​
Return the maximum score achievable without exceeding a total cost of k, or -1 if no valid path exists.

Note: If you reach the last cell but the total cost exceeds k, the path is invalid.






class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-30                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][k + 1];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                for (int l = 0; l < k + 1; l++)
                    dp[i][j][l] = -1;

        int ans = sol(0, 0, dp, grid, k, m, n);

        if (ans >= 0)
            return ans;
        return -1;
    }

    public int sol(int i,  int j, int[][][] dp, int[][] grid, int k, int m, int n) {
        if (k < 0)
            return -9999999;
        if (i == m || j == n)
            return -9999999;
        
        if (i == m - 1 && j == n - 1)
            if (Math.min(1, grid[i][j]) <= k)
                return grid[i][j];
            else
                return -9999999;

        if (dp[i][j][k] != -1)
            return dp[i][j][k];

        int r = sol(i + 1, j, dp, grid, k - Math.min(grid[i][j], 1), m, n);
        int d = sol(i, j + 1, dp, grid, k - Math.min(grid[i][j], 1), m, n);

        int nn = Math.max(r, d);

        if (nn == -9999999)
            dp[i][j][k] = -9999999;
        else
            dp[i][j][k] = nn + grid[i][j];

        return dp[i][j][k];
    }
}
