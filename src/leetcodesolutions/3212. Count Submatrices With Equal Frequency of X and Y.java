Given a 2D character matrix grid, where grid[i][j] is either 'X', 'Y', or '.', return the number of submatrices that contain:

grid[0][0]
an equal frequency of 'X' and 'Y'.
at least one 'X'.




class Solution {
    public int numberOfSubmatrices(char[][] grid) {
         /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-03-23                                             #
        #                                                                       #
        #########################################################################
        */






        // int m = grid.length;
        // int n = grid[0].length;
        // int[][] k = new int[m][n];
        // for (int i =0; i < m; i++)
        //     for (int j = 0; j < n; j++)
        //         if (grid[i][j] == 'X')
        //             k[i][j] = 1;
        //         else if (grid[i][j] == 'Y')
        //             k[i][j] = -1;
        //         else
        //             k[i][j] = 0;
        // int ans = 0;
        // boolean b = false;
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (k[i][j] == 1)
        //             b = true;
        //         if (i > 0)
        //             k[i][j] += k[i - 1][j];
        //         if (j > 0)
        //             k[i][j] += k[i][j - 1];
        //         if (i > 0 &&  j > 0)
        //             k[i][j] -= k[i - 1][j - 1];
        //         if (k[i][j] == 0 && b)
        //             ans += 1;
        //     }
        // }
        // return ans;                                          WRONG SOLUTION PASSED 700/770 TESTCASES


        // Inspired by AABOVE SOLUTION IT SELF


        int m = grid.length;
        int n = grid[0].length;
        int[][] s = new int[m][n];              // TO KEEP TRACK OF SUM 
        int[][] c = new int[m][n];              // TO KEEP TRACK OF COUNT OF X
        int ans = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                int v = 0;                      // TO KNOW IF X = 1 && Y = -1 && o = 0 
                int x = 0;                      // Trigger IF 1 X  THEN 1
                if (grid[i][j] == 'X') {
                    v = 1;
                    x = 1;
                }
                else if (grid[i][j] == 'Y')
                    v = -1;
                s[i][j] = v;
                c[i][j] = x;
                if (i > 0) {                      // DP FROM HERE
                    s[i][j] += s[i - 1][j];
                    c[i][j] += c[i - 1][j];
                }
                if (j > 0) {
                    s[i][j] += s[i][j - 1];
                    c[i][j] += c[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    s[i][j] -= s[i - 1][j - 1];
                    c[i][j] -= c[i - 1][j - 1];
                }
                if (s[i][j] == 0 && c[i][j] > 0)  //  IF SUM NEUTRALIZES ie, ALL 1's + all -1's and o &&&&& IF ATLEAST 1 X SO WE CHECK COUNT
                    ans += 1;
            }
        return ans;
    }
}
