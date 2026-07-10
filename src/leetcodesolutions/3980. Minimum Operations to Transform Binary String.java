You are given two binary strings s1 and s2 of the same length n.

You can perform the following operations on s1 any number of times, in any order:

Choose an index i such that s1[i] == '0', and change it to '1'.
Choose an index i such that 0 <= i < n - 1, and both s1[i] and s1[i + 1] are '1'. Change both characters to '0'.
Return the minimum number of operations required to make s1 equal to s2. If it is impossible, return -1.




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
        #  Date        : 2026-07-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int minOperations(String s1, String s2) {
        if (s1.equals("1") && s2.equals("0"))
            return -1;
        char[] c  = s1.toCharArray();
        int ans = 0;
        int n = s2.length();
        for (int i = 0; i < n; i++) {
            if (c[i] == s2.charAt(i))
                continue;
            if (c[i] == '0')
                ans += 1;
            else if (i < n - 1) {
                if (c[i + 1] == '1')
                    ans += 1;
                else
                    ans += 2;
                c[i + 1] = '0';
            }
            else
                ans += 2;
        }
        return ans;
    }
}
