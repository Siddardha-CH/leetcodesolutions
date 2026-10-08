There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.

The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where heights[r][c] represents the height above sea level of the cell at coordinate (r, c).

The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.

Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.






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
        #  Date        : 2026-08-10                                             #
        #                                                                       #
        #########################################################################
        */
    public List<List<Integer>> pacificAtlantic(int[][] grid) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] pac = new boolean[n][m];
        boolean[][] atl = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            func(grid, pac, i, 0 , -1);
            func(grid, atl, i, m - 1, -1);
        }
        for (int i = 0; i < m; i++) {
            func(grid, pac, 0, i, -1);
            func(grid, atl, n - 1, i, -1);
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (pac[i][j] && atl[i][j])
                    ans.add(Arrays.asList(i,j));
        return ans;
    }
    public void func(int[][] grid, boolean[][] arr, int i, int j, int prevh) {
        int n = arr.length;
        int m = arr[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || arr[i][j] || prevh > grid[i][j])
            return;
        arr[i][j] = true;
        func(grid, arr, i + 1, j, grid[i][j]);
        func(grid, arr, i - 1, j, grid[i][j]);
        func(grid, arr, i, j + 1, grid[i][j]);
        func(grid, arr, i, j - 1, grid[i][j]);
    }
}
