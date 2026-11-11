You are given five integers cost1, cost2, costBoth, need1, and need2.

There are three types of items available:

An item of type 1 costs cost1 and contributes 1 unit to the type 1 requirement only.
An item of type 2 costs cost2 and contributes 1 unit to the type 2 requirement only.
An item of type 3 costs costBoth and contributes 1 unit to both type 1 and type 2 requirements.
You must collect enough items so that the total contribution toward type 1 is at least need1 and the total contribution toward type 2 is at least need2.

Return an integer representing the minimum possible total cost to achieve these requirements.








class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-10-12                                               #
        #                                                                       #
        #########################################################################
        */
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = 0;
        long c1 = cost1;
        long c2 = cost2;
        long cb = costBoth;
        long n1 = need1;
        long n2 = need2;
        // case-1
        ans = n1 * c1;
        ans += (n2 * c2);
        // case-2
        ans = Math.min(ans, cb * Math.max(n1, n2));
        // case-3
        if (n1 > n2)
            ans = Math.min(ans, cb * n2 + (n1 - n2) * c1);
        else
            ans = Math.min(ans, cb * n1 + (n2 - n1) * c2);
        return ans;
    }
}
