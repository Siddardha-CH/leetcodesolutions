Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.




class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-03-29                                             #
        #                                                                       #
        #########################################################################
        */
        for (int i = 0; i < 9; i++) {                    // CHECKED HORiZONTAL AND VERTICAL ROWS
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                char d = board[j][i];
                if (c != '.') {
                    if (set1.contains(c)) 
                        return false;
                    set1.add(c);
                }
                if (d != '.') {
                    if (set2.contains(d)) 
                        return false;
                    set2.add(d);
                }
            }
        }

        for (int r = 0; r < 9; r += 3)              // Checking SUB MATRICES 3 x 3
            for (int c = 0; c < 9; c += 3) {
                Set<Character> set = new HashSet<>();
                for (int i = r; i < r + 3; i++)
                    for (int j = c; j < c + 3; j++)
                        if (board[i][j] != '.') {
                            if (set.contains(board[i][j]))
                                return false;
                            else
                                set.add(board[i][j]);
                        }  
            }
        
        return true;
    }
}
