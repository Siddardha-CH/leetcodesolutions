You are given an m x n integer matrix grid and an integer k.

For every contiguous k x k submatrix of grid, compute the minimum absolute difference between any two distinct values within that submatrix.

Return a 2D array ans of size (m - k + 1) x (n - k + 1), where ans[i][j] is the minimum absolute difference in the submatrix whose top-left corner is (i, j) in grid.

Note: If all elements in the submatrix have the same value, the answer will be 0.

A submatrix (x1, y1, x2, y2) is a matrix that is formed by choosing all cells matrix[x][y] where x1 <= x <= x2 and y1 <= y <= y2.





class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
         /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-03-20                                              #
        #                                                                       #
        #########################################################################
        */
        int m = grid.length;
        int n = grid[0].length;
        int ans[][] = new int[m + 1 - k][n + 1 - k]; 
        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                TreeSet<Integer> ts = new TreeSet<>();
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        ts.add(grid[x][y]);
                    }
                }
                int min = 999999999;
                Integer prev = null;
                for (Integer curr : ts) {
                    if (prev != null) {
                        min = Math.min(min,curr - prev);
                    }
                    prev = curr;
                }
                if (min == 999999999)
                    ans[i][j] = 0;
                else
                    ans[i][j] = min;
            }
        }
        return ans;
    }
}
