You are given an m x n matrix grid of positive integers. Your task is to determine if it is possible to make either one horizontal or one vertical cut on the grid such that:

Each of the two resulting sections formed by the cut is non-empty.
The sum of elements in both sections is equal, or can be made equal by discounting at most one single cell in total (from either section).
If a cell is discounted, the rest of the section must remain connected.
Return true if such a partition exists; otherwise, return false.

Note: A section is connected if every cell in it can be reached from any other cell by moving up, down, left, or right through other cells in the section.




?? DIDNT SUBMIT DUE TO TLE





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
        #  Date        : 2026-03-26                                             #
        #                                                                       #
        #########################################################################
        */
        int m = grid.length;
        int n = grid[0].length;
        long[] r = new long[m];
        long[] c = new long[n];
        for (int i = 0; i < m; i++)                                    // CALCULATING ROW SUM
            for (int j = 0; j < n; j++)
                r[i] += grid[i][j];
        for (int i = 0; i < n; i++)                                    // CALCULATING COLUMN SUM
            for (int j = 0; j < m; j++)
                c[i] += grid[j][i];
        
        long top = 0;
        long tot = 0;
        for (long i : r)
            tot += i;
        
        for (int i = 0; i < m - 1; i++) {                                  // CHECKING FOR ROW CUTS
            top += r[i];
            long bottom = tot - top;
            if (top == bottom)
                return true;

            long diff = Math.abs(top - bottom);

            if (top > bottom) {
                if (diff_exists(grid, 0, i + 1, 0, n, diff)) {      // CHECKING THE DIFFERENCE EXISTS IN THE FIRST (i)th ROWS;
                    return true; }
            }
            else
                if (diff_exists(grid, i + 1, m, 0, n, diff))     // CHECKING THE DIFFERENCE EXISTS IN THE (i + 1)th TO LAST ROWS;
                    return true;
        }

        tot = 0;
        for (long i : c)
            tot += i;
        long left = 0;

        for (int i = 0; i < n - 1; i++) {                                  // CHECKING FOR COLUMNS CUTS
            left += c[i];
            long right = tot - left;
            if (right == left)
                return true;
            
            long diff = Math.abs(right - left);

            if (left > right) {
                if (diff_exists(grid, 0, m, 0, i + 1, diff)) {      // CHECKING THE DIFFERENCE EXISTS IN THE FIRST (i)th COLUMNS;
                    return true; }
            }
            else
                if (diff_exists(grid, 0, m, i + 1, n, diff))       // CHECKING THE DIFFERENCE EXISTS IN THE (i + 1)th TO LAST COLUMNS;
                    return true;
        }
        return false;
    }
    public boolean diff_exists(int[][] arr, int a, int b, int c, int d, long diff) {   // THIS METHOD IS TO CHECK THE DIFFERENCE IS POSSIBLE IN THAT SPECIFIC SEGMENT 

        int r_diff = b - a;
        int c_diff = d - c;

        if (r_diff == 1)                                            // IF ONLY 1 ROW MIDDLE ELEMNTS CANT BE REMOVE FIRST AND LAST
            if (arr[a][c] == diff || arr[a][d - 1] == diff)
                return true;
            else
                return false;
        if (c_diff == 1)                                            // IF ONLY 1 COLUMN ONLY TOP AND BOTTOM ELEMNTS CAN BE REMOVED
            if (arr[a][c] == diff || arr[b - 1][c] == diff)
                return true;
            else
                return false;

        for (int i = a; i < b; i++)
            for (int j = c; j < d; j++)
                if (arr[i][j] == diff)
                    return true;

        return false;
    }
}
