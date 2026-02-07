You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). 
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The testcases are generated so that the answer will be less than or equal to 2 * 109.



-----------------------------------SOLUTION-------------------------------------



  class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if (grid[0][0] == 1)
            return 0;
        // int[][] dp = new int[grid.length][grid[0].length];
        // dp[0][0] = 1;
        // for (int i = 1; i < grid.length; i++)
        //     if (grid[i][0] != 1)
        //         dp[i][0] = dp[i - 1][0];
        // for (int i = 1; i < grid[0].length; i++)
        //     if (grid[0][i] != 1)
        //         dp[0][i] = dp[0][i - 1];
        // for (int i = 1; i < grid.length; i++)
        //     for (int j = 1; j < grid[0].length; j++)
        //         if (grid[i][j] == 0)
        //             dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        // return dp[grid.length - 1][grid[0].length - 1];


        int[] dp = new int[grid[0].length];
        dp[0] = 1;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1)
                    dp[j] = 0;
                else
                    if (j > 0)
                        dp[j] += dp[j - 1];
        return dp[grid[0].length - 1];
    }
}
