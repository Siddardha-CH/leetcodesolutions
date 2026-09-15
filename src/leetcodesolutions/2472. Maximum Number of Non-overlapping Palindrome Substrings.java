You are given a string s and a positive integer k.

Select a set of non-overlapping substrings from the string s that satisfy the following conditions:

The length of each substring is at least k.
Each substring is a palindrome.
Return the maximum number of substrings in an optimal selection.

A substring is a contiguous sequence of characters within a string.





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
        #  Date        : 2026-14-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        if (k == 1)
            return n;
        int[][] dp = new int[n + 1][n + 1];
        for (int[] i : dp)
            Arrays.fill(i, -1);
        boolean[][] ispalin =  new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) 
            for (int j = i; j < n; j++)
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || ispalin[i + 1][j - 1]))
                    ispalin[i][j] = true;
        return func(s, k, 0, k - 1, n, dp, ispalin);
    }
    public int func (String s, int k, int i, int j, int n, int[][] dp, boolean[][] ispalin) {
        if (i >= n || j >= n)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (ispalin[i][j]) {
            int take = 1 + func(s, k, j + 1, j + k, n, dp, ispalin);
            int grow = func(s, k, i, j + 1, n, dp, ispalin);
            int slide = func(s, k, i + 1, j + 1, n, dp, ispalin);
            dp[i][j] = Math.max(take, Math.max(slide, grow));
            return dp[i][j];
        }
        int grow = func(s, k, i, j + 1, n, dp, ispalin);
        int slide = func(s, k, i + 1, j + 1, n, dp, ispalin);
        dp[i][j] = Math.max(slide, grow);
        return dp[i][j];
    }
}
