You are given an m x n binary matrix grid and an integer health.

You start on the upper-left corner (0, 0) and would like to get to the lower-right corner (m - 1, n - 1).

You can move up, down, left, or right from one cell to another adjacent cell as long as your health remains positive.

Cells (i, j) with grid[i][j] = 1 are considered unsafe and reduce your health by 1.

Return true if you can reach the final cell with a health value of 1 or more, and false otherwise.






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
        #  Date        : 2026-07-02                                             #
        #                                                                       #
        #########################################################################
        */
    int[][] d = {{0,1}, {0, -1}, {1, 0}, {-1, 0}};
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] res = new int[m][n];
        for (int[] i : res)
            Arrays.fill(i, Integer.MAX_VALUE);
        res[0][0] = grid.get(0).get(0);

        Deque<int[]> dq = new ArrayDeque<>();           //0-1 BFS
        
        dq.offerFirst(new int[] {0,0});
        while (!dq.isEmpty()) {
            int[] curr = dq.pollFirst();
            int r = curr[0];
            int c = curr[1];
            for (int[] i : d) {
                int newr = r + i[0];
                int newc = c + i[1];
                if (newr < 0 || newr >= m || newc < 0 || newc >= n)
                    continue;
                if (res[r][c] + grid.get(newr).get(newc) < res[newr][newc]) {
                    res[newr][newc] = res[r][c] + grid.get(newr).get(newc);
                    if (grid.get(newr).get(newc) == 0)
                        dq.offerFirst(new int[] {newr, newc});
                    else
                        dq.offerLast(new int[] {newr, newc});
                }
            }
        }
        if (health - res[m - 1][n - 1] > 0)
            return true;
        return false;
    }
}
