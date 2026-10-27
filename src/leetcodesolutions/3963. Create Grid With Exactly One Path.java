You are given two integers m and n, representing the number of rows and columns of a grid.

Construct any m x n grid consisting only of the characters '.' and '#', where:

'.' represents a free cell.
'#' represents an obstacle cell.
A valid path is a sequence of free cells that:

Starts at the top-left cell (0, 0).
Ends at the bottom-right cell (m - 1, n - 1).
Moves only:
Right, from (i, j) to (i, j + 1), or
Down, from (i, j) to (i + 1, j).
Return any grid such that there is exactly one valid path from the top-left cell to the bottom-right cell.






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
        #  Date        : 2026-27-10                                               #
        #                                                                       #
        #########################################################################
        */
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        int idx = 0;
        for (int i = 0; i < m && i < 2; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n - 1; j++)
                if (i == 0)
                    sb.append('.');
                else
                    sb.append('#');
            sb.append('.');
            ans[idx] = sb.toString();
            idx += 1;
        }
        if (m < 3)
            return ans;
        for (int i = 2; i < m; i++)
            ans[i] = ans[1];
        return ans;
    }
}
