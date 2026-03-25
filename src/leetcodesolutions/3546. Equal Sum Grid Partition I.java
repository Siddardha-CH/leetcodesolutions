You are given an m x n matrix grid of positive integers. Your task is to determine if it is possible to make either one horizontal or one vertical cut on the grid such that:

Each of the two resulting sections formed by the cut is non-empty.
The sum of the elements in both sections is equal.
Return true if such a partition exists; otherwise return false.




class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-03-25                                             #
        #                                                                       #
        #########################################################################
        */
        int m = grid.length;
        int n = grid[0].length;
        long[] r = new long[m];
        long[] c = new long[n];
        for (int i = 0; i < m; i++) {
            long s = 0;
            for (int j = 0; j < n; j++)
                s += grid[i][j];
            r[i] = s;
        }
        for (int i = 0; i < n; i++) {
            long s = 0;
            for (int j = 0; j < m; j++) 
                s += grid[j][i];
            c[i] = s;
        }   
        long s = r[0];
        long t = 0;
        for (int i = 1; i < m; i++)
            t += r[i];
        for (int i = 1; i < m; i++)
            if (t == s)
                return true;
            else {
                s += r[i];
                t -= r[i];
            }
        s = c[0];
        t = 0;
        for (int i = 1; i < n; i++)
            t += c[i];
        for (int i = 1; i < n; i++)
            if (t == s)
                return true;
            else {
                s += c[i];
                t -= c[i];
            }
        return false;
    }
}
