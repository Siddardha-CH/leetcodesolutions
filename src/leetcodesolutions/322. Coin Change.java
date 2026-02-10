You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.





  ---------------------------------------------------SOLUTION-----------------------------------------------------------



  class Solution {
    public int coinChange(int[] nums, int tar) {
        int n = nums.length;
        int[][] dp = new int[n][tar + 1];
        for (int i = 0; i < tar + 1; i++)
            if (i % nums[0] == 0)
                dp[0][i] = i / nums[0];
            else
                dp[0][i] = (int) 1e9;
        for (int i = 1; i < n; i++)
            for (int j = 0; j <= tar; j++) {
                int nt = 0 + dp[i - 1][j];
                int t = Integer.MAX_VALUE;
                if (nums[i] <= j) 
                    t = 1 + dp[i][j - nums[i]];
                dp[i][j] = Math.min(t,nt);
            }
        if (dp[n - 1][tar] >= (int) 1e9)
            return -1;
        else
            return dp[n - 1][tar];
    }
}
