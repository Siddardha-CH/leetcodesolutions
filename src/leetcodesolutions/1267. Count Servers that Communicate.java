You are given a map of a server center, represented as a m * n integer matrix grid, where 1 means that on that cell there is a server and 0 means that it is no server. Two servers are said to communicate if they are on the same row or on the same column.

Return the number of servers that communicate with any other server.





class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-09-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        // boolean[][] b = new boolean[n][m];
        // for (int i = 0; i < n; i++) {
        //     int c = 0;
        //     for (int j : grid[i])
        //         if (j > 0)
        //             c += 1;
        //     if (c > 1) {
        //         Arrays.fill(b[i], true);
        //     }
        // }
        // for (int j = 0; j < m; j++) {
        //     int c = 0;
        //     for (int i = 0; i < n; i++)
        //         if (grid[i][j] > 0)
        //             c += 1;
        //     if (c > 1) {
        //         for (int i = 0; i < n; i++)
        //             b[i][j] = true;
        //     }
        // }
        // int ans = 0;
        // for (int i = 0; i < n; i++)
        //     for (int j = 0; j < m; j++)
        //         if (grid[i][j] == 1 && b[i][j])
        //             ans += 1;
        // return ans;


        //        SOL-2


        int[] col = new int[m];
        int[] row = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    cnt += 1;
            }
            row[i] = cnt;
        }
        for (int i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 1)
                    cnt += 1;
            }
            col[i] = cnt;
        }
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1 && (col[j] > 1 || row[i] > 1))
                    ans += 1;
        return ans;


    }
}
