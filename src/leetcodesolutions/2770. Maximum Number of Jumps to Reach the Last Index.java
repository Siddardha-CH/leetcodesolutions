You are given a 0-indexed array nums of n integers and an integer target.

You are initially positioned at index 0. In one step, you can jump from index i to any index j such that:

0 <= i < j < n
-target <= nums[j] - nums[i] <= target
Return the maximum number of jumps you can make to reach index n - 1.

If there is no way to reach index n - 1, return -1.





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
        #  Date        : 2026-05-11                                             #
        #                                                                       #
        #########################################################################
        */
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        dp[0] = 0;

        for (int i = 0; i < n; i++) 
            if (dp[i] != -1) 
                for (int j = i + 1; j < n; j++) {
                    int d = nums[j] - nums[i];
                    if (d >= -target && d <= target)
                        dp[j] = Math.max(dp[j], dp[i] + 1);   // possible ways till j from x is x + 1
                }
            
        return dp[n - 1];
    }
}
