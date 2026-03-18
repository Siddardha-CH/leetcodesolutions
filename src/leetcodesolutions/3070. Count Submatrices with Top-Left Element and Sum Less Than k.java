You are given a 0-indexed integer matrix grid and an integer k.

Return the number of submatrices that contain the top-left element of the grid, and have a sum less than or equal to k.





class Solution {
    public int countSubmatrices(int[][] grid, int k) {
         /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-03-18                                              #
        #                                                                       #
        #########################################################################
        */
        int ans = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (i > 0)
                    grid[i][j] += grid[i - 1][j];
                if (j > 0)
                    grid[i][j] += grid[i][j - 1];
                if (i > 0 && j > 0)
                    grid[i][j] -= grid[i - 1][j - 1];
                if (grid[i][j] <= k)
                    ans += 1;
            }
        return ans;
    }
}
