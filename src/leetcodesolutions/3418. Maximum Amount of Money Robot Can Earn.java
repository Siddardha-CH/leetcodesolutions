You are given an m x n grid. A robot starts at the top-left corner of the grid (0, 0) and wants to reach the bottom-right corner (m - 1, n - 1). The robot can move either right or down at any point in time.

The grid contains a value coins[i][j] in each cell:

If coins[i][j] >= 0, the robot gains that many coins.
If coins[i][j] < 0, the robot encounters a robber, and the robber steals the absolute value of coins[i][j] coins.
The robot has a special ability to neutralize robbers in at most 2 cells on its path, preventing them from stealing coins in those cells.

Note: The robot's total coins can be negative.

Return the maximum profit the robot can gain on the route.




class Solution {
    public int maximumAmount(int[][] coins) {
/*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-02                                             #
        #                                                                       #
        #########################################################################
        */

        int m = coins.length;
        int n = coins[0].length;
        int[][][] dp = new int[m][n][3];     // 0 -> no neutalize  | 1 -> 1 neutalize  | 2 -> 2 neutralize total 3 states
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < 3; k++)
                    dp[i][j][k] = Integer.MIN_VALUE;
        
        for (int i = 0; i < 3; i++) {
            if (coins[0][0] >= 0)
                dp[0][0][i] = coins[0][0];
            else 
                if (i > 0)
                    dp[0][0][i] = 0;
                else
                    dp[0][0][i] = coins[0][0];
        }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) 
                for (int k = 0; k < 3; k++)
                    if (i == 0 && j == 0)
                        continue;
                    else {
                        int a = Integer.MIN_VALUE;

                        if (i > 0)
                            a = Math.max(a, dp[i - 1][j][k]);
                        if (j > 0)
                            a = Math.max(a, dp[i][j - 1][k]);

                        dp[i][j][k] = Math.max(dp[i][j][k], a + coins[i][j]);

                        if (coins[i][j] < 0 && k > 0) {
                            int b = Integer.MIN_VALUE;

                            if (i > 0)
                                b = Math.max(b, dp[i - 1][j][k - 1]);
                            if (j > 0)
                                b = Math.max(b, dp[i][j - 1][k - 1]);

                            dp[i][j][k] = Math.max(dp[i][j][k], b);
                        }
                    }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            ans = Math.max(ans, dp[m - 1][n - 1][i]);
        }
        return ans;
    }
}
