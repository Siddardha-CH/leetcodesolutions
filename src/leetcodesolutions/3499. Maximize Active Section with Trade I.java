You are given a binary string s of length n, where:

'1' represents an active section.
'0' represents an inactive section.
You can perform at most one trade to maximize the number of active sections in s. In a trade, you:

Convert a contiguous block of '1's that is surrounded by '0's to all '0's.
Afterward, convert a contiguous block of '0's that is surrounded by '1's to all '1's.
Return the maximum number of active sections in s after making the optimal trade.

Note: Treat s as if it is augmented with a '1' at both ends, forming t = '1' + s + '1'. The augmented '1's do not contribute to the final count.





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
        #  Date        : 2026-07-21                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxActiveSectionsAfterTrade(String s) {
        ArrayList<Integer> k = new ArrayList<>();
        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans += 1;
                if (cnt > 0) 
                    k.add(cnt);
                cnt = 0;
            }
            else
                cnt += 1;
        }
        
        if (cnt > 0)
            k.add(cnt);

        int max = 0;
        for (int i = 0; i < k.size() - 1; i++)
            max = Math.max(max, k.get(i) + k.get(i + 1));
        return ans + max;
    }
}
