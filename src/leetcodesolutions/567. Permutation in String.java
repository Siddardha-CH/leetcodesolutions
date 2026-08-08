Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.





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
    public boolean checkInclusion(String s1, String s2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int l = 0;
        int r = 0;
        if (s1.length() > s2.length())
            return false;
        for (r = 0; r < s1.length(); r++) {
            f1[s1.charAt(r) - 'a'] += 1;
            f2[s2.charAt(r) - 'a'] += 1;
        }
        if (check(f1, f2))
            return true;
        while (r < s2.length()) {
            f2[s2.charAt(l) - 'a'] -= 1;
            l +=1;
            f2[s2.charAt(r) - 'a'] += 1;
            r += 1;
            if (check(f1, f2))
                return true;
        }
        return false;
    }
    boolean check(int[] f1, int[] f2) {
        for (int i = 0; i < 26; i++)
            if (f1[i] != f2[i])
                return false;
        return true;
    }
}
