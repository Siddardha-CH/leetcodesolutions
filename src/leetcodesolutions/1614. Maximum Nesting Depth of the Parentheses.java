Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.





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
        #  Date        : 2026-28-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxDepth(String s) {
        int ans = 0;
        int m = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') {
                m += 1;
                ans = Math.max(ans, m);
            }
            else if (s.charAt(i) == ')')
                m -= 1;
        return ans;
    }
}
