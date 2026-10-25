Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-directionally connected group of 0s and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.

Return the number of closed islands.





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
        #  Date        : 2026-25-10                                               #
        #                                                                       #
        #########################################################################
        */
    Set<String> set = new HashSet<>();
    int n, m;
    public int closedIsland(int[][] grid) {
        int ans = 0;
        n = grid.length;
        m = grid[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 0 && !set.contains(i + "-" + j))
                    if (dfs(i, j, grid))
                        ans += 1;
        return ans;
    }
    public boolean dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || j >= m || i >= n)
            return false;
        String k = i + "-" + j;
        if (grid[i][j] == 1 || set.contains(k))
            return true;
        set.add(k);
        boolean a = dfs(i + 1, j, grid);
        boolean b = dfs(i - 1, j, grid);
        boolean c = dfs(i, j + 1, grid);
        boolean d = dfs(i, j - 1, grid);
        return a && b && c&& d;
    }
}
