ou are given two strings s1 and s2, both of length n, consisting of lowercase English letters.

You can apply the following operation on any of the two strings any number of times:

Choose any two indices i and j such that i < j and the difference j - i is even, then swap the two characters at those indices in the string.
Return true if you can make the strings s1 and s2 equal, and false otherwise.




class Solution {
    public boolean checkStrings(String s1, String s2) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-03-30                                             #
        #                                                                       #
        #########################################################################
        */
        int[] k1 = new int[26];
        int[] k2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (i % 2 == 0) {
                k1[c1 - 'a'] += 1;
                k1[c2 - 'a'] -= 1;
            }
            else {
                k2[c1 - 'a'] += 1;
                k2[c2 - 'a'] -= 1;
            }
        }
        for (int i : k1)
            if ( i != 0)
                return false;
        for (int i : k2)
            if ( i != 0)
                return false;
        return true;
    }
}
