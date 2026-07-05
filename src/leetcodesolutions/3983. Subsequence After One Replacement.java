You are given two strings s and t consisting of lowercase English letters.

You may choose at most one index in s and replace the character at that index with any lowercase English letter.

Return true if it is possible to make s a subsequence of t; otherwise, return false.





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
        #  Date        : 2026-07-05                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean canMakeSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] l = new int[n];
        int[] r = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < m && s.charAt(i) != t.charAt(j))
                j += 1;
            if (j == m)
                l[i] = -1;
            else {
                l[i] = j;
                j +=1;
            }
        }
        if (l[n - 1] != -1)
            return true;
        j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (j > -1 && s.charAt(i) != t.charAt(j))
                j -=1;
            if (j < 0)
                r[i] = -1;
            else {
                r[i] = j;
                j -= 1;
            }
        }
        for (int i = 0; i < n; i++) {
            int lp = -1;
            if (i > 0)
                if (l[i - 1] == -1)
                    continue;
                else
                    lp = l[i - 1];
            int rp = m;
            if (i < n - 1)
                if (r[i + 1] == -1)
                    continue;
                else
                    rp = r[i + 1];
            if (lp < rp - 1)
                return true;
        }
        return false;
    }
}
