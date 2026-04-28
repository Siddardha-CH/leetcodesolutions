You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.

A uni-value grid is a grid where all the elements of it are equal.

Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.




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
        #  Date        : 2026-04-28                                             #
        #                                                                       #
        #########################################################################
        */
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] mat = new int[m * n];
        int ans = 0;

        int k = 0;

        for (int[] j : grid)
            for (int i : j)
                mat[k++] = i;

        Arrays.sort(mat);

        // fnding anamoly

        k = mat[0];

        for (int i : mat)
            if ((i - k) % x != 0)
                return -1;

        int mid = mat[n * m / 2];

        for (int i : mat)
            ans += (Math.abs(i - mid) / x);

        return ans;
    }
}
