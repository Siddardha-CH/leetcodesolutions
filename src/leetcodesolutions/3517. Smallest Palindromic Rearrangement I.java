You are given a palindromic string s.

Return the lexicographically smallest palindromic permutation of s.






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
        #  Date        : 2026-07-28                                             #
        #                                                                       #
        #########################################################################
        */
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a'] += 1;
        StringBuilder sb = new StringBuilder();
        int odd = -1;
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            if (freq[i] % 2 == 1)
                odd = i;
            freq[i] /= 2;
            int k = freq[i];
            if (k > 0) {
                for (int j = 0; j < k; j++)
                    sb.append(c);
            }
        }
        if (odd != - 1) 
            sb.append((char)('a' + odd));
        for (int i = 25; i >= 0; i--) {
            char c = (char)('a' + i);
            int k = freq[i];
            if (k > 0)
                for (int j = 0; j < k; j++)
                    sb.append(c);
        }
        return sb.toString();
    }
}
