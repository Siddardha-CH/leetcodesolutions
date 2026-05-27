You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word, and every lowercase occurrence of c appears before the first uppercase occurrence of c.

Return the number of special letters in word.




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
        #  Date        : 2026-05-27                                             #
        #                                                                       #
        #########################################################################
        */
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        boolean[] lo = new boolean[26];
        boolean[] up = new boolean[26];
        boolean[] inval = new boolean[26];

        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int i = c - 'a';
                if (up[i])
                    inval[i] = true;
                lo[i] = true;
            }
            else {
                int i = c - 'A';
                up[i] = true;
            }
        }

        for (int i = 0; i < 26; i++)
            if (lo[i] && up[i] && !inval[i])
                ans += 1;
        
        return ans;
    } 
}
