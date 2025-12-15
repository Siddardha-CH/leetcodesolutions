// You are given an integer array prices representing the daily price history of a stock, where prices[i] is the stock price on the ith day.

// A smooth descent period of a stock consists of one or more contiguous days such that the price on each day is lower than the price on the preceding day by exactly 1. The first day of the period is exempted from this rule.

// Return the number of smooth descent periods.



_______________________________________SOLUTION______________________________________



  class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 0;
        long c = 1;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] - prices[i + 1] == 1)
                c += 1;
            else {
                ans += (c * (c + 1)) / 2;
                c = 1;
            }
        }
        ans += (c * (c + 1)) / 2;
        return ans;
    }
}
