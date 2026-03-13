You are given a binary string s. You are allowed to perform two types of operations on the string in any sequence:

Type-1: Remove the character at the start of the string s and append it to the end of the string.
Type-2: Pick any character in s and flip its value, i.e., if its value is '0' it becomes '1' and vice-versa.
Return the minimum number of type-2 operations you need to perform such that s becomes alternating.

The string is called alternating if no two adjacent characters are equal.

For example, the strings "010" and "1010" are alternating, while the string "0100" is not.





class Solution {
    public int minFlips(String p) {
         /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-03-13                                              #
        #                                                                       #
        #########################################################################
        */
        String s = p + p;
        int ans = 99999999;
        int d1 = 0;
        int d2 = 0;
        for (int i = 0;i < s.length(); i++) {
            char c = s.charAt(i);
            char c1, c2;
            if (i  % 2 == 0) {
                c1 = '0';
                c2 = '1';
            }
            else {
                c1 = '1';
                c2 = '0';
            }
            if (c != c1) 
                d1 += 1;
            if (c != c2)
                d2 += 1;
            if (i >= p.length()) {
                char k = s.charAt(i - p.length());
                char k1, k2;
                if ((i - p.length()) % 2 == 0) {
                    k1 = '0';
                    k2 = '1';
                }
                else {
                   k1 = '1';
                    k2 = '0';
                }
                if (k != k1)
                    d1 -= 1;
                if (k != k2)
                    d2 -= 1;
            }
            if (i >= p.length() - 1)
                ans = Math.min(ans, Math.min(d1, d2));
        }   
        return ans;
    }
}
