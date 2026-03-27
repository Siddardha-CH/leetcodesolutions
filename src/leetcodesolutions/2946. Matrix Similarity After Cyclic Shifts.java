You are given an m x n integer matrix mat and an integer k. The matrix rows are 0-indexed.

The following proccess happens k times:

Even-indexed rows (0, 2, 4, ...) are cyclically shifted to the left.


Odd-indexed rows (1, 3, 5, ...) are cyclically shifted to the right.


Return true if the final modified matrix after k steps is identical to the original matrix, and false otherwise.




  class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-03-27                                             #
        #                                                                       #
        #########################################################################
        */
        int m = mat.length;
        int n = mat[0].length;
        k %= n;
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) {
                int a;
                if (i % 2 == 0) 
                    a = mat[i][(j + k) % n];
                else
                    a = mat[i][(j - k + n) % n];
                if (mat[i][j] != a)
                    return false;
            }
        return true;
    }
}
