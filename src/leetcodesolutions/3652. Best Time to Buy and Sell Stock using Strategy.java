// You are given two integer arrays prices and strategy, where:

// prices[i] is the price of a given stock on the ith day.
// strategy[i] represents a trading action on the ith day, where:
// -1 indicates buying one unit of the stock.
// 0 indicates holding the stock.
// 1 indicates selling one unit of the stock.
// You are also given an even integer k, and may perform at most one modification to strategy. A modification consists of:

// Selecting exactly k consecutive elements in strategy.
// Set the first k / 2 elements to 0 (hold).
// Set the last k / 2 elements to 1 (sell).
// The profit is defined as the sum of strategy[i] * prices[i] across all days.

// Return the maximum possible profit you can achieve.

// Note: There are no constraints on budget or stock ownership, so all buy and sell operations are feasible regardless of past actions.



____________________________________SOLUTION_____________________________________



  class Solution {
    public long maxProfit(int[] p, int[] s, int k) {
        long ans = 0;
        long[] pf = new long[p.length + 1];
        long[] pfs = new long[p.length + 1];
        for (int i  = 0; i < p.length; i++) {
            ans += (long)p[i] * s[i];
            pf[i + 1] = p[i] + pf[i];
            pfs[i + 1] = pfs[i] +  (long)p[i] * s[i];
        }
        for (int i = k; i <= p.length; i++) {
            long l = pfs[i - k];
            long r = pfs[p.length] - pfs[i];
            long m = pf[i] - pf[i - (k / 2)];
            ans = Math.max(ans, l + r + m);
        }
        return ans;
    }
}  
