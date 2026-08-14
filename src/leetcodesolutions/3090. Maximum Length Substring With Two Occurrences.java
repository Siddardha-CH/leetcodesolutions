Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.








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
        #  Date        : 2026-08-14                                             #
        #                                                                       #
        #########################################################################
        */
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int l = 0;
        int ans = 1;
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a'] += 1;
            if (freq[c - 'a'] > 2) {
                while (freq[c - 'a'] != 2) {
                    freq[s.charAt(l) - 'a'] -= 1;
                    l += 1;
                }
            }
            ans = Math.max(ans, i - l + 1);
        }
        return ans;
    }
}
