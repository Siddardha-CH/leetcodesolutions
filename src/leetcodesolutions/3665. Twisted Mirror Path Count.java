Given an m x n binary grid grid where:

grid[i][j] == 0 represents an empty cell, and
grid[i][j] == 1 represents a mirror.
A robot starts at the top-left corner of the grid (0, 0) and wants to reach the bottom-right corner (m - 1, n - 1). It can move only right or down. If the robot attempts to move into a mirror cell, it is reflected before entering that cell:

If it tries to move right into a mirror, it is turned down and moved into the cell directly below the mirror.
If it tries to move down into a mirror, it is turned right and moved into the cell directly to the right of the mirror.
If this reflection would cause the robot to move outside the grid boundaries, the path is considered invalid and should not be counted.

Return the number of unique valid paths from (0, 0) to (m - 1, n - 1).

Since the answer may be very large, return it modulo 109 + 7.

Note: If a reflection moves the robot into a mirror cell, the robot is immediately reflected again based on the direction it used to enter that mirror: if it entered while moving right, it will be turned down; if it entered while moving down, it will be turned right. This process will continue until either the last cell is reached, the robot moves out of bounds or the robot moves to a non-mirror cell.








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
        #  Date        : 2026-31-10                                               #
        #                                                                       #
        #########################################################################
        */
    int n, m;
    int mod = 1000000007;
    int left = 0;
    int top = 1;
    public int uniquePaths(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int[][][] dp = new int[n][m][2]; //2 states
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                Arrays.fill(dp[i][j], -1);
        return func (grid, 0, 0, left, dp);
    }
    public int func (int[][] grid, int i, int j, int oldpos, int[][][] dp) {
        if (i == n || j == m)
            return 0;
        if (i == n - 1 && j == m - 1)
            return 1;
        if (dp[i][j][oldpos] != -1)
            return dp[i][j][oldpos];
        if (grid[i][j] == 1) {
            if (oldpos == left) {
                int k = func (grid, i + 1, j, top, dp);
                dp[i][j][oldpos] = k;
                return k;
            }
            else {
                int k = func (grid, i, j + 1, left, dp);
                dp[i][j][oldpos] = k;
                return k;
            }
        }
        // if 0 no mirror
        int tot = 0;
        tot = (tot + func (grid, i + 1, j, top, dp)) % mod;
        tot = (tot + func (grid, i, j + 1, left, dp)) % mod;
        dp[i][j][oldpos] = tot;
        return tot;
    }
}
