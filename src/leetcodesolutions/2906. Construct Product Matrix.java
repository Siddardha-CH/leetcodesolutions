Given a 0-indexed 2D integer matrix grid of size n * m, we define a 0-indexed 2D matrix p of size n * m as the product matrix of grid if the following condition is met:

Each element p[i][j] is calculated as the product of all elements in grid except for the element grid[i][j]. This product is then taken modulo 12345.
Return the product matrix of grid.




class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-03-24                                             #
        #                                                                       #
        #########################################################################
        */
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;
        int mod = 12345;
        int[] arr = new int[size];
        int index = 0;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[index++] = grid[i][j] % mod;

        int[] pre = new int[size];
        pre[0] = 1;
        for (int i = 1; i < size; i++)
            pre[i] = pre[i - 1] * arr[i - 1] % mod;

        int[] suf = new int[size];
        suf[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) 
            suf[i] = suf[i + 1] * arr[i + 1] % mod;

        int[][] ans = new int[m][n];
        for (int i = 0; i < size; i++)
            ans[i / n][i % n] = suf[i] * pre[i] % mod;


        return ans;
    }
}
