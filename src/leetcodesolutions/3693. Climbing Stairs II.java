You are climbing a staircase with n + 1 steps, numbered from 0 to n.

You are also given a 1-indexed integer array costs of length n, where costs[i] is the cost of step i.

From step i, you can jump only to step i + 1, i + 2, or i + 3. The cost of jumping from step i to step j is defined as: costs[j] + (j - i)2

You start from step 0 with cost = 0.

Return the minimum total cost to reach step n.







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
        #  Date        : 2026-10-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        for (int i = n - 1; i > -1; i--) {
            int cost = 99999999;
            int j = i + 1;
            if (j <= n)
                cost = costs[j - 1] + dp[j] + 1;
            j = i + 2;
            if (j <= n)
                cost = Math.min(cost, costs[j - 1] + dp[j] + 4);
            j = i + 3;
            if (j <= n)
                cost = Math.min(cost, costs[j - 1] + dp[j] + 9); 
            dp[i] = cost;
        }
        return dp[0];
    }
}
