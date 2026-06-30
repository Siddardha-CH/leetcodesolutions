Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.






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
        #  Date        : 2026-06-30                                             #
        #                                                                       #
        #########################################################################
        */
    public int numberOfSubstrings(String s) {
        int[] k = new int[3];
        int n = s.length();
        int ans = 0;
        int l = 0;
        for (int i = 0; i < n; i++) {
            k[s.charAt(i) - 'a'] += 1;
            while (k[0] > 0 && k[1] > 0 && k[2] > 0) {
                ans += (n - i);
                k[s.charAt(l) - 'a'] -= 1;
                l += 1;
            }
        }
        return ans;
    }
}
