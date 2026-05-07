Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.




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
        #  Date        : 2026-05-07                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (dfs(board, word, i, j, 0))      // here 0 tells the length of string formed
                    return true;
        
        return false;
    }

    public boolean dfs(char[][] b, String s, int i , int j, int l) {
        if (l == s.length())
            return true;

        if (0 > i || 0 > j || i >= b.length || j >= b[0].length || b[i][j] != s.charAt(l))
            return false;

        char c = b[i][j];

        b[i][j] = '-';   // each char should be used once we used it and maked as used and later will be unmarked 

        boolean k = dfs(b, s, i + 1, j, l + 1) || dfs(b, s, i - 1, j, l + 1) || dfs(b, s, i, j + 1, l + 1) || dfs(b, s, i, j - 1, l + 1);

        b[i][j] = c;

        return k;
    }
}
