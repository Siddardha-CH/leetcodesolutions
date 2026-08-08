You are given two strings word1 and word2.

A string x is called almost equal to y if you can change at most one character in x to make it identical to y.

A sequence of indices seq is called valid if:

The indices are sorted in ascending order.
Concatenating the characters at these indices in word1 in the same order results in a string that is almost equal to word2.
Return an array of size word2.length representing the lexicographically smallest valid sequence of indices. If no such sequence of indices exists, return an empty array.

Note that the answer must represent the lexicographically smallest array, not the corresponding string formed by those indices.






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
        #  Date        : 2026-08-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] validSequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] ans = new int[m];
        int[] last = new int[m];
        int j = m - 1;
        for (int i = n - 1; i > -1; i--)
            if (j > -1 && s1.charAt(i) == s2.charAt(j)) {
                last[j] = i;
                j -=1;
            }
        boolean swapped = true;
        j = 0;
        for (int i = 0; i < n; i++) {
            if (j == m)
                return ans;
            if (s1.charAt(i) == s2.charAt(j) || (swapped && (j == m - 1 || last[j + 1] > i))) { // condition if no swap and checking if next occurence is after i or not
                if (s1.charAt(i) != s2.charAt(j)) 
                    swapped = false;
                ans[j] = i;
                j += 1;
            } 
        }
        if (j == m)
            return ans;
        return new int[] {};
    }
}
