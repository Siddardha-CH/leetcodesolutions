You are given an m x n integer matrix grid​​​, where m and n are both even integers, and an integer k.

The matrix is composed of several layers, which is shown in the below image, where each color is its own layer:




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
        #  Date        : 2026-05-09                                             #
        #                                                                       #
        #########################################################################
        */
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        
        int lev = Math.min(m, n) / 2;       // counting how many levels possible

        for (int i = 0; i < lev; i++) {
            ArrayList<Integer> kk = new ArrayList<>();

            int t = i;
            int l = i;
            int b = m - i - 1;
            int r = n - i - 1;

            for (int j = l; j <= r; j++)    // top row
                kk.add(grid[t][j]);
            for (int j = t + 1; j < b; j++)  // right column
                kk.add(grid[j][r]);
            for (int j = r; j >= l; j--)    // bottom row
                kk.add(grid[b][j]);
            for (int j = b - 1; j > t; j--)  // left column
                kk.add(grid[j][l]);
            
            ArrayList<Integer> rot = new ArrayList<>();;

            for (int j = k; j < kk.size() + k; j++)
                rot.add(kk.get(j % kk.size()));
            
            int idx = 0;
            
            for (int j = l; j <= r; j++)    // top row
                ans[t][j] = rot.get(idx++);
            for (int j = t + 1; j < b; j++)  // right column
                ans[j][r] = rot.get(idx++);
            for (int j = r; j >= l; j--)    // bottom row
                ans[b][j] = rot.get(idx++);
            for (int j = b - 1; j > t; j--)  // left column
                ans[j][l] = rot.get(idx++);

        }

        return ans;
    }
}
