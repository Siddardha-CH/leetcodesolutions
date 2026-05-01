Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.





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
        #  Date        : 2026-05-01                                             #
        #                                                                       #
        #########################################################################
        */
    public int countSubstrings(String s) {
        int ans = 0;
    //     for (int i = 0; i < s.length(); i++)
    //         for (int j = i + 1; j <= s.length(); j++)
    //             if (ispal(s.substring(i,j)))
    //                 ans += 1;
            
    //     return ans;
    // }
    // public boolean ispal(String s) {
    //     int i = 0; 
    //     int j = s.length() - 1;
    //     char[] c = s.toCharArray();
    //     while (j > i) {
    //         if (c[i] != c[j])
    //             return false;

    //         i += 1;
    //         j -= 1;
    //     }
    //     return true;


        // expanding center

        for (int i = 0; i < s.length(); i++) {
            ans += expandfrommid(s, i , i); // odd length;
            ans += expandfrommid(s, i, i + 1);
        }

        return ans;
    }

    public int expandfrommid(String s, int i, int j) {

        int c = 0;

        while (i >= 0 && j < s.length() && (s.charAt(i) == s.charAt(j))) {
            c += 1;
            i -= 1;
            j += 1;
        }

        return c;
    }
}
