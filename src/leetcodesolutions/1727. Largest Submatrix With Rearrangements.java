You are given a binary matrix matrix of size m x n, and you are allowed to rearrange the columns of the matrix in any order.

Return the area of the largest submatrix within matrix where every element of the submatrix is 1 after reordering the columns optimally.





class Solution {
    public int largestSubmatrix(int[][] matrix) {
         /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-03-17                                              #
        #                                                                       #
        #########################################################################
        */

        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int[] k = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1)
                    k[j] += 1;
                else
                    k[j] = 0;
            }
            int[] kk = Arrays.copyOf(k, n);
            Arrays.sort(kk);
            for (int j = 0; j < n; j++)
                ans = Math.max(ans, kk[j] * (n - j)); // HERE : kk[j] is the height and other is width as we sorted the array we always make the best possible square
        }
        return ans;
    }
}
