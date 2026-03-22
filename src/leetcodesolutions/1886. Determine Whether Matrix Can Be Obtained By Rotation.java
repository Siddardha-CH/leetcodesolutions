Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.



class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-03-22                                              #
        #                                                                       #
        #########################################################################
        */
        int n = mat.length;
        boolean b = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (mat[i][j] != target[i][j]) {
                    b = false;
                    break;
                }
            if (b == false)
                break;
        }
        if (b)
            return true;
        b = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (target[i][j] != mat[j][n - i - 1]) {
                    b = false;
                    break;
                }
            if (b == false)
                break;
        }
        if (b)
            return true;
        b = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (target[i][j] != mat[n - i - 1][n - j - 1]) {
                    b = false;
                    break;
                }
            if (b == false)
                break;
        }
        if (b)
            return true;
        b = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (target[i][j] != mat[n - j - 1][i]) {
                    b = false;
                    break;
                }
            if (b == false)
                break;
        }
        
        if (b)
            return true;
        return false;
    }
}
