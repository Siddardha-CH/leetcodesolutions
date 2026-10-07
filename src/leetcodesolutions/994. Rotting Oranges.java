You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.








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
        #  Date        : 2026-07-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 2)
                    q.add(new int[]{i,j});
        int ans = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] k = q.poll();
                int r = k[0];
                int c = k[1];
                if (n > r + 1 && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    q.add(new int[]{r + 1,c});
                }
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    q.add(new int[]{r - 1,c});
                }   
                if (m > c + 1 && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    q.add(new int[]{r,c + 1});
                }   
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    q.add(new int[]{r, c - 1});
                }
            }
            ans += 1;
        }
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1)
                    return -1;
        return Math.max(0, ans - 1);
    }
}
