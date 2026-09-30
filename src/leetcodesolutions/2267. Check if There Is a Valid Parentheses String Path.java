A parentheses string is a non-empty string consisting only of '(' and ')'. It is valid if any of the following conditions is true:

It is ().
It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
It can be written as (A), where A is a valid parentheses string.
You are given an m x n matrix of parentheses grid. A valid parentheses string path in the grid is a path satisfying all of the following conditions:

The path starts from the upper left cell (0, 0).
The path ends at the bottom-right cell (m - 1, n - 1).
The path only ever moves down or right.
The resulting parentheses string formed by the path is valid.
Return true if there exists a valid parentheses string path in the grid. Otherwise, return false.





// class Solution {
//     public boolean hasValidPath(char[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
//         if (grid[n - 1][m - 1] == '(' || grid[0][0] == ')')
//             return false;
//         return func(grid, 0, 0, 0);
//     }
//     public boolean func(char[][] grid, int i, int j, int cnt) {
//         if (grid[i][j] == '(')
//             cnt += 1;
//         else
//             cnt -= 1;
//         if (cnt < 0)
//             return false;
//         if (i == grid.length - 1 && j == grid[0].length - 1 && cnt == 0)
//             return true;
//         if (i + 1 != grid.length)
//             if (func(grid, i + 1, j, cnt))
//                 return true;
//         if (j + 1 != grid[0].length)
//             if (func(grid, i, j + 1, cnt))
//                 return true;
//         return false;
//     }
// }  TLE







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
        #  Date        : 2026-30-08                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (grid[n - 1][m - 1] == '(' || grid[0][0] == ')' || (m + n - 1) % 2 == 1)
            return false;
        int[][][] dp = new int[101][101][201]; // i max 100 , j max 100, i + j states total 200
        for (int[][] i : dp)
            for (int[] j : i)
                Arrays.fill(j , -1);
        return func(grid, 0, 0, 0, dp);
    }
    public boolean func(char[][] g, int i, int j, int cnt, int[][][] dp) {
        if (g[i][j] == '(')
            cnt += 1;
        else
            cnt -= 1;
        if (cnt < 0)
            return false;
        if (dp[i][j][cnt] != -1) {
            if (dp[i][j][cnt] == 1)
                return true;
            return false;
        }
        if (i == g.length - 1 && j == g[0].length - 1) {
            if (cnt == 0) {
                dp[i][j][cnt] = 1;
                return true;
            }
        }
        if (i + 1 != g.length) {
            if (func(g, i + 1, j, cnt, dp)) {
                dp[i][j][cnt] = 1;
                return true;
            }
        }
        if (j + 1 != g[0].length) {
            if (func(g, i, j + 1, cnt, dp)) {
                dp[i][j][cnt] = 1;
                return true;
            }
        }
        dp[i][j][cnt] = 0;
        return false;
    }
}
