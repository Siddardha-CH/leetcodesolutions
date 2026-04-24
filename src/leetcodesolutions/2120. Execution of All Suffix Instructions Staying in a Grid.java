There is an n x n grid, with the top-left cell at (0, 0) and the bottom-right cell at (n - 1, n - 1). You are given the integer n and an integer array startPos where startPos = [startrow, startcol] indicates that a robot is initially at cell (startrow, startcol).

You are also given a 0-indexed string s of length m where s[i] is the ith instruction for the robot: 'L' (move left), 'R' (move right), 'U' (move up), and 'D' (move down).

The robot can begin executing from any ith instruction in s. It executes the instructions one by one towards the end of s but it stops if either of these conditions is met:

The next instruction will move the robot off the grid.
There are no more instructions left to execute.
Return an array answer of length m where answer[i] is the number of instructions the robot can execute if the robot begins executing from the ith instruction in s.




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
        #  Date        : 2026-04-24                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int m = s.length();
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int r = startPos[0];
            int c = startPos[1];
            boolean b = true;
            for (int j = i; j < m; j++) {
                if (s.charAt(j) == 'R')
                    c += 1;
                else if (s.charAt(j) == 'L')
                    c -= 1;
                else if (s.charAt(j) == 'U')
                    r -= 1;
                else 
                    r += 1;
                    
                if (r == n || r == -1 || c == n || c == -1) {
                    b = false;
                    ans[i] = j - i;
                    break;
                }
            }
            if (b)
                ans[i] = m - i;
        }
        return ans;
    }
}
